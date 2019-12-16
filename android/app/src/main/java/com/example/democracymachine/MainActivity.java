package com.example.democracymachine;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    BluetoothAdapter mBluetoothAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Items initialization
        Button btnFindRaspi     = (Button) findViewById(R.id.findRaspi);
        Button btnStartMachine  = (Button) findViewById(R.id.startMachine);

        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        //ClickListener
        btnFindRaspi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toastMsg("find Raspi");
                findRaspi();
            }
        });

        btnStartMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "start Machine",Toast.LENGTH_LONG).show();
            }
        });


    }

    // Functions
    public void toastMsg(String msg) {

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();

    }

    public void findRaspi() {
        if(mBluetoothAdapter == null){
            Log.d(TAG, "findRaspi(): no BluetoothAdapter found");
        }
        if(!mBluetoothAdapter.isEnabled()){
            Intent enableBTIntent = new Intent( BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivity(enableBTIntent);
        }
        if(mBluetoothAdapter.()){

        }
    }

}


