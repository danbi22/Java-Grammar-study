package farmView;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("ProgressBar and Slider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JProgressBar 예시
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(50); // 현재 진행 상황 표시 (0~100)
        progressBar.setStringPainted(true); // 텍스트로 진행 상황 표시
        add(progressBar, BorderLayout.NORTH);

        // JSlider 예시
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // 최소, 최대, 초기값
        slider.setMinorTickSpacing(10); // 작은 눈금선 간격
        slider.setMajorTickSpacing(25); // 큰 눈금선 간격
        slider.setPaintTicks(true); // 눈금선 표시
        slider.setPaintLabels(true); // 눈금 값 표시
        add(slider, BorderLayout.SOUTH);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}