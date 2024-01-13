import javax.swing.*;
import java.awt.event.*;


class MarvellousCalculator
{
    public static void main(String arg[])
    {
        Calculator cobj=new Calculator(400,400,"Marvellous Calculator");
    }
}
class Calculator extends WindowAdapter implements ActionListener
{
    public Jframe mainframe;
    public Calculator(int width,int height,String title)
    {
        mainframe=new Jframe(title);
        mainframe.setSize(width,height);
        mainframe.setVisible(true);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {

    }

}