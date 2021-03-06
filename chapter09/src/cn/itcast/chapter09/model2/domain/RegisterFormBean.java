package cn.itcast.chapter09.model2.domain;

import java.util.HashMap;
import java.util.Map;


public class RegisterFormBean {
	private String name;
	private String password;
	private String password2;
	private String email;
	private Map<String,String> errors = new HashMap<String,String>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean validate(){
		boolean flag = true;
		if (name == null|| name.trim().equals("")){
			errors.put("name", "Please input your name");
		}
				
		return flag;
		
	}
	
	public void setErrorMsg(String err,String errMsg){
		if ((err != null)&&(errMsg != null)){
			errors.put(err,errMsg);
		}
	}
	
	public Map<String,String> getErrors(){
		return errors;
	}


		
	
}