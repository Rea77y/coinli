package com.example.coinli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Personal_info extends AppCompatActivity implements View.OnClickListener {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);
        View personal_info_back_button = findViewById(R.id.personal_info_back_button);
        personal_info_back_button.setOnClickListener(this);
        View personal_info_edit_button = findViewById(R.id.personal_info_edit_button);
        personal_info_edit_button.setOnClickListener(this);


    }

    public void onClick(View arg0) {
        if(arg0.getId() == R.id.personal_info_back_button)
        {
            //make option to edit
            Intent transfer_to_profile = new Intent(this,Profile.class);
            this.startActivity(transfer_to_profile);
        }
        if(arg0.getId() == R.id.personal_info_edit_button)
        {
            //make option to edit
        }
    }

}