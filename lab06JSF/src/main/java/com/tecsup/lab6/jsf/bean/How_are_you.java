package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class How_are_you {
	
	private String mensaje = "Hola que tal ?";

	public String getMensaje() {
		return mensaje + "\n Yo aqui todo bien y tu ?";
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
