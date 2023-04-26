package GUI;

import bai_tap_lon.DanhSach;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    DanhSach ds;
    JLabel lbname,lbpassword;
    JTextField tname;
    JPasswordField passwordField;
    JButton btn1,btn2;
    public login(){
        ds = new DanhSach();
        ds.docFile();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1920,1080);
        this.setTitle("DANG NHAP");
        this.setResizable(false);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        //lbname
        lbname = new JLabel("ten dang nhap");
        gbc.gridx = 1;
        gbc.gridy=1;
        lbname.setFont(new Font("Times new roman",Font.PLAIN,20));
        this.add(lbname,gbc);
        //text name
        tname= new JTextField(20);
        gbc.gridx = 2;
        this.add(tname,gbc);
        //lbpass
        lbpassword = new JLabel("mat khau");
        gbc.gridx = 1;
        gbc.gridy = 2;
        lbpassword.setFont(new Font("Times new roman",Font.PLAIN,20));
        this.add(lbpassword,gbc);
        //textpass
        passwordField = new JPasswordField(20);
        gbc.gridx = 2;
        this.add(passwordField,gbc);
        //button login
        btn1 = new JButton("dang nhap");
        gbc.gridx=1;
        gbc.gridy = 3;
        this.add(btn1,gbc);
        //button exit
        btn2 = new JButton("thoat");
        gbc.gridx=2;
        this.add(btn2,gbc);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tname.getText().isEmpty()&&passwordField.getText().isEmpty())
                    JOptionPane.showMessageDialog(null,"hay nhap ten dang nhap va mat khau");
                else{
                    if(passwordField.getText().isEmpty())
                        JOptionPane.showMessageDialog(null,"hay nhap mat khau");
                    else{
                        if(tname.getText().isEmpty())
                            JOptionPane.showMessageDialog(null,"hay nhap ten dang nhap ");
                    }
                }
                if(!tname.getText().isEmpty()&&!passwordField.getText().isEmpty()){{
                    if(tname.getText().compareTo("admin")==0
                            &&passwordField.getText().compareTo("admin")==0){
                        JOptionPane.showMessageDialog(null, "ok");
                    }else if(ds.kTThuThu(tname.getText())==1&&ds.kTThuThu(passwordField.getText())==1.)
                        JOptionPane.showMessageDialog(null,"ok");
                }
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
