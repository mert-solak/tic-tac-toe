package jfame;

import static org.junit.Assert.*;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import junit.framework.TestCase;
import org.junit.Test;

public class TestMultiPlayer extends TestCase {
	MultiPlayer mTest = new MultiPlayer();
	public JRadioButton jBtn2 = null;
	public JTextField jTx = null;
	
	public void testMultiConstructor() {
		try{
			new MultiPlayer();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testgetRadioButtonX(){
		mTest.setRadioButtonX(jBtn2);
		assertEquals(jBtn2,mTest.getRadioButtonX());
	}
	public void testsetRadioButtonX(){
		JRadioButton jrd = null;
		mTest.setRadioButtonX(jrd);
		assertEquals(jBtn2,jrd);
	}
	public void testgetRadioButtonO(){
		mTest.setRadioButtonO(jBtn2);
		assertEquals(jBtn2,mTest.getRadioButtonO());
	}
	public void testsetRadioButtonO(){
		JRadioButton jrd = null;
		mTest.setRadioButtonO(jrd);
		assertEquals(jBtn2,jrd);
	}
	public void testsetxTextField(){
		JTextField jText = null;
		mTest.setxTextField(jText);
		assertEquals(jTx,jText);
	}
	public void testgetxTextField(){
		mTest.setxTextField(jTx);
		assertEquals(jTx,mTest.getxTextField());
	}
	public void testgetoTextField(){
		mTest.setoTextField(jTx);
		assertEquals(jTx,mTest.getoTextField());
	}
	public void testsetoTextField(){
		JTextField jText = null;
		mTest.setoTextField(jText);
		assertEquals(jTx,jText);
	}
	

}
