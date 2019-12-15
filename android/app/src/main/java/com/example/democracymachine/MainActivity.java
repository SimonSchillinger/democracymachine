package com.example.democracymachine;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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


    }

}


