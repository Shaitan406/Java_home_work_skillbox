import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTicetReturn {
    @Test
    public void domzadanie1() {

        long actualResult = getRefundTicketPricePercent(100, true, true);
        Assert.assertEquals( 100, actualResult);
    }
    @Test
    public void domzadanie2() {

        long actualResult = getRefundTicketPricePercent(250, false,false);
        Assert.assertEquals(100, actualResult);
    }
    @Test
    public void domzadanie3() {

        long actualResult = getRefundTicketPricePercent(240, false,false);
        Assert.assertEquals(50, actualResult);
    }
    @Test
    public void domzadanie4() {

        long actualResult = getRefundTicketPricePercent(4, false,false);
        Assert.assertEquals(30, actualResult);
    }
    @Test
    public void domzadanie5() {

        long actualResult = getRefundTicketPricePercent(3, false,false);
        Assert.assertEquals(0, actualResult);
    }
    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)
    {

        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert>240) return 100;
        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
        return 0;
    }
}
