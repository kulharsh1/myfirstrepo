package test2;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null; 

@ManagedBean
@RequestScoped  
public class User{  
	
@NotNull(message = "Name can't be null") 
String name;  
@Null(message = "Name can't be null") 
String email;  
String password;  
String gender;  
String address;  
double amount;
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
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
public String getPassword() {  
return password;  
}  
public void setPassword(String password) {  
this.password = password;  
}  
public String getGender() {  
return gender;  
}  
public void setGender(String gender) {  
this.gender = gender;  
}  
public String getAddress() {  
return address;  
}  
public void setAddress(String address) {  
this.address = address;  
}      
} 
