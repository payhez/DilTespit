
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mergehez
 */
public class TrDil extends Dil{
    static String dil = "TÜRKÇE";
    public TrDil(ArrayList<KelimeVeSayi> kelimevesayilar){
        super(kelimevesayilar);
    }

    public TrDil(){
    }

    @Override
    DilSonuc getDilSonuc(Dil dil) {
        double range = js.getSimilarityOfDils(dil, this);
        return new DilSonuc(TrDil.dil,range);
    }
    
}
