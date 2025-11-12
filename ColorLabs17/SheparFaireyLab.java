
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
//https://naperville.instructure.com/courses/1187860/files/68948179?module_item_id=13246961
public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         //String fileName = FileChooser.pickAFile();
         //Picture pictObj = new Picture(fileName);
         //pictObj.explore();
         
         //relative path
         Picture fairy = new Picture("images\\fairy.jpg");
         //change with selfie picture
         Picture me = new Picture("images/beach.jpg");
         Picture me1 = new Picture("images/beach.jpg");
         Picture me2 = new Picture("images/beach.jpg");
         fairy.explore();
        int red;
        int blue;
        int green;
        Pixel[] fairypixels;
        fairypixels= fairy.getPixels();
        //FIRST ONE*)*&*^#*@^$*&@#^*$^@*&$@^$*&@^*(%^*@$&^*(@^*$#^#@^
        //Double all
        for (Pixel spot : fairypixels){
            //System.out.println( spot1 );
            red = spot.getRed();
            blue = spot.getBlue();
            green = spot.getGreen();
            int grey = (red + blue + green)/3;
            
            red = (int)(grey);
            blue = (int)(grey);
            green = (int)(grey);
            
            spot.setRed(red);
            spot.setGreen(green);
            spot.setBlue(blue);
            
        }
        fairy.explore();
         /**
          * method 1 change
          * 
          */
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
