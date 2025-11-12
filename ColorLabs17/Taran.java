
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
        Picture ferris1 = new Picture("images/taroosh.jpg");
        int red;
        int blue;
        int green;
        Pixel[] mpixels;
        mpixels = ferris1.getPixels();
        ferris1.explore();
        for (Pixel spotm : mpixels){
            //System.out.println( spot1 );
            red = spotm.getRed();
            blue = spotm.getBlue();
            green = spotm.getGreen();
            
            
            red = (int)(255-red);
            blue = (int)(255-blue);
            green = (int)(255-green);
            
            spotm.setRed(red);
            spotm.setGreen(green);
            spotm.setBlue(blue);
        }
        ferris1.explore();
    }
}