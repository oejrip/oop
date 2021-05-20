import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Vaenlane {
    Peaklass peaklass;
    private String nimi;
    private int eluJõud;
    private int kahju;
    UI ui;

    public Vaenlane(Peaklass pk, String nimi, int eluJõud, int kahju, UI kasutaja) {
        pk = peaklass;
        ui = kasutaja;
        this.nimi = nimi;
        this.eluJõud = eluJõud;
        this.kahju = kahju;
    }

    public String getNimi() {
        return nimi;
    }

    public int getEluJõud() {
        return eluJõud;
    }

    public void setEluJõud(int eluJõud) {
        this.eluJõud = eluJõud;
    }

    public int getKahju() {
        return (int) (Math.random() * kahju);
    }

    public boolean onElus() {
        if (eluJõud > 0) {
            return true;
        }
        return false;
    }

    public void kaklus(Vaenlane vaenlane, Mängija mängija) throws InterruptedException {
        List<String> kakluseTekst = new ArrayList<>();
        do {
            int rünnak = vaenlane.getKahju();
            int mängRünnak = mängija.getRünnak();
            String a = "Pahalane ründab sind ning vähendab su elujõudu " + rünnak + " võrra." + "\n" + "Sa hakkad vastu ja ründad oma teadmistega vastu ning teed talle viga " + mängRünnak + " võrra.";
            kakluseTekst.add(a);
            mängija.setElujõud(mängija.getElujõud() - rünnak);
            vaenlane.setEluJõud(vaenlane.getEluJõud() - mängRünnak);
        }
        while (vaenlane.onElus() == true && mängija.onElus() == true);
        try {
            salvestaKaklus("Kaklus " + vaenlane.getNimi() + "-ga.sav", kakluseTekst);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void salvestaKaklus(String failinimi, List<String> tekst) throws FileNotFoundException {
        FileOutputStream fileStream = new FileOutputStream(new File(failinimi));
        try {
            OutputStreamWriter writer = new OutputStreamWriter(fileStream, "UTF-8");
            for(String sõna : tekst) {
                writer.write(sõna + "\n");
            }
            writer.close();
            System.out.println("Level on salvestatud!:-)");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("Tekkis error.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Tekkis error.");
        }
        try {
            fileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Tekkis error.");
        }

    }
}
