package com.example.coinli;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity {

    EditText username,  password;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        mFirebaseAuth = FirebaseAuth.getInstance();
        username = findViewById(R.id.email2);
        password = findViewById(R.id.password2);


    }

    public void save_details(View view) {
        String usernameS = username.getText().toString();
        String passwordS = password.getText().toString();
        if(usernameS.isEmpty())
        {
            username.setError("Please enter a username");
            username.requestFocus();
        }
        else if (passwordS.isEmpty())
        {
            password.setError("Please enter a password");
            password.requestFocus();
        }
        else if(usernameS.isEmpty()&&passwordS.isEmpty())
        {
            Toast.makeText(this, "The fields are empty", Toast.LENGTH_SHORT).show();
        }
        else if(!(usernameS.isEmpty()&&passwordS.isEmpty()))
        {
            mFirebaseAuth.createUserWithEmailAndPassword(usernameS,passwordS).addOnCompleteListener(Sign_up.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task)
                {
                    if(!task.isSuccessful())
                    {
                        Toast.makeText(Sign_up.this, "Signup unsuccessful, please try again", Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        startActivity(new Intent(Sign_up.this, Home.class));
                    }
                }
            });
        }
        else
        {
            Toast.makeText(Sign_up.this, "Error occurred", Toast.LENGTH_SHORT).show();
        }

    }
}