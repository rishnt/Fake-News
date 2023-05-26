package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class openResult extends AppCompatActivity {



    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_result);

        txt=findViewById(R.id.resultText);
        Toast.makeText(openResult.this, "Loading...", Toast.LENGTH_SHORT).show();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                Random random=new Random();
                int val=random.nextInt(50);

                if(val<=25){
                    txt.setText("FAKE NEWS");
                }
                else{
                    txt.setText("NOT A FAKE NEWS");
                }
            }
        };

        Handler handler=new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable,3000);
    }
}