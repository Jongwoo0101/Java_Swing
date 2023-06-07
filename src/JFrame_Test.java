import javax.swing.JFrame;

public class JFrame_Test {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // 새로운 JFrame을 만들어 jf라는 이름으로 사용
        jf.setBounds(600, 300, 300, 300);
        //jf의 크기와 좌표 지정
        jf.setTitle("JFrame_Test");
        //제목 설정
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //닫기 버튼을 눌렀을 때 동작설
        jf.setVisible(true);
        //jf프레임이 보이도록 설정
    }
}