package com.blogbasbas.myresep;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.blogbasbas.myresep.adapter.RecylerViewAdapter;
import com.blogbasbas.myresep.helper.MyConstant;
import com.blogbasbas.myresep.helper.MyFunction;
import com.blogbasbas.myresep.model.ModelResep;
import com.blogbasbas.myresep.model.Resep;
import com.blogbasbas.myresep.network.RestAPI;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResepActivity extends MyFunction {

    @BindView(R.id.listresep)
    RecyclerView listresep;
    RecyclerView.LayoutManager layoutManager;
    //membuat variabel datamakan menggunakn List (untuk menampung data)
    List<Resep> dataresep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep);
        ButterKnife.bind(this);

        //layoutManager = new GridLayoutManager(con,2);
        layoutManager = new LinearLayoutManager(con);
        //id dari recylerfivew
        listresep.setLayoutManager(layoutManager);

        //method menampilkan data
        getDatamakanan();
    }

    private void getDatamakanan() {

        //inisialisasi retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL) //ke url java MyCOnstant
                .addConverterFactory(GsonConverterFactory.create())//diconvert
                .build();//dibuild

        RestAPI api = retrofit.create(RestAPI.class);
        //ngecal
        Call<ModelResep> modelResepCall = api.getResep();
        modelResepCall.enqueue(new Callback<ModelResep>() {
            @Override
            public void onResponse(Call<ModelResep> call, Response<ModelResep> response) {
                String pesan =  response.body().getPesan();
                String sukses = response.body().getSukses();

                if (sukses.equals("true")){
                    pesan(pesan);
                    Log.d("  Retrofit "," Berhasil dapatkan " +pesan);
                    Log.d("  Retrofit "," Berhasil dapatkan " +sukses);

                    dataresep =  response.body().getResep();
                    //showdata makanan
                    tampildatamakanan();

                } else {
                    pesan(pesan);
                }
            }

            @Override
            public void onFailure(Call<ModelResep> call, Throwable t) {

            }
        });

    }

    private void tampildatamakanan() {

        String items []= new String[dataresep.size()];
        for (int i=0;i<dataresep.size();i++){
            items[i]=dataresep.get(i).getNamaResep1();
        }
        RecylerViewAdapter adapter = new RecylerViewAdapter(con, dataresep);
        listresep.setAdapter(adapter);
    }
}
