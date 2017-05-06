package com.example.qin.intentreceive;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    private Button myButton = null;
    private final String nobody ="Who.care.the.name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button)findViewById(R.id.myButton);
        //为按钮对象设置监听器对象
        myButton.setOnClickListener(new MyButtonListener());
    }
    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //生成一个Intent对象
            Intent intent = new Intent(nobody);
            //在Intent对象当中添加一个键值对
            intent.putExtra("testIntent", "11111111111");
            sendBroadcast(intent);
        }
    }
}