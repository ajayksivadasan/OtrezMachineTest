package com.aks.otrez_machine_test.home;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class HomeItemModel {
    @SerializedName("nItemGrpId")
    private int nItemGrpId;
    @SerializedName("cGrpName")
    private String cGrpName;
    @SerializedName("cGroupImage")
    private String cGroupImage;

    public static HomeItemModel objectFromData(String str) {

        return new Gson().fromJson(str, HomeItemModel.class);
    }

    public int getNItemGrpId() {
        return nItemGrpId;
    }

    public void setNItemGrpId(int nItemGrpId) {
        this.nItemGrpId = nItemGrpId;
    }

    public String getCGrpName() {
        return cGrpName;
    }

    public void setCGrpName(String cGrpName) {
        this.cGrpName = cGrpName;
    }

    public String getCGroupImage() {
        return cGroupImage;
    }

    public void setCGroupImage(String cGroupImage) {
        this.cGroupImage = cGroupImage;
    }
}
