package com.blogbasbas.myresep.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.blogbasbas.myresep.DetailActivity;
import com.blogbasbas.myresep.R;
import com.blogbasbas.myresep.helper.MyConstant;
import com.blogbasbas.myresep.model.Resep;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Server on 25/09/2017.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyHolder> {
    //buat variabel
    Context con;
    List <Resep> data_resep;
    //buat constructor dari variabel diatas
    public RecylerViewAdapter(Context con, List<Resep> data_resep) {
        this.con = con;
        this.data_resep = data_resep;
    }

    //membuat view baru untuk menampung data
    @Override
    public RecylerViewAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tampilancustomresep,parent,false);
        MyHolder holder = new MyHolder(v);


        return holder;
    }


    @Override
    public void onBindViewHolder(RecylerViewAdapter.MyHolder holder, final int position) {
        holder.txtnama.setText(data_resep.get(position).getNamaResep1());
        Picasso.with(con).load(MyConstant.IMAGE_URL+data_resep.get(position).getGambar1()).error(R.mipmap.ic_launcher)
                .into(holder.imgMakanan);

        //event click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirim = new Intent(con, DetailActivity.class);
                //tambaahan
                kirim.putExtra("id",data_resep.get(position).getIdResep1());

                kirim.putExtra("nm",data_resep.get(position).getNamaResep1());
                kirim.putExtra("gb",data_resep.get(position).getGambar1());
                kirim.putExtra("i",data_resep.get(position).getDetail1());
                con.startActivity(kirim);
            }
        });
    }


    @Override
    public int getItemCount() {
        return data_resep.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imgMakanan ;
        TextView txtnama;
        public MyHolder(View itemView) {
            super(itemView);
            imgMakanan = (ImageView) itemView.findViewById(R.id.imgmakanan);
            txtnama = (TextView) itemView.findViewById(R.id.txtnama);
        }
    }
}
