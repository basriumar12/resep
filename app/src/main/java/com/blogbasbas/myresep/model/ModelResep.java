
package com.blogbasbas.myresep.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


@SuppressWarnings("unused")
public class ModelResep {

    @SerializedName("pesan")
    private String mPesan;
    @SerializedName("resep")
    private List<Resep> mResep;
    @SerializedName("sukses")
    private String mSukses;

    public String getPesan() {
        return mPesan;
    }

    public void setPesan(String pesan) {
        mPesan = pesan;
    }

    public List<Resep> getResep() {
        return mResep;
    }

    public void setResep(List<Resep> resep) {
        mResep = resep;
    }

    public String getSukses() {
        return mSukses;
    }

    public void setSukses(String sukses) {
        mSukses = sukses;
    }

}
