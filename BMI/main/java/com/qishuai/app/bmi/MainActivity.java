package com.qishuai.app.bmi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {
    private EditText shengao;
    private EditText tizhong;
    private TextView result;
    private TextView suggest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shengao = (EditText) findViewById(R.id.shengao);
        tizhong = (EditText) findViewById(R.id.tizhong);
        result=(TextView) findViewById(R.id.result);
        suggest = (TextView) findViewById(R.id.suggest);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                double height = Double.parseDouble(shengao.getText().toString())/100;
                double weight = Double.parseDouble(tizhong.getText().toString());
                double BMI = weight / (height * height);

                DecimalFormat nf = new DecimalFormat("0.00");
                result.setText(getText(R.string.result)+nf.format(BMI));

                if (BMI > 25)
                {
                    suggest.setText(getText(R.string.heavy));
                }
                else if (BMI < 20)
                {
                    suggest.setText(getText(R.string.light));
                }
                else
                {
                    suggest.setText(getText(R.string.average));
                }

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0,1, 0,getText(R.string.aboutBMI));
        menu.add(0,2, 0,getText(R.string.aboutUs));
        menu.add(0,3, 0,getText(R.string.version));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (item.getItemId())
        {
            case 1:
            {
                new AlertDialog.Builder(this).setTitle(getText(R.string.aboutBMI)).setMessage(getText(R.string.BMI)).show();
            }
            break;
            case 2:
            {
                new AlertDialog.Builder(this).setTitle(getText(R.string.aboutUs)).setMessage(getText(R.string.Us)).show();
            }
            break;
            case 3:
            {
                new AlertDialog.Builder(this).setTitle(getText(R.string.version)).setMessage("1.0").show();
            }
            default:
                break;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
