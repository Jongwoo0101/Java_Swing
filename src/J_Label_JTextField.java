import javax.swing.*;

public class J_Label_JTextField {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(380, 180);
        jf.setLocation(400, 200);
        jf.setTitle("로그인");
        jf.setLayout(null);

        JLabel jl = new JLabel("아이디 : ");
        jl.setSize(80, 30);
        jl.setLocation(30, 30);
        jl.setHorizontalAlignment(JLabel.CENTER);
        jf.add(jl);

        JTextField jt = new JTextField();
        jt.setSize(130, 30);
        jt.setLocation(110, 30);
        jf.add(jt);

        jl = new JLabel("비밀번호 : ");
        jl.setSize(80, 30);
        jl.setLocation(30, 70);
        jf.add(jl);

        jt = new JTextField();
        jt.setSize(130, 30);
        jt.setLocation(110, 70);
        jf.add(jt);

        jf.setVisible(true);
    }
}
