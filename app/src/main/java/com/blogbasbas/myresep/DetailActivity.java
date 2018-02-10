package com.blogbasbas.myresep;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.myresep.helper.MyConstant;
import com.blogbasbas.myresep.helper.MyFunction;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends MyFunction {

    @BindView(R.id.imgmakanan)
    ImageView imgmakanan;
    @BindView(R.id.txtnama)
    TextView txtnama;
    @BindView(R.id.txtdetail)
    TextView txtdetail;
    String id,nama,detail,gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        Intent terima = getIntent();
        //tambahan
         id = getIntent().getStringExtra("id");
         nama = getIntent().getStringExtra("nm");
         detail = getIntent().getStringExtra("i");
         gambar = getIntent().getStringExtra("gb");

        txtnama.setText(nama);
        // Hehe
        txtdetail.setText(detail);
        Picasso.with(con).load(MyConstant.IMAGE_URL+gambar).
                error(R.mipmap.ic_launcher).into(imgmakanan);

    }


    //tambahan
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idd = item.getItemId();
        if (idd==R.id.idUpdateDelete){
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("ID",id);
            intent.putExtra("NAMA",nama);
            intent.putExtra("DETAIL",detail);
            intent.putExtra("GAMBAR",gambar);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
}
}
