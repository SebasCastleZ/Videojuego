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
public class Pantalla4 extends Pantalla1 {
	private JPanel p1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla4 frame = new Pantalla4();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla4() {
		setTitle("Warzone Galactico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,500,300);
		p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		
		JLabel lbl1 = new JLabel("Creado Por:");
		lbl1.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBackground(Color.BLACK);
		lbl1.setBounds(10, 11, 201, 27);
		p1.add(lbl1);
		
		JLabel lbl2 = new JLabel("T\u00E9llez Salazar Alfonso Federico");
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl2.setBackground(Color.BLACK);
		lbl2.setBounds(25, 64, 416, 27);
		p1.add(lbl2);
		
		JLabel lbl3 = new JLabel("Cort\u00E9s Guzm\u00E1n Angel Gabriel ");
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl3.setBackground(Color.BLACK);
		lbl3.setBounds(25, 94, 416, 27);
		p1.add(lbl3);
		
		JLabel lbl4 = new JLabel("Monroy Ferrer Diego Haziel ");
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl4.setBackground(Color.BLACK);
		lbl4.setBounds(25, 124, 416, 27);
		p1.add(lbl4);
		
		JLabel lbl5 = new JLabel("Castillo Zamudio Sebasti\u00E1n ");
		lbl5.setForeground(Color.WHITE);
		lbl5.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl5.setBackground(Color.BLACK);
		lbl5.setBounds(25, 153, 416, 27);
		p1.add(lbl5);
		
		JLabel lbl6 = new JLabel("- Duran del Villar Ximena");
		lbl6.setForeground(Color.WHITE);
		lbl6.setFont(new Font("OCR A Extended", Font.BOLD, 18));
		lbl6.setBackground(Color.BLACK);
		lbl6.setBounds(25, 183, 416, 27);
		p1.add(lbl6);
		
		JButton btn1 = new JButton("Salir");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(385, 227, 89, 23);
		p1.add(btn1);
		
		JButton btn2 = new JButton("Inicio");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inicio();
			}
		});
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.setBounds(10, 227, 89, 23);
		p1.add(btn2);

		this.setVisible(true);
	}
}
