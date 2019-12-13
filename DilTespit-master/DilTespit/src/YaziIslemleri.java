/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mergehez
 */
public class YaziIslemleri implements Islem{
    @Override
    public Dil doIslemYazi(String metin) {
        String[] kelimeler = metin.split(" ");
        Dil dil = new EngDil();//Dillerden birini seçmek için, Eng olması farketmiyor..
        dil.cokluKelimeEkle(kelimeler);
        dil.sirala();
        dil.sikKelimeleriTrigramlaraAyir();
        return dil;
    }

    @Override
    public String doIslemHttp(String link) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dil doIslemDil(String dil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
