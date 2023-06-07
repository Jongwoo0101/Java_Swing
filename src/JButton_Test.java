import javax.swing.*;

public class JButton_Test {
    public static void main(String[] args) {
        //프레임을 만들고 사이즈와 위치를 설정한다
        JFrame jf = new JFrame();
        jf.setSize(220, 180);
        jf.setLocation(200, 200);
        jf.setTitle("JButton");
        //jf프레임의 레이아웃을 null로 지정
        jf.setLayout(null);

        //JButton을 만들어서 배치한다
        JButton jb = new JButton("클릭");
        jb.setSize(70, 40);
        jb.setLocation(60, 40);

        jf.add(jb);

        jf.setVisible(true);

    }
}
