package com.tdn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGINTBL")
public class Userlogin {

	@Id
	private int id;
		@Column(unique=true)
	private String userName;
	@Column(name="Password")
	private String password;
	@Column(name="Name")
	private String name;
	@Column(name="Email_Id")
	private String emailid;
	
		public Userlogin() {
		
			}
		public Userlogin( int id,String userName, String password, String name, String emailid) {
			super();
			this.id=id;
			this.userName = userName;
			this.password = password;
			this.name = name;
			this.emailid = emailid;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		
	
	
}
