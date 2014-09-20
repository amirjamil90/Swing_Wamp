import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class wamp1 implements ActionListener 
{
	JFrame fr;
	public JButton b1,b2,b3,b4;


	public wamp1()
	{
		fr=new JFrame("wamp");
		b1=new JButton("start wamp");
		b2=new JButton("stop wamp");
		b3=new JButton("start weblogic");
		b4=new JButton("stop weblogic");
		fr.setLayout(new GridLayout(2,2));
		fr.add(b1);fr.add(b2);fr.add(b3);fr.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
        fr.setSize(200,200);
		fr.setVisible(true);
//		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);


	}
	public void actionPerformed(ActionEvent e)
	{
		
			
			if(e.getSource()==b1)
			{
				JFrame fr1=new JFrame("dsds");
				System.out.println("hi there ");
                 try
                 { 
				 Process p = Runtime.getRuntime().exec("C:\\wamp\\wampmanager.exe");
				 System.out.println("process started");
                 }
                 catch(Exception ee)
                 {
                 	ee.printStackTrace();
                 	System.out.println("wrong");
                 }

			}
				if(e.getSource()==b2)
				{

				}
				if(e.getSource()==b3)
				{
				JFrame fr1=new JFrame("runinig web logic");
				System.out.println("hi there ");
                 try
                 { 
				 Process p = Runtime.getRuntime().exec("C:\\bea10\\user_projects\\domains\\base_domain\\bin\\startWebLogic.cmd");
				 System.out.println("process started");
                 }
                 catch(Exception ee)
                 {
                 	ee.printStackTrace();
                 	System.out.println("wrong");
                 }

			}
			

	}
	public static void main(String args[])
	{
		new wamp1();
	}
}
