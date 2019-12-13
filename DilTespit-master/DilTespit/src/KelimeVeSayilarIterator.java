
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mergehez
 */
public class KelimeVeSayilarIterator implements  Iterator{
    int index=0, index2=0, index3=0;
    int KELIMEVESAYI = 1, TRIGRAM = 2, SIKKELIME = 3;
    KelimeVeSayiCollection collection;
    public KelimeVeSayilarIterator(KelimeVeSayiCollection list){
        this.collection = list;
    }
      @Override
      public boolean hasNext(int which) {
          if(which == KELIMEVESAYI)
              return index <collection.kelimevesayilar.size();
          else if(which == TRIGRAM)
              return index2<collection.trigramlar.size();
          else if(which == SIKKELIME)
              return index3 <collection.sıkKelimeler.size();
          else return false;
      }

      @Override
      public Object next(int which) {
      
        if(!this.hasNext(which)) 
            return  null;
        
        if(which == KELIMEVESAYI)
            return collection.kelimevesayilar.get(index++);
        else if(which == TRIGRAM)
            return collection.trigramlar.get(index2++);
        else if(which == SIKKELIME)
            return collection.sıkKelimeler.get(index3++);
        else return null;
      }		
}
