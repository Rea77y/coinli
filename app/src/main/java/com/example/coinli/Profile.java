package com.example.coinli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Profile extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        View sign_in_button= findViewById(R.id.profile_home_button);
        sign_in_button.setOnClickListener((View.OnClickListener) this);
        View sign_up_button= findViewById(R.id.profile_algorithm_button);
        sign_up_button.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.profile_home_button) {
            //Transports users to the home activity
            Intent transfer_to_sign_in = new Intent(this, Home.class);
            this.startActivity(transfer_to_sign_in);
        }
        if(arg0.getId() == R.id.profile_algorithm_button)
        {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
    }




}

