package com.example.coinli;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        View settings_back_button = findViewById(R.id.settings_back_button);
        settings_back_button.setOnClickListener(this);
        View settings_chat_info_button = findViewById(R.id.settings_chat_info_button);
        settings_chat_info_button.setOnClickListener(this);
        View settings_notifications_button = findViewById(R.id.settings_notifications_button);
        settings_notifications_button.setOnClickListener(this);
        View settings_data_storage_button = findViewById(R.id.settings_data_storage_button);
        settings_data_storage_button.setOnClickListener(this);
        View settings_help_button = findViewById(R.id.settings_help_button);
        settings_help_button.setOnClickListener(this);
        View chat_com_private_button = findViewById(R.id.chat_com_private_button);
        chat_com_private_button.setOnClickListener(this);
        View settings_invite_friends_button = findViewById(R.id.settings_invite_friends_button);
        settings_invite_friends_button.setOnClickListener(this);

    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.settings_back_button) {
            //Transports users to the personal activity
            Intent transfer_to_profile = new Intent(this, Profile.class);
            this.startActivity(transfer_to_profile);
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
