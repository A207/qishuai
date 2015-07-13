package com.qishuai.app.intent04;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void myBtn(View view){
    Intent intent=new Intent();
    intent.setAction("first");
    //intent.setData(Uri.parse("http//com.qishuai.intent04:8888/c/1"));
    //intent.setType("com.qishuai.first/com");
    intent.setDataAndType(Uri.parse("http//com.qishuai.intent04:8888/c/1"),"com.qishuai.first/com");
    startActivity(intent);

}
}
