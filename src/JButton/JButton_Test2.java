package JButton;
import javax.swing.*;

public class JButton_Test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setTitle("JButton2");
        jf.setLayout(null);

        String[] name = {"1번", "2번", "3번"};
        for (int i=0; i<name.length; i++) {
            JButton jb = new JButton(name[i]);
            jb.setSize(140, 50);
            jb.setLocation(20, 30+70*i);

            jf.add(jb);
        }
        jf.setVisible(true);
    }

}