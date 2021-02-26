package com.example.myservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start,stop,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.s1);
        stop=findViewById(R.id.s2);
        next=findViewById(R.id.s3);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.s1:
                startService(new Intent(MainActivity.this,Myservice.class));
                break;
            case R.id.s2:
                stopService(new Intent(MainActivity.this,Myservice.class));
                break;
            case R.id.s3:
                Intent intent=new Intent(MainActivity.this,Nextpage.class);
                startActivity(intent);
                break;
        }

    }


}