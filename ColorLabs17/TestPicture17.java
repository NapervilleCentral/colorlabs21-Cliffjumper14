
/**
 * Kevin Hayes
 * Test Picture Classes
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

        /**
         * main method, to test the picture
         *
         */
      public static void main(String[] args)
      {
        //opens picture using a dialog box
        /*
        String fileName = FileChooser.pickAFile();
        Picture pictObj = new Picture(fileName);
        pictObj.explore();
    
        //opens a pictue using a path
        //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
        /KNOW IT LOVE IT LIVE IT 
        //relative path*/
                                    //dir  /folder/file
        Picture apic = new Picture("images\\beach.jpg");
        Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
        Picture moto = new Picture("images/redMotorcycle.jpg");
        Picture mmoto = new Picture("images/redMotorcycle.jpg");
        Picture nmoto = new Picture("images/redMotorcycle.jpg");
        Picture omoto = new Picture("images/redMotorcycle.jpg");
        Picture pmoto = new Picture("images/redMotorcycle.jpg");
        Picture qmoto = new Picture("images/redMotorcycle.jpg");
        Picture rmoto = new Picture("images/redMotorcycle.jpg");
        Picture smoto = new Picture("images/redMotorcycle.jpg");
        Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
    
        //apic.explore(); //displays the pic
        //ferris1.explore();
        //moto.explore();
        //apic.explore();
        //GONNA HAVE TO DO THIS:::::::::::::***
        //makes an array of pixels
        //Pixel[] pixels;
        //gets pixels from picture and assigns to pixels array
        //pixels = ferris1.getPixels();
         
        
         
        //******
         //how many pixels or how large array
        //System.out.println("This is a large array"+pixels.length  );
    
    
        /**/
            //access each index
        //System.out.println(pixels[17]);
        //access each pixel
        //Pixel spot = ferris1.getPixel(300,300);
        //Pixel spot2 = ferris1.getPixel(433,283);
        //Pixel ferr17 = pixels[17];
        
        //ferr17.setRed(240);
        //ferr17.setGreen(160);
        //ferr17.setBlue(200);
        
        //Color newColor = new Color(255,99,71);
        //spot2.setColor(Color.blue);
        //spot.setColor(newColor);
        
        //ferris1.explore();
        //System.out.println(pixels[17].getColor());
        //System.out.println(spot);
        //randomly colored pixels 10000 times
        //for (int i = 0; i<200000; i++)
        //{
            //Pixel yuck = ferris1.getPixel((int)(Math.random()*1000), (int)(Math.random() * 668));
            //yuck.setColor(Color.green);
        //}
        //ferris1.explore();
        /*
        pixels[17].setColor(Color.blue);
        spot.setColor(new Color(252,252,252));
        pixels[500034].setColor(Color.blue);
        ferris1.explore();
        /**/
        //●1 of adjustRed(double factor), adjustGreen(double factor),adjustBlue(double factor)
        //●negate()
        //●grayscale()
        //●lighten() or darken()
        //●changeColor()
        //●colorify() or blueify()
        int red;
        int blue;
        int green;
        int ored;
        int oblue;
        int ogreen;
        Pixel[] mpixels;
        mpixels = moto.getPixels();
        //FIRST ONE*)*&*^#*@^$*&@#^*$^@*&$@^$*&@^*(%^*@$&^*(@^*$#^#@^
        //Double all
        for (Pixel spotm : mpixels){
            //System.out.println( spot1 );
            red = spotm.getRed();
            blue = spotm.getBlue();
            green = spotm.getGreen();
            
            
            red = (int)(red * 2);
            blue = (int)(blue * 2);
            green = (int)(green * 2);
            
            spotm.setRed(red);
            spotm.setGreen(green);
            spotm.setBlue(blue);
            
        }
        //moto.explore();
        Pixel[] npixels;
        npixels = nmoto.getPixels();
        //SECOND ONE 239587496868632486598734640397(*&^%&$%#@
        //Negate all so inverse 
        for (Pixel spotn  : npixels){
            //System.out.println( spot1 );
            red = spotn.getRed();
            blue = spotn.getBlue();
            green = spotn.getGreen();
            
            
            red = (int)(255-red );
            blue = (int)(255-blue );
            green = (int)(255-green );
             
            spotn.setRed(red);
            spotn.setGreen(green);
            spotn.setBlue(blue);
        }
        //nmoto.explore();
        Pixel[] opixels;
        opixels = omoto.getPixels();
        //THIRD ONE ^&%$^$#$%#@^%&%@&%@&^*^@&#@^R$&*^&$*@#^&*#$^*&#@$^*&#@$^&*#@
        //Grayscale them
        for (Pixel spoto : opixels){
            //System.out.println( spot1 );
            red = spoto.getRed();
            blue = spoto.getBlue();
            green = spoto.getGreen();
            
            double num = (red + blue + green)/3;
            red = (int)(num);
            blue = (int)(num);
            green = (int)(num);
             
            spoto.setRed(red);
            spoto.setGreen(green);
            spoto.setBlue(blue);
            
        }
        //omoto.explore();
        Pixel[] ppixels;
        ppixels = pmoto.getPixels();
        //I just did this for fun to see if I could make it black and white with inverse of grayscale
        for (Pixel spotp : ppixels){
            //System.out.println( spot1 );
            red = spotp.getRed();
            blue = spotp.getBlue();
            green = spotp.getGreen();
            
            double num = (red + blue + green)/3;
            red = (int)(255-num);
            blue = (int)(255-num);
            green = (int)(255-num);
             
            spotp.setRed(red);
            spotp.setGreen(green);
            spotp.setBlue(blue);
            
        }
        //pmoto.explore();
        Pixel[] qpixels;
        qpixels = qmoto.getPixels();
        //FOURTH ONE
        //Lighten or darken(I chose darken)
        for (Pixel spotq : qpixels){
            //System.out.println( spot1 );
            red = spotq.getRed();
            blue = spotq.getBlue();
            green = spotq.getGreen();
            
            red = (int)(red *.5);
            blue = (int)(blue *.5);
            green = (int)(green * .5 );
             
            spotq.setRed(red);
            spotq.setGreen(green);
            spotq.setBlue(blue);
            
        }
        //qmoto.explore();
        Pixel[] rpixels;
        rpixels = rmoto.getPixels();
        //FIFTH ONE
        //Change color to green
        for (Pixel spotr : rpixels){
            //System.out.println( spot1 );
            red = spotr.getRed();
            blue = spotr.getBlue();
            green = spotr.getGreen();
            
            red = (int)(red-red);
            blue = (int)(blue-blue);
            green = (int)(green);
             
            spotr.setRed(red);
            spotr.setGreen(green);
            spotr.setBlue(blue);
            
        }
        Pixel[] spixels;
        spixels = rmoto.getPixels();
        //FIFTH ONE
        //Change color to green
        for (Pixel spots : spixels){
            //System.out.println( spot1 );
            red = spots.getRed();
            blue = spots.getBlue();
            green = spots.getGreen();
            
            red = (int)(red);
            blue = (int)(blue);
            green = (int)(green);
             
            spots.setRed(blue);
            spots.setGreen(green);
            spots.setBlue(blue);
        }
        //moto.explore();
        //nmoto.explore();
        //omoto.explore();
        //pmoto.explore();
        //qmoto.explore();
        //rmoto.explore();
        smoto.explore();
        /**/

        /**
        * Method to clear red from picture
        * @param none
        * @return none
        */
        /*
        for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
        ferris1.explore();
    
        1/**/
        /**
        * Method to reduce red from picture by a factor of n
        * @param none  
        * @return none
        */

        /*
        int value;
        final double  FACTOR = .5;
        for (Pixel pixelObj : pixels)
        {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

        }
        // use new picture when changing or it will make changes to 
        // pic you already changed
        ferris1.explore();
        ferris2.explore();

        /**/ 
        //write/save a picture as a file
        ferris1.write("images/ferris11.jpg");

        /**/
    }//main
}//class
