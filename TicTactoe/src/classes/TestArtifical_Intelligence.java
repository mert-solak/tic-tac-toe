package classes;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Test;

import jfame.PlayingPage;

public class TestArtifical_Intelligence extends TestCase{
	PlayingPage p1 = new PlayingPage();
	Artifical_Intelligence aTest = new Artifical_Intelligence();
	public void testConstructor(){
		try{
			new Artifical_Intelligence();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}

	public void testParametric() {
		try{
			new Artifical_Intelligence(p1);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testsetFirstMove(){
		aTest.setFirstMove(10);
		assertEquals(10,aTest.getFirstMove());
	}
	public void testgetFirstMove(){
		aTest.setFirstMove(10);
		assertEquals(10,aTest.getFirstMove());
	}
	public void testsetSecondMove(){
		aTest.setSecondMove(10);
		assertEquals(10,aTest.getSecondMove());
	}
	public void testgetSecondMove(){
		aTest.setSecondMove(10);
		assertEquals(10,aTest.getSecondMove());
	}
	public void testsetThirdMove(){
		aTest.setThirdMove(10);
		assertEquals(10,aTest.getThirdMove());
	}
	public void testgetThirdMove(){
		aTest.setThirdMove(10);
		assertEquals(10,aTest.getThirdMove());
	}
	public void testsetFourthMove(){
		aTest.setFourthMove(10);
		assertEquals(10,aTest.getFourthMove());
	}
	public void testgetFourthMove(){
		aTest.setFourthMove(10);
		assertEquals(10,aTest.getFourthMove());
	}
	public void testsetFifthMove(){
		aTest.setFifthMove(10);
		assertEquals(10,aTest.getFifthMove());
	}
	public void testgetFifthMove(){
		aTest.setFifthMove(10);
		assertEquals(10,aTest.getFifthMove());
	}
	public void testsetSixthMove(){
		aTest.setSixthMove(10);
		assertEquals(10,aTest.getSixthMove());
	}
	public void testgetSixthMove(){
		aTest.setSixthMove(10);
		assertEquals(10,aTest.getSixthMove());
	}
	public void testsetHardness(){
		aTest.setHardness("10");
		assertEquals("10",aTest.getHardness());
	}
	public void testgetHardness(){
		aTest.setHardness("10");
		assertEquals("10",aTest.getHardness());
	}
	public void testResetLine(){
		int value = 0;
	}

}
