package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationCtrl", eager = true)
@RequestScoped
public class NavigationCtrl {

	public String goToPage1() {
		return "page1";
	}


}
