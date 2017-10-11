package com.blogbasbas.myresep.network;


import com.blogbasbas.myresep.model.ModelResep;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Server on 18/08/2017.
 */

public interface RestAPI {
    //ngambil respon dari GSON
    @GET("getdataresep")
    Call<ModelResep> getResep();
}
