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
    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.home_chat_button) {
            //Transports users to the home activity
            Intent transfer_to_ChatCommunity = new Intent(this,ChatCommunity.class);
            this.startActivity(transfer_to_ChatCommunity);
        }
        if (arg0.getId() == R.id.chat_private_experts_button) {
            //Transports users to the experts activity
            Intent transfer_to_experts = new Intent(this, Experts.class);
            this.startActivity(transfer_to_experts);
        }
        if (arg0.getId() == R.id.chat_private_balance_button) {
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

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}