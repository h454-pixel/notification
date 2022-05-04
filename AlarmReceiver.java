package com.example.readnotifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.RequiresApi;

public class AlarmReceiver extends BroadcastReceiver {
    MediaPlayer mp;
    Boolean b = false;
    Boolean bc = false;


    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override

    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, MyAlarmService.class);
        context.startService(intent1);



//  b= intent.getBooleanExtra("one",false);
//  bc     = intent.getBooleanExtra("two",false);
//
//      if(b) {
//          mp = MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
//         mp.start();
//
//
//      }
//     if(bc) {
//          mp.stop();
//          context.stopService(intent1);
//      }
//
//
//    }
    }

}

        //        String fetch_string = intent.getExtras().getString("extra");
//        Intent service_intent = new Intent(context, RingtoneManager.class);
//        service_intent.putExtra("extra", fetch_string);
//        context.startService(service_intent);
//


















        //        b    =intent.getBooleanExtra("one",false);
//
//
//
//
//
//        Log.d("", "....................Reciever...........working.");
//
//            Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
//        if (alarmUri == null) {
//            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//        }
//        // setting default ringtone
//        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
//        ringtone.play();
//
//
//        if(b&&ringtone.isPlaying()){
//            ringtone.stop();
//        }
//










