package com.dhruvil.bmi_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e_hight, e_weight;
    TextView health,health2;
    Button calculate;

    float hight, weight, m=1, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_hight = findViewById(R.id.e_hight);
        e_weight = findViewById(R.id.e_weight);
        calculate = findViewById(R.id.calculate);
        health = findViewById(R.id.health);
        health2 = findViewById(R.id.health2);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hight = Float.parseFloat(e_hight.getText().toString());
                weight = Float.parseFloat(e_weight.getText().toString());

                float h = hight/100;

                ans = weight / (h * h);

                if(ans<18.5){
                    health.setText("Under Weight");
                    health2.setText("health : " + ans);
                }else if(ans>=18.5 && ans<25){
                    health.setText("Normal Weight");
                    health2.setText("health : " + ans);
                }else if(ans>=25 && ans<30){
                    health.setText("Over Weight");
                    health2.setText("health : " + ans);
                }
                else{
                    health.setText("Obesity");
                    health2.setText("health : " + ans);
                }



            }
        });

    }
}