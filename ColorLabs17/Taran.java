
/**
 * Write a description of class Taran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taran
{
    public static void main(String[] args)
    {
        Picture fairy = new Picture("images/taroosh.jpg");
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
                spot.setRed(173);
                spot.setGreen(170);
                spot.setBlue(190);
            } 
            else if (grey <= 127) {
                // Red
                spot.setRed(170);
                spot.setGreen(0);
                spot.setBlue(0);
            } 
            else if (grey <= 191) {
                // Light Blue

                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(130);
            } 
            else {
                // Cream White
                spot.setRed(220);
                spot.setGreen(199);
                spot.setBlue(161);
            }
        }
        fairy.explore();
        //fairy.write("images/sf1.jpg");
    }
}