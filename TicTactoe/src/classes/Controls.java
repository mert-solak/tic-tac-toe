package classes;

import java.util.Arrays;

import javax.swing.JOptionPane;

import jfame.PlayingPage;

/**
 * This class is a control class. It contains methods {@code winControl(), arrangeOrder(), organizeScoreTable()} which are 
 * related to controls.
 * @author Mert SOLAK
 * @author Onur ELGÜN 
 * @see Collections
 * @see Arrays
 */

public class Controls extends Storage {
	/**
	 * This method is a default constructor.
	 *
	 */
	public Controls() {
		
	}
	/**
	 * This method is a parametric constructor.
	 *
	 */
	public Controls(PlayingPage p){
		pObject = p;
	}
	/**
	 * If the game is finished, this method controls the who is the winner and organize score table.
	 */
	public boolean winControl(){
		if((pObject.getButton_1().getText().equals(pObject.getButton_2().getText()) && pObject.getButton_2().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_1().getText().equals("X")) ||
				(pObject.getButton_4().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_4().getText().equals("X")) ||
				(pObject.getButton_7().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_8().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_7().getText().equals("X")) ||
				(pObject.getButton_1().getText().equals(pObject.getButton_4().getText()) && pObject.getButton_4().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_1().getText().equals("X")) ||
				(pObject.getButton_2().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_2().getText().equals("X")) ||
				(pObject.getButton_3().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_6().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_3().getText().equals("X")) ||
				(pObject.getButton_1().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_1().getText().equals("X")) ||
				(pObject.getButton_3().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_3().getText().equals("X")))
		{
			organizeScoreTable("X");
			pObject.setFlagFinish(true);
			return true;
		}
		if((pObject.getButton_1().getText().equals(pObject.getButton_2().getText()) && pObject.getButton_2().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_1().getText().equals("O")) ||
				(pObject.getButton_4().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_4().getText().equals("O")) ||
				(pObject.getButton_7().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_8().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_7().getText().equals("O")) ||
				(pObject.getButton_1().getText().equals(pObject.getButton_4().getText()) && pObject.getButton_4().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_1().getText().equals("O")) ||
				(pObject.getButton_2().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_2().getText().equals("O")) ||
				(pObject.getButton_3().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_6().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_3().getText().equals("O")) ||
				(pObject.getButton_1().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_1().getText().equals("O")) ||
				(pObject.getButton_3().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_5().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_7().getText().equals("O")))
		{
			organizeScoreTable("O");
			pObject.setFlagFinish(true);
			return true;
		}
		if(!pObject.getButton_1().getText().isEmpty() && !pObject.getButton_2().getText().isEmpty() && !pObject.getButton_3().getText().isEmpty() && !pObject.getButton_4().getText().isEmpty() && !pObject.getButton_5().getText().isEmpty()&&
			!pObject.getButton_6().getText().isEmpty() && !pObject.getButton_7().getText().isEmpty() && !pObject.getButton_8().getText().isEmpty() && !pObject.getButton_9().getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "No Winner");
			pObject.setFlagFinish(true);
			return true;
		}
		pObject.setFlagFinish(false);
		return false;
	}
	/**
	 * This method arranges an order.
	 *
	 */
	public String arrangeOrder(){
		if(pObject.getNextPlayer().equals("X")){
			pObject.setNextPlayer("O");
			return "X";
		}
		else{
			pObject.setNextPlayer("X");
			return "O";
		}
	}
	/**
	 * This method organizes score table.
	 */
	public void organizeScoreTable(String s){
		if(s.equals("X")){
			JOptionPane.showMessageDialog(null, pObject.getXPlayerLabel().getText()+"  Won");
			pObject.setXSkor(1);
		}
		if(s.equals("O")){
			JOptionPane.showMessageDialog(null, pObject.getOPlayerLabel().getText()+"  Won");
			pObject.setOSkor(1);
		}
	}
}
