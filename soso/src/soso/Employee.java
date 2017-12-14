package soso;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener{

	JPanel p1,p2;
	JLabel label;
	JCheckBox b1,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	int result=0;
	Font font;
	public MyFrame() {
		setTitle("Subway customizing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,700);
		
		p1=new JPanel();
		b1=new JCheckBox("에그마요");
		b3=new JCheckBox("BLT");
		b4=new JCheckBox("터키");
		b5= new JCheckBox("아보카도");
		b6= new JCheckBox("더블미트");
		b7=new JCheckBox("더블치즈");
		b8= new JCheckBox("베이컨");
		b9=new JCheckBox("계란");
		b10= new JCheckBox("화이트");
		b11=new JCheckBox("플랫");
		b12= new JCheckBox("파마산");
		b13=new JCheckBox("사우전 아일랜드");
		b14= new JCheckBox("스위트 칠리");
		b15=new JCheckBox("렌치 드레싱");
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		
		p1.add(b1);	p1.add(b3);	p1.add(b4);
		p1.add(b5);	p1.add(b6);	p1.add(b7); p1.add(b8);
		p1.add(b9);	p1.add(b10);p1.add(b11);p1.add(b12);
		p1.add(b13);p1.add(b14);
		
		p2=new JPanel();
		font = new Font("Dialog",Font.BOLD|Font.ITALIC,20);
		
		label = new JLabel("현재까지의 가격은" +result+"원 입니다.");
		label.setFont(font);
		p2.add(label);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1)
		{
			result+=4300;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if (e.getSource()==b3)
		{
			result+=4700;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if (e.getSource()==b4)
		{
			result+=4700;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if (e.getSource()==b5)
		{
			result+=1500;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if(e.getSource()==b6) {
				result+=900;
				label.setText("현재까지의 가격은 "+result+"원 입니다.");
			}
		if(e.getSource()==b7) {
			result+=700;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if(e.getSource()==b8) {
			result+=900;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		if(e.getSource()==b9) {
			result+=700;
			label.setText("현재까지의 가격은 "+result+"원 입니다.");
		}
		
	}
}
public class Employee{
	public static void main(String[] args) {
		MyFrame t= new MyFrame();
	}
}
