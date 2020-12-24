package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        View tips_button= findViewById(R.id.home_tips_button);
        tips_button.setOnClickListener((View.OnClickListener) this);
        View sign_up_button= findViewById(R.id.sign_in_sign_up_button);
        sign_up_button.setOnClickListener((View.OnClickListener) this);
        View forgot_password= findViewById(R.id.sign_in_forgot_password_button);
        forgot_password.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.home_tips_button) {
            //Transports users to the home activity
            Intent transfer_to_sign_in = new Intent(this,ChatCommunity.class);
            this.startActivity(transfer_to_sign_in);
        }
        if(arg0.getId() == R.id.sign_in_sign_up_button)
        {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
        if(arg0.getId() == R.id.sign_in_forgot_password_button)
        {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
    }

}