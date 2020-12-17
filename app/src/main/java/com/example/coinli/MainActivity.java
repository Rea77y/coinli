package com.example.coinli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        View sign_in_button= findViewById(R.id.sign_in_sign_in_button);
        sign_in_button.setOnClickListener(this);
        View sign_up_button= findViewById(R.id.sign_in_sign_up_button);
        sign_up_button.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.sign_in_sign_in_button) {
            //Transports users to the home activity
            Intent transfer_to_sign_in = new Intent(this, Home.class);
            this.startActivity(transfer_to_sign_in);
        }
        if(arg0.getId() == R.id.sign_in_sign_up_button)
        {
            Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
            this.startActivity(transfer_to_sign_up);
        }
    }




    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
