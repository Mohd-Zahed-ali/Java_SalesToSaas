
package com.centrahub.SaasContract.dto;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Record implements Serializable
{

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("MasterId")
    @Expose
    private String masterId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("IsGroup")
    @Expose
    private String isGroup;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("ModifiedBy__name")
    @Expose
    private String modifiedByName;
    @SerializedName("ModifiedBy__id")
    @Expose
    private String modifiedById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("ModifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("Location__name")
    @Expose
    private String locationName;
    @SerializedName("Location__id")
    @Expose
    private String locationId;
    @SerializedName("Location__code")
    @Expose
    private String locationCode;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("iAssignedDate")
    @Expose
    private String iAssignedDate;
    @SerializedName("AdditionalDiscount")
    @Expose
    private String additionalDiscount;
    @SerializedName("M3073F2043__name")
    @Expose
    private String m3073F2043Name;
    @SerializedName("M3073F2043__id")
    @Expose
    private String m3073F2043Id;
    @SerializedName("M3073F2043__code")
    @Expose
    private String m3073F2043Code;
    @SerializedName("sCdid")
    @Expose
    private String sCdid;
    @SerializedName("TotalExternalUsers")
    @Expose
    private String totalExternalUsers;
    @SerializedName("TotalLightUsers")
    @Expose
    private String totalLightUsers;
    @SerializedName("Account__name")
    @Expose
    private String accountName;
    @SerializedName("Account__id")
    @Expose
    private String accountId;
    @SerializedName("Account__code")
    @Expose
    private String accountCode;
    @SerializedName("iContactId__name")
    @Expose
    private String iContactIdName;
    @SerializedName("iContactId__id")
    @Expose
    private String iContactIdId;
    @SerializedName("iContactId__code")
    @Expose
    private String iContactIdCode;
    @SerializedName("iExpiryDate")
    @Expose
    private String iExpiryDate;
    @SerializedName("SaleImplPriceAmt")
    @Expose
    private String saleImplPriceAmt;
    @SerializedName("TotalNetAmount")
    @Expose
    private String totalNetAmount;
    @SerializedName("TotalSaleAmount")
    @Expose
    private String totalSaleAmount;
    @SerializedName("iContractStatus")
    @Expose
    private String iContractStatus;
    @SerializedName("iSalesOrder__name")
    @Expose
    private String iSalesOrderName;
    @SerializedName("iSalesOrder__id")
    @Expose
    private String iSalesOrderId;
    @SerializedName("iDate")
    @Expose
    private String iDate;
    @SerializedName("TotalStdImplPrice")
    @Expose
    private String totalStdImplPrice;
    @SerializedName("TotalStdLicensePrice")
    @Expose
    private String totalStdLicensePrice;
    @SerializedName("TotalTaxAmount")
    @Expose
    private String totalTaxAmount;
    @SerializedName("Branch1__name")
    @Expose
    private String branch1Name;
    @SerializedName("Branch1__id")
    @Expose
    private String branch1Id;
    @SerializedName("Branch1__code")
    @Expose
    private String branch1Code;
    @SerializedName("CostCenter__name")
    @Expose
    private String costCenterName;
    @SerializedName("CostCenter__id")
    @Expose
    private String costCenterId;
    @SerializedName("CostCenter__code")
    @Expose
    private String costCenterCode;
    @SerializedName("iEmployeeId__name")
    @Expose
    private String iEmployeeIdName;
    @SerializedName("iEmployeeId__id")
    @Expose
    private String iEmployeeIdId;
    @SerializedName("iEmployeeId__code")
    @Expose
    private String iEmployeeIdCode;
    @SerializedName("Jurisdiction__name")
    @Expose
    private String jurisdictionName;
    @SerializedName("Jurisdiction__id")
    @Expose
    private String jurisdictionId;
    @SerializedName("Jurisdiction__code")
    @Expose
    private String jurisdictionCode;
    @SerializedName("LicenseTypeHeader__name")
    @Expose
    private String licenseTypeHeaderName;
    @SerializedName("LicenseTypeHeader__id")
    @Expose
    private String licenseTypeHeaderId;
    @SerializedName("LicenseTypeHeader__code")
    @Expose
    private String licenseTypeHeaderCode;
    @SerializedName("PlaceofSupply__name")
    @Expose
    private String placeofSupplyName;
    @SerializedName("PlaceofSupply__id")
    @Expose
    private String placeofSupplyId;
    @SerializedName("PlaceofSupply__code")
    @Expose
    private String placeofSupplyCode;
    @SerializedName("Region__name")
    @Expose
    private String regionName;
    @SerializedName("Region__id")
    @Expose
    private String regionId;
    @SerializedName("Region__code")
    @Expose
    private String regionCode;
    @SerializedName("iStartDate")
    @Expose
    private String iStartDate;
    @SerializedName("lineItems")
    @Expose
    private List<LineItem> lineItems = null;
    private final static long serialVersionUID = -14160363571222551L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param iAssignedDate
     * @param iSalesOrderId
     * @param costCenterCode
     * @param createdByName
     * @param iEmployeeIdName
     * @param lineItems
     * @param totalSaleAmount
     * @param iEmployeeIdId
     * @param modifiedById
     * @param iContactIdId
     * @param createdById
     * @param branch1Code
     * @param accountCode
     * @param iContactIdCode
     * @param licenseTypeHeaderCode
     * @param m3073F2043Name
     * @param accountId
     * @param branch1Name
     * @param licenseTypeHeaderId
     * @param name
     * @param modifiedDate
     * @param costCenterName
     * @param placeofSupplyCode
     * @param iExpiryDate
     * @param sCdid
     * @param isGroup
     * @param locationCode
     * @param totalTaxAmount
     * @param assignedToId
     * @param code
     * @param accountName
     * @param assignedToName
     * @param branch1Id
     * @param regionName
     * @param isRead
     * @param m3073F2043Code
     * @param saleImplPriceAmt
     * @param regionCode
     * @param modifiedByName
     * @param m3073F2043Id
     * @param costCenterId
     * @param locationId
     * @param jurisdictionName
     * @param jurisdictionId
     * @param iSalesOrderName
     * @param iStartDate
     * @param placeofSupplyId
     * @param iDate
     * @param placeofSupplyName
     * @param totalLightUsers
     * @param iContractStatus
     * @param locationName
     * @param totalNetAmount
     * @param totalStdImplPrice
     * @param iEmployeeIdCode
     * @param additionalDiscount
     * @param masterId
     * @param createdDate
     * @param regionId
     * @param licenseTypeHeaderName
     * @param jurisdictionCode
     * @param attributes
     * @param totalStdLicensePrice
     * @param totalExternalUsers
     * @param iContactIdName
     */
    public Record(Attributes attributes, String masterId, String name, String code, String isGroup, String createdByName, String createdById, String modifiedByName, String modifiedById, String createdDate, String modifiedDate, String locationName, String locationId, String locationCode, String assignedToName, String assignedToId, String isRead, String iAssignedDate, String additionalDiscount, String m3073F2043Name, String m3073F2043Id, String m3073F2043Code, String sCdid, String totalExternalUsers, String totalLightUsers, String accountName, String accountId, String accountCode, String iContactIdName, String iContactIdId, String iContactIdCode, String iExpiryDate, String saleImplPriceAmt, String totalNetAmount, String totalSaleAmount, String iContractStatus, String iSalesOrderName, String iSalesOrderId, String iDate, String totalStdImplPrice, String totalStdLicensePrice, String totalTaxAmount, String branch1Name, String branch1Id, String branch1Code, String costCenterName, String costCenterId, String costCenterCode, String iEmployeeIdName, String iEmployeeIdId, String iEmployeeIdCode, String jurisdictionName, String jurisdictionId, String jurisdictionCode, String licenseTypeHeaderName, String licenseTypeHeaderId, String licenseTypeHeaderCode, String placeofSupplyName, String placeofSupplyId, String placeofSupplyCode, String regionName, String regionId, String regionCode, String iStartDate, List<LineItem> lineItems) {
        super();
        this.attributes = attributes;
        this.masterId = masterId;
        this.name = name;
        this.code = code;
        this.isGroup = isGroup;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.locationName = locationName;
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.isRead = isRead;
        this.iAssignedDate = iAssignedDate;
        this.additionalDiscount = additionalDiscount;
        this.m3073F2043Name = m3073F2043Name;
        this.m3073F2043Id = m3073F2043Id;
        this.m3073F2043Code = m3073F2043Code;
        this.sCdid = sCdid;
        this.totalExternalUsers = totalExternalUsers;
        this.totalLightUsers = totalLightUsers;
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.iContactIdName = iContactIdName;
        this.iContactIdId = iContactIdId;
        this.iContactIdCode = iContactIdCode;
        this.iExpiryDate = iExpiryDate;
        this.saleImplPriceAmt = saleImplPriceAmt;
        this.totalNetAmount = totalNetAmount;
        this.totalSaleAmount = totalSaleAmount;
        this.iContractStatus = iContractStatus;
        this.iSalesOrderName = iSalesOrderName;
        this.iSalesOrderId = iSalesOrderId;
        this.iDate = iDate;
        this.totalStdImplPrice = totalStdImplPrice;
        this.totalStdLicensePrice = totalStdLicensePrice;
        this.totalTaxAmount = totalTaxAmount;
        this.branch1Name = branch1Name;
        this.branch1Id = branch1Id;
        this.branch1Code = branch1Code;
        this.costCenterName = costCenterName;
        this.costCenterId = costCenterId;
        this.costCenterCode = costCenterCode;
        this.iEmployeeIdName = iEmployeeIdName;
        this.iEmployeeIdId = iEmployeeIdId;
        this.iEmployeeIdCode = iEmployeeIdCode;
        this.jurisdictionName = jurisdictionName;
        this.jurisdictionId = jurisdictionId;
        this.jurisdictionCode = jurisdictionCode;
        this.licenseTypeHeaderName = licenseTypeHeaderName;
        this.licenseTypeHeaderId = licenseTypeHeaderId;
        this.licenseTypeHeaderCode = licenseTypeHeaderCode;
        this.placeofSupplyName = placeofSupplyName;
        this.placeofSupplyId = placeofSupplyId;
        this.placeofSupplyCode = placeofSupplyCode;
        this.regionName = regionName;
        this.regionId = regionId;
        this.regionCode = regionCode;
        this.iStartDate = iStartDate;
        this.lineItems = lineItems;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getModifiedByName() {
        return modifiedByName;
    }

    public void setModifiedByName(String modifiedByName) {
        this.modifiedByName = modifiedByName;
    }

    public String getModifiedById() {
        return modifiedById;
    }

    public void setModifiedById(String modifiedById) {
        this.modifiedById = modifiedById;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getAssignedToName() {
        return assignedToName;
    }

    public void setAssignedToName(String assignedToName) {
        this.assignedToName = assignedToName;
    }

    public String getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getiAssignedDate() {
        return iAssignedDate;
    }

    public void setiAssignedDate(String iAssignedDate) {
        this.iAssignedDate = iAssignedDate;
    }

    public String getAdditionalDiscount() {
        return additionalDiscount;
    }

    public void setAdditionalDiscount(String additionalDiscount) {
        this.additionalDiscount = additionalDiscount;
    }

    public String getM3073F2043Name() {
        return m3073F2043Name;
    }

    public void setM3073F2043Name(String m3073F2043Name) {
        this.m3073F2043Name = m3073F2043Name;
    }

    public String getM3073F2043Id() {
        return m3073F2043Id;
    }

    public void setM3073F2043Id(String m3073F2043Id) {
        this.m3073F2043Id = m3073F2043Id;
    }

    public String getM3073F2043Code() {
        return m3073F2043Code;
    }

    public void setM3073F2043Code(String m3073F2043Code) {
        this.m3073F2043Code = m3073F2043Code;
    }

    public String getsCdid() {
        return sCdid;
    }

    public void setsCdid(String sCdid) {
        this.sCdid = sCdid;
    }

    public String getTotalExternalUsers() {
        return totalExternalUsers;
    }

    public void setTotalExternalUsers(String totalExternalUsers) {
        this.totalExternalUsers = totalExternalUsers;
    }

    public String getTotalLightUsers() {
        return totalLightUsers;
    }

    public void setTotalLightUsers(String totalLightUsers) {
        this.totalLightUsers = totalLightUsers;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getiContactIdName() {
        return iContactIdName;
    }

    public void setiContactIdName(String iContactIdName) {
        this.iContactIdName = iContactIdName;
    }

    public String getiContactIdId() {
        return iContactIdId;
    }

    public void setiContactIdId(String iContactIdId) {
        this.iContactIdId = iContactIdId;
    }

    public String getiContactIdCode() {
        return iContactIdCode;
    }

    public void setiContactIdCode(String iContactIdCode) {
        this.iContactIdCode = iContactIdCode;
    }

    public String getiExpiryDate() {
        return iExpiryDate;
    }

    public void setiExpiryDate(String iExpiryDate) {
        this.iExpiryDate = iExpiryDate;
    }

    public String getSaleImplPriceAmt() {
        return saleImplPriceAmt;
    }

    public void setSaleImplPriceAmt(String saleImplPriceAmt) {
        this.saleImplPriceAmt = saleImplPriceAmt;
    }

    public String getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(String totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public String getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public void setTotalSaleAmount(String totalSaleAmount) {
        this.totalSaleAmount = totalSaleAmount;
    }

    public String getiContractStatus() {
        return iContractStatus;
    }

    public void setiContractStatus(String iContractStatus) {
        this.iContractStatus = iContractStatus;
    }

    public String getiSalesOrderName() {
        return iSalesOrderName;
    }

    public void setiSalesOrderName(String iSalesOrderName) {
        this.iSalesOrderName = iSalesOrderName;
    }

    public String getiSalesOrderId() {
        return iSalesOrderId;
    }

    public void setiSalesOrderId(String iSalesOrderId) {
        this.iSalesOrderId = iSalesOrderId;
    }

    public String getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate;
    }

    public String getTotalStdImplPrice() {
        return totalStdImplPrice;
    }

    public void setTotalStdImplPrice(String totalStdImplPrice) {
        this.totalStdImplPrice = totalStdImplPrice;
    }

    public String getTotalStdLicensePrice() {
        return totalStdLicensePrice;
    }

    public void setTotalStdLicensePrice(String totalStdLicensePrice) {
        this.totalStdLicensePrice = totalStdLicensePrice;
    }

    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(String totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public String getBranch1Name() {
        return branch1Name;
    }

    public void setBranch1Name(String branch1Name) {
        this.branch1Name = branch1Name;
    }

    public String getBranch1Id() {
        return branch1Id;
    }

    public void setBranch1Id(String branch1Id) {
        this.branch1Id = branch1Id;
    }

    public String getBranch1Code() {
        return branch1Code;
    }

    public void setBranch1Code(String branch1Code) {
        this.branch1Code = branch1Code;
    }

    public String getCostCenterName() {
        return costCenterName;
    }

    public void setCostCenterName(String costCenterName) {
        this.costCenterName = costCenterName;
    }

    public String getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(String costCenterId) {
        this.costCenterId = costCenterId;
    }

    public String getCostCenterCode() {
        return costCenterCode;
    }

    public void setCostCenterCode(String costCenterCode) {
        this.costCenterCode = costCenterCode;
    }

    public String getiEmployeeIdName() {
        return iEmployeeIdName;
    }

    public void setiEmployeeIdName(String iEmployeeIdName) {
        this.iEmployeeIdName = iEmployeeIdName;
    }

    public String getiEmployeeIdId() {
        return iEmployeeIdId;
    }

    public void setiEmployeeIdId(String iEmployeeIdId) {
        this.iEmployeeIdId = iEmployeeIdId;
    }

    public String getiEmployeeIdCode() {
        return iEmployeeIdCode;
    }

    public void setiEmployeeIdCode(String iEmployeeIdCode) {
        this.iEmployeeIdCode = iEmployeeIdCode;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    public String getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(String jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getJurisdictionCode() {
        return jurisdictionCode;
    }

    public void setJurisdictionCode(String jurisdictionCode) {
        this.jurisdictionCode = jurisdictionCode;
    }

    public String getLicenseTypeHeaderName() {
        return licenseTypeHeaderName;
    }

    public void setLicenseTypeHeaderName(String licenseTypeHeaderName) {
        this.licenseTypeHeaderName = licenseTypeHeaderName;
    }

    public String getLicenseTypeHeaderId() {
        return licenseTypeHeaderId;
    }

    public void setLicenseTypeHeaderId(String licenseTypeHeaderId) {
        this.licenseTypeHeaderId = licenseTypeHeaderId;
    }

    public String getLicenseTypeHeaderCode() {
        return licenseTypeHeaderCode;
    }

    public void setLicenseTypeHeaderCode(String licenseTypeHeaderCode) {
        this.licenseTypeHeaderCode = licenseTypeHeaderCode;
    }

    public String getPlaceofSupplyName() {
        return placeofSupplyName;
    }

    public void setPlaceofSupplyName(String placeofSupplyName) {
        this.placeofSupplyName = placeofSupplyName;
    }

    public String getPlaceofSupplyId() {
        return placeofSupplyId;
    }

    public void setPlaceofSupplyId(String placeofSupplyId) {
        this.placeofSupplyId = placeofSupplyId;
    }

    public String getPlaceofSupplyCode() {
        return placeofSupplyCode;
    }

    public void setPlaceofSupplyCode(String placeofSupplyCode) {
        this.placeofSupplyCode = placeofSupplyCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getiStartDate() {
        return iStartDate;
    }

    public void setiStartDate(String iStartDate) {
        this.iStartDate = iStartDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Record.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null)?"<null>":this.attributes));
        sb.append(',');
        sb.append("masterId");
        sb.append('=');
        sb.append(((this.masterId == null)?"<null>":this.masterId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("isGroup");
        sb.append('=');
        sb.append(((this.isGroup == null)?"<null>":this.isGroup));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null)?"<null>":this.createdByName));
        sb.append(',');
        sb.append("createdById");
        sb.append('=');
        sb.append(((this.createdById == null)?"<null>":this.createdById));
        sb.append(',');
        sb.append("modifiedByName");
        sb.append('=');
        sb.append(((this.modifiedByName == null)?"<null>":this.modifiedByName));
        sb.append(',');
        sb.append("modifiedById");
        sb.append('=');
        sb.append(((this.modifiedById == null)?"<null>":this.modifiedById));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null)?"<null>":this.modifiedDate));
        sb.append(',');
        sb.append("locationName");
        sb.append('=');
        sb.append(((this.locationName == null)?"<null>":this.locationName));
        sb.append(',');
        sb.append("locationId");
        sb.append('=');
        sb.append(((this.locationId == null)?"<null>":this.locationId));
        sb.append(',');
        sb.append("locationCode");
        sb.append('=');
        sb.append(((this.locationCode == null)?"<null>":this.locationCode));
        sb.append(',');
        sb.append("assignedToName");
        sb.append('=');
        sb.append(((this.assignedToName == null)?"<null>":this.assignedToName));
        sb.append(',');
        sb.append("assignedToId");
        sb.append('=');
        sb.append(((this.assignedToId == null)?"<null>":this.assignedToId));
        sb.append(',');
        sb.append("isRead");
        sb.append('=');
        sb.append(((this.isRead == null)?"<null>":this.isRead));
        sb.append(',');
        sb.append("iAssignedDate");
        sb.append('=');
        sb.append(((this.iAssignedDate == null)?"<null>":this.iAssignedDate));
        sb.append(',');
        sb.append("additionalDiscount");
        sb.append('=');
        sb.append(((this.additionalDiscount == null)?"<null>":this.additionalDiscount));
        sb.append(',');
        sb.append("m3073F2043Name");
        sb.append('=');
        sb.append(((this.m3073F2043Name == null)?"<null>":this.m3073F2043Name));
        sb.append(',');
        sb.append("m3073F2043Id");
        sb.append('=');
        sb.append(((this.m3073F2043Id == null)?"<null>":this.m3073F2043Id));
        sb.append(',');
        sb.append("m3073F2043Code");
        sb.append('=');
        sb.append(((this.m3073F2043Code == null)?"<null>":this.m3073F2043Code));
        sb.append(',');
        sb.append("sCdid");
        sb.append('=');
        sb.append(((this.sCdid == null)?"<null>":this.sCdid));
        sb.append(',');
        sb.append("totalExternalUsers");
        sb.append('=');
        sb.append(((this.totalExternalUsers == null)?"<null>":this.totalExternalUsers));
        sb.append(',');
        sb.append("totalLightUsers");
        sb.append('=');
        sb.append(((this.totalLightUsers == null)?"<null>":this.totalLightUsers));
        sb.append(',');
        sb.append("accountName");
        sb.append('=');
        sb.append(((this.accountName == null)?"<null>":this.accountName));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("accountCode");
        sb.append('=');
        sb.append(((this.accountCode == null)?"<null>":this.accountCode));
        sb.append(',');
        sb.append("iContactIdName");
        sb.append('=');
        sb.append(((this.iContactIdName == null)?"<null>":this.iContactIdName));
        sb.append(',');
        sb.append("iContactIdId");
        sb.append('=');
        sb.append(((this.iContactIdId == null)?"<null>":this.iContactIdId));
        sb.append(',');
        sb.append("iContactIdCode");
        sb.append('=');
        sb.append(((this.iContactIdCode == null)?"<null>":this.iContactIdCode));
        sb.append(',');
        sb.append("iExpiryDate");
        sb.append('=');
        sb.append(((this.iExpiryDate == null)?"<null>":this.iExpiryDate));
        sb.append(',');
        sb.append("saleImplPriceAmt");
        sb.append('=');
        sb.append(((this.saleImplPriceAmt == null)?"<null>":this.saleImplPriceAmt));
        sb.append(',');
        sb.append("totalNetAmount");
        sb.append('=');
        sb.append(((this.totalNetAmount == null)?"<null>":this.totalNetAmount));
        sb.append(',');
        sb.append("totalSaleAmount");
        sb.append('=');
        sb.append(((this.totalSaleAmount == null)?"<null>":this.totalSaleAmount));
        sb.append(',');
        sb.append("iContractStatus");
        sb.append('=');
        sb.append(((this.iContractStatus == null)?"<null>":this.iContractStatus));
        sb.append(',');
        sb.append("iSalesOrderName");
        sb.append('=');
        sb.append(((this.iSalesOrderName == null)?"<null>":this.iSalesOrderName));
        sb.append(',');
        sb.append("iSalesOrderId");
        sb.append('=');
        sb.append(((this.iSalesOrderId == null)?"<null>":this.iSalesOrderId));
        sb.append(',');
        sb.append("iDate");
        sb.append('=');
        sb.append(((this.iDate == null)?"<null>":this.iDate));
        sb.append(',');
        sb.append("totalStdImplPrice");
        sb.append('=');
        sb.append(((this.totalStdImplPrice == null)?"<null>":this.totalStdImplPrice));
        sb.append(',');
        sb.append("totalStdLicensePrice");
        sb.append('=');
        sb.append(((this.totalStdLicensePrice == null)?"<null>":this.totalStdLicensePrice));
        sb.append(',');
        sb.append("totalTaxAmount");
        sb.append('=');
        sb.append(((this.totalTaxAmount == null)?"<null>":this.totalTaxAmount));
        sb.append(',');
        sb.append("branch1Name");
        sb.append('=');
        sb.append(((this.branch1Name == null)?"<null>":this.branch1Name));
        sb.append(',');
        sb.append("branch1Id");
        sb.append('=');
        sb.append(((this.branch1Id == null)?"<null>":this.branch1Id));
        sb.append(',');
        sb.append("branch1Code");
        sb.append('=');
        sb.append(((this.branch1Code == null)?"<null>":this.branch1Code));
        sb.append(',');
        sb.append("costCenterName");
        sb.append('=');
        sb.append(((this.costCenterName == null)?"<null>":this.costCenterName));
        sb.append(',');
        sb.append("costCenterId");
        sb.append('=');
        sb.append(((this.costCenterId == null)?"<null>":this.costCenterId));
        sb.append(',');
        sb.append("costCenterCode");
        sb.append('=');
        sb.append(((this.costCenterCode == null)?"<null>":this.costCenterCode));
        sb.append(',');
        sb.append("iEmployeeIdName");
        sb.append('=');
        sb.append(((this.iEmployeeIdName == null)?"<null>":this.iEmployeeIdName));
        sb.append(',');
        sb.append("iEmployeeIdId");
        sb.append('=');
        sb.append(((this.iEmployeeIdId == null)?"<null>":this.iEmployeeIdId));
        sb.append(',');
        sb.append("iEmployeeIdCode");
        sb.append('=');
        sb.append(((this.iEmployeeIdCode == null)?"<null>":this.iEmployeeIdCode));
        sb.append(',');
        sb.append("jurisdictionName");
        sb.append('=');
        sb.append(((this.jurisdictionName == null)?"<null>":this.jurisdictionName));
        sb.append(',');
        sb.append("jurisdictionId");
        sb.append('=');
        sb.append(((this.jurisdictionId == null)?"<null>":this.jurisdictionId));
        sb.append(',');
        sb.append("jurisdictionCode");
        sb.append('=');
        sb.append(((this.jurisdictionCode == null)?"<null>":this.jurisdictionCode));
        sb.append(',');
        sb.append("licenseTypeHeaderName");
        sb.append('=');
        sb.append(((this.licenseTypeHeaderName == null)?"<null>":this.licenseTypeHeaderName));
        sb.append(',');
        sb.append("licenseTypeHeaderId");
        sb.append('=');
        sb.append(((this.licenseTypeHeaderId == null)?"<null>":this.licenseTypeHeaderId));
        sb.append(',');
        sb.append("licenseTypeHeaderCode");
        sb.append('=');
        sb.append(((this.licenseTypeHeaderCode == null)?"<null>":this.licenseTypeHeaderCode));
        sb.append(',');
        sb.append("placeofSupplyName");
        sb.append('=');
        sb.append(((this.placeofSupplyName == null)?"<null>":this.placeofSupplyName));
        sb.append(',');
        sb.append("placeofSupplyId");
        sb.append('=');
        sb.append(((this.placeofSupplyId == null)?"<null>":this.placeofSupplyId));
        sb.append(',');
        sb.append("placeofSupplyCode");
        sb.append('=');
        sb.append(((this.placeofSupplyCode == null)?"<null>":this.placeofSupplyCode));
        sb.append(',');
        sb.append("regionName");
        sb.append('=');
        sb.append(((this.regionName == null)?"<null>":this.regionName));
        sb.append(',');
        sb.append("regionId");
        sb.append('=');
        sb.append(((this.regionId == null)?"<null>":this.regionId));
        sb.append(',');
        sb.append("regionCode");
        sb.append('=');
        sb.append(((this.regionCode == null)?"<null>":this.regionCode));
        sb.append(',');
        sb.append("iStartDate");
        sb.append('=');
        sb.append(((this.iStartDate == null)?"<null>":this.iStartDate));
        sb.append(',');
        sb.append("lineItems");
        sb.append('=');
        sb.append(((this.lineItems == null)?"<null>":this.lineItems));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
