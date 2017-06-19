package gui;

import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Open_Menu_Panel extends JDialog {
   
   private JTable table;
   private DefaultTableModel model;
   private JScrollPane scroll;
   
   public Open_Menu_Panel() {
      setTitle("개설강좌 조회");
      setSize(1000, 1500);
      setLayout(new FlowLayout());
      
      String[] header = {"학년", "분류", "과목코드", "강좌명", "학점", "설계"};
      
      model = new DefaultTableModel(header, 0);
      
      table = new JTable(model);
      scroll = new JScrollPane(table);
      
      add(scroll);
      
      setLocationRelativeTo(null);
      setResizable(false);
      setVisible(true);
   }

}