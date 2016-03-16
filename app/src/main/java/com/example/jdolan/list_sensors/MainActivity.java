package com.example.jdolan.list_sensors;

/* Project to list all the Phone Sensors by jdolan
   TODO List: Fix the Menu */

import java.util.List;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myText = (TextView) this.findViewById(R.id.textView);

        SensorManager mgr = (SensorManager) getSystemService(SENSOR_SERVICE);    // nedded for all sensor use
        List<Sensor> sensors = mgr.getSensorList(Sensor.TYPE_ALL);

        StringBuilder message = new StringBuilder();
        message.append("The sensors supported by this phone are : \n");

        for (Sensor i : sensors) {        // go through the sensors list (i is the current sensor)
            message.append("Name : " + i.getName() + "\n");
        }

        myText.setText(message);

    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
*/
}

