
package com.centrahub.SaasContract.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LineItem implements Serializable
{

    @SerializedName("BodyId")
    @Expose
    private String bodyId;
    @SerializedName("AdditionalExternalUser")
    @Expose
    private String additionalExternalUser;
    @SerializedName("AdditionalLightUser")
    @Expose
    private String additionalLightUser;
    @SerializedName("AdditionalUser")
    @Expose
    private String additionalUser;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("AmountLocal")
    @Expose
    private String amountLocal;
    @SerializedName("AmountUSD")
    @Expose
    private String amountUSD;
    @SerializedName("BaseUser")
    @Expose
    private String baseUser;
    @SerializedName("BodyRemarks")
    @Expose
    private String bodyRemarks;
    @SerializedName("Discount")
    @Expose
    private String discount;
    @SerializedName("ExternalUser")
    @Expose
    private String externalUser;
    @SerializedName("ExtraCompanyImpl")
    @Expose
    private String extraCompanyImpl;
    @SerializedName("fCostPrice")
    @Expose
    private String fCostPrice;
    @SerializedName("fCostPriceAmount")
    @Expose
    private String fCostPriceAmount;
    @SerializedName("LicenseType__name")
    @Expose
    private String licenseTypeName;
    @SerializedName("LicenseType__id")
    @Expose
    private String licenseTypeId;
    @SerializedName("LicenseType__code")
    @Expose
    private String licenseTypeCode;
    @SerializedName("LightUser")
    @Expose
    private String lightUser;
    @SerializedName("NetAmountLocal")
    @Expose
    private String netAmountLocal;
    @SerializedName("NetAmountUSD")
    @Expose
    private String netAmountUSD;
    @SerializedName("ProductCategory__name")
    @Expose
    private String productCategoryName;
    @SerializedName("ProductCategory__id")
    @Expose
    private String productCategoryId;
    @SerializedName("ProductCategory__code")
    @Expose
    private String productCategoryCode;
    @SerializedName("Quantity")
    @Expose
    private String quantity;
    @SerializedName("ResellerPercentage")
    @Expose
    private String resellerPercentage;
    @SerializedName("SalePercentage")
    @Expose
    private String salePercentage;
    @SerializedName("StreamType__name")
    @Expose
    private String streamTypeName;
    @SerializedName("StreamType__id")
    @Expose
    private String streamTypeId;
    @SerializedName("StreamType__code")
    @Expose
    private String streamTypeCode;
    @SerializedName("Tax1")
    @Expose
    private String tax1;
    @SerializedName("Tax1Amount")
    @Expose
    private String tax1Amount;
    @SerializedName("Tax2")
    @Expose
    private String tax2;
    @SerializedName("Tax2Amount")
    @Expose
    private String tax2Amount;
    @SerializedName("Tax3")
    @Expose
    private String tax3;
    @SerializedName("Tax3Amount")
    @Expose
    private String tax3Amount;
    @SerializedName("TaxAmountLocal")
    @Expose
    private String taxAmountLocal;
    @SerializedName("TaxAmountUSD")
    @Expose
    private String taxAmountUSD;
    @SerializedName("TaxCode__name")
    @Expose
    private String taxCodeName;
    @SerializedName("TaxCode__id")
    @Expose
    private String taxCodeId;
    @SerializedName("TaxCode__code")
    @Expose
    private String taxCodeCode;
    @SerializedName("TaxPercentage")
    @Expose
    private String taxPercentage;
    @SerializedName("iProductId__name")
    @Expose
    private String iProductIdName;
    @SerializedName("iProductId__id")
    @Expose
    private String iProductIdId;
    @SerializedName("iProductId__code")
    @Expose
    private String iProductIdCode;
    @SerializedName("ProductDescription")
    @Expose
    private String productDescription;
    @SerializedName("SaleLicensePrice")
    @Expose
    private String saleLicensePrice;
    @SerializedName("StdLicensePriceLocal")
    @Expose
    private String stdLicensePriceLocal;
    @SerializedName("iProductGroupId__name")
    @Expose
    private String iProductGroupIdName;
    @SerializedName("iProductGroupId__id")
    @Expose
    private String iProductGroupIdId;
    @SerializedName("iProductGroupId__code")
    @Expose
    private String iProductGroupIdCode;
    @SerializedName("NoofUsers")
    @Expose
    private String noofUsers;
    @SerializedName("fPerUserAmount")
    @Expose
    private String fPerUserAmount;
    @SerializedName("fAdditionalUserCost")
    @Expose
    private String fAdditionalUserCost;
    @SerializedName("fLightUsersCost")
    @Expose
    private String fLightUsersCost;
    @SerializedName("iLightUserPercent")
    @Expose
    private String iLightUserPercent;
    @SerializedName("fAdditionalUserCostSO")
    @Expose
    private String fAdditionalUserCostSO;
    private final static long serialVersionUID = 4644482491784496093L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param amountUSD
     * @param stdLicensePriceLocal
     * @param productCategoryName
     * @param discount
     * @param salePercentage
     * @param resellerPercentage
     * @param fAdditionalUserCostSO
     * @param productDescription
     * @param productCategoryCode
     * @param netAmountUSD
     * @param iProductIdId
     * @param bodyRemarks
     * @param streamTypeId
     * @param licenseTypeCode
     * @param extraCompanyImpl
     * @param tax1Amount
     * @param taxCodeId
     * @param additionalLightUser
     * @param additionalExternalUser
     * @param licenseTypeId
     * @param taxAmountUSD
     * @param amountLocal
     * @param streamTypeCode
     * @param iProductGroupIdName
     * @param netAmountLocal
     * @param tax2Amount
     * @param taxCodeName
     * @param iProductIdCode
     * @param iProductGroupIdId
     * @param streamTypeName
     * @param tax1
     * @param tax2
     * @param taxAmountLocal
     * @param externalUser
     * @param licenseTypeName
     * @param productCategoryId
     * @param baseUser
     * @param fLightUsersCost
     * @param taxCodeCode
     * @param bodyId
     * @param lightUser
     * @param tax3
     * @param tax3Amount
     * @param iProductGroupIdCode
     * @param noofUsers
     * @param additionalUser
     * @param fPerUserAmount
     * @param amount
     * @param quantity
     * @param taxPercentage
     * @param iProductIdName
     * @param fAdditionalUserCost
     * @param saleLicensePrice
     * @param iLightUserPercent
     * @param fCostPriceAmount
     * @param fCostPrice
     */
    public LineItem(String bodyId, String additionalExternalUser, String additionalLightUser, String additionalUser, String amount, String amountLocal, String amountUSD, String baseUser, String bodyRemarks, String discount, String externalUser, String extraCompanyImpl, String fCostPrice, String fCostPriceAmount, String licenseTypeName, String licenseTypeId, String licenseTypeCode, String lightUser, String netAmountLocal, String netAmountUSD, String productCategoryName, String productCategoryId, String productCategoryCode, String quantity, String resellerPercentage, String salePercentage, String streamTypeName, String streamTypeId, String streamTypeCode, String tax1, String tax1Amount, String tax2, String tax2Amount, String tax3, String tax3Amount, String taxAmountLocal, String taxAmountUSD, String taxCodeName, String taxCodeId, String taxCodeCode, String taxPercentage, String iProductIdName, String iProductIdId, String iProductIdCode, String productDescription, String saleLicensePrice, String stdLicensePriceLocal, String iProductGroupIdName, String iProductGroupIdId, String iProductGroupIdCode, String noofUsers, String fPerUserAmount, String fAdditionalUserCost, String fLightUsersCost, String iLightUserPercent, String fAdditionalUserCostSO) {
        super();
        this.bodyId = bodyId;
        this.additionalExternalUser = additionalExternalUser;
        this.additionalLightUser = additionalLightUser;
        this.additionalUser = additionalUser;
        this.amount = amount;
        this.amountLocal = amountLocal;
        this.amountUSD = amountUSD;
        this.baseUser = baseUser;
        this.bodyRemarks = bodyRemarks;
        this.discount = discount;
        this.externalUser = externalUser;
        this.extraCompanyImpl = extraCompanyImpl;
        this.fCostPrice = fCostPrice;
        this.fCostPriceAmount = fCostPriceAmount;
        this.licenseTypeName = licenseTypeName;
        this.licenseTypeId = licenseTypeId;
        this.licenseTypeCode = licenseTypeCode;
        this.lightUser = lightUser;
        this.netAmountLocal = netAmountLocal;
        this.netAmountUSD = netAmountUSD;
        this.productCategoryName = productCategoryName;
        this.productCategoryId = productCategoryId;
        this.productCategoryCode = productCategoryCode;
        this.quantity = quantity;
        this.resellerPercentage = resellerPercentage;
        this.salePercentage = salePercentage;
        this.streamTypeName = streamTypeName;
        this.streamTypeId = streamTypeId;
        this.streamTypeCode = streamTypeCode;
        this.tax1 = tax1;
        this.tax1Amount = tax1Amount;
        this.tax2 = tax2;
        this.tax2Amount = tax2Amount;
        this.tax3 = tax3;
        this.tax3Amount = tax3Amount;
        this.taxAmountLocal = taxAmountLocal;
        this.taxAmountUSD = taxAmountUSD;
        this.taxCodeName = taxCodeName;
        this.taxCodeId = taxCodeId;
        this.taxCodeCode = taxCodeCode;
        this.taxPercentage = taxPercentage;
        this.iProductIdName = iProductIdName;
        this.iProductIdId = iProductIdId;
        this.iProductIdCode = iProductIdCode;
        this.productDescription = productDescription;
        this.saleLicensePrice = saleLicensePrice;
        this.stdLicensePriceLocal = stdLicensePriceLocal;
        this.iProductGroupIdName = iProductGroupIdName;
        this.iProductGroupIdId = iProductGroupIdId;
        this.iProductGroupIdCode = iProductGroupIdCode;
        this.noofUsers = noofUsers;
        this.fPerUserAmount = fPerUserAmount;
        this.fAdditionalUserCost = fAdditionalUserCost;
        this.fLightUsersCost = fLightUsersCost;
        this.iLightUserPercent = iLightUserPercent;
        this.fAdditionalUserCostSO = fAdditionalUserCostSO;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public String getAdditionalExternalUser() {
        return additionalExternalUser;
    }

    public void setAdditionalExternalUser(String additionalExternalUser) {
        this.additionalExternalUser = additionalExternalUser;
    }

    public String getAdditionalLightUser() {
        return additionalLightUser;
    }

    public void setAdditionalLightUser(String additionalLightUser) {
        this.additionalLightUser = additionalLightUser;
    }

    public String getAdditionalUser() {
        return additionalUser;
    }

    public void setAdditionalUser(String additionalUser) {
        this.additionalUser = additionalUser;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmountLocal() {
        return amountLocal;
    }

    public void setAmountLocal(String amountLocal) {
        this.amountLocal = amountLocal;
    }

    public String getAmountUSD() {
        return amountUSD;
    }

    public void setAmountUSD(String amountUSD) {
        this.amountUSD = amountUSD;
    }

    public String getBaseUser() {
        return baseUser;
    }

    public void setBaseUser(String baseUser) {
        this.baseUser = baseUser;
    }

    public String getBodyRemarks() {
        return bodyRemarks;
    }

    public void setBodyRemarks(String bodyRemarks) {
        this.bodyRemarks = bodyRemarks;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getExternalUser() {
        return externalUser;
    }

    public void setExternalUser(String externalUser) {
        this.externalUser = externalUser;
    }

    public String getExtraCompanyImpl() {
        return extraCompanyImpl;
    }

    public void setExtraCompanyImpl(String extraCompanyImpl) {
        this.extraCompanyImpl = extraCompanyImpl;
    }

    public String getfCostPrice() {
        return fCostPrice;
    }

    public void setfCostPrice(String fCostPrice) {
        this.fCostPrice = fCostPrice;
    }

    public String getfCostPriceAmount() {
        return fCostPriceAmount;
    }

    public void setfCostPriceAmount(String fCostPriceAmount) {
        this.fCostPriceAmount = fCostPriceAmount;
    }

    public String getLicenseTypeName() {
        return licenseTypeName;
    }

    public void setLicenseTypeName(String licenseTypeName) {
        this.licenseTypeName = licenseTypeName;
    }

    public String getLicenseTypeId() {
        return licenseTypeId;
    }

    public void setLicenseTypeId(String licenseTypeId) {
        this.licenseTypeId = licenseTypeId;
    }

    public String getLicenseTypeCode() {
        return licenseTypeCode;
    }

    public void setLicenseTypeCode(String licenseTypeCode) {
        this.licenseTypeCode = licenseTypeCode;
    }

    public String getLightUser() {
        return lightUser;
    }

    public void setLightUser(String lightUser) {
        this.lightUser = lightUser;
    }

    public String getNetAmountLocal() {
        return netAmountLocal;
    }

    public void setNetAmountLocal(String netAmountLocal) {
        this.netAmountLocal = netAmountLocal;
    }

    public String getNetAmountUSD() {
        return netAmountUSD;
    }

    public void setNetAmountUSD(String netAmountUSD) {
        this.netAmountUSD = netAmountUSD;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getResellerPercentage() {
        return resellerPercentage;
    }

    public void setResellerPercentage(String resellerPercentage) {
        this.resellerPercentage = resellerPercentage;
    }

    public String getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(String salePercentage) {
        this.salePercentage = salePercentage;
    }

    public String getStreamTypeName() {
        return streamTypeName;
    }

    public void setStreamTypeName(String streamTypeName) {
        this.streamTypeName = streamTypeName;
    }

    public String getStreamTypeId() {
        return streamTypeId;
    }

    public void setStreamTypeId(String streamTypeId) {
        this.streamTypeId = streamTypeId;
    }

    public String getStreamTypeCode() {
        return streamTypeCode;
    }

    public void setStreamTypeCode(String streamTypeCode) {
        this.streamTypeCode = streamTypeCode;
    }

    public String getTax1() {
        return tax1;
    }

    public void setTax1(String tax1) {
        this.tax1 = tax1;
    }

    public String getTax1Amount() {
        return tax1Amount;
    }

    public void setTax1Amount(String tax1Amount) {
        this.tax1Amount = tax1Amount;
    }

    public String getTax2() {
        return tax2;
    }

    public void setTax2(String tax2) {
        this.tax2 = tax2;
    }

    public String getTax2Amount() {
        return tax2Amount;
    }

    public void setTax2Amount(String tax2Amount) {
        this.tax2Amount = tax2Amount;
    }

    public String getTax3() {
        return tax3;
    }

    public void setTax3(String tax3) {
        this.tax3 = tax3;
    }

    public String getTax3Amount() {
        return tax3Amount;
    }

    public void setTax3Amount(String tax3Amount) {
        this.tax3Amount = tax3Amount;
    }

    public String getTaxAmountLocal() {
        return taxAmountLocal;
    }

    public void setTaxAmountLocal(String taxAmountLocal) {
        this.taxAmountLocal = taxAmountLocal;
    }

    public String getTaxAmountUSD() {
        return taxAmountUSD;
    }

    public void setTaxAmountUSD(String taxAmountUSD) {
        this.taxAmountUSD = taxAmountUSD;
    }

    public String getTaxCodeName() {
        return taxCodeName;
    }

    public void setTaxCodeName(String taxCodeName) {
        this.taxCodeName = taxCodeName;
    }

    public String getTaxCodeId() {
        return taxCodeId;
    }

    public void setTaxCodeId(String taxCodeId) {
        this.taxCodeId = taxCodeId;
    }

    public String getTaxCodeCode() {
        return taxCodeCode;
    }

    public void setTaxCodeCode(String taxCodeCode) {
        this.taxCodeCode = taxCodeCode;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getiProductIdName() {
        return iProductIdName;
    }

    public void setiProductIdName(String iProductIdName) {
        this.iProductIdName = iProductIdName;
    }

    public String getiProductIdId() {
        return iProductIdId;
    }

    public void setiProductIdId(String iProductIdId) {
        this.iProductIdId = iProductIdId;
    }

    public String getiProductIdCode() {
        return iProductIdCode;
    }

    public void setiProductIdCode(String iProductIdCode) {
        this.iProductIdCode = iProductIdCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSaleLicensePrice() {
        return saleLicensePrice;
    }

    public void setSaleLicensePrice(String saleLicensePrice) {
        this.saleLicensePrice = saleLicensePrice;
    }

    public String getStdLicensePriceLocal() {
        return stdLicensePriceLocal;
    }

    public void setStdLicensePriceLocal(String stdLicensePriceLocal) {
        this.stdLicensePriceLocal = stdLicensePriceLocal;
    }

    public String getiProductGroupIdName() {
        return iProductGroupIdName;
    }

    public void setiProductGroupIdName(String iProductGroupIdName) {
        this.iProductGroupIdName = iProductGroupIdName;
    }

    public String getiProductGroupIdId() {
        return iProductGroupIdId;
    }

    public void setiProductGroupIdId(String iProductGroupIdId) {
        this.iProductGroupIdId = iProductGroupIdId;
    }

    public String getiProductGroupIdCode() {
        return iProductGroupIdCode;
    }

    public void setiProductGroupIdCode(String iProductGroupIdCode) {
        this.iProductGroupIdCode = iProductGroupIdCode;
    }

    public String getNoofUsers() {
        return noofUsers;
    }

    public void setNoofUsers(String noofUsers) {
        this.noofUsers = noofUsers;
    }

    public String getfPerUserAmount() {
        return fPerUserAmount;
    }

    public void setfPerUserAmount(String fPerUserAmount) {
        this.fPerUserAmount = fPerUserAmount;
    }

    public String getfAdditionalUserCost() {
        return fAdditionalUserCost;
    }

    public void setfAdditionalUserCost(String fAdditionalUserCost) {
        this.fAdditionalUserCost = fAdditionalUserCost;
    }

    public String getfLightUsersCost() {
        return fLightUsersCost;
    }

    public void setfLightUsersCost(String fLightUsersCost) {
        this.fLightUsersCost = fLightUsersCost;
    }

    public String getiLightUserPercent() {
        return iLightUserPercent;
    }

    public void setiLightUserPercent(String iLightUserPercent) {
        this.iLightUserPercent = iLightUserPercent;
    }

    public String getfAdditionalUserCostSO() {
        return fAdditionalUserCostSO;
    }

    public void setfAdditionalUserCostSO(String fAdditionalUserCostSO) {
        this.fAdditionalUserCostSO = fAdditionalUserCostSO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bodyId");
        sb.append('=');
        sb.append(((this.bodyId == null)?"<null>":this.bodyId));
        sb.append(',');
        sb.append("additionalExternalUser");
        sb.append('=');
        sb.append(((this.additionalExternalUser == null)?"<null>":this.additionalExternalUser));
        sb.append(',');
        sb.append("additionalLightUser");
        sb.append('=');
        sb.append(((this.additionalLightUser == null)?"<null>":this.additionalLightUser));
        sb.append(',');
        sb.append("additionalUser");
        sb.append('=');
        sb.append(((this.additionalUser == null)?"<null>":this.additionalUser));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("amountLocal");
        sb.append('=');
        sb.append(((this.amountLocal == null)?"<null>":this.amountLocal));
        sb.append(',');
        sb.append("amountUSD");
        sb.append('=');
        sb.append(((this.amountUSD == null)?"<null>":this.amountUSD));
        sb.append(',');
        sb.append("baseUser");
        sb.append('=');
        sb.append(((this.baseUser == null)?"<null>":this.baseUser));
        sb.append(',');
        sb.append("bodyRemarks");
        sb.append('=');
        sb.append(((this.bodyRemarks == null)?"<null>":this.bodyRemarks));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("extraCompanyImpl");
        sb.append('=');
        sb.append(((this.extraCompanyImpl == null)?"<null>":this.extraCompanyImpl));
        sb.append(',');
        sb.append("fCostPrice");
        sb.append('=');
        sb.append(((this.fCostPrice == null)?"<null>":this.fCostPrice));
        sb.append(',');
        sb.append("fCostPriceAmount");
        sb.append('=');
        sb.append(((this.fCostPriceAmount == null)?"<null>":this.fCostPriceAmount));
        sb.append(',');
        sb.append("licenseTypeName");
        sb.append('=');
        sb.append(((this.licenseTypeName == null)?"<null>":this.licenseTypeName));
        sb.append(',');
        sb.append("licenseTypeId");
        sb.append('=');
        sb.append(((this.licenseTypeId == null)?"<null>":this.licenseTypeId));
        sb.append(',');
        sb.append("licenseTypeCode");
        sb.append('=');
        sb.append(((this.licenseTypeCode == null)?"<null>":this.licenseTypeCode));
        sb.append(',');
        sb.append("lightUser");
        sb.append('=');
        sb.append(((this.lightUser == null)?"<null>":this.lightUser));
        sb.append(',');
        sb.append("netAmountLocal");
        sb.append('=');
        sb.append(((this.netAmountLocal == null)?"<null>":this.netAmountLocal));
        sb.append(',');
        sb.append("netAmountUSD");
        sb.append('=');
        sb.append(((this.netAmountUSD == null)?"<null>":this.netAmountUSD));
        sb.append(',');
        sb.append("productCategoryName");
        sb.append('=');
        sb.append(((this.productCategoryName == null)?"<null>":this.productCategoryName));
        sb.append(',');
        sb.append("productCategoryId");
        sb.append('=');
        sb.append(((this.productCategoryId == null)?"<null>":this.productCategoryId));
        sb.append(',');
        sb.append("productCategoryCode");
        sb.append('=');
        sb.append(((this.productCategoryCode == null)?"<null>":this.productCategoryCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("resellerPercentage");
        sb.append('=');
        sb.append(((this.resellerPercentage == null)?"<null>":this.resellerPercentage));
        sb.append(',');
        sb.append("salePercentage");
        sb.append('=');
        sb.append(((this.salePercentage == null)?"<null>":this.salePercentage));
        sb.append(',');
        sb.append("streamTypeName");
        sb.append('=');
        sb.append(((this.streamTypeName == null)?"<null>":this.streamTypeName));
        sb.append(',');
        sb.append("streamTypeId");
        sb.append('=');
        sb.append(((this.streamTypeId == null)?"<null>":this.streamTypeId));
        sb.append(',');
        sb.append("streamTypeCode");
        sb.append('=');
        sb.append(((this.streamTypeCode == null)?"<null>":this.streamTypeCode));
        sb.append(',');
        sb.append("tax1");
        sb.append('=');
        sb.append(((this.tax1 == null)?"<null>":this.tax1));
        sb.append(',');
        sb.append("tax1Amount");
        sb.append('=');
        sb.append(((this.tax1Amount == null)?"<null>":this.tax1Amount));
        sb.append(',');
        sb.append("tax2");
        sb.append('=');
        sb.append(((this.tax2 == null)?"<null>":this.tax2));
        sb.append(',');
        sb.append("tax2Amount");
        sb.append('=');
        sb.append(((this.tax2Amount == null)?"<null>":this.tax2Amount));
        sb.append(',');
        sb.append("tax3");
        sb.append('=');
        sb.append(((this.tax3 == null)?"<null>":this.tax3));
        sb.append(',');
        sb.append("tax3Amount");
        sb.append('=');
        sb.append(((this.tax3Amount == null)?"<null>":this.tax3Amount));
        sb.append(',');
        sb.append("taxAmountLocal");
        sb.append('=');
        sb.append(((this.taxAmountLocal == null)?"<null>":this.taxAmountLocal));
        sb.append(',');
        sb.append("taxAmountUSD");
        sb.append('=');
        sb.append(((this.taxAmountUSD == null)?"<null>":this.taxAmountUSD));
        sb.append(',');
        sb.append("taxCodeName");
        sb.append('=');
        sb.append(((this.taxCodeName == null)?"<null>":this.taxCodeName));
        sb.append(',');
        sb.append("taxCodeId");
        sb.append('=');
        sb.append(((this.taxCodeId == null)?"<null>":this.taxCodeId));
        sb.append(',');
        sb.append("taxCodeCode");
        sb.append('=');
        sb.append(((this.taxCodeCode == null)?"<null>":this.taxCodeCode));
        sb.append(',');
        sb.append("taxPercentage");
        sb.append('=');
        sb.append(((this.taxPercentage == null)?"<null>":this.taxPercentage));
        sb.append(',');
        sb.append("iProductIdName");
        sb.append('=');
        sb.append(((this.iProductIdName == null)?"<null>":this.iProductIdName));
        sb.append(',');
        sb.append("iProductIdId");
        sb.append('=');
        sb.append(((this.iProductIdId == null)?"<null>":this.iProductIdId));
        sb.append(',');
        sb.append("iProductIdCode");
        sb.append('=');
        sb.append(((this.iProductIdCode == null)?"<null>":this.iProductIdCode));
        sb.append(',');
        sb.append("productDescription");
        sb.append('=');
        sb.append(((this.productDescription == null)?"<null>":this.productDescription));
        sb.append(',');
        sb.append("saleLicensePrice");
        sb.append('=');
        sb.append(((this.saleLicensePrice == null)?"<null>":this.saleLicensePrice));
        sb.append(',');
        sb.append("stdLicensePriceLocal");
        sb.append('=');
        sb.append(((this.stdLicensePriceLocal == null)?"<null>":this.stdLicensePriceLocal));
        sb.append(',');
        sb.append("iProductGroupIdName");
        sb.append('=');
        sb.append(((this.iProductGroupIdName == null)?"<null>":this.iProductGroupIdName));
        sb.append(',');
        sb.append("iProductGroupIdId");
        sb.append('=');
        sb.append(((this.iProductGroupIdId == null)?"<null>":this.iProductGroupIdId));
        sb.append(',');
        sb.append("iProductGroupIdCode");
        sb.append('=');
        sb.append(((this.iProductGroupIdCode == null)?"<null>":this.iProductGroupIdCode));
        sb.append(',');
        sb.append("noofUsers");
        sb.append('=');
        sb.append(((this.noofUsers == null)?"<null>":this.noofUsers));
        sb.append(',');
        sb.append("fPerUserAmount");
        sb.append('=');
        sb.append(((this.fPerUserAmount == null)?"<null>":this.fPerUserAmount));
        sb.append(',');
        sb.append("fAdditionalUserCost");
        sb.append('=');
        sb.append(((this.fAdditionalUserCost == null)?"<null>":this.fAdditionalUserCost));
        sb.append(',');
        sb.append("fLightUsersCost");
        sb.append('=');
        sb.append(((this.fLightUsersCost == null)?"<null>":this.fLightUsersCost));
        sb.append(',');
        sb.append("iLightUserPercent");
        sb.append('=');
        sb.append(((this.iLightUserPercent == null)?"<null>":this.iLightUserPercent));
        sb.append(',');
        sb.append("fAdditionalUserCostSO");
        sb.append('=');
        sb.append(((this.fAdditionalUserCostSO == null)?"<null>":this.fAdditionalUserCostSO));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
