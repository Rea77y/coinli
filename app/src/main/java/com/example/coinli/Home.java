package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        View home_chat_community_button = findViewById(R.id.home_chat_button);
        home_chat_community_button.setOnClickListener(this);
        View home_experts_button = findViewById(R.id.home_experts_button);
        home_experts_button.setOnClickListener(this);
       // View home_tips_button = findViewById(R.id.home_tips_button);
       // home_tips_button.setOnClickListener(this);
        View home_balance_button = findViewById(R.id.home_balance_button);
        home_balance_button.setOnClickListener(this);
        View home_settings_button = findViewById(R.id.home_settings_button);
        home_settings_button.setOnClickListener(this);
        View home_profile_button = findViewById(R.id.home_profile_button);
        home_profile_button.setOnClickListener(this);

    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.home_experts_button)
        {
            Intent transfer_to_experts = new Intent(this,Experts.class);
            this.startActivity(transfer_to_experts);
        }
        /*if(arg0.getId() == R.id.home_tips_button)
        {
            Intent transfer_to_ChatCommunity = new Intent(this,ChatCommunity.class);
            this.startActivity(transfer_to_ChatCommunity);
        }
        */
        if(arg0.getId() == R.id.home_balance_button)
        {
            Intent transfer_to_balance = new Intent(this,Balance.class);
            this.startActivity(transfer_to_balance);
        }
        if(arg0.getId() == R.id.home_chat_button)
        {
            Intent transfer_to_ChatCommunity = new Intent(this,ChatCommunity.class);
            this.startActivity(transfer_to_ChatCommunity);
        }
        if(arg0.getId() == R.id.home_settings_button)
        {
            Intent transfer_to_settings = new Intent(this,Settings.class);
            this.startActivity(transfer_to_settings);
        }
        if(arg0.getId() == R.id.home_profile_button) {
            //Transports users to the home activity
            Intent transfer_to_profile = new Intent(this,Profile.class);
            this.startActivity(transfer_to_profile);
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}