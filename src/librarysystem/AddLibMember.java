package librarysystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import business.Address;
import business.ControllerInterface;
import business.LibraryMember;
import business.SystemController;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import librarysystem.LibrarySystem.AddLibMemberListener;


public class AddLibMember extends JFrame  implements LibWindow{
	private static final long serialVersionUID = 11L;
	public static final AddLibMember INSTANCE = new AddLibMember();
    ControllerInterface ci = new SystemController();
    private boolean isInitialized = false;
    
	    DefaultTableModel model;
	    private JTextField idLabeltf;
	    private JTextField fnameLabeltf;
	    private JTextField lnameLabeltf;
	    private JTextField streetLabeltf;
	    private JTextField cityLabeltf;
	    private JTextField stateLabeltf;
	    private JTextField ZipcodeLabeltf;
	    private JTextField telephoneLabeltf;
	    private JTable table;
	    private JScrollPane scrollPane;
	    
	    private AddLibMember() {}
	    
		 public void init() {
			this.getContentPane().setForeground(new Color(255, 255, 255));
			this.setBounds(100, 100, 600, 580);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(233, 150, 122));
			panel.setBounds(0, 0, 594, 489);
			panel.setLayout(null);
			this.getContentPane().add(panel);
			
			JLabel idLabel = new JLabel("Member ID");
			idLabel.setBounds(6, 20, 61, 16);
			panel.add(idLabel);
			
			JLabel fnameLabel = new JLabel("First Name");
			fnameLabel.setBounds(6, 48, 71, 27);
			panel.add(fnameLabel);
			
			JLabel lnameLabel = new JLabel("Last Name");
			lnameLabel.setBounds(6, 87, 61, 16);
			panel.add(lnameLabel);
			
			JLabel streetLabel = new JLabel("Street Adress");
			streetLabel.setBounds(0, 124, 117, 16);
			panel.add(streetLabel);
			
			JLabel cityLabel = new JLabel("City");
			cityLabel.setBounds(6, 166, 137, 16);
			panel.add(cityLabel);
			
			JLabel stateLabel = new JLabel("State");
			stateLabel.setBounds(6, 213, 167, 16);
			panel.add(stateLabel);
			
			JLabel ZipcodeLabel = new JLabel("ZIpcode");
			ZipcodeLabel.setBounds(6, 240, 197, 16);
			panel.add(ZipcodeLabel);
			JLabel telephoneLabel = new JLabel("telephone Number");
			telephoneLabel.setBounds(-17, 277, 230, 16);
			panel.add(telephoneLabel);
			
			idLabeltf = new JTextField();
			idLabeltf.setBounds(79, 15, 161, 26);
			panel.add(idLabeltf);
			idLabeltf.setColumns(10);
			
			fnameLabeltf = new JTextField();
			fnameLabeltf.setBounds(79, 48, 161, 26);
			panel.add(fnameLabeltf);
			fnameLabeltf.setColumns(10);
			
			lnameLabeltf = new JTextField();
			lnameLabeltf.setBounds(79, 87, 161, 26);
			panel.add(lnameLabeltf);
			lnameLabeltf.setColumns(10);
			
			
			streetLabeltf = new JTextField();
			streetLabeltf.setBounds(79, 124, 161, 26);
			panel.add(streetLabeltf);
			streetLabeltf.setColumns(10);
			
			
			cityLabeltf = new JTextField();
			cityLabeltf.setBounds(79, 161, 161, 26);
			panel.add(cityLabeltf);
			cityLabeltf.setColumns(10);
			
			stateLabeltf = new JTextField();
			stateLabeltf.setBounds(79, 198, 161, 26);
			panel.add(stateLabeltf);
			stateLabeltf.setColumns(10);
			
			ZipcodeLabeltf = new JTextField();
			ZipcodeLabeltf.setBounds(79, 235, 161, 26);
			panel.add(ZipcodeLabeltf);
			ZipcodeLabeltf.setColumns(10);
			
			telephoneLabeltf = new JTextField();
			telephoneLabeltf.setBounds(79, 272, 161, 26);
			panel.add(telephoneLabeltf);
			telephoneLabeltf.setColumns(10);
			
			
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(6, 307, 582, 237);
			panel.add(scrollPane);
			
			table = new JTable();
			table.setBackground(new Color(255, 240, 245));
			model = new DefaultTableModel();
			String[] column = {"Member_ID","First Name","Last Name","Street Address","City","State","ZipCode","Telephone Number"};
		    final String[] row = new String[8];
			model.setColumnIdentifiers(column);
			table.setModel(model);
			scrollPane.setViewportView(table);
			
			DataAccess da=new DataAccessFacade();
	 
			for (LibraryMember member : da.readMemberMap().values())
			{ 
				String[] arow = {
						member.getMemberId(),
						member.getFirstName(),
						member.getLastName(),
						member.getAddress().getStreet(),
						member.getAddress().getCity(),
						member.getAddress().getState(),
						member.getAddress().getZip(),
						member.getTelephone()
				};
				//already existing data in data storage
				model.insertRow(0, arow);
			}
		
			
			
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int r = table.getSelectedRow();
					idLabeltf.setText(model.getValueAt(r, 0).toString());
					fnameLabeltf.setText(model.getValueAt(r, 1).toString());
					lnameLabeltf.setText(model.getValueAt(r, 2).toString());
					streetLabeltf.setText(model.getValueAt(r, 3).toString());
					cityLabeltf.setText(model.getValueAt(r, 4).toString());
					stateLabeltf.setText(model.getValueAt(r, 5).toString());
					ZipcodeLabeltf.setText(model.getValueAt(r, 6).toString());
					telephoneLabeltf.setText(model.getValueAt(r, 7).toString());
					
				}
			});
		
			
			JButton btnadd = new JButton("Add");
			btnadd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(idLabeltf.getText().equals("")||fnameLabeltf.getText().equals("")||lnameLabeltf.getText().equals("")||streetLabeltf.getText().equals("")||
							cityLabeltf.getText().equals("")||stateLabeltf.getText().equals("")||
							ZipcodeLabeltf.getText().equals("")||telephoneLabeltf.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill all the fields");
					}
					else {
					// add the entered inputs to the table
					row[0] = idLabeltf.getText();
					row[1] = fnameLabeltf.getText();
					row[2] = lnameLabeltf.getText();
					row[3] = streetLabeltf.getText();
					row[4] = cityLabeltf.getText();
					row[5] = stateLabeltf.getText();
					row[6] = ZipcodeLabeltf.getText();
					row[7] = telephoneLabeltf.getText();
					
					
					Address address=new Address(streetLabeltf.getText(), cityLabeltf.getText(), stateLabeltf.getText(), ZipcodeLabeltf.getText());
					LibraryMember libraryMember=new LibraryMember(idLabeltf.getText(),fnameLabeltf.getText() , lnameLabeltf.getText(), 
							telephoneLabeltf.getText(), address,null);
					
					ci.addLibraryMember(libraryMember);
					model.addRow(row);
					JOptionPane.showMessageDialog(null, "Added Successfully");
					// clear all the text fields
				    idLabeltf.setText("");
				    fnameLabeltf.setText("");
				    lnameLabeltf.setText("");
				    streetLabeltf.setText("");
				    cityLabeltf.setText("");
				    stateLabeltf.setText("");
				    ZipcodeLabeltf.setText("");
				    telephoneLabeltf.setText("");
					}
					
				}
			});
			btnadd.setBounds(277, 15, 117, 29);
			panel.add(btnadd);
			
			JButton btndel = new JButton("Delete");
			btndel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r = table.getSelectedRow();
					if(r>=0) {
						model.removeRow(r);
					    idLabeltf.setText("");
					    fnameLabeltf.setText("");
					    lnameLabeltf.setText("");
					    streetLabeltf.setText("");
					    cityLabeltf.setText("");
					    stateLabeltf.setText("");
					    ZipcodeLabeltf.setText("");
					    telephoneLabeltf.setText("");
						JOptionPane.showMessageDialog(null, "Deleted Successfully");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Please select a row");
					}
				}
			});
			btndel.setBounds(461, 15, 117, 29);
			panel.add(btndel);
			
			JButton btnupdate = new JButton("Update");
			btnupdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int r = table.getSelectedRow();
					System.out.println("R"+ r);
					if(r>=0) {
					model.setValueAt(idLabeltf.getText(), r, 0);
					model.setValueAt(fnameLabeltf.getText(), r, 1);
					model.setValueAt(lnameLabeltf.getText(), r, 2);
					model.setValueAt(streetLabeltf.getText(), r, 3);
					model.setValueAt(cityLabeltf.getText(), r, 4);
					model.setValueAt(stateLabeltf.getText(), r, 5);
					model.setValueAt(ZipcodeLabeltf.getText(), r, 6);
					model.setValueAt(telephoneLabeltf.getText(), r, 7);
					JOptionPane.showMessageDialog(null, "Updated Successfully");
				}
					else {
						JOptionPane.showMessageDialog(null, "Please select a row");
					}
				}
			});
			btnupdate.setBounds(277, 56, 117, 29);
			panel.add(btnupdate);
			
			JButton btnclear = new JButton("Clear");
			btnclear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				    
				    idLabeltf.setText("");
				    fnameLabeltf.setText("");
				    lnameLabeltf.setText("");
				    streetLabeltf.setText("");
				    cityLabeltf.setText("");
				    stateLabeltf.setText("");
				    ZipcodeLabeltf.setText("");
				    telephoneLabeltf.setText("");
				    
				}
			});
			btnclear.setBounds(461, 56, 117, 29);
			panel.add(btnclear);
			
			JButton btnback = new JButton("Back");
			btnback.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LibrarySystem.hideAllWindows();
					AddLibMember.this.setVisible(false);
					LibrarySystem.INSTANCE.setVisible(true);
					//MainWindow mWindow = new MainWindow();
					
					//mWindow.mframe.setVisible(true);
				}
			});
			btnback.setBounds(370, 107, 117, 29);
			panel.add(btnback);
		
			
		}

		 @Override
			public boolean isInitialized() {
				// TODO Auto-generated method stub
				return isInitialized;
			}

			@Override
			public void isInitialized(boolean val) {
				isInitialized = val;
				
			}

}
