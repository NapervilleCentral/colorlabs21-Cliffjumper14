import java.awt.*;
import java.util.*;

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        Picture fairy = new Picture("images/fairy.jpg");
        Picture fairy2 = new Picture("images/fairy.jpg");
        fairy.explore();
        Pixel[] fairypixels = fairy.getPixels();
        Pixel[] fairypixels2 = fairy2.getPixels();
        int s = 255;
        int l = 0;
        //METHOD ONE CHANGE
        for (Pixel spot : fairypixels) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            // Convert to grayscale
            int grey = (red + blue + green) / 3;
            if (grey >= 0 && grey <= 63) {
                // Dark Blue
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(100);
            } 
            else if (grey <= 127) {
                // Red
                spot.setRed(140);
                spot.setGreen(0);
                spot.setBlue(0);
            } 
            else if (grey <= 191) {
                // Light Blue
                spot.setRed(173);
                spot.setGreen(190);
                spot.setBlue(210);
            } 
            else {
                // Cream White
                spot.setRed(220);
                spot.setGreen(199);
                spot.setBlue(161);
            }
        }
        fairy.explore();
        //fairy.write("images/sf3.jpg");
        /*
        //METHOD 2 CHANGE
        for (Pixel spot2 : fairypixels2) {
            int red = spot2.getRed();
            int blue = spot2.getBlue();
            int green = spot2.getGreen();
            int grey = (red + green + blue) / 3;
            // Convert to grayscale
            if (grey < s) {
                s = grey;
            }
            if (grey > l) {
                l = grey;
            }
        } 
        */
        //NUMBER 3
        
        /*
        red green blue
        90  219  181
        156 114  103
        0   0    0
        100 134  124
        97  79   74
        */
        for (Pixel spot : fairypixels2) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            // Convert to grayscale
            int grey = (red + blue + green) / 3;
            if (grey >= 0 && grey <= 51) {
                // Dark Blue
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(0);
            } 
            else if (grey <= 102) {
                // Red
                spot.setRed(156);
                spot.setGreen(114);
                spot.setBlue(103);
            } 
            else if (grey <=153) {
                // Light Blue

                spot.setRed(90);
                spot.setGreen(219);
                spot.setBlue(181);
            } 
            else if (grey<= 204) {
                // Cream White
                spot.setRed(100);
                spot.setGreen(134);
                spot.setBlue(124);
            }
            else {
                spot.setRed(97);
                spot.setGreen(79);
                spot.setBlue(74);
            }
            
        }
        fairy2.explore();
    }
}
