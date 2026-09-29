//เอาไลยรารีที่จำเป็นเข้ามา
import javax.swing.*;

//สร้างคลาสทีที่จะเป็นหน้าหน้า แต่จะสืบทอด (extends) มาจาก JFrame
public class DifficultyFrame extends JFrame {

    //สร้าง Constructor เป็นฟังก์ชันที่เรียกทันทีเมื่อต่างถูกเรียกใช้งาน
    public DifficultyFrame() {
        //ตั้งชื่อแถบบนสุดของหน้าต่างนี้
        setTitle("Difficulty");

        //กำหนดขนาดของหน้าต่าง
        setSize(500, 600);

        //ใส่ปุ่มกากบาท
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //ทำให้หน้าต่างอยู่กลางจอ
        setLocationRelativeTo(null);
    }

    //อันนี้คือจุดเริ่มต้นของการทำงานของโปรแกรม ก็คือ Main Method
    public static void main(String[] args) {
        //สร้างออบเจกต์ของหน้าต่างขึ้นมา
        DifficultyFrame frame = new DifficultyFrame();
        //แสดงหน้าต่าง
        frame.setVisible(true);
    }
}