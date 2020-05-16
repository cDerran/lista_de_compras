package com.example.lista_de_compras.Clases;

public class objeto {
    String cosa;
    boolean comprobar=false;


    public objeto(String cosa) {
        this.cosa=cosa;
    }

    public void tachar(){
        comprobar=true;
    }

    public String getCosa() {
        return cosa;
    }

}
