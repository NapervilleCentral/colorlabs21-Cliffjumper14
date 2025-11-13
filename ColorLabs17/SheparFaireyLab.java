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
                spot.setBlue(139);
            } 
            else if (grey <= 127) {
                // Red
                spot.setRed(255);
                spot.setGreen(0);
                spot.setBlue(0);
            } 
            else if (grey <= 191) {
                // Light Blue
                spot.setRed(173);
                spot.setGreen(216);
                spot.setBlue(230);
            } 
            else {
                // Cream White
                spot.setRed(220);
                spot.setGreen(199);
                spot.setBlue(161);
            }
        }
        fairy.explore();
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
    }
}
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */
