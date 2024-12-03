package com.trabalhos.verificamenormaior;
import Controller.Controller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtTitulo;
    private EditText num1;
    private EditText num2;
    private Button btnVerifica;
    private Button btnCalcula;
    private TextView resVerifica;
    private TextView resCalcula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


Controller metodo = new Controller();

num1 = findViewById(R.id.txtN1);
num2 = findViewById(R.id.txtN2);
btnVerifica = findViewById(R.id.btnVerifica);
btnCalcula = findViewById(R.id.btnCalcula);
resVerifica = findViewById(R.id.resVerifica);
resCalcula = findViewById(R.id.resCalcula);

btnVerifica.setOnClickListener(x -> resVerifica.setText(metodo.verificaMaiorMenor(num1, num2)));
btnCalcula.setOnClickListener(x -> resCalcula.setText(metodo.calcular(num1, num2)));

    }

}