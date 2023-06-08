package JButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton_Test3 {
    public static void main(String[] args) {
        FrameLayout f = new FrameLayout();
        f.frameLayout();
    }
}
class FrameLayout implements ActionListener {
    //이벤트 리스너는 static으로 선언한 main 메소드에서 사용불가
    public void frameLayout() {
        JFrame jf = new JFrame();
        jf.setSize(300 , 300);
        jf.setTitle("JButton3");
        jf.setLayout(null);

        String[] name = {"1번", "2번", "3번"};

        for(int i = 0; i < name.length; i++) {
            JButton jb = new JButton(name[i]);
            jb.setSize(140, 50);
            jb.addActionListener(this);

            jb.setLocation(70, 30 + 70 * i);

            jf.add(jb);
        }
        jf.setVisible(true);
    }

    //클릭할 때마다 발생
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "이벤트 발생\n클릭한 버튼의 번호는 " + e.getActionCommand() + "입니다.");
    }
}
