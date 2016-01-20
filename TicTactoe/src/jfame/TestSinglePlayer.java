package jfame;

import static org.junit.Assert.*;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import junit.framework.TestCase;
import org.junit.Test;

public class TestSinglePlayer extends TestCase {
	SinglePlayer sTest = new SinglePlayer();
	public JTextField jtextField; 
	public JRadioButton jBtn = null;

	public void testSingleConstructor() {
		try{
			new SinglePlayer();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public final void testsetTextField(JTextField jtextField){
		sTest.setTextField(jtextField);
		assertEquals(jtextField,sTest.getTextField());
	}
	public final void testgetTextField(){
		sTest.setTextField(jtextField);
		assertEquals(jtextField,sTest.getTextField());
	}
	public void testsetRdbtnEasy(){
		sTest.setRdbtnEasy(jBtn);
		assertEquals(jBtn,sTest.getRdbtnEasy());
	}
	public void testgetRdbtnEasy(){
		sTest.setRdbtnEasy(jBtn);
		assertEquals(jBtn,sTest.getRdbtnEasy());
	}
	public void testsetRdbtnMedium(){
		sTest.setRdbtnMedium(jBtn);
		assertEquals(jBtn,sTest.getRdbtnMedium());
	}
	public void testgetRdbtnMedium(){
		sTest.setRdbtnMedium(jBtn);
		assertEquals(jBtn,sTest.getRdbtnMedium());
	}
	public void testgetRdbtnHard(){
		sTest.setRdbtnHard(jBtn);
		assertEquals(jBtn,sTest.getRdbtnHard());
	}
	public void testsetRdbtnHard(){
		JRadioButton jHard = null;
		sTest.setRdbtnMedium(jHard);
		assertEquals(jBtn,jHard);
	}
	public void testgetRdbtnInsane(){
		sTest.setRdbtnInsane(jBtn);
		assertEquals(jBtn,sTest.getRdbtnInsane());
	}
	public void testsetRdbtnInsane(){
		JRadioButton jInsane = null;
		sTest.setRdbtnMedium(jInsane);
		assertEquals(jBtn,jInsane);
	}
	public void testsetRdbtnX(){
		JRadioButton jXBtn = null;
		sTest.setRdbtnX(jXBtn);
		assertEquals(jBtn,jXBtn);
	}
	public void testgetRdbtnX(){
		sTest.setRdbtnX(jBtn);
		assertEquals(jBtn,sTest.getRdbtnX());
	}
	public void testgetRdbtnO(){
		sTest.setRdbtnO(jBtn);
		assertEquals(jBtn,sTest.getRdbtnO());
	}
	public void testsetRdbtnO(){
		JRadioButton jOBtn = null;
		sTest.setRdbtnO(jOBtn);
		assertEquals(jBtn,jOBtn);
	}
	

}
