package com.qishuai.app.intend01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/7/10.
 */
public class OtherActivity extends Activity{
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_other);
       Intent intent=getIntent();
       String name=intent.getStringExtra("name");
       int age=intent.getIntExtra("age", 0);
       String gender=intent.getStringExtra("gender");
       Toast.makeText(this,"name:"+name+",age:"+age+",gender"+gender,Toast.LENGTH_SHORT).show();


   }
}
