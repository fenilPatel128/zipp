/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icard;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Student student = new Student();
        student.setFirstName("dhruv");
        student.setLastName("patel");
        student.setStudentNumber(200492613);
        ImageIcon img= new ImageIcon(getClass().getResource("photo.png"));
        student.setImage(img);
        ArrayList<String> list=new ArrayList<>();
        list.add("Badminton");
        list.add("Chess");
        list.add("Hiking");
        student.setFavouriteActivities(list);
        
        Student studentModel=student;
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentModel, studentView);
        studentController.createView();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
