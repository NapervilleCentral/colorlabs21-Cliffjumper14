import java.awt.*;
import java.util.*;

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        Picture fairy = new Picture("images/fairy.jpg");
        Picture fairy2 = new Picture("images/fairy.jpg");
        Picture fairy3 = new Picture("images/fairy.jpg");
        //fairy.explore();
        Pixel[] fairypixels = fairy.getPixels();
        Pixel[] fairypixels2 = fairy2.getPixels();
        Pixel[] fairypixels3 = fairy3.getPixels();
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
        //fairy.explore();
        //METHOD 2 CHANGE
        int prev = 0, big = 0, small = 0;
        for (Pixel spot2 : fairypixels2) {
            int red = spot2.getRed();
            int blue = spot2.getBlue();
            int green = spot2.getGreen();
            int avg = (red + green + blue) / 3;
            // Convert to grayscale
            if (avg > prev && avg > big) {
                big = avg;
            }
            if (avg<small) {
                small = avg;
            }
        } 
        int range = 0;
        for (Pixel spot2 : fairypixels2) {
            range = (big-small) / 4;
            int red = spot2.getRed();
            if (red <= range)
                spot2.setColor(new Color ( 0,0,100));
            else if (red > range && red <= range*2)
                spot2.setColor(new Color(140, 0, 0));
            else if (red > range*2 && red <= range*3){
                spot2.setColor(new Color(32,181,245));
            }
            else
                spot2.setColor(new Color(220, 199, 161));
        }
        //fairy2.explore();
        //NUMBER 3
        for (Pixel spot : fairypixels3) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            // Convert to grayscale
            int grey = (red + blue + green) / 3;            
            if (grey <= 25) {
                // black
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(0);
            
            } else if (grey <= 51) {
                // charcoal
                spot.setRed(40);
                spot.setGreen(40);
                spot.setBlue(40);
            
            } else if (grey <= 76) {
                // rose brown
                spot.setRed(156);
                spot.setGreen(114);
                spot.setBlue(103);
            
            } else if (grey <= 102) {
                // warm sand
                spot.setRed(194);
                spot.setGreen(178);
                spot.setBlue(128);
            
            } else if (grey <= 128) {
                // light teal 
                spot.setRed(90);
                spot.setGreen(219);
                spot.setBlue(181);
            
            } else if (grey <= 153) {
                // pastel aqua
                spot.setRed(150);
                spot.setGreen(230);
                spot.setBlue(220);
            
            } else if (grey <= 178) {
                // dusty teal/gray green 
                spot.setRed(100);
                spot.setGreen(134);
                spot.setBlue(124);
            
            } else if (grey <= 204) {
                // slate blue
                spot.setRed(112);
                spot.setGreen(136);
                spot.setBlue(160);
            
            } else if (grey <= 230) {
                // warm taupe
                spot.setRed(140);
                spot.setGreen(125);
                spot.setBlue(115);
            
            } else {
                // dark brown 
                spot.setRed(97);
                spot.setGreen(79);
                spot.setBlue(74);
            }
        }
        fairy.explore();
        fairy2.explore();
        fairy3.explore();
        //fairy3.write("images/sf5.jpg");
    }
}
