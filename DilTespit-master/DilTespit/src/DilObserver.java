
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
public abstract class DilObserver {

    public abstract void cokluKelimeEkle(String[] list);
    public abstract void cokluKelimeVeSayiEkle(ArrayList<KelimeVeSayi> list);
    public abstract void kelimeEkle(KelimeVeSayi kelimevesayi);
    public abstract void trigramEkle(KelimeVeSayi trigram);
    public abstract void sikKelimeleriTrigramlaraAyir();
    public abstract void sirala();
    
}
