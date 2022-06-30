package com.city.cityjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListaCidades extends AppCompatActivity {

RecyclerView recyclerView;
List<Model> list=new ArrayList<>();
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addData();
        setContentView(R.layout.activity_lista_cidades);

        recyclerView=findViewById(R.id.recyclerView);
        Objects.requireNonNull(getSupportActionBar()).hide();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter =new Adapter(this,list,list.size());
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
   list.add(new Model(R.drawable.brasilia,"Brasilia","Brasil"));
   list.add(new Model(R.drawable.recife,"Recife","Pernambuco-Brasil"));
   list.add(new Model(R.drawable.curitiba,"Curitiba","Paraná-Brasil"));
   list.add(new Model(R.drawable.salvador,"Salvador","Bahia-Brasil"));
   list.add(new Model(R.drawable.sao_paulo,"São Paulo","São Paulo-Brasil"));
   list.add(new Model(R.drawable.rio,"Rio de Janeiro","Rio de Janeiro-Brasil"));
   list.add(new Model(R.drawable.porto_alegre,"Porto Alegre"," Rio Grande do Sul-Brasil"));
   list.add(new Model(R.drawable.fortaleza,"Fortaleza","Ceara-Brasil"));
   list.add(new Model(R.drawable.minas,"Belo Horizonte","Minas Gerais-Brasil"));
   list.add(new Model(R.drawable.manaus,"Manaus","Amazonas-Brasil"));
    }

}