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
                        if (grey <= 25){
                            spot.setColor(new Color(0,0,0));  
                        }
                        else if (grey <= 51){
                            spot.setColor(new Color(50,10,10)); 
                        }         
                        else if(grey <= 76){
                            spot.setColor(new Color(170,60,60)); 
                        }       
                        else if (grey <= 102){
                            spot.setColor(new Color(220,160,90)); 
                        }       
                        else if (grey <= 128){
                            spot.setColor(new Color(60,200,160));  
                        }        
                        else if (grey <= 153){
                            spot.setColor(new Color(20,140,200));  
                        }       
                        else if (grey <= 178){
                            spot.setColor(new Color(40,70,110));    
                        }       
                        else if (grey <= 204){
                            spot.setColor(new Color(100,100,100));   
                        }    
                        else if (grey <= 230){
                            spot.setColor(new Color(140,120,90));     
                        }     
                        else{
                            spot.setColor(new Color(80,40,20));
                        }  
                        break;
                    case 2:
                        if (grey <= 25){
                            spot.setColor(new Color(0,0,0));}             
                        else if (grey <= 51){
                            spot.setColor(new Color(255,0,120));}           
                        else if (grey <= 76){
                            spot.setColor(new Color(0,200,255));}           
                        else if (grey <= 102){
                            spot.setColor(new Color(255,255,0));}        
                        else if (grey <= 128){
                            spot.setColor(new Color(0,255,150));}          
                        else if (grey <= 153){
                            spot.setColor(new Color(255,80,0)); }        
                        else if (grey <= 178){
                            spot.setColor(new Color(0,90,255)); }         
                        else if (grey <= 204){
                            spot.setColor(new Color(255,0,0));  }       
                        else if (grey <= 230){
                            spot.setColor(new Color(150,0,255));}       
                        else{
                            spot.setColor(new Color(255,255,255));}          
                        break;
                    case 3:
                        if (grey <= 25)spot.setColor(new Color(10,20,5));            
                        else if (grey <= 51)spot.setColor(new Color(40,70,20));           
                        else if (grey <= 76)spot.setColor(new Color(100,160,40));          
                        else if (grey <= 102)spot.setColor(new Color(180,220,100));        
                        else if (grey <= 128)spot.setColor(new Color(255,140,0));         
                        else if (grey <= 153)spot.setColor(new Color(255,50,0));       
                        else if (grey <= 178)spot.setColor(new Color(110,40,20));           
                        else if (grey <= 204)spot.setColor(new Color(60,30,15));          
                        else if (grey <= 230)spot.setColor(new Color(20,10,5));           
                        else spot.setColor(new Color(255,240,180));        
                        break;
                    case 4:
                        if (grey <= 25)       spot.setColor(new Color(0,0,40));           
                        else if (grey <= 51)  spot.setColor(new Color(0,80,255));            
                        else if (grey <= 76)  spot.setColor(new Color(130,200,255));      
                        else if (grey <= 102) spot.setColor(new Color(255,240,200));    
                        else if (grey <= 128) spot.setColor(new Color(255,180,0));         
                        else if (grey <= 153) spot.setColor(new Color(255,90,0));      
                        else if (grey <= 178) spot.setColor(new Color(200,30,0));         
                        else if (grey <= 204) spot.setColor(new Color(120,0,0));          
                        else if (grey <= 230) spot.setColor(new Color(60,0,0));      
                        else                 spot.setColor(new Color(255,255,255));         
                        break;
                    case 5:
                        if (grey <= 25)       spot.setColor(new Color(0,30,20));           
                        else if (grey <= 51)  spot.setColor(new Color(0,180,130));       
                        else if (grey <= 76)  spot.setColor(new Color(150,255,210));         
                        else if (grey <= 102) spot.setColor(new Color(255,220,0));       
                        else if (grey <= 128) spot.setColor(new Color(255,100,200));       
                        else if (grey <= 153) spot.setColor(new Color(180,0,130));         
                        else if (grey <= 178) spot.setColor(new Color(90,0,90));             
                        else if (grey <= 204) spot.setColor(new Color(50,50,50));            
                        else if (grey <= 230) spot.setColor(new Color(120,120,120));        
                        else                 spot.setColor(new Color(255,255,255));          
                        break;
                }
            }
            fairy.explore();  
        }
    }
}
