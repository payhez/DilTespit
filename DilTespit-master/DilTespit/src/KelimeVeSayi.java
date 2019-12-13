
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
public class KelimeVeSayi implements Comparable{
    public String kelime;
    public int sayi;
    
    public KelimeVeSayi(String kelime, int sayi){
        this.kelime = kelime;
        this.sayi = sayi;
    }
    public KelimeVeSayi(String kelime){
        this(kelime,1);
    }

    @Override
    public int compareTo(Object o) {
        KelimeVeSayi other = (KelimeVeSayi)o;
        if(this.sayi<other.sayi)
            return -1;
        else if(this.sayi>other.sayi)
            return 1;
        else
            return 0;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.kelime);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KelimeVeSayi other = (KelimeVeSayi) obj;
        if (!Objects.equals(this.kelime, other.kelime)) {
            return false;
        }
        return true;
    }

    
}