package com.blogbasbas.myresep.network;


import com.blogbasbas.myresep.model.ModelResep;
import com.blogbasbas.myresep.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Server on 18/08/2017.
 */

public interface RestAPI {
    //ngambil respon dari GSON
    @GET("getdataresep")
    Call<ModelResep> getResep();

    @FormUrlEncoded
    @POST("insert.php")
    Call<ResponseModel> insertData(@Field("nama_resep") String nama,
                                   @Field("detail") String detail,
                                   @Field("gambar") String gambar);
    //update menggunakan 3 parameter
    @FormUrlEncoded
    @POST("update.php")
    Call<ResponseModel> updateData( @Field("id_resep") String id,
                                    @Field("nama_resep") String nama,
                                    @Field("detail") String detail,
                                    @Field("gambar") String gambar);
    //delete menggunakan parameter id
    @FormUrlEncoded
    @POST("delete.php")
    Call<ResponseModel> deleteData(@Field("id_resep") String id);
    
        //delete menggunakan parameter id for new delete
    @FormUrlEncoded
    @POST("delete_new.php")
    Call<ResponseModel> deleteNewData(@Field("id_resep") String id);
}
