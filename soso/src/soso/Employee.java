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
		b1=new JCheckBox("���׸���");
		b3=new JCheckBox("BLT");
		b4=new JCheckBox("��Ű");
		b5= new JCheckBox("�ƺ�ī��");
		b6= new JCheckBox("�����Ʈ");
		b7=new JCheckBox("����ġ��");
		b8= new JCheckBox("������");
		b9=new JCheckBox("���");
		b10= new JCheckBox("ȭ��Ʈ");
		b11=new JCheckBox("�÷�");
		b12= new JCheckBox("�ĸ���");
		b13=new JCheckBox("����� ���Ϸ���");
		b14= new JCheckBox("����Ʈ ĥ��");
		b15=new JCheckBox("��ġ �巹��");
		
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
		
		label = new JLabel("��������� ������" +result+"�� �Դϴ�.");
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
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if (e.getSource()==b3)
		{
			result+=4700;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if (e.getSource()==b4)
		{
			result+=4700;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if (e.getSource()==b5)
		{
			result+=1500;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if(e.getSource()==b6) {
				result+=900;
				label.setText("��������� ������ "+result+"�� �Դϴ�.");
			}
		if(e.getSource()==b7) {
			result+=700;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if(e.getSource()==b8) {
			result+=900;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		if(e.getSource()==b9) {
			result+=700;
			label.setText("��������� ������ "+result+"�� �Դϴ�.");
		}
		
	}
}
public class Employee{
	public static void main(String[] args) {
		MyFrame t= new MyFrame();
	}
}
