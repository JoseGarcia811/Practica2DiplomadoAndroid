package com.clase1android.clase1android;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ViewActivity extends AppCompatActivity
{
    TextView textView;
    LinearLayout linearLayout;
    Button buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        String[] colors = getIntent().getStringArrayExtra("COLOR_SESSION");

        textView = (TextView) findViewById(R.id.textView);
        linearLayout = (LinearLayout) findViewById(R.id.layout);
        buttons = (Button)findViewById(R.id.atras);
        linearLayout.setBackgroundColor((int) Float.parseFloat(colors[1]));
        textView.setTextSize(17.9f);
        textView.setGravity(17);
        textView.setTextColor(-1);

        textView.setText("Este cambio de vista ejecutado desde el boton color "+ colors[0].toUpperCase() +" fue exitoso!");

    }

    public void ReturnHome(View view){
        Intent i = new Intent(ViewActivity.this,MainActivity.class);
        startActivity(i);
    }
}
