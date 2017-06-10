package com.example.perco1.listadoconreclycler;

/**
 * Created by PERCO1 on 09/06/2017.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.DatosViewModel> {
    List<Datos> listadatos;

    public Adaptador(List<Datos> listadatos) {
        this.listadatos = listadatos;
    }

    @Override
    public DatosViewModel onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        DatosViewModel model=new DatosViewModel(v);
        return model;
    }

    @Override
    public void onBindViewHolder(DatosViewModel holder, int position) {
        holder.imgDatos.setImageResource(listadatos.get(position).getFoto());
        holder.txtjugador.setText(listadatos.get(position).getNombre());
        holder.txtdireccion.setText(listadatos.get(position).getDireccion());
    }

    @Override
    public int getItemCount() {
        return listadatos.size();
    }

    public static class DatosViewModel extends RecyclerView.ViewHolder{

        ImageView imgDatos;
        TextView txtjugador,txtdireccion;
        public DatosViewModel(View itemView) {
            super(itemView);
            imgDatos= (ImageView) itemView.findViewById(R.id.imageView);
            txtjugador = (TextView) itemView.findViewById(R.id.txtnombre);
            txtdireccion = (TextView) itemView.findViewById(R.id.txtdireccion);
        }
    }
}
