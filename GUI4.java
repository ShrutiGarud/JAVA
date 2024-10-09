import java.awt.*;
import java.awt.event.*;

class MarvellousFrame{
    public MarvellousFrame(String title){
        Frame fobj=new Frame("PPA50");
        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellouseListener());
    }
}

class MarvellouseListener extends WindowAdapter{
   
    public void  windowClosing(WindowEvent obj){
        System.exit(0);
    }
    

}

class GUI4{
    public static void main(String[]args){
      MarvellousFrame mobj=new MarvellousFrame("Marvellous");
    }
}