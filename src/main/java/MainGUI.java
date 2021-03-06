

import javax.swing.JFileChooser;
import javax.swing.DefaultListModel;
import java.io.File;
import java.io.IOException;
//import java.net.*;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MainGUI extends javax.swing.JFrame {
    //private Object select_file;

    /**
	 * 
	 */

	/**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }
    DefaultListModel<String> model = new DefaultListModel<String>();
    JFileChooser fileChooser = new JFileChooser();
	protected Window jFrame;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        select_file = new javax.swing.JButton();
        upload_file = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        check_net = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jList1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desktop");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Server");

        select_file.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        select_file.setText("Select File");
        select_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_fileActionPerformed(evt);
            }
        });

        upload_file.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        upload_file.setText("Upload File");
        upload_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)  {
                try{
                	upload_fileActionPerformed(evt);
                }
                catch(Exception e){}
            }
        });

        add.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        check_net.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check_net.setForeground(new java.awt.Color(204, 0, 0));
        
        logout = new JButton("Log Out");
        logout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		this.setVisible(false);
        		dispose();
        	}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				new LoginPage().setVisible(true);
			}
        });
        logout.setFont(new Font("Times New Roman", Font.BOLD, 14));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1Layout.setHorizontalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addGap(130)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        			.addGap(144))
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addComponent(select_file, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
        					.addGap(122)
        					.addComponent(add, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        					.addGap(8))
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(path))
        			.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
        						.addComponent(check_net, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap())
        				.addGroup(jInternalFrame1Layout.createSequentialGroup()
        					.addComponent(upload_file)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(logout)
        					.addGap(19))))
        );
        jInternalFrame1Layout.setVerticalGroup(
        	jInternalFrame1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jInternalFrame1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(select_file, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(upload_file, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(add, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(logout, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jInternalFrame1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(check_net, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(path, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        			.addGap(23))
        );
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        model.addElement(path.getText());
        listElement.add(path.getText());
        jList1.setModel(model);
    }//GEN-LAST:event_addActionPerformed

    private void upload_fileActionPerformed(java.awt.event.ActionEvent evt) throws IOException, GeneralSecurityException {//GEN-FIRST:event_upload_fileActionPerformed
    	//DriveQuickstart obj=new DriveQuickstart();
    	DriveQuickstart.insertData(listElement);
    	jList2.setModel(jList1.getModel());
    	check_net.setText("File Uploaded");
    	
        
    	
    }//GEN-LAST:event_upload_fileActionPerformed

    private void select_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_fileActionPerformed

        if(evt.getSource()==select_file)
        {

            int response = fileChooser.showOpenDialog(null);
            //int response = fileChooser.showSaveDialog(null);//select file to open

            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                
                path.setText(fileChooser.getSelectedFile().getAbsolutePath());
               

            }
    }//GEN-LAST:event_select_fileActionPerformed

    }

           private ArrayList<String> listElement=new  ArrayList<String>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel check_net;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField path;
    private javax.swing.JButton select_file;
    private javax.swing.JButton upload_file;
    private JButton logout;
}
