
/**
 * Write a description of class Temple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temple
{
    public static void main(String[] args) throws Exception
    {
        Picture temple = new Picture("images/temple.jpg");
        mirrorVertical(temple, 100);
        temple.explore();
    }
    public static void mirrorVertical(Picture source, int height)
    {
        int width = source.getWidth();
        int mirrorPoint = width/2;
        Pixel leftPixel = null;
        Pixel rightPixel = null; 
        int h = height;
        //loop through all of the rows
        for (int y = 0; y < h; y++){
            //loop from 0 to the middle(mirror point)
            for (int x = 0; x < mirrorPoint; x++){
                leftPixel = source.getPixel(x, y);
                rightPixel = source.getPixel(width -1 - x, y);
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
}