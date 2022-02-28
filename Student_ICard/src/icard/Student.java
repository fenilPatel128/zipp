/*
 * Model Class
 */
package icard;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Student {
   String firstName;
   String lastName;
   int studentNumber;
   ArrayList<String> favActivities;
   ImageIcon image;
   //Default Constructor
   Student(){
       favActivities=new ArrayList<>();
       
   }
   //Parametrised constructor         
   Student(String firstName, String lastName, int studentNumber,ArrayList<String> list, ImageIcon image ){
       this.setFirstName(firstName);
       this.setLastName(lastName);
       this.setFavouriteActivities(list);
       this.setStudentNumber(studentNumber);
       this.setImage(image);
   }
   //getter method for first name
   public String getFirstName() {
      return this.firstName;
   }
   //setter method for first name
   public void setFirstName(String fname) {
       String firstLettr = fname.substring(0, 1);
       String remLettrs = fname.substring(1, fname.length());
       firstLettr = firstLettr.toUpperCase();
       fname = firstLettr + remLettrs;
       this.firstName = fname;
   }
   //getter method for last name
   public String getLastName() {
      return this.lastName;
   }
   //setter method for last name
   public void setLastName(String lname) {
      String firstLettr = lname.substring(0, 1);
       String remLettrs = lname.substring(1, lname.length());
       firstLettr = firstLettr.toUpperCase();
       lname = firstLettr + remLettrs;
       this.lastName = lname;
   }
   //getter method for student number
   public int getStudentNumber() {
      return this.studentNumber;
   }
   //setter method for student number
   public void setStudentNumber(int num) {
       if(num>=100000000 && num<=999999999){    
             this.studentNumber = num;
       }
       else{
           throw new IllegalArgumentException();
       }
   }
   //getter method for favourite activities
   public ArrayList<String> getFavouriteActivities() {
      return this.favActivities;
   }
    //setter method for favourite activities
   public void setFavouriteActivities(ArrayList<String> fav) {
      this.favActivities = fav;
   }
   //getter method for image
   public ImageIcon getImage() {
      return this.image;
   }
   //setter method for image
   public void setImage(ImageIcon img) {
      this.image = img;
   }
}
