package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView balldisplay= (ImageView) findViewById(R.id.image_dice);
        final int [] ballArray= {R.drawable.ballone,R.drawable.balltwo,R.drawable.ballthree,
        R.drawable.ballfive,R.drawable.ballfive};

        Button askbutton =(Button) findViewById(R.id.ask_button);
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Random randomnumbergenerator = new Random();
                int number = randomnumbergenerator.nextInt(5);
                balldisplay.setImageResource(ballArray[number]);



            }
        });







    }
}
