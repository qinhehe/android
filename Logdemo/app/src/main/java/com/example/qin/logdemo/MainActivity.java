package com.example.qin.logdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    private static final String ACTIVITY_TAG="MainActivity";
    private Button bt;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(MainActivity.ACTIVITY_TAG, "This is Verbose.");
                Log.d(MainActivity.ACTIVITY_TAG, "This is Debug.");
                Log.i(MainActivity.ACTIVITY_TAG, "This is Information");
                Log.w(MainActivity.ACTIVITY_TAG, "This is Warnning.");
                Log.e(MainActivity.ACTIVITY_TAG, "This is Error.");
            }
        }); }
}
