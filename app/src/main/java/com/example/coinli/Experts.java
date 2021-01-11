package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Experts extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experts);

        View experts_chat_community_button = findViewById(R.id.experts_chat_button);
        experts_chat_community_button.setOnClickListener(this);
        View experts_balance_button = findViewById(R.id.experts_balance_button);
        experts_balance_button.setOnClickListener(this);
        View experts_settings_button = findViewById(R.id.experts_settings_button);
        experts_settings_button.setOnClickListener(this);
        View experts_home_button = findViewById(R.id.experts_home_button);
        experts_home_button.setOnClickListener(this);
        View experts_profile_button = findViewById(R.id.experts_profile_button);
        experts_profile_button.setOnClickListener(this);
        View experts_findexperts_button = findViewById(R.id.experts_findexperts_button);
        experts_findexperts_button.setOnClickListener(this);
    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.experts_settings_button) {
            //Transports users to the settings activity
            Intent experts_settings_button = new Intent(this, Settings.class);
            this.startActivity(experts_settings_button);
        }
        if (arg0.getId() == R.id.experts_chat_button) {
            Intent transfer_to_chat = new Intent(this, ChatCommunity.class);
            this.startActivity(transfer_to_chat);
        }
        if (arg0.getId() == R.id.experts_home_button) {
            Intent transfer_to_home = new Intent(this, Home.class);
            this.startActivity(transfer_to_home);
        }
        if (arg0.getId() == R.id.experts_balance_button) {
            Intent transfer_to_balance = new Intent(this, Balance.class);
            this.startActivity(transfer_to_balance);
        }
        if (arg0.getId() == R.id.experts_profile_button) {
            Intent transfer_to_profile = new Intent(this, Profile.class);
            this.startActivity(transfer_to_profile);
        }
        if (arg0.getId() == R.id.experts_findexperts_button) {
            Intent transfer_to_findExperts = new Intent(this, ExpertSearch.class);
            this.startActivity(transfer_to_findExperts);
        }

    }
}
