package com.example.eventosbotones.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eventosbotones.Eventos.Operaciones;
import com.example.eventosbotones.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText txt1,txt2;
    String resultado;
    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.txt);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
    }

    public void Evento(View view) {
        if(txt1.getText().length()==0 || txt2.getText().length()==0){
            Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show();
        }else{
            float x=Float.parseFloat(txt1.getText().toString());
            float y=Float.parseFloat(txt2.getText().toString());

            Operaciones operaciones=new Operaciones(x,y);

            switch (view.getId()){
                case R.id.btnSuma:
                    resultado=df.format(operaciones.Suma());
                    break;
                case R.id.btnResta:
                    resultado=df.format(operaciones.Resta());
                    break;
                case R.id.btnMulti:
                    resultado=df.format(operaciones.Mulriplicacion());
                    break;
                case R.id.btnDiv:
                    resultado=df.format(operaciones.Division());
                    break;
            }
            textView.setText("El resultado es : "+resultado);
        }

    }
}
