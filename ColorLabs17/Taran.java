
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
        Picture moto = new Picture("images/taroosh.jpg");
        Picture mmoto = new Picture("images/taroosh.jpg");
        Picture nmoto = new Picture("images/taroosh.jpg");
        Picture omoto = new Picture("images/taroosh.jpg");
        Picture pmoto = new Picture("images/taroosh.jpg");
        Picture qmoto = new Picture("images/taroosh.jpg");
        Picture rmoto = new Picture("images/taroosh.jpg");
        Picture smoto = new Picture("images/taroosh.jpg");
        Picture tmoto = new Picture("images/taroosh.jpg");
        for (Pixel spotm : mpixels){
            red = spotm.getRed();
            blue = spotm.getBlue();
            green = spotm.getGreen();
            red = (int)(red * 2);
            blue = (int)(blue * 2);
            green = (int)(green * 2);            
            spotm.setRed(red);
            spotm.setGreen(green);
            spotm.setBlue(blue);
            
        }
        Pixel[] npixels;
        npixels = nmoto.getPixels();
        for (Pixel spotn  : npixels){
            //System.out.println( spot1 );
            red = spotn.getRed();
            blue = spotn.getBlue();
            green = spotn.getGreen();
            red = (int)(255-red );
            blue = (int)(255-blue );
            green = (int)(255-green );
            spotn.setRed(red);
            spotn.setGreen(green);
            spotn.setBlue(blue);
        }
        Pixel[] opixels;
        opixels = omoto.getPixels();
        for (Pixel spoto : opixels){
            //System.out.println( spot1 );
            red = spoto.getRed();
            blue = spoto.getBlue();
            green = spoto.getGreen();
            double num = (red + blue + green)/3;
            red = (int)(num);
            blue = (int)(num);
            green = (int)(num);
            spoto.setRed(red);
            spoto.setGreen(green);
            spoto.setBlue(blue);
        }
        Pixel[] ppixels;
        ppixels = pmoto.getPixels();
        for (Pixel spotp : ppixels){
            //System.out.println( spot1 );
            red = spotp.getRed();
            blue = spotp.getBlue();
            green = spotp.getGreen();
            
            double num = (red + blue + green)/3;
            red = (int)(255-num);
            blue = (int)(255-num);
            green = (int)(255-num);
             
            spotp.setRed(red);
            spotp.setGreen(green);
            spotp.setBlue(blue);
            
        }
        Pixel[] qpixels;
        qpixels = qmoto.getPixels();
        for (Pixel spotq : qpixels){
            red = spotq.getRed();
            blue = spotq.getBlue();
            green = spotq.getGreen();
            
            red = (int)(red *.5);
            blue = (int)(blue *.5);
            green = (int)(green * .5 );
             
            spotq.setRed(red);
            spotq.setGreen(green);
            spotq.setBlue(blue);
            
        }
        Pixel[] rpixels;
        rpixels = rmoto.getPixels();
        for (Pixel spotr : rpixels){
            //System.out.println( spot1 );
            red = spotr.getRed();
            blue = spotr.getBlue();
            green = spotr.getGreen();
            red = (int)(red-red);
            blue = (int)(blue-blue);
            green = (int)(green);
            spotr.setRed(red);
            spotr.setGreen(green);
            spotr.setBlue(blue);
            
        }
        Pixel[] spixels;
        spixels = rmoto.getPixels();
        for (Pixel spots : spixels){
            //System.out.println( spot1 );
            red = spots.getRed();
            blue = spots.getBlue();
            green = spots.getGreen();
            red = (int)(red);
            blue = (int)(blue);
            green = (int)(green);
            spots.setRed(blue);
            spots.setGreen(green);
            spots.setBlue(blue);
        }
        Pixel[] tpixels;
        tpixels = tmoto.getPixels();
        for (Pixel spott: tpixels){
          red = spott.getRed();  
          green = spott.getGreen();
          blue = spott.getBlue();
          if (blue>150){
              spott.setRed(0);
              spott.setGreen(100);
              spott.setBlue(0);
            }
        }
        moto.explore();
        nmoto.explore();
        omoto.explore();
        pmoto.explore();
        qmoto.explore();
        rmoto.explore();
        smoto.explore();
        tmoto.explore();
    }
}