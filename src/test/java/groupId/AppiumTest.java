package groupId;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	public void nativeAppAndroid(){
	System.out.println("nativeAppAndroid");	
	}
	
	@Test
	public void IOSApps(){
	System.out.println("IOSApps");
	}
	
	@Test
	public void ME(){
	System.out.println("I");
	}
	
	@BeforeTest
	public void Iam(){
	System.out.println("I");
	}

}
