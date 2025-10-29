package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable {
   
    private String name;
    private String email;
    private long phone;
    private String pWord;
    private String cPassWord;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getcPassWord() {
		return cPassWord;
	}
	public void setcPassWord(String cPassWord) {
		this.cPassWord = cPassWord;
	}
	
	
	

 
}