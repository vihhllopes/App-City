package com.city.cityjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class FormCadastro extends AppCompatActivity {

    private EditText edit_nome, edit_email, edit_senha, edit_telefone, edit_idade;
    private Button bt_proximo;
    String[] mensagens = {"Preencha Todos os Campos!", "Cadastro Realizado"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formcadastro);
        Objects.requireNonNull(getSupportActionBar()).hide();

        edit_senha = (EditText) findViewById(R.id.edit_senha);
        bt_proximo = (Button) findViewById(R.id.bt_proximo);

        IniciarComponentes();

        bt_proximo.setOnClickListener(view -> {
            String nome = edit_nome.getText().toString();
            String email = edit_email.getText().toString();
            String senha = edit_senha.getText().toString();
            String telefone = edit_telefone.getText().toString();
            String idade = edit_idade.getText().toString();

            if(nome.isEmpty() || email.isEmpty() || senha.isEmpty() || telefone.isEmpty() || idade.isEmpty()){
                Snackbar snackbar = Snackbar.make(view,mensagens[0], Snackbar.LENGTH_SHORT);
                snackbar.setBackgroundTint(Color.BLACK);
                snackbar.setTextColor(Color.WHITE);
                snackbar.show();
            }else{
                if (edit_senha.length() < 6 ||
                    edit_senha.length() > 175) {

                edit_senha.setError("Senha precisa ter mais de 5 caracteres");

                edit_senha.requestFocus();
            } else {
                    Intent intent = new Intent(FormCadastro.this,TermosUso.class);
                    startActivity(intent);
            }
            }


        });



    }


    private void IniciarComponentes(){
        edit_nome = findViewById(R.id.edit_nome);
        edit_email =  findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        edit_telefone = findViewById(R.id.edit_telefone);
        edit_idade = findViewById(R.id.edit_idade);
        bt_proximo = findViewById(R.id.bt_proximo);
    }
}