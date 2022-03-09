package com.example.junittestspr;

import org.junit.Assert;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Checker c = new Checker();
    API_Class api = new API_Class();

    @Test
    public void CheckTrueLogin() {
        Assert.assertTrue(c.checkLogin("trueLogin"));
    }

    @Test
    public void CheckFalseLogin() {
        Assert.assertFalse(c.checkLogin("fl"));
    }

    @Test
    public void CheckTrueEmail() {
        Assert.assertTrue(c.checkEmail("trueEmail@true.tr"));
    }

    @Test
    public void CheckFalseEmail() {
        Assert.assertFalse(c.checkEmail("falseEmail@false"));
    }

    @Test
    public void CheckTruePassword() {
        Assert.assertTrue(c.checkPassword("p@SSW0rd"));
    }

    @Test
    public void CheckFalsePassword() {
        Assert.assertFalse(c.checkEmail("password"));
    }

    @Test
    public void CheckTrueAPISend() {
        Assert.assertTrue(api.postData("https://cakeapi.trinitytuts.com/api/add", "log","email@email.com","P@$sw0rd"));
    }

    @Test
    public void CheckFalseAPISend() {
        Assert.assertFalse(api.postData("https://check.ru", "log","email@email.com","P@$sw0rd"));
    }
}