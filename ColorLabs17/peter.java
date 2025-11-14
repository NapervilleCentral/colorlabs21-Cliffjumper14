
/**
 * Write a description of class peter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class peter
{
    
    public static void main(String[] args)
    {
        Picture fairy3 = new Picture("images/peter.jpg");
        Pixel[] fairypixels3 = fairy3.getPixels();
        //NUMBER 3
        for (Pixel spot : fairypixels3) {
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
        fairy3.explore();
    }
}