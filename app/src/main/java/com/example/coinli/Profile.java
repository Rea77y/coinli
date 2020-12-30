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

    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.profile_settings_button)
        {
            Intent transfer_to_settings = new Intent(this,Settings.class);
            this.startActivity(transfer_to_settings);
        }
    }




}

