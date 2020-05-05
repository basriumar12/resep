package com.blogbasbas.myresep;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.blogbasbas.myresep.model.ResponseModel;
import com.blogbasbas.myresep.network.RestAPI;
import com.blogbasbas.myresep.network.RetroServer;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @BindView(R.id.pd)
    ProgressBar pd;
    @BindView(R.id.btn_insertdata)
    Button btnInsertdata;
    @BindView(R.id.btntampildata)
    Button btntampildata;
    @BindView(R.id.btnUpdate)
    Button btnUpdate;
    @BindView(R.id.btnhapus)
    Button btnhapus;
    @BindView(R.id.edt_nama)
    EditText edtNama;
    @BindView(R.id.edt_gambar)
    EditText edtGambar;
    @BindView(R.id.edtResep)
    EditText edtResep;
    String idData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnhapus = findViewById(R.id.btnhapus);
        btnInsertdata = findViewById(R.id.btn_insertdata);
        btntampildata = findViewById(R.id.btntampildata);
        btnUpdate = findViewById(R.id.btnUpdate);
        edtGambar = findViewById(R.id.edt_gambar);
        edtNama = findViewById(R.id.edt_nama);
        edtResep = findViewById(R.id.edtResep);
        pd = findViewById(R.id.pd);
        Intent getData = getIntent();
        idData = getData.getStringExtra("ID");
        if (idData != null) {
            btnInsertdata.setVisibility(View.GONE);
            btntampildata.setVisibility(View.GONE);
            btnhapus.setVisibility(View.VISIBLE);
            btnUpdate.setVisibility(View.VISIBLE);
            edtNama.setText(getData.getStringExtra("NAMA"));
            edtGambar.setText(getData.getStringExtra("GAMBAR"));
            edtResep.setText(getData.getStringExtra("DETAIL"));

        }

        btnUpdate.setOnClickListener(this);
        btntampildata.setOnClickListener(this);
        btnInsertdata.setOnClickListener(this);
        btnhapus.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_insertdata:
                String snama = edtNama.getText().toString();
                String sgambar = edtGambar.getText().toString();
                String sresep = edtResep.getText().toString();
                if (snama.isEmpty() ) {
                    edtNama.setError("nama perlu di isi");
                }else if (sgambar.isEmpty()){
                    edtGambar.setError("gambar perlu di isi");}
                else if (sresep.isEmpty()){
                    edtResep.setError("detail resep perlu di isi");
                } else {
                    RestAPI api = RetroServer.getClient().create(RestAPI.class);
                    Call<ResponseModel> insertResep = api.insertData(snama,sresep,sgambar);
                    insertResep.enqueue(new Callback<ResponseModel>() {
                        @Override
                        public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {

                            try {


                                String kode = response.body().getKode();
                                if (kode.equals("1")){
                                    Toast.makeText(MainActivity.this, "berhasil simpan", Toast.LENGTH_SHORT).show();
                                    edtGambar.setText("");
                                    edtNama.setText("");
                                    edtResep.setText("");
                                    startActivity(new Intent(MainActivity.this, ResepActivity.class));
                                    finish();
                                }else {
                                    Toast.makeText(MainActivity.this, "data error, gagal simpan", Toast.LENGTH_SHORT).show();
                                }
                            }catch (NullPointerException e){
                                Toast.makeText(MainActivity.this, "errror"+e.toString(), Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ResponseModel> call, Throwable t) {

                        }
                    });
                }

                break;
            case R.id.btntampildata:
                startActivity(new Intent(this, ResepActivity.class));
                break;
            case R.id.btnUpdate:

                RestAPI api = RetroServer.getClient().create(RestAPI.class);
                Call<ResponseModel> updateData =
                        api.updateData(idData,
                                edtNama.getText().toString(),
                                edtGambar.getText().toString(),
                                edtResep.getText().toString());

                updateData.enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        // nambah ini juga
                        startActivity(new Intent(MainActivity.this, ResepActivity.class));
                        finish();
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "gagal"+t.toString(), Toast.LENGTH_SHORT).show();
                        Log.d("", "onFailure: "+t.toString());
                    }
                });


                break;
            case R.id.btnhapus:
                RestAPI apidata = RetroServer.getClient().create(RestAPI.class);
                Call<ResponseModel> del  = apidata.deleteData(idData);
                del.enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        startActivity(new Intent(MainActivity.this, ResepActivity.class));
                        finish();
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });
                break;
        }

    }
}
