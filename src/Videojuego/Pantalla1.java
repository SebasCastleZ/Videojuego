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
public class Pantalla1 extends JFrame {
	JLabel imagen = new JLabel("");
	private JPanel p1;
	private JTextField us;
	int idVid=0, nVid=0, pts=0;
	public static Videojuego[] vid=new Videojuego[20];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla1 frame = new Pantalla1();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla1() {
		setTitle("Warzone Galactico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,500,300);
		
		JMenuBar mb1 = new JMenuBar();
		setJMenuBar(mb1);
		
		JMenu mn1 = new JMenu("Opciones");
		mb1.add(mn1);
		
		JMenuItem mni1 = new JMenuItem("Creditos");
		mni1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vercre();
			}
		});
		mn1.add(mni1);
		
		JMenuItem mni2 = new JMenuItem("Salir");
		mni2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		mn1.add(mni2);
		
		JMenu mn2 = new JMenu("Juego");
		mb1.add(mn2);
		
		JMenuItem mni3 = new JMenuItem("Jugar");
		mni3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugar();
			}
		});
		
		JMenuItem mni4 = new JMenuItem("Ver Puntuaciones");
		mni4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verpts();
			}
		});
		mn2.add(mni4);
		p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		
		JLabel lbl1 = new JLabel("Copyright todos los derechos reservados desde 2001-2021");
		lbl1.setEnabled(false);
		lbl1.setForeground(Color.LIGHT_GRAY);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl1.setBounds(10, 224, 299, 13);
		p1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Warzone Interestelar");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 38));
		lbl2.setBounds(39, 11, 408, 54);
		p1.add(lbl2);
		
		JLabel nom = new JLabel("Ingresa un Nombre de Usuario:");
		nom.setFont(new Font("Unispace", Font.BOLD | Font.ITALIC, 16));
		nom.setForeground(new Color(204, 0, 51));
		nom.setBounds(110, 65, 247, 21);
		p1.add(nom);
		
		JLabel nave = new JLabel("");
		nave.setBounds(94, 151, 45, 13);
		p1.add(nave);

		JButton com = new JButton("COMENZAR");
		com.setForeground(Color.WHITE);
		com.setBackground(Color.BLACK);
		com.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Videojuego vide=new Videojuego(us.getText(),pts);
						vid[nVid]=vide; idVid++;
				jugar();
			}
		});
		com.setBounds(185, 151, 104, 27);
		p1.add(com);
		
		JButton cre = new JButton("CRÉDITOS ");
		cre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vercre();
			}
		});
		cre.setBackground(Color.BLACK);
		cre.setForeground(Color.WHITE);
		cre.setBounds(10, 189, 104, 24);
		p1.add(cre);
		
		us = new JTextField();
		us.setBounds(75, 97, 309, 21);
		p1.add(us);
		us.setColumns(10);
		
		JButton salir = new JButton("SALIR");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		salir.setForeground(Color.WHITE);
		salir.setBackground(Color.BLACK);
		salir.setBounds(370, 189, 104, 24);
		p1.add(salir);
		
		JButton punt = new JButton("PUNTUACIONES");
		punt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pantalla3 p3=new Pantalla3();
				verpts();
			}
		});
		punt.setForeground(Color.WHITE);
		punt.setBackground(Color.BLACK);
		punt.setBounds(156, 189, 167, 24);
		p1.add(punt);
		
		this.setVisible(true);
	}
	public void salir() {
		dispose();
	}
	public void jugar() {
		Pantalla2 p2=new Pantalla2();
		dispose();
	}
	public void verpts() {
		Pantalla3 p3=new Pantalla3();
		dispose();
	}
	public void vercre() {
		Pantalla4 p4=new Pantalla4();
		dispose();
	}
	public void inicio() {
		Pantalla1 p1=new Pantalla1();
		dispose();
	}
}