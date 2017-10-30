package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.os.Build.VERSION_CODES.M;

public class movieAvailable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_available);
    }

    public void golmaal_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this,Main_golmaal.class);
        startActivity(myIntent);
    }
    public void secret_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this, Main_secret.class);
        startActivity(myIntent);
    }

    public void jia_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this, Main_jia.class);
        startActivity(myIntent);
    }
    public void chef_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this, Main_chef.class);
        startActivity(myIntent);
    }
    public void judwaa_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this,Main_judwaa.class);
        startActivity(myIntent);
    }
    public void rukh_intent (View view){
        Intent myIntent = new Intent(movieAvailable.this,Main_rukh.class);
        startActivity(myIntent);
    }
}
