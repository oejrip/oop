public class Lugu {
    Peaklass peaklass;
    UI ui;
    Nähtavus nähtavus;
    Mängija mängija = new Mängija(15, 15, 0, 10, 0, "");
    Vaenlane vaenlane;
    Vaenlane vaenlane1;

    public Lugu(Peaklass pk, UI kasutaja, Nähtavus n) {
        peaklass = pk;
        ui = kasutaja;
        nähtavus = n;
    }

    public void valiPosition(String järgminePosition) throws InterruptedException {
        switch (järgminePosition) {
            //konkreetsed valikud
            case "mineKaasa1": mineKaasa1();break;
            case "korda": korda();break;
            case "mineLoogika": mineLoogika();break;
            case "mineRüütlile": mineRüütlile();break;
            case "minePoodi": minePoodi();break;
            case "jääÕppima": jääÕppima();break;
            case "mata": mata();break;
            case "stat": stat();break;
            case "mineKaasa2": mineKaasa2();break;
            case "kogu": kogu();break;
            case "lõputöö": lõputöö();break;
            case "seebikas": seebikas();break;

            //kaklused
            case "kaklus1": kaklus1();break;
            case "kaklus2":kaklus2();break;
            case "kaklus3": kaklus3();break;
            case "kaklus4": kaklus4();break;
            case "kaklus5": kaklus5();break;
            case "kaklus6" : kaklus6(); break;

            //edasi-d
            case "edasi1": edasi1();break;
            case "edasi2": edasi2(); break;
            case "edasi3": edasi3();break;
            case "edasi4": edasi4();break;
            case "edasi5": edasi5();break;
            case "edasi6": edasi6();break;
            case "edasi7": edasi7();break;
            case "edasi8" : edasi8();break;
            case "edasi9" : edasi9();break;
            case "edasi10" : edasi10(); break;
            case "edasi11" : edasi11();break;
            case "edasi12" :edasi12();break;

            //lõpp
            case "lõpp" : lõpp();break;

        }
    }

    public void esimene() {

        ui.põhiTekstiAla.setText("On esimene semester sinu ülikooli elus. Linnud laulavad ja on ilus sügisene ilm. \n " +
                "Sa tutvud esimest korda oma uute kursakaaslastega ja nad kutsuvad su uue kooliaasta puhul Rüütli tänavale tähistama. \n\n" +
                "Kas lähed kaasa või kordad järgmiseks kõrgema matemaatika praktikumiks?");

        ui.valik1.setText("kaasa");
        ui.valik2.setText("kordan");

        peaklass.nextPosition1 = "mineKaasa1";
        peaklass.nextPosition2 = "korda";
    }
    //konkreetsed valikud
    public void mineKaasa1() {
        ui.põhiTekstiAla.setText("Sul oli tore, kuid niimoodi koolis kaugele ei jõua!");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi1";
        peaklass.nextPosition2 = "edasi1";

    }

    public void korda() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Oled tubli õpilane, Indrek personaalselt kiidab sind. Oled teeninud lisapunkte!");
        mängija.lisaPunktid();
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi1";
        peaklass.nextPosition2 = "edasi1";
    }

    public void mineLoogika() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Osalesid võistlusel ja teenisid sellega välja lisapunkti ning lisaks ka palju respekti oma õppejõududelt.");
        mängija.lisaPunktid();
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi3";
        peaklass.nextPosition2 = "edasi3";
    }

    public void mineRüütlile() {
        ui.põhiTekstiAla.setText("Te saite kursakaaslastega väga lähedasteks, aga seda raha ei näe sa enam kunagi...");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi3";
        peaklass.nextPosition2 = "edasi3";
    }

    public void minePoodi() {
        ui.põhiTekstiAla.setText("Teil oli tore, kuid Algebraga I oled nüüd maha jäämas");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi5";
        peaklass.nextPosition2 = "edasi5";
    }

    public void jääÕppima() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Võid enda üle uhke olla, sest õppejõud toob sinu tehtud töö praktikumis eeskujuks.");
        mängija.lisaPunktid();
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi5";
        peaklass.nextPosition2 = "edasi5";
    }

    public void mata() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Indrek Zolk isiklikult annab sulle koogi nii imelise otsuse eest!");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi7";
        peaklass.nextPosition2 = "edasi7";
    }

    public void stat() {
        ui.põhiTekstiAla.setText("Sa oled reetnud oma kursakaaslasi ning kaotasid sõpru, kuid statistika on ikka parem kui arheoloogia");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi7";
        peaklass.nextPosition2 = "edasi7";
    }

    public void mineKaasa2() {
        ui.põhiTekstiAla.setText("Kuigi sa ei mäleta õhtust väga midagi, võid kihla vedada, et parem nii ongi, sest valmistasid Indrekule pettumust.");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi9";
        peaklass.nextPosition2 = "edasi9";
    }

    public void kogu() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Su tulevane lõputöö juhendaja on kindlasti väga õnnelik, et materjale varusid. Oled lisapunkti väärt!");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi9";
        peaklass.nextPosition2 = "edasi9";
    }

    public void lõputöö() {
        mängija.lisaPunktid();
        ui.põhiTekstiAla.setText("Kuna juhendaja märkas sinu panust, kiitis ta sind ja aitas parandused ellu viia. Nii võib ju lõpetamine väga tõenäoline olla.");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi11";
        peaklass.nextPosition2 = "edasi11";
    }

    public void seebikas() {
        ui.põhiTekstiAla.setText("Nutsid nagu laps, kelle vanemad ei ole nõus kommi ostma, aga vähemalt said emotsioonid endast välja. Juhendaja saadab pahura kirja.");
        ui.valik1.setText("Edasi");
        ui.valik2.setText("");
        peaklass.nextPosition1 = "edasi11";
        peaklass.nextPosition2 = "edasi11";
    }

    //kaklused
    public void kaklus1() throws InterruptedException {
        vaenlane = new Vaenlane(peaklass, "analüütiline geomeetria", 4, 5, ui);
        try {
            vaenlane.kaklus(vaenlane, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";

            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi2";
                peaklass.nextPosition2 = "edasi2";
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void kaklus2() throws InterruptedException {
        vaenlane1 = new Vaenlane(peaklass, "ühe muutuja matemaatiline analüüs", 6, 6, ui);
        try {
            vaenlane.kaklus(vaenlane1, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";
            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane1.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi4";
                peaklass.nextPosition2 = "edasi4";
                mängija.tervene();
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void kaklus3() throws InterruptedException{
        vaenlane = new Vaenlane(peaklass, "mitme muutuja matemaatiline analüüs", 8, 7, ui);
        try {
            vaenlane.kaklus(vaenlane, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";
            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi6";
                peaklass.nextPosition2 = "edasi6";
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void kaklus4() throws InterruptedException{
        vaenlane1 = new Vaenlane(peaklass, "funktsionaalanalüüs", 10, 8, ui);
        try {
            vaenlane1.kaklus(vaenlane1, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";
            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane1.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi6";
                peaklass.nextPosition2 = "edasi6";
                mängija.tervene();
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void kaklus5() throws InterruptedException {
        vaenlane = new Vaenlane(peaklass, "motivatsiooni puudus", 12, 9, ui);
        vaenlane.kaklus(vaenlane, mängija);
        try {
            vaenlane.kaklus(vaenlane, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";
            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi10";
                peaklass.nextPosition2 = "edasi10";
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void kaklus6() throws InterruptedException {
        vaenlane1 = new Vaenlane(peaklass, "lõputöö kaitsmine", 4, 5, ui);
        try {
            vaenlane1.kaklus(vaenlane1, mängija);
            if (mängija.onElus() == false) {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Kaotasid võitluse, kahjuks on sinu jaoks mäng läbi. Vali muu eriala!");
                ui.valik1.setText("lõpp");
                ui.valik2.setText("lõpp");

                peaklass.nextPosition1 = "lõpp";
                peaklass.nextPosition2 = "lõpp";
            } else {
                ui.eluLabel.setText("Elusid: " + mängija.getElujõud());
                ui.põhiTekstiAla.setText("Tulid võitjana välja ületades oma vaenlase nimega " + vaenlane1.getNimi());
                ui.valik1.setText("Edasi");
                ui.valik2.setText("");

                peaklass.nextPosition1 = "edasi12";
                peaklass.nextPosition2 = "edasi12";
                mängija.tervene();
                mängija.üleminek();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //edasi-d
    public void edasi1() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane = new Vaenlane(peaklass, "analüütiline geomeetria", 4, 5, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus1";
        peaklass.nextPosition2 = "kaklus1";
    }
    public void edasi2() {
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("Oled üle elanud esimese semestri! Väga tubli, suur osa kukuvad juba selle ajal välja. Nüüd edasi teisele!\n " +
                "Sinu meilile ilmub kutse Deltas toimuvale loogikavõistlusele. Sa oled huvitatud, kuid kursakad kutsusid sind taas Rüütli tänavale... \n\n " +
                "Mis on sinu otsus? Lähed loogikavõistlusele või Rüütli tänavale?");
        ui.valik1.setText("loogika");
        ui.valik2.setText("rüütli");

        peaklass.nextPosition1 = "mineLoogika";
        peaklass.nextPosition2 = "mineRüütlile";

    }
    public void edasi3() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane1 = new Vaenlane(peaklass, "ühe muutuja matemaatiline analüüs", 6, 6, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane1.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus2";
        peaklass.nextPosition2 = "kaklus2";
    }
    public void edasi4() {
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("On esimene päev sinu teisel aastal ülikoolis ning saad astuda juba vanema ja targemana Deltasse. \n " +
                "Igatsed oma kursusekaaslasi ja tahad enda juures pidu korraldada, kuid tulekul on ka esimene Algebra I kodutöö. \n\n " +
                "Kas sead sammud poodi, et peoks kõike vajalikku osta või otsid välja pliiatsi ja vihiku, et õppima asuda?");
        ui.valik1.setText("poodi");
        ui.valik2.setText("õppima");

        peaklass.nextPosition1 = "minePoodi";
        peaklass.nextPosition2 = "jääÕppima";
    }

    public void edasi5() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane = new Vaenlane(peaklass, "mitme muutuja matemaatiline analüüs", 8, 7, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus3";
        peaklass.nextPosition2 = "kaklus3";
    }
    public void edasi6() {
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("Oled üle elanud kolmanda semestri! Väga tubli, paljud ei jõua isegi nii kaugele. Nüüd edasi neljandale! \n " +
                "Uus aasta, uus mina. Am I right? On viimane aeg kõrvaleriala valida. \n " +
                "Leida, et statistika oleks hea lahendus, sest saaks vaheldust puhtast matemaatikast. \n\n " +
                "Mis on sinu otsus? Lähed edasi statistikust või jääd truuks matemaatikale?");
        ui.valik1.setText("matemaatika");
        ui.valik2.setText("statistika");

        peaklass.nextPosition1 = "mata";
        peaklass.nextPosition2 = "stat";
    }

    public void edasi7() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane1 = new Vaenlane(peaklass, "funktsionaalanalüüs", 10, 8, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus4";
        peaklass.nextPosition2 = "kaklus4";
    }
    public void edasi8() {
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("Kätte on jõudnud 2 aastat oodatud aeg, viimane aasta sinu teekonnal bakalaureusekraadini.\n " +
                "Sellegipoolest, et nendest kursakaaslastest, kellega ülikooliteed alustasid, on alles vaid 3, kutsuvad nad sind tähistama ei kuhugi mujale kui Rüütli tänavale. \n\n " +
                "Kas lähed kaasa või veedad õhtupooliku kogudes materjali lõputöö jaoks?");
        ui.valik1.setText("kaasa");
        ui.valik2.setText("kogun");

        peaklass.nextPosition1 = "mineKaasa2";
        peaklass.nextPosition2 = "kogu";
    }

    public void edasi9() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane = new Vaenlane(peaklass, "motivatsiooni puudus", 12, 9, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus5";
        peaklass.nextPosition2 = "kaklus5";
    }
    public void edasi10() {
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("Viies semester kadus kui tina tuhka! Viimased pingutused! \n " +
                "Juhendaja saatis sulle pika kirja igasugu parandustega, mida lõputööl ilmselt muutma peaks. \n " +
                "Sa tead, et see on ainuõige otsus, kuid samas tundub Netflixis uue sarjaga alustamine palju ahvatlevam.\n\n " +
                "Mis on sinu otsus? Tegeled lõputööga või tutvud seebikaga?");
        ui.valik1.setText("lõputöö");
        ui.valik2.setText("seebikas");

        peaklass.nextPosition1 = "lõputöö";
        peaklass.nextPosition2 = "seebikas";
    }

    public void edasi11() {
        mängija.setElujõud(mängija.getElujõud());
        vaenlane1 = new Vaenlane(peaklass, "lõputöö kaitsmine", 4, 5, ui);
        ui.põhiTekstiAla.setText("Kohtad oma vaenlast, " + vaenlane1.getNimi() + ". Ei jää midagi muud üle, kui vastu võidelda.");
        ui.valik1.setText("Kakle");
        ui.valik2.setText("Kakle");
        peaklass.nextPosition1 = "kaklus6";
        peaklass.nextPosition2 = "kaklus6";
    }
    public void edasi12(){
        mängija.setElujõud(mängija.getElujõud());
        ui.põhiTekstiAla.setText("Palju õnne! Õnnestuski bakalaureus kätte saada!");
        ui.valik1.setText("");
        ui.valik2.setText("");

        peaklass.nextPosition1 = "";
        peaklass.nextPosition2 = "";
    }
    public void lõpp(){
        System.exit(0);
    }
}
