
package com.centrahub.SalesOrder.dto;

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
    @SerializedName("AmountUSD")
    @Expose
    private String amountUSD;
    @SerializedName("AmountLocal")
    @Expose
    private String amountLocal;
    @SerializedName("ImplementationCharges")
    @Expose
    private String implementationCharges;
    @SerializedName("ImplementationChargesLocal")
    @Expose
    private String implementationChargesLocal;
    @SerializedName("DiscountonUserLocal")
    @Expose
    private String discountonUserLocal;
    @SerializedName("DiscountonUpgradationUSD")
    @Expose
    private String discountonUpgradationUSD;
    @SerializedName("DiscountonUpgradationLocal")
    @Expose
    private String discountonUpgradationLocal;
    @SerializedName("NetAmountUSD")
    @Expose
    private String netAmountUSD;
    @SerializedName("NetAmountLocal")
    @Expose
    private String netAmountLocal;
    @SerializedName("VAT")
    @Expose
    private String vat;
    @SerializedName("CST")
    @Expose
    private String cst;
    @SerializedName("ServiceTax")
    @Expose
    private String serviceTax;
    @SerializedName("VATAmount")
    @Expose
    private String vATAmount;
    @SerializedName("CSTAmount")
    @Expose
    private String cSTAmount;
    @SerializedName("ServiceTaxAmount")
    @Expose
    private String serviceTaxAmount;
    @SerializedName("fSaleLicensePrice")
    @Expose
    private String fSaleLicensePrice;
    @SerializedName("fSaleImplPrice")
    @Expose
    private String fSaleImplPrice;
    @SerializedName("TypeOfDisc")
    @Expose
    private String typeOfDisc;
    @SerializedName("TaxCode__name")
    @Expose
    private String taxCodeName;
    @SerializedName("TaxCode__id")
    @Expose
    private String taxCodeId;
    @SerializedName("TaxCode__code")
    @Expose
    private String taxCodeCode;
    @SerializedName("TotalSellingPriceAmount")
    @Expose
    private String totalSellingPriceAmount;
    @SerializedName("SubTotalUSD")
    @Expose
    private String subTotalUSD;
    @SerializedName("SubTotalLocal")
    @Expose
    private String subTotalLocal;
    @SerializedName("BodyRemarks")
    @Expose
    private String bodyRemarks;
    @SerializedName("ImplUsersCostUSD")
    @Expose
    private String implUsersCostUSD;
    @SerializedName("fImplUsersCostLocal")
    @Expose
    private String fImplUsersCostLocal;
    @SerializedName("fAmountinUSDday")
    @Expose
    private String fAmountinUSDday;
    @SerializedName("iNoofdays")
    @Expose
    private String iNoofdays;
    @SerializedName("fCostPrice")
    @Expose
    private String fCostPrice;
    @SerializedName("fCostPriceAmount")
    @Expose
    private String fCostPriceAmount;
    @SerializedName("BCalLicenseId")
    @Expose
    private String bCalLicenseId;
    @SerializedName("BCompanyKey")
    @Expose
    private String bCompanyKey;
    @SerializedName("iHardwareRequestId__name")
    @Expose
    private String iHardwareRequestIdName;
    @SerializedName("iHardwareRequestId__id")
    @Expose
    private String iHardwareRequestIdId;
    @SerializedName("iHardwareRequestId__code")
    @Expose
    private String iHardwareRequestIdCode;
    @SerializedName("iSaaSContractId__name")
    @Expose
    private String iSaaSContractIdName;
    @SerializedName("iSaaSContractId__id")
    @Expose
    private String iSaaSContractIdId;
    @SerializedName("iSaaSContractId__code")
    @Expose
    private String iSaaSContractIdCode;
    @SerializedName("NoofMonths")
    @Expose
    private String noofMonths;
    @SerializedName("fYearValue")
    @Expose
    private String fYearValue;
    @SerializedName("fPerMonthAmount")
    @Expose
    private String fPerMonthAmount;
    @SerializedName("CentraRevenue__name")
    @Expose
    private String centraRevenueName;
    @SerializedName("CentraRevenue__id")
    @Expose
    private String centraRevenueId;
    @SerializedName("CentraRevenue__code")
    @Expose
    private String centraRevenueCode;
    @SerializedName("Sale")
    @Expose
    private String sale;
    @SerializedName("PTax")
    @Expose
    private String pTax;
    @SerializedName("PReseller")
    @Expose
    private String pReseller;
    @SerializedName("PartnerDisconLicense")
    @Expose
    private String partnerDisconLicense;
    @SerializedName("PartnerDisconImplementation")
    @Expose
    private String partnerDisconImplementation;
    @SerializedName("Taxes")
    @Expose
    private String taxes;
    @SerializedName("BCdid")
    @Expose
    private String bCdid;
    @SerializedName("iImplementationType")
    @Expose
    private String iImplementationType;
    @SerializedName("ExtraCompanyImpl")
    @Expose
    private String extraCompanyImpl;
    @SerializedName("ProductCategory__name")
    @Expose
    private String productCategoryName;
    @SerializedName("ProductCategory__id")
    @Expose
    private String productCategoryId;
    @SerializedName("ProductCategory__code")
    @Expose
    private String productCategoryCode;
    @SerializedName("SalesType__name")
    @Expose
    private String salesTypeName;
    @SerializedName("SalesType__id")
    @Expose
    private String salesTypeId;
    @SerializedName("SalesType__code")
    @Expose
    private String salesTypeCode;
    @SerializedName("StreamType__name")
    @Expose
    private String streamTypeName;
    @SerializedName("StreamType__id")
    @Expose
    private String streamTypeId;
    @SerializedName("StreamType__code")
    @Expose
    private String streamTypeCode;
    @SerializedName("LicenseType__name")
    @Expose
    private String licenseTypeName;
    @SerializedName("LicenseType__id")
    @Expose
    private String licenseTypeId;
    @SerializedName("LicenseType__code")
    @Expose
    private String licenseTypeCode;
    @SerializedName("BaseUser")
    @Expose
    private String baseUser;
    @SerializedName("LightUser")
    @Expose
    private String lightUser;
    @SerializedName("AdditionalUser")
    @Expose
    private String additionalUser;
    @SerializedName("AdditionalLightUser")
    @Expose
    private String additionalLightUser;
    @SerializedName("ExternalUser")
    @Expose
    private String externalUser;
    @SerializedName("AdditionalExternalUser")
    @Expose
    private String additionalExternalUser;
    @SerializedName("Totalno")
    @Expose
    private String totalno;
    @SerializedName("DiscountonUserUSD")
    @Expose
    private String discountonUserUSD;
    @SerializedName("ProductId__name")
    @Expose
    private String productIdName;
    @SerializedName("ProductId__id")
    @Expose
    private String productIdId;
    @SerializedName("ProductId__code")
    @Expose
    private String productIdCode;
    @SerializedName("Quantity")
    @Expose
    private String quantity;
    @SerializedName("ProdDescription")
    @Expose
    private String prodDescription;
    @SerializedName("Discount")
    @Expose
    private String discount;
    @SerializedName("SalesPrice")
    @Expose
    private String salesPrice;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("fBUYearValue")
    @Expose
    private String fBUYearValue;
    @SerializedName("fAUYearValue")
    @Expose
    private String fAUYearValue;
    @SerializedName("fAUPerMonthAmount")
    @Expose
    private String fAUPerMonthAmount;
    @SerializedName("fLUYearValue")
    @Expose
    private String fLUYearValue;
    @SerializedName("fLUPerMonthAmount")
    @Expose
    private String fLUPerMonthAmount;
    @SerializedName("fBUPerMonthAmount")
    @Expose
    private String fBUPerMonthAmount;
    @SerializedName("fBaseUserCost")
    @Expose
    private String fBaseUserCost;
    @SerializedName("bIsHardwareProduct")
    @Expose
    private String bIsHardwareProduct;
    private final static long serialVersionUID = 4259150321874028738L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param fSaleLicensePrice
     * @param createdByName
     * @param amountUSD
     * @param vATAmount
     * @param serviceTax
     * @param cst
     * @param iHardwareRequestIdName
     * @param implUsersCostUSD
     * @param productCategoryName
     * @param salesPrice
     * @param taxes
     * @param discount
     * @param fBUYearValue
     * @param bCalLicenseId
     * @param iHardwareRequestIdId
     * @param iNoofdays
     * @param centraRevenueId
     * @param salesTypeCode
     * @param fAmountinUSDday
     * @param iHardwareRequestIdCode
     * @param partnerDisconImplementation
     * @param totalSellingPriceAmount
     * @param createdById
     * @param bIsHardwareProduct
     * @param fSaleImplPrice
     * @param iSaaSContractIdId
     * @param discountonUserLocal
     * @param productCategoryCode
     * @param iSaaSContractIdCode
     * @param discountonUpgradationLocal
     * @param netAmountUSD
     * @param bodyRemarks
     * @param streamTypeId
     * @param noofMonths
     * @param licenseTypeCode
     * @param vat
     * @param extraCompanyImpl
     * @param taxCodeId
     * @param additionalLightUser
     * @param additionalExternalUser
     * @param pTax
     * @param prodDescription
     * @param licenseTypeId
     * @param fAUYearValue
     * @param fAUPerMonthAmount
     * @param subTotalUSD
     * @param implementationChargesLocal
     * @param amountLocal
     * @param subTotalLocal
     * @param partnerDisconLicense
     * @param streamTypeCode
     * @param productIdId
     * @param fBaseUserCost
     * @param bCdid
     * @param productIdName
     * @param netAmountLocal
     * @param fLUPerMonthAmount
     * @param iSaaSContractIdName
     * @param taxCodeName
     * @param salesTypeId
     * @param totalno
     * @param discountonUserUSD
     * @param fBUPerMonthAmount
     * @param streamTypeName
     * @param licenseTypeName
     * @param externalUser
     * @param productCategoryId
     * @param fImplUsersCostLocal
     * @param baseUser
     * @param taxCodeCode
     * @param fLUYearValue
     * @param bodyId
     * @param lightUser
     * @param productIdCode
     * @param cSTAmount
     * @param centraRevenueCode
     * @param fPerMonthAmount
     * @param additionalUser
     * @param centraRevenueName
     * @param amount
     * @param typeOfDisc
     * @param quantity
     * @param discountonUpgradationUSD
     * @param pReseller
     * @param sale
     * @param bCompanyKey
     * @param createdDate
     * @param implementationCharges
     * @param serviceTaxAmount
     * @param iImplementationType
     * @param salesTypeName
     * @param fCostPriceAmount
     * @param fCostPrice
     * @param fYearValue
     */
    public LineItem(String bodyId, String amountUSD, String amountLocal, String implementationCharges, String implementationChargesLocal, String discountonUserLocal, String discountonUpgradationUSD, String discountonUpgradationLocal, String netAmountUSD, String netAmountLocal, String vat, String cst, String serviceTax, String vATAmount, String cSTAmount, String serviceTaxAmount, String fSaleLicensePrice, String fSaleImplPrice, String typeOfDisc, String taxCodeName, String taxCodeId, String taxCodeCode, String totalSellingPriceAmount, String subTotalUSD, String subTotalLocal, String bodyRemarks, String implUsersCostUSD, String fImplUsersCostLocal, String fAmountinUSDday, String iNoofdays, String fCostPrice, String fCostPriceAmount, String bCalLicenseId, String bCompanyKey, String iHardwareRequestIdName, String iHardwareRequestIdId, String iHardwareRequestIdCode, String iSaaSContractIdName, String iSaaSContractIdId, String iSaaSContractIdCode, String noofMonths, String fYearValue, String fPerMonthAmount, String centraRevenueName, String centraRevenueId, String centraRevenueCode, String sale, String pTax, String pReseller, String partnerDisconLicense, String partnerDisconImplementation, String taxes, String bCdid, String iImplementationType, String extraCompanyImpl, String productCategoryName, String productCategoryId, String productCategoryCode, String salesTypeName, String salesTypeId, String salesTypeCode, String streamTypeName, String streamTypeId, String streamTypeCode, String licenseTypeName, String licenseTypeId, String licenseTypeCode, String baseUser, String lightUser, String additionalUser, String additionalLightUser, String externalUser, String additionalExternalUser, String totalno, String discountonUserUSD, String productIdName, String productIdId, String productIdCode, String quantity, String prodDescription, String discount, String salesPrice, String createdByName, String createdById, String createdDate, String amount, String fBUYearValue, String fAUYearValue, String fAUPerMonthAmount, String fLUYearValue, String fLUPerMonthAmount, String fBUPerMonthAmount, String fBaseUserCost, String bIsHardwareProduct) {
        super();
        this.bodyId = bodyId;
        this.amountUSD = amountUSD;
        this.amountLocal = amountLocal;
        this.implementationCharges = implementationCharges;
        this.implementationChargesLocal = implementationChargesLocal;
        this.discountonUserLocal = discountonUserLocal;
        this.discountonUpgradationUSD = discountonUpgradationUSD;
        this.discountonUpgradationLocal = discountonUpgradationLocal;
        this.netAmountUSD = netAmountUSD;
        this.netAmountLocal = netAmountLocal;
        this.vat = vat;
        this.cst = cst;
        this.serviceTax = serviceTax;
        this.vATAmount = vATAmount;
        this.cSTAmount = cSTAmount;
        this.serviceTaxAmount = serviceTaxAmount;
        this.fSaleLicensePrice = fSaleLicensePrice;
        this.fSaleImplPrice = fSaleImplPrice;
        this.typeOfDisc = typeOfDisc;
        this.taxCodeName = taxCodeName;
        this.taxCodeId = taxCodeId;
        this.taxCodeCode = taxCodeCode;
        this.totalSellingPriceAmount = totalSellingPriceAmount;
        this.subTotalUSD = subTotalUSD;
        this.subTotalLocal = subTotalLocal;
        this.bodyRemarks = bodyRemarks;
        this.implUsersCostUSD = implUsersCostUSD;
        this.fImplUsersCostLocal = fImplUsersCostLocal;
        this.fAmountinUSDday = fAmountinUSDday;
        this.iNoofdays = iNoofdays;
        this.fCostPrice = fCostPrice;
        this.fCostPriceAmount = fCostPriceAmount;
        this.bCalLicenseId = bCalLicenseId;
        this.bCompanyKey = bCompanyKey;
        this.iHardwareRequestIdName = iHardwareRequestIdName;
        this.iHardwareRequestIdId = iHardwareRequestIdId;
        this.iHardwareRequestIdCode = iHardwareRequestIdCode;
        this.iSaaSContractIdName = iSaaSContractIdName;
        this.iSaaSContractIdId = iSaaSContractIdId;
        this.iSaaSContractIdCode = iSaaSContractIdCode;
        this.noofMonths = noofMonths;
        this.fYearValue = fYearValue;
        this.fPerMonthAmount = fPerMonthAmount;
        this.centraRevenueName = centraRevenueName;
        this.centraRevenueId = centraRevenueId;
        this.centraRevenueCode = centraRevenueCode;
        this.sale = sale;
        this.pTax = pTax;
        this.pReseller = pReseller;
        this.partnerDisconLicense = partnerDisconLicense;
        this.partnerDisconImplementation = partnerDisconImplementation;
        this.taxes = taxes;
        this.bCdid = bCdid;
        this.iImplementationType = iImplementationType;
        this.extraCompanyImpl = extraCompanyImpl;
        this.productCategoryName = productCategoryName;
        this.productCategoryId = productCategoryId;
        this.productCategoryCode = productCategoryCode;
        this.salesTypeName = salesTypeName;
        this.salesTypeId = salesTypeId;
        this.salesTypeCode = salesTypeCode;
        this.streamTypeName = streamTypeName;
        this.streamTypeId = streamTypeId;
        this.streamTypeCode = streamTypeCode;
        this.licenseTypeName = licenseTypeName;
        this.licenseTypeId = licenseTypeId;
        this.licenseTypeCode = licenseTypeCode;
        this.baseUser = baseUser;
        this.lightUser = lightUser;
        this.additionalUser = additionalUser;
        this.additionalLightUser = additionalLightUser;
        this.externalUser = externalUser;
        this.additionalExternalUser = additionalExternalUser;
        this.totalno = totalno;
        this.discountonUserUSD = discountonUserUSD;
        this.productIdName = productIdName;
        this.productIdId = productIdId;
        this.productIdCode = productIdCode;
        this.quantity = quantity;
        this.prodDescription = prodDescription;
        this.discount = discount;
        this.salesPrice = salesPrice;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.amount = amount;
        this.fBUYearValue = fBUYearValue;
        this.fAUYearValue = fAUYearValue;
        this.fAUPerMonthAmount = fAUPerMonthAmount;
        this.fLUYearValue = fLUYearValue;
        this.fLUPerMonthAmount = fLUPerMonthAmount;
        this.fBUPerMonthAmount = fBUPerMonthAmount;
        this.fBaseUserCost = fBaseUserCost;
        this.bIsHardwareProduct = bIsHardwareProduct;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public String getAmountUSD() {
        return amountUSD;
    }

    public void setAmountUSD(String amountUSD) {
        this.amountUSD = amountUSD;
    }

    public String getAmountLocal() {
        return amountLocal;
    }

    public void setAmountLocal(String amountLocal) {
        this.amountLocal = amountLocal;
    }

    public String getImplementationCharges() {
        return implementationCharges;
    }

    public void setImplementationCharges(String implementationCharges) {
        this.implementationCharges = implementationCharges;
    }

    public String getImplementationChargesLocal() {
        return implementationChargesLocal;
    }

    public void setImplementationChargesLocal(String implementationChargesLocal) {
        this.implementationChargesLocal = implementationChargesLocal;
    }

    public String getDiscountonUserLocal() {
        return discountonUserLocal;
    }

    public void setDiscountonUserLocal(String discountonUserLocal) {
        this.discountonUserLocal = discountonUserLocal;
    }

    public String getDiscountonUpgradationUSD() {
        return discountonUpgradationUSD;
    }

    public void setDiscountonUpgradationUSD(String discountonUpgradationUSD) {
        this.discountonUpgradationUSD = discountonUpgradationUSD;
    }

    public String getDiscountonUpgradationLocal() {
        return discountonUpgradationLocal;
    }

    public void setDiscountonUpgradationLocal(String discountonUpgradationLocal) {
        this.discountonUpgradationLocal = discountonUpgradationLocal;
    }

    public String getNetAmountUSD() {
        return netAmountUSD;
    }

    public void setNetAmountUSD(String netAmountUSD) {
        this.netAmountUSD = netAmountUSD;
    }

    public String getNetAmountLocal() {
        return netAmountLocal;
    }

    public void setNetAmountLocal(String netAmountLocal) {
        this.netAmountLocal = netAmountLocal;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(String serviceTax) {
        this.serviceTax = serviceTax;
    }

    public String getVATAmount() {
        return vATAmount;
    }

    public void setVATAmount(String vATAmount) {
        this.vATAmount = vATAmount;
    }

    public String getCSTAmount() {
        return cSTAmount;
    }

    public void setCSTAmount(String cSTAmount) {
        this.cSTAmount = cSTAmount;
    }

    public String getServiceTaxAmount() {
        return serviceTaxAmount;
    }

    public void setServiceTaxAmount(String serviceTaxAmount) {
        this.serviceTaxAmount = serviceTaxAmount;
    }

    public String getfSaleLicensePrice() {
        return fSaleLicensePrice;
    }

    public void setfSaleLicensePrice(String fSaleLicensePrice) {
        this.fSaleLicensePrice = fSaleLicensePrice;
    }

    public String getfSaleImplPrice() {
        return fSaleImplPrice;
    }

    public void setfSaleImplPrice(String fSaleImplPrice) {
        this.fSaleImplPrice = fSaleImplPrice;
    }

    public String getTypeOfDisc() {
        return typeOfDisc;
    }

    public void setTypeOfDisc(String typeOfDisc) {
        this.typeOfDisc = typeOfDisc;
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

    public String getTotalSellingPriceAmount() {
        return totalSellingPriceAmount;
    }

    public void setTotalSellingPriceAmount(String totalSellingPriceAmount) {
        this.totalSellingPriceAmount = totalSellingPriceAmount;
    }

    public String getSubTotalUSD() {
        return subTotalUSD;
    }

    public void setSubTotalUSD(String subTotalUSD) {
        this.subTotalUSD = subTotalUSD;
    }

    public String getSubTotalLocal() {
        return subTotalLocal;
    }

    public void setSubTotalLocal(String subTotalLocal) {
        this.subTotalLocal = subTotalLocal;
    }

    public String getBodyRemarks() {
        return bodyRemarks;
    }

    public void setBodyRemarks(String bodyRemarks) {
        this.bodyRemarks = bodyRemarks;
    }

    public String getImplUsersCostUSD() {
        return implUsersCostUSD;
    }

    public void setImplUsersCostUSD(String implUsersCostUSD) {
        this.implUsersCostUSD = implUsersCostUSD;
    }

    public String getfImplUsersCostLocal() {
        return fImplUsersCostLocal;
    }

    public void setfImplUsersCostLocal(String fImplUsersCostLocal) {
        this.fImplUsersCostLocal = fImplUsersCostLocal;
    }

    public String getfAmountinUSDday() {
        return fAmountinUSDday;
    }

    public void setfAmountinUSDday(String fAmountinUSDday) {
        this.fAmountinUSDday = fAmountinUSDday;
    }

    public String getiNoofdays() {
        return iNoofdays;
    }

    public void setiNoofdays(String iNoofdays) {
        this.iNoofdays = iNoofdays;
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

    public String getBCalLicenseId() {
        return bCalLicenseId;
    }

    public void setBCalLicenseId(String bCalLicenseId) {
        this.bCalLicenseId = bCalLicenseId;
    }

    public String getBCompanyKey() {
        return bCompanyKey;
    }

    public void setBCompanyKey(String bCompanyKey) {
        this.bCompanyKey = bCompanyKey;
    }

    public String getiHardwareRequestIdName() {
        return iHardwareRequestIdName;
    }

    public void setiHardwareRequestIdName(String iHardwareRequestIdName) {
        this.iHardwareRequestIdName = iHardwareRequestIdName;
    }

    public String getiHardwareRequestIdId() {
        return iHardwareRequestIdId;
    }

    public void setiHardwareRequestIdId(String iHardwareRequestIdId) {
        this.iHardwareRequestIdId = iHardwareRequestIdId;
    }

    public String getiHardwareRequestIdCode() {
        return iHardwareRequestIdCode;
    }

    public void setiHardwareRequestIdCode(String iHardwareRequestIdCode) {
        this.iHardwareRequestIdCode = iHardwareRequestIdCode;
    }

    public String getiSaaSContractIdName() {
        return iSaaSContractIdName;
    }

    public void setiSaaSContractIdName(String iSaaSContractIdName) {
        this.iSaaSContractIdName = iSaaSContractIdName;
    }

    public String getiSaaSContractIdId() {
        return iSaaSContractIdId;
    }

    public void setiSaaSContractIdId(String iSaaSContractIdId) {
        this.iSaaSContractIdId = iSaaSContractIdId;
    }

    public String getiSaaSContractIdCode() {
        return iSaaSContractIdCode;
    }

    public void setiSaaSContractIdCode(String iSaaSContractIdCode) {
        this.iSaaSContractIdCode = iSaaSContractIdCode;
    }

    public String getNoofMonths() {
        return noofMonths;
    }

    public void setNoofMonths(String noofMonths) {
        this.noofMonths = noofMonths;
    }

    public String getfYearValue() {
        return fYearValue;
    }

    public void setfYearValue(String fYearValue) {
        this.fYearValue = fYearValue;
    }

    public String getfPerMonthAmount() {
        return fPerMonthAmount;
    }

    public void setfPerMonthAmount(String fPerMonthAmount) {
        this.fPerMonthAmount = fPerMonthAmount;
    }

    public String getCentraRevenueName() {
        return centraRevenueName;
    }

    public void setCentraRevenueName(String centraRevenueName) {
        this.centraRevenueName = centraRevenueName;
    }

    public String getCentraRevenueId() {
        return centraRevenueId;
    }

    public void setCentraRevenueId(String centraRevenueId) {
        this.centraRevenueId = centraRevenueId;
    }

    public String getCentraRevenueCode() {
        return centraRevenueCode;
    }

    public void setCentraRevenueCode(String centraRevenueCode) {
        this.centraRevenueCode = centraRevenueCode;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getPTax() {
        return pTax;
    }

    public void setPTax(String pTax) {
        this.pTax = pTax;
    }

    public String getPReseller() {
        return pReseller;
    }

    public void setPReseller(String pReseller) {
        this.pReseller = pReseller;
    }

    public String getPartnerDisconLicense() {
        return partnerDisconLicense;
    }

    public void setPartnerDisconLicense(String partnerDisconLicense) {
        this.partnerDisconLicense = partnerDisconLicense;
    }

    public String getPartnerDisconImplementation() {
        return partnerDisconImplementation;
    }

    public void setPartnerDisconImplementation(String partnerDisconImplementation) {
        this.partnerDisconImplementation = partnerDisconImplementation;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public String getBCdid() {
        return bCdid;
    }

    public void setBCdid(String bCdid) {
        this.bCdid = bCdid;
    }

    public String getiImplementationType() {
        return iImplementationType;
    }

    public void setiImplementationType(String iImplementationType) {
        this.iImplementationType = iImplementationType;
    }

    public String getExtraCompanyImpl() {
        return extraCompanyImpl;
    }

    public void setExtraCompanyImpl(String extraCompanyImpl) {
        this.extraCompanyImpl = extraCompanyImpl;
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

    public String getSalesTypeName() {
        return salesTypeName;
    }

    public void setSalesTypeName(String salesTypeName) {
        this.salesTypeName = salesTypeName;
    }

    public String getSalesTypeId() {
        return salesTypeId;
    }

    public void setSalesTypeId(String salesTypeId) {
        this.salesTypeId = salesTypeId;
    }

    public String getSalesTypeCode() {
        return salesTypeCode;
    }

    public void setSalesTypeCode(String salesTypeCode) {
        this.salesTypeCode = salesTypeCode;
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

    public String getBaseUser() {
        return baseUser;
    }

    public void setBaseUser(String baseUser) {
        this.baseUser = baseUser;
    }

    public String getLightUser() {
        return lightUser;
    }

    public void setLightUser(String lightUser) {
        this.lightUser = lightUser;
    }

    public String getAdditionalUser() {
        return additionalUser;
    }

    public void setAdditionalUser(String additionalUser) {
        this.additionalUser = additionalUser;
    }

    public String getAdditionalLightUser() {
        return additionalLightUser;
    }

    public void setAdditionalLightUser(String additionalLightUser) {
        this.additionalLightUser = additionalLightUser;
    }

    public String getExternalUser() {
        return externalUser;
    }

    public void setExternalUser(String externalUser) {
        this.externalUser = externalUser;
    }

    public String getAdditionalExternalUser() {
        return additionalExternalUser;
    }

    public void setAdditionalExternalUser(String additionalExternalUser) {
        this.additionalExternalUser = additionalExternalUser;
    }

    public String getTotalno() {
        return totalno;
    }

    public void setTotalno(String totalno) {
        this.totalno = totalno;
    }

    public String getDiscountonUserUSD() {
        return discountonUserUSD;
    }

    public void setDiscountonUserUSD(String discountonUserUSD) {
        this.discountonUserUSD = discountonUserUSD;
    }

    public String getProductIdName() {
        return productIdName;
    }

    public void setProductIdName(String productIdName) {
        this.productIdName = productIdName;
    }

    public String getProductIdId() {
        return productIdId;
    }

    public void setProductIdId(String productIdId) {
        this.productIdId = productIdId;
    }

    public String getProductIdCode() {
        return productIdCode;
    }

    public void setProductIdCode(String productIdCode) {
        this.productIdCode = productIdCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(String salesPrice) {
        this.salesPrice = salesPrice;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getfBUYearValue() {
        return fBUYearValue;
    }

    public void setfBUYearValue(String fBUYearValue) {
        this.fBUYearValue = fBUYearValue;
    }

    public String getfAUYearValue() {
        return fAUYearValue;
    }

    public void setfAUYearValue(String fAUYearValue) {
        this.fAUYearValue = fAUYearValue;
    }

    public String getfAUPerMonthAmount() {
        return fAUPerMonthAmount;
    }

    public void setfAUPerMonthAmount(String fAUPerMonthAmount) {
        this.fAUPerMonthAmount = fAUPerMonthAmount;
    }

    public String getfLUYearValue() {
        return fLUYearValue;
    }

    public void setfLUYearValue(String fLUYearValue) {
        this.fLUYearValue = fLUYearValue;
    }

    public String getfLUPerMonthAmount() {
        return fLUPerMonthAmount;
    }

    public void setfLUPerMonthAmount(String fLUPerMonthAmount) {
        this.fLUPerMonthAmount = fLUPerMonthAmount;
    }

    public String getfBUPerMonthAmount() {
        return fBUPerMonthAmount;
    }

    public void setfBUPerMonthAmount(String fBUPerMonthAmount) {
        this.fBUPerMonthAmount = fBUPerMonthAmount;
    }

    public String getfBaseUserCost() {
        return fBaseUserCost;
    }

    public void setfBaseUserCost(String fBaseUserCost) {
        this.fBaseUserCost = fBaseUserCost;
    }

    public String getbIsHardwareProduct() {
        return bIsHardwareProduct;
    }

    public void setbIsHardwareProduct(String bIsHardwareProduct) {
        this.bIsHardwareProduct = bIsHardwareProduct;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bodyId");
        sb.append('=');
        sb.append(((this.bodyId == null)?"<null>":this.bodyId));
        sb.append(',');
        sb.append("amountUSD");
        sb.append('=');
        sb.append(((this.amountUSD == null)?"<null>":this.amountUSD));
        sb.append(',');
        sb.append("amountLocal");
        sb.append('=');
        sb.append(((this.amountLocal == null)?"<null>":this.amountLocal));
        sb.append(',');
        sb.append("implementationCharges");
        sb.append('=');
        sb.append(((this.implementationCharges == null)?"<null>":this.implementationCharges));
        sb.append(',');
        sb.append("implementationChargesLocal");
        sb.append('=');
        sb.append(((this.implementationChargesLocal == null)?"<null>":this.implementationChargesLocal));
        sb.append(',');
        sb.append("discountonUserLocal");
        sb.append('=');
        sb.append(((this.discountonUserLocal == null)?"<null>":this.discountonUserLocal));
        sb.append(',');
        sb.append("discountonUpgradationUSD");
        sb.append('=');
        sb.append(((this.discountonUpgradationUSD == null)?"<null>":this.discountonUpgradationUSD));
        sb.append(',');
        sb.append("discountonUpgradationLocal");
        sb.append('=');
        sb.append(((this.discountonUpgradationLocal == null)?"<null>":this.discountonUpgradationLocal));
        sb.append(',');
        sb.append("netAmountUSD");
        sb.append('=');
        sb.append(((this.netAmountUSD == null)?"<null>":this.netAmountUSD));
        sb.append(',');
        sb.append("netAmountLocal");
        sb.append('=');
        sb.append(((this.netAmountLocal == null)?"<null>":this.netAmountLocal));
        sb.append(',');
        sb.append("vat");
        sb.append('=');
        sb.append(((this.vat == null)?"<null>":this.vat));
        sb.append(',');
        sb.append("cst");
        sb.append('=');
        sb.append(((this.cst == null)?"<null>":this.cst));
        sb.append(',');
        sb.append("serviceTax");
        sb.append('=');
        sb.append(((this.serviceTax == null)?"<null>":this.serviceTax));
        sb.append(',');
        sb.append("vATAmount");
        sb.append('=');
        sb.append(((this.vATAmount == null)?"<null>":this.vATAmount));
        sb.append(',');
        sb.append("cSTAmount");
        sb.append('=');
        sb.append(((this.cSTAmount == null)?"<null>":this.cSTAmount));
        sb.append(',');
        sb.append("serviceTaxAmount");
        sb.append('=');
        sb.append(((this.serviceTaxAmount == null)?"<null>":this.serviceTaxAmount));
        sb.append(',');
        sb.append("fSaleLicensePrice");
        sb.append('=');
        sb.append(((this.fSaleLicensePrice == null)?"<null>":this.fSaleLicensePrice));
        sb.append(',');
        sb.append("fSaleImplPrice");
        sb.append('=');
        sb.append(((this.fSaleImplPrice == null)?"<null>":this.fSaleImplPrice));
        sb.append(',');
        sb.append("typeOfDisc");
        sb.append('=');
        sb.append(((this.typeOfDisc == null)?"<null>":this.typeOfDisc));
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
        sb.append("totalSellingPriceAmount");
        sb.append('=');
        sb.append(((this.totalSellingPriceAmount == null)?"<null>":this.totalSellingPriceAmount));
        sb.append(',');
        sb.append("subTotalUSD");
        sb.append('=');
        sb.append(((this.subTotalUSD == null)?"<null>":this.subTotalUSD));
        sb.append(',');
        sb.append("subTotalLocal");
        sb.append('=');
        sb.append(((this.subTotalLocal == null)?"<null>":this.subTotalLocal));
        sb.append(',');
        sb.append("bodyRemarks");
        sb.append('=');
        sb.append(((this.bodyRemarks == null)?"<null>":this.bodyRemarks));
        sb.append(',');
        sb.append("implUsersCostUSD");
        sb.append('=');
        sb.append(((this.implUsersCostUSD == null)?"<null>":this.implUsersCostUSD));
        sb.append(',');
        sb.append("fImplUsersCostLocal");
        sb.append('=');
        sb.append(((this.fImplUsersCostLocal == null)?"<null>":this.fImplUsersCostLocal));
        sb.append(',');
        sb.append("fAmountinUSDday");
        sb.append('=');
        sb.append(((this.fAmountinUSDday == null)?"<null>":this.fAmountinUSDday));
        sb.append(',');
        sb.append("iNoofdays");
        sb.append('=');
        sb.append(((this.iNoofdays == null)?"<null>":this.iNoofdays));
        sb.append(',');
        sb.append("fCostPrice");
        sb.append('=');
        sb.append(((this.fCostPrice == null)?"<null>":this.fCostPrice));
        sb.append(',');
        sb.append("fCostPriceAmount");
        sb.append('=');
        sb.append(((this.fCostPriceAmount == null)?"<null>":this.fCostPriceAmount));
        sb.append(',');
        sb.append("bCalLicenseId");
        sb.append('=');
        sb.append(((this.bCalLicenseId == null)?"<null>":this.bCalLicenseId));
        sb.append(',');
        sb.append("bCompanyKey");
        sb.append('=');
        sb.append(((this.bCompanyKey == null)?"<null>":this.bCompanyKey));
        sb.append(',');
        sb.append("iHardwareRequestIdName");
        sb.append('=');
        sb.append(((this.iHardwareRequestIdName == null)?"<null>":this.iHardwareRequestIdName));
        sb.append(',');
        sb.append("iHardwareRequestIdId");
        sb.append('=');
        sb.append(((this.iHardwareRequestIdId == null)?"<null>":this.iHardwareRequestIdId));
        sb.append(',');
        sb.append("iHardwareRequestIdCode");
        sb.append('=');
        sb.append(((this.iHardwareRequestIdCode == null)?"<null>":this.iHardwareRequestIdCode));
        sb.append(',');
        sb.append("iSaaSContractIdName");
        sb.append('=');
        sb.append(((this.iSaaSContractIdName == null)?"<null>":this.iSaaSContractIdName));
        sb.append(',');
        sb.append("iSaaSContractIdId");
        sb.append('=');
        sb.append(((this.iSaaSContractIdId == null)?"<null>":this.iSaaSContractIdId));
        sb.append(',');
        sb.append("iSaaSContractIdCode");
        sb.append('=');
        sb.append(((this.iSaaSContractIdCode == null)?"<null>":this.iSaaSContractIdCode));
        sb.append(',');
        sb.append("noofMonths");
        sb.append('=');
        sb.append(((this.noofMonths == null)?"<null>":this.noofMonths));
        sb.append(',');
        sb.append("fYearValue");
        sb.append('=');
        sb.append(((this.fYearValue == null)?"<null>":this.fYearValue));
        sb.append(',');
        sb.append("fPerMonthAmount");
        sb.append('=');
        sb.append(((this.fPerMonthAmount == null)?"<null>":this.fPerMonthAmount));
        sb.append(',');
        sb.append("centraRevenueName");
        sb.append('=');
        sb.append(((this.centraRevenueName == null)?"<null>":this.centraRevenueName));
        sb.append(',');
        sb.append("centraRevenueId");
        sb.append('=');
        sb.append(((this.centraRevenueId == null)?"<null>":this.centraRevenueId));
        sb.append(',');
        sb.append("centraRevenueCode");
        sb.append('=');
        sb.append(((this.centraRevenueCode == null)?"<null>":this.centraRevenueCode));
        sb.append(',');
        sb.append("sale");
        sb.append('=');
        sb.append(((this.sale == null)?"<null>":this.sale));
        sb.append(',');
        sb.append("pTax");
        sb.append('=');
        sb.append(((this.pTax == null)?"<null>":this.pTax));
        sb.append(',');
        sb.append("pReseller");
        sb.append('=');
        sb.append(((this.pReseller == null)?"<null>":this.pReseller));
        sb.append(',');
        sb.append("partnerDisconLicense");
        sb.append('=');
        sb.append(((this.partnerDisconLicense == null)?"<null>":this.partnerDisconLicense));
        sb.append(',');
        sb.append("partnerDisconImplementation");
        sb.append('=');
        sb.append(((this.partnerDisconImplementation == null)?"<null>":this.partnerDisconImplementation));
        sb.append(',');
        sb.append("taxes");
        sb.append('=');
        sb.append(((this.taxes == null)?"<null>":this.taxes));
        sb.append(',');
        sb.append("bCdid");
        sb.append('=');
        sb.append(((this.bCdid == null)?"<null>":this.bCdid));
        sb.append(',');
        sb.append("iImplementationType");
        sb.append('=');
        sb.append(((this.iImplementationType == null)?"<null>":this.iImplementationType));
        sb.append(',');
        sb.append("extraCompanyImpl");
        sb.append('=');
        sb.append(((this.extraCompanyImpl == null)?"<null>":this.extraCompanyImpl));
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
        sb.append("salesTypeName");
        sb.append('=');
        sb.append(((this.salesTypeName == null)?"<null>":this.salesTypeName));
        sb.append(',');
        sb.append("salesTypeId");
        sb.append('=');
        sb.append(((this.salesTypeId == null)?"<null>":this.salesTypeId));
        sb.append(',');
        sb.append("salesTypeCode");
        sb.append('=');
        sb.append(((this.salesTypeCode == null)?"<null>":this.salesTypeCode));
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
        sb.append("baseUser");
        sb.append('=');
        sb.append(((this.baseUser == null)?"<null>":this.baseUser));
        sb.append(',');
        sb.append("lightUser");
        sb.append('=');
        sb.append(((this.lightUser == null)?"<null>":this.lightUser));
        sb.append(',');
        sb.append("additionalUser");
        sb.append('=');
        sb.append(((this.additionalUser == null)?"<null>":this.additionalUser));
        sb.append(',');
        sb.append("additionalLightUser");
        sb.append('=');
        sb.append(((this.additionalLightUser == null)?"<null>":this.additionalLightUser));
        sb.append(',');
        sb.append("externalUser");
        sb.append('=');
        sb.append(((this.externalUser == null)?"<null>":this.externalUser));
        sb.append(',');
        sb.append("additionalExternalUser");
        sb.append('=');
        sb.append(((this.additionalExternalUser == null)?"<null>":this.additionalExternalUser));
        sb.append(',');
        sb.append("totalno");
        sb.append('=');
        sb.append(((this.totalno == null)?"<null>":this.totalno));
        sb.append(',');
        sb.append("discountonUserUSD");
        sb.append('=');
        sb.append(((this.discountonUserUSD == null)?"<null>":this.discountonUserUSD));
        sb.append(',');
        sb.append("productIdName");
        sb.append('=');
        sb.append(((this.productIdName == null)?"<null>":this.productIdName));
        sb.append(',');
        sb.append("productIdId");
        sb.append('=');
        sb.append(((this.productIdId == null)?"<null>":this.productIdId));
        sb.append(',');
        sb.append("productIdCode");
        sb.append('=');
        sb.append(((this.productIdCode == null)?"<null>":this.productIdCode));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("prodDescription");
        sb.append('=');
        sb.append(((this.prodDescription == null)?"<null>":this.prodDescription));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("salesPrice");
        sb.append('=');
        sb.append(((this.salesPrice == null)?"<null>":this.salesPrice));
        sb.append(',');
        sb.append("createdByName");
        sb.append('=');
        sb.append(((this.createdByName == null)?"<null>":this.createdByName));
        sb.append(',');
        sb.append("createdById");
        sb.append('=');
        sb.append(((this.createdById == null)?"<null>":this.createdById));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("fBUYearValue");
        sb.append('=');
        sb.append(((this.fBUYearValue == null)?"<null>":this.fBUYearValue));
        sb.append(',');
        sb.append("fAUYearValue");
        sb.append('=');
        sb.append(((this.fAUYearValue == null)?"<null>":this.fAUYearValue));
        sb.append(',');
        sb.append("fAUPerMonthAmount");
        sb.append('=');
        sb.append(((this.fAUPerMonthAmount == null)?"<null>":this.fAUPerMonthAmount));
        sb.append(',');
        sb.append("fLUYearValue");
        sb.append('=');
        sb.append(((this.fLUYearValue == null)?"<null>":this.fLUYearValue));
        sb.append(',');
        sb.append("fLUPerMonthAmount");
        sb.append('=');
        sb.append(((this.fLUPerMonthAmount == null)?"<null>":this.fLUPerMonthAmount));
        sb.append(',');
        sb.append("fBUPerMonthAmount");
        sb.append('=');
        sb.append(((this.fBUPerMonthAmount == null)?"<null>":this.fBUPerMonthAmount));
        sb.append(',');
        sb.append("fBaseUserCost");
        sb.append('=');
        sb.append(((this.fBaseUserCost == null)?"<null>":this.fBaseUserCost));
        sb.append(',');
        sb.append("bIsHardwareProduct");
        sb.append('=');
        sb.append(((this.bIsHardwareProduct == null)?"<null>":this.bIsHardwareProduct));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
