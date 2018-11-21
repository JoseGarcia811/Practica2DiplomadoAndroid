package com.clase1android.clase1android;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class LayoutHorizontalActivity extends AppCompatActivity implements View.OnClickListener{

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_horizontal_activity);

        button1 =  (Button)findViewById(R.id.rojo);
        button2 =  (Button)findViewById(R.id.verde);
        button3 =  (Button)findViewById(R.id.amarillo);
        button4 =  (Button)findViewById(R.id.azul);

        layout = (LinearLayout) findViewById(R.id.linearlayout2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.rojo :
                 layout.setBackgroundColor(Color.RED);
                break;
            case R.id.verde :
                layout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.amarillo :
                layout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.azul :
                layout.setBackgroundColor(Color.BLUE);
                break;

        }
    }

}
