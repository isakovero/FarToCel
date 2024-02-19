import org.example.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConverter {
    @Test
    public void testConverter() {
        Converter converter = new Converter(32);
        assertEquals(0, converter.toCelsius());

    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(36.99999237060547, Converter.kelvintoCel(310.15f));
    }
}
