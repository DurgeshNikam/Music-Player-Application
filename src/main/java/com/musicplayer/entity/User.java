package com.musicplayer.entity;

import javax.persistence.*;

@Entity
public class User {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String phone;
	    private int age;
	    private String gender;
	    private String username;
	    private String password;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
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
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
					+ ", gender=" + gender + ", username=" + username + ", password=" + password + "]";
		}
		public User(Long id, String name, String email, String phone, int age, String gender, String username,
				String password) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.age = age;
			this.gender = gender;
			this.username = username;
			this.password = password;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
