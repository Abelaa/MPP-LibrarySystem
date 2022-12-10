/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarysystem;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import business.Address;
import business.Author;
import business.Book;
import business.ControllerInterface;
import business.SystemController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author GebreegziabherG
 */
public class BookAuthorWindow extends javax.swing.JFrame {
	private ControllerInterface ci;
	private Book book;
	
    /**
     * Creates new form LibraryMember
     */
    public BookAuthorWindow(Book book) {
    	this.book = book;
    	this.ci = new SystemController();
        initComponents();
    }
    
    public void loadListOfAuthors() {
    	tableModel.setRowCount(0);
    	List<Author> authors = this.book.getAuthors();
    	for (Author author : authors) {
            this.tableModel.insertRow(
            	this.tableModel.getRowCount(), 
        		new Object[] {
    				author.getFirstName(), 
    				author.getLastName(),     			
    				author.getTelephone(),
    				author.getAddress().getStreet(),	
    				author.getAddress().getState(),	
    				author.getAddress().getCity(),	
    				author.getAddress().getZip(),
    				author.getCredential(),
    				author.getBio()
    			}
            );
    	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCloseWindow = new javax.swing.JLabel();
        headingLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        basicInfoLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        telephoneLabel = new javax.swing.JLabel();
        telephoneTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        streetAddressLabel = new javax.swing.JLabel();
        streetAddressTextField = new javax.swing.JTextField();
        stateLabel = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        zipCodeLabel = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        telephoneLabel1 = new javax.swing.JLabel();
        telephoneTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        libraryMembersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCloseWindow.setForeground(new java.awt.Color(51, 51, 51));
        btnCloseWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseWindow.setText("X");
        btnCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseWindowMouseExited(evt);
            }
        });

        headingLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        headingLabel.setText("Manage Authors of book: ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Example Book 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCloseWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        basicInfoLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        basicInfoLabel.setText("Author Info");
        basicInfoLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(102, 102, 102)));

        firstNameLabel.setText("First Name");

        firstNameTextField.setForeground(new java.awt.Color(0, 51, 51));
        firstNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        lastNameLabel.setText("Last Name");

        lastNameTextField.setForeground(new java.awt.Color(0, 51, 51));
        lastNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        telephoneLabel.setText("Telephone");

        telephoneTextField.setForeground(new java.awt.Color(0, 51, 51));
        telephoneTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        addressLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        addressLabel.setText("Address");
        addressLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(102, 102, 102)));

        streetAddressLabel.setText("Street Address");

        streetAddressTextField.setForeground(new java.awt.Color(0, 51, 51));
        streetAddressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        stateLabel.setText("State");

        stateTextField.setForeground(new java.awt.Color(0, 51, 51));
        stateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        cityLabel.setText("City");

        cityTextField.setForeground(new java.awt.Color(0, 51, 51));
        cityTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        zipCodeLabel.setText("Zip Code");

        zipCodeTextField.setForeground(new java.awt.Color(0, 51, 51));
        zipCodeTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setText("Add");

        btnUpdate.setText("Update");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");

        btnClear1.setBackground(new java.awt.Color(242, 242, 242));
        btnClear1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(51, 51, 51));
        btnClear1.setText("<< Back");
        btnClear1.setBorder(null);
        btnClear1.setOpaque(true);
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telephoneLabel1.setText("Bio");

        telephoneTextField1.setForeground(new java.awt.Color(0, 51, 51));
        telephoneTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));

        jCheckBox1.setText("Has Credential");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lastNameTextField)
                                        .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telephoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telephoneLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(basicInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(streetAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(streetAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(telephoneTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(basicInfoLabel)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(streetAddressLabel)
                                .addGap(5, 5, 5)
                                .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addGap(5, 5, 5)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(stateLabel)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cityLabel)
                                    .addGap(2, 2, 2)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lastNameLabel)
                                .addGap(5, 5, 5)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telephoneLabel)
                                .addGap(2, 2, 2)
                                .addComponent(telephoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(zipCodeLabel)
                                .addGap(3, 3, 3)
                                .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telephoneLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(telephoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        libraryMembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Telephone", "Bio", "Credential", "Street Address", "State", "City", "Zip Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(libraryMembersTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnLoginExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnLoginExitMouseClicked

    private void btnLoginExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseEntered
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 22));
    }//GEN-LAST:event_btnLoginExitMouseEntered

    private void btnLoginExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginExitMouseExited
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 0, 18));
    }//GEN-LAST:event_btnLoginExitMouseExited

    private void btnCloseWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseEntered
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 1, 22));
    }//GEN-LAST:event_btnCloseWindowMouseEntered

    private void btnCloseWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseWindowMouseClicked

    private void btnCloseWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseWindowMouseExited
        btnCloseWindow.setFont(new java.awt.Font("Segoe UI", 0, 18));
    }//GEN-LAST:event_btnCloseWindowMouseExited

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        navigateToBookWindow();
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void navigateToBookWindow(){
        this.setVisible(false);
        BookWindow bookWindow = new BookWindow();
        
        FrameDragListener frameDragListener = new FrameDragListener(bookWindow);
        bookWindow.addMouseListener(frameDragListener);
        bookWindow.addMouseMotionListener(frameDragListener);
        bookWindow.setLocationRelativeTo(null);
        bookWindow.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel basicInfoLabel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JLabel btnCloseWindow;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTable libraryMembersTable;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JLabel streetAddressLabel;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JLabel telephoneLabel1;
    private javax.swing.JTextField telephoneTextField;
    private javax.swing.JTextField telephoneTextField1;
    private javax.swing.JLabel zipCodeLabel;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
