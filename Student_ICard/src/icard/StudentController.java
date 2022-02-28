/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icard;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class StudentController {
   private Student studentModel;
   private StudentView studentView;
   
   public StudentController(Student studentModel, StudentView studentView){
      this.studentModel = studentModel;
      this.studentView = studentView;
   }
   //getter method for first name
   public String getFirstName() {
      return studentModel.firstName;
   }
   //setter method for first name
   public void setFirstName(String fname) {
       studentModel.firstName = fname;
   }
   //getter method for last name
   public String getLastName() {
      return studentModel.lastName;
   }
   //setter method for last name
   public void setLastName(String lname) {
       studentModel.lastName = lname;
   }
   //getter method for student number
   public int getStudentNumber() {
      return studentModel.studentNumber;
   }
   //setter method for student number
   public void setStudentNumber(int num) {
       studentModel.studentNumber = num;
    }
   //getter method for favourite activities
   public ArrayList<String> getFavouriteActivities() {
      return studentModel.favActivities;
   }
    //setter method for favourite activities
   public void setFavouriteActivities(ArrayList<String> fav) {
      studentModel.favActivities = fav;
   }
   //getter method for image
   public ImageIcon getImage() {
      return studentModel.image;
   }
   //setter method for image
   public void setImage(ImageIcon img) {
      studentModel.image = img;
   }
   public void createView(){
      studentView.displayICard(studentModel.getFirstName(), studentModel.getLastName(), studentModel.getStudentNumber(),studentModel.getImage(),studentModel.getFavouriteActivities());
   }
}
