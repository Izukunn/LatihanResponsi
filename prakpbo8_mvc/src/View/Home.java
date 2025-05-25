package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home extends JFrame {
    public Home() {
        setTitle("Home");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JButton btnMahasiswa = new JButton("Daftar Mahasiswa");
        btnMahasiswa.setBounds(50, 30, 200, 30);
        
        JButton btnDosen = new JButton("Daftar Dosen");
        btnDosen.setBounds(50, 80, 200, 30);

        add(btnMahasiswa);
        add(btnDosen);

        btnMahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new View.Mahasiswa.ViewData();
            }
        });

        btnDosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new View.Dosen.ViewData();
            }
        });

        setVisible(true);
    }
}