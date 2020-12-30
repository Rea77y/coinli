package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChatCommunity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_com);
        View chat_com_home_button = findViewById(R.id.chat_com_home_button);
        chat_com_home_button.setOnClickListener(this);
        View chat_com_experts_button = findViewById(R.id.chat_com_experts_button);
        chat_com_experts_button.setOnClickListener(this);
        View chat_com_balance_button = findViewById(R.id.chat_com_balance_button);
        chat_com_balance_button.setOnClickListener(this);
        View chat_com_profile_button = findViewById(R.id.chat_com_profile_button);
        chat_com_profile_button.setOnClickListener(this);
        View chat_com_group_button = findViewById(R.id.chat_com_group_button);
        chat_com_group_button.setOnClickListener(this);
        View chat_com_private_button = findViewById(R.id.chat_com_private_button);
        chat_com_private_button.setOnClickListener(this);
        View chat_com_settings_button = findViewById(R.id.chat_com_settings_button);
        chat_com_settings_button.setOnClickListener(this);
        View chat_com_join_Com_button = findViewById(R.id.chat_com_join_Com_button);
        chat_com_join_Com_button.setOnClickListener(this);

    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.chat_com_home_button) {
            //Transports users to the home activity
            Intent transfer_to_home = new Intent(this, Home.class);
            this.startActivity(transfer_to_home);
        }
        if (arg0.getId() == R.id.chat_com_experts_button) {
            //Transports users to the experts activity
            Intent transfer_to_experts = new Intent(this, Experts.class);
            this.startActivity(transfer_to_experts);
        }
        if (arg0.getId() == R.id.chat_com_balance_button) {
            //Transports users to the balance activity
            Intent transfer_to_balance = new Intent(this, Balance.class);
            this.startActivity(transfer_to_balance);
        }
        if (arg0.getId() == R.id.chat_com_profile_button) {
            //Transports users to the profile activity
            Intent transfer_to_profile = new Intent(this, Profile.class);
            this.startActivity(transfer_to_profile);
        }
        if (arg0.getId() == R.id.chat_com_group_button) {
            //Transports users to the group activity
            Intent transfer_to_group = new Intent(this, ChatGroup.class);
            this.startActivity(transfer_to_group);
        }
        if (arg0.getId() == R.id.chat_com_private_button) {
            //Transports users to the private activity
            Intent transfer_to_private = new Intent(this, Chat_private.class);
            this.startActivity(transfer_to_private);
        }
        if (arg0.getId() == R.id.chat_com_settings_button) {
            //Transports users to the settings activity
            Intent transfer_to_settings = new Intent(this, Settings.class);
            this.startActivity(transfer_to_settings);
        }
        if (arg0.getId() == R.id.chat_com_join_Com_button) {
            //Transports users to the settings activity
            Intent transfer_to_search = new Intent(this, ExpertSearch.class);
            this.startActivity(transfer_to_search);
        }
    }
}
