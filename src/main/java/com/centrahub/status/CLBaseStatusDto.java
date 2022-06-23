package com.centrahub.status;

import lombok.Data;

import java.io.Serializable;

@Data
public class CLBaseStatusDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer status;
    public String msg;
    public String error_msg;
    
    public CLBaseStatusDto() {
	}
    
    public CLBaseStatusDto(Integer status, String msg, String error_msg) {
		super();
		this.status = status;
		this.msg = msg;
		this.error_msg = error_msg;
	}
    
    
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CLBaseStatusDto [status=" + status + ", msg=" + msg + ", error_msg=" + error_msg + "]";
	}
	
}
