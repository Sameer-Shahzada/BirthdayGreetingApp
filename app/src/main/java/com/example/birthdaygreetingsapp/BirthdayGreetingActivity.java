package com.example.birthdaygreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        // get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String nameValue = intent.getStringExtra(MainActivity.EXTRA_NAME);


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.brd_textView);
        textView.setText("Happy Birthday" + " " + nameValue);

    }

}