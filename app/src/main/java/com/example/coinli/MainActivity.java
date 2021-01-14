package com.example.coinli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  username,  password;
    GoogleSignInClient mGoogleSignInClient;
    FirebaseAuth  mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mFirebaseAuth = FirebaseAuth.getInstance();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        username  = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {


            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser != null)
                {
                    Toast.makeText(MainActivity.this, "You are logged in", Toast.LENGTH_SHORT).show();
                    Intent t = new Intent(MainActivity.this, Home.class);
                    startActivity(t);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please login", Toast.LENGTH_SHORT).show();
                }
            }
        };






    }

    public void onClick(View arg0) {

    }




    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public void send_home(View view) {
        //verify data
        Intent t = new Intent(this, Home.class);
        startActivity(t);
    }
    private void signIn() {
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
            mFirebaseAuth.signInWithEmailAndPassword(usernameS,passwordS).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(!task.isSuccessful())
                    {
                        Toast.makeText(MainActivity.this, "Login Error, please try again", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent t = new Intent(MainActivity.this, Home.class);
                        startActivity(t);
                    }
                }
            });

        }
        else
        {
            Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
        }


        //Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        //short RC_SIGN_IN = 0;
        //startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    public void GoSignUp(View view) {
        Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
        this.startActivity(transfer_to_sign_up);
    }
}
