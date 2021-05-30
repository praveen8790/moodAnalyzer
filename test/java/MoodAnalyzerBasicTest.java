import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerBasicTest {
    @Test
    public void test_1(){
        MoodAnalyzer mood = new MoodAnalyzer("i am in sad mood");
        Assert.assertEquals("Sad",mood.analyseMood());
    }
    @Test
    public void test_2(){
        MoodAnalyzer mood = new MoodAnalyzer("i am in happy mood");
        Assert.assertEquals("Happy",mood.analyseMood());

    }

}
