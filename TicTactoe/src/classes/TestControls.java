package classes;

import static org.junit.Assert.*;
import org.junit.Assert;
import junit.framework.TestCase;

import jfame.PlayingPage;

public class TestControls extends TestCase{
	Controls cTest = new Controls();
	PlayingPage pPlayer;

	public void testControlsConstructor() {
		try{
			new Controls();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testParametric(){
		try{
			new Controls(pPlayer);
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testwinControl(){
		boolean xTest = false;
		boolean oTest = false;
		if(xTest == true){
			pPlayer.setNextPlayer("O");
			pPlayer.setFlagFinish(true);
		}
		else if(oTest == true){
			pPlayer.setNextPlayer("X");
		}
	}
	public void testorganizeScoreTable(){
		String s = "";
		if(s.equals("X")){
			pPlayer.setXSkor(1);
		}
		if(s.equals("O")){
			pPlayer.setOSkor(1);
		}
	}
	public void testarrangeOrder(){
		String nextPlayer = "";
		if(nextPlayer.equals("X")){
			pPlayer.setNextPlayer("O");
		}
		if(nextPlayer.equals("O")){
			pPlayer.setNextPlayer("X");
		}
	}
	
	
}