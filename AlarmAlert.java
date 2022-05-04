package com.example.readnotifi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.concurrent.ExecutionException;

public  class AlarmAlert extends AppCompatActivity {
    private final static String default_notification_channel_id = "default";
    Context context;
    Button btnoff, bton;
    EditText editText;
    TextView textView,textView2;
    AlarmManager alarmMgr;

    AlarmReceiver alarmReceiver;
   Intent intent;

    PendingIntent alarmIntent;
    AlarmAlert(Context context) {
        this.context = context;
    }

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_alert);
        mp = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);

        alarmReceiver = new AlarmReceiver();


        btnoff = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        textView = (TextView) findViewById(R.id.textView);
        Log.d("", ".....#####.....AlarmAlert..#######...................");


        btnoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  AlarmManager  alarmMgrr = (AlarmManager)context.getSystemService(Context.ALARM_SERVICE);

            }
        });

        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    aleartaction();
            }
        });

    }

    public void aleartaction() {
      intent = new Intent(context, AlarmReceiver.class);
  //    intent.putExtra("extra", "alarm on");

        // Input extra long into my_intent
        // Requests specific value from spinner
     intent.putExtra("one",true);


        alarmIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        Log.d("", "...............................Alarmworking2.");
        AlarmManager alarmMgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmMgr.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 0, alarmIntent);
    }

    public void alramoff() {
try{ Intent  intent1 = new Intent(context, AlarmReceiver.class);
    intent1.putExtra("two",true);
    PendingIntent alarmIntent1 = PendingIntent.getService(context, 0, intent,0);
      alarmMgr.cancel(alarmIntent1);
     //  stopService(intent1);


}catch (Exception e){

}

    //    sendBroadcast(intent);

    }








}