package Test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class setFrame {

    private javax.swing.JFrame maintFrame;
    private javax.swing.JLabel lblBookTheme, lblBookCode, lblPublishing, lblTitle, lblAuthor, lblYear, lblPageNumber, lblPrice, lblRecord, lblLanguage, lblSearch;
    private javax.swing.JButton btnAdd, btnEdit, btnDelete, btnSave, btnIgnore, btnSearch, btnxuat;
    private javax.swing.JTextField tfBookCode, tfPublishing, tfTitle, tfYear, tfPageNumber, tfPrice, tfRecord, tfLanguage, tfSearch, tfAuthor;
    private javax.swing.JPanel panel1, panel1_1, panel1_2, panel2, panel2_1, panel2_2, panel2_3, panel3, panel4, panel5, panelRow1, panelRow2, panelRow3, panelRow4, panelRow5, panelRow6;
    private javax.swing.JComboBox cboBookTheme, cboPublishing;
    private javax.swing.JCheckBox ckbOnlyShowThemeBook;
    private javax.swing.JTable tbl1, tbl2;
    private javax.swing.JScrollPane jscp1, jscp2;
    private java.awt.GridBagConstraints gbc;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton rdoVn, rdoEnglish, rdoOther;

    public void prepareGUI() {
        init();
    }

    private void init() {
        JFrame maintFrame = new JFrame("QUẢN LÝ THƯ VIỆN");
        maintFrame.setSize(1200, 1000);
        maintFrame.setLayout(new BorderLayout());
        maintFrame.setLocationRelativeTo(null);
        maintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        maintFrame.setVisible(true);
        // SET THÔNG TIN CHO PHẦN BÊN TRÁI
        panel1 = new JPanel();
        panel1.setSize(200, 1000);
        panel1.setLayout(new BorderLayout());
        ckbOnlyShowThemeBook = new JCheckBox("Chỉ Hiện Thị Chủ Đề Có Sách");
        ckbOnlyShowThemeBook.setFont(new Font("Tahoma", 4, 15));
        tbl1 = new JTable();
        jscp1 = new JScrollPane();
        tbl1.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                        "STT", "Chủ Đề"
                }));
        jscp1.setViewportView(tbl1);
        panel1_1 = new JPanel();
        panel1_1.setLayout(new BorderLayout());
        panel1_1.add(ckbOnlyShowThemeBook);
        panel1_2 = new JPanel();
        panel1_2.setLayout(new BorderLayout());
        panel1_2.add(jscp1);
        panel1.add(panel1_1, BorderLayout.NORTH);
        panel1.add(panel1_2, BorderLayout.CENTER);
        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        //SET THÔNG TIN CHO PHẦN BÊN  PHẢI
        panel2 = new JPanel();
        //   panel2.setSize(800, 1000);
        panel2.setLayout(new BorderLayout());
        //  panel2.setBackground(Color.BLUE);
        btnAdd = new JButton("Thêm");
        btnEdit = new JButton("Sửa");
        btnDelete = new JButton("Xóa");
        btnSave = new JButton("Lưu");
        btnIgnore = new JButton("Bỏ Qua");
        lblBookTheme = new JLabel("Chủ Đề");
        cboBookTheme = new JComboBox();
        lblBookCode = new JLabel("Mã Sách");
        tfBookCode = new JTextField();
        lblPublishing = new JLabel("Nhà Xuất Bản");
        cboPublishing = new JComboBox();
        lblTitle = new JLabel("Tiêu Đề");
        tfTitle = new JTextField();
        lblAuthor = new JLabel("Tác Giả");
        tfAuthor = new JTextField();
        lblYear = new JLabel("Năm Xuất Bản");
        tfYear = new JTextField();
        lblPageNumber = new JLabel("Số Trang");
        tfPageNumber = new JTextField();
        lblPrice = new JLabel("Giá");
        tfPrice = new JTextField();
        lblRecord = new JLabel("Số Bản Lưu");
        tfRecord = new JTextField();
        lblLanguage = new JLabel("Ngôn Ngữ");
        btnGroup = new javax.swing.ButtonGroup();
        rdoEnglish = new JRadioButton("Tiếng Anh");
        rdoOther = new JRadioButton("Khác");
        rdoVn = new JRadioButton("Tiếng Việt");
        lblSearch = new JLabel("Tìm Kiếm");
        tfSearch = new JTextField();
        btnSearch = new JButton("Tìm Kiếm");
        btnxuat = new JButton("Kết Xuất");
        btnGroup.add(rdoEnglish);
        btnGroup.add(rdoVn);
        btnGroup.add(rdoOther);

        jscp2 = new JScrollPane();
        tbl2 = new JTable();
        tbl2.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{
                        "Mã Sách", "Tiêu Đề", "Số Bản Lưu"
                }));
        jscp2.setViewportView(tbl2);
        //SET PANEL2_1
        panel2_1 = new JPanel(new GridLayout(1, 5, 5, 0));
        panel2_1.add(btnAdd);
        panel2_1.add(btnEdit);
        panel2_1.add(btnDelete);
        panel2_1.add(btnSave);
        panel2_1.add(btnIgnore);
        panel2_2 = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.weightx = 2.5;
        gbc.weighty = 2.5;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //SET ROW 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel2_2.add(lblBookTheme, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel2_2.add(cboBookTheme, gbc);
        //SET ROW 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel2_2.add(lblBookCode, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel2_2.add(tfBookCode, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel2_2.add(lblPublishing, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        panel2_2.add(cboPublishing, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        //SET ROW 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel2_2.add(lblTitle, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel2_2.add(tfTitle, gbc);
        //SET ROW 4
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel2_2.add(lblAuthor, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel2_2.add(tfAuthor, gbc);
        //SET ROW 5
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel2_2.add(lblYear, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel2_2.add(tfYear, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel2_2.add(lblPageNumber, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        panel2_2.add(tfPageNumber, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        panel2_2.add(lblPrice, gbc);
        gbc.gridx = 5;
        gbc.gridy = 4;
        panel2_2.add(tfPrice, gbc);
        //SET ROW 6
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel2_2.add(lblRecord, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel2_2.add(tfRecord, gbc);
        gbc.gridx = 2;
        gbc.gridy = 5;
        panel2_2.add(lblLanguage, gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        panel2_2.add(rdoEnglish, gbc);
        gbc.gridx = 4;
        gbc.gridy = 5;
        panel2_2.add(rdoVn, gbc);
        gbc.gridx = 5;
        gbc.gridy = 5;
        panel2_2.add(rdoOther, gbc);
        //SET ROW 7
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel2_2.add(lblSearch, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        panel2_2.add(tfSearch, gbc);
        gbc.gridx = 2;
        gbc.gridy = 6;
        panel2_2.add(btnSearch, gbc);
        gbc.gridx = 3;
        gbc.gridy = 6;
        panel2_2.add(btnxuat, gbc, GridBagConstraints.SOUTHEAST);
        panel2_3 = new JPanel(new BorderLayout());
        panel2_3.add(jscp2);
        //ADD TO PANEL2
        panel2.add(panel2_1, BorderLayout.NORTH);
        panel2.add(panel2_2, BorderLayout.CENTER);
        panel2.add(panel2_3, BorderLayout.SOUTH);
// ADD CÁC THÔNG TIN VÀO MAINT
        maintFrame.add(panel1, BorderLayout.WEST);
        maintFrame.add(panel2, BorderLayout.CENTER);
    }


}