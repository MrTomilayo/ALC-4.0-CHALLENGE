package com.example.button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutActivity(View view) {
        Intent i = new Intent(this, AboutAlcActivity.class);
        startActivity(i);
    }

    public void openProfileActivity(View view) {
        Intent i = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(i);
    }
}
