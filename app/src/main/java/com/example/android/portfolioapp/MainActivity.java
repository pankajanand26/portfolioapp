package com.example.android.portfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void sendMessage(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        String mystring;
        switch (view.getId()) {
            case R.id.button_send:
                // do something
                mystring = "This will launch my Spotify Streamer app!";
                break;
            case R.id.scores:
                // do something else
                mystring = "This will launch my Football Scores app!";
                break;
            case R.id.library:
                // do something else
                mystring = "This will launch my Library app!";
                break;
            case R.id.build_big:
                // do something else
                mystring = "This will launch my Build-it-Big app!";
                break;
            case R.id.xyz_read:
                // do something else
                mystring = "This will launch my XYZ reader app!";
                break;
            case R.id.capstone:
                // do something else
                mystring = "This will launch my capstone app!";
                break;
            default: mystring = "Add Java Code for Toast! Cheers!";
                break;
        }
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, mystring, duration);
        toast.show();
    }
}
