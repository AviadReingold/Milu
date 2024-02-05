package com.example.hackatonmilu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    public android.widget.Button btnDeals,btnHelp,btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnDeals=(android.widget.Button) findViewById(R.id.btnDeals);
       btnDeals.setOnClickListener(this);

       btnHelp=(android.widget.Button) findViewById(R.id.btnHelp);
       btnHelp.setOnClickListener(this);

       btnCalc=(android.widget.Button) findViewById(R.id.btnCalc);
       btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (btnDeals.getId()==view.getId())
        {
            Intent intent;
            intent =new Intent(this, Deals_acticity.class);
            startActivity(intent);
        }
    }
}