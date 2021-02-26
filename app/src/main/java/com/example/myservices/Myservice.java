package com.example.myservices;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class Myservice extends Service {

    MediaPlayer mediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        mediaPlayer=MediaPlayer.create(this,R.raw.fs);
        mediaPlayer.setLooping(false);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        mediaPlayer.start();
            }

    @Override
    public void onDestroy() {
       mediaPlayer.stop();
    }
}
