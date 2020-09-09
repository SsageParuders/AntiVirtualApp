package com.qtfreet.vadetect;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ysrc.antiva.AntiVA;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.sample_text);
        boolean a = AntiVA.isRunInVa(this);
        Log.e("qtfreet0000", "当前是否运行在多开环境中： " + a);
        tv.setText("当前是否运行在多开环境中： " + a);
    }


}
