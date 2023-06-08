package Layout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FlowLayout_Test2 extends JFrame {
    public FlowLayout_Test2() {
        setTitle("FlowLayout_Test2");
        setSize(300, 300);

        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //FlowLayout(가운데 정렬)
        jp.setBorder(new EmptyBorder(10, 10, 10, 10));
        //jp 개체 주위에 각 10만큼 공백을 설정

        String[] ButtonName = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for(int i=0; i<ButtonName.length; i++) {
            JButton jb = new JButton(ButtonName[i]);
            jp.add(jb);
        }
        add(jp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayout_Test2();
    }
}
