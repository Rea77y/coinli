package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChatGroup extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_group);
        View chat_group_home_button = findViewById(R.id.chat_group_home_button);
        chat_group_home_button.setOnClickListener(this);
        View chat_private_experts_button = findViewById(R.id.chat_group_experts_button);
        chat_private_experts_button.setOnClickListener(this);
        View chat_private_balance_button = findViewById(R.id.chat_group_balance_button);
        chat_private_balance_button.setOnClickListener(this);
        View chat_private_profile_button = findViewById(R.id.chat_group_profile_button);
        chat_private_profile_button.setOnClickListener(this);
        View chat_private_group_button = findViewById(R.id.chat_group_private_button);
        chat_private_group_button.setOnClickListener(this);
        View chat_private_com_button = findViewById(R.id.chat_group_com_button);
        chat_private_com_button.setOnClickListener(this);
        View chat_private_settings_button = findViewById(R.id.chat_group_settings_button);
        chat_private_settings_button.setOnClickListener(this);

    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.chat_group_home_button) {
            //Transports users to the home activity
            Intent transfer_to_home = new Intent(this, Home.class);
            this.startActivity(transfer_to_home);
        }
        if (arg0.getId() == R.id.chat_group_experts_button) {
            //Transports users to the experts activity
            Intent transfer_to_experts = new Intent(this, Experts.class);
            this.startActivity(transfer_to_experts);
        }
        if (arg0.getId() == R.id.chat_group_balance_button) {
            //Transports users to the balance activity
            Intent transfer_to_balance = new Intent(this, Balance.class);
            this.startActivity(transfer_to_balance);
        }
        if (arg0.getId() == R.id.chat_private_profile_button) {
            //Transports users to the profile activity
            Intent transfer_to_profile = new Intent(this, Profile.class);
            this.startActivity(transfer_to_profile);
        }
        if (arg0.getId() == R.id.chat_private_group_button) {
            //Transports users to the group activity
            Intent transfer_to_group = new Intent(this, ChatGroup.class);
            this.startActivity(transfer_to_group);
        }
        if (arg0.getId() == R.id.chat_private_com_button) {
            //Transports users to the community activity
            Intent transfer_to_com = new Intent(this, ChatCommunity.class);
            this.startActivity(transfer_to_com);
        }
        if (arg0.getId() == R.id.chat_private_settings_button) {
            //Transports users to the settings activity
            Intent transfer_to_settings = new Intent(this, Settings.class);
            this.startActivity(transfer_to_settings);
        }
    }
}
