package com.example.lista_de_compras.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lista_de_compras.Clases.lista;
import com.example.lista_de_compras.Clases.objeto;
import com.example.lista_de_compras.R;

import java.util.ArrayList;

public class CrearLista extends Fragment {

    Button button;
    EditText editText;

   public lista lista=new lista();
    ArrayList<lista>listas_de_Listas=new ArrayList<>();

    @Nullable
    @Override



    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.crearlista_fragment,container,false);
        listas_de_Listas.add(new lista("lista 1"));
        button=(Button) view.findViewById(R.id.button_crear);
        editText=(EditText)view.findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    crearNuevaLista(v,editText.getText().toString());

            }
        });
        return view;
    }


    public void crearNuevaLista(View view,String s){

        if(listas_de_Listas.size()<3){
            lista =new lista(s);
            listas_de_Listas.add(lista);
        }else{
            Toast toast=Toast.makeText(view.getContext(),"Maximo de Listas Creadas",Toast.LENGTH_SHORT);
        }

    }


}
