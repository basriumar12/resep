
package com.blogbasbas.myresep.model;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Resep {

    @SerializedName("detail")
    private String mDetail1;
    @SerializedName("gambar")
    private String mGambar1;
    @SerializedName("id_resep")
    private String mIdResep1;
    @SerializedName("nama_resep")
    private String mNamaResep1;
    @SerializedName("kode")
    private String mKode;
    @SerializedName("pesan")
    private String mPesan;

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
