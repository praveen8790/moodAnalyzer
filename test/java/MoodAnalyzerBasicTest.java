import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerBasicTest {
    @Test
    public void test_1() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer("i am in sad mood");
        Assert.assertEquals("Sad",mood.analyseMood());
    }
    @Test
    public void test_2() throws MoodAnalyzerException {
        MoodAnalyzer mood = new MoodAnalyzer(null);
        Assert.assertEquals("Happy",mood.analyseMood());

    }

}
