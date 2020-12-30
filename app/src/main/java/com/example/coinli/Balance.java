package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Balance extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balance);
        View balance_community_button= findViewById(R.id.balance_chat_button);
        balance_community_button.setOnClickListener(this);
        View balance_experts_button= findViewById(R.id.balance_experts_button);
        balance_experts_button.setOnClickListener(this);
        View balance_profile_button= findViewById(R.id.balance_profile_button);
        balance_profile_button.setOnClickListener(this);
        /*View balance_show_stat_button= findViewById(R.id.balance_show_stat_button);
        balance_show_stat_button.setOnClickListener(this);
         */
        View balance_settings_button= findViewById(R.id.balance_settings_button);
        balance_settings_button.setOnClickListener(this);
        View balance_home_button= findViewById(R.id.balance_home_button);
        balance_home_button.setOnClickListener(this);


    }
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.balance_chat_button) {
            //Transports users to the home activity
            Intent transfer_to_Comunity = new Intent(this, ChatCommunity.class);
            this.startActivity(transfer_to_Comunity);
        }
        if (arg0.getId() == R.id.balance_experts_button) {
            Intent transfer_to_experts = new Intent(this, Experts.class);
            this.startActivity(transfer_to_experts);
        }
        if (arg0.getId() == R.id.balance_profile_button) {
            Intent transfer_to_profile = new Intent(this, Profile.class);
            this.startActivity(transfer_to_profile);
        }
        if (arg0.getId() == R.id.balance_settings_button) {
            Intent transfer_to_settings = new Intent(this, Settings.class);
            this.startActivity(transfer_to_settings);
        }
        if (arg0.getId() == R.id.balance_home_button) {
            Intent transfer_to_home = new Intent(this, Home.class);
            this.startActivity(transfer_to_home);
        }

    }
}