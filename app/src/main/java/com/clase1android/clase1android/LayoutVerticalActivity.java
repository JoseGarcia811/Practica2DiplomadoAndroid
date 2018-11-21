package com.clase1android.clase1android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LayoutVerticalActivity extends AppCompatActivity {

    NotificationCompat.Builder notification;
    String NOTIFICATION_CHANNEL_ID = "channel_id_01";
    private static final int id =3434;
    private Button btn_notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vertical_activity);

        btn_notification = (Button) findViewById(R.id.notificacion);
        notification = new NotificationCompat.Builder(this,NOTIFICATION_CHANNEL_ID);
        notification.setAutoCancel(true);

        btn_notification.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                notification.setSmallIcon(R.mipmap.ic_launcher);
                notification.setTicker("Nueva Notificaciones");
                notification.setPriority(Notification.PRIORITY_HIGH);
                notification.setWhen(System.currentTimeMillis());
                notification.setContentText("Diplomado Android - Practica II");
                notification.setContentTitle("Practica 2 Android");

                Intent intent = new Intent(LayoutVerticalActivity.this,LayoutVerticalActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(LayoutVerticalActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);


                notification.setContentIntent(pendingIntent);
                NotificationManager notificactionManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                notificactionManager.notify(id,notification.build());
            }
        });
    }
}
