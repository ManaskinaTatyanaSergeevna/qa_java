import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline felineMock;

    @Mock
    Lion lionMock;

    @Test
    public void lionKittensWithFelineMockTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        lion.getKittens();
        Mockito.verify(felineMock, Mockito.times(1)).getYoungAnimal(Mockito.anyInt());
    }
    @Test
    public void foodForLionWithFelineMockTest() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        lion.getFood();
        lion.getFood();
        Mockito.verify(felineMock, Mockito.times(2)).eatMeat();
    }

    @Test
    public void lionMockHaveManeTest() {
        lionMock.doesHaveMane();
        Mockito.verify(lionMock).doesHaveMane();

    }
}
