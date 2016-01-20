package jfame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * This class is a single player class. It contains J components to take informations from user.
 * @author Mert SOLAK
 * @author Onur ELGÜN
 */
public class SinglePlayer extends JFrame {

	private JPanel contentPane;
	private JTextField xTextField;
	private JRadioButton rdbtnEasy,rdbtnMedium,rdbtnHard,rdbtnInsane,rdbtnX, rdbtnO;


	public void InitializeSinglePlayer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglePlayer frame = new SinglePlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * This method is a default constructor.
	 */
	public SinglePlayer() {
		InitializeComponents();
	}
	/**
	 * This method initializes components.
	 */
	public void InitializeComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblSinglePlayer = new JLabel("Single Player");
		lblSinglePlayer.setForeground(new Color(255,255,255));
		lblSinglePlayer.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSinglePlayer.setBounds(294, 25, 209, 45);
		contentPane.add(lblSinglePlayer);
		
		JLabel lblNewLabel = new JLabel("X Player");
		lblNewLabel.setForeground(new Color(255,255,255));
		lblNewLabel.setBounds(288, 98, 63, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBackground(new Color(255,255,255));
		btnPlay.setEnabled(false);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayingPage pObject = new PlayingPage();
				pObject.InitializePlayingPage(SinglePlayer.this);
				SinglePlayer.this.setVisible(false);
			}
		});
		btnPlay.setBounds(258, 343, 226, 55);
		contentPane.add(btnPlay);
		
		xTextField = new JTextField();
		xTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		xTextField.setBounds(368, 95, 104, 20);
		contentPane.add(xTextField);
		xTextField.setColumns(10);
		
		JLabel lblLevels = new JLabel("Levels");
		lblLevels.setForeground(new Color(255,255,255));
		lblLevels.setBounds(339, 163, 46, 14);
		contentPane.add(lblLevels);
		
		rdbtnEasy = new JRadioButton("Easy");
		rdbtnEasy.setForeground(new Color(255,255,255));
		rdbtnEasy.setBackground(new Color(0,0,0));
		rdbtnEasy.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnEasy.setBounds(168, 194, 63, 23);
		contentPane.add(rdbtnEasy);
		
		rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setForeground(new Color(255,255,255));
		rdbtnMedium.setBackground(new Color(0,0,0));
		rdbtnMedium.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnMedium.setBounds(270, 194, 64, 23);
		contentPane.add(rdbtnMedium);
		
		rdbtnHard = new JRadioButton("Hard");
		rdbtnHard.setForeground(new Color(255,255,255));
		rdbtnHard.setBackground(new Color(0,0,0));
		rdbtnHard.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnHard.setBounds(387, 194, 64, 23);
		contentPane.add(rdbtnHard);
		
		rdbtnInsane = new JRadioButton("Insane");
		rdbtnInsane.setForeground(new Color(255,255,255));
		rdbtnInsane.setBackground(new Color(0,0,0));
		rdbtnInsane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnInsane.setBounds(487, 194, 64, 23);
		contentPane.add(rdbtnInsane);
		
		ButtonGroup bG1 = new ButtonGroup();
	    bG1.add(rdbtnEasy);
	    bG1.add(rdbtnMedium);
	    bG1.add(rdbtnInsane);
	    bG1.add(rdbtnHard);
	     
		JLabel lblFirstMove = new JLabel("First Move");
		lblFirstMove.setForeground(new Color(255,255,255));
		lblFirstMove.setBounds(337, 263, 79, 14);
		contentPane.add(lblFirstMove);
		
		rdbtnX = new JRadioButton("X");
		rdbtnX.setForeground(new Color(255,255,255));
		rdbtnX.setBackground(new Color(0,0,0));
		rdbtnX.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnX.setBounds(243, 284, 63, 23);
		contentPane.add(rdbtnX);
		
		rdbtnO = new JRadioButton("O");
		rdbtnO.setForeground(new Color(255,255,255));
		rdbtnO.setBackground(new Color(0,0,0));
		rdbtnO.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnEasy.isSelected() && !rdbtnMedium.isSelected() && !rdbtnHard.isSelected() && !rdbtnInsane.isSelected()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnO.setBounds(455, 284, 63, 23);
		contentPane.add(rdbtnO);
		
		ButtonGroup bG2 = new ButtonGroup();
		bG2.add(rdbtnX);
		bG2.add(rdbtnO);
	}
	public JTextField getTextField(){
		return xTextField;
	}
	public void setTextField(JTextField jt){
		xTextField = jt;
	}
	public JRadioButton getRdbtnEasy(){
		return rdbtnEasy;
	}
	public void setRdbtnEasy(JRadioButton jr){
		rdbtnEasy = jr;
	}
	public JRadioButton getRdbtnMedium(){
		return rdbtnMedium;
	}
	public void setRdbtnMedium(JRadioButton jr){
		rdbtnMedium = jr;
	}
	public JRadioButton getRdbtnHard(){
		return rdbtnHard;
	}
	public void setRdbtnHard(JRadioButton jr){
		rdbtnHard = jr;
	}
	public JRadioButton getRdbtnInsane(){
		return rdbtnInsane;
	}
	public void setRdbtnInsane(JRadioButton jr){
		rdbtnInsane = jr;
	}
	public JRadioButton getRdbtnX(){
		return rdbtnX;
	}
	public void setRdbtnX(JRadioButton jr){
		rdbtnX = jr;
	}
	public JRadioButton getRdbtnO(){
		return rdbtnO;
	}
	public void setRdbtnO(JRadioButton jr){
		rdbtnO = jr;
	}
}
