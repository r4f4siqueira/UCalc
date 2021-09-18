package com.example.ucalc;

import java.util.LinkedList;
import java.util.List;

public class Dados {
    private static final List dados = new LinkedList();
    private Dados(){}
    public static void salvar(String resultado){
        dados.add(resultado);
    }
    public static List getLista(){
        return dados;
    }
}