package com.example.relojmundial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button botonIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonIngresar = findViewById(R.id.botonIngresar);

botonIngresar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent pasarASegundaActividad = new Intent(MainActivity.this, SegundaActivity.class);
        startActivity(pasarASegundaActividad);
    }
});

    }
}
