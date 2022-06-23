
package com.centrahub.Product.dto;

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
    @SerializedName("iSupportHead__name")
    @Expose
    private String iSupportHeadName;
    @SerializedName("iSupportHead__id")
    @Expose
    private String iSupportHeadId;
    @SerializedName("iSaaSHardwareApprover__name")
    @Expose
    private String iSaaSHardwareApproverName;
    @SerializedName("iSaaSHardwareApprover__id")
    @Expose
    private String iSaaSHardwareApproverId;
    @SerializedName("iSaaSHardwareExecutioner__name")
    @Expose
    private String iSaaSHardwareExecutionerName;
    @SerializedName("iSaaSHardwareExecutioner__id")
    @Expose
    private String iSaaSHardwareExecutionerId;
    @SerializedName("iImplApprover__name")
    @Expose
    private String iImplApproverName;
    @SerializedName("iImplApprover__id")
    @Expose
    private String iImplApproverId;
    @SerializedName("iDeliveryApprover__name")
    @Expose
    private String iDeliveryApproverName;
    @SerializedName("iDeliveryApprover__id")
    @Expose
    private String iDeliveryApproverId;
    @SerializedName("DeliveryOwner__name")
    @Expose
    private String deliveryOwnerName;
    @SerializedName("DeliveryOwner__id")
    @Expose
    private String deliveryOwnerId;
    @SerializedName("BErrorTranserTo__name")
    @Expose
    private String bErrorTranserToName;
    @SerializedName("BErrorTranserTo__id")
    @Expose
    private String bErrorTranserToId;
    @SerializedName("BAPIAssignedTo__name")
    @Expose
    private String bAPIAssignedToName;
    @SerializedName("BAPIAssignedTo__id")
    @Expose
    private String bAPIAssignedToId;
    @SerializedName("BDevTaskTransferTo__name")
    @Expose
    private String bDevTaskTransferToName;
    @SerializedName("BDevTaskTransferTo__id")
    @Expose
    private String bDevTaskTransferToId;
    @SerializedName("BExciseTransferTo__name")
    @Expose
    private String bExciseTransferToName;
    @SerializedName("BExciseTransferTo__id")
    @Expose
    private String bExciseTransferToId;
    @SerializedName("Location__name")
    @Expose
    private String locationName;
    @SerializedName("Location__id")
    @Expose
    private String locationId;
    @SerializedName("Location__code")
    @Expose
    private String locationCode;
    @SerializedName("SRSOwner__name")
    @Expose
    private String sRSOwnerName;
    @SerializedName("SRSOwner__id")
    @Expose
    private String sRSOwnerId;
    @SerializedName("IMPLOwner__name")
    @Expose
    private String iMPLOwnerName;
    @SerializedName("IMPLOwner__id")
    @Expose
    private String iMPLOwnerId;
    private final static long serialVersionUID = 508172524232542417L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param iSaaSHardwareExecutionerName
     * @param iSaaSHardwareApproverId
     * @param iSaaSHardwareExecutionerId
     * @param iSupportHeadName
     * @param iSupportHeadId
     * @param sRSOwnerName
     * @param iMPLOwnerName
     * @param iDeliveryApproverId
     * @param locationId
     * @param bErrorTranserToId
     * @param bodyId
     * @param bExciseTransferToName
     * @param bDevTaskTransferToName
     * @param sRSOwnerId
     * @param bExciseTransferToId
     * @param locationName
     * @param bDevTaskTransferToId
     * @param deliveryOwnerId
     * @param iImplApproverName
     * @param iSaaSHardwareApproverName
     * @param bAPIAssignedToId
     * @param bAPIAssignedToName
     * @param iMPLOwnerId
     * @param iImplApproverId
     * @param bErrorTranserToName
     * @param locationCode
     * @param iDeliveryApproverName
     * @param deliveryOwnerName
     */
    public LineItem(String bodyId, String iSupportHeadName, String iSupportHeadId, String iSaaSHardwareApproverName, String iSaaSHardwareApproverId, String iSaaSHardwareExecutionerName, String iSaaSHardwareExecutionerId, String iImplApproverName, String iImplApproverId, String iDeliveryApproverName, String iDeliveryApproverId, String deliveryOwnerName, String deliveryOwnerId, String bErrorTranserToName, String bErrorTranserToId, String bAPIAssignedToName, String bAPIAssignedToId, String bDevTaskTransferToName, String bDevTaskTransferToId, String bExciseTransferToName, String bExciseTransferToId, String locationName, String locationId, String locationCode, String sRSOwnerName, String sRSOwnerId, String iMPLOwnerName, String iMPLOwnerId) {
        super();
        this.bodyId = bodyId;
        this.iSupportHeadName = iSupportHeadName;
        this.iSupportHeadId = iSupportHeadId;
        this.iSaaSHardwareApproverName = iSaaSHardwareApproverName;
        this.iSaaSHardwareApproverId = iSaaSHardwareApproverId;
        this.iSaaSHardwareExecutionerName = iSaaSHardwareExecutionerName;
        this.iSaaSHardwareExecutionerId = iSaaSHardwareExecutionerId;
        this.iImplApproverName = iImplApproverName;
        this.iImplApproverId = iImplApproverId;
        this.iDeliveryApproverName = iDeliveryApproverName;
        this.iDeliveryApproverId = iDeliveryApproverId;
        this.deliveryOwnerName = deliveryOwnerName;
        this.deliveryOwnerId = deliveryOwnerId;
        this.bErrorTranserToName = bErrorTranserToName;
        this.bErrorTranserToId = bErrorTranserToId;
        this.bAPIAssignedToName = bAPIAssignedToName;
        this.bAPIAssignedToId = bAPIAssignedToId;
        this.bDevTaskTransferToName = bDevTaskTransferToName;
        this.bDevTaskTransferToId = bDevTaskTransferToId;
        this.bExciseTransferToName = bExciseTransferToName;
        this.bExciseTransferToId = bExciseTransferToId;
        this.locationName = locationName;
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.sRSOwnerName = sRSOwnerName;
        this.sRSOwnerId = sRSOwnerId;
        this.iMPLOwnerName = iMPLOwnerName;
        this.iMPLOwnerId = iMPLOwnerId;
    }

    public String getBodyId() {
        return bodyId;
    }

    public void setBodyId(String bodyId) {
        this.bodyId = bodyId;
    }

    public String getiSupportHeadName() {
        return iSupportHeadName;
    }

    public void setiSupportHeadName(String iSupportHeadName) {
        this.iSupportHeadName = iSupportHeadName;
    }

    public String getiSupportHeadId() {
        return iSupportHeadId;
    }

    public void setiSupportHeadId(String iSupportHeadId) {
        this.iSupportHeadId = iSupportHeadId;
    }

    public String getiSaaSHardwareApproverName() {
        return iSaaSHardwareApproverName;
    }

    public void setiSaaSHardwareApproverName(String iSaaSHardwareApproverName) {
        this.iSaaSHardwareApproverName = iSaaSHardwareApproverName;
    }

    public String getiSaaSHardwareApproverId() {
        return iSaaSHardwareApproverId;
    }

    public void setiSaaSHardwareApproverId(String iSaaSHardwareApproverId) {
        this.iSaaSHardwareApproverId = iSaaSHardwareApproverId;
    }

    public String getiSaaSHardwareExecutionerName() {
        return iSaaSHardwareExecutionerName;
    }

    public void setiSaaSHardwareExecutionerName(String iSaaSHardwareExecutionerName) {
        this.iSaaSHardwareExecutionerName = iSaaSHardwareExecutionerName;
    }

    public String getiSaaSHardwareExecutionerId() {
        return iSaaSHardwareExecutionerId;
    }

    public void setiSaaSHardwareExecutionerId(String iSaaSHardwareExecutionerId) {
        this.iSaaSHardwareExecutionerId = iSaaSHardwareExecutionerId;
    }

    public String getiImplApproverName() {
        return iImplApproverName;
    }

    public void setiImplApproverName(String iImplApproverName) {
        this.iImplApproverName = iImplApproverName;
    }

    public String getiImplApproverId() {
        return iImplApproverId;
    }

    public void setiImplApproverId(String iImplApproverId) {
        this.iImplApproverId = iImplApproverId;
    }

    public String getiDeliveryApproverName() {
        return iDeliveryApproverName;
    }

    public void setiDeliveryApproverName(String iDeliveryApproverName) {
        this.iDeliveryApproverName = iDeliveryApproverName;
    }

    public String getiDeliveryApproverId() {
        return iDeliveryApproverId;
    }

    public void setiDeliveryApproverId(String iDeliveryApproverId) {
        this.iDeliveryApproverId = iDeliveryApproverId;
    }

    public String getDeliveryOwnerName() {
        return deliveryOwnerName;
    }

    public void setDeliveryOwnerName(String deliveryOwnerName) {
        this.deliveryOwnerName = deliveryOwnerName;
    }

    public String getDeliveryOwnerId() {
        return deliveryOwnerId;
    }

    public void setDeliveryOwnerId(String deliveryOwnerId) {
        this.deliveryOwnerId = deliveryOwnerId;
    }

    public String getBErrorTranserToName() {
        return bErrorTranserToName;
    }

    public void setBErrorTranserToName(String bErrorTranserToName) {
        this.bErrorTranserToName = bErrorTranserToName;
    }

    public String getBErrorTranserToId() {
        return bErrorTranserToId;
    }

    public void setBErrorTranserToId(String bErrorTranserToId) {
        this.bErrorTranserToId = bErrorTranserToId;
    }

    public String getBAPIAssignedToName() {
        return bAPIAssignedToName;
    }

    public void setBAPIAssignedToName(String bAPIAssignedToName) {
        this.bAPIAssignedToName = bAPIAssignedToName;
    }

    public String getBAPIAssignedToId() {
        return bAPIAssignedToId;
    }

    public void setBAPIAssignedToId(String bAPIAssignedToId) {
        this.bAPIAssignedToId = bAPIAssignedToId;
    }

    public String getBDevTaskTransferToName() {
        return bDevTaskTransferToName;
    }

    public void setBDevTaskTransferToName(String bDevTaskTransferToName) {
        this.bDevTaskTransferToName = bDevTaskTransferToName;
    }

    public String getBDevTaskTransferToId() {
        return bDevTaskTransferToId;
    }

    public void setBDevTaskTransferToId(String bDevTaskTransferToId) {
        this.bDevTaskTransferToId = bDevTaskTransferToId;
    }

    public String getBExciseTransferToName() {
        return bExciseTransferToName;
    }

    public void setBExciseTransferToName(String bExciseTransferToName) {
        this.bExciseTransferToName = bExciseTransferToName;
    }

    public String getBExciseTransferToId() {
        return bExciseTransferToId;
    }

    public void setBExciseTransferToId(String bExciseTransferToId) {
        this.bExciseTransferToId = bExciseTransferToId;
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

    public String getSRSOwnerName() {
        return sRSOwnerName;
    }

    public void setSRSOwnerName(String sRSOwnerName) {
        this.sRSOwnerName = sRSOwnerName;
    }

    public String getSRSOwnerId() {
        return sRSOwnerId;
    }

    public void setSRSOwnerId(String sRSOwnerId) {
        this.sRSOwnerId = sRSOwnerId;
    }

    public String getIMPLOwnerName() {
        return iMPLOwnerName;
    }

    public void setIMPLOwnerName(String iMPLOwnerName) {
        this.iMPLOwnerName = iMPLOwnerName;
    }

    public String getIMPLOwnerId() {
        return iMPLOwnerId;
    }

    public void setIMPLOwnerId(String iMPLOwnerId) {
        this.iMPLOwnerId = iMPLOwnerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bodyId");
        sb.append('=');
        sb.append(((this.bodyId == null)?"<null>":this.bodyId));
        sb.append(',');
        sb.append("iSupportHeadName");
        sb.append('=');
        sb.append(((this.iSupportHeadName == null)?"<null>":this.iSupportHeadName));
        sb.append(',');
        sb.append("iSupportHeadId");
        sb.append('=');
        sb.append(((this.iSupportHeadId == null)?"<null>":this.iSupportHeadId));
        sb.append(',');
        sb.append("iSaaSHardwareApproverName");
        sb.append('=');
        sb.append(((this.iSaaSHardwareApproverName == null)?"<null>":this.iSaaSHardwareApproverName));
        sb.append(',');
        sb.append("iSaaSHardwareApproverId");
        sb.append('=');
        sb.append(((this.iSaaSHardwareApproverId == null)?"<null>":this.iSaaSHardwareApproverId));
        sb.append(',');
        sb.append("iSaaSHardwareExecutionerName");
        sb.append('=');
        sb.append(((this.iSaaSHardwareExecutionerName == null)?"<null>":this.iSaaSHardwareExecutionerName));
        sb.append(',');
        sb.append("iSaaSHardwareExecutionerId");
        sb.append('=');
        sb.append(((this.iSaaSHardwareExecutionerId == null)?"<null>":this.iSaaSHardwareExecutionerId));
        sb.append(',');
        sb.append("iImplApproverName");
        sb.append('=');
        sb.append(((this.iImplApproverName == null)?"<null>":this.iImplApproverName));
        sb.append(',');
        sb.append("iImplApproverId");
        sb.append('=');
        sb.append(((this.iImplApproverId == null)?"<null>":this.iImplApproverId));
        sb.append(',');
        sb.append("iDeliveryApproverName");
        sb.append('=');
        sb.append(((this.iDeliveryApproverName == null)?"<null>":this.iDeliveryApproverName));
        sb.append(',');
        sb.append("iDeliveryApproverId");
        sb.append('=');
        sb.append(((this.iDeliveryApproverId == null)?"<null>":this.iDeliveryApproverId));
        sb.append(',');
        sb.append("deliveryOwnerName");
        sb.append('=');
        sb.append(((this.deliveryOwnerName == null)?"<null>":this.deliveryOwnerName));
        sb.append(',');
        sb.append("deliveryOwnerId");
        sb.append('=');
        sb.append(((this.deliveryOwnerId == null)?"<null>":this.deliveryOwnerId));
        sb.append(',');
        sb.append("bErrorTranserToName");
        sb.append('=');
        sb.append(((this.bErrorTranserToName == null)?"<null>":this.bErrorTranserToName));
        sb.append(',');
        sb.append("bErrorTranserToId");
        sb.append('=');
        sb.append(((this.bErrorTranserToId == null)?"<null>":this.bErrorTranserToId));
        sb.append(',');
        sb.append("bAPIAssignedToName");
        sb.append('=');
        sb.append(((this.bAPIAssignedToName == null)?"<null>":this.bAPIAssignedToName));
        sb.append(',');
        sb.append("bAPIAssignedToId");
        sb.append('=');
        sb.append(((this.bAPIAssignedToId == null)?"<null>":this.bAPIAssignedToId));
        sb.append(',');
        sb.append("bDevTaskTransferToName");
        sb.append('=');
        sb.append(((this.bDevTaskTransferToName == null)?"<null>":this.bDevTaskTransferToName));
        sb.append(',');
        sb.append("bDevTaskTransferToId");
        sb.append('=');
        sb.append(((this.bDevTaskTransferToId == null)?"<null>":this.bDevTaskTransferToId));
        sb.append(',');
        sb.append("bExciseTransferToName");
        sb.append('=');
        sb.append(((this.bExciseTransferToName == null)?"<null>":this.bExciseTransferToName));
        sb.append(',');
        sb.append("bExciseTransferToId");
        sb.append('=');
        sb.append(((this.bExciseTransferToId == null)?"<null>":this.bExciseTransferToId));
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
        sb.append("sRSOwnerName");
        sb.append('=');
        sb.append(((this.sRSOwnerName == null)?"<null>":this.sRSOwnerName));
        sb.append(',');
        sb.append("sRSOwnerId");
        sb.append('=');
        sb.append(((this.sRSOwnerId == null)?"<null>":this.sRSOwnerId));
        sb.append(',');
        sb.append("iMPLOwnerName");
        sb.append('=');
        sb.append(((this.iMPLOwnerName == null)?"<null>":this.iMPLOwnerName));
        sb.append(',');
        sb.append("iMPLOwnerId");
        sb.append('=');
        sb.append(((this.iMPLOwnerId == null)?"<null>":this.iMPLOwnerId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
