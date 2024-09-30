package com.employeeorg.employeeinfo.response;

import com.fasterxml.jackson.databind.JsonNode;


public class ApiHttpResponse {

	int errCode ;
	String errDesc = "";
	boolean status ;
	JsonNode dataObject;

	public ApiHttpResponse(boolean status , int errCode, JsonNode  dataObject ) {
		setErrCode(errCode);
		setStatus(status);
		setDataObject(dataObject);
	}
	
	public ApiHttpResponse(boolean status , int errCode, String  errDesc, JsonNode  dataObject) {
		this.errCode =  errCode;
		this.errDesc = errDesc;
		this.status = status;
		this.dataObject = dataObject;
		
	}
	
	public int getErrCode() {
		return errCode;
	}


	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public JsonNode getDataObject() {
		return dataObject;
	}


	public void setDataObject(JsonNode dataObject) {
		this.dataObject = dataObject;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	
}
