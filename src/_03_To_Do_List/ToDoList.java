package _03_To_Do_List;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add;
	JButton view;
	JButton remove;
	JButton save;
	JButton load;
	ArrayList<String> tasks = new ArrayList<String>();
	
	
	public void addButtons() {
		f = new JFrame();
		p = new JPanel();
		add = new JButton("add");
		view = new JButton("view");
		remove = new JButton("remove");
		save = new JButton("save");
		load = new JButton("load");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setPreferredSize(new Dimension(500,500));
		p.add(add);
		p.add(view);
		p.add(remove);
		p.add(save);
		p.add(load);
		f.add(p);
		f.pack();
		f.setVisible(true);
	}
	
	public void addActionListener() {
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = JOptionPane.showInputDialog("add task");
				tasks.add(str);
			}
			
		});
		view.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = 1;
				for(int i = 0; i < tasks.size(); i++) {
					System.out.println(num + ") " + tasks.get(i));
					num++;
				}
			}
			
		});
		remove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num = 1;
				int size = tasks.size();
				while(size != 0) {
					System.out.println(num + ") " + tasks.get(tasks.size() - size));
					size--;
					num++;
				}
				String s = JOptionPane.showInputDialog("Which task do you want to remove?");
				int i = Integer.parseInt(s);
				tasks.remove(i - 1);
			}
			
		});
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter r = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt");
					
					int t = tasks.size();
					while(t != 0) {
						r.write("\n" + tasks.get(tasks.size() - t));
					}
					r.close();
				}catch(IOException e1) {
					e1.printStackTrace();
				}
			}
			
		});
	}
	
	public ToDoList() {
		addButtons();
		addActionListener();
	}
	
	public static void main(String[] args) {
		new ToDoList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
	
	
}
