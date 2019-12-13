
import java.util.ArrayList;

public class KrDil extends Dil{

    static String dil = "KÜRTÇE";
    public KrDil(ArrayList<KelimeVeSayi> kelimevesayilar) {
        super(kelimevesayilar);
    }

    public KrDil() {
    }

    @Override
    DilSonuc getDilSonuc(Dil dil) {
        double range = js.getSimilarityOfDils(dil, this);
        return new DilSonuc(KrDil.dil,range);
    }
    
}
