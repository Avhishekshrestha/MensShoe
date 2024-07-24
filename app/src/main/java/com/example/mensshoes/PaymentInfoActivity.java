package com.example.mensshoes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_info);

        // Initialize the Continue button
        Button continueButton = findViewById(R.id.continue_button);

        // Set a click listener for the Continue button
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the continue button click and navigate to the Review Order screen
                Intent intent = new Intent(PaymentInfoActivity.this, ReviewOrderActivity.class);
                startActivity(intent);
            }
        });
    }
}
