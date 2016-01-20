package jfame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This class is a main page class. It contains J components. There are two playing options which are single player
 * and multi player.
 * @author Mert SOLAK
 * @author Onur ELGÜN
 */
public class MainPage extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		InitializeComponents();
	}
	/**
	 * This method initialize components.
	 */
	public void InitializeComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblTicTacToe = new JLabel("Tic Tac Toe");
		lblTicTacToe.setForeground(new Color(255,255,255));
		lblTicTacToe.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTicTacToe.setBounds(310, 36, 160, 45);
		contentPane.add(lblTicTacToe);
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setBackground(new Color(255,255,255));
		btnSinglePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SinglePlayer sObject = new SinglePlayer();
				sObject.InitializeSinglePlayer();
				MainPage.this.setVisible(false);
			}
		});
		btnSinglePlayer.setBounds(191, 124, 397, 66);
		contentPane.add(btnSinglePlayer);
		
		JButton btnMultiPlayer = new JButton("Multi Player");
		btnMultiPlayer.setBackground(new Color(255,255,255));
		btnMultiPlayer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				MultiPlayer mObject = new MultiPlayer();
				mObject.InitializeMultiPlayer();
				MainPage.this.setVisible(false);
			}
		});
		btnMultiPlayer.setBounds(191, 220, 397, 66);
		contentPane.add(btnMultiPlayer);
	}
	
}
