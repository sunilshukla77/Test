package com.java.common;


class User{
 String name;
 String email;
 String phone;
 
 // Reference Variable to the Order Object is attribute in the User :)
 //Order order;   // Has-A Relationship | 1 to 1
 Order[] orders;     // Has-A Relationship | 1 to many
 User(){
  
 }
 
 /*User(String name, String email, String phone, Order order) {
  this.name = name;
  this.email = email;
  this.phone = phone;
  this.order = order;
 }*/
 
 User(String name, String email, String phone, Order[] orders) {
  this.name = name;
  this.email = email;
  this.phone = phone;
  this.orders = orders;
 }

 @Override
 public String toString() {
  for(Order oRef : orders) {
   System.out.println(oRef);
  }
  return "User [name=" + name + ", email=" + email + ", phone=" + phone+"]";
  
 }
 
}

// Order
class Order{
 
 int orderId;
 String date;
 String time;
 double orderValue;
 String remarks;
 
 Order() {
  
 }

 Order(int orderId, String date, String time, double orderValue, String remarks) {
  this.orderId = orderId;
  this.date = date;
  this.time = time;
  this.orderValue = orderValue;
  this.remarks = remarks;
 }

 @Override
 public String toString() { // toString is a method which we are overriding to display some String rather than HashCode when we print reference variable
  return "Order [orderId=" + orderId + ", date=" + date + ", time=" + time + ", orderValue=" + orderValue
    + ", remarks=" + remarks + "]";
 }
 
}



public class HasArelation {

 public static void main(String[] args) {
  
  Order oRef1 = new Order(101, "5th December, 2020", "10:00", 500, "Please send it soon");
  //System.out.println(oRef); // printing reference variable will now not show HashCode, rather will show data in object due to toString
  Order oRef2 = new Order(311, "9th December, 2020", "12:00", 200, "Please send it soon");
  Order oRef3 = new Order(765, "12th December, 2020", "16:00", 1500, "Please send it soon");
  
  Order[] orders = {oRef1, oRef2, oRef3};
  
  User uRef = new User("John", "john@example.com", "+91 99999 11111", orders);
  System.out.println(uRef);
  
 }

}
