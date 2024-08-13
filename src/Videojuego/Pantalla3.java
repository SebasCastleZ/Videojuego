package Videojuego;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Pantalla3 extends Pantalla2 {
	private JPanel p1;
	public JLabel Usuario;
	public JLabel Usuario2;
	public JLabel Usuario3;
	public JLabel Punta1;
	public JLabel Punta2;
	public JLabel Punta3;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla3 frame = new Pantalla3();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 320);
		p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		JLabel Titu = new JLabel("PUNTAJE OBTENIDO: ");
		Titu.setBackground(new Color(147, 112, 219));
		Titu.setHorizontalAlignment(SwingConstants.CENTER);
		Titu.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		Titu.setForeground(Color.WHITE);
		Titu.setBounds(209, 32, 170, 14);
		p1.add(Titu);
		
		JLabel Estrella = new JLabel(".");
		Estrella.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella.setForeground(new Color(255, 255, 255));
		Estrella.setBounds(35, 32, 21, 29);
		p1.add(Estrella);
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255, 255, 255));
		p2.setBounds(10, 11, 414, 4);
		p1.add(p2);
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.WHITE);
		p3.setBounds(10, 246, 414, 4);
		p1.add(p3);
		
		JPanel p4 = new JPanel();
		p4.setBackground(new Color(255, 255, 255));
		p4.setBounds(10, 11, 4, 239);
		p1.add(p4);
		
		JPanel p5 = new JPanel();
		p5.setBackground(Color.WHITE);
		p5.setBounds(420, 11, 4, 239);
		p1.add(p5);
		
		JLabel Estrella2 = new JLabel(".");
		Estrella2.setForeground(Color.WHITE);
		Estrella2.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella2.setBounds(389, 11, 21, 29);
		p1.add(Estrella2);
		
		JLabel Estrella4 = new JLabel(".");
		Estrella4.setForeground(Color.WHITE);
		Estrella4.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella4.setBounds(45, 206, 21, 29);
		p1.add(Estrella4);
		
		JLabel Estrella3 = new JLabel(".");
		Estrella3.setForeground(Color.WHITE);
		Estrella3.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella3.setBounds(389, 206, 21, 29);
		p1.add(Estrella3);
		
		JLabel Estrella5 = new JLabel(".");
		Estrella5.setForeground(Color.WHITE);
		Estrella5.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella5.setBounds(134, 32, 21, 29);
		p1.add(Estrella5);
		
		JLabel Estrella6 = new JLabel(".");
		Estrella6.setForeground(Color.WHITE);
		Estrella6.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella6.setBounds(376, 166, 21, 29);
		p1.add(Estrella6);
		
		JLabel Estrella8 = new JLabel(".");
		Estrella8.setForeground(Color.WHITE);
		Estrella8.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella8.setBounds(376, 70, 21, 29);
		p1.add(Estrella8);
		
		JLabel Estrella9 = new JLabel(".");
		Estrella9.setForeground(Color.WHITE);
		Estrella9.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella9.setBounds(268, 24, 21, 29);
		p1.add(Estrella9);
		
		JLabel Estrella10 = new JLabel(".");
		Estrella10.setForeground(Color.WHITE);
		Estrella10.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella10.setBounds(228, 206, 21, 29);
		p1.add(Estrella10);
		
		JLabel Estrella11 = new JLabel(".");
		Estrella11.setForeground(Color.WHITE);
		Estrella11.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella11.setBounds(134, 193, 21, 29);
		p1.add(Estrella11);
		
		JLabel Estrella12 = new JLabel(".");
		Estrella12.setForeground(Color.WHITE);
		Estrella12.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella12.setBounds(66, 83, 21, 29);
		p1.add(Estrella12);
		
		JLabel Estrella13 = new JLabel(".");
		Estrella13.setForeground(Color.WHITE);
		Estrella13.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella13.setBounds(302, 147, 21, 29);
		p1.add(Estrella13);
		
		JLabel Estrella14 = new JLabel(".");
		Estrella14.setForeground(Color.WHITE);
		Estrella14.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella14.setBounds(330, 45, 21, 29);
		p1.add(Estrella14);
		
		JLabel Estrella15 = new JLabel(".");
		Estrella15.setForeground(Color.WHITE);
		Estrella15.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella15.setBounds(87, 179, 21, 29);
		p1.add(Estrella15);
		
		JLabel Estrella16 = new JLabel(".");
		Estrella16.setForeground(Color.WHITE);
		Estrella16.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella16.setBounds(302, 206, 21, 29);
		p1.add(Estrella16);
		
		JLabel Estrella17 = new JLabel(".");
		Estrella17.setForeground(Color.WHITE);
		Estrella17.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella17.setBounds(66, 11, 21, 29);
		p1.add(Estrella17);
		
		JLabel Estrella18 = new JLabel(".");
		Estrella18.setForeground(Color.WHITE);
		Estrella18.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella18.setBounds(195, 11, 21, 29);
		p1.add(Estrella18);
		
		JLabel Estrella19 = new JLabel(".");
		Estrella19.setForeground(Color.WHITE);
		Estrella19.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella19.setBounds(103, 122, 21, 29);
		p1.add(Estrella19);
		
		JLabel Estrella20 = new JLabel(".");
		Estrella20.setForeground(Color.WHITE);
		Estrella20.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella20.setBounds(349, 122, 21, 29);
		p1.add(Estrella20);
		
		JLabel Estrella21 = new JLabel(".");
		Estrella21.setForeground(Color.WHITE);
		Estrella21.setFont(new Font("Tahoma", Font.BOLD, 24));
		Estrella21.setBounds(195, 179, 21, 29);
		p1.add(Estrella21);
		
		JLabel Usuario2 = new JLabel("");
		Usuario2.setForeground(Color.WHITE);
		Usuario2.setBackground(new Color(176, 224, 230));
		Usuario2.setHorizontalAlignment(SwingConstants.CENTER);
		Usuario2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		Usuario2.setBounds(76, 97, 103, 14);
		p1.add(Usuario2);
		
		JLabel Usuario3 = new JLabel("");
		Usuario3.setForeground(Color.WHITE);
		Usuario3.setBackground(new Color(176, 224, 230));
		Usuario3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		Usuario3.setHorizontalAlignment(SwingConstants.CENTER);
		Usuario3.setBounds(76, 123, 103, 15);
		p1.add(Usuario3);
		
		JLabel FondodePantalla = new JLabel("");
		FondodePantalla.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		FondodePantalla.setForeground(new Color(255, 255, 255));
		FondodePantalla.setBounds(5, 5, 424, 251);
		p1.add(FondodePantalla);
	
		JLabel usua=new JLabel("");
		usua.setForeground(Color.WHITE);
		usua.setBackground(new Color(176, 224, 230));
		usua.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
		usua.setHorizontalAlignment(SwingConstants.CENTER);
		usua.setBounds(66, 92, 113, 20);
		p1.add(usua);
		
		JLabel lblNewLabel_1 = new JLabel("JUGADOR");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(147, 112, 219));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));
		lblNewLabel_1.setBounds(66, 26, 116, 23);
		p1.add(lblNewLabel_1);
		
		JLabel Punta = new JLabel("");
		Punta.setForeground(Color.WHITE);
		Punta.setBackground(new Color(176, 224, 230));
		Punta.setHorizontalAlignment(SwingConstants.CENTER);
		Punta.setFont(new Font("Perpetua Titling MT", Font.BOLD, 12));
		Punta.setBounds(243, 96, 113, 14);
		p1.add(Punta);
		
		JButton btnNewButton = new JButton("JUEGO NUEVO");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio();
			}
		});
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(65, 159, 138, 23);
		p1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SALIR");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnNewButton_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(228, 158, 138, 23);
		p1.add(btnNewButton_1);
		
		JButton Datos = new JButton("Cargar Datos");
		Datos.setForeground(Color.WHITE);
		Datos.setBackground(Color.BLACK);
		Datos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usua.setText(vid[idVid].getUsu());
				Punta.setText(""+vid[idVid].getPnts());
			}
		});
		Datos.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 13));
		Datos.setBounds(144, 199, 138, 23);
		p1.add(Datos);
		
		this.setVisible(true);
	}
}