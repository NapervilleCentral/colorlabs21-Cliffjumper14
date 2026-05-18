
/**
 * Write a description of class poster here.
 * Titus Park
 * Finals week
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class poster
{
    //main method
    public static void main(String[] args) throws Exception
    {    
        Picture canvas = new Picture("images/newCanvas.jpg");
        
        // TOP LEFT
        Picture posterphoto = new Picture("images/backflips.jpg");
        copytoCanvas(posterphoto, canvas, 0, 0);
        
        // TOP MIDDLE
        Picture posterphoto2 = new Picture("images/backflips.jpg");
        mirrorVertical(posterphoto2);
        copytoCanvas(posterphoto2, canvas, 500, 0);
        
        // TOP RIGHT
        Picture posterphoto3 = new Picture("images/backflips.jpg");
        mirrorHorizontal(posterphoto3);
        copytoCanvas(posterphoto3, canvas, 1000, 0);
        
        //Bottom left
        Picture posterphoto4 = new Picture("images/backflips.jpg");
        recolor(posterphoto4);
        copytoCanvas(posterphoto4, canvas, 0, 500);
        
        //Bottom middle
        Picture posterphoto5 = new Picture("images/backflips.jpg");
        rotate(posterphoto5);
        recolor2(posterphoto5);
        copytoCanvas(posterphoto5, canvas, 500, 500);
        
        //bottom right
        Picture posterphoto6 = new Picture("images/backflips.jpg");
        recursive(posterphoto6, 1);
        recolor3(posterphoto6);
        copytoCanvas(posterphoto6, canvas, 1000, 500);
        
        canvas.explore();
        canvas.write("images/posterfinal.jpg");
    }
    /**
     Method to mirror across the y axis based on width
     */
    public static void mirrorVertical(Picture source)
    {
        int width = source.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null; 
        //loop through all of the rows
        for (int y = 0; y < source.getHeight(); y++){
            //loop from 0 to the middle(mirror point)
            for (int x = 0; x < mirrorPoint; x++){
                leftPixel = source.getPixel(x, y);
                rightPixel = source.getPixel(width -1 - x, y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    /**
     Method to mirror across the x axis.
     Do it based on height
     */
    public static void mirrorHorizontal(Picture source)
    {
        int height = source.getHeight();
        int mirrorPoint = height / 2;
        Pixel topThing = null;
        Pixel bottomThing = null;
    
        // loop through all columns
        for (int x = 0; x < source.getWidth(); x++) {
            // loop from 0 to the point
            for (int y = 0; y < mirrorPoint; y++) {
                topThing = source.getPixel(x, y);
                bottomThing = source.getPixel(x, height - 1 - y);
                bottomThing.setColor(topThing.getColor());
            }
        }
    }
    //Flips it so it sits on its side
    public static void rotate(Picture source)
    {
        int size = Math.min(source.getWidth(), source.getHeight());
        for (int x = 0; x < size; x++) {
            for (int y = x + 1; y < size; y++) {
                Pixel p1 = source.getPixel(x, y);
                Pixel p2 = source.getPixel(y, x);
                Color temp = p1.getColor();
                p1.setColor(p2.getColor());
                p2.setColor(temp);
            }
        }
    }
        /**
     * Method to print the image onto itself a buncha times using recursion
     */
    public static void recursive(Picture source, int change) {
        int size = Math.min(source.getWidth(), source.getHeight());
        // Base case
        if (change > size){ 
            return;
        }
        // Srhink by factor
        int SW = source.getWidth() / change;
        int SH = source.getHeight() / change;
        
        for (int x = 0; x < SW; x++) {
            for (int y = 0; y < SH; y++) {
                // Sample from the full image, scaled down
                int Xscale = (int)(x * (double) source.getWidth() / SW);
                int Yscale = (int)(y * (double) source.getHeight() / SH);
                
                Pixel sourcei = source.getPixel(Xscale, Yscale);
                Pixel F = source.getPixel(x, y);
                
                F.setColor(sourcei.getColor());
            }
        }
        // Recurse with a larger changeominator (smaller region)
        recursive(source, change * 2);
    }
    /**
     Method to change the colors of an image. 
     */
    public static void recolor(Picture source)
    {
        for (int x = 0; x < source.getWidth(); x++) {
            for (int y = 0; y < source.getHeight(); y++) {
                Pixel spot = source.getPixel(x, y);
                int red = spot.getRed();
                int blue = spot.getBlue();
                int green = spot.getGreen();
                int grey = (red + blue + green) / 3;
                if (grey <= 25) {
                    spot.setRed(0); spot.setGreen(0); spot.setBlue(0);
                } else if (grey <= 51) {
                    spot.setRed(40); spot.setGreen(40); spot.setBlue(40);
                } else if (grey <= 76) {
                    spot.setRed(156); spot.setGreen(114); spot.setBlue(103);
                } else if (grey <= 102) {
                    spot.setRed(194); spot.setGreen(178); spot.setBlue(128);
                } else if (grey <= 128) {
                    spot.setRed(90); spot.setGreen(219); spot.setBlue(181);
                } else if (grey <= 153) {
                    spot.setRed(150); spot.setGreen(230); spot.setBlue(220);
                } else if (grey <= 178) {
                    spot.setRed(100); spot.setGreen(134); spot.setBlue(124);
                } else if (grey <= 204) {
                    spot.setRed(112); spot.setGreen(136); spot.setBlue(160);
                } else if (grey <= 230) {
                    spot.setRed(140); spot.setGreen(125); spot.setBlue(115);
                } else {
                    spot.setRed(97); spot.setGreen(79); spot.setBlue(74);
                }
            }
        }
    }
    public static void recolor2(Picture source)
    {
        for (int x = 0; x < source.getWidth(); x++) {
            for (int y = 0; y < source.getHeight(); y++) {
                Pixel spot = source.getPixel(x, y);
                int red = spot.getRed();
                int blue = spot.getBlue();
                int green = spot.getGreen();
                int grey = (red + blue + green) / 3;
                if (grey <= 25) {
                    spot.setRed(15);  spot.setGreen(10);  spot.setBlue(30);   // blackish purple
                } else if (grey <= 51) {
                    spot.setRed(45);  spot.setGreen(25);  spot.setBlue(80);   // dark purple
                } else if (grey <= 76) {
                    spot.setRed(70);  spot.setGreen(45);  spot.setBlue(130);  // dark blue purple
                } else if (grey <= 102) {
                    spot.setRed(90);  spot.setGreen(70);  spot.setBlue(175);  // medium indigo
                } else if (grey <= 128) {
                    spot.setRed(110); spot.setGreen(100); spot.setBlue(210);  // light blue
                } else if (grey <= 153) {
                    spot.setRed(140); spot.setGreen(135); spot.setBlue(225);  // soft blue
                } else if (grey <= 178) {
                    spot.setRed(170); spot.setGreen(170); spot.setBlue(235);  // Red blue
                } else if (grey <= 204) {
                    spot.setRed(200); spot.setGreen(205); spot.setBlue(245);  // pale purple blueish
                } else if (grey <= 230) {
                    spot.setRed(225); spot.setGreen(230); spot.setBlue(250);  // basically blue white
                } else {
                    spot.setRed(240); spot.setGreen(245); spot.setBlue(255);  // whiteish or off white
                }
            }
        }
    }
    public static void recolor3(Picture source)
    {
        for (int x = 0; x < source.getWidth(); x++) {
            for (int y = 0; y < source.getHeight(); y++) {
                Pixel spot = source.getPixel(x, y);
                int red = spot.getRed();
                int blue = spot.getBlue();
                int green = spot.getGreen();
                int grey = (red + blue + green) / 3;
                if (grey <= 25) {
                    spot.setRed(30);  spot.setGreen(15);  spot.setBlue(20);   // dark red 
                } else if (grey <= 51) {
                    spot.setRed(180); spot.setGreen(60);  spot.setBlue(75);   // deep raspberry
                } else if (grey <= 76) {
                    spot.setRed(222); spot.setGreen(107); spot.setBlue(72);   // clay orange color 
                } else if (grey <= 102) {
                    spot.setRed(240); spot.setGreen(160); spot.setBlue(80);   // warm amber
                } else if (grey <= 128) {
                    spot.setRed(249); spot.setGreen(200); spot.setBlue(120);  // gold
                } else if (grey <= 153) {
                    spot.setRed(255); spot.setGreen(218); spot.setBlue(160);  // peach tanish
                } else if (grey <= 178) {
                    spot.setRed(240); spot.setGreen(180); spot.setBlue(170);  // blush pink
                } else if (grey <= 204) {
                    spot.setRed(220); spot.setGreen(140); spot.setBlue(150);  // gray red
                } else if (grey <= 230) {
                    spot.setRed(198); spot.setGreen(110); spot.setBlue(120);  // pinkish
                } else {
                    spot.setRed(255); spot.setGreen(235); spot.setBlue(200);  // warm white
                }
            }
        }
    }
    //copy photo to canvas.
    //add 2 ints to params for locatio
    public static void copytoCanvas(Picture source, Picture target, int x, int y)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null;
        //loop through columns. (Hayes said tochange sourceX and targetX for where it starts)
        for (int sourceX = 0, targetX = x; sourceX < source.getWidth(); sourceX++, targetX++)
        {
            for (int sourceY = 0, targetY = y; sourceY < source.getHeight(); sourceY++, targetY++)
            {
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}
