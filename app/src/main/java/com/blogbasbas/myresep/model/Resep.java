
package com.blogbasbas.myresep.model;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Resep {

    @SerializedName("detail1")
    private String mDetail1;
    @SerializedName("gambar1")
    private String mGambar1;
    @SerializedName("id_resep1")
    private String mIdResep1;
    @SerializedName("nama_resep1")
    private String mNamaResep1;

    public String getDetail1() {
        return mDetail1;
    }

    public void setDetail1(String detail1) {
        mDetail1 = detail1;
    }

    public String getGambar1() {
        return mGambar1;
    }

    public void setGambar1(String gambar1) {
        mGambar1 = gambar1;
    }

    public String getIdResep1() {
        return mIdResep1;
    }

    public void setIdResep1(String idResep1) {
        mIdResep1 = idResep1;
    }

    public String getNamaResep1() {
        return mNamaResep1;
    }

    public void setNamaResep1(String namaResep1) {
        mNamaResep1 = namaResep1;
    }

}
