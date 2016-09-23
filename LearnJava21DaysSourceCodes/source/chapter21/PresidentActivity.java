/* Solution to Chapter 21, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */
   
package com.java21days.president;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santa);
    }

    public void processClicks(View display) {
        Intent action = null;
        int id = display.getId();

        switch (id) {
            case (R.id.imageButton):
                action = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:202-456-1111"));
                break;
            case (R.id.imageButton2):
                action = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.whitehouse.gov/"));
                break;
            case (R.id.imageButton3):
                action = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:0,0?q=1600 Pennsylvania Ave NW, Washington, DC 20500"));
                    break;
            default:
                break;
            }
        startActivity(action);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_santa, menu);
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
