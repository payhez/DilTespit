
public class DilIslemler implements Islem{
    
    
    public String eng="İNGLİZCE", tr="TÜRKÇE", kr="KÜRTÇE";
    private final String[] urlEng = {"https://en.wikipedia.org/wiki/English_language",
                            "https://en.wikipedia.org/wiki/Film",
                            "https://en.wikipedia.org/wiki/United_Kingdom",
                            "https://en.wikipedia.org/wiki/Irish_Republican_Army_(1917%E2%80%9322)",
                            "https://en.wikipedia.org/wiki/Richard_Dawkins"/*,
                            "https://en.wikipedia.org/wiki/The_Grapes_of_Wrath",
                            "https://en.wikipedia.org/wiki/2001:_A_Space_Odyssey",
                            "https://en.wikipedia.org/wiki/Keyboard_instrument",
                            "https://en.wikipedia.org/wiki/Topic_and_comment",
                            "https://en.wikipedia.org/wiki/Table_(furniture)"*/};
    private final String[] urlTr = {"https://tr.wikipedia.org/wiki/Masa",
                            "https://tr.wikipedia.org/wiki/T%C3%BCrk%C3%A7e",
                            "https://tr.wikipedia.org/wiki/N%C3%A2z%C4%B1m_Hikmet",
                            "https://tr.wikipedia.org/wiki/Masumiyet_M%C3%BCzesi",
                            "https://tr.wikipedia.org/wiki/Yol_(film)"/*,
                            "https://tr.wikipedia.org/wiki/T%C3%BCrkiye",
                            "https://tr.wikipedia.org/wiki/T%C3%BCrkiye_Kom%C3%BCnist_Partisi_(1920)",
                            "https://tr.wikipedia.org/wiki/Cem_Karaca",
                            "https://tr.wikipedia.org/wiki/Divan_edebiyat%C4%B1",
                            "https://tr.wikipedia.org/wiki/K%C4%B1r%C5%9Fehir"*/};
    private final String[] urlKr = {"https://ku.wikipedia.org/wiki/Kurdistan",
                            "https://ku.wikipedia.org/wiki/Ziman%C3%AA_kurd%C3%AE",
                            "https://ku.wikipedia.org/wiki/D%C3%AArika_%C3%87iyay%C3%AA_Maz%C3%AE",
                            "https://ku.wikipedia.org/wiki/Med_%C3%BB_Medya",
                            "https://ku.wikipedia.org/wiki/Dengb%C3%AAj%C3%AE",
                            "https://ku.wikipedia.org/wiki/Tir%C5%9Fik",
                            "https://ku.wikipedia.org/wiki/S%C3%AEnema",
                            "https://ku.wikipedia.org/wiki/Charlie_Chaplin",
                            "https://ku.wikipedia.org/wiki/Kaway%C3%AA_Hesinker",
                            "https://ku.wikipedia.org/wiki/%C3%8Eslam",
                            "https://ku.wikipedia.org/wiki/Wan"/*,
                            "https://ku.wikipedia.org/wiki/Xelfet%C3%AE_(nav%C3%A7e)",
                            "https://ku.wikipedia.org/wiki/P%C3%AAjgeha_kurd",
                            "https://ku.wikipedia.org/wiki/Mohsen_Namjoo",*/};
    Islem islem;
    public DilIslemler(){
        islem = new HttpIslemleri();
    }
    public Dil engDilAl(){
        Dil dil = new EngDil();
        for (String urlEng1 : urlEng) 
            dil.cokluKelimeEkle(islem.doIslemHttp(urlEng1).split(" "));
        return dilSonIslemler(dil);
    }
    public Dil trDilAl(){
        Dil dil = new TrDil();
        for (String urlTr1 : urlTr) 
            dil.cokluKelimeEkle(islem.doIslemHttp(urlTr1).split(" "));//.split(" ")
        return dilSonIslemler(dil);
    }
    public Dil krDilAl(){
        Dil dil = new KrDil();
        for (String urlKr1 : urlKr) 
            dil.cokluKelimeEkle(islem.doIslemHttp(urlKr1).split(" "));//.split(" ")
        return dilSonIslemler(dil);
    }
    public Dil dilSonIslemler(Dil dil){
        dil.sirala();
        dil.sikKelimeleriTrigramlaraAyir();
        return dil;
    }


    @Override
    public Dil doIslemDil(String dil) {
        if(dil.equalsIgnoreCase(eng))
            return engDilAl();
        else if(dil.equalsIgnoreCase(tr))
            return trDilAl();
        else if(dil.equalsIgnoreCase(kr))
            return krDilAl();
        else 
            return null;
    }

    @Override
    public String doIslemHttp(String link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dil doIslemYazi(String metin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
