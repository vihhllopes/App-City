package com.city.cityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class TermosUso extends AppCompatActivity {

    boolean camposValidos;
    private Button bt_validacao;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termos_uso);
        getSupportActionBar().hide();

        checkBox = findViewById(R.id.checkBox);
        bt_validacao=findViewById(R.id.bt_validacao);

        bt_validacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                camposValidos = true;

                if(!checkBox.isChecked()){
                    checkBox.setError("aceite os termos de uso");
                    checkBox.requestFocus();

                    camposValidos = false;
                }

                if(camposValidos){
                   showAlerta("Seus dados foram salvos!");
                    Intent intent = new Intent(TermosUso.this,ListaCidades.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void showAlerta(String mensagem) {

        Toast.makeText(getBaseContext(),
                mensagem,
                Toast.LENGTH_LONG).show();

    }
}