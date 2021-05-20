public class Nähtavus {
    UI ui;
    public Nähtavus(UI kasutaja){
        ui = kasutaja;
    }
    public void näitaTiitlit(){
        //Näitame tiitli ekraani
        ui.tiitel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

        //Peidame mängu ekraani
        ui.põhiTekstiAla.setVisible(false);
        ui.valikuButtonPanel.setVisible(false);
        ui.mängijaPanel.setVisible(false);
    }
    public void näitaMängu(){
        //Peidame tiitli ekraani
        ui.tiitel.setVisible(false);
        ui.startButtonPanel.setVisible(false);

        //Näitame mängu ekraani
        ui.põhiTekstiAla.setVisible(true);
        ui.valikuButtonPanel.setVisible(true);
        ui.mängijaPanel.setVisible(true);
    }
}
