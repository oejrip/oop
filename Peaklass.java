import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Peaklass {
    ValikuteTegija valikuteTegija = new ValikuteTegija();
    UI ui = new UI();
    Nähtavus nähtavus = new Nähtavus(ui);
    Lugu lugu = new Lugu(this, ui, nähtavus);
    String nextPosition1, nextPosition2;
    Vaenlane vaenlane;
    Mängija mängija;
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedAudioFileException, LineUnavailableException {
        //TODO MÄNGUSELETAV EKRAAN ; PABERITÖÖ ;

        //taustamuusika
/*
        File file = new File("Muss.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

 */

        new Peaklass ();
    }
    public Peaklass(){
        ui.createUI(valikuteTegija);
        nähtavus.näitaTiitlit();
    }
    public class ValikuteTegija implements ActionListener {
        public void actionPerformed(ActionEvent event){
            String sinuValik = event.getActionCommand();

            switch(sinuValik){
                case"Alusta":nähtavus.näitaMängu(); lugu.esimene(); break;
                case"v1":
                    try {
                        lugu.valiPosition(nextPosition1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case"v2":
                    try {
                        lugu.valiPosition(nextPosition2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }
}
