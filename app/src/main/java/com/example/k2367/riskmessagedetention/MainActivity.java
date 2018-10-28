package com.example.k2367.riskmessagedetention;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // 發送廣播事件用的Action名稱
    public static final String BROADCAST_ACTION = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(BROADCAST_ACTION);
//
//        String nameValue = "name_test";
//        String ageValue = "age_test";
//
//        intent.putExtra("name", nameValue);
//        intent.putExtra("age", ageValue);
//
//        sendBroadcast(intent);

        /*
        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_favorites) {
                    // The tab with id R.id.tab_favorites was selected,
                    // change your content accordingly.
                }
            }
        });
        */
    }

//    // 建立廣播接收元件物件
//    MyBroadcastReceiver receiver = new MyBroadcastReceiver();
//    @Override
//    protected void onResume() {
//        super.onResume();
//        // 準備註冊與移除廣播接收元件的IntentFilter物件
//        IntentFilter filter = new IntentFilter(Intent.ACTION_TIME_TICK);
//        // 註冊廣播接收元件
//        registerReceiver(receiver, filter);
//    }

//    @Override
//    protected void onPause() {
//        // 移除廣播接收元件
//        unregisterReceiver(receiver);
//        super.onPause();
//    }

    protected void btnPage2_click(View v)
    {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , messageDetection.class);
        startActivity(intent);
    }

}

