package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class User_info extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info);
        View user_info_settings_button = findViewById(R.id.user_info_settings_button);
        user_info_settings_button.setOnClickListener(this);
        View user_info_back_button = findViewById(R.id.user_info_back_button);
        user_info_back_button.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        if (arg0.getId() == R.id.user_info_settings_button) {
            //Transports users to the settings activity
            Intent transfer_to_settings = new Intent(this, Settings.class);
            this.startActivity(transfer_to_settings);
        }
        if (arg0.getId() == R.id.user_info_back_button) {
            Intent transfer_to_Chat_private = new Intent(this, Chat_private.class);
            this.startActivity(transfer_to_Chat_private);
        }

    }






}
