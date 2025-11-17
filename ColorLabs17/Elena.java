
/**
 * Write a description of class Elena here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elena
{
    public static void main(String[] args){
        Picture Elena1 = new Picture("images/Elena2.jpg");
        Picture Elena2 = new Picture("images/Elena2.jpg");
        Picture Elena3 = new Picture("images/Elena2.jpg");
        Picture Elena4 = new Picture("images/Elena2.jpg");
        Picture Elena5 = new Picture("images/Elena2.jpg");
        //Elena1.explore();
        //Elena2.explore();
        Pixel[] Elenapixels1 = Elena1.getPixels();
        Pixel[] Elenapixels2 = Elena2.getPixels();
        Pixel[] Elenapixels3 = Elena3.getPixels();
        Pixel[] Elenapixels4 = Elena4.getPixels();
        Pixel[] Elenapixels5 = Elena5.getPixels();
        for (Pixel spot : Elenapixels5) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            int grey = (red + blue + green) / 3;            
            spot.setRed(grey);
            spot.setGreen(grey);
            spot.setBlue(grey);
        }
        for (Pixel spot : Elenapixels4) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            int grey = (red + blue + green) / 3;            
            if (grey <= 51) {
                
                spot.setRed(79);
                spot.setGreen(81);
                spot.setBlue(125);
            }
            else if (grey <= 102){
                spot.setRed(220);
                spot.setGreen(207);
                spot.setBlue(236);
            } 
            else if (grey <= 153){
                spot.setRed(169);
                spot.setGreen(151);
                spot.setBlue(223);
            }
            else if (grey <= 204 ){
                spot.setRed(221);
                spot.setGreen(196);
                spot.setBlue(221);
            } 
            else if (grey <= 255) { 
                spot.setRed(26);
                spot.setGreen(58);
                spot.setBlue(58);
            }
        }
        for (Pixel spot : Elenapixels3) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            int grey = (red + blue + green) / 3;            
            if (grey <= 51) {
                spot.setRed(107);
                spot.setGreen(94);
                spot.setBlue(98);
            }
            else if (grey <= 102){
                spot.setRed(234);
                spot.setGreen(255);
                spot.setBlue(253);
            } 
            else if (grey <= 153){
                spot.setRed(239);
                spot.setGreen(239);
                spot.setBlue(240);
            }
            else if (grey <= 204 ){
                spot.setRed(213);
                spot.setGreen(202);
                spot.setBlue(214);
            } 
            else if (grey <= 255) { 
                spot.setRed(201 );
                spot.setGreen(240);
                spot.setBlue(255);
            }
        }
        for (Pixel spot : Elenapixels2) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            int grey = (red + blue + green) / 3;            
            if (grey <= 51) {
                spot.setRed(88);
                spot.setGreen(75);
                spot.setBlue(83);
            }
            else if (grey <= 102){
                spot.setRed(157);
                spot.setGreen(92);
                spot.setBlue(99);
            } 
            else if (grey <= 153){
                spot.setRed(214);
                spot.setGreen(227);
                spot.setBlue(248);
            }
            else if (grey <= 204 ){
                spot.setRed(254);
                spot.setGreen(245);
                spot.setBlue(239);
            } 
            else if (grey <= 255) { 
                spot.setRed(228);
                spot.setGreen(187);
                spot.setBlue(151);
            }
        }
        for (Pixel spot : Elenapixels1) {
            int red = spot.getRed();
            int blue = spot.getBlue();
            int green = spot.getGreen();
            int grey = (red + blue + green) / 3;            
            if (grey <= 51) {
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(0);
            }
            else if (grey <= 102){
                spot.setRed(40);
                spot.setGreen(40);
                spot.setBlue(40);
            } 
            else if (grey <= 153){
                spot.setRed(156);
                spot.setGreen(114);
                spot.setBlue(103);
            }
            else if (grey <= 204 ){
                spot.setRed(194);
                spot.setGreen(178);
                spot.setBlue(128);
            } 
            else if (grey <= 255) { 
                spot.setRed(90);
                spot.setGreen(219);
                spot.setBlue(181);
            }
        }
        Elena1.explore();
        Elena2.explore();
        Elena3.explore();
        Elena4.explore();
        Elena5.explore();
    }
}