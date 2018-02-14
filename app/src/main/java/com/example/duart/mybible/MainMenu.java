package com.example.duart.mybible;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void sendRequestClick(View view){

        Intent intent1 = new Intent( MainMenu.this, SendHTTPRequest.class );
        startActivity( intent1 );

    }

    public void inputRequestClick(View view){

        Intent intent2 = new Intent( MainMenu.this, InputHTTPRequest.class );
        startActivity( intent2 );

    }

}