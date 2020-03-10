package com.unisc.pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("log", "Evento OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("log", "Evento OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("log", "Evento OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("log", "Evento OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("log", "Evento OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Log", "Evento OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("log", "Evento OnDestroy");
    }

    public void btn_novaTela(View view){
        Intent intent = new Intent(this, Aula1Activity.class);
        startActivity(intent);
    }

}
