
public class DilSonuc implements Comparable<Object>{
    public String dil; 
    public double range;

    public DilSonuc(String dil, double encam) {
        this.dil = dil;
        this.range = encam;
    }

    @Override
    public int compareTo(Object o) {
        DilSonuc other = (DilSonuc)o;
        if(this.range <other.range)
            return -1;
        else if(this.range>other.range)
            return 1;
        else return 0;
    }
    
}
