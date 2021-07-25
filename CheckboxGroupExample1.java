import java.awt.*;
import java.awt.event.*;
class CheckboxGroupExample1
{
     public static void main(String args[])
     {
          Frame f = new Frame();
          f.setTitle("CheckboxGroup");
          f.setSize(300,150);
          f.setVisible(true);
           f.setLayout(new FlowLayout());
          Label lbl = new Label("gender");
          CheckboxGroup g = new CheckboxGroup();
          Checkbox ch1 = new Checkbox("Male",false,g);
          Checkbox ch2 = new Checkbox("Female",false,g);
          f.add(lbl);
          f.add(ch1);
          f.add(ch2);
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
     }
}
 