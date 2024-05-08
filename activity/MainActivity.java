package com.example.agende_comview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.agende_comview.R;
import com.example.agende_comview.fragment.FragmentDatePicker;
import com.example.agende_comview.fragment.FragmentTimePicker;

public class MainActivity extends AppCompatActivity {

    private Button buttonData;
    private Button buttonHora;
    private EditText editTextDescricao;

    private String dataSelecionada = "";
    private String horaSelecionada = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonData = findViewById(R.id.data);
        buttonHora = findViewById(R.id.hora);
        editTextDescricao = findViewById(R.id.editTextDescricao);


        findViewById(R.id.buttonOk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String descricao = editTextDescricao.getText().toString();

                // Imprime os valores no terminal
                Log.d("MainActivity", "Data: " + dataSelecionada);
                Log.d("MainActivity", "Hora: " + horaSelecionada);
                Log.d("MainActivity", "Descrição: " + descricao);
            }
        });
    }


    public void mostraDialogoDatePicker(View v) {
        DialogFragment newFragment = new FragmentDatePicker();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void mostraDialogoTimePicker(View v) {
        DialogFragment newFragment = new FragmentTimePicker();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }
}
