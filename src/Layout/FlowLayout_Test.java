package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_Test extends JFrame{
    public FlowLayout_Test() {
        setTitle("Layout");
        setSize(350, 200);

        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //jp라는 패널을 생성하는데 배치관리자를 FlowLayout으로 하고 가운데 정

        String ButtonName[] = {"컴포넌트1", "컴포넌트2", "컴포넌트3", "컴포넌트4", "컴포넌트5", "컴포넌트6", "컴포넌트7", "컴포넌트8", "컴포넌트9"};
        for(int i=0; i<ButtonName.length; i++) {
            JButton jb = new JButton(ButtonName[i]);
            jp.add(jb);
        }
        add(jp);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayout_Test();
    }
}
