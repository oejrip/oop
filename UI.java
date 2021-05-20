import java.awt.*;
import javax.swing.*;

public class UI {
    JFrame aken;
    JPanel tiitel, startButtonPanel, põhiTekstPanel, valikuButtonPanel, mängijaPanel;
    JLabel tiitelLabel,eluLabel,eluNumberLabel;
    JButton startNupp, valik1,valik2;
    JTextArea põhiTekstiAla;
    Font normalFont = new Font("Comic Sans MS",Font.PLAIN,20);
    Font tiitelFont = new Font("Comic Sans MS",Font.PLAIN,40);
    Mängija mängija = new Mängija(15, 15, 0, 10,0, "");

    public void createUI(Peaklass.ValikuteTegija valikuteTegija){
        //aken
        aken = new JFrame();
        aken.setSize(800,600);
        aken.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aken.getContentPane().setBackground(Color.pink);
        aken.setLayout(null);
        aken.setResizable(false);

        //tiitelleht
        tiitel = new JPanel();
        tiitel.setBounds(100,100,600,500);
        tiitel.setBackground(Color.pink);
        tiitelLabel = new JLabel("Matemaatika bakalaureuse mäng");
        tiitelLabel.setForeground(Color.white);
        tiitelLabel.setFont(tiitelFont);
        tiitel.add(tiitelLabel);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.pink);
        startNupp = new JButton("Alusta");
        startNupp.setBackground(Color.white);
        startNupp.setForeground(Color.pink);
        startNupp.setFont(normalFont);
        startNupp.setFocusPainted(false);
        startNupp.addActionListener(valikuteTegija);
        startNupp.setActionCommand("Alusta");
        startButtonPanel.add(startNupp);

        aken.add(tiitel);
        aken.add(startButtonPanel);

        //mängu aken
        põhiTekstPanel = new JPanel();
        põhiTekstPanel.setBounds(100,100,600,250);
        põhiTekstPanel.setBackground(Color.pink);
        aken.add(põhiTekstPanel);

        põhiTekstiAla = new JTextArea("Siin on mingi tekst");
        põhiTekstiAla.setBounds(100,100,600,250);
        põhiTekstiAla.setBackground(Color.pink);
        põhiTekstiAla.setForeground(Color.white);
        põhiTekstiAla.setFont(normalFont);
        põhiTekstiAla.setLineWrap(true);
        põhiTekstiAla.setWrapStyleWord(true);
        põhiTekstiAla.setEditable(false);
        põhiTekstPanel.add(põhiTekstiAla);

        valikuButtonPanel = new JPanel();
        valikuButtonPanel.setBounds(250,350,300,150);
        valikuButtonPanel.setBackground(Color.pink);
        valikuButtonPanel.setLayout(new GridLayout(4,1));
        aken.add(valikuButtonPanel);

        valik1 = new JButton("valik1");
        valik1.setBackground(Color.white);
        valik1.setForeground(Color.pink);
        valik1.setFont(normalFont);
        valik1.setFocusPainted(false);
        valik1.addActionListener(valikuteTegija);
        valik1.setActionCommand("v1");
        valikuButtonPanel.add(valik1);

        valik2 = new JButton("valik2");
        valik2.setBackground(Color.white);
        valik2.setForeground(Color.pink);
        valik2.setFont(normalFont);
        valik2.setFocusPainted(false);
        valik2.addActionListener(valikuteTegija);
        valik2.setActionCommand("v2");
        valikuButtonPanel.add(valik2);

        mängijaPanel = new JPanel();
        mängijaPanel.setBounds(100,15,600,50);
        mängijaPanel.setBackground(Color.pink);
        mängijaPanel.setLayout(new GridLayout(1,4));
        aken.add(mängijaPanel);

        eluLabel = new JLabel("Elusid: " + mängija.getElujõud());
        eluLabel.setFont(normalFont);
        eluLabel.setForeground(Color.white);
        mängijaPanel.add(eluLabel);
        eluNumberLabel = new JLabel();
        eluNumberLabel.setForeground(Color.white);
        eluNumberLabel.setFont(normalFont);
        mängijaPanel.add(eluNumberLabel);

        aken.setVisible(true);
    }
}
