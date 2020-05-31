package com.example.suduko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    int p1score = 0;
    int p2score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button_00);
        Button btn2 = (Button) findViewById(R.id.button_01);
        Button btn3 = (Button) findViewById(R.id.button_02);
        Button btn4= (Button) findViewById(R.id.button_10);
        Button btn5 = (Button) findViewById(R.id.button_11);
        Button btn6 = (Button) findViewById(R.id.button_12);
        Button btn7 = (Button) findViewById(R.id.button_20);
        Button btn8 = (Button) findViewById(R.id.button_21);
        Button btn9 = (Button) findViewById(R.id.button_22);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score+=4;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else if (p2score+p1score==45){
                        Context context = getApplicationContext();
                        CharSequence text = "Draw";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

                } else{
                    ((Button) v).setText("X");
                    p1score+=4;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    else if (p2score+p1score==45){
                        Context context = getApplicationContext();
                        CharSequence text = "Draw";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

                }
                }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;

                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score+=9;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }


                } else{
                    ((Button) v).setText("X");
                    p1score+=9;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=2;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=2;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=3;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=3;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=5;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=5;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=7;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=7;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=8;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=8;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=1;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=1;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter+=1;
                if (counter%2==0){
                    ((Button) v).setText("O");
                    p2score +=6;
                    if (p2score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player two won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                } else{
                    ((Button) v).setText("X");
                    p1score +=6;
                    if (p1score==15){
                        Context context = getApplicationContext();
                        CharSequence text = "Player one won!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
            }
        });
    }
}
