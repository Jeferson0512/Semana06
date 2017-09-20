package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationCtrl", eager = true)
@RequestScoped
public class NavigationCtrl2 {
	
	// this managed property will read value from request parameter pageId
		@ManagedProperty(value = "#{param.pageId}")
		private String pageId;

		public String goToPage1() {
			return "page1";
		}

		public void setPageId(String pageId) {
			this.pageId = pageId;
		}

		public String showPage() {

			if (pageId == null) {
				return "page2";
			}

			if (pageId.equals("1")) {
				return "page1";
			} else if (pageId.equals("2")) {
				return "page2";
			} else {
				return "page2";
			}
		}

}
