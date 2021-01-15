package com.example.coinli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  username,  password;
    GoogleSignInClient mGoogleSignInClient;
    FirebaseAuth  mFirebaseAuth;
    Button forgot;
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
        forgot = findViewById(R.id.sign_in_forgot_password_button);

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


        //Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        //short RC_SIGN_IN = 0;
        //startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    public void GoSignUp(View view) {
        Intent transfer_to_sign_up = new Intent(this, Sign_up.class);
        this.startActivity(transfer_to_sign_up);
    }

    public void signIn(View view) {
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

    }

    public void resetPassword(View view) {
        final EditText resetMail = new EditText(view.getContext());
        AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(view.getContext());
        passwordResetDialog.setTitle("Reset password?");
        passwordResetDialog.setMessage("Enter Your Email To Receive Reset Link.");
        passwordResetDialog.setView(resetMail);

        passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String Mail = resetMail.getText().toString();
                mFirebaseAuth.sendPasswordResetEmail(Mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(MainActivity.this, "Reset Link Was Sent To Your Mail", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "Error! Reset Link Was Not Sent", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }) ;
        passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });

    }
}
