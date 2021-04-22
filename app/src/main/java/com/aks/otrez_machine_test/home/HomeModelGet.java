package com.aks.otrez_machine_test.home;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeModelGet {
    /**
     * Status : success
     * Data : [{"nItemGrpId":4,"cGrpName":"EGG","cGroupImage":"/Images/1/Cluster/CL_IMG20200508104147960.jpg"},{"nItemGrpId":2,"cGrpName":"MILK & MILK PRODUCTS","cGroupImage":"/Images/1/IGroup/IGroup20200423064546058.jpg"},{"nItemGrpId":3,"cGrpName":"READY TO COOK","cGroupImage":"/Images/1/Cluster/CL_IMG20200501114104770.jpg"},{"nItemGrpId":5,"cGrpName":"READY TO EAT","cGroupImage":"/Images/1/Cluster/CL_IMG20200508115313039.jpg"}]
     * Message :
     */

    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private String Message;
    /**
     * nItemGrpId : 4
     * cGrpName : EGG
     * cGroupImage : /Images/1/Cluster/CL_IMG20200508104147960.jpg
     */

    @SerializedName("Data")
    private List<HomeItemModel> Data;

    public static HomeModelGet objectFromData(String str) {

        return new Gson().fromJson(str, HomeModelGet.class);
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public List<HomeItemModel> getData() {
        return Data;
    }

    public void setData(List<HomeItemModel> Data) {
        this.Data = Data;
    }
}
