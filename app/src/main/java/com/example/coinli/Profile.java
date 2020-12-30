package com.example.coinli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Profile extends AppCompatActivity implements View.OnClickListener  {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        View profile_settings_button = findViewById(R.id.profile_settings_button);
        profile_settings_button.setOnClickListener(this);
        View profile_personal_info_button = findViewById(R.id.profile_personal_information_button);
        profile_personal_info_button.setOnClickListener(this);
        View profile_chat_community_button = findViewById(R.id.profile_chat_button);
        profile_chat_community_button.setOnClickListener(this);
        View profile_experts_button = findViewById(R.id.profile_experts_button);
        profile_experts_button.setOnClickListener(this);
        View profile_balance_button = findViewById(R.id.profile_balance_button);
        profile_balance_button.setOnClickListener(this);

    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.profile_settings_button)
        {
            Intent transfer_to_settings = new Intent(this,Settings.class);
            this.startActivity(transfer_to_settings);
        }
        if(arg0.getId() == R.id.profile_personal_information_button)
        {
            Intent transfer_to_personal_info = new Intent(this,Personal_info.class);
            this.startActivity(transfer_to_personal_info);
        }
        if(arg0.getId() == R.id.profile_chat_button)
        {
            Intent transfer_to_chat_com = new Intent(this,ChatCommunity.class);
            this.startActivity(transfer_to_chat_com);
        }
        if(arg0.getId() == R.id.profile_experts_button)
        {
            Intent transfer_to_experts = new Intent(this,Experts.class);
            this.startActivity(transfer_to_experts);
        }
        if(arg0.getId() == R.id.profile_balance_button)
        {
            Intent transfer_to_balance = new Intent(this,Balance.class);
            this.startActivity(transfer_to_balance);
        }
    }


}

