
package com.centrahub.Product.dto;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ProductImage implements Serializable
{

    private final static long serialVersionUID = 4803707343798614129L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProductImage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
