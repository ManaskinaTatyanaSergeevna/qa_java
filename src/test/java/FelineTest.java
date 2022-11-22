import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Random random = new Random();

    @Mock
    Feline feline;

    @Test
    public void meatForFelineMockTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void familyFelineMockTest() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }

    @Test
    public void youngAnimalFelineMockTest() {
        feline.getYoungAnimal(1);
        Mockito.verify(feline).getYoungAnimal(Mockito.anyInt());
    }

    @Test
    public void familyFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void youngAnimalFelineTest() {
        Feline feline = new Feline();
        int expected = random.nextInt(11);
        Assert.assertEquals(expected, feline.getYoungAnimal(expected));
    }
}
