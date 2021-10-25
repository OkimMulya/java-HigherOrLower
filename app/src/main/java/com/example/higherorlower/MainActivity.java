package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.higherorlower.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guess (View view) {
        EditText guessEditText = (EditText) findViewById(R.id.EditText);
        int guessint = Integer.parseInt(guessEditText.getText().toString());
        if (guessint > randomNumber){
            makeToast("Lower!");
        }else if (guessint < randomNumber){
            makeToast("Higher1");
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}