
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
public class JaccardSimilarity {
    KelimeVeSayilarIterator it;
    public JaccardSimilarity(){}
    
    private double getSimilarityRange(ArrayList<KelimeVeSayi> list1, ArrayList<KelimeVeSayi> list2){
        ArrayList<KelimeVeSayi> ayniOlanlar = new ArrayList<>();
        
        ArrayList<KelimeVeSayi> kisaOlan = list1;
        ArrayList<KelimeVeSayi> uzunOlan = list2;
        double uzunluk = list1.size();
        if(list2.size()<list1.size()) {
            uzunluk = list2.size();
            kisaOlan = list2;
            uzunOlan = list1;
        }
        for(int i=0; i<uzunluk; i++){
            if(uzunOlan.contains(kisaOlan.get(i))){
                ayniOlanlar.add(kisaOlan.get(i));
            }
        }
        double toplamSayi = kisaOlan.size()/*+uzunOlan.size()-ayniOlanlar.size()*/;
        
        return ayniOlanlar.size()/toplamSayi;
    }
    public double getSimilarityOfDils(Dil dil1, Dil dil2){
        ArrayList<KelimeVeSayi>  obj1 = new ArrayList<>();
        ArrayList<KelimeVeSayi>  obj2 = new ArrayList<>();
        
        it = new KelimeVeSayilarIterator(dil1.collection);
        while (it.hasNext(it.SIKKELIME))
            obj1.add((KelimeVeSayi)it.next(it.SIKKELIME));
        while (it.hasNext(it.TRIGRAM))   
            obj1.add((KelimeVeSayi)it.next(it.TRIGRAM));
        
        it = new KelimeVeSayilarIterator(dil2.collection);
        while (it.hasNext(it.SIKKELIME))   
            obj2.add((KelimeVeSayi)it.next(it.SIKKELIME));
        while (it.hasNext(it.TRIGRAM))   
            obj2.add((KelimeVeSayi)it.next(it.TRIGRAM));
        System.out.println(dil1+"-sayi: "+obj1.size());
        System.out.println(dil2+"-sayi: "+obj2.size());
        return getSimilarityRange(obj1,obj2);
    }
}
