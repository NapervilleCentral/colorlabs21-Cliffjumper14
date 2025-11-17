import java.awt.Color;

public class funshepardfairy
{
    public static void main(String[] args)
    {
        Picture fairyOriginal = new Picture("images/fairy.jpg");
        for (int version = 1; version <= 5; version++) {
            Picture fairy = new Picture(fairyOriginal);
            Pixel[] pixels = fairy.getPixels();
            for (Pixel spot : pixels) {

                int red = spot.getRed();
                int blue = spot.getBlue();
                int green = spot.getGreen();
                int grey = (red + blue + green) / 3;
                switch (version) {
                    case 1:
    if      (grey <= 25)  spot.setColor(new Color(43,25,61));
    else if (grey <= 51)  spot.setColor(new Color(44,54,94));
    else if (grey <= 76)  spot.setColor(new Color(72,77,109));
    else if (grey <= 102) spot.setColor(new Color(75,143,140));
    else if (grey <= 128) spot.setColor(new Color(197,151,157));
    else if (grey <= 153) spot.setColor(new Color(43,25,61));
    else if (grey <= 178) spot.setColor(new Color(44,54,94));
    else if (grey <= 204) spot.setColor(new Color(72,77,109));
    else if (grey <= 230) spot.setColor(new Color(75,143,140));
    else                  spot.setColor(new Color(197,151,157));
    break;

                    case 2:
    if      (grey <= 25)  spot.setColor(new Color(70,18,32));
    else if (grey <= 51)  spot.setColor(new Color(140,47,57));
    else if (grey <= 76)  spot.setColor(new Color(178,58,72));
    else if (grey <= 102) spot.setColor(new Color(252,185,178));
    else if (grey <= 128) spot.setColor(new Color(254,208,187));
    else if (grey <= 153) spot.setColor(new Color(70,18,32));
    else if (grey <= 178) spot.setColor(new Color(140,47,57));
    else if (grey <= 204) spot.setColor(new Color(178,58,72));
    else if (grey <= 230) spot.setColor(new Color(252,185,178));
    else                  spot.setColor(new Color(254,208,187));
    break;

                    case 3:
    if      (grey <= 25)  spot.setColor(new Color(72,35,60));
    else if (grey <= 51)  spot.setColor(new Color(64,55,110));
    else if (grey <= 76)  spot.setColor(new Color(54,85,143));
    else if (grey <= 102) spot.setColor(new Color(162,188,224));
    else if (grey <= 128) spot.setColor(new Color(212,228,188));
    else if (grey <= 153) spot.setColor(new Color(72,35,60));
    else if (grey <= 178) spot.setColor(new Color(64,55,110));
    else if (grey <= 204) spot.setColor(new Color(54,85,143));
    else if (grey <= 230) spot.setColor(new Color(162,188,224));
    else                  spot.setColor(new Color(212,228,188));
    break;

                    case 4:
    if      (grey <= 25)  spot.setColor(new Color(34,3,31));
    else if (grey <= 51)  spot.setColor(new Color(135,179,141));
    else if (grey <= 76)  spot.setColor(new Color(204,118,161));
    else if (grey <= 102) spot.setColor(new Color(221,146,150));
    else if (grey <= 128) spot.setColor(new Color(162,188,224));
    else if (grey <= 153) spot.setColor(new Color(34,3,31));
    else if (grey <= 178) spot.setColor(new Color(135,179,141));
    else if (grey <= 204) spot.setColor(new Color(204,118,161));
    else if (grey <= 230) spot.setColor(new Color(221,146,150));
    else                  spot.setColor(new Color(162,188,224));
    break;

                    case 5:
    if      (grey <= 25)  spot.setColor(new Color(4,4,3));
    else if (grey <= 51)  spot.setColor(new Color(64,112,118));
    else if (grey <= 76)  spot.setColor(new Color(255,133,82));
    else if (grey <= 102) spot.setColor(new Color(233,215,88));
    else if (grey <= 128) spot.setColor(new Color(162,188,224));
    else if (grey <= 153) spot.setColor(new Color(4,4,3));
    else if (grey <= 178) spot.setColor(new Color(64,112,118));
    else if (grey <= 204) spot.setColor(new Color(255,133,82));
    else if (grey <= 230) spot.setColor(new Color(233,215,88));
    else                  spot.setColor(new Color(162,188,224));
    break;

                }
            }
            fairy.explore();  
        }
    }
}
