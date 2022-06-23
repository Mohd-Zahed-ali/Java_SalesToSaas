
package com.centrahub.Product.dto;

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
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("ProductType")
    @Expose
    private String productType;
    @SerializedName("ReorderLevel")
    @Expose
    private String reorderLevel;
    @SerializedName("BinCapacity")
    @Expose
    private String binCapacity;
    @SerializedName("ValuationMethod")
    @Expose
    private String valuationMethod;
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
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("GuaranteeDays")
    @Expose
    private String guaranteeDays;
    @SerializedName("LightUserDiscPercentage")
    @Expose
    private String lightUserDiscPercentage;
    @SerializedName("bIsEInvoice")
    @Expose
    private String bIsEInvoice;
    @SerializedName("LMSProduct__name")
    @Expose
    private String lMSProductName;
    @SerializedName("LMSProduct__id")
    @Expose
    private String lMSProductId;
    @SerializedName("bIsFocusXProduct")
    @Expose
    private String bIsFocusXProduct;
    @SerializedName("i3PERPType")
    @Expose
    private String i3PERPType;
    @SerializedName("s3PERPVoucherNo")
    @Expose
    private String s3PERPVoucherNo;
    @SerializedName("i3PERPDateTime")
    @Expose
    private String i3PERPDateTime;
    @SerializedName("s3PERPCompany")
    @Expose
    private String s3PERPCompany;
    @SerializedName("s3PERPVoucherType")
    @Expose
    private String s3PERPVoucherType;
    @SerializedName("ExpiredDate")
    @Expose
    private String expiredDate;
    @SerializedName("iExciseTransferTo__name")
    @Expose
    private String iExciseTransferToName;
    @SerializedName("iExciseTransferTo__id")
    @Expose
    private String iExciseTransferToId;
    @SerializedName("STDHrs")
    @Expose
    private String sTDHrs;
    @SerializedName("CDIDTemplate")
    @Expose
    private String cDIDTemplate;
    @SerializedName("fRatePerEmpIndia")
    @Expose
    private String fRatePerEmpIndia;
    @SerializedName("fRatePerEmpGlobal")
    @Expose
    private String fRatePerEmpGlobal;
    @SerializedName("iNoofCores__name")
    @Expose
    private String iNoofCoresName;
    @SerializedName("iNoofCores__id")
    @Expose
    private String iNoofCoresId;
    @SerializedName("iNoofCores__code")
    @Expose
    private String iNoofCoresCode;
    @SerializedName("iRAM__name")
    @Expose
    private String iRAMName;
    @SerializedName("iRAM__id")
    @Expose
    private String iRAMId;
    @SerializedName("iRAM__code")
    @Expose
    private String iRAMCode;
    @SerializedName("iHDD__name")
    @Expose
    private String iHDDName;
    @SerializedName("iHDD__id")
    @Expose
    private String iHDDId;
    @SerializedName("iHDD__code")
    @Expose
    private String iHDDCode;
    @SerializedName("iSQLExists")
    @Expose
    private String iSQLExists;
    @SerializedName("bIsHardwareProducts")
    @Expose
    private String bIsHardwareProducts;
    @SerializedName("iFlag")
    @Expose
    private String iFlag;
    @SerializedName("Unit__name")
    @Expose
    private String unitName;
    @SerializedName("Unit__id")
    @Expose
    private String unitId;
    @SerializedName("Unit__code")
    @Expose
    private String unitCode;
    @SerializedName("ProductImage")
    @Expose
    private ProductImage productImage;
    @SerializedName("SaleRate")
    @Expose
    private String saleRate;
    @SerializedName("SaleAccount__name")
    @Expose
    private String saleAccountName;
    @SerializedName("SaleAccount__id")
    @Expose
    private String saleAccountId;
    @SerializedName("SaleAccount__code")
    @Expose
    private String saleAccountCode;
    @SerializedName("Tax__name")
    @Expose
    private String taxName;
    @SerializedName("Tax__id")
    @Expose
    private String taxId;
    @SerializedName("PurchaseRate")
    @Expose
    private String purchaseRate;
    @SerializedName("PurchaseAccount__name")
    @Expose
    private String purchaseAccountName;
    @SerializedName("PurchaseAccount__id")
    @Expose
    private String purchaseAccountId;
    @SerializedName("PurchaseAccount__code")
    @Expose
    private String purchaseAccountCode;
    @SerializedName("PurchaseDescription")
    @Expose
    private String purchaseDescription;
    @SerializedName("TrackInventory")
    @Expose
    private String trackInventory;
    @SerializedName("Account__name")
    @Expose
    private String accountName;
    @SerializedName("Account__id")
    @Expose
    private String accountId;
    @SerializedName("Account__code")
    @Expose
    private String accountCode;
    @SerializedName("OpeningStock")
    @Expose
    private String openingStock;
    @SerializedName("OpeningStockRatePerUnit")
    @Expose
    private String openingStockRatePerUnit;
    @SerializedName("ReOrderPoint")
    @Expose
    private String reOrderPoint;
    @SerializedName("PreferredVendor__name")
    @Expose
    private String preferredVendorName;
    @SerializedName("PreferredVendor__id")
    @Expose
    private String preferredVendorId;
    @SerializedName("PreferredVendor__code")
    @Expose
    private String preferredVendorCode;
    @SerializedName("WarrantyDays")
    @Expose
    private String warrantyDays;
    @SerializedName("ProductGroup__name")
    @Expose
    private String productGroupName;
    @SerializedName("ProductGroup__id")
    @Expose
    private String productGroupId;
    @SerializedName("ProductGroup__code")
    @Expose
    private String productGroupCode;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("FocusField")
    @Expose
    private String focusField;
    @SerializedName("fFocusPoints")
    @Expose
    private String fFocusPoints;
    @SerializedName("fFocusCallDuration")
    @Expose
    private String fFocusCallDuration;
    @SerializedName("fAMC")
    @Expose
    private String fAMC;
    @SerializedName("Warrantydays")
    @Expose
    private String warrantydays;
    @SerializedName("sProdType")
    @Expose
    private String sProdType;
    @SerializedName("iErrorTransfer__name")
    @Expose
    private String iErrorTransferName;
    @SerializedName("iErrorTransfer__id")
    @Expose
    private String iErrorTransferId;
    @SerializedName("iAPIAssignedTo__name")
    @Expose
    private String iAPIAssignedToName;
    @SerializedName("iAPIAssignedTo__id")
    @Expose
    private String iAPIAssignedToId;
    @SerializedName("iDevTaskTransferTo__name")
    @Expose
    private String iDevTaskTransferToName;
    @SerializedName("iDevTaskTransferTo__id")
    @Expose
    private String iDevTaskTransferToId;
    @SerializedName("iIDEAOwner__name")
    @Expose
    private String iIDEAOwnerName;
    @SerializedName("iIDEAOwner__id")
    @Expose
    private String iIDEAOwnerId;
    @SerializedName("iBaseUsers")
    @Expose
    private String iBaseUsers;
    @SerializedName("ProductCategory__name")
    @Expose
    private String productCategoryName;
    @SerializedName("ProductCategory__id")
    @Expose
    private String productCategoryId;
    @SerializedName("ProductCategory__code")
    @Expose
    private String productCategoryCode;
    @SerializedName("LifeSpanCycle")
    @Expose
    private String lifeSpanCycle;
    @SerializedName("DemoSpanCycle")
    @Expose
    private String demoSpanCycle;
    @SerializedName("DefaultBasePowerUser")
    @Expose
    private String defaultBasePowerUser;
    @SerializedName("DefaultAdditionalUser")
    @Expose
    private String defaultAdditionalUser;
    @SerializedName("DefaultLightUser")
    @Expose
    private String defaultLightUser;
    @SerializedName("DefaultExternalUser")
    @Expose
    private String defaultExternalUser;
    @SerializedName("Impl")
    @Expose
    private String impl;
    @SerializedName("IsSpecialProduct")
    @Expose
    private String isSpecialProduct;
    @SerializedName("TaxCode__name")
    @Expose
    private String taxCodeName;
    @SerializedName("TaxCode__id")
    @Expose
    private String taxCodeId;
    @SerializedName("TaxCode__code")
    @Expose
    private String taxCodeCode;
    @SerializedName("ContractRequired")
    @Expose
    private String contractRequired;
    @SerializedName("ProductType1")
    @Expose
    private String productType1;
    @SerializedName("bIsActive")
    @Expose
    private String bIsActive;
    @SerializedName("iCalcValue")
    @Expose
    private String iCalcValue;
    @SerializedName("bIgnoreCDID")
    @Expose
    private String bIgnoreCDID;
    @SerializedName("LicensingType")
    @Expose
    private String licensingType;
    @SerializedName("LMSProductType")
    @Expose
    private String lMSProductType;
    @SerializedName("bSurveyRequired")
    @Expose
    private String bSurveyRequired;
    @SerializedName("DefaultBaseUnit__name")
    @Expose
    private String defaultBaseUnitName;
    @SerializedName("DefaultBaseUnit__id")
    @Expose
    private String defaultBaseUnitId;
    @SerializedName("DefaultBaseUnit__code")
    @Expose
    private String defaultBaseUnitCode;
    @SerializedName("lineItems")
    @Expose
    private List<LineItem> lineItems = null;
    private final static long serialVersionUID = 2289670979270260145L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param binCapacity
     * @param iErrorTransferName
     * @param expiredDate
     * @param saleAccountCode
     * @param licensingType
     * @param reorderLevel
     * @param cDIDTemplate
     * @param impl
     * @param iSQLExists
     * @param productGroupCode
     * @param demoSpanCycle
     * @param defaultLightUser
     * @param unitCode
     * @param warrantyDays
     * @param bSurveyRequired
     * @param valuationMethod
     * @param trackInventory
     * @param i3PERPType
     * @param reOrderPoint
     * @param createdById
     * @param contractRequired
     * @param defaultBaseUnitName
     * @param warrantydays
     * @param productCategoryCode
     * @param accountCode
     * @param iErrorTransferId
     * @param accountId
     * @param lMSProductId
     * @param purchaseDescription
     * @param isSpecialProduct
     * @param bIsActive
     * @param iRAMId
     * @param i3PERPDateTime
     * @param assignedToId
     * @param fFocusCallDuration
     * @param iExciseTransferToId
     * @param lMSProductType
     * @param s3PERPVoucherNo
     * @param s3PERPCompany
     * @param iRAMName
     * @param taxCodeName
     * @param isRead
     * @param taxName
     * @param iHDDCode
     * @param bIsFocusXProduct
     * @param fFocusPoints
     * @param modifiedByName
     * @param iAPIAssignedToName
     * @param productCategoryId
     * @param iNoofCoresCode
     * @param preferredVendorId
     * @param iDevTaskTransferToId
     * @param unitId
     * @param preferredVendorCode
     * @param iDevTaskTransferToName
     * @param fAMC
     * @param defaultExternalUser
     * @param purchaseAccountId
     * @param productType1
     * @param saleAccountName
     * @param sProdType
     * @param createdDate
     * @param iHDDId
     * @param defaultBaseUnitCode
     * @param attributes
     * @param lightUserDiscPercentage
     * @param sTDHrs
     * @param s3PERPVoucherType
     * @param createdByName
     * @param openingStockRatePerUnit
     * @param focusField
     * @param productCategoryName
     * @param productGroupId
     * @param bIsHardwareProducts
     * @param saleAccountId
     * @param lineItems
     * @param purchaseRate
     * @param productImage
     * @param modifiedById
     * @param iIDEAOwnerName
     * @param defaultBasePowerUser
     * @param iExciseTransferToName
     * @param fRatePerEmpIndia
     * @param iFlag
     * @param purchaseAccountCode
     * @param iIDEAOwnerId
     * @param saleRate
     * @param unitName
     * @param iNoofCoresId
     * @param defaultAdditionalUser
     * @param productGroupName
     * @param taxCodeId
     * @param bIsEInvoice
     * @param guaranteeDays
     * @param taxId
     * @param modifiedDate
     * @param name
     * @param lMSProductName
     * @param preferredVendorName
     * @param isGroup
     * @param bIgnoreCDID
     * @param code
     * @param iNoofCoresName
     * @param accountName
     * @param assignedToName
     * @param description
     * @param iAPIAssignedToId
     * @param openingStock
     * @param taxCodeCode
     * @param productType
     * @param iRAMCode
     * @param iHDDName
     * @param iCalcValue
     * @param defaultBaseUnitId
     * @param lifeSpanCycle
     * @param masterId
     * @param iBaseUsers
     * @param fRatePerEmpGlobal
     * @param purchaseAccountName
     */
    public Record(Attributes attributes, String masterId, String code, String productType, String reorderLevel, String binCapacity, String valuationMethod, String isGroup, String createdByName, String createdById, String modifiedByName, String modifiedById, String createdDate, String modifiedDate, String name, String guaranteeDays, String lightUserDiscPercentage, String bIsEInvoice, String lMSProductName, String lMSProductId, String bIsFocusXProduct, String i3PERPType, String s3PERPVoucherNo, String i3PERPDateTime, String s3PERPCompany, String s3PERPVoucherType, String expiredDate, String iExciseTransferToName, String iExciseTransferToId, String sTDHrs, String cDIDTemplate, String fRatePerEmpIndia, String fRatePerEmpGlobal, String iNoofCoresName, String iNoofCoresId, String iNoofCoresCode, String iRAMName, String iRAMId, String iRAMCode, String iHDDName, String iHDDId, String iHDDCode, String iSQLExists, String bIsHardwareProducts, String iFlag, String unitName, String unitId, String unitCode, ProductImage productImage, String saleRate, String saleAccountName, String saleAccountId, String saleAccountCode, String taxName, String taxId, String purchaseRate, String purchaseAccountName, String purchaseAccountId, String purchaseAccountCode, String purchaseDescription, String trackInventory, String accountName, String accountId, String accountCode, String openingStock, String openingStockRatePerUnit, String reOrderPoint, String preferredVendorName, String preferredVendorId, String preferredVendorCode, String warrantyDays, String productGroupName, String productGroupId, String productGroupCode, String description, String assignedToName, String assignedToId, String isRead, String focusField, String fFocusPoints, String fFocusCallDuration, String fAMC, String warrantydays, String sProdType, String iErrorTransferName, String iErrorTransferId, String iAPIAssignedToName, String iAPIAssignedToId, String iDevTaskTransferToName, String iDevTaskTransferToId, String iIDEAOwnerName, String iIDEAOwnerId, String iBaseUsers, String productCategoryName, String productCategoryId, String productCategoryCode, String lifeSpanCycle, String demoSpanCycle, String defaultBasePowerUser, String defaultAdditionalUser, String defaultLightUser, String defaultExternalUser, String impl, String isSpecialProduct, String taxCodeName, String taxCodeId, String taxCodeCode, String contractRequired, String productType1, String bIsActive, String iCalcValue, String bIgnoreCDID, String licensingType, String lMSProductType, String bSurveyRequired, String defaultBaseUnitName, String defaultBaseUnitId, String defaultBaseUnitCode, List<LineItem> lineItems) {
        super();
        this.attributes = attributes;
        this.masterId = masterId;
        this.code = code;
        this.productType = productType;
        this.reorderLevel = reorderLevel;
        this.binCapacity = binCapacity;
        this.valuationMethod = valuationMethod;
        this.isGroup = isGroup;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.name = name;
        this.guaranteeDays = guaranteeDays;
        this.lightUserDiscPercentage = lightUserDiscPercentage;
        this.bIsEInvoice = bIsEInvoice;
        this.lMSProductName = lMSProductName;
        this.lMSProductId = lMSProductId;
        this.bIsFocusXProduct = bIsFocusXProduct;
        this.i3PERPType = i3PERPType;
        this.s3PERPVoucherNo = s3PERPVoucherNo;
        this.i3PERPDateTime = i3PERPDateTime;
        this.s3PERPCompany = s3PERPCompany;
        this.s3PERPVoucherType = s3PERPVoucherType;
        this.expiredDate = expiredDate;
        this.iExciseTransferToName = iExciseTransferToName;
        this.iExciseTransferToId = iExciseTransferToId;
        this.sTDHrs = sTDHrs;
        this.cDIDTemplate = cDIDTemplate;
        this.fRatePerEmpIndia = fRatePerEmpIndia;
        this.fRatePerEmpGlobal = fRatePerEmpGlobal;
        this.iNoofCoresName = iNoofCoresName;
        this.iNoofCoresId = iNoofCoresId;
        this.iNoofCoresCode = iNoofCoresCode;
        this.iRAMName = iRAMName;
        this.iRAMId = iRAMId;
        this.iRAMCode = iRAMCode;
        this.iHDDName = iHDDName;
        this.iHDDId = iHDDId;
        this.iHDDCode = iHDDCode;
        this.iSQLExists = iSQLExists;
        this.bIsHardwareProducts = bIsHardwareProducts;
        this.iFlag = iFlag;
        this.unitName = unitName;
        this.unitId = unitId;
        this.unitCode = unitCode;
        this.productImage = productImage;
        this.saleRate = saleRate;
        this.saleAccountName = saleAccountName;
        this.saleAccountId = saleAccountId;
        this.saleAccountCode = saleAccountCode;
        this.taxName = taxName;
        this.taxId = taxId;
        this.purchaseRate = purchaseRate;
        this.purchaseAccountName = purchaseAccountName;
        this.purchaseAccountId = purchaseAccountId;
        this.purchaseAccountCode = purchaseAccountCode;
        this.purchaseDescription = purchaseDescription;
        this.trackInventory = trackInventory;
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.openingStock = openingStock;
        this.openingStockRatePerUnit = openingStockRatePerUnit;
        this.reOrderPoint = reOrderPoint;
        this.preferredVendorName = preferredVendorName;
        this.preferredVendorId = preferredVendorId;
        this.preferredVendorCode = preferredVendorCode;
        this.warrantyDays = warrantyDays;
        this.productGroupName = productGroupName;
        this.productGroupId = productGroupId;
        this.productGroupCode = productGroupCode;
        this.description = description;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.isRead = isRead;
        this.focusField = focusField;
        this.fFocusPoints = fFocusPoints;
        this.fFocusCallDuration = fFocusCallDuration;
        this.fAMC = fAMC;
        this.warrantydays = warrantydays;
        this.sProdType = sProdType;
        this.iErrorTransferName = iErrorTransferName;
        this.iErrorTransferId = iErrorTransferId;
        this.iAPIAssignedToName = iAPIAssignedToName;
        this.iAPIAssignedToId = iAPIAssignedToId;
        this.iDevTaskTransferToName = iDevTaskTransferToName;
        this.iDevTaskTransferToId = iDevTaskTransferToId;
        this.iIDEAOwnerName = iIDEAOwnerName;
        this.iIDEAOwnerId = iIDEAOwnerId;
        this.iBaseUsers = iBaseUsers;
        this.productCategoryName = productCategoryName;
        this.productCategoryId = productCategoryId;
        this.productCategoryCode = productCategoryCode;
        this.lifeSpanCycle = lifeSpanCycle;
        this.demoSpanCycle = demoSpanCycle;
        this.defaultBasePowerUser = defaultBasePowerUser;
        this.defaultAdditionalUser = defaultAdditionalUser;
        this.defaultLightUser = defaultLightUser;
        this.defaultExternalUser = defaultExternalUser;
        this.impl = impl;
        this.isSpecialProduct = isSpecialProduct;
        this.taxCodeName = taxCodeName;
        this.taxCodeId = taxCodeId;
        this.taxCodeCode = taxCodeCode;
        this.contractRequired = contractRequired;
        this.productType1 = productType1;
        this.bIsActive = bIsActive;
        this.iCalcValue = iCalcValue;
        this.bIgnoreCDID = bIgnoreCDID;
        this.licensingType = licensingType;
        this.lMSProductType = lMSProductType;
        this.bSurveyRequired = bSurveyRequired;
        this.defaultBaseUnitName = defaultBaseUnitName;
        this.defaultBaseUnitId = defaultBaseUnitId;
        this.defaultBaseUnitCode = defaultBaseUnitCode;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(String reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public String getBinCapacity() {
        return binCapacity;
    }

    public void setBinCapacity(String binCapacity) {
        this.binCapacity = binCapacity;
    }

    public String getValuationMethod() {
        return valuationMethod;
    }

    public void setValuationMethod(String valuationMethod) {
        this.valuationMethod = valuationMethod;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuaranteeDays() {
        return guaranteeDays;
    }

    public void setGuaranteeDays(String guaranteeDays) {
        this.guaranteeDays = guaranteeDays;
    }

    public String getLightUserDiscPercentage() {
        return lightUserDiscPercentage;
    }

    public void setLightUserDiscPercentage(String lightUserDiscPercentage) {
        this.lightUserDiscPercentage = lightUserDiscPercentage;
    }

    public String getbIsEInvoice() {
        return bIsEInvoice;
    }

    public void setbIsEInvoice(String bIsEInvoice) {
        this.bIsEInvoice = bIsEInvoice;
    }

    public String getLMSProductName() {
        return lMSProductName;
    }

    public void setLMSProductName(String lMSProductName) {
        this.lMSProductName = lMSProductName;
    }

    public String getLMSProductId() {
        return lMSProductId;
    }

    public void setLMSProductId(String lMSProductId) {
        this.lMSProductId = lMSProductId;
    }

    public String getbIsFocusXProduct() {
        return bIsFocusXProduct;
    }

    public void setbIsFocusXProduct(String bIsFocusXProduct) {
        this.bIsFocusXProduct = bIsFocusXProduct;
    }

    public String getI3PERPType() {
        return i3PERPType;
    }

    public void setI3PERPType(String i3PERPType) {
        this.i3PERPType = i3PERPType;
    }

    public String getS3PERPVoucherNo() {
        return s3PERPVoucherNo;
    }

    public void setS3PERPVoucherNo(String s3PERPVoucherNo) {
        this.s3PERPVoucherNo = s3PERPVoucherNo;
    }

    public String getI3PERPDateTime() {
        return i3PERPDateTime;
    }

    public void setI3PERPDateTime(String i3PERPDateTime) {
        this.i3PERPDateTime = i3PERPDateTime;
    }

    public String getS3PERPCompany() {
        return s3PERPCompany;
    }

    public void setS3PERPCompany(String s3PERPCompany) {
        this.s3PERPCompany = s3PERPCompany;
    }

    public String getS3PERPVoucherType() {
        return s3PERPVoucherType;
    }

    public void setS3PERPVoucherType(String s3PERPVoucherType) {
        this.s3PERPVoucherType = s3PERPVoucherType;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getiExciseTransferToName() {
        return iExciseTransferToName;
    }

    public void setiExciseTransferToName(String iExciseTransferToName) {
        this.iExciseTransferToName = iExciseTransferToName;
    }

    public String getiExciseTransferToId() {
        return iExciseTransferToId;
    }

    public void setiExciseTransferToId(String iExciseTransferToId) {
        this.iExciseTransferToId = iExciseTransferToId;
    }

    public String getSTDHrs() {
        return sTDHrs;
    }

    public void setSTDHrs(String sTDHrs) {
        this.sTDHrs = sTDHrs;
    }

    public String getCDIDTemplate() {
        return cDIDTemplate;
    }

    public void setCDIDTemplate(String cDIDTemplate) {
        this.cDIDTemplate = cDIDTemplate;
    }

    public String getfRatePerEmpIndia() {
        return fRatePerEmpIndia;
    }

    public void setfRatePerEmpIndia(String fRatePerEmpIndia) {
        this.fRatePerEmpIndia = fRatePerEmpIndia;
    }

    public String getfRatePerEmpGlobal() {
        return fRatePerEmpGlobal;
    }

    public void setfRatePerEmpGlobal(String fRatePerEmpGlobal) {
        this.fRatePerEmpGlobal = fRatePerEmpGlobal;
    }

    public String getiNoofCoresName() {
        return iNoofCoresName;
    }

    public void setiNoofCoresName(String iNoofCoresName) {
        this.iNoofCoresName = iNoofCoresName;
    }

    public String getiNoofCoresId() {
        return iNoofCoresId;
    }

    public void setiNoofCoresId(String iNoofCoresId) {
        this.iNoofCoresId = iNoofCoresId;
    }

    public String getiNoofCoresCode() {
        return iNoofCoresCode;
    }

    public void setiNoofCoresCode(String iNoofCoresCode) {
        this.iNoofCoresCode = iNoofCoresCode;
    }

    public String getiRAMName() {
        return iRAMName;
    }

    public void setiRAMName(String iRAMName) {
        this.iRAMName = iRAMName;
    }

    public String getiRAMId() {
        return iRAMId;
    }

    public void setiRAMId(String iRAMId) {
        this.iRAMId = iRAMId;
    }

    public String getiRAMCode() {
        return iRAMCode;
    }

    public void setiRAMCode(String iRAMCode) {
        this.iRAMCode = iRAMCode;
    }

    public String getiHDDName() {
        return iHDDName;
    }

    public void setiHDDName(String iHDDName) {
        this.iHDDName = iHDDName;
    }

    public String getiHDDId() {
        return iHDDId;
    }

    public void setiHDDId(String iHDDId) {
        this.iHDDId = iHDDId;
    }

    public String getiHDDCode() {
        return iHDDCode;
    }

    public void setiHDDCode(String iHDDCode) {
        this.iHDDCode = iHDDCode;
    }

    public String getiSQLExists() {
        return iSQLExists;
    }

    public void setiSQLExists(String iSQLExists) {
        this.iSQLExists = iSQLExists;
    }

    public String getbIsHardwareProducts() {
        return bIsHardwareProducts;
    }

    public void setbIsHardwareProducts(String bIsHardwareProducts) {
        this.bIsHardwareProducts = bIsHardwareProducts;
    }

    public String getiFlag() {
        return iFlag;
    }

    public void setiFlag(String iFlag) {
        this.iFlag = iFlag;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public ProductImage getProductImage() {
        return productImage;
    }

    public void setProductImage(ProductImage productImage) {
        this.productImage = productImage;
    }

    public String getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(String saleRate) {
        this.saleRate = saleRate;
    }

    public String getSaleAccountName() {
        return saleAccountName;
    }

    public void setSaleAccountName(String saleAccountName) {
        this.saleAccountName = saleAccountName;
    }

    public String getSaleAccountId() {
        return saleAccountId;
    }

    public void setSaleAccountId(String saleAccountId) {
        this.saleAccountId = saleAccountId;
    }

    public String getSaleAccountCode() {
        return saleAccountCode;
    }

    public void setSaleAccountCode(String saleAccountCode) {
        this.saleAccountCode = saleAccountCode;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(String purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public String getPurchaseAccountName() {
        return purchaseAccountName;
    }

    public void setPurchaseAccountName(String purchaseAccountName) {
        this.purchaseAccountName = purchaseAccountName;
    }

    public String getPurchaseAccountId() {
        return purchaseAccountId;
    }

    public void setPurchaseAccountId(String purchaseAccountId) {
        this.purchaseAccountId = purchaseAccountId;
    }

    public String getPurchaseAccountCode() {
        return purchaseAccountCode;
    }

    public void setPurchaseAccountCode(String purchaseAccountCode) {
        this.purchaseAccountCode = purchaseAccountCode;
    }

    public String getPurchaseDescription() {
        return purchaseDescription;
    }

    public void setPurchaseDescription(String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public String getTrackInventory() {
        return trackInventory;
    }

    public void setTrackInventory(String trackInventory) {
        this.trackInventory = trackInventory;
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

    public String getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(String openingStock) {
        this.openingStock = openingStock;
    }

    public String getOpeningStockRatePerUnit() {
        return openingStockRatePerUnit;
    }

    public void setOpeningStockRatePerUnit(String openingStockRatePerUnit) {
        this.openingStockRatePerUnit = openingStockRatePerUnit;
    }

    public String getReOrderPoint() {
        return reOrderPoint;
    }

    public void setReOrderPoint(String reOrderPoint) {
        this.reOrderPoint = reOrderPoint;
    }

    public String getPreferredVendorName() {
        return preferredVendorName;
    }

    public void setPreferredVendorName(String preferredVendorName) {
        this.preferredVendorName = preferredVendorName;
    }

    public String getPreferredVendorId() {
        return preferredVendorId;
    }

    public void setPreferredVendorId(String preferredVendorId) {
        this.preferredVendorId = preferredVendorId;
    }

    public String getPreferredVendorCode() {
        return preferredVendorCode;
    }

    public void setPreferredVendorCode(String preferredVendorCode) {
        this.preferredVendorCode = preferredVendorCode;
    }

    public String getWarrantyDays() {
        return warrantyDays;
    }

    public void setWarrantyDays(String warrantyDays) {
        this.warrantyDays = warrantyDays;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public String getProductGroupId() {
        return productGroupId;
    }

    public void setProductGroupId(String productGroupId) {
        this.productGroupId = productGroupId;
    }

    public String getProductGroupCode() {
        return productGroupCode;
    }

    public void setProductGroupCode(String productGroupCode) {
        this.productGroupCode = productGroupCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getFocusField() {
        return focusField;
    }

    public void setFocusField(String focusField) {
        this.focusField = focusField;
    }

    public String getfFocusPoints() {
        return fFocusPoints;
    }

    public void setfFocusPoints(String fFocusPoints) {
        this.fFocusPoints = fFocusPoints;
    }

    public String getfFocusCallDuration() {
        return fFocusCallDuration;
    }

    public void setfFocusCallDuration(String fFocusCallDuration) {
        this.fFocusCallDuration = fFocusCallDuration;
    }

    public String getfAMC() {
        return fAMC;
    }

    public void setfAMC(String fAMC) {
        this.fAMC = fAMC;
    }

    public String getWarrantydays() {
        return warrantydays;
    }

    public void setWarrantydays(String warrantydays) {
        this.warrantydays = warrantydays;
    }

    public String getsProdType() {
        return sProdType;
    }

    public void setsProdType(String sProdType) {
        this.sProdType = sProdType;
    }

    public String getiErrorTransferName() {
        return iErrorTransferName;
    }

    public void setiErrorTransferName(String iErrorTransferName) {
        this.iErrorTransferName = iErrorTransferName;
    }

    public String getiErrorTransferId() {
        return iErrorTransferId;
    }

    public void setiErrorTransferId(String iErrorTransferId) {
        this.iErrorTransferId = iErrorTransferId;
    }

    public String getiAPIAssignedToName() {
        return iAPIAssignedToName;
    }

    public void setiAPIAssignedToName(String iAPIAssignedToName) {
        this.iAPIAssignedToName = iAPIAssignedToName;
    }

    public String getiAPIAssignedToId() {
        return iAPIAssignedToId;
    }

    public void setiAPIAssignedToId(String iAPIAssignedToId) {
        this.iAPIAssignedToId = iAPIAssignedToId;
    }

    public String getiDevTaskTransferToName() {
        return iDevTaskTransferToName;
    }

    public void setiDevTaskTransferToName(String iDevTaskTransferToName) {
        this.iDevTaskTransferToName = iDevTaskTransferToName;
    }

    public String getiDevTaskTransferToId() {
        return iDevTaskTransferToId;
    }

    public void setiDevTaskTransferToId(String iDevTaskTransferToId) {
        this.iDevTaskTransferToId = iDevTaskTransferToId;
    }

    public String getiIDEAOwnerName() {
        return iIDEAOwnerName;
    }

    public void setiIDEAOwnerName(String iIDEAOwnerName) {
        this.iIDEAOwnerName = iIDEAOwnerName;
    }

    public String getiIDEAOwnerId() {
        return iIDEAOwnerId;
    }

    public void setiIDEAOwnerId(String iIDEAOwnerId) {
        this.iIDEAOwnerId = iIDEAOwnerId;
    }

    public String getiBaseUsers() {
        return iBaseUsers;
    }

    public void setiBaseUsers(String iBaseUsers) {
        this.iBaseUsers = iBaseUsers;
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

    public String getLifeSpanCycle() {
        return lifeSpanCycle;
    }

    public void setLifeSpanCycle(String lifeSpanCycle) {
        this.lifeSpanCycle = lifeSpanCycle;
    }

    public String getDemoSpanCycle() {
        return demoSpanCycle;
    }

    public void setDemoSpanCycle(String demoSpanCycle) {
        this.demoSpanCycle = demoSpanCycle;
    }

    public String getDefaultBasePowerUser() {
        return defaultBasePowerUser;
    }

    public void setDefaultBasePowerUser(String defaultBasePowerUser) {
        this.defaultBasePowerUser = defaultBasePowerUser;
    }

    public String getDefaultAdditionalUser() {
        return defaultAdditionalUser;
    }

    public void setDefaultAdditionalUser(String defaultAdditionalUser) {
        this.defaultAdditionalUser = defaultAdditionalUser;
    }

    public String getDefaultLightUser() {
        return defaultLightUser;
    }

    public void setDefaultLightUser(String defaultLightUser) {
        this.defaultLightUser = defaultLightUser;
    }

    public String getDefaultExternalUser() {
        return defaultExternalUser;
    }

    public void setDefaultExternalUser(String defaultExternalUser) {
        this.defaultExternalUser = defaultExternalUser;
    }

    public String getImpl() {
        return impl;
    }

    public void setImpl(String impl) {
        this.impl = impl;
    }

    public String getIsSpecialProduct() {
        return isSpecialProduct;
    }

    public void setIsSpecialProduct(String isSpecialProduct) {
        this.isSpecialProduct = isSpecialProduct;
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

    public String getContractRequired() {
        return contractRequired;
    }

    public void setContractRequired(String contractRequired) {
        this.contractRequired = contractRequired;
    }

    public String getProductType1() {
        return productType1;
    }

    public void setProductType1(String productType1) {
        this.productType1 = productType1;
    }

    public String getbIsActive() {
        return bIsActive;
    }

    public void setbIsActive(String bIsActive) {
        this.bIsActive = bIsActive;
    }

    public String getiCalcValue() {
        return iCalcValue;
    }

    public void setiCalcValue(String iCalcValue) {
        this.iCalcValue = iCalcValue;
    }

    public String getbIgnoreCDID() {
        return bIgnoreCDID;
    }

    public void setbIgnoreCDID(String bIgnoreCDID) {
        this.bIgnoreCDID = bIgnoreCDID;
    }

    public String getLicensingType() {
        return licensingType;
    }

    public void setLicensingType(String licensingType) {
        this.licensingType = licensingType;
    }

    public String getLMSProductType() {
        return lMSProductType;
    }

    public void setLMSProductType(String lMSProductType) {
        this.lMSProductType = lMSProductType;
    }

    public String getbSurveyRequired() {
        return bSurveyRequired;
    }

    public void setbSurveyRequired(String bSurveyRequired) {
        this.bSurveyRequired = bSurveyRequired;
    }

    public String getDefaultBaseUnitName() {
        return defaultBaseUnitName;
    }

    public void setDefaultBaseUnitName(String defaultBaseUnitName) {
        this.defaultBaseUnitName = defaultBaseUnitName;
    }

    public String getDefaultBaseUnitId() {
        return defaultBaseUnitId;
    }

    public void setDefaultBaseUnitId(String defaultBaseUnitId) {
        this.defaultBaseUnitId = defaultBaseUnitId;
    }

    public String getDefaultBaseUnitCode() {
        return defaultBaseUnitCode;
    }

    public void setDefaultBaseUnitCode(String defaultBaseUnitCode) {
        this.defaultBaseUnitCode = defaultBaseUnitCode;
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
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(((this.productType == null)?"<null>":this.productType));
        sb.append(',');
        sb.append("reorderLevel");
        sb.append('=');
        sb.append(((this.reorderLevel == null)?"<null>":this.reorderLevel));
        sb.append(',');
        sb.append("binCapacity");
        sb.append('=');
        sb.append(((this.binCapacity == null)?"<null>":this.binCapacity));
        sb.append(',');
        sb.append("valuationMethod");
        sb.append('=');
        sb.append(((this.valuationMethod == null)?"<null>":this.valuationMethod));
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("guaranteeDays");
        sb.append('=');
        sb.append(((this.guaranteeDays == null)?"<null>":this.guaranteeDays));
        sb.append(',');
        sb.append("lightUserDiscPercentage");
        sb.append('=');
        sb.append(((this.lightUserDiscPercentage == null)?"<null>":this.lightUserDiscPercentage));
        sb.append(',');
        sb.append("bIsEInvoice");
        sb.append('=');
        sb.append(((this.bIsEInvoice == null)?"<null>":this.bIsEInvoice));
        sb.append(',');
        sb.append("lMSProductName");
        sb.append('=');
        sb.append(((this.lMSProductName == null)?"<null>":this.lMSProductName));
        sb.append(',');
        sb.append("lMSProductId");
        sb.append('=');
        sb.append(((this.lMSProductId == null)?"<null>":this.lMSProductId));
        sb.append(',');
        sb.append("bIsFocusXProduct");
        sb.append('=');
        sb.append(((this.bIsFocusXProduct == null)?"<null>":this.bIsFocusXProduct));
        sb.append(',');
        sb.append("i3PERPType");
        sb.append('=');
        sb.append(((this.i3PERPType == null)?"<null>":this.i3PERPType));
        sb.append(',');
        sb.append("s3PERPVoucherNo");
        sb.append('=');
        sb.append(((this.s3PERPVoucherNo == null)?"<null>":this.s3PERPVoucherNo));
        sb.append(',');
        sb.append("i3PERPDateTime");
        sb.append('=');
        sb.append(((this.i3PERPDateTime == null)?"<null>":this.i3PERPDateTime));
        sb.append(',');
        sb.append("s3PERPCompany");
        sb.append('=');
        sb.append(((this.s3PERPCompany == null)?"<null>":this.s3PERPCompany));
        sb.append(',');
        sb.append("s3PERPVoucherType");
        sb.append('=');
        sb.append(((this.s3PERPVoucherType == null)?"<null>":this.s3PERPVoucherType));
        sb.append(',');
        sb.append("expiredDate");
        sb.append('=');
        sb.append(((this.expiredDate == null)?"<null>":this.expiredDate));
        sb.append(',');
        sb.append("iExciseTransferToName");
        sb.append('=');
        sb.append(((this.iExciseTransferToName == null)?"<null>":this.iExciseTransferToName));
        sb.append(',');
        sb.append("iExciseTransferToId");
        sb.append('=');
        sb.append(((this.iExciseTransferToId == null)?"<null>":this.iExciseTransferToId));
        sb.append(',');
        sb.append("sTDHrs");
        sb.append('=');
        sb.append(((this.sTDHrs == null)?"<null>":this.sTDHrs));
        sb.append(',');
        sb.append("cDIDTemplate");
        sb.append('=');
        sb.append(((this.cDIDTemplate == null)?"<null>":this.cDIDTemplate));
        sb.append(',');
        sb.append("fRatePerEmpIndia");
        sb.append('=');
        sb.append(((this.fRatePerEmpIndia == null)?"<null>":this.fRatePerEmpIndia));
        sb.append(',');
        sb.append("fRatePerEmpGlobal");
        sb.append('=');
        sb.append(((this.fRatePerEmpGlobal == null)?"<null>":this.fRatePerEmpGlobal));
        sb.append(',');
        sb.append("iNoofCoresName");
        sb.append('=');
        sb.append(((this.iNoofCoresName == null)?"<null>":this.iNoofCoresName));
        sb.append(',');
        sb.append("iNoofCoresId");
        sb.append('=');
        sb.append(((this.iNoofCoresId == null)?"<null>":this.iNoofCoresId));
        sb.append(',');
        sb.append("iNoofCoresCode");
        sb.append('=');
        sb.append(((this.iNoofCoresCode == null)?"<null>":this.iNoofCoresCode));
        sb.append(',');
        sb.append("iRAMName");
        sb.append('=');
        sb.append(((this.iRAMName == null)?"<null>":this.iRAMName));
        sb.append(',');
        sb.append("iRAMId");
        sb.append('=');
        sb.append(((this.iRAMId == null)?"<null>":this.iRAMId));
        sb.append(',');
        sb.append("iRAMCode");
        sb.append('=');
        sb.append(((this.iRAMCode == null)?"<null>":this.iRAMCode));
        sb.append(',');
        sb.append("iHDDName");
        sb.append('=');
        sb.append(((this.iHDDName == null)?"<null>":this.iHDDName));
        sb.append(',');
        sb.append("iHDDId");
        sb.append('=');
        sb.append(((this.iHDDId == null)?"<null>":this.iHDDId));
        sb.append(',');
        sb.append("iHDDCode");
        sb.append('=');
        sb.append(((this.iHDDCode == null)?"<null>":this.iHDDCode));
        sb.append(',');
        sb.append("iSQLExists");
        sb.append('=');
        sb.append(((this.iSQLExists == null)?"<null>":this.iSQLExists));
        sb.append(',');
        sb.append("bIsHardwareProducts");
        sb.append('=');
        sb.append(((this.bIsHardwareProducts == null)?"<null>":this.bIsHardwareProducts));
        sb.append(',');
        sb.append("iFlag");
        sb.append('=');
        sb.append(((this.iFlag == null)?"<null>":this.iFlag));
        sb.append(',');
        sb.append("unitName");
        sb.append('=');
        sb.append(((this.unitName == null)?"<null>":this.unitName));
        sb.append(',');
        sb.append("unitId");
        sb.append('=');
        sb.append(((this.unitId == null)?"<null>":this.unitId));
        sb.append(',');
        sb.append("unitCode");
        sb.append('=');
        sb.append(((this.unitCode == null)?"<null>":this.unitCode));
        sb.append(',');
        sb.append("productImage");
        sb.append('=');
        sb.append(((this.productImage == null)?"<null>":this.productImage));
        sb.append(',');
        sb.append("saleRate");
        sb.append('=');
        sb.append(((this.saleRate == null)?"<null>":this.saleRate));
        sb.append(',');
        sb.append("saleAccountName");
        sb.append('=');
        sb.append(((this.saleAccountName == null)?"<null>":this.saleAccountName));
        sb.append(',');
        sb.append("saleAccountId");
        sb.append('=');
        sb.append(((this.saleAccountId == null)?"<null>":this.saleAccountId));
        sb.append(',');
        sb.append("saleAccountCode");
        sb.append('=');
        sb.append(((this.saleAccountCode == null)?"<null>":this.saleAccountCode));
        sb.append(',');
        sb.append("taxName");
        sb.append('=');
        sb.append(((this.taxName == null)?"<null>":this.taxName));
        sb.append(',');
        sb.append("taxId");
        sb.append('=');
        sb.append(((this.taxId == null)?"<null>":this.taxId));
        sb.append(',');
        sb.append("purchaseRate");
        sb.append('=');
        sb.append(((this.purchaseRate == null)?"<null>":this.purchaseRate));
        sb.append(',');
        sb.append("purchaseAccountName");
        sb.append('=');
        sb.append(((this.purchaseAccountName == null)?"<null>":this.purchaseAccountName));
        sb.append(',');
        sb.append("purchaseAccountId");
        sb.append('=');
        sb.append(((this.purchaseAccountId == null)?"<null>":this.purchaseAccountId));
        sb.append(',');
        sb.append("purchaseAccountCode");
        sb.append('=');
        sb.append(((this.purchaseAccountCode == null)?"<null>":this.purchaseAccountCode));
        sb.append(',');
        sb.append("purchaseDescription");
        sb.append('=');
        sb.append(((this.purchaseDescription == null)?"<null>":this.purchaseDescription));
        sb.append(',');
        sb.append("trackInventory");
        sb.append('=');
        sb.append(((this.trackInventory == null)?"<null>":this.trackInventory));
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
        sb.append("openingStock");
        sb.append('=');
        sb.append(((this.openingStock == null)?"<null>":this.openingStock));
        sb.append(',');
        sb.append("openingStockRatePerUnit");
        sb.append('=');
        sb.append(((this.openingStockRatePerUnit == null)?"<null>":this.openingStockRatePerUnit));
        sb.append(',');
        sb.append("reOrderPoint");
        sb.append('=');
        sb.append(((this.reOrderPoint == null)?"<null>":this.reOrderPoint));
        sb.append(',');
        sb.append("preferredVendorName");
        sb.append('=');
        sb.append(((this.preferredVendorName == null)?"<null>":this.preferredVendorName));
        sb.append(',');
        sb.append("preferredVendorId");
        sb.append('=');
        sb.append(((this.preferredVendorId == null)?"<null>":this.preferredVendorId));
        sb.append(',');
        sb.append("preferredVendorCode");
        sb.append('=');
        sb.append(((this.preferredVendorCode == null)?"<null>":this.preferredVendorCode));
        sb.append(',');
        sb.append("warrantyDays");
        sb.append('=');
        sb.append(((this.warrantyDays == null)?"<null>":this.warrantyDays));
        sb.append(',');
        sb.append("productGroupName");
        sb.append('=');
        sb.append(((this.productGroupName == null)?"<null>":this.productGroupName));
        sb.append(',');
        sb.append("productGroupId");
        sb.append('=');
        sb.append(((this.productGroupId == null)?"<null>":this.productGroupId));
        sb.append(',');
        sb.append("productGroupCode");
        sb.append('=');
        sb.append(((this.productGroupCode == null)?"<null>":this.productGroupCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        sb.append("focusField");
        sb.append('=');
        sb.append(((this.focusField == null)?"<null>":this.focusField));
        sb.append(',');
        sb.append("fFocusPoints");
        sb.append('=');
        sb.append(((this.fFocusPoints == null)?"<null>":this.fFocusPoints));
        sb.append(',');
        sb.append("fFocusCallDuration");
        sb.append('=');
        sb.append(((this.fFocusCallDuration == null)?"<null>":this.fFocusCallDuration));
        sb.append(',');
        sb.append("fAMC");
        sb.append('=');
        sb.append(((this.fAMC == null)?"<null>":this.fAMC));
        sb.append(',');
        sb.append("warrantydays");
        sb.append('=');
        sb.append(((this.warrantydays == null)?"<null>":this.warrantydays));
        sb.append(',');
        sb.append("sProdType");
        sb.append('=');
        sb.append(((this.sProdType == null)?"<null>":this.sProdType));
        sb.append(',');
        sb.append("iErrorTransferName");
        sb.append('=');
        sb.append(((this.iErrorTransferName == null)?"<null>":this.iErrorTransferName));
        sb.append(',');
        sb.append("iErrorTransferId");
        sb.append('=');
        sb.append(((this.iErrorTransferId == null)?"<null>":this.iErrorTransferId));
        sb.append(',');
        sb.append("iAPIAssignedToName");
        sb.append('=');
        sb.append(((this.iAPIAssignedToName == null)?"<null>":this.iAPIAssignedToName));
        sb.append(',');
        sb.append("iAPIAssignedToId");
        sb.append('=');
        sb.append(((this.iAPIAssignedToId == null)?"<null>":this.iAPIAssignedToId));
        sb.append(',');
        sb.append("iDevTaskTransferToName");
        sb.append('=');
        sb.append(((this.iDevTaskTransferToName == null)?"<null>":this.iDevTaskTransferToName));
        sb.append(',');
        sb.append("iDevTaskTransferToId");
        sb.append('=');
        sb.append(((this.iDevTaskTransferToId == null)?"<null>":this.iDevTaskTransferToId));
        sb.append(',');
        sb.append("iIDEAOwnerName");
        sb.append('=');
        sb.append(((this.iIDEAOwnerName == null)?"<null>":this.iIDEAOwnerName));
        sb.append(',');
        sb.append("iIDEAOwnerId");
        sb.append('=');
        sb.append(((this.iIDEAOwnerId == null)?"<null>":this.iIDEAOwnerId));
        sb.append(',');
        sb.append("iBaseUsers");
        sb.append('=');
        sb.append(((this.iBaseUsers == null)?"<null>":this.iBaseUsers));
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
        sb.append("lifeSpanCycle");
        sb.append('=');
        sb.append(((this.lifeSpanCycle == null)?"<null>":this.lifeSpanCycle));
        sb.append(',');
        sb.append("demoSpanCycle");
        sb.append('=');
        sb.append(((this.demoSpanCycle == null)?"<null>":this.demoSpanCycle));
        sb.append(',');
        sb.append("defaultBasePowerUser");
        sb.append('=');
        sb.append(((this.defaultBasePowerUser == null)?"<null>":this.defaultBasePowerUser));
        sb.append(',');
        sb.append("defaultAdditionalUser");
        sb.append('=');
        sb.append(((this.defaultAdditionalUser == null)?"<null>":this.defaultAdditionalUser));
        sb.append(',');
        sb.append("defaultLightUser");
        sb.append('=');
        sb.append(((this.defaultLightUser == null)?"<null>":this.defaultLightUser));
        sb.append(',');
        sb.append("defaultExternalUser");
        sb.append('=');
        sb.append(((this.defaultExternalUser == null)?"<null>":this.defaultExternalUser));
        sb.append(',');
        sb.append("impl");
        sb.append('=');
        sb.append(((this.impl == null)?"<null>":this.impl));
        sb.append(',');
        sb.append("isSpecialProduct");
        sb.append('=');
        sb.append(((this.isSpecialProduct == null)?"<null>":this.isSpecialProduct));
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
        sb.append("contractRequired");
        sb.append('=');
        sb.append(((this.contractRequired == null)?"<null>":this.contractRequired));
        sb.append(',');
        sb.append("productType1");
        sb.append('=');
        sb.append(((this.productType1 == null)?"<null>":this.productType1));
        sb.append(',');
        sb.append("bIsActive");
        sb.append('=');
        sb.append(((this.bIsActive == null)?"<null>":this.bIsActive));
        sb.append(',');
        sb.append("iCalcValue");
        sb.append('=');
        sb.append(((this.iCalcValue == null)?"<null>":this.iCalcValue));
        sb.append(',');
        sb.append("bIgnoreCDID");
        sb.append('=');
        sb.append(((this.bIgnoreCDID == null)?"<null>":this.bIgnoreCDID));
        sb.append(',');
        sb.append("licensingType");
        sb.append('=');
        sb.append(((this.licensingType == null)?"<null>":this.licensingType));
        sb.append(',');
        sb.append("lMSProductType");
        sb.append('=');
        sb.append(((this.lMSProductType == null)?"<null>":this.lMSProductType));
        sb.append(',');
        sb.append("bSurveyRequired");
        sb.append('=');
        sb.append(((this.bSurveyRequired == null)?"<null>":this.bSurveyRequired));
        sb.append(',');
        sb.append("defaultBaseUnitName");
        sb.append('=');
        sb.append(((this.defaultBaseUnitName == null)?"<null>":this.defaultBaseUnitName));
        sb.append(',');
        sb.append("defaultBaseUnitId");
        sb.append('=');
        sb.append(((this.defaultBaseUnitId == null)?"<null>":this.defaultBaseUnitId));
        sb.append(',');
        sb.append("defaultBaseUnitCode");
        sb.append('=');
        sb.append(((this.defaultBaseUnitCode == null)?"<null>":this.defaultBaseUnitCode));
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
