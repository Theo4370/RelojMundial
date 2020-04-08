package com.example.relojmundial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {


    private TextView hora;
    private TextView minuto;
    private Button botonSumarHora;
    private Button botonRestarHora;
    private Button botonSumarMinuto;
    private Button botonRestarMinuto;
    private TextView AMPM;
    private Button botonAceptarHorario;

    private Integer contadorHora;
    private Integer contadorMinuto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        contadorHora = 0;
        contadorMinuto = 0;
        hora = findViewById(R.id.SegundaActivity_textViewHora);
        minuto = findViewById(R.id.SegundaActivity_textViewMinuto);
        botonSumarHora = findViewById(R.id.SegundaActivity_botonSumarHora);
        botonRestarHora = findViewById(R.id.SegundaActivity_botonRestarHora);
        botonSumarMinuto = findViewById(R.id.SegundaActivity_botonSumarMinuto);
        botonRestarMinuto = findViewById(R.id.segundaActivity_botonRestarMinuto);
        AMPM = findViewById(R.id.SegundaActivity_textViewAMPM);
        botonAceptarHorario = findViewById(R.id.botonAceptarHorario);

        botonSumarHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contadorHora < 11) {
                    contadorHora = contadorHora + 1;
                    hora.setText(contadorHora.toString());
                } else {
                    contadorHora = 0;
                    hora.setText("0");
                }
            }
        });

        botonRestarHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contadorHora > 0) {
                    contadorHora = contadorHora - 1;
                    hora.setText(contadorHora.toString());
                } else {
                    contadorHora = 11;
                    hora.setText("11");
                }

            }
        });

        botonSumarMinuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contadorMinuto < 59) {
                    contadorMinuto = contadorMinuto + 1;
                    minuto.setText(contadorMinuto.toString());
                } else {
                    contadorMinuto = 0;
                    minuto.setText("0");

                }

            }
        });

        botonRestarMinuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contadorMinuto > 0) {
                    contadorMinuto = contadorMinuto - 1;
                    minuto.setText(contadorMinuto.toString());
                } else {
                    contadorMinuto = 59;
                    minuto.setText("59");

                }
            }
        });

        AMPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AMPM.getText().toString().equals("AM")) {
                    AMPM.setText("PM");
                } else {
                    AMPM.setText("AM");
                }


            }
        });

        botonAceptarHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasarATerceraActividad = new Intent(SegundaActivity.this, TerceraActivity.class);

                Bundle horarioAPasar = new Bundle();
                horarioAPasar.putString("horaIngresada", hora.getText().toString());
                horarioAPasar.putString("minutoIngresado", minuto.getText().toString());
                horarioAPasar.putString("AMPM", AMPM.getText().toString());

                pasarATerceraActividad.putExtras(horarioAPasar);
                startActivity(pasarATerceraActividad);

            }
        });


    }
}
