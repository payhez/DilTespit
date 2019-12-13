
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mergehez
 */
public abstract class Dil extends DilObserver{
    JaccardSimilarity js = new JaccardSimilarity();
    public KelimeVeSayiCollection collection;
    abstract DilSonuc getDilSonuc(Dil dil);
    private boolean sorted = false;
    DilSonuc dilSonuc;
    KelimeVeSayilarIterator it;
    
    public Dil(ArrayList<KelimeVeSayi> kelimevesayilar){
        collection  = new KelimeVeSayiCollection(kelimevesayilar, new ArrayList<KelimeVeSayi>(), new ArrayList<KelimeVeSayi>());
    }

    public Dil() {
        collection  = new KelimeVeSayiCollection(new ArrayList<KelimeVeSayi>(), new ArrayList<KelimeVeSayi>(), new ArrayList<KelimeVeSayi>());
    }
    @Override
    public void cokluKelimeEkle(String[] list){
        for(String k : list)
            kelimeEkle(new KelimeVeSayi(k));
    }
    @Override
    public void cokluKelimeVeSayiEkle(ArrayList<KelimeVeSayi> list){
        for(KelimeVeSayi ks : list)
            kelimeEkle(ks);
    }
    @Override
    public void kelimeEkle(KelimeVeSayi kelimevesayi){
        if(collection.kelimevesayilar.contains(kelimevesayi))
            collection.kelimevesayilar.get(collection.kelimevesayilar.lastIndexOf(kelimevesayi)).sayi++;
        else
            collection.kelimevesayilar.add(kelimevesayi);
    }
    @Override
    public void trigramEkle(KelimeVeSayi trigram){
        if(collection.trigramlar.contains(trigram))
            collection.trigramlar.get(collection.trigramlar.lastIndexOf(trigram)).sayi++;
        else
            collection.trigramlar.add(trigram);
    }    
    @Override
    public void sikKelimeleriTrigramlaraAyir(){
        if(!sorted) sirala();
        it = new KelimeVeSayilarIterator(collection);
        for(int i=0; it.hasNext(it.KELIMEVESAYI); i++){
            String kelime = "_"+((KelimeVeSayi)it.next(it.KELIMEVESAYI)).kelime+"_";
            for(int j=0; j < kelime.length()-2; j++){
                trigramEkle(new KelimeVeSayi(kelime.substring(j,j+3)));
            }
        }
    }
    @Override
    public void sirala(){
        Collections.sort(collection.kelimevesayilar);
        it = new KelimeVeSayilarIterator(collection);
        for(int i=0; it.hasNext(it.KELIMEVESAYI) &&  i<50; i++)
            collection.sıkKelimeler.add((KelimeVeSayi)it.next(it.KELIMEVESAYI));
        sorted = true;
    }

}
