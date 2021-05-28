package Layout;

import java.awt.Color;
import java.awt.Container;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class PayFrame extends JFrame {
   private ImageIcon bg;
   private JLabel bgPay;
   private String[] strs = {"�츮����","��������","�������", "īī����ũ", "����", "��������"};
   private JComboBox<String> bkStr;
   private JPanel p1;
   private Container c;
   private JPasswordField cvv;
   
   public PayFrame(String title, int width, int height) {
      setTitle(title);
      setResizable(false);
      setSize(width, height);
      setLocationRelativeTo(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      c = getContentPane();
      p1 = new JPanel();
      p1.setLayout(null);
      c.add(p1);
      
      bg = new ImageIcon("image/bg_payFrame.jpg");
      bgPay = new JLabel(bg);
      bgPay.setBounds(0, 0, 720, 480);
      p1.add(bgPay);
      
      //���� �޺��ڽ�
      
      bkStr = new JComboBox<String>(strs);
      bkStr.setBackground(Color.WHITE);
      bkStr.setBounds(75, 205, 224, 31);
      p1.add(bkStr);
      
      //ī���ȣ formattedTextField�� Ư���� �ؽ�Ʈ �ʵ带 ������
      
      JFormattedTextField cdnum;
      MaskFormatter formatter1 = null;
      try {
         formatter1 = new MaskFormatter("####-####-####-####");
      } catch (ParseException e) {
         e.printStackTrace();
      }
      formatter1.setPlaceholderCharacter('_');
      cdnum = new JFormattedTextField(formatter1);
      cdnum.setBounds(369, 205, 261, 31);
      p1.add(cdnum);
   
      
      //��¥ ī�� ��ȣ�� ���� �ϸ� ��
      JFormattedTextField expDate;
      MaskFormatter formatter2 = null;
      try {
         formatter2 = new MaskFormatter("##/##");
      } catch (ParseException e) {
         e.printStackTrace();
      }
      formatter2.setPlaceholderCharacter('_');
      expDate = new JFormattedTextField(formatter2);
      expDate.setBounds(75, 311, 151, 31);
      p1.add(expDate);
   
      //cvv�Է� �н�����ó�� ��������
      cvv = new JPasswordField(3);
      cvv.setBounds(369, 311, 151, 31);
      p1.add(cvv);
      
      
      setVisible(true);
   }
   
   public static void main(String[] args) {
      new PayFrame("����â", 720, 480);
   }

}