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
      setTitle("�������� ��ȸ");
      setSize(1000, 1500);
      setLayout(new FlowLayout());
      
      String[] header = {"�г�", "�з�", "�����ڵ�", "���¸�", "����", "����"};
      
      model = new DefaultTableModel(header, 0);
      
      table = new JTable(model);
      scroll = new JScrollPane(table);
      
      add(scroll);
      
      setLocationRelativeTo(null);
      setResizable(false);
      setVisible(true);
   }

}