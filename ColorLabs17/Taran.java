
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
        int grey;
        Pixel[] mpixels;
        mpixels = ferris1.getPixels();
        ferris1.explore();
        for (Pixel spotm : mpixels){
            //System.out.println( spot1 );
            red = spotm.getRed();
            blue = spotm.getBlue();
            green = spotm.getGreen();
            grey = (int)(red + blue + green)/3;
            
            red = (int)(255-grey);
            blue = (int)(200);
            green = (int)(150);
            
            spotm.setRed(red);
            spotm.setGreen(green);
            spotm.setBlue(blue);
        }
        ferris1.explore();
    }
}