package com.example.coinli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sign_in extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        View sign_in_button= findViewById(R.id.sign_in_button);
        sign_in_button.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.sign_in_button) {
            //Transports users to the home activity
            Intent intent = new Intent(this, Home.class);
            this.startActivity(intent);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
