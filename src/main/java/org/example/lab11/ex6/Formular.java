package org.example.lab11.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formular extends JFrame {

    public Formular() {
        this.setLayout(null);
        setTitle("Formular Inscriere");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( 450, 450);
        setResizable(false);

        //crearePanel nume si prenume
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.setBounds(0, 0, 450, 50);
        JLabel numeLabel = new JLabel("Nume: ");
        numeLabel.setPreferredSize(new Dimension(70, 30));
        panel.add(numeLabel);
        JTextField numeField = new JTextField();
        numeField.setPreferredSize(new Dimension(100, 30));
        panel.add(numeField);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 50, 450, 50);
        panel_1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel prenumeLabel = new JLabel("Prenume: ");
        prenumeLabel.setPreferredSize(new Dimension(70, 50));
        panel_1.add(prenumeLabel);
        JTextField prenumeField = new JTextField();
        prenumeField.setPreferredSize(new Dimension(100, 30));
        panel_1.add(prenumeField);



        //panel pentru an studii
        JPanel panelAnStudii = new JPanel();
        panelAnStudii.setBounds(0, 100, 450, 50);
        panelAnStudii.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel studiiLabel = new JLabel("An studii: ");
        studiiLabel.setPreferredSize(new Dimension(70, 50));
        panelAnStudii.add(studiiLabel);

        //adaugare combobox
        JComboBox<String> studiiComboBox = new JComboBox<>();
        studiiComboBox.addItem("1");
        studiiComboBox.addItem("2");
        studiiComboBox.addItem("3");
        studiiComboBox.addItem("4");

        panelAnStudii.add(studiiComboBox);

        //panel pentru facultate
        JPanel panelFacultate = new JPanel();
        panelFacultate.setBounds(0, 150, 450, 50);
        panelFacultate.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel anStudiiLabel = new JLabel("Facultate: ");
        anStudiiLabel.setPreferredSize(new Dimension(70, 50));
        panelFacultate.add(anStudiiLabel);

        //adaugare combobox
        JComboBox<String> facultateComboBox = new JComboBox<>();
        facultateComboBox.addItem("ETTI");
        facultateComboBox.addItem("IE");
        facultateComboBox.addItem("AC");
        facultateComboBox.addItem("Altele");

        panelFacultate.add(facultateComboBox);


        //panel pentru curs
        JPanel panelCurs = new JPanel();
        panelCurs.setBounds(0, 200, 450, 50);
        panelCurs.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel cursLabel = new JLabel("Curs: ");
        cursLabel.setPreferredSize(new Dimension(70, 50));
        panelCurs.add(cursLabel);

        //adaugare combobox
        JComboBox<String> cursBox = new JComboBox<>();
        cursBox.addItem("Curs 1");
        cursBox.addItem("Curs 2");
        cursBox.addItem("Curs 3");
        cursBox.addItem("Curs 4");

        panelCurs.add(cursBox);


        //panel PT FINANTARE
        JPanel panelFinantare = new JPanel();
        panelFinantare.setBounds(0, 250, 450, 50);
        panelFinantare.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelFinantare = new JLabel("Finantare: ");
        labelFinantare.setPreferredSize(new Dimension(70, 50));
        panelFinantare.add(labelFinantare);

        JCheckBox[] checkBoxFinantare = {new JCheckBox("Buget"), new JCheckBox("Taxa")};

        for (int i = 0; i < checkBoxFinantare.length; i++) {
            panelFinantare.add(checkBoxFinantare[i]);
        }

        panel.add(panelFinantare);

        //panel buton
        JPanel panelButton = new JPanel();
        panelButton.setBounds(0, 300, 450, 50);
        panelButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton okButton = new JButton("Procesare");
        okButton.setPreferredSize(new Dimension(70, 40));
        panelButton.add(okButton);



        //panel unde afisez informatia
        JPanel panelInfo= new JPanel();
        panelInfo.setBounds(0, 350, 450, 50);
        panelInfo.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelInfo = new JLabel("");
        labelInfo.setPreferredSize(new Dimension(400, 50));
        panelInfo.add(labelInfo);



        //adaugare functionalitate buton
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBoxFinantare[0].isSelected()&&checkBoxFinantare[1].isSelected() || numeField.getText().isEmpty() || prenumeField.getText().isEmpty()) {
                    labelInfo.setText("Eroare in completarea campurilor.");
                    labelInfo.setForeground(Color.RED);
                } else {
                    labelInfo.setText( numeField.getText() + " " + prenumeField.getText() + " " + studiiComboBox.getSelectedItem() + " " + facultateComboBox.getSelectedItem() + " " + cursBox.getSelectedItem() + " " + labelFinantare.getText());
                    labelInfo.setForeground(Color.GREEN);
                }
            }
        });



        this.add(panel);
        this.add(panel_1);
        this.add(panelAnStudii);
        this.add(panelFacultate);
        this.add(panelCurs);
        this.add(panelFinantare);
        this.add(panelButton);
        this.add(panelInfo);

        setVisible(true);
    }
}
