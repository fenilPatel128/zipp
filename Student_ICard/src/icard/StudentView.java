/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icard;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class StudentView {
    
    public void displayICard(String fname, String lname, int number, ImageIcon img, ArrayList<String> list){
        ICardFrame frame=new ICardFrame(fname, lname, number, img, list);
        frame.setVisible(true);
       //System.out.println(fname);
    }
}
