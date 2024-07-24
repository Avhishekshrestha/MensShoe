package com.example.mensshoes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mensshoes.OrderCompletedActivity;

public class ReviewOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_order);

        // Get references to the views
        TextView shipToTextView = findViewById(R.id.ship_to_text_view);
        TextView subtotalTextView = findViewById(R.id.subtotal_text_view);
        TextView shippingTextView = findViewById(R.id.shipping_text_view);
        TextView taxTextView = findViewById(R.id.tax_text_view);
        TextView orderTotalTextView = findViewById(R.id.order_total_text_view);
        Button placeOrderButton = findViewById(R.id.place_order_button);

        // Get the intent and extract the order details
        Intent intent = getIntent();
        String size = intent.getStringExtra("SIZE");
        double subtotal = 125.00;
        double shipping = 5.00;
        double tax = 0.00;
        double orderTotal = subtotal + shipping + tax;

        // Set the order details
        shipToTextView.setText("Ship to: John Doe, 1600 Amphitheatre Parkway");
        subtotalTextView.setText("Subtotal: $" + String.format("%.2f", subtotal));
        shippingTextView.setText("Shipping: $" + String.format("%.2f", shipping));
        taxTextView.setText("Tax: $" + String.format("%.2f", tax));
        orderTotalTextView.setText("Order Total: $" + String.format("%.2f", orderTotal));

        // Set the click listener for the place order button
        placeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle order placement logic
                Intent completeIntent = new Intent(ReviewOrderActivity.this, OrderCompletedActivity.class);
                startActivity(completeIntent);
            }
        });
    }
}
