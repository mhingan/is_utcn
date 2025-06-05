package org.problemeExamen.pb1;

import javax.swing.*;                    // import bibliotecă Swing pentru componente GUI
import java.awt.*;                        // import pentru clase grafice (Color, Font, Dimension)
import java.awt.event.ActionEvent;       // import pentru evenimente de acțiune (buton apăsat)
import java.awt.event.ActionListener;    // import pentru ascultător de acțiune
import java.awt.event.MouseAdapter;      // import pentru adaptator de evenimente mouse
import java.awt.event.MouseEvent;        // import pentru eveniment de mouse
import java.io.BufferedWriter;           // import pentru scriere eficientă în fișier
import java.io.FileWriter;               // import pentru scriere în fișier
import java.io.IOException;               // import pentru gestionarea excepțiilor I/O

public class Desenare extends JFrame {   // clasa principală extinde JFrame pentru fereastră GUI

    public Desenare() {                   // constructorul clasei Desenare
        this.setTitle("Desenare");      // setează titlul ferestrei
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // termină aplicația la închiderea ferestrei
        this.setSize(600, 600);          // setează dimensiunea ferestrei la 600x600 pixeli
        this.setLayout(null);            // folosește layout absolut pentru poziționări manuale

        // creare zonă de desenare
        JPanel panelDesenare = new JPanel();
        panelDesenare.setLayout(null);             // layout absolut în interiorul panoului de desen
        panelDesenare.setBounds(0, 0, 300, 300);    // poziția și dimensiunea zonei de desenare
        panelDesenare.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // bordură neagră

        // creare zonă pentru butoane radio
        JPanel panelButoane = new JPanel();
        panelButoane.setBounds(300, 0, 300, 50);    // poziția și dimensiunea zonei de butoane

        // creare butoane radio pentru alegerea culorii
        JRadioButton rb1 = new JRadioButton("Rosu");
        JRadioButton rb2 = new JRadioButton("Verde");
        JRadioButton rb3 = new JRadioButton("Albastru");

        // grupare butoane radio pentru selecție exclusivă
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        // etichetă pentru titlul secțiunii istoric
        JLabel lb1 = new JLabel("Istoric:");
        lb1.setFont(new Font("Arial", Font.BOLD, 20)); // font Arial bold, mărime 20
        lb1.setBounds(10, 10, 80, 20);                  // poziția și dimensiunea etichetei

        // panel pentru afișarea istoricului desenelor
        JPanel panelIstoric = new JPanel();
        panelIstoric.setBounds(0, 350, 300, 120);       // poziția și dimensiunea zonei istoric
        panelIstoric.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // bordură
        panelIstoric.setLayout(null);                   // layout absolut
        panelIstoric.add(lb1);                          // adaugă eticheta "Istoric:" în panel

        // zona de text pentru istoricul desenelor
        JTextArea ta1 = new JTextArea();                // creează un JTextArea
        ta1.setEditable(false);                         // textul nu poate fi editat manual
        ta1.setBackground(Color.WHITE);                 // fundal alb
        ta1.setFont(new Font("Arial", Font.ITALIC, 10)); // font Arial italic, mărime 10
        ta1.setBounds(10, 40, 280, 70);                 // poziția și dimensiunea JTextArea
        panelIstoric.add(ta1);                          // adaugă JTextArea în panelIstoric

        // buton pentru salvarea istoricului în fișier
        JButton save = new JButton("Save");           // creează un buton "Save"
        save.setPreferredSize(new Dimension(100, 50)); // dimensiune preferată pentru buton
        JPanel panelButonSalveaza = new JPanel();      // panel pentru butonul de salvare
        panelButonSalveaza.setBounds(300, 350, 300, 120); // poziția și dimensiunea panelului
        panelButonSalveaza.add(save);                  // adaugă butonul în panel

        // etichetă pentru mesaje de status (eroare sau succes)
        JLabel lb2 = new JLabel("");                  // etichetă inițial goală
        lb1.setBounds(10, 10, 100, 20);                 // (re)setare poziție etichetă (din greșeală s-a folosit lb1)
        JPanel panelEtichetas = new JPanel();          // panel pentru eticheta de status
        panelEtichetas.setBounds(300, 470, 300, 120);  // poziția și dimensiunea panelului
        panelEtichetas.add(lb2);                       // adaugă eticheta lb2 în panel

        // adăugare eveniment de click cu mouse-ul în zona de desenare
        panelDesenare.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {   // metodă apelată la click

                String textScris = "";               // inițializare șir pentru istoric

                int size = 100;                        // dimensiunea pătratului desenat
                JPanel panelDesenare2 = new JPanel(); // panel care va reprezenta pătratul
                int x = e.getX() - size / 2;          // calculare coordonată x centrat
                int y = e.getY() - size / 2;          // calculare coordonată y centrat
                panelDesenare2.setBounds(x, y, size, size); // poziționare și dimensiune pătrat

                // verificare dacă pătratul iese din zona de desenare (300x300)
                if (x < 0 || y < 0 || x + size > 300 || y + size > 300) {
                    lb2.setForeground(Color.RED);     // culoare roșie pentru mesaj eroare
                    lb2.setText("Ati iesit din zona de desenare"); // mesaj de eroare
                    return;                           // oprește desenarea
                }

                lb2.setForeground(Color.GREEN);       // culoare verde pentru mesaj succes

                // verificare buton selectat și setare culoare pătrat + actualizare istoric
                if (rb1.isSelected()) {
                    lb2.setText("Desenare reusita");
                    panelDesenare2.setBackground(Color.RED);
                    textScris = "\nRosu, x:" + e.getX() + ", y:" + e.getY();
                    ta1.append(textScris);
                } else if (rb2.isSelected()) {
                    lb2.setText("Desenare reusita");
                    panelDesenare2.setBackground(Color.GREEN);
                    textScris = "\nVerde, x:" + e.getX() + ", y:" + e.getY();
                    ta1.append(textScris);
                } else {
                    lb2.setText("Desenare reusita");
                    panelDesenare2.setBackground(Color.BLUE);
                    textScris = "\nAlbastru, x:" + e.getX() + ", y:" + e.getY();
                    ta1.append(textScris);
                }

                panelDesenare.add(panelDesenare2);    // adaugă pătratul desenat în panelDesenare
                panelDesenare.revalidate();           // actualizează layout-ul
                panelDesenare.repaint();              // redesenează componenta
            }
        });

        // adăugare ascultător pentru butonul de salvare în fișier
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("output_desenare.txt")); // deschide fișierul
                    bw.write(ta1.getText());          // scrie textul din JTextArea
                    System.out.println("Fisier scris cu succes: " + ta1.getText()); // logare în consolă
                    lb2.setForeground(Color.BLACK);  // culoare neutră pentru mesaj
                    lb2.setText("Date scrise cu succes in fisier."); // mesaj de confirmare
                    bw.close();                      // închide BufferedWriter
                } catch (IOException exception) {
                    System.out.println("Error: " + exception.getMessage()); // afișează mesaj eroare
                }
            }
        });

        // adăugare componente în fereastră
        this.add(panelDesenare);               // adaugă zona de desenare în fereastră
        panelButoane.add(rb1);                 // adaugă buton roșu
        panelButoane.add(rb2);                 // adaugă buton verde
        panelButoane.add(rb3);                 // adaugă buton albastru
        this.add(panelButoane);                // adaugă zona butoane
        this.add(panelIstoric);                // adaugă zona istoric
        this.add(panelButonSalveaza);          // adaugă zona salvare fișier
        this.add(panelEtichetas);              // adaugă zona mesaje status

        this.setVisible(true);                 // afișează fereastra
    }
}
