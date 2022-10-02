package Codex_Minorproject;

import java.awt.event.*;
import javax.swing.*;
public class Quiz extends JFrame implements ActionListener{
	JLabel jlable;
	JRadioButton jradiobutton[]=new JRadioButton[5];
	JButton button1,button2;
	ButtonGroup buttongroup;
	int count=0,currques=0;
	int arr[]=new int[5];	
	Quiz(String str){
		super(str);
		jlable=new JLabel();
		add(jlable);
		buttongroup=new ButtonGroup();
		for(int i=0;i<5;i++){
			jradiobutton[i]=new JRadioButton();	
			add(jradiobutton[i]);
			buttongroup.add(jradiobutton[i]);
		}
		button1=new JButton("Next");
		button2=new JButton("Submit");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(button1);add(button2);
		set();
		jlable.setBounds(30,40,450,20);
		jradiobutton[0].setBounds(50,100,100,20);
		jradiobutton[1].setBounds(50,125,100,20);
		jradiobutton[2].setBounds(50,150,100,20);
		jradiobutton[3].setBounds(50,175,100,20);
		button1.setBounds(120,250,75,25);
		button2.setBounds(300,250,75,25);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setSize(600,400);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			if(check())
				count=count+1;
			currques++;
			set();	
			if(currques==5){
				button1.setEnabled(false);
				button2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Result")){
			if(check())
				count=count+1;
			currques++;
			JOptionPane.showMessageDialog(this,"Correct answers: "+count);
			System.exit(0);
		}
	}
	void set(){
		jradiobutton[4].setSelected(true);
		if(currques==0)
		{
			jlable.setText("Which one is DataStructure");
			jradiobutton[0].setText("Array");jradiobutton[1].setText("Integer");jradiobutton[2].setText("String");jradiobutton[3].setText("Character");	
		}
		if(currques==1)
		{
			jlable.setText("Who is Father Of computer");
			jradiobutton[0].setText("Alexander Graham Bell");jradiobutton[1].setText("Charles Babbage");jradiobutton[2].setText("J.L Baird");jradiobutton[3].setText("Newton");	
		}
		if(currques==2)
		{
			jlable.setText("What is Brain of Computer");
			jradiobutton[0].setText("Mouse");jradiobutton[1].setText("Cpu");jradiobutton[2].setText("KeyBoard");jradiobutton[3].setText("Disk Drive");	
		}
		if(currques==3)
		{
			jlable.setText("From Which Programming Language Java Is Derrived");
			jradiobutton[0].setText("C++");jradiobutton[1].setText("Python");jradiobutton[2].setText("JavaScript");jradiobutton[3].setText("C");	
		}
		if(currques==4)
		{
			jlable.setText("Java Is");
			jradiobutton[0].setText("Platform Independent");jradiobutton[1].setText("Platform Dependent");jradiobutton[2].setText("Both 1 and 2");jradiobutton[3].setText("None of Above");	
		}

		jlable.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jradiobutton[j].setBounds(50,80+i,200,20);
	}
	boolean check(){
		if(currques==0) 
			return(jradiobutton[0].isSelected());
		if(currques==1)
			return(jradiobutton[1].isSelected());
		if(currques==2)
			return(jradiobutton[1].isSelected());
		if(currques==3)
			return(jradiobutton[3].isSelected());
		if(currques==4)
			return(jradiobutton[0].isSelected());
		return false;
			}
	
	
	public static void main(String args[]){
		new Quiz("Java Test");
	}
}
