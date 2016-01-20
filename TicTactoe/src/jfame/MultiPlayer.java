package jfame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 * This class is a multi player class. It contains J components to take informations from user.
 * @author Mert SOLAK
 * @author Onur ELGÜN
 */
public class MultiPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField xTextField;
	private JTextField oTextField;
	JRadioButton rdbtnX,rdbtnO;

	public static void InitializeMultiPlayer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiPlayer frame = new MultiPlayer();
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
	public MultiPlayer() {
		InitializeComponents();
	}
	/**
	 * This method initializes components.
	 */
	public void InitializeComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblNewLabel = new JLabel("Multi Player");
		lblNewLabel.setForeground(new Color(255,255,255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(299, 34, 177, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblXPlayer = new JLabel("X Player");
		lblXPlayer.setForeground(new Color(255,255,255));
		lblXPlayer.setBounds(259, 98, 68, 14);
		contentPane.add(lblXPlayer);
		
		JLabel lblOPlayer = new JLabel("O Player");
		lblOPlayer.setForeground(new Color(255,255,255));
		lblOPlayer.setBounds(261, 147, 86, 14);
		contentPane.add(lblOPlayer);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBackground(new Color(255,255,255));
		btnPlay.setEnabled(false);
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PlayingPage pObject = new PlayingPage();
				pObject.InitializePlayingPage(MultiPlayer.this);
				MultiPlayer.this.setVisible(false);
			}
		});
		btnPlay.setBounds(250, 325, 226, 55);
		contentPane.add(btnPlay);
		
		xTextField = new JTextField();
		xTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(oTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		xTextField.setBounds(371, 95, 86, 20);
		contentPane.add(xTextField);
		xTextField.setColumns(10);
		
		oTextField = new JTextField();
		oTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(oTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		oTextField.setColumns(10);
		oTextField.setBounds(371, 144, 86, 20);
		contentPane.add(oTextField);
		
		JLabel lblFirstmove = new JLabel("First Move");
		lblFirstmove.setForeground(new Color(255,255,255));
		lblFirstmove.setBounds(332, 220, 68, 14);
		contentPane.add(lblFirstmove);
		
		rdbtnX = new JRadioButton("X");
		rdbtnX.setForeground(new Color(255,255,255));
		rdbtnX.setBackground(new Color(0,0,0));
		rdbtnX.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(oTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnX.setBounds(242, 244, 109, 23);
		contentPane.add(rdbtnX);
		
		rdbtnO = new JRadioButton("O");
		rdbtnO.setForeground(new Color(255,255,255));
		rdbtnO.setBackground(new Color(0,0,0));
		rdbtnO.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(xTextField.getText().isEmpty()){
					return;
				}
				if(oTextField.getText().isEmpty()){
					return;
				}
				if(!rdbtnO.isSelected() && !rdbtnX.isSelected()){
					return;
				}
				btnPlay.setEnabled(true);
			}
		});
		rdbtnO.setBounds(453, 244, 109, 23);
		contentPane.add(rdbtnO);
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(rdbtnX);
		gp.add(rdbtnO);
	}
	public JRadioButton getRadioButtonX(){
		return rdbtnX;
	}
	public void setRadioButtonX(JRadioButton rb){
		rdbtnX = rb;
	}
	public JRadioButton getRadioButtonO(){
		return rdbtnO;
	}
	public void setRadioButtonO(JRadioButton rb){
		rdbtnO = rb;
	}
	public JTextField getxTextField(){
		return xTextField;
	}
	public void setxTextField(JTextField jt){
		xTextField = jt;
	}
	public JTextField getoTextField(){
		return oTextField;
	}
	public void setoTextField(JTextField jt){
		oTextField = jt;
	}
}
