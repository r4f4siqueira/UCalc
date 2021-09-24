package com.example.ucalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    private TextView numeros;
    private Float n1=null;
    private Float n2=null;
    private Integer opc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        numeros=findViewById(R.id.tvnumeros);
    }

    public void btAC(View view){
        numeros.setText("");
        n1=null;
        n2=null;
        opc=0;
    }

    public void btMais(View view){
        n1=Float.parseFloat(numeros.getText().toString());
        numeros.setText("");
        opc=1;
    }

    public void btMenos(View view){
        n1=Float.parseFloat(numeros.getText().toString());
        numeros.setText("");
        opc=2;
    }

    public void btDivide(View view){
        n1=Float.parseFloat(numeros.getText().toString());
        numeros.setText("");
        opc=3;
    }

    public void btMultiplica(View view){
        n1=Float.parseFloat(numeros.getText().toString());
        numeros.setText("");
        opc=4;
    }

    public void btIgual(View view){
        if((n1==null) && (n2==null)) {
            numeros.setText("");
            //Dados.salvar("null");
        }
        else {
            if (n2==null){
                n2 = Float.parseFloat(numeros.getText().toString());
            }
        }
        switch (opc){
            case 1:
                numeros.setText((n1+n2)+"");
                Dados.salvar(n1+"+"+n2+"="+(n1+n2));
                n1=n1+n2;
                break;
            case 2:
                numeros.setText((n1-n2)+"");
                Dados.salvar(n1+"-"+n2+"="+(n1-n2));
                n1=n1-n2;
                break;
            case 3:
                numeros.setText((n1/n2)+"");
                Dados.salvar(n1+"/"+n2+"="+(n1/n2));
                n1=n1/n2;
                break;
            case 4:
                numeros.setText((n1*n2)+"");
                Dados.salvar(n1+"x"+n2+"="+(n1*n2));
                n1=n1*n2;
                break;
            default: break;
        }
    }


    public void bt0(View view){
        numeros.setText(numeros.getText()+"0");
        //nome.setText(cursor.getString(0));
    }

    public void bt1(View view){
        numeros.setText(numeros.getText()+"1");
        //nome.setText(cursor.getString(0));
    }

    public void bt2(View view){
        numeros.setText(numeros.getText()+"2");
        //nome.setText(cursor.getString(0));
    }

    public void bt3(View view){
        numeros.setText(numeros.getText()+"3");
        //nome.setText(cursor.getString(0));
    }

    public void bt4(View view){
        numeros.setText(numeros.getText()+"4");
        //nome.setText(cursor.getString(0));
    }

    public void bt5(View view){
        numeros.setText(numeros.getText()+"5");
        //nome.setText(cursor.getString(0));
    }
    public void bt6(View view){
        numeros.setText(numeros.getText()+"6");
        //nome.setText(cursor.getString(0));
    }

    public void bt7(View view){
        numeros.setText(numeros.getText()+"7");
        //nome.setText(cursor.getString(0));
    }

    public void bt8(View view){
        numeros.setText(numeros.getText()+"8");
        //nome.setText(cursor.getString(0));
    }

    public void bt9(View view){
        numeros.setText(numeros.getText()+"9");
        //nome.setText(cursor.getString(0));
    }
}