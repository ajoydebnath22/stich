package com.theboy.log.pojo;

import java.util.Date;

public class LogData {

	private String interfaceName;
	private Date stTm;
	
	public LogData(String interfaceName){
		this.interfaceName = interfaceName;
		this.stTm = new Date();
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public Date getStTm() {
		return stTm;
	}

	public void setStTm(Date stTm) {
		this.stTm = stTm;
	}
		
}
