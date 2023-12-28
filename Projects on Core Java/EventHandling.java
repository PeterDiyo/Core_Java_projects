
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class LearningAWT  {

    public LearningAWT(){

        // creating frame object
        Frame frame = new Frame("Scaler topics, presents");

        // creating button object and setting the bounds of it
        // bounds are x,y cordinates in the container and 
        // width,hieght of the button object
        Button mybtn = new Button("Click Me");
        mybtn.setBounds(130,150,100,60);
        mybtn.setBackground(Color.red);

        // adding actionListner to the button 
        // that will change the UI
        // once the button is clicked, as instructed
        
        mybtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                // choosing random background color for button after click
                mybtn.setBackground(new Color(r,g,b));
                r = rand.nextFloat();
                g = rand.nextFloat();
                b = rand.nextFloat();

                // choosing random text color for button after click
                mybtn.setForeground(new Color(r,g,b));

                // updating button font
                mybtn.setFont(new Font("Arial", Font. BOLD, 18));
            }
        });

        // locating the button inside the frame and
        // setting the layout and size for the frame
        frame.add(mybtn);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        // adding windowlistner to the frame
        // to make x button clickable.
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
    LearningAWT f = new LearningAWT();

    }
}
