import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RainWaterTest {

    private RainWater capacity;

    @Before
    public void setup() {
        capacity = new RainWater();
    }

    @Test
    public void rainTest1() {
        Integer[] array = new Integer[] {6, 0, 4, 0, 6};
        int expected = 14;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest2() {
        Integer[] array = new Integer[] {7, 4, 0, 7};
        int expected = 10;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest3() {
        Integer[] array = new Integer[] {7, 4, 16, 2};
        int expected = 3;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest4() {
        Integer[] array = new Integer[] {1, 0, 1, 2, 3, 1, 4};
        int expected = 3;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest5() {
        Integer[] array = new Integer[] {21, 8, 8, 12};
        int expected = 8;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest6() {
        Integer[] array = new Integer[] {6, 9, 9};
        int expected = 0;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest7() {
        Integer[] array = new Integer[] {2, 0, 2};
        int expected = 2;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest8() {
        Integer[] array = new Integer[] {3, 0, 0, 2, 0, 4};
        int expected = 10;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest9() {
        Integer[] array = new Integer[] {0, 3, 1, 1, 3, 2, 8};
        int expected = 5;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rainTest10() {
        Integer[] array = new Integer[] {3, 15, 4, 7, 0, 2, 8};
        int expected = 19;
        int actual = capacity.getCapacity(array);
        Assert.assertEquals(expected, actual);
    }
}
