package com.cborau.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMsg (View v){

        String msg = "This button will launch ";
        switch (v.getId()){
            case R.id.button1:
                msg += getResources().getString(R.string.bt1);
                break;
            case R.id.button2:
                msg += getResources().getString(R.string.bt2);
                break;
            case R.id.button3:
                msg += getResources().getString(R.string.bt3);
                break;
            case R.id.button4:
                msg += getResources().getString(R.string.bt4);
                break;
            case R.id.button5:
                msg += getResources().getString(R.string.bt5);
                break;
            case R.id.button6:
                msg += getResources().getString(R.string.bt6);
                break;
        }
        makeToast(msg);
    }

    public void makeToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
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
