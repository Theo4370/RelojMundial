package com.example.relojmundial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TerceraActivity extends AppCompatActivity {

    private TextView horaChina;
    private TextView minutoChina;
    private TextView AMPMChina;
    private TextView horaFrancia;
    private TextView minutoFrancia;
    private TextView AMPMFrancia;
    private TextView horaSudafrica;
    private TextView minutoSudafrica;
    private TextView AMPMSudafrica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        horaChina = findViewById(R.id.terceraActivity_horaChina);
        minutoChina = findViewById(R.id.terceraActivity_minutoChina);
        AMPMChina = findViewById(R.id.terceraActivity_AMFMChina);
        horaFrancia = findViewById(R.id.terceraActivity_horaFrancia);
        minutoFrancia = findViewById(R.id.terceraActivity_minutoFrancia);
        AMPMFrancia = findViewById(R.id.terceraActivity_AMFMFrancia);
        horaSudafrica = findViewById(R.id.terceraActivity_horaSudafrica);
        minutoSudafrica = findViewById(R.id.terceraActivity_minutoSudafrica);
        AMPMSudafrica = findViewById(R.id.terceraActivity_AMFMCSudafrica);

        Intent horaEnviada = getIntent();
        Bundle horaRecibida = horaEnviada.getExtras();

String horaString = horaEnviada.getStringExtra("horaIngresada");
Integer horaInteger = Integer.parseInt(horaString);

    }
}
