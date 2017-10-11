package com.blogbasbas.myresep;

import android.content.Intent;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        Intent terima = getIntent();
        txtnama.setText(terima.getStringExtra("nm"));

        txtdetail.setText(terima.getStringExtra("i"));
        Picasso.with(con).load(MyConstant.IMAGE_URL+terima.getStringExtra("gb")).
                error(R.mipmap.ic_launcher).into(imgmakanan);

    }
}
