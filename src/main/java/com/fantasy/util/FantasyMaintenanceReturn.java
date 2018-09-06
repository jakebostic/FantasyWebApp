package com.fantasy.util;


public class FantasyMaintenanceReturn {
	private String result;
	private String message;
	public static final String SUCCESS="success";
	public static final String FAILURE="failure";
	
	public FantasyMaintenanceReturn() {
		result = "Initialized result, not yet set.";
		message = "Initialized message, not yet set.";
	}
	public FantasyMaintenanceReturn(String result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static FantasyMaintenanceReturn getMaintReturn(Object obj) {
		FantasyMaintenanceReturn r = new FantasyMaintenanceReturn();
		if (obj!=null) {
			r.setResult(SUCCESS);
			r.setMessage(obj.getClass().getSimpleName()+" maintenance success");
		}
		else {
			r.setResult(FAILURE);
			// Can't use obj.getClass() because obj is null
			r.setMessage("Not found");
		}
		return r;

	}

	public static FantasyMaintenanceReturn getMaintReturnError(Object obj, String msg) {
		FantasyMaintenanceReturn r = new FantasyMaintenanceReturn();
		String errMsg = "";
		r.setResult(FAILURE);
		if (obj!=null) {
			errMsg = (obj.getClass().getSimpleName()+" maintenance error: ");
		}
		else {
			errMsg = "Maintenance error: ";			
		}
		errMsg+=msg;
		r.setMessage(errMsg);
		return r;

	}

}

