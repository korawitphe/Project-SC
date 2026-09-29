//เอาไลบรารีที่จำเป็นเข้ามา
import javax.swing.*;
import java.awt.*;

//สร้างคลาสที่จะเป็นหน้า แต่จะสืบทอด (extends) มาจาก JFrame
public class DifficultyFrame extends JFrame {

    //สร้าง Constructor เป็นฟังก์ชันที่เรียกทันทีเมื่อต่างถูกเรียกใช้งาน
    public DifficultyFrame() {
        //ตั้งชื่อแถบบนสุดของหน้าต่างนี้
        setTitle("Difficulty");

        //กำหนดขนาดของหน้าต่าง
        setSize(800, 600);

        //ใส่ปุ่มกากบาท
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ทำให้หน้าต่างอยู่กลางจอ
        setLocationRelativeTo(null);

        //สร้าง JPanel มาจัดวางองค์ประกอบทั้งหมด
        //ใช้ BoxLayout เพื่อเรียงของจากบนลงมาล่าง
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        //เพิ่มขอบว่างๆ รอบๆของ Panel เพื่อให้มันดูสวยงาม
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        mainPanel.setBackground(Color.WHITE); //ตั้งพื้นหลังสีขาว
        
        //สร้างส่วนหัว
        //สร้าง JLabel สำหรับหัวข้อหลัก
        JLabel titleLabel = new JLabel("Select Difficulty");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); //ตั้งฟอนต์
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT); //ทำให้อยู่ตรงกลาง

        //สร้างข้อความต่อมา
        JLabel subtitleLabel = new JLabel("Choose Your Challenge");
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        subtitleLabel.setForeground(Color.GRAY); //ทำตัวอักษรสีเทา
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        //สร้างปุ่ม
        JButton easyButton = createDifficultyButton("Easy");
        JButton normalButton = createDifficultyButton("Normal");
        JButton hardButton = createDifficultyButton("Hard");

        //เอาทุกอันที่สร้างมาประกอบกัน
        mainPanel.add(Box.createVerticalStrut(20)); //เพิ่มช่องว่างแนวตั้ง 20
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(5)); //เพิ่มช่องว่างแนวตั้ง 5
        mainPanel.add(subtitleLabel);
        mainPanel.add(Box.createVerticalStrut(40)); //ช่องว่างก่อนจะถึงปุ่ม

        mainPanel.add(easyButton);
        mainPanel.add(Box.createVerticalStrut(50)); //ช่องว่างระหว่างปุ่ม
        mainPanel.add(normalButton);
        mainPanel.add(Box.createVerticalStrut(50)); //ช่องว่างระหว่างปุ่ม
        mainPanel.add(hardButton);

        //เอา Panel ทั้งหมดไปใส่ในหน้าต่าง
        add(mainPanel);
    }

    //ฟังก์ชันเสริมสร้างปุ่มที่เหมือนกัน
    private JButton createDifficultyButton(String text) {
        JButton button = new JButton(text);
        //ตั้งค่าปุ่มเบื้องต้น
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false); //ไว้ปิดกรอบตอนกดปุ่ม
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(300, 50)); //จำกัดหนาดปุ่ม
        return button;
    }

    //อันนี้คือจุดเริ่มต้นของการทำงานของโปรแกรม ก็คือ Main Method
    public static void main(String[] args) {
        //สร้างออบเจกต์ของหน้าต่างขึ้นมา
        DifficultyFrame frame = new DifficultyFrame();
        //แสดงหน้าต่าง
        frame.setVisible(true);
    }
}