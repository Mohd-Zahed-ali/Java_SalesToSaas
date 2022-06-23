package com.centrahub.CLAuthDto;
import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CLAuthDto {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("userInfo")
    @Expose
    private Object userInfo;
    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("refreshToken")
    @Expose
    private String refreshToken;
    @SerializedName("accessToken")
    @Expose
    private String accessToken;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("companyInfo")
    @Expose
    private Object companyInfo;
    @SerializedName("expiresIn")
    @Expose
    private Integer expiresIn;
    @SerializedName("msgCnt")
    @Expose
    private Integer msgCnt;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("errors")
    @Expose
    private Object errors;
    private final static long serialVersionUID = 2286639203206733829L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CLAuthDto() {
    }

    /**
     * 
     * @param expiresIn
     * @param userInfo
     * @param companyInfo
     * @param companyName
     * @param id
     * @param accessToken
     * @param msgCnt
     * @param message
     * @param userId
     * @param errors
     * @param refreshToken
     * @param status
     */
    public CLAuthDto(String id, Object userInfo, Integer userId, String refreshToken, String accessToken, String companyName, Object companyInfo, Integer expiresIn, Integer msgCnt, String message, Integer status, Object errors) {
        super();
        this.id = id;
        this.userInfo = userInfo;
        this.userId = userId;
        this.refreshToken = refreshToken;
        this.accessToken = accessToken;
        this.companyName = companyName;
        this.companyInfo = companyInfo;
        this.expiresIn = expiresIn;
        this.msgCnt = msgCnt;
        this.message = message;
        this.status = status;
        this.errors = errors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CLAuthDto withId(String id) {
        this.id = id;
        return this;
    }

    public Object getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(Object userInfo) {
        this.userInfo = userInfo;
    }

    public CLAuthDto withUserInfo(Object userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public CLAuthDto withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public CLAuthDto withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public CLAuthDto withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public CLAuthDto withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Object getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(Object companyInfo) {
        this.companyInfo = companyInfo;
    }

    public CLAuthDto withCompanyInfo(Object companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public CLAuthDto withExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public Integer getMsgCnt() {
        return msgCnt;
    }

    public void setMsgCnt(Integer msgCnt) {
        this.msgCnt = msgCnt;
    }

    public CLAuthDto withMsgCnt(Integer msgCnt) {
        this.msgCnt = msgCnt;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CLAuthDto withMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CLAuthDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public CLAuthDto withErrors(Object errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLAuthDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("userInfo");
        sb.append('=');
        sb.append(((this.userInfo == null)?"<null>":this.userInfo));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("refreshToken");
        sb.append('=');
        sb.append(((this.refreshToken == null)?"<null>":this.refreshToken));
        sb.append(',');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("companyInfo");
        sb.append('=');
        sb.append(((this.companyInfo == null)?"<null>":this.companyInfo));
        sb.append(',');
        sb.append("expiresIn");
        sb.append('=');
        sb.append(((this.expiresIn == null)?"<null>":this.expiresIn));
        sb.append(',');
        sb.append("msgCnt");
        sb.append('=');
        sb.append(((this.msgCnt == null)?"<null>":this.msgCnt));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("errors");
        sb.append('=');
        sb.append(((this.errors == null)?"<null>":this.errors));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.userInfo == null)? 0 :this.userInfo.hashCode()));
        result = ((result* 31)+((this.companyInfo == null)? 0 :this.companyInfo.hashCode()));
        result = ((result* 31)+((this.companyName == null)? 0 :this.companyName.hashCode()));
        result = ((result* 31)+((this.accessToken == null)? 0 :this.accessToken.hashCode()));
        result = ((result* 31)+((this.msgCnt == null)? 0 :this.msgCnt.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.expiresIn == null)? 0 :this.expiresIn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.errors == null)? 0 :this.errors.hashCode()));
        result = ((result* 31)+((this.refreshToken == null)? 0 :this.refreshToken.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CLAuthDto) == false) {
            return false;
        }
        CLAuthDto rhs = ((CLAuthDto) other);
        return (((((((((((((this.userInfo == rhs.userInfo)||((this.userInfo!= null)&&this.userInfo.equals(rhs.userInfo)))&&((this.companyInfo == rhs.companyInfo)||((this.companyInfo!= null)&&this.companyInfo.equals(rhs.companyInfo))))&&((this.companyName == rhs.companyName)||((this.companyName!= null)&&this.companyName.equals(rhs.companyName))))&&((this.accessToken == rhs.accessToken)||((this.accessToken!= null)&&this.accessToken.equals(rhs.accessToken))))&&((this.msgCnt == rhs.msgCnt)||((this.msgCnt!= null)&&this.msgCnt.equals(rhs.msgCnt))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.expiresIn == rhs.expiresIn)||((this.expiresIn!= null)&&this.expiresIn.equals(rhs.expiresIn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.errors == rhs.errors)||((this.errors!= null)&&this.errors.equals(rhs.errors))))&&((this.refreshToken == rhs.refreshToken)||((this.refreshToken!= null)&&this.refreshToken.equals(rhs.refreshToken))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
