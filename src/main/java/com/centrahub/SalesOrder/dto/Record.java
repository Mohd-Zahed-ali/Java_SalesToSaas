
package com.centrahub.SalesOrder.dto;

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
    @SerializedName("TransId")
    @Expose
    private String transId;
    @SerializedName("SyncType")
    @Expose
    private String syncType;
    @SerializedName("CreatedBy__name")
    @Expose
    private String createdByName;
    @SerializedName("CreatedBy__id")
    @Expose
    private String createdById;
    @SerializedName("CreatedDate")
    @Expose
    private String createdDate;
    @SerializedName("ModifiedBy__name")
    @Expose
    private String modifiedByName;
    @SerializedName("ModifiedBy__id")
    @Expose
    private String modifiedById;
    @SerializedName("ModifiedDate")
    @Expose
    private String modifiedDate;
    @SerializedName("SubTotal")
    @Expose
    private String subTotal;
    @SerializedName("Tax")
    @Expose
    private String tax;
    @SerializedName("OverallDiscount")
    @Expose
    private String overallDiscount;
    @SerializedName("GrandTotal")
    @Expose
    private String grandTotal;
    @SerializedName("ApprovalRemarks")
    @Expose
    private String approvalRemarks;
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
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate;
    @SerializedName("OpportunityId__name")
    @Expose
    private String opportunityIdName;
    @SerializedName("OpportunityId__id")
    @Expose
    private String opportunityIdId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Currency__name")
    @Expose
    private String currencyName;
    @SerializedName("Currency__id")
    @Expose
    private String currencyId;
    @SerializedName("ExchangeRate")
    @Expose
    private String exchangeRate;
    @SerializedName("AssignedTo__name")
    @Expose
    private String assignedToName;
    @SerializedName("AssignedTo__id")
    @Expose
    private String assignedToId;
    @SerializedName("IsRead")
    @Expose
    private String isRead;
    @SerializedName("LocationId__name")
    @Expose
    private String locationIdName;
    @SerializedName("LocationId__id")
    @Expose
    private String locationIdId;
    @SerializedName("LocationId__code")
    @Expose
    private String locationIdCode;
    @SerializedName("SalesOrderStatus__name")
    @Expose
    private String salesOrderStatusName;
    @SerializedName("SalesOrderStatus__id")
    @Expose
    private String salesOrderStatusId;
    @SerializedName("ContactId__name")
    @Expose
    private String contactIdName;
    @SerializedName("ContactId__id")
    @Expose
    private String contactIdId;
    @SerializedName("ContactId__code")
    @Expose
    private String contactIdCode;
    @SerializedName("MailSent")
    @Expose
    private String mailSent;
    @SerializedName("iHardwareRequired")
    @Expose
    private String iHardwareRequired;
    @SerializedName("iVendor__name")
    @Expose
    private String iVendorName;
    @SerializedName("iVendor__id")
    @Expose
    private String iVendorId;
    @SerializedName("iVendor__code")
    @Expose
    private String iVendorCode;
    @SerializedName("AmountReceived")
    @Expose
    private String amountReceived;
    @SerializedName("Account__name")
    @Expose
    private String accountName;
    @SerializedName("Account__id")
    @Expose
    private String accountId;
    @SerializedName("Account__code")
    @Expose
    private String accountCode;
    @SerializedName("fSalesPriceTotal")
    @Expose
    private String fSalesPriceTotal;
    @SerializedName("sCdid")
    @Expose
    private String sCdid;
    @SerializedName("sPassword")
    @Expose
    private String sPassword;
    @SerializedName("sFocusOrderNo")
    @Expose
    private String sFocusOrderNo;
    @SerializedName("FromType")
    @Expose
    private String fromType;
    @SerializedName("PROD")
    @Expose
    private String prod;
    @SerializedName("Location__name")
    @Expose
    private String locationName;
    @SerializedName("Location__id")
    @Expose
    private String locationId;
    @SerializedName("Location__code")
    @Expose
    private String locationCode;
    @SerializedName("iSubscriptionStartDate")
    @Expose
    private String iSubscriptionStartDate;
    @SerializedName("bIsDateUpdated")
    @Expose
    private String bIsDateUpdated;
    @SerializedName("iSubscriptionEndDate")
    @Expose
    private String iSubscriptionEndDate;
    @SerializedName("bIsCRMExists")
    @Expose
    private String bIsCRMExists;
    @SerializedName("bEmailSent")
    @Expose
    private String bEmailSent;
    @SerializedName("TotalAmountReceivedRP")
    @Expose
    private String totalAmountReceivedRP;
    @SerializedName("bIsWorkflowTriggered")
    @Expose
    private String bIsWorkflowTriggered;
    @SerializedName("bForceSaaSRenewal")
    @Expose
    private String bForceSaaSRenewal;
    @SerializedName("fTotalNetAmountUSD")
    @Expose
    private String fTotalNetAmountUSD;
    @SerializedName("Total")
    @Expose
    private String total;
    @SerializedName("ProfitCenter__name")
    @Expose
    private String profitCenterName;
    @SerializedName("ProfitCenter__id")
    @Expose
    private String profitCenterId;
    @SerializedName("ProfitCenter__code")
    @Expose
    private String profitCenterCode;
    @SerializedName("ComPaymentReceived")
    @Expose
    private String comPaymentReceived;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("PrevSalesOrder__name")
    @Expose
    private String prevSalesOrderName;
    @SerializedName("PrevSalesOrder__id")
    @Expose
    private String prevSalesOrderId;
    @SerializedName("LicenseTypeHeader__name")
    @Expose
    private String licenseTypeHeaderName;
    @SerializedName("LicenseTypeHeader__id")
    @Expose
    private String licenseTypeHeaderId;
    @SerializedName("LicenseTypeHeader__code")
    @Expose
    private String licenseTypeHeaderCode;
    @SerializedName("Quote__name")
    @Expose
    private String quoteName;
    @SerializedName("Quote__id")
    @Expose
    private String quoteId;
    @SerializedName("SalesTypeHeader__name")
    @Expose
    private String salesTypeHeaderName;
    @SerializedName("SalesTypeHeader__id")
    @Expose
    private String salesTypeHeaderId;
    @SerializedName("SalesTypeHeader__code")
    @Expose
    private String salesTypeHeaderCode;
    @SerializedName("MasterOrderId__name")
    @Expose
    private String masterOrderIdName;
    @SerializedName("MasterOrderId__id")
    @Expose
    private String masterOrderIdId;
    @SerializedName("MasterOrderId__code")
    @Expose
    private String masterOrderIdCode;
    @SerializedName("ofSharing")
    @Expose
    private String ofSharing;
    @SerializedName("Branch__name")
    @Expose
    private String branchName;
    @SerializedName("Branch__id")
    @Expose
    private String branchId;
    @SerializedName("Branch__code")
    @Expose
    private String branchCode;
    @SerializedName("BranchSharing")
    @Expose
    private String branchSharing;
    @SerializedName("iSaaSContractNo__name")
    @Expose
    private String iSaaSContractNoName;
    @SerializedName("iSaaSContractNo__id")
    @Expose
    private String iSaaSContractNoId;
    @SerializedName("iSaaSContractNo__code")
    @Expose
    private String iSaaSContractNoCode;
    @SerializedName("sPONo")
    @Expose
    private String sPONo;
    @SerializedName("iPODate")
    @Expose
    private String iPODate;
    @SerializedName("fUSDINRConversion")
    @Expose
    private String fUSDINRConversion;
    @SerializedName("iSLA__name")
    @Expose
    private String iSLAName;
    @SerializedName("iSLA__id")
    @Expose
    private String iSLAId;
    @SerializedName("iFreeSupport__name")
    @Expose
    private String iFreeSupportName;
    @SerializedName("iFreeSupport__id")
    @Expose
    private String iFreeSupportId;
    @SerializedName("iFreeSupport__code")
    @Expose
    private String iFreeSupportCode;
    @SerializedName("iWarrantyPeriod__name")
    @Expose
    private String iWarrantyPeriodName;
    @SerializedName("iWarrantyPeriod__id")
    @Expose
    private String iWarrantyPeriodId;
    @SerializedName("iWarrantyPeriod__code")
    @Expose
    private String iWarrantyPeriodCode;
    @SerializedName("fAMCAmount")
    @Expose
    private String fAMCAmount;
    @SerializedName("iBillTo")
    @Expose
    private String iBillTo;
    @SerializedName("iPartnerReseller__name")
    @Expose
    private String iPartnerResellerName;
    @SerializedName("iPartnerReseller__id")
    @Expose
    private String iPartnerResellerId;
    @SerializedName("iPartnerReseller__code")
    @Expose
    private String iPartnerResellerCode;
    @SerializedName("fActualAmountReceived")
    @Expose
    private String fActualAmountReceived;
    @SerializedName("iOrderIRRaised")
    @Expose
    private String iOrderIRRaised;
    @SerializedName("Branch1__name")
    @Expose
    private String branch1Name;
    @SerializedName("Branch1__id")
    @Expose
    private String branch1Id;
    @SerializedName("Branch1__code")
    @Expose
    private String branch1Code;
    @SerializedName("Region__name")
    @Expose
    private String regionName;
    @SerializedName("Region__id")
    @Expose
    private String regionId;
    @SerializedName("Region__code")
    @Expose
    private String regionCode;
    @SerializedName("TotalSaleAmount")
    @Expose
    private String totalSaleAmount;
    @SerializedName("PosttoFocus8")
    @Expose
    private String posttoFocus8;
    @SerializedName("iEmployeeId__name")
    @Expose
    private String iEmployeeIdName;
    @SerializedName("iEmployeeId__id")
    @Expose
    private String iEmployeeIdId;
    @SerializedName("iEmployeeId__code")
    @Expose
    private String iEmployeeIdCode;
    @SerializedName("NewTotalAmountReceived")
    @Expose
    private String newTotalAmountReceived;
    @SerializedName("MasterStatus")
    @Expose
    private String masterStatus;
    @SerializedName("RoundOffAdd")
    @Expose
    private String roundOffAdd;
    @SerializedName("RoundOffDeduct")
    @Expose
    private String roundOffDeduct;
    @SerializedName("ERPPostingDate")
    @Expose
    private String eRPPostingDate;
    @SerializedName("SAASFlag")
    @Expose
    private String sAASFlag;
    @SerializedName("iSalesOrderDate")
    @Expose
    private String iSalesOrderDate;
    @SerializedName("fSalesImplPriceAmount")
    @Expose
    private String fSalesImplPriceAmount;
    @SerializedName("Team__name")
    @Expose
    private String teamName;
    @SerializedName("Team__id")
    @Expose
    private String teamId;
    @SerializedName("Team__code")
    @Expose
    private String teamCode;
    @SerializedName("CostCenter__name")
    @Expose
    private String costCenterName;
    @SerializedName("CostCenter__id")
    @Expose
    private String costCenterId;
    @SerializedName("CostCenter__code")
    @Expose
    private String costCenterCode;
    @SerializedName("Entity__name")
    @Expose
    private String entityName;
    @SerializedName("Entity__id")
    @Expose
    private String entityId;
    @SerializedName("Entity__code")
    @Expose
    private String entityCode;
    @SerializedName("PlaceofSupply__name")
    @Expose
    private String placeofSupplyName;
    @SerializedName("PlaceofSupply__id")
    @Expose
    private String placeofSupplyId;
    @SerializedName("PlaceofSupply__code")
    @Expose
    private String placeofSupplyCode;
    @SerializedName("Jurisdiction__name")
    @Expose
    private String jurisdictionName;
    @SerializedName("Jurisdiction__id")
    @Expose
    private String jurisdictionId;
    @SerializedName("Jurisdiction__code")
    @Expose
    private String jurisdictionCode;
    @SerializedName("stdLicensesprice")
    @Expose
    private String stdLicensesprice;
    @SerializedName("Stdimplprice")
    @Expose
    private String stdimplprice;
    @SerializedName("salesprice")
    @Expose
    private String salesprice;
    @SerializedName("implprice")
    @Expose
    private String implprice;
    @SerializedName("discountonlicense")
    @Expose
    private String discountonlicense;
    @SerializedName("discountonimpl")
    @Expose
    private String discountonimpl;
    @SerializedName("TotalNetAmount")
    @Expose
    private String totalNetAmount;
    @SerializedName("TotalTaxAmount")
    @Expose
    private String totalTaxAmount;
    @SerializedName("lineItems")
    @Expose
    private List<LineItem> lineItems = null;
    private final static long serialVersionUID = 4425611941871232173L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Record() {
    }

    /**
     * 
     * @param profitCenterId
     * @param fUSDINRConversion
     * @param fSalesImplPriceAmount
     * @param teamName
     * @param fSalesPriceTotal
     * @param bIsCRMExists
     * @param salesOrderStatusId
     * @param ofSharing
     * @param iFreeSupportId
     * @param iWarrantyPeriodId
     * @param sPassword
     * @param discountonlicense
     * @param stdLicensesprice
     * @param iEmployeeIdId
     * @param iHardwareRequired
     * @param stdimplprice
     * @param iPartnerResellerName
     * @param masterOrderIdId
     * @param currencyId
     * @param i3PERPType
     * @param createdById
     * @param branch1Code
     * @param branchId
     * @param accountCode
     * @param iPartnerResellerId
     * @param bIsWorkflowTriggered
     * @param newTotalAmountReceived
     * @param prevSalesOrderId
     * @param grandTotal
     * @param posttoFocus8
     * @param iFreeSupportName
     * @param profitCenterCode
     * @param licenseTypeHeaderCode
     * @param contactIdCode
     * @param quoteId
     * @param masterStatus
     * @param branchCode
     * @param accountId
     * @param roundOffDeduct
     * @param costCenterName
     * @param placeofSupplyCode
     * @param sCdid
     * @param syncType
     * @param locationCode
     * @param status
     * @param i3PERPDateTime
     * @param assignedToId
     * @param iSLAName
     * @param s3PERPVoucherNo
     * @param s3PERPCompany
     * @param branch1Id
     * @param opportunityIdName
     * @param isRead
     * @param contactIdName
     * @param fActualAmountReceived
     * @param salesTypeHeaderName
     * @param regionCode
     * @param modifiedByName
     * @param iOrderIRRaised
     * @param locationId
     * @param sAASFlag
     * @param jurisdictionName
     * @param salesOrderStatusName
     * @param iSubscriptionEndDate
     * @param placeofSupplyId
     * @param prod
     * @param locationName
     * @param iVendorCode
     * @param salesTypeHeaderId
     * @param sPONo
     * @param teamCode
     * @param locationIdId
     * @param locationIdCode
     * @param iSaaSContractNoCode
     * @param iEmployeeIdCode
     * @param createdDate
     * @param iWarrantyPeriodName
     * @param sFocusOrderNo
     * @param attributes
     * @param discountonimpl
     * @param s3PERPVoucherType
     * @param overallDiscount
     * @param masterOrderIdName
     * @param implprice
     * @param costCenterCode
     * @param createdByName
     * @param transId
     * @param locationIdName
     * @param iEmployeeIdName
     * @param subTotal
     * @param comPaymentReceived
     * @param mailSent
     * @param profitCenterName
     * @param lineItems
     * @param totalSaleAmount
     * @param modifiedById
     * @param exchangeRate
     * @param entityName
     * @param prevSalesOrderName
     * @param fAMCAmount
     * @param iSLAId
     * @param iPODate
     * @param roundOffAdd
     * @param iBillTo
     * @param iSaaSContractNoId
     * @param tax
     * @param eRPPostingDate
     * @param iWarrantyPeriodCode
     * @param branch1Name
     * @param licenseTypeHeaderId
     * @param modifiedDate
     * @param name
     * @param contactIdId
     * @param totalTaxAmount
     * @param quoteName
     * @param iVendorName
     * @param accountName
     * @param assignedToName
     * @param salesTypeHeaderCode
     * @param regionName
     * @param description
     * @param iSaaSContractNoName
     * @param amountReceived
     * @param branchSharing
     * @param iFreeSupportCode
     * @param expiryDate
     * @param total
     * @param currencyName
     * @param fromType
     * @param costCenterId
     * @param jurisdictionId
     * @param totalAmountReceivedRP
     * @param bIsDateUpdated
     * @param masterOrderIdCode
     * @param opportunityIdId
     * @param bForceSaaSRenewal
     * @param placeofSupplyName
     * @param approvalRemarks
     * @param iSubscriptionStartDate
     * @param salesprice
     * @param bEmailSent
     * @param entityCode
     * @param totalNetAmount
     * @param branchName
     * @param entityId
     * @param iSalesOrderDate
     * @param regionId
     * @param fTotalNetAmountUSD
     * @param licenseTypeHeaderName
     * @param teamId
     * @param jurisdictionCode
     * @param iVendorId
     * @param iPartnerResellerCode
     */
    public Record(Attributes attributes, String transId, String syncType, String createdByName, String createdById, String createdDate, String modifiedByName, String modifiedById, String modifiedDate, String subTotal, String tax, String overallDiscount, String grandTotal, String approvalRemarks, String i3PERPType, String s3PERPVoucherNo, String i3PERPDateTime, String s3PERPCompany, String s3PERPVoucherType, String name, String expiryDate, String opportunityIdName, String opportunityIdId, String description, String currencyName, String currencyId, String exchangeRate, String assignedToName, String assignedToId, String isRead, String locationIdName, String locationIdId, String locationIdCode, String salesOrderStatusName, String salesOrderStatusId, String contactIdName, String contactIdId, String contactIdCode, String mailSent, String iHardwareRequired, String iVendorName, String iVendorId, String iVendorCode, String amountReceived, String accountName, String accountId, String accountCode, String fSalesPriceTotal, String sCdid, String sPassword, String sFocusOrderNo, String fromType, String prod, String locationName, String locationId, String locationCode, String iSubscriptionStartDate, String bIsDateUpdated, String iSubscriptionEndDate, String bIsCRMExists, String bEmailSent, String totalAmountReceivedRP, String bIsWorkflowTriggered, String bForceSaaSRenewal, String fTotalNetAmountUSD, String total, String profitCenterName, String profitCenterId, String profitCenterCode, String comPaymentReceived, String status, String prevSalesOrderName, String prevSalesOrderId, String licenseTypeHeaderName, String licenseTypeHeaderId, String licenseTypeHeaderCode, String quoteName, String quoteId, String salesTypeHeaderName, String salesTypeHeaderId, String salesTypeHeaderCode, String masterOrderIdName, String masterOrderIdId, String masterOrderIdCode, String ofSharing, String branchName, String branchId, String branchCode, String branchSharing, String iSaaSContractNoName, String iSaaSContractNoId, String iSaaSContractNoCode, String sPONo, String iPODate, String fUSDINRConversion, String iSLAName, String iSLAId, String iFreeSupportName, String iFreeSupportId, String iFreeSupportCode, String iWarrantyPeriodName, String iWarrantyPeriodId, String iWarrantyPeriodCode, String fAMCAmount, String iBillTo, String iPartnerResellerName, String iPartnerResellerId, String iPartnerResellerCode, String fActualAmountReceived, String iOrderIRRaised, String branch1Name, String branch1Id, String branch1Code, String regionName, String regionId, String regionCode, String totalSaleAmount, String posttoFocus8, String iEmployeeIdName, String iEmployeeIdId, String iEmployeeIdCode, String newTotalAmountReceived, String masterStatus, String roundOffAdd, String roundOffDeduct, String eRPPostingDate, String sAASFlag, String iSalesOrderDate, String fSalesImplPriceAmount, String teamName, String teamId, String teamCode, String costCenterName, String costCenterId, String costCenterCode, String entityName, String entityId, String entityCode, String placeofSupplyName, String placeofSupplyId, String placeofSupplyCode, String jurisdictionName, String jurisdictionId, String jurisdictionCode, String stdLicensesprice, String stdimplprice, String salesprice, String implprice, String discountonlicense, String discountonimpl, String totalNetAmount, String totalTaxAmount, List<LineItem> lineItems) {
        super();
        this.attributes = attributes;
        this.transId = transId;
        this.syncType = syncType;
        this.createdByName = createdByName;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.modifiedByName = modifiedByName;
        this.modifiedById = modifiedById;
        this.modifiedDate = modifiedDate;
        this.subTotal = subTotal;
        this.tax = tax;
        this.overallDiscount = overallDiscount;
        this.grandTotal = grandTotal;
        this.approvalRemarks = approvalRemarks;
        this.i3PERPType = i3PERPType;
        this.s3PERPVoucherNo = s3PERPVoucherNo;
        this.i3PERPDateTime = i3PERPDateTime;
        this.s3PERPCompany = s3PERPCompany;
        this.s3PERPVoucherType = s3PERPVoucherType;
        this.name = name;
        this.expiryDate = expiryDate;
        this.opportunityIdName = opportunityIdName;
        this.opportunityIdId = opportunityIdId;
        this.description = description;
        this.currencyName = currencyName;
        this.currencyId = currencyId;
        this.exchangeRate = exchangeRate;
        this.assignedToName = assignedToName;
        this.assignedToId = assignedToId;
        this.isRead = isRead;
        this.locationIdName = locationIdName;
        this.locationIdId = locationIdId;
        this.locationIdCode = locationIdCode;
        this.salesOrderStatusName = salesOrderStatusName;
        this.salesOrderStatusId = salesOrderStatusId;
        this.contactIdName = contactIdName;
        this.contactIdId = contactIdId;
        this.contactIdCode = contactIdCode;
        this.mailSent = mailSent;
        this.iHardwareRequired = iHardwareRequired;
        this.iVendorName = iVendorName;
        this.iVendorId = iVendorId;
        this.iVendorCode = iVendorCode;
        this.amountReceived = amountReceived;
        this.accountName = accountName;
        this.accountId = accountId;
        this.accountCode = accountCode;
        this.fSalesPriceTotal = fSalesPriceTotal;
        this.sCdid = sCdid;
        this.sPassword = sPassword;
        this.sFocusOrderNo = sFocusOrderNo;
        this.fromType = fromType;
        this.prod = prod;
        this.locationName = locationName;
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.iSubscriptionStartDate = iSubscriptionStartDate;
        this.bIsDateUpdated = bIsDateUpdated;
        this.iSubscriptionEndDate = iSubscriptionEndDate;
        this.bIsCRMExists = bIsCRMExists;
        this.bEmailSent = bEmailSent;
        this.totalAmountReceivedRP = totalAmountReceivedRP;
        this.bIsWorkflowTriggered = bIsWorkflowTriggered;
        this.bForceSaaSRenewal = bForceSaaSRenewal;
        this.fTotalNetAmountUSD = fTotalNetAmountUSD;
        this.total = total;
        this.profitCenterName = profitCenterName;
        this.profitCenterId = profitCenterId;
        this.profitCenterCode = profitCenterCode;
        this.comPaymentReceived = comPaymentReceived;
        this.status = status;
        this.prevSalesOrderName = prevSalesOrderName;
        this.prevSalesOrderId = prevSalesOrderId;
        this.licenseTypeHeaderName = licenseTypeHeaderName;
        this.licenseTypeHeaderId = licenseTypeHeaderId;
        this.licenseTypeHeaderCode = licenseTypeHeaderCode;
        this.quoteName = quoteName;
        this.quoteId = quoteId;
        this.salesTypeHeaderName = salesTypeHeaderName;
        this.salesTypeHeaderId = salesTypeHeaderId;
        this.salesTypeHeaderCode = salesTypeHeaderCode;
        this.masterOrderIdName = masterOrderIdName;
        this.masterOrderIdId = masterOrderIdId;
        this.masterOrderIdCode = masterOrderIdCode;
        this.ofSharing = ofSharing;
        this.branchName = branchName;
        this.branchId = branchId;
        this.branchCode = branchCode;
        this.branchSharing = branchSharing;
        this.iSaaSContractNoName = iSaaSContractNoName;
        this.iSaaSContractNoId = iSaaSContractNoId;
        this.iSaaSContractNoCode = iSaaSContractNoCode;
        this.sPONo = sPONo;
        this.iPODate = iPODate;
        this.fUSDINRConversion = fUSDINRConversion;
        this.iSLAName = iSLAName;
        this.iSLAId = iSLAId;
        this.iFreeSupportName = iFreeSupportName;
        this.iFreeSupportId = iFreeSupportId;
        this.iFreeSupportCode = iFreeSupportCode;
        this.iWarrantyPeriodName = iWarrantyPeriodName;
        this.iWarrantyPeriodId = iWarrantyPeriodId;
        this.iWarrantyPeriodCode = iWarrantyPeriodCode;
        this.fAMCAmount = fAMCAmount;
        this.iBillTo = iBillTo;
        this.iPartnerResellerName = iPartnerResellerName;
        this.iPartnerResellerId = iPartnerResellerId;
        this.iPartnerResellerCode = iPartnerResellerCode;
        this.fActualAmountReceived = fActualAmountReceived;
        this.iOrderIRRaised = iOrderIRRaised;
        this.branch1Name = branch1Name;
        this.branch1Id = branch1Id;
        this.branch1Code = branch1Code;
        this.regionName = regionName;
        this.regionId = regionId;
        this.regionCode = regionCode;
        this.totalSaleAmount = totalSaleAmount;
        this.posttoFocus8 = posttoFocus8;
        this.iEmployeeIdName = iEmployeeIdName;
        this.iEmployeeIdId = iEmployeeIdId;
        this.iEmployeeIdCode = iEmployeeIdCode;
        this.newTotalAmountReceived = newTotalAmountReceived;
        this.masterStatus = masterStatus;
        this.roundOffAdd = roundOffAdd;
        this.roundOffDeduct = roundOffDeduct;
        this.eRPPostingDate = eRPPostingDate;
        this.sAASFlag = sAASFlag;
        this.iSalesOrderDate = iSalesOrderDate;
        this.fSalesImplPriceAmount = fSalesImplPriceAmount;
        this.teamName = teamName;
        this.teamId = teamId;
        this.teamCode = teamCode;
        this.costCenterName = costCenterName;
        this.costCenterId = costCenterId;
        this.costCenterCode = costCenterCode;
        this.entityName = entityName;
        this.entityId = entityId;
        this.entityCode = entityCode;
        this.placeofSupplyName = placeofSupplyName;
        this.placeofSupplyId = placeofSupplyId;
        this.placeofSupplyCode = placeofSupplyCode;
        this.jurisdictionName = jurisdictionName;
        this.jurisdictionId = jurisdictionId;
        this.jurisdictionCode = jurisdictionCode;
        this.stdLicensesprice = stdLicensesprice;
        this.stdimplprice = stdimplprice;
        this.salesprice = salesprice;
        this.implprice = implprice;
        this.discountonlicense = discountonlicense;
        this.discountonimpl = discountonimpl;
        this.totalNetAmount = totalNetAmount;
        this.totalTaxAmount = totalTaxAmount;
        this.lineItems = lineItems;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getSyncType() {
        return syncType;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
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

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getOverallDiscount() {
        return overallDiscount;
    }

    public void setOverallDiscount(String overallDiscount) {
        this.overallDiscount = overallDiscount;
    }

    public String getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getApprovalRemarks() {
        return approvalRemarks;
    }

    public void setApprovalRemarks(String approvalRemarks) {
        this.approvalRemarks = approvalRemarks;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOpportunityIdName() {
        return opportunityIdName;
    }

    public void setOpportunityIdName(String opportunityIdName) {
        this.opportunityIdName = opportunityIdName;
    }

    public String getOpportunityIdId() {
        return opportunityIdId;
    }

    public void setOpportunityIdId(String opportunityIdId) {
        this.opportunityIdId = opportunityIdId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public String getLocationIdName() {
        return locationIdName;
    }

    public void setLocationIdName(String locationIdName) {
        this.locationIdName = locationIdName;
    }

    public String getLocationIdId() {
        return locationIdId;
    }

    public void setLocationIdId(String locationIdId) {
        this.locationIdId = locationIdId;
    }

    public String getLocationIdCode() {
        return locationIdCode;
    }

    public void setLocationIdCode(String locationIdCode) {
        this.locationIdCode = locationIdCode;
    }

    public String getSalesOrderStatusName() {
        return salesOrderStatusName;
    }

    public void setSalesOrderStatusName(String salesOrderStatusName) {
        this.salesOrderStatusName = salesOrderStatusName;
    }

    public String getSalesOrderStatusId() {
        return salesOrderStatusId;
    }

    public void setSalesOrderStatusId(String salesOrderStatusId) {
        this.salesOrderStatusId = salesOrderStatusId;
    }

    public String getContactIdName() {
        return contactIdName;
    }

    public void setContactIdName(String contactIdName) {
        this.contactIdName = contactIdName;
    }

    public String getContactIdId() {
        return contactIdId;
    }

    public void setContactIdId(String contactIdId) {
        this.contactIdId = contactIdId;
    }

    public String getContactIdCode() {
        return contactIdCode;
    }

    public void setContactIdCode(String contactIdCode) {
        this.contactIdCode = contactIdCode;
    }

    public String getMailSent() {
        return mailSent;
    }

    public void setMailSent(String mailSent) {
        this.mailSent = mailSent;
    }

    public String getiHardwareRequired() {
        return iHardwareRequired;
    }

    public void setiHardwareRequired(String iHardwareRequired) {
        this.iHardwareRequired = iHardwareRequired;
    }

    public String getiVendorName() {
        return iVendorName;
    }

    public void setiVendorName(String iVendorName) {
        this.iVendorName = iVendorName;
    }

    public String getiVendorId() {
        return iVendorId;
    }

    public void setiVendorId(String iVendorId) {
        this.iVendorId = iVendorId;
    }

    public String getiVendorCode() {
        return iVendorCode;
    }

    public void setiVendorCode(String iVendorCode) {
        this.iVendorCode = iVendorCode;
    }

    public String getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
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

    public String getfSalesPriceTotal() {
        return fSalesPriceTotal;
    }

    public void setfSalesPriceTotal(String fSalesPriceTotal) {
        this.fSalesPriceTotal = fSalesPriceTotal;
    }

    public String getsCdid() {
        return sCdid;
    }

    public void setsCdid(String sCdid) {
        this.sCdid = sCdid;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsFocusOrderNo() {
        return sFocusOrderNo;
    }

    public void setsFocusOrderNo(String sFocusOrderNo) {
        this.sFocusOrderNo = sFocusOrderNo;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
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

    public String getiSubscriptionStartDate() {
        return iSubscriptionStartDate;
    }

    public void setiSubscriptionStartDate(String iSubscriptionStartDate) {
        this.iSubscriptionStartDate = iSubscriptionStartDate;
    }

    public String getbIsDateUpdated() {
        return bIsDateUpdated;
    }

    public void setbIsDateUpdated(String bIsDateUpdated) {
        this.bIsDateUpdated = bIsDateUpdated;
    }

    public String getiSubscriptionEndDate() {
        return iSubscriptionEndDate;
    }

    public void setiSubscriptionEndDate(String iSubscriptionEndDate) {
        this.iSubscriptionEndDate = iSubscriptionEndDate;
    }

    public String getbIsCRMExists() {
        return bIsCRMExists;
    }

    public void setbIsCRMExists(String bIsCRMExists) {
        this.bIsCRMExists = bIsCRMExists;
    }

    public String getbEmailSent() {
        return bEmailSent;
    }

    public void setbEmailSent(String bEmailSent) {
        this.bEmailSent = bEmailSent;
    }

    public String getTotalAmountReceivedRP() {
        return totalAmountReceivedRP;
    }

    public void setTotalAmountReceivedRP(String totalAmountReceivedRP) {
        this.totalAmountReceivedRP = totalAmountReceivedRP;
    }

    public String getbIsWorkflowTriggered() {
        return bIsWorkflowTriggered;
    }

    public void setbIsWorkflowTriggered(String bIsWorkflowTriggered) {
        this.bIsWorkflowTriggered = bIsWorkflowTriggered;
    }

    public String getbForceSaaSRenewal() {
        return bForceSaaSRenewal;
    }

    public void setbForceSaaSRenewal(String bForceSaaSRenewal) {
        this.bForceSaaSRenewal = bForceSaaSRenewal;
    }

    public String getfTotalNetAmountUSD() {
        return fTotalNetAmountUSD;
    }

    public void setfTotalNetAmountUSD(String fTotalNetAmountUSD) {
        this.fTotalNetAmountUSD = fTotalNetAmountUSD;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getProfitCenterName() {
        return profitCenterName;
    }

    public void setProfitCenterName(String profitCenterName) {
        this.profitCenterName = profitCenterName;
    }

    public String getProfitCenterId() {
        return profitCenterId;
    }

    public void setProfitCenterId(String profitCenterId) {
        this.profitCenterId = profitCenterId;
    }

    public String getProfitCenterCode() {
        return profitCenterCode;
    }

    public void setProfitCenterCode(String profitCenterCode) {
        this.profitCenterCode = profitCenterCode;
    }

    public String getComPaymentReceived() {
        return comPaymentReceived;
    }

    public void setComPaymentReceived(String comPaymentReceived) {
        this.comPaymentReceived = comPaymentReceived;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrevSalesOrderName() {
        return prevSalesOrderName;
    }

    public void setPrevSalesOrderName(String prevSalesOrderName) {
        this.prevSalesOrderName = prevSalesOrderName;
    }

    public String getPrevSalesOrderId() {
        return prevSalesOrderId;
    }

    public void setPrevSalesOrderId(String prevSalesOrderId) {
        this.prevSalesOrderId = prevSalesOrderId;
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

    public String getQuoteName() {
        return quoteName;
    }

    public void setQuoteName(String quoteName) {
        this.quoteName = quoteName;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getSalesTypeHeaderName() {
        return salesTypeHeaderName;
    }

    public void setSalesTypeHeaderName(String salesTypeHeaderName) {
        this.salesTypeHeaderName = salesTypeHeaderName;
    }

    public String getSalesTypeHeaderId() {
        return salesTypeHeaderId;
    }

    public void setSalesTypeHeaderId(String salesTypeHeaderId) {
        this.salesTypeHeaderId = salesTypeHeaderId;
    }

    public String getSalesTypeHeaderCode() {
        return salesTypeHeaderCode;
    }

    public void setSalesTypeHeaderCode(String salesTypeHeaderCode) {
        this.salesTypeHeaderCode = salesTypeHeaderCode;
    }

    public String getMasterOrderIdName() {
        return masterOrderIdName;
    }

    public void setMasterOrderIdName(String masterOrderIdName) {
        this.masterOrderIdName = masterOrderIdName;
    }

    public String getMasterOrderIdId() {
        return masterOrderIdId;
    }

    public void setMasterOrderIdId(String masterOrderIdId) {
        this.masterOrderIdId = masterOrderIdId;
    }

    public String getMasterOrderIdCode() {
        return masterOrderIdCode;
    }

    public void setMasterOrderIdCode(String masterOrderIdCode) {
        this.masterOrderIdCode = masterOrderIdCode;
    }

    public String getOfSharing() {
        return ofSharing;
    }

    public void setOfSharing(String ofSharing) {
        this.ofSharing = ofSharing;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchSharing() {
        return branchSharing;
    }

    public void setBranchSharing(String branchSharing) {
        this.branchSharing = branchSharing;
    }

    public String getiSaaSContractNoName() {
        return iSaaSContractNoName;
    }

    public void setiSaaSContractNoName(String iSaaSContractNoName) {
        this.iSaaSContractNoName = iSaaSContractNoName;
    }

    public String getiSaaSContractNoId() {
        return iSaaSContractNoId;
    }

    public void setiSaaSContractNoId(String iSaaSContractNoId) {
        this.iSaaSContractNoId = iSaaSContractNoId;
    }

    public String getiSaaSContractNoCode() {
        return iSaaSContractNoCode;
    }

    public void setiSaaSContractNoCode(String iSaaSContractNoCode) {
        this.iSaaSContractNoCode = iSaaSContractNoCode;
    }

    public String getsPONo() {
        return sPONo;
    }

    public void setsPONo(String sPONo) {
        this.sPONo = sPONo;
    }

    public String getiPODate() {
        return iPODate;
    }

    public void setiPODate(String iPODate) {
        this.iPODate = iPODate;
    }

    public String getfUSDINRConversion() {
        return fUSDINRConversion;
    }

    public void setfUSDINRConversion(String fUSDINRConversion) {
        this.fUSDINRConversion = fUSDINRConversion;
    }

    public String getiSLAName() {
        return iSLAName;
    }

    public void setiSLAName(String iSLAName) {
        this.iSLAName = iSLAName;
    }

    public String getiSLAId() {
        return iSLAId;
    }

    public void setiSLAId(String iSLAId) {
        this.iSLAId = iSLAId;
    }

    public String getiFreeSupportName() {
        return iFreeSupportName;
    }

    public void setiFreeSupportName(String iFreeSupportName) {
        this.iFreeSupportName = iFreeSupportName;
    }

    public String getiFreeSupportId() {
        return iFreeSupportId;
    }

    public void setiFreeSupportId(String iFreeSupportId) {
        this.iFreeSupportId = iFreeSupportId;
    }

    public String getiFreeSupportCode() {
        return iFreeSupportCode;
    }

    public void setiFreeSupportCode(String iFreeSupportCode) {
        this.iFreeSupportCode = iFreeSupportCode;
    }

    public String getiWarrantyPeriodName() {
        return iWarrantyPeriodName;
    }

    public void setiWarrantyPeriodName(String iWarrantyPeriodName) {
        this.iWarrantyPeriodName = iWarrantyPeriodName;
    }

    public String getiWarrantyPeriodId() {
        return iWarrantyPeriodId;
    }

    public void setiWarrantyPeriodId(String iWarrantyPeriodId) {
        this.iWarrantyPeriodId = iWarrantyPeriodId;
    }

    public String getiWarrantyPeriodCode() {
        return iWarrantyPeriodCode;
    }

    public void setiWarrantyPeriodCode(String iWarrantyPeriodCode) {
        this.iWarrantyPeriodCode = iWarrantyPeriodCode;
    }

    public String getfAMCAmount() {
        return fAMCAmount;
    }

    public void setfAMCAmount(String fAMCAmount) {
        this.fAMCAmount = fAMCAmount;
    }

    public String getiBillTo() {
        return iBillTo;
    }

    public void setiBillTo(String iBillTo) {
        this.iBillTo = iBillTo;
    }

    public String getiPartnerResellerName() {
        return iPartnerResellerName;
    }

    public void setiPartnerResellerName(String iPartnerResellerName) {
        this.iPartnerResellerName = iPartnerResellerName;
    }

    public String getiPartnerResellerId() {
        return iPartnerResellerId;
    }

    public void setiPartnerResellerId(String iPartnerResellerId) {
        this.iPartnerResellerId = iPartnerResellerId;
    }

    public String getiPartnerResellerCode() {
        return iPartnerResellerCode;
    }

    public void setiPartnerResellerCode(String iPartnerResellerCode) {
        this.iPartnerResellerCode = iPartnerResellerCode;
    }

    public String getfActualAmountReceived() {
        return fActualAmountReceived;
    }

    public void setfActualAmountReceived(String fActualAmountReceived) {
        this.fActualAmountReceived = fActualAmountReceived;
    }

    public String getiOrderIRRaised() {
        return iOrderIRRaised;
    }

    public void setiOrderIRRaised(String iOrderIRRaised) {
        this.iOrderIRRaised = iOrderIRRaised;
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

    public String getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public void setTotalSaleAmount(String totalSaleAmount) {
        this.totalSaleAmount = totalSaleAmount;
    }

    public String getPosttoFocus8() {
        return posttoFocus8;
    }

    public void setPosttoFocus8(String posttoFocus8) {
        this.posttoFocus8 = posttoFocus8;
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

    public String getNewTotalAmountReceived() {
        return newTotalAmountReceived;
    }

    public void setNewTotalAmountReceived(String newTotalAmountReceived) {
        this.newTotalAmountReceived = newTotalAmountReceived;
    }

    public String getMasterStatus() {
        return masterStatus;
    }

    public void setMasterStatus(String masterStatus) {
        this.masterStatus = masterStatus;
    }

    public String getRoundOffAdd() {
        return roundOffAdd;
    }

    public void setRoundOffAdd(String roundOffAdd) {
        this.roundOffAdd = roundOffAdd;
    }

    public String getRoundOffDeduct() {
        return roundOffDeduct;
    }

    public void setRoundOffDeduct(String roundOffDeduct) {
        this.roundOffDeduct = roundOffDeduct;
    }

    public String getERPPostingDate() {
        return eRPPostingDate;
    }

    public void setERPPostingDate(String eRPPostingDate) {
        this.eRPPostingDate = eRPPostingDate;
    }

    public String getSAASFlag() {
        return sAASFlag;
    }

    public void setSAASFlag(String sAASFlag) {
        this.sAASFlag = sAASFlag;
    }

    public String getiSalesOrderDate() {
        return iSalesOrderDate;
    }

    public void setiSalesOrderDate(String iSalesOrderDate) {
        this.iSalesOrderDate = iSalesOrderDate;
    }

    public String getfSalesImplPriceAmount() {
        return fSalesImplPriceAmount;
    }

    public void setfSalesImplPriceAmount(String fSalesImplPriceAmount) {
        this.fSalesImplPriceAmount = fSalesImplPriceAmount;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
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

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
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

    public String getStdLicensesprice() {
        return stdLicensesprice;
    }

    public void setStdLicensesprice(String stdLicensesprice) {
        this.stdLicensesprice = stdLicensesprice;
    }

    public String getStdimplprice() {
        return stdimplprice;
    }

    public void setStdimplprice(String stdimplprice) {
        this.stdimplprice = stdimplprice;
    }

    public String getSalesprice() {
        return salesprice;
    }

    public void setSalesprice(String salesprice) {
        this.salesprice = salesprice;
    }

    public String getImplprice() {
        return implprice;
    }

    public void setImplprice(String implprice) {
        this.implprice = implprice;
    }

    public String getDiscountonlicense() {
        return discountonlicense;
    }

    public void setDiscountonlicense(String discountonlicense) {
        this.discountonlicense = discountonlicense;
    }

    public String getDiscountonimpl() {
        return discountonimpl;
    }

    public void setDiscountonimpl(String discountonimpl) {
        this.discountonimpl = discountonimpl;
    }

    public String getTotalNetAmount() {
        return totalNetAmount;
    }

    public void setTotalNetAmount(String totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public String getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(String totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
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
        sb.append("transId");
        sb.append('=');
        sb.append(((this.transId == null)?"<null>":this.transId));
        sb.append(',');
        sb.append("syncType");
        sb.append('=');
        sb.append(((this.syncType == null)?"<null>":this.syncType));
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
        sb.append("modifiedByName");
        sb.append('=');
        sb.append(((this.modifiedByName == null)?"<null>":this.modifiedByName));
        sb.append(',');
        sb.append("modifiedById");
        sb.append('=');
        sb.append(((this.modifiedById == null)?"<null>":this.modifiedById));
        sb.append(',');
        sb.append("modifiedDate");
        sb.append('=');
        sb.append(((this.modifiedDate == null)?"<null>":this.modifiedDate));
        sb.append(',');
        sb.append("subTotal");
        sb.append('=');
        sb.append(((this.subTotal == null)?"<null>":this.subTotal));
        sb.append(',');
        sb.append("tax");
        sb.append('=');
        sb.append(((this.tax == null)?"<null>":this.tax));
        sb.append(',');
        sb.append("overallDiscount");
        sb.append('=');
        sb.append(((this.overallDiscount == null)?"<null>":this.overallDiscount));
        sb.append(',');
        sb.append("grandTotal");
        sb.append('=');
        sb.append(((this.grandTotal == null)?"<null>":this.grandTotal));
        sb.append(',');
        sb.append("approvalRemarks");
        sb.append('=');
        sb.append(((this.approvalRemarks == null)?"<null>":this.approvalRemarks));
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("opportunityIdName");
        sb.append('=');
        sb.append(((this.opportunityIdName == null)?"<null>":this.opportunityIdName));
        sb.append(',');
        sb.append("opportunityIdId");
        sb.append('=');
        sb.append(((this.opportunityIdId == null)?"<null>":this.opportunityIdId));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("currencyName");
        sb.append('=');
        sb.append(((this.currencyName == null)?"<null>":this.currencyName));
        sb.append(',');
        sb.append("currencyId");
        sb.append('=');
        sb.append(((this.currencyId == null)?"<null>":this.currencyId));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
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
        sb.append("locationIdName");
        sb.append('=');
        sb.append(((this.locationIdName == null)?"<null>":this.locationIdName));
        sb.append(',');
        sb.append("locationIdId");
        sb.append('=');
        sb.append(((this.locationIdId == null)?"<null>":this.locationIdId));
        sb.append(',');
        sb.append("locationIdCode");
        sb.append('=');
        sb.append(((this.locationIdCode == null)?"<null>":this.locationIdCode));
        sb.append(',');
        sb.append("salesOrderStatusName");
        sb.append('=');
        sb.append(((this.salesOrderStatusName == null)?"<null>":this.salesOrderStatusName));
        sb.append(',');
        sb.append("salesOrderStatusId");
        sb.append('=');
        sb.append(((this.salesOrderStatusId == null)?"<null>":this.salesOrderStatusId));
        sb.append(',');
        sb.append("contactIdName");
        sb.append('=');
        sb.append(((this.contactIdName == null)?"<null>":this.contactIdName));
        sb.append(',');
        sb.append("contactIdId");
        sb.append('=');
        sb.append(((this.contactIdId == null)?"<null>":this.contactIdId));
        sb.append(',');
        sb.append("contactIdCode");
        sb.append('=');
        sb.append(((this.contactIdCode == null)?"<null>":this.contactIdCode));
        sb.append(',');
        sb.append("mailSent");
        sb.append('=');
        sb.append(((this.mailSent == null)?"<null>":this.mailSent));
        sb.append(',');
        sb.append("iHardwareRequired");
        sb.append('=');
        sb.append(((this.iHardwareRequired == null)?"<null>":this.iHardwareRequired));
        sb.append(',');
        sb.append("iVendorName");
        sb.append('=');
        sb.append(((this.iVendorName == null)?"<null>":this.iVendorName));
        sb.append(',');
        sb.append("iVendorId");
        sb.append('=');
        sb.append(((this.iVendorId == null)?"<null>":this.iVendorId));
        sb.append(',');
        sb.append("iVendorCode");
        sb.append('=');
        sb.append(((this.iVendorCode == null)?"<null>":this.iVendorCode));
        sb.append(',');
        sb.append("amountReceived");
        sb.append('=');
        sb.append(((this.amountReceived == null)?"<null>":this.amountReceived));
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
        sb.append("fSalesPriceTotal");
        sb.append('=');
        sb.append(((this.fSalesPriceTotal == null)?"<null>":this.fSalesPriceTotal));
        sb.append(',');
        sb.append("sCdid");
        sb.append('=');
        sb.append(((this.sCdid == null)?"<null>":this.sCdid));
        sb.append(',');
        sb.append("sPassword");
        sb.append('=');
        sb.append(((this.sPassword == null)?"<null>":this.sPassword));
        sb.append(',');
        sb.append("sFocusOrderNo");
        sb.append('=');
        sb.append(((this.sFocusOrderNo == null)?"<null>":this.sFocusOrderNo));
        sb.append(',');
        sb.append("fromType");
        sb.append('=');
        sb.append(((this.fromType == null)?"<null>":this.fromType));
        sb.append(',');
        sb.append("prod");
        sb.append('=');
        sb.append(((this.prod == null)?"<null>":this.prod));
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
        sb.append("iSubscriptionStartDate");
        sb.append('=');
        sb.append(((this.iSubscriptionStartDate == null)?"<null>":this.iSubscriptionStartDate));
        sb.append(',');
        sb.append("bIsDateUpdated");
        sb.append('=');
        sb.append(((this.bIsDateUpdated == null)?"<null>":this.bIsDateUpdated));
        sb.append(',');
        sb.append("iSubscriptionEndDate");
        sb.append('=');
        sb.append(((this.iSubscriptionEndDate == null)?"<null>":this.iSubscriptionEndDate));
        sb.append(',');
        sb.append("bIsCRMExists");
        sb.append('=');
        sb.append(((this.bIsCRMExists == null)?"<null>":this.bIsCRMExists));
        sb.append(',');
        sb.append("bEmailSent");
        sb.append('=');
        sb.append(((this.bEmailSent == null)?"<null>":this.bEmailSent));
        sb.append(',');
        sb.append("totalAmountReceivedRP");
        sb.append('=');
        sb.append(((this.totalAmountReceivedRP == null)?"<null>":this.totalAmountReceivedRP));
        sb.append(',');
        sb.append("bIsWorkflowTriggered");
        sb.append('=');
        sb.append(((this.bIsWorkflowTriggered == null)?"<null>":this.bIsWorkflowTriggered));
        sb.append(',');
        sb.append("bForceSaaSRenewal");
        sb.append('=');
        sb.append(((this.bForceSaaSRenewal == null)?"<null>":this.bForceSaaSRenewal));
        sb.append(',');
        sb.append("fTotalNetAmountUSD");
        sb.append('=');
        sb.append(((this.fTotalNetAmountUSD == null)?"<null>":this.fTotalNetAmountUSD));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("profitCenterName");
        sb.append('=');
        sb.append(((this.profitCenterName == null)?"<null>":this.profitCenterName));
        sb.append(',');
        sb.append("profitCenterId");
        sb.append('=');
        sb.append(((this.profitCenterId == null)?"<null>":this.profitCenterId));
        sb.append(',');
        sb.append("profitCenterCode");
        sb.append('=');
        sb.append(((this.profitCenterCode == null)?"<null>":this.profitCenterCode));
        sb.append(',');
        sb.append("comPaymentReceived");
        sb.append('=');
        sb.append(((this.comPaymentReceived == null)?"<null>":this.comPaymentReceived));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("prevSalesOrderName");
        sb.append('=');
        sb.append(((this.prevSalesOrderName == null)?"<null>":this.prevSalesOrderName));
        sb.append(',');
        sb.append("prevSalesOrderId");
        sb.append('=');
        sb.append(((this.prevSalesOrderId == null)?"<null>":this.prevSalesOrderId));
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
        sb.append("quoteName");
        sb.append('=');
        sb.append(((this.quoteName == null)?"<null>":this.quoteName));
        sb.append(',');
        sb.append("quoteId");
        sb.append('=');
        sb.append(((this.quoteId == null)?"<null>":this.quoteId));
        sb.append(',');
        sb.append("salesTypeHeaderName");
        sb.append('=');
        sb.append(((this.salesTypeHeaderName == null)?"<null>":this.salesTypeHeaderName));
        sb.append(',');
        sb.append("salesTypeHeaderId");
        sb.append('=');
        sb.append(((this.salesTypeHeaderId == null)?"<null>":this.salesTypeHeaderId));
        sb.append(',');
        sb.append("salesTypeHeaderCode");
        sb.append('=');
        sb.append(((this.salesTypeHeaderCode == null)?"<null>":this.salesTypeHeaderCode));
        sb.append(',');
        sb.append("masterOrderIdName");
        sb.append('=');
        sb.append(((this.masterOrderIdName == null)?"<null>":this.masterOrderIdName));
        sb.append(',');
        sb.append("masterOrderIdId");
        sb.append('=');
        sb.append(((this.masterOrderIdId == null)?"<null>":this.masterOrderIdId));
        sb.append(',');
        sb.append("masterOrderIdCode");
        sb.append('=');
        sb.append(((this.masterOrderIdCode == null)?"<null>":this.masterOrderIdCode));
        sb.append(',');
        sb.append("ofSharing");
        sb.append('=');
        sb.append(((this.ofSharing == null)?"<null>":this.ofSharing));
        sb.append(',');
        sb.append("branchName");
        sb.append('=');
        sb.append(((this.branchName == null)?"<null>":this.branchName));
        sb.append(',');
        sb.append("branchId");
        sb.append('=');
        sb.append(((this.branchId == null)?"<null>":this.branchId));
        sb.append(',');
        sb.append("branchCode");
        sb.append('=');
        sb.append(((this.branchCode == null)?"<null>":this.branchCode));
        sb.append(',');
        sb.append("branchSharing");
        sb.append('=');
        sb.append(((this.branchSharing == null)?"<null>":this.branchSharing));
        sb.append(',');
        sb.append("iSaaSContractNoName");
        sb.append('=');
        sb.append(((this.iSaaSContractNoName == null)?"<null>":this.iSaaSContractNoName));
        sb.append(',');
        sb.append("iSaaSContractNoId");
        sb.append('=');
        sb.append(((this.iSaaSContractNoId == null)?"<null>":this.iSaaSContractNoId));
        sb.append(',');
        sb.append("iSaaSContractNoCode");
        sb.append('=');
        sb.append(((this.iSaaSContractNoCode == null)?"<null>":this.iSaaSContractNoCode));
        sb.append(',');
        sb.append("sPONo");
        sb.append('=');
        sb.append(((this.sPONo == null)?"<null>":this.sPONo));
        sb.append(',');
        sb.append("iPODate");
        sb.append('=');
        sb.append(((this.iPODate == null)?"<null>":this.iPODate));
        sb.append(',');
        sb.append("fUSDINRConversion");
        sb.append('=');
        sb.append(((this.fUSDINRConversion == null)?"<null>":this.fUSDINRConversion));
        sb.append(',');
        sb.append("iSLAName");
        sb.append('=');
        sb.append(((this.iSLAName == null)?"<null>":this.iSLAName));
        sb.append(',');
        sb.append("iSLAId");
        sb.append('=');
        sb.append(((this.iSLAId == null)?"<null>":this.iSLAId));
        sb.append(',');
        sb.append("iFreeSupportName");
        sb.append('=');
        sb.append(((this.iFreeSupportName == null)?"<null>":this.iFreeSupportName));
        sb.append(',');
        sb.append("iFreeSupportId");
        sb.append('=');
        sb.append(((this.iFreeSupportId == null)?"<null>":this.iFreeSupportId));
        sb.append(',');
        sb.append("iFreeSupportCode");
        sb.append('=');
        sb.append(((this.iFreeSupportCode == null)?"<null>":this.iFreeSupportCode));
        sb.append(',');
        sb.append("iWarrantyPeriodName");
        sb.append('=');
        sb.append(((this.iWarrantyPeriodName == null)?"<null>":this.iWarrantyPeriodName));
        sb.append(',');
        sb.append("iWarrantyPeriodId");
        sb.append('=');
        sb.append(((this.iWarrantyPeriodId == null)?"<null>":this.iWarrantyPeriodId));
        sb.append(',');
        sb.append("iWarrantyPeriodCode");
        sb.append('=');
        sb.append(((this.iWarrantyPeriodCode == null)?"<null>":this.iWarrantyPeriodCode));
        sb.append(',');
        sb.append("fAMCAmount");
        sb.append('=');
        sb.append(((this.fAMCAmount == null)?"<null>":this.fAMCAmount));
        sb.append(',');
        sb.append("iBillTo");
        sb.append('=');
        sb.append(((this.iBillTo == null)?"<null>":this.iBillTo));
        sb.append(',');
        sb.append("iPartnerResellerName");
        sb.append('=');
        sb.append(((this.iPartnerResellerName == null)?"<null>":this.iPartnerResellerName));
        sb.append(',');
        sb.append("iPartnerResellerId");
        sb.append('=');
        sb.append(((this.iPartnerResellerId == null)?"<null>":this.iPartnerResellerId));
        sb.append(',');
        sb.append("iPartnerResellerCode");
        sb.append('=');
        sb.append(((this.iPartnerResellerCode == null)?"<null>":this.iPartnerResellerCode));
        sb.append(',');
        sb.append("fActualAmountReceived");
        sb.append('=');
        sb.append(((this.fActualAmountReceived == null)?"<null>":this.fActualAmountReceived));
        sb.append(',');
        sb.append("iOrderIRRaised");
        sb.append('=');
        sb.append(((this.iOrderIRRaised == null)?"<null>":this.iOrderIRRaised));
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
        sb.append("totalSaleAmount");
        sb.append('=');
        sb.append(((this.totalSaleAmount == null)?"<null>":this.totalSaleAmount));
        sb.append(',');
        sb.append("posttoFocus8");
        sb.append('=');
        sb.append(((this.posttoFocus8 == null)?"<null>":this.posttoFocus8));
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
        sb.append("newTotalAmountReceived");
        sb.append('=');
        sb.append(((this.newTotalAmountReceived == null)?"<null>":this.newTotalAmountReceived));
        sb.append(',');
        sb.append("masterStatus");
        sb.append('=');
        sb.append(((this.masterStatus == null)?"<null>":this.masterStatus));
        sb.append(',');
        sb.append("roundOffAdd");
        sb.append('=');
        sb.append(((this.roundOffAdd == null)?"<null>":this.roundOffAdd));
        sb.append(',');
        sb.append("roundOffDeduct");
        sb.append('=');
        sb.append(((this.roundOffDeduct == null)?"<null>":this.roundOffDeduct));
        sb.append(',');
        sb.append("eRPPostingDate");
        sb.append('=');
        sb.append(((this.eRPPostingDate == null)?"<null>":this.eRPPostingDate));
        sb.append(',');
        sb.append("sAASFlag");
        sb.append('=');
        sb.append(((this.sAASFlag == null)?"<null>":this.sAASFlag));
        sb.append(',');
        sb.append("iSalesOrderDate");
        sb.append('=');
        sb.append(((this.iSalesOrderDate == null)?"<null>":this.iSalesOrderDate));
        sb.append(',');
        sb.append("fSalesImplPriceAmount");
        sb.append('=');
        sb.append(((this.fSalesImplPriceAmount == null)?"<null>":this.fSalesImplPriceAmount));
        sb.append(',');
        sb.append("teamName");
        sb.append('=');
        sb.append(((this.teamName == null)?"<null>":this.teamName));
        sb.append(',');
        sb.append("teamId");
        sb.append('=');
        sb.append(((this.teamId == null)?"<null>":this.teamId));
        sb.append(',');
        sb.append("teamCode");
        sb.append('=');
        sb.append(((this.teamCode == null)?"<null>":this.teamCode));
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
        sb.append("entityName");
        sb.append('=');
        sb.append(((this.entityName == null)?"<null>":this.entityName));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("entityCode");
        sb.append('=');
        sb.append(((this.entityCode == null)?"<null>":this.entityCode));
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
        sb.append("stdLicensesprice");
        sb.append('=');
        sb.append(((this.stdLicensesprice == null)?"<null>":this.stdLicensesprice));
        sb.append(',');
        sb.append("stdimplprice");
        sb.append('=');
        sb.append(((this.stdimplprice == null)?"<null>":this.stdimplprice));
        sb.append(',');
        sb.append("salesprice");
        sb.append('=');
        sb.append(((this.salesprice == null)?"<null>":this.salesprice));
        sb.append(',');
        sb.append("implprice");
        sb.append('=');
        sb.append(((this.implprice == null)?"<null>":this.implprice));
        sb.append(',');
        sb.append("discountonlicense");
        sb.append('=');
        sb.append(((this.discountonlicense == null)?"<null>":this.discountonlicense));
        sb.append(',');
        sb.append("discountonimpl");
        sb.append('=');
        sb.append(((this.discountonimpl == null)?"<null>":this.discountonimpl));
        sb.append(',');
        sb.append("totalNetAmount");
        sb.append('=');
        sb.append(((this.totalNetAmount == null)?"<null>":this.totalNetAmount));
        sb.append(',');
        sb.append("totalTaxAmount");
        sb.append('=');
        sb.append(((this.totalTaxAmount == null)?"<null>":this.totalTaxAmount));
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
