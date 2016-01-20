package jfame;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

public class TestMainPage extends TestCase{
	
	public void testMainPageConstructor() {
		try{
			new MainPage();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

}
