import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class EnigmaTest {
    @Test
    public void testLio() {
        String text = "Suche nach einem roten Stift";
        text = text.toUpperCase();
        ausgabe(text);

        String verschluesselt = "";
        for (char buchstabe : text.toCharArray()) {
            if (buchstabe == ' ') {
                verschluesselt = verschluesselt + " ";
            } else {

                int zeichen = (int) buchstabe - 1;

                if (zeichen > 90) {
                    zeichen = zeichen - 26;
                }
                if (zeichen < 65) {
                    zeichen = zeichen + 26;
                }
                verschluesselt = verschluesselt + (char) zeichen;
            }
        }
        ausgabe(verschluesselt);
    }

    public void ausgabe(String text) {
        System.out.println(text);
    }
}
