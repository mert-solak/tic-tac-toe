package classes;

import jfame.MultiPlayer;
import jfame.PlayingPage;
import jfame.SinglePlayer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * This class is a storage class. It keeps variables which are belongs to both Artifical_Intelligence class and 
 * Controls class.
 * @author Mert SOLAK
 * @author Onur ELGÜN
 */

public class Storage {
	SinglePlayer sObject;
	MultiPlayer mObject;
	Controls cObject;
	PlayingPage pObject;
	Artifical_Intelligence aiObject;
	boolean singleMultiFlag;
	JLabel xPlayerLabel,oPlayerLabel,xScoreLabel,
	oScoreLabel;
	JButton btnContinue,btnFinish,btnFirst,btnSecond,
	btnThird,btnFourth,btnFifth,btnSixth,btnSeventh,
	btnEighth,btnNineth;
	
	public SinglePlayer getSingleObject(){
		return sObject;
	}
	public PlayingPage getPlayingPageObject(){
		return pObject;
	}
	public MultiPlayer getMultiPlayerObject(){
		return mObject;
	}
	public Controls getControlsObject(){
		return cObject;
	}
	public Artifical_Intelligence getArtifical_IntelligenceObject(){
		return aiObject;
	}
	public void setSinglePlayerObject(SinglePlayer s){
		sObject = s;
	}
	public void setPlayingPageObject(PlayingPage p){
		pObject = p;
	}
	public void setMultiPlayerObject(MultiPlayer m){
		mObject = m;
	}
	public void setControlsObject(Controls c){
		cObject = c;
	}
	public void setArtifical_IntelligenceObject(Artifical_Intelligence a){
		aiObject = a;
	}
	public void setSingleMultiFlag(boolean b){
		singleMultiFlag = b;
	}
	public boolean getSingleMultiFlag(){
		return singleMultiFlag;
	}
}
