import exercises.Exercises;
import org.junit.Assert;
import org.junit.Test;

public class ExercisesTest {
    private Exercises exerciseTest = new Exercises();

    @Test
    public void case_1() {
        Assert.assertEquals(exerciseTest.isBalanced("{[()]}"), "YES");
    }

    @Test
    public void case_2() {
        Assert.assertEquals(exerciseTest.isBalanced("[(])"), "NO");
    }

    @Test
    public void case_3() {
        Assert.assertEquals(exerciseTest.isBalanced("[[(())]]"), "YES");
    }

    @Test
    public void case_4() {
        Assert.assertEquals(exerciseTest.isBalanced(""), "YES");
    }

    @Test
    public void case_5() {
        Assert.assertEquals(exerciseTest.isBalanced("[[]"), "NO");
    }

    @Test
    public void case_6() {
        Assert.assertEquals(exerciseTest.isBalanced("[[(({}))]]"), "YES");
    }

    @Test
    public void case_7() {
        Assert.assertEquals(exerciseTest.isBalanced("[](){}"), "YES");
    }

    @Test
    public void case_8() {
        Assert.assertEquals(exerciseTest.isBalanced("[[(({}))]]()(){}{{}}"), "YES");
    }

    @Test
    public void case_9() {
        Assert.assertEquals(exerciseTest.isBalanced("[[(({}))]]()(){}{{}"), "NO");
    }

    @Test
    public void case_10() {
        Assert.assertEquals(exerciseTest.isBalanced("()(){}{{}}]"), "NO");
    }
}
