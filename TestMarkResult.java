import org.junit.Assert;
import org.junit.Test;

public class TestMarkResult {
    @Test
    public void testMark1() {
        var actualResult = getMarkResult(0);
        Assert.assertEquals("2", actualResult);

    }
    @Test
    public void testMark2() {
        var actualResult = getMarkResult(35);
        Assert.assertEquals("2", actualResult);
    }
    @Test
    public void testMark3() {
        var actualResult = getMarkResult(36);
        Assert.assertEquals("3", actualResult);
    }
    @Test
    public void TestMark4() {
        var actualResult = getMarkResult(56);
        Assert.assertEquals( "3", actualResult);
    }
    @Test
    public void TestMark5() {
        var actualResult = getMarkResult(57);
        Assert.assertEquals( "4" , actualResult);
    }
    @Test
    public void TestMark6() {
        var actualResult = getMarkResult(71);
        Assert.assertEquals("4", actualResult);
    }
    @Test
    public void TestMark7() {
        var actualResult = getMarkResult(72);
        Assert.assertEquals("5" , actualResult);
    }
    @Test
    public void TestMark8() {
        var actualResult = getMarkResult(100);
        Assert.assertEquals("5" , actualResult);
    }
    @Test
    public void TestMark9() {
        var actualResult = getMarkResult(-1);
        Assert.assertEquals("no mark result" , actualResult);
    }
    @Test
    public void TestMark10() {
        var actualResult = getMarkResult(110);
        Assert.assertEquals("no mark result" , actualResult);
    }

    private String getMarkResult(Integer mark) {
        if (mark >= 0 && mark <= 35) return "2";
        if (mark >= 36 && mark <= 56) return "3";
        if (mark >= 56 && mark <= 71) return "4";
        if (mark >= 72 && mark <= 100) return "5";
        return "no mark result";
    }
}