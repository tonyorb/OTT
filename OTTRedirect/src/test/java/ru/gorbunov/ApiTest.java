package ru.gorbunov;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApiTest extends BasicActions{
	@Test
    public void redirectTest()
    {
		String actualRedirectLocation = GetRedirectLocationFrom(Config.baseUrl);
		Assert.assertEquals("Redirect Location не совпадает с ожидаемой",
				Config.expectedRedirectUrl, actualRedirectLocation);
    }

	@Before
	public void disableWarning() {
	    System.err.close();
	    System.setErr(System.out);
	}
}
