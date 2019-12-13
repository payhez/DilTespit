
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mergehez
 */
public class DilList {
    ArrayList<Dil> diller;
    DilIslemler di;
    public DilList(){
        diller = new ArrayList<>();
        di = new DilIslemler();
    }
    public void ekle(Dil dil){
        diller.add(dil);
    }
    public DilSonuc dilBul(Dil dil){
        DilSonuc gecici = new DilSonuc("BULUNAMADI", -1);
        for(Dil dl : diller){
            DilSonuc sonuc = dl.getDilSonuc(dil);
            if(sonuc.compareTo(gecici)==1)
                gecici = sonuc;
        }
        return gecici;
    }
}
