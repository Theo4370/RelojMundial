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
        String minutoString = horaEnviada.getStringExtra("minutoIngresado");
        String AMPM = horaEnviada.getStringExtra("AMPM");

        Integer minutoInteger = Integer.parseInt(minutoString);
        Integer horaInteger = Integer.parseInt(horaString);

        minutoSudafrica.setText(" : " + minutoString);
        minutoFrancia.setText(" : " + minutoString);
        minutoChina.setText(" : " + minutoString);

        Integer horaFranciaInteger = horaInteger + 4;
        Integer horaChinaInteger = horaInteger + 11;
        Integer horaSudafricaInteger = horaInteger + 5;


        if (horaFranciaInteger < 12) {
            String horaFranciaString = horaFranciaInteger.toString();
            horaFrancia.setText(horaFranciaString);
            AMPMFrancia.setText(AMPM);
        } else {
            Integer horaFranciaIntegerOtro = horaFranciaInteger - 12;
            String horaFranciaStringOtro = horaFranciaIntegerOtro.toString();
            horaFrancia.setText(horaFranciaStringOtro);
            if (AMPM.equals("AM")) {
                AMPMFrancia.setText("PM");
            } else {
                AMPMFrancia.setText("AM");
            }

        }
        if (horaChinaInteger < 12) {
            String horaChinaString = horaChinaInteger.toString();
            horaChina.setText(horaChinaString);
            AMPMChina.setText(AMPM);
        } else {
            Integer horaChinaIntegerOtro = horaChinaInteger - 12;
            String horaChinaStringOtro = horaChinaIntegerOtro.toString();
            horaChina.setText(horaChinaStringOtro);
            if (AMPM.equals("AM")) {
                AMPMChina.setText("PM");
            } else {
                AMPMChina.setText("AM");
            }

        }
        if (horaFranciaInteger < 12) {
            String horaSudafricaString = horaSudafricaInteger.toString();
            horaSudafrica.setText(horaSudafricaString);
            AMPMSudafrica.setText(AMPM);
        } else {
            Integer horaSudafricaIntegerOtro = horaSudafricaInteger - 12;
            String horaSudafricaStringOtro = horaSudafricaIntegerOtro.toString();
            horaSudafrica.setText(horaSudafricaStringOtro);
            if (AMPM.equals("AM")) {
                AMPMSudafrica.setText("PM");
            } else {
                AMPMSudafrica.setText("AM");
            }

        }
    }
}
