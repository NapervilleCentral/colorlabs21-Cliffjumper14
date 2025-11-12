import java.awt.*;
import java.util.*;

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        Picture fairy = new Picture("images/fairy.jpg");
        fairy.explore();
        Pixel[] fairypixels = fairy.getPixels();
        int smallest = 255;
        int largest = 0;
        
        for (Pixel spot : fairypixels) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();

            // Convert to grayscale
            int grey = (red + blue + green) / 3;

            // Map grayscale value to colors:
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
        // Display the final image
        fairy.explore();
    }
}

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
