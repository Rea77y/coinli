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

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}