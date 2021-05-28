package Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainFrame extends JFrame implements ActionListener {
	private JPanel p1, p2, p3;
	private ImageIcon bg;
	private ImageIcon pt1, pt2, pt3, pt4, pt5, prev1, prev2, next1, next2, logo, user;
	private JButton btnPrev, btnNext;
	private Container c;
	private JLabel lblBg, lblLogo;
	private JLabel [] lblPt = new JLabel [20];
	private JButton btnUser;
	private JPanel p4;
	private ImageIcon [] poster = new ImageIcon [20];
	private int startIndex = 0;


	
	public MainFrame(String title, int width, int height) {
	setTitle(title);
	setSize(width, height);
	//setLocation(500, 300);
	setLocationRelativeTo(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c = getContentPane();
	c.setLayout(new BorderLayout());
	
	p4 = new JPanel();
	p4.setLayout(null);
	
    bg = new ImageIcon("image/mainbg.jpg");
    lblBg = new JLabel(bg);
    lblBg.setBounds(0, 0, 1400, 700);
    p4.add(lblBg);
	
	p1 = new JPanel();
	p1.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));
	p1.setBackground(Color.BLACK);
	
	//포스트 이미지 넣기
	//i 0~4는 전시, 5~9는 뮤지컬, 10~14는 공연
	for(int i=0; i<15; i++) {
		poster[i] = new ImageIcon("image/poster"+i+".jpg");
		
		lblPt[i] = new JLabel(poster[i]);
	}
	for(int i=0; i<5; i++) {
		startIndex = 0;
		p1.add(lblPt[i]);
	}

//	System.out.println(currentIndex);
//	poster[0] = new ImageIcon("image/poster1.jpg");
//	lblPt[0] = new JLabel(poster[0]);
//	p1.add(lblPt[0]);
//	
//	poster[1] = new ImageIcon("image/poster2.jpg");
//	lblPt[1] = new JLabel(poster[1]);
//	p1.add(lblPt[1]);
//
//	poster[2] = new ImageIcon("image/poster3.jpg");
//	lblPt[2] = new JLabel(poster[2]);
//	p1.add(lblPt[2]);
//	
//	poster[3] = new ImageIcon("image/poster4.jpg");
//	lblPt[3] = new JLabel(poster[3]);
//	p1.add(lblPt[3]);
//
//	poster[4] = new ImageIcon("image/poster5.png");
//	lblPt[4] = new JLabel(poster[4]);
//	p1.add(lblPt[4]);
//	
//	poster[5] = new ImageIcon("image/poster6.jpg");
//	lblPt[5] = new JLabel(poster[5]);
//	
//	poster[6] = new ImageIcon("image/poster7.jpg");
//	lblPt[6] = new JLabel(poster[6]);
//	
//	poster[7] = new ImageIcon("image/poster8.jpg");
//	lblPt[7] = new JLabel(poster[7]);
//	
//	poster[8] = new ImageIcon("image/poster9.jpg");
//	lblPt[8] = new JLabel(poster[8]);
//	
//	poster[9] = new ImageIcon("image/poster10.jpg");
//	lblPt[9] = new JLabel(poster[9]);
//	
//	poster[10] = new ImageIcon("image/poster11.jpg");
//	lblPt[10] = new JLabel(poster[10]);
//	
//	poster[11] = new ImageIcon("image/poster12.jpg");
//	lblPt[11] = new JLabel(poster[11]);
//	
//	poster[12] = new ImageIcon("image/poster13.png");
//	lblPt[12] = new JLabel(poster[12]);
//	
//	poster[13] = new ImageIcon("image/poster14.jpg");
//	lblPt[13] = new JLabel(poster[13]);
//	
//	poster[14] = new ImageIcon("image/poster15.jpg");
//	lblPt[14] = new JLabel(poster[14]);
//	
//	 for(int i=0; i<poster.length; i++)  {
//		   poster[i] = new ImageIcon("images/poster" + i + ".jpg");
//
//		  currentId = 0; // 현재 선택된 이미지 번호
//		  lblPt[i] = new JLabel(poster[currentId]); // 현재 선택된 이미지를 레이블에 출력
//	 }
	 
//	pt1 = new ImageIcon("image/j1.jpg");
//	pt2 = new ImageIcon("image/j2.jpg");
//	pt3 = new ImageIcon("image/j3.jpg");
//	pt4 = new ImageIcon("image/j4.jpg");
//	pt5 = new ImageIcon("image/j5.png");
//	
//
//	JLabel lblPt1 = new JLabel(pt1);
//	JLabel lblPt2 = new JLabel(pt2);
//	JLabel lblPt3 = new JLabel(pt3);
//	JLabel lblPt4 = new JLabel(pt4);
//	JLabel lblPt5 = new JLabel(pt5);
	
//	lblPt1.setBounds(40, 150, 230, 327);
//	lblPt2.setBounds(40, 150, 230, 327);
//	lblPt3.setBounds(40, 150, 230, 327);
//	lblPt4.setBounds(40, 150, 230, 327);
//	lblPt5.setBounds(40, 150, 230, 327);
//	 for(int i=0; i<5; i++) {
//		 p1.add(lblPt[i]);
//	 }
//	p1.add(lblPt1);
//	p1.add(lblPt2);
//	p1.add(lblPt3);
//	p1.add(lblPt4);
//	p1.add(lblPt5);
	
	c.add(BorderLayout.CENTER, p1);
	
	p2 = new JPanel();
	p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20,50));
	p2.setBackground(Color.BLACK);
	prev1 = new ImageIcon("image/prev1.png");
	prev2 = new ImageIcon("image/prev2.png");
	next1 = new ImageIcon("image/next1.png");
	next2 = new ImageIcon("image/next2.png");
	
	btnPrev = new JButton(prev1);
	btnPrev.setVerticalTextPosition(SwingConstants.TOP); //JButton.TOPd이랑 똑같음
	btnPrev.setPressedIcon(prev2); //마우스가 올라갔을 때 클릭했을 때 모양이 바뀜
	btnPrev.setBorderPainted(false);
	btnPrev.setFocusPainted(false);
	btnPrev.setBackground(Color.BLACK);
	

	btnNext = new JButton(next1);
	btnNext.setVerticalTextPosition(SwingConstants.TOP); //JButton.TOPd이랑 똑같음
	btnNext.setPressedIcon(next2); //마우스가 올라갔을 때 클릭했을 때 모양이 바뀜
	btnNext.setBorderPainted(false);
	btnNext.setFocusPainted(false);
	btnNext.setBackground(Color.BLACK);
	
	btnNext.addActionListener(this);
	btnPrev.addActionListener(this);
	
	p2.add(btnPrev);
	p2.add(btnNext);
	
	c.add(BorderLayout.SOUTH, p2);
	

	p3 = new JPanel();
	p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
	p3.setBackground(Color.BLACK);


	btnUser = new JButton();
	btnUser.setIcon(new ImageIcon("image/user.png"));
	btnUser.setBorderPainted(false);
	btnUser.setFocusPainted(false);
	btnUser.setBackground(Color.BLACK);
	
	p3.add(btnUser, BorderLayout.EAST);
	
	c.add(BorderLayout.NORTH, p3);
	
    
	
	setVisible(true);
}

	


public static void main(String[] args) {
	new MainFrame("Main", 1400, 730);
}


@Override
public void actionPerformed(ActionEvent e) {
	Object obj = e.getSource();
	if(obj == btnNext ) {
		try {
			for(int i=0; i<0+5; i++) {
				lblPt[startIndex].setIcon(poster[startIndex+5]);
				p1.add(lblPt[startIndex+5]);
				startIndex ++;
			} 
		}catch (NullPointerException g) {
				g.printStackTrace();
			}catch (Exception g) {
				g.printStackTrace();
		}
	}
}

}
