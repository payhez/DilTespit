
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
public class KelimeVeSayiCollection {
    ArrayList<KelimeVeSayi> kelimevesayilar;
    ArrayList<KelimeVeSayi> trigramlar;
    ArrayList<KelimeVeSayi> sıkKelimeler;
    public KelimeVeSayiCollection(ArrayList<KelimeVeSayi> kelimevesayilar,ArrayList<KelimeVeSayi> trigramlar, ArrayList<KelimeVeSayi> sıkkelimeler){
        this.trigramlar = trigramlar;
        this.kelimevesayilar = kelimevesayilar;
        this.sıkKelimeler = sıkkelimeler;
    }
}
