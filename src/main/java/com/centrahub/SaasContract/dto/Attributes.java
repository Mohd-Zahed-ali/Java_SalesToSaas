
package com.centrahub.SaasContract.dto;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Attributes implements Serializable
{

    @SerializedName("SaaSContract")
    @Expose
    private String saaSContract;
    private final static long serialVersionUID = 8315214221078952636L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param saaSContract
     */
    public Attributes(String saaSContract) {
        super();
        this.saaSContract = saaSContract;
    }

    public String getSaaSContract() {
        return saaSContract;
    }

    public void setSaaSContract(String saaSContract) {
        this.saaSContract = saaSContract;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saaSContract");
        sb.append('=');
        sb.append(((this.saaSContract == null)?"<null>":this.saaSContract));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
