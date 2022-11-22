import com.example.AlexLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    AlexLion alexLion;

    @Mock
    Feline feline;

    @Test
    public void alexLionFriendsMockTest() {
        alexLion.getFriends();
        Mockito.verify(alexLion).getFriends();
    }

    @Test
    public void alexLionKittensMockTest() {
        alexLion.getKittens();
        Mockito.verify(alexLion).getKittens();
    }

    @Test
    public void alexLionPlaceOfLivingMockTest() {
        alexLion.getPlaceOfLiving();
        Mockito.verify(alexLion).getPlaceOfLiving();
    }

    @Test
    public void alexLionHaveManeMockTest() {
        alexLion.doesHaveMane();
        Mockito.verify(alexLion).doesHaveMane();
    }

    @Test
    public void friendsAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alexLion.getFriends());
    }

    @Test
    public void kittensAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        Assert.assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void placeOfLivingAlexLionTest() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void felineAlexLionMockTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        alexLion.getFood();
        Mockito.verify(feline).eatMeat();
    }
}
