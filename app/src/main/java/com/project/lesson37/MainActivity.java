package com.project.lesson37;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = (Button)findViewById(R.id.rollbutton);

        final ImageView leftDice = (ImageView)findViewById(R.id.leftDice);

        final ImageView rghitDice = (ImageView)findViewById(R.id.rghitDice);

        final int[] diceArry= {R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("Lesson37","the button has been pressed");

                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(6);



                Log.d("Lesson37","The random Number is: "+number);

                leftDice.setImageResource(diceArry[number]);

                number = randomNumberGenerator.nextInt(6);

                rghitDice.setImageResource(diceArry[number]);
            }
        });
    }
}
