import com.umutavci.Bibliothek;
import com.umutavci.Buch;
import com.umutavci.Gebundenebuch;
import com.umutavci.Hoerbuch;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliothekTest {
    @Test
    public void test(){
        Buch buch1 = new Hoerbuch("A", "D", "C", 10, "D", 100);
        Buch buch2 = new Gebundenebuch("AAAA", "C", "C", 10, 200);
        Bibliothek bib = new Bibliothek();
        bib.add(List.of(buch1, buch2));
        assertEquals("D", bib.buecher.get(1).autor);
        assertEquals("C", bib.buecher.get(0).autor);

    }
}
