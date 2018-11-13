package com.clase1android.clase1android;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

     Button button1;
     Button button2;
     Button button3;
     Button button4;
     Button button5;
     Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 =  (Button)findViewById(R.id.button);
        button2 =  (Button)findViewById(R.id.button2);
        button3 =  (Button)findViewById(R.id.button3);
        button4 =  (Button)findViewById(R.id.button4);
        button5 =  (Button)findViewById(R.id.button5);
        button6 =  (Button)findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }
    private void confirmDialog(final int colorNumber, final ColorDrawable colorDrawable)
    {
        RadioButton r1=(RadioButton)findViewById(R.id.radioButton);
        RadioButton r2=(RadioButton)findViewById(R.id.radioButton2);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        final String colorBgButton = getColorName (colorNumber);

                if (r1.isChecked()==true) {
                    if(colorNumber == -30720)
                    {
                        Intent i = new Intent(MainActivity.this,View1Activity.class);
                        startActivity(i);
                    }else
                        if(colorNumber == -17613){
                        Intent i = new Intent(MainActivity.this,View2Activity.class);
                        startActivity(i);
                    }else
                        if(colorNumber == -5609780){
                            Intent i = new Intent(MainActivity.this,View3Activity.class);
                            startActivity(i);
                    }else
                        if(colorNumber == -3407872){
                            Intent i = new Intent(MainActivity.this,View4Activity.class);
                            startActivity(i);
                    }else
                        if(colorNumber == -48060){
                            Intent i = new Intent(MainActivity.this,View5Activity.class);
                            startActivity(i);
                        }
                }else
                if (r2.isChecked() == true)
                {
                builder
                        .setMessage("Es " + colorBgButton +" el color de este boton?")
                        .setPositiveButton("Si",  new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                if(colorNumber ==  colorDrawable.getColor()){
                                    Intent i = new Intent(MainActivity.this,ViewActivity.class);

                                    String[] v =  {colorBgButton,String.valueOf(colorDrawable.getColor())};
                                    i.putExtra("COLOR_SESSION",v);

                                    startActivity(i);
                                }else
                                {
                                    Toast.makeText(MainActivity.this,"El color "+colorBgButton.toUpperCase()+ " no es el mismo color del boton",Toast.LENGTH_LONG).show();
                                }
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        })
                        .show();


        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button :
                Button button1 = (Button) findViewById(R.id.button);
                ColorDrawable buttonColor = (ColorDrawable) button1.getBackground();

                confirmDialog(-30720,buttonColor);
                break;
            case R.id.button2 :
                Button button2 = (Button) findViewById(R.id.button2);
                ColorDrawable buttonColor2 = (ColorDrawable) button2.getBackground();

                confirmDialog(-17613,buttonColor2);
                break;
            case R.id.button3 :
                Button button3 = (Button) findViewById(R.id.button3);
                ColorDrawable buttonColor3 = (ColorDrawable) button3.getBackground();

                confirmDialog(-5609780,buttonColor3);
                break;
            case R.id.button4 :
                Button button4 = (Button) findViewById(R.id.button4);
                ColorDrawable buttonColor4 = (ColorDrawable) button4.getBackground();

                confirmDialog(-3407872,buttonColor4);
                break;
            case R.id.button5 :
                Button button5 = (Button) findViewById(R.id.button5);
                ColorDrawable buttonColor5 = (ColorDrawable) button5.getBackground();

                confirmDialog(-48060,buttonColor5);
                break;
            case R.id.button6 :
                Button button6 = (Button) findViewById(R.id.button6);
                ColorDrawable buttonColor6 = (ColorDrawable) button6.getBackground();

                confirmDialog(-16777216,buttonColor6);
                break;
        }
    }

    private String getColorName (int numberColor)
    {
        String result = "";
        switch (numberColor)
        {
            case -30720:
                result = "mamey";
                break;
            case -17613:
                result = "amarillo";
                break;
            case -5609780:
                result = "morado";
                break;
            case -3407872:
                result = "rojo";
                break;
            case -48060:
                result = "rosado";
                break;
            case -16777216:
                result = "negro";
                break;

        }

        return  result;
    }
}
