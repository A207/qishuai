package com.qishuai.app.intent05;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myBtn(View view){
       //Intent intent=new Intent();
       // Uri uri=Uri.parse("tel:18297942513");
       // intent.setAction(intent.ACTION_CALL);
       // intent.setData(uri);
       //startActivity(intent);//打电话
       //Uri uri=Uri.parse("smsto:18297942513");
       //Intent it=new Intent(Intent.ACTION_SENDTO, uri);
        //it.putExtra("sms_body","The SMS text,Hello");
        //startActivity(it);//发短信
        Intent intent=new Intent();
        Uri uri=Uri.parse("http//www.baidu.com");
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
