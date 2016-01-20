package jfame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Artifical_Intelligence;
import classes.Controls;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * This class is a playing page class. It contains J components and use these components to communicate Artifical_Intelligence
 * class and Controls class.
 * @author Mert SOLAK
 * @author Onur ELGÜN
 */
public class PlayingPage extends JFrame {

	private JPanel contentPane;
	private SinglePlayer sObject;
	private MultiPlayer mObject;
	private Artifical_Intelligence aiObject;
	private int xSkor,oSkor;
	private Controls cObject;
	private String nextPlayer;
	private JButton button_1 ,button_2 ,button_3 ,button_4 ,button_5 ,button_6 ,button_7 ,button_8 ,button_9,
					btnFinish ,btnContinue;
	private JLabel xPlayerLabel, oPlayerLabel ,xSkorLabel ,oSkorLabel;
	private boolean flagSingleMultii,flagTurn,flagFinish;
	/**
	 * This method is a default constructor.
	 */
	public PlayingPage() {
		InitilializeComponents();
	}
	/**
	 * This method is a parametric constructor.
	 */
	public PlayingPage(Object o){
		InitilializeComponents();
		if(o instanceof SinglePlayer){
			sObject = (SinglePlayer) o;
			if(sObject.getRdbtnO().isSelected()){
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				cObject = new Controls(PlayingPage.this);
				setNextPlayer("O");
				aiObject.play();
				cObject.arrangeOrder();
				setFlagTurn(false);
			}
			else{
				setNextPlayer("X");
				setFlagTurn(true);
			}
			xPlayerLabel.setText(sObject.getTextField().getText());
			if(sObject.getRdbtnEasy().isSelected())
				oPlayerLabel.setText("Computer(Easy)");
			if(sObject.getRdbtnMedium().isSelected())
				oPlayerLabel.setText("Computer(Medium)");
			if(sObject.getRdbtnHard().isSelected())
				oPlayerLabel.setText("Computer(Hard)");
			if(sObject.getRdbtnInsane().isSelected())
				oPlayerLabel.setText("Computer(Insane)");
			setFlagSingleMulti(true);
			
		}
		if(o instanceof MultiPlayer){
			MultiPlayer mObject = (MultiPlayer) o;
			xPlayerLabel.setText(mObject.getxTextField().getText());
			oPlayerLabel.setText(mObject.getoTextField().getText());
			setFlagSingleMulti(false);
			if(mObject.getRadioButtonX().isSelected())
				setNextPlayer("X");
			if(mObject.getRadioButtonO().isSelected())
				setNextPlayer("O");
		}
	}
	/**
	 * This method initializes playing page.
	 */
	public void InitializePlayingPage(Object obj) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayingPage frame = new PlayingPage(obj);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setaiObject(Artifical_Intelligence ai){
		aiObject = ai;
	}
	public Artifical_Intelligence getaiObject(){
		return aiObject;
	}
	public void setFlagSingleMulti(boolean b){
		flagSingleMultii = b;
	}
	public boolean getFlagSingleMulti(){
		return flagSingleMultii;
	}
	public void setFlagFinish(boolean b){
		flagFinish = b;
	}
	public boolean getFlagFinish(){
		return flagFinish;
	}
	public void setFlagTurn(boolean b){
		flagTurn = b;
	}
	public boolean getFlagTurn(){
		return flagTurn;
	}
	public void setContolsObject(Controls s){
		cObject = s;
	}
	public Controls getContolsObject(){
		return cObject;
	}
	public int getXSkor(){
		return xSkor;
	}
	public JLabel getXPlayerLabel(){
		return xPlayerLabel;
	}
	public void setXPlayerLabel(JLabel l){
		xPlayerLabel = l;
	}
	public void setOPlayerLabel(JLabel l){
		oPlayerLabel = l;
	}
	public JLabel getOPlayerLabel(){
		return oPlayerLabel;
	}
	public String getNextPlayer(){
		return nextPlayer;
	}
	public void setNextPlayer(String s){
		nextPlayer = s;
	}
	public int getOSkor(){
		return oSkor;
	}
	public void setXSkor(int i){
		xSkor += i;
		xSkorLabel.setText("Skor : "+Integer.valueOf(xSkor).toString());
	}
	public void setOSkor(int i){
		oSkor += i;
		oSkorLabel.setText("Skor : "+Integer.valueOf(oSkor).toString());
	}
	public JButton getButton_1(){
		return button_1;
	}
	public JButton getButton_2(){
		return button_2;
	}
	public JButton getButton_3(){
		return button_3;
	}
	public JButton getButton_4(){
		return button_4;
	}
	public JButton getButton_5(){
		return button_5;
	}
	public JButton getButton_6(){
		return button_6;
	}
	public JButton getButton_7(){
		return button_7;
	}
	public JButton getButton_8(){
		return button_8;
	}
	public JButton getButton_9(){
		return button_9;
	}
	public boolean setButton_1(String s){
		if(button_1.getText().isEmpty() || s.isEmpty()){
			button_1.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_2(String s){
		if(button_2.getText().isEmpty() || s.isEmpty()){
			button_2.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_3(String s){
		if(button_3.getText().isEmpty() || s.isEmpty()){
			button_3.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_4(String s){
		if(button_4.getText().isEmpty() || s.isEmpty()){
			button_4.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_5(String s){
		if(button_5.getText().isEmpty() || s.isEmpty()){
			button_5.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_6(String s){
		if(button_6.getText().isEmpty() || s.isEmpty()){
			button_6.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_7(String s){
		if(button_7.getText().isEmpty() || s.isEmpty()){
			button_7.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_8(String s){
		if(button_8.getText().isEmpty() || s.isEmpty()){
			button_8.setText(s);
			return true;
		}
		return false;
	}
	public boolean setButton_9(String s){
		if(button_9.getText().isEmpty() || s.isEmpty()){
			button_9.setText(s);
			return true;
		}
		return false;
	}
	public void setSinglePlayerObject(SinglePlayer s){
		sObject = s;
	}
	public void setMultiPlayerObject(MultiPlayer m){
		mObject = m;
	}
	public SinglePlayer getSinglePlayerObject(){
		return sObject;
	}
	public MultiPlayer getMultiPlayerObject(){
		return mObject;
	}
	/**
	 * This method resets inside the buttons.
	 */
	public void reset(){
		button_1.setText("");
		button_2.setText("");
		button_3.setText("");
		button_4.setText("");
		button_5.setText("");
		button_6.setText("");
		button_7.setText("");
		button_8.setText("");
		button_9.setText("");
		btnContinue.setEnabled(false);
		if(flagTurn)
			setFlagTurn(false);
		else
			setFlagTurn(true);
		setFlagFinish(false);
	}
	/**
	 * This method initializes components.
	 */
	public void InitilializeComponents(){
		flagFinish = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		xPlayerLabel = new JLabel("X Player");
		xPlayerLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 18));
		xPlayerLabel.setBounds(117, 23, 154, 14);
		xPlayerLabel.setForeground(new Color(255,255,255));
		contentPane.add(xPlayerLabel);
		
		xSkorLabel = new JLabel("skor");
		xSkorLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 18));
		xSkorLabel.setBounds(117, 50, 154, 14);
		xSkorLabel.setForeground(new Color(255,255,255));
		contentPane.add(xSkorLabel);
		
		oPlayerLabel = new JLabel("O Player");
		oPlayerLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 18));
		oPlayerLabel.setBounds(473, 23, 147, 14);
		oPlayerLabel.setForeground(new Color(255,255,255));
		contentPane.add(oPlayerLabel);
		
		oSkorLabel = new JLabel("skor");
		oSkorLabel.setFont(new Font("Monotype Corsiva", Font.ITALIC, 18));
		oSkorLabel.setBounds(473, 50, 147, 14);
		oSkorLabel.setForeground(new Color(255,255,255));
		contentPane.add(oSkorLabel);
		
		button_1 = new JButton("");
		button_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_1.setBackground(new Color(255,255,255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_1(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
				}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_1.setBounds(117, 101, 135, 135);
		contentPane.add(button_1);
		
		button_2 = new JButton("");
		button_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_2.setBackground(new Color(255,255,255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_2(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_2.setBounds(296, 101, 135, 135);
		contentPane.add(button_2);
		
		button_3 = new JButton("");
		button_3.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_3.setBackground(new Color(255,255,255));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_3(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_3.setBounds(473, 101, 135, 135);
		contentPane.add(button_3);
		
		button_4 = new JButton("");
		button_4.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_4.setBackground(new Color(255,255,255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_4(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_4.setBounds(117, 275, 135, 135);
		contentPane.add(button_4);
		
		button_5 = new JButton("");
		button_5.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_5.setBackground(new Color(255,255,255));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_5(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_5.setBounds(296, 275, 135, 135);
		contentPane.add(button_5);
		
		button_6 = new JButton("");
		button_6.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_6.setBackground(new Color(255,255,255));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_6(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_6.setBounds(473, 275, 135, 135);
		contentPane.add(button_6);
		
		button_7 = new JButton("");
		button_7.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_7.setBackground(new Color(255,255,255));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_7(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_7.setBounds(117, 450, 135, 135);
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_8.setBackground(new Color(255,255,255));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_8(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;		
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_8.setBounds(296, 450, 135, 135);
		contentPane.add(button_8);
		
		button_9 = new JButton("");
		button_9.setFont(new Font("Monotype Corsiva", Font.BOLD, 75));
		button_9.setBackground(new Color(255,255,255));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(flagFinish)
					return;
				cObject = new Controls(PlayingPage.this);
				aiObject = new Artifical_Intelligence(PlayingPage.this);
				if(!setButton_9(cObject.arrangeOrder())){
					cObject.arrangeOrder();
					return;
				}
				if(cObject.winControl()){
					btnContinue.setEnabled(true);
					return;	
				}
				if(flagSingleMultii){
					aiObject.play();
					cObject.arrangeOrder();
					}
				if(cObject.winControl())
					btnContinue.setEnabled(true);
			}
		});
		button_9.setBounds(473, 450, 135, 135);
		contentPane.add(button_9);
		
		btnFinish = new JButton("Finish");
		btnFinish.setBackground(new Color(255,255,255));
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage mObj = new MainPage();
				mObj.InitializeComponents();
				mObj.setVisible(true);
				PlayingPage.this.dispose();
			}
		});
		btnFinish.setBounds(47, 628, 275, 60);
		contentPane.add(btnFinish);
		
		btnContinue = new JButton("Continue");
		btnContinue.setEnabled(false);
		btnContinue.setBackground(new Color(255,255,255));
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnContinue.setEnabled(false);
				reset();
				if(!flagTurn){
					aiObject = new Artifical_Intelligence(PlayingPage.this);
					cObject = new Controls(PlayingPage.this);
					setNextPlayer("O");
					aiObject.play();
					cObject.arrangeOrder();
				}
			}
		});
		btnContinue.setBounds(382, 628, 275, 60);
		contentPane.add(btnContinue);
	setXSkor(0);
	setOSkor(0);
	}

}
