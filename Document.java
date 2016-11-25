package com.hcm.chase;

public class Document {
	
	  private String type;
	  private String region;
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Document [type=" + type + ", region=" + region + "]";
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	  
	  

}
