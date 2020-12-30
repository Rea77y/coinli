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
        View settings_invite_friends_button = findViewById(R.id.settings_invite_friends_button);
        settings_invite_friends_button.setOnClickListener(this);
    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.settings_back_button) {
            //Transports users to the personal activity
            Intent transfer_to_profile = new Intent(this, Help.class);
            this.startActivity(transfer_to_profile);
        }
        if (arg0.getId() == R.id.settings_chat_info_button) {
            //Transports users to the Chat_info activity
            Intent transfer_to_chat_info = new Intent(this, Chat_info.class);
            this.startActivity(transfer_to_chat_info);
        }
        if (arg0.getId() == R.id.settings_data_storage_button) {
            //Transports users to the Data storage activity
            Intent transfer_to_data_storage = new Intent(this, Data_storage.class);
            this.startActivity(transfer_to_data_storage);
        }
        if (arg0.getId() == R.id.settings_help_button) {
            /*
            Intent transfer_to_data_storage = new Intent(this, Data_storage.class);
            this.startActivity(transfer_to_data_storage);
            */
        }
        if (arg0.getId() == R.id.settings_invite_friends_button) {
            /*
            Intent transfer_to_data_storage = new Intent(this, Data_storage.class);
            this.startActivity(transfer_to_data_storage);
            */
        }
    }
}
