package com.example.lista_de_compras.Clases;

import java.util.ArrayList;

public class lista {
    String nombre_de_la_lista;
    ArrayList<objeto>ListaDeCosas;

    public lista(String nombre_de_la_lista) {
        this.nombre_de_la_lista = nombre_de_la_lista;
        ListaDeCosas = new ArrayList<>();
        ListaDeCosas.add(new objeto("aceite"));
        ListaDeCosas.add(new objeto("cereal"));
        ListaDeCosas.add(new objeto("fideos"));
        ListaDeCosas.add(new objeto("arroz"));
        ListaDeCosas.add(new objeto("salsa"));

    }
    public lista(){

    }
    public ArrayList<objeto> Lista_de_cosas(){

        return ListaDeCosas;
    }
}
