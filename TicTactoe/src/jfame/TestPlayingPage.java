package jfame;

import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.Test;

import classes.Artifical_Intelligence;
import junit.framework.TestCase;

public class TestPlayingPage extends TestCase {
	PlayingPage pTest = new PlayingPage();
	public boolean value = true;
	public JLabel label;
	Artifical_Intelligence aiObj;

	public void testPlayingPageConstructor() {
		try{
			new PlayingPage();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testsetFlagSingleMulti(){
		pTest.setFlagSingleMulti(true);
		assertEquals(value,true);
	}
	public void testgetFlagSingleMulti(){
		pTest.setFlagSingleMulti(true);
		assertEquals(true,pTest.getFlagSingleMulti());
	}
	public final void testsetFlagFinish(){
		pTest.setFlagFinish(true);
		assertEquals(value,pTest.getFlagFinish());
	}
	public final void testgetFlagFinish(){
		pTest.setFlagFinish(true);
		assertEquals(true,pTest.getFlagFinish());
	}
	public final void testsetFlagTurn(){
		pTest.setFlagTurn(true);
		assertEquals(true,value);
	}
	public final void testgetFlagTurn(){
		pTest.setFlagTurn(true);
		assertEquals(true,pTest.getFlagTurn());
	}
	public final void testsetXSkor(){
		int n=10;
		pTest.setXSkor(10);
		assertEquals(10,n);
	}
	public final void testgetXSkor(){
		pTest.setXSkor(10);
		assertEquals(10,pTest.getXSkor());
	}
	public final void testsetNextPlayer(){
		String player="class";
		pTest.setNextPlayer("class");
		assertEquals("class",player);
	}
	public final void testgetNextPlayer(){
		pTest.setNextPlayer("class");
		assertEquals("class",pTest.getNextPlayer());
	}
	public final void testsetOSkor(){
		pTest.setOSkor(6);
		assertEquals(6,pTest.getOSkor());
	}
	public final void testgetOSkor(){
		pTest.setOSkor(6);
		assertEquals(6,pTest.getOSkor());
	}
	public final void testsetButton_1(){	
		try{
			String value = "X";
			pTest.setButton_1("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_2(){	
		try{
			String value = "X";
			pTest.setButton_2("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_3(){	
		try{
			String value = "X";
			pTest.setButton_3("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_4(){	
		try{
			String value = "X";
			pTest.setButton_4("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_5(){	
		try{
			String value = "X";
			pTest.setButton_5("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_6(){	
		try{
			String value = "X";
			pTest.setButton_6("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_7(){	
		try{
			String value = "X";
			pTest.setButton_7("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_8(){	
		try{
			String value = "X";
			pTest.setButton_8("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testsetButton_9(){	
		try{
			String value = "X";
			pTest.setButton_9("X");
			assertEquals(value,"X");
		}catch(Exception e){
			fail(e.getMessage());
		}		
	}
	public final void testgetButton_1(){
		pTest.setButton_1("X");
		System.out.println(pTest.getButton_1());
	}
	public final void testgetButton_2(){
		pTest.setButton_2("X");
		System.out.println(pTest.getButton_2());
	}
	public final void testgetButton_3(){
		pTest.setButton_3("X");
		System.out.println(pTest.getButton_3());
	}
	public final void testgetButton_4(){
		pTest.setButton_4("X");
		System.out.println(pTest.getButton_4());
	}
	public final void testgetButton_5(){
		pTest.setButton_5("X");
		System.out.println(pTest.getButton_5());
	}
	public final void testgetButton_6(){
		pTest.setButton_6("X");
		System.out.println(pTest.getButton_6());
	}
	public final void testgetButton_7(){
		pTest.setButton_7("X");
		System.out.println(pTest.getButton_7());
	}
	public final void testgetButton_8(){
		pTest.setButton_8("X");
		System.out.println(pTest.getButton_8());
	}
	public final void testgetButton_9(){
		pTest.setButton_9("X");
		System.out.println(pTest.getButton_9());
	}
	public final void testsetSinglePlayerObject(){
		SinglePlayer sObj = new SinglePlayer();
		pTest.setSinglePlayerObject(sObj);
		assertEquals(sObj,pTest.getSinglePlayerObject());
	}
	public final void testgetSinglePlayerObject(){
		SinglePlayer sObj = new SinglePlayer();
		pTest.setSinglePlayerObject(sObj);
		assertEquals(sObj,pTest.getSinglePlayerObject());
	}
	public final void testsetMultiPlayerObject(){
		MultiPlayer mObj = new MultiPlayer();
		pTest.setMultiPlayerObject(mObj);
		assertEquals(mObj,pTest.getMultiPlayerObject());
	}
	public final void testgetMultiPlayerObject(){
		MultiPlayer mObj = new MultiPlayer();
		pTest.setMultiPlayerObject(mObj);
		assertEquals(mObj,pTest.getMultiPlayerObject());
	}
	public void testgetXPlayerLabel(){
		pTest.setXPlayerLabel(label);
		assertEquals(label,pTest.getXPlayerLabel());
	}
	public void testsetXPlayerLabel(){
		pTest.setXPlayerLabel(label);
		assertEquals(label,pTest.getXPlayerLabel());
	}
	public void testsetOPlayerLabel(){
		pTest.setOPlayerLabel(label);
		assertEquals(label,pTest.getOPlayerLabel());
	}
	public void testgetOPlayerLabel(){
		pTest.setOPlayerLabel(label);
		assertEquals(label,pTest.getOPlayerLabel());
	}
	public void testsetaiObject(){
		pTest.setaiObject(aiObj);
		assertEquals(aiObj,pTest.getaiObject());
	}
	public void testgetaiObject(){
		pTest.setaiObject(aiObj);
		assertEquals(aiObj,pTest.getaiObject());
	}
	
}
