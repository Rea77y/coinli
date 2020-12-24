package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordConfirm extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_confirm);

    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.sign_in_sign_in_button) {
            //Transports users to the home activity
            Intent transfer_to_sign_in = new Intent(this, Home.class);
            this.startActivity(transfer_to_sign_in);
        }
        if (arg0.getId() == R.id.sign_in_sign_up_button) {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
        if (arg0.getId() == R.id.sign_in_forgot_password_button) {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
    }
}