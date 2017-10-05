package com.example.ade.makananresepku;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ADE on 10/4/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    //deklarasi variable context

    private final Context context;

    String [] name={"Kepiting","Nasgor","Semur","Salad","capcay","terongbalado"};
    String [] deskripsi={"Menu seafood yang kerap menjadi incaran para pecinta kuliner salah satunya ialah kepiting saus tiram",
            "Nasi goreng rumahan dengan citarasa yang enak, gurih akan tetapi dalam pembuatannya simpel dan juga praktis dapat anda hadirkan di tengah keluarga anda.",
            "Alternatif lain dari olahan semur adalah semur jengkol. Semur jengkol merupakan varian semur menggunakan bahan dasar jengkol.",
            "Salad biasanya kita makan sebelum makan hidangan utama. Selain segar, salad juga bisa bikin kita merasakan rasa kenyang yang pas.",
            "Ingin menikmati berbagai macam sayuran dalam satu piring? Capcay goreng bakso bisa dijadikan menu piliha Anda. Sayur-sayuran sangat baik untuk kesehan Anda dan kelezatan bakso juga bisa Anda nikmati.",
            "Satu buah terong ungu bisa Anda olah dengan kelezatan yang oke punya"};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    Integer [] gambar={R.drawable.kepiting,R.drawable.nasgor,R.drawable.semur,R.drawable.tortellinisalad,R.drawable.capcay,R.drawable.terongbalado};
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.tampilanrecycle, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);

        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(gambar[position]);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Bundle b = new Bundle();

            // mengeset gambar ke bundle
            b.putInt("gambar",gambar[position]);
            b.putString("label","Resep "+name[position]);


            Intent intent = new Intent(context , DetailkuActivity.class);
            intent.putExtras(b);
            context.startActivity(intent);


            //Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();


        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
