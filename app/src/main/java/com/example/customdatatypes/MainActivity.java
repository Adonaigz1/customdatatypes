package com.example.customdatatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView t1;
EditText e1;
Button b1;
String ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        e1= (EditText)findViewById(R.id.editTextTextPersonName);
        b1= findViewById(R.id.button);
        customdata b[]=new customdata[5];
        b[0]=new customdata("Which is the biggest ocean"," Pacific ocean");
        b[1]=new customdata("What is the largest country"," Russia");
        b[2]=new customdata("What is the oldest place on earth"," Antarctica");
        b[3]=new customdata("What is the largest country"," Russia");
        b[4]=new customdata("What is the fastest animal"," Chethah");
        Random randomNumber = new Random();

        int numberGenerated = randomNumber.nextInt(5 - 0) + 0;

        t1.setText(b[numberGenerated].Question);

        ans = b[numberGenerated].Answer;

        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if(e1.getText().toString().toLowerCase().equals(ans))

                {

                    int numberGenerated = randomNumber.nextInt(5 - 0) + 0;

                    t1.setText(b[numberGenerated].Question);

                    ans = b[numberGenerated].Answer;

                    Toast.makeText(MainActivity.this, "Correct!! Answer!!",

                            Toast.LENGTH_LONG).show();

                    e1.setText("");

                }

            }

        });

    }
}
