package com.example.lista_de_compras.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lista_de_compras.Clases.lista;
import com.example.lista_de_compras.Clases.objeto;
import com.example.lista_de_compras.R;

import java.util.ArrayList;

public class OrdenarListas extends Fragment {
    ArrayList<ArrayList>lista_de_listas;

    public OrdenarListas() {

    }



    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        lista_de_listas=new ArrayList<>();

        View view= inflater.inflate(R.layout.ordenarlista_fragment,container,false);


        if(lista_de_listas.isEmpty()){
            mandar_mensaje(view);
        }else{
            mostrarListas(view);
        }


        return view;
    }


    public void mostrarListas(View view){
        int count =0;

        for (ArrayList i: lista_de_listas){
            count++;
            EditText editText=(EditText)view.findViewById(R.id.editText);
            Editable anterior= editText.getText();
            editText.setText(anterior+"Lista "+count+"\n");

        }

    };

    private void mandar_mensaje(View view){
        Toast toast=Toast.makeText(view.getContext(),"No hay listas creadas",Toast.LENGTH_LONG);
        toast.show();
    }

}
