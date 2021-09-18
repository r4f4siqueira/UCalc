package com.example.ucalc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = findViewById(R.id.lvResultados);
        atualiza();
    }

    public void calcular(View view){
        Intent it = new Intent(this, segunda.class);
        startActivityForResult(it,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        atualiza();
    }

    private void atualiza(){
        if(adapter==null){
            adapter= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,Dados.getLista());
            lista.setAdapter(adapter);
        }
        else {
            adapter.notifyDataSetChanged();
        }
    }
}