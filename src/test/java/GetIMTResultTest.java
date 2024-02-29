import org.junit.Assert;
import org.junit.Test;

public class GetIMTResultTest {
        @Test
        public void iMTResultTest1()   {
    
            var actualResult = getIMTResult( 0f, 75f);
            Assert.assertEquals(" указан некорректный рост", actualResult);
        }

        @Test
        public void iMTResultTest2() {

            var actualResult = getIMTResult( 180f,  0f);
            Assert.assertEquals( " указан некорректный вес", actualResult);
        }
        @Test
        public void iMTResultTest3()   {

        var actualResult = getIMTResult( 180f, 52f);
        Assert.assertEquals(" выраженному дефициту массы тела", actualResult);
        }
        @Test
        public void iMTResultTest4()   {

        var actualResult = getIMTResult( 180f, 58f);
        Assert.assertEquals(" недостаточной массе тела", actualResult);
        }
        @Test
        public void iMTResultTest5()   {

        var actualResult = getIMTResult( 170f, 70f);
        Assert.assertEquals(" нормальной массе тела", actualResult);
        }
        @Test
        public void iMTResultTest6()   {

        var actualResult = getIMTResult( 180f, 95f);
        Assert.assertEquals(" избыточной массе тела", actualResult);
        }

        private String getIMTResult(Float heightCm, Float weightKg)
        {
            var userIndex = Math.round(weightKg / Math.pow((heightCm / 100), 2));
            String userResult = null;
            if (userIndex <= 16) {
                userResult = " выраженному дефициту массы тела";
            } else if (userIndex > 16 && userIndex < 19)  {
                userResult = " недостаточной массе тела";
            } else if (userIndex > 19 && userIndex < 25) {
                userResult = " нормальной массе тела";
            } else if (userIndex > 25) {
                userResult = " избыточной массе тела";
            }
            if (heightCm.equals(0.0f)) userResult = " указан некорректный рост";
            if (weightKg.equals(0.0f)) userResult = " указан некорректный вес";
            return userResult;

        }
}
