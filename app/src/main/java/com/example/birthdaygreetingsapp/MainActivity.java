package com.example.birthdaygreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.security.KeyChain.EXTRA_NAME;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-> How to display text through Toast
//        Toast.makeText(getApplicationContext(),"Hello Main Activity",Toast.LENGTH_SHORT).show();

//          -> 1st way for button click event & show toast on button click
//        Button button = (Button) findViewById(R.id.birthdayCardBtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//              public void onClick(View view) {
//                // handle btn code here
//                Toast.makeText(getApplicationContext(),"Hello World",Toast.LENGTH_SHORT).show();
//            }
//        });

    }

// -> 2nd way for button click event through xml file
    public void birtdayCardBtn(View view) {
        //-> define intent to jump from one activity to another activity.
        Intent intent = new Intent(this,BirthdayGreetingActivity.class);

        //-> How to get edit text from user input field (EditText)
        EditText name = (EditText) findViewById(R.id.nameInput);    //-> get EditText
        String nameValue = name.getText().toString();       //-> store text into String variable
        intent.putExtra(EXTRA_NAME, nameValue);
        startActivity(intent);
//        Toast.makeText(getApplicationContext(),nameValue,Toast.LENGTH_SHORT).show(); // provide string variable reference instead of "text" in toast


    }
}