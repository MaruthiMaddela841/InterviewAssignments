package com.sumit;

//In Java, we can define a class inside an interface. This is useful when we want to provide a default
//implementation or a helper class that is closely related to the interface.

//Interface containing a nested class
interface Notification {
 
 void notifyUser(String message);
 
 // Static nested class inside the interface
 class DefaultNotification {
     void showDefaultMessage() {
         System.out.println("This is a default notification.");
     }
 }
}

//Class implementing the interface
class EmailNotification implements Notification {
 @Override
 public void notifyUser(String message) {
     System.out.println("Email Notification: " + message);
 }
}

public class MainSMS {
 public static void main(String[] args) {
     // Using interface implementation
     Notification email = new EmailNotification();
     email.notifyUser("Hello, you've got mail!");

     // Using nested class inside interface
     Notification.DefaultNotification defaultMsg = new Notification.DefaultNotification();
     defaultMsg.showDefaultMessage();
 }
}
