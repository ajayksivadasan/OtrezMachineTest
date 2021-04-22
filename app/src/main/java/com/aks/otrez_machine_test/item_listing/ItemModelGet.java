package com.aks.otrez_machine_test.item_listing;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemModelGet {
    /**
     * Status : success
     * Data : [{"nItemId":310,"cItemName":"EGG SET","bCombItem":0,"cItemShName":"EGG","cItemImage":"/Images/1/invitem/310TI.jpg","bSubscription":false,"nOutletId":2,"nItemGrpId":13,"nDefUnit":5,"nItemClusterId":4,"nCompanyId":1,"bActive":true,"bCancelled":false,"nMaxOrderQtyPerDay":0,"nRate_WODisc":49,"nUnitId":5,"cUnitName":"PKT","nTSort":1,"nBalanceAmt":49,"bDiscPerc":0,"nFreeQty":0,"bFreeItems":false,"bApplyDisc":false}]
     * Message :
     */

    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private String Message;
    /**
     * nItemId : 310
     * cItemName : EGG SET
     * bCombItem : 0
     * cItemShName : EGG
     * cItemImage : /Images/1/invitem/310TI.jpg
     * bSubscription : false
     * nOutletId : 2
     * nItemGrpId : 13
     * nDefUnit : 5
     * nItemClusterId : 4
     * nCompanyId : 1
     * bActive : true
     * bCancelled : false
     * nMaxOrderQtyPerDay : 0
     * nRate_WODisc : 49
     * nUnitId : 5
     * cUnitName : PKT
     * nTSort : 1
     * nBalanceAmt : 49
     * bDiscPerc : 0
     * nFreeQty : 0
     * bFreeItems : false
     * bApplyDisc : false
     */

    @SerializedName("Data")
    private List<DataDTO> Data;

    public static ItemModelGet objectFromData(String str) {

        return new Gson().fromJson(str, ItemModelGet.class);
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

    public List<DataDTO> getData() {
        return Data;
    }

    public void setData(List<DataDTO> Data) {
        this.Data = Data;
    }

    public static class DataDTO {
        @SerializedName("nItemId")
        private int nItemId;
        @SerializedName("cItemName")
        private String cItemName;
        @SerializedName("bCombItem")
        private int bCombItem;
        @SerializedName("cItemShName")
        private String cItemShName;
        @SerializedName("cItemImage")
        private String cItemImage;
        @SerializedName("bSubscription")
        private boolean bSubscription;
        @SerializedName("nOutletId")
        private int nOutletId;
        @SerializedName("nItemGrpId")
        private int nItemGrpId;
        @SerializedName("nDefUnit")
        private int nDefUnit;
        @SerializedName("nItemClusterId")
        private int nItemClusterId;
        @SerializedName("nCompanyId")
        private int nCompanyId;
        @SerializedName("bActive")
        private boolean bActive;
        @SerializedName("bCancelled")
        private boolean bCancelled;
        @SerializedName("nMaxOrderQtyPerDay")
        private int nMaxOrderQtyPerDay;
        @SerializedName("nRate_WODisc")
        private int nRateWODisc;
        @SerializedName("nUnitId")
        private int nUnitId;
        @SerializedName("cUnitName")
        private String cUnitName;
        @SerializedName("nTSort")
        private int nTSort;
        @SerializedName("nBalanceAmt")
        private int nBalanceAmt;
        @SerializedName("bDiscPerc")
        private int bDiscPerc;
        @SerializedName("nFreeQty")
        private int nFreeQty;
        @SerializedName("bFreeItems")
        private boolean bFreeItems;
        @SerializedName("bApplyDisc")
        private boolean bApplyDisc;

        public static DataDTO objectFromData(String str) {

            return new Gson().fromJson(str, DataDTO.class);
        }

        public int getNItemId() {
            return nItemId;
        }

        public void setNItemId(int nItemId) {
            this.nItemId = nItemId;
        }

        public String getCItemName() {
            return cItemName;
        }

        public void setCItemName(String cItemName) {
            this.cItemName = cItemName;
        }

        public int getBCombItem() {
            return bCombItem;
        }

        public void setBCombItem(int bCombItem) {
            this.bCombItem = bCombItem;
        }

        public String getCItemShName() {
            return cItemShName;
        }

        public void setCItemShName(String cItemShName) {
            this.cItemShName = cItemShName;
        }

        public String getCItemImage() {
            return cItemImage;
        }

        public void setCItemImage(String cItemImage) {
            this.cItemImage = cItemImage;
        }

        public boolean isBSubscription() {
            return bSubscription;
        }

        public void setBSubscription(boolean bSubscription) {
            this.bSubscription = bSubscription;
        }

        public int getNOutletId() {
            return nOutletId;
        }

        public void setNOutletId(int nOutletId) {
            this.nOutletId = nOutletId;
        }

        public int getNItemGrpId() {
            return nItemGrpId;
        }

        public void setNItemGrpId(int nItemGrpId) {
            this.nItemGrpId = nItemGrpId;
        }

        public int getNDefUnit() {
            return nDefUnit;
        }

        public void setNDefUnit(int nDefUnit) {
            this.nDefUnit = nDefUnit;
        }

        public int getNItemClusterId() {
            return nItemClusterId;
        }

        public void setNItemClusterId(int nItemClusterId) {
            this.nItemClusterId = nItemClusterId;
        }

        public int getNCompanyId() {
            return nCompanyId;
        }

        public void setNCompanyId(int nCompanyId) {
            this.nCompanyId = nCompanyId;
        }

        public boolean isBActive() {
            return bActive;
        }

        public void setBActive(boolean bActive) {
            this.bActive = bActive;
        }

        public boolean isBCancelled() {
            return bCancelled;
        }

        public void setBCancelled(boolean bCancelled) {
            this.bCancelled = bCancelled;
        }

        public int getNMaxOrderQtyPerDay() {
            return nMaxOrderQtyPerDay;
        }

        public void setNMaxOrderQtyPerDay(int nMaxOrderQtyPerDay) {
            this.nMaxOrderQtyPerDay = nMaxOrderQtyPerDay;
        }

        public int getNRateWODisc() {
            return nRateWODisc;
        }

        public void setNRateWODisc(int nRateWODisc) {
            this.nRateWODisc = nRateWODisc;
        }

        public int getNUnitId() {
            return nUnitId;
        }

        public void setNUnitId(int nUnitId) {
            this.nUnitId = nUnitId;
        }

        public String getCUnitName() {
            return cUnitName;
        }

        public void setCUnitName(String cUnitName) {
            this.cUnitName = cUnitName;
        }

        public int getNTSort() {
            return nTSort;
        }

        public void setNTSort(int nTSort) {
            this.nTSort = nTSort;
        }

        public int getNBalanceAmt() {
            return nBalanceAmt;
        }

        public void setNBalanceAmt(int nBalanceAmt) {
            this.nBalanceAmt = nBalanceAmt;
        }

        public int getBDiscPerc() {
            return bDiscPerc;
        }

        public void setBDiscPerc(int bDiscPerc) {
            this.bDiscPerc = bDiscPerc;
        }

        public int getNFreeQty() {
            return nFreeQty;
        }

        public void setNFreeQty(int nFreeQty) {
            this.nFreeQty = nFreeQty;
        }

        public boolean isBFreeItems() {
            return bFreeItems;
        }

        public void setBFreeItems(boolean bFreeItems) {
            this.bFreeItems = bFreeItems;
        }

        public boolean isBApplyDisc() {
            return bApplyDisc;
        }

        public void setBApplyDisc(boolean bApplyDisc) {
            this.bApplyDisc = bApplyDisc;
        }
    }
}
