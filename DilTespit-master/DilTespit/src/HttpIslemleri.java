
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HttpIslemleri implements Islem{
    @Override
    public String doIslemHttp(String link) {
        String result="";
        try {
            Document doc=Jsoup.connect(link).get();
            Elements elements = doc.select("p");
            for(Element el : elements)
                result +=el.text()+" ";
        } catch (IOException ex) {
            Logger.getLogger(HttpIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public Dil doIslemDil(String dil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dil doIslemYazi(String metin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
