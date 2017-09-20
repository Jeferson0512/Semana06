package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "envio_datos", eager = true)
public class HelloWorld {

	private String message = "Hello World...!";

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
