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
public class Pantalla2 extends Pantalla1 {
	private JPanel p1;
	int x=305, y, xd, xt1, xt2, xt3, xt4, xt5, yt1, yt2, yt3, yt4, yt5;
	private JTextField txt;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla2 frame = new Pantalla2();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Pantalla2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370, 150, 666, 380);
		p1 = new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(p1);
		p1.setLayout(null);
		
		JLabel lblTitu = new JLabel("Warzone Interestelar");
		lblTitu.setFont(new Font("Consolas", Font.BOLD, 20));
		lblTitu.setForeground(Color.WHITE);
		lblTitu.setBounds(200, 11, 235, 19);
		p1.add(lblTitu);
		
		JLabel lbl1 = new JLabel("Puntos: ");
		lbl1.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lbl1.setForeground(Color.WHITE);
		lbl1.setBounds(517, 12, 123, 14);
		p1.add(lbl1);
		
		JLabel lbl2 = new JLabel(vid[idVid].getUsu());
		lbl2.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(10, 12, 165, 14);
		p1.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Jugador.png")));
		lbl3.setBounds(x, 237, 32, 32);
		p1.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Enemigo1.png")));
		lbl4.setBounds(449, 162, 32, 32);
		p1.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Enemigo2.png")));
		lbl5.setBounds(106, 71, 32, 32);
		p1.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Enemigo3.png")));
		lbl6.setBounds(173, 162, 32, 32);
		p1.add(lbl6);

		JLabel lbl7 = new JLabel("");
		lbl7.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Enemigo4.png")));
		lbl7.setBounds(515, 71, 32, 32);
		p1.add(lbl7);
		
		JLabel lbl8 = new JLabel("");
		lbl8.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Enemigo5.png")));
		lbl8.setBounds(305, 120, 32, 32);
		p1.add(lbl8);
		
		JLabel lbl9 = new JLabel("");
		lbl9.setIcon(new ImageIcon(Pantalla2.class.getResource("/Imagenes/Disparo.png")));
		lbl9.setBounds(0, 41, 10, 211);
		lbl9.setVisible(false);
		p1.add(lbl9);
		
		Timer t1=new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xt1=(int)(Math. random()*566+11);
				yt1=(int)(Math. random()*180+60);
				lbl4.setLocation(xt1,yt1);

				xt2=(int)(Math. random()*566+11);
				yt2=(int)(Math. random()*180+60);
				lbl5.setLocation(xt2,yt2);

				xt3=(int)(Math. random()*566+11);
				yt3=(int)(Math. random()*180+60);
				lbl6.setLocation(xt3,yt3);

				xt4=(int)(Math. random()*566+11);
				yt4=(int)(Math. random()*180+60);
				lbl7.setLocation(xt4,yt4);
				
				xt5=(int)(Math. random()*566+11);
				yt5=(int)(Math. random()*180+60);
				lbl8.setLocation(xt5,yt5);
			}
		});
		
		Timer t2=new Timer(1, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl9.setLocation(0,0);
				lbl9.setVisible(false);
			}
		});
		
		Timer t3=new Timer(1,new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t2.start();
				if(xt1==xd ||xt1==xd+1 ||xt1==xd+2 ||xt1==xd+3 ||xt1==xd+4 ||xt1==xd-1 ||xt1==xd-2 ||xt1==xd-3 ||xt1==xd-4) {
					pts=pts+1;
					lbl1.setText("Puntos: "+pts);
					t2.stop();
				}
				else if(xt2==xd || xt2==xd+1 || xt2==xd+2 || xt2==xd+3 || xt2==xd+4 || xt2==xd-1 || xt2==xd-2 || xt2==xd-3 || xt2==xd-4) {
					pts=pts+1;
					lbl1.setText("Puntos: "+pts);
					t2.stop();
				}
				else if(xt3==xd || xt3==xd+1 || xt3==xd+2 || xt3==xd+3 || xt3==xd+4 || xt3==xd-1 || xt3==xd-2 || xt3==xd-3 || xt3==xd-4) {
					pts=pts+1;
					lbl1.setText("Puntos: "+pts);
					t2.stop();
				}
				else if(xt4==y || xt4==xd+1 || xt4==xd+2 || xt4==xd+3 || xt4==xd+4 || xt4==xd-1 || xt4==xd-2 || xt4==xd-3 || xt4==xd-4) {
					pts=pts+1;
					lbl1.setText("Puntos: "+pts);
					t2.stop();
				}
				else if(xt5==xd || xt5==xd+1 || xt5==xd+2 || xt5==xd+3 || xt5==xd+4 || xt5==xd-1 || xt5==xd-2 || xt5==xd-3 || xt5==xd-4) {
					pts=pts+1;
					lbl1.setText("Puntos: "+pts);
					t2.stop();
				}
			}
		});
		
		txt = new JTextField();
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int tc=e.getKeyCode();
				if(tc==37 && x<567 && x>10) {
					lbl3.setLocation(x=x-5,237);
					if(x>=567)
						x=266;
					else if(x<=10)
						x=11;
				}
				else if(tc==39 && x<567 && x>10) {
					lbl3.setLocation(x=x+5,237);
					if(x>=567)
						x=566;
					else if(x<=10)
						x=11;
				}
				if(tc==37 || tc==38 || tc==39) {
					t1.start();
					}
				if(tc==38) {
					xd=x;
					t3.start();
					lbl9.setLocation(x+10,41);
					lbl9.setVisible(true);
				}
			}
		});
		txt.setBounds(10, 10, 0, 0);
		p1.add(txt);
		txt.setColumns(10);
		
		JPanel pbt = new JPanel();
		pbt.setBackground(Color.BLACK);
		pbt.setBounds(0, 280, 650, 35);
		p1.add(pbt);
		pbt.setLayout(null);
		
		JButton btn3 = new JButton("Reiniciar");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.stop();
				t2.stop();
				t3.stop();
				lbl3.setBounds(x=305, 237, 32, 32);
				lbl4.setBounds(449, 162, 32, 32);
				lbl5.setBounds(106, 71, 32, 32);
				lbl6.setBounds(173, 162, 32, 32);
				lbl7.setBounds(515, 71, 32, 32);
				lbl8.setBounds(305, 120, 32, 32);
				lbl9.setBounds(0, 41, 10, 211);
				pts=0;
				txt.setEnabled(true);
				btn3.setNextFocusableComponent(txt);
				btn3.nextFocus();
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(Color.GRAY);
		btn3.setFont(new Font("Consolas", Font.PLAIN, 12));
		btn3.setBounds(453, 5, 104, 23);
		pbt.add(btn3);
		
		JButton btn1 = new JButton("Pausar");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.isRunning()) {
					t1.stop();
					t2.stop();
					t3.stop();
					}
				else
					t1.start(); t2.start(); t3.start();
					
				btn1.setNextFocusableComponent(txt);
				btn1.nextFocus();
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.GRAY);
		btn1.setFont(new Font("Consolas", Font.PLAIN, 12));
		btn1.setBounds(10, 5, 93, 23);
		pbt.add(btn1);
		
		
		JButton btn4 = new JButton("Salir");
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(Color.GRAY);
		btn4.setFont(new Font("Consolas", Font.PLAIN, 12));
		btn4.setBounds(567, 5, 73, 23);
		pbt.add(btn4);
		
		JButton btn2 = new JButton("Detener\r\n");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.stop();
				t2.stop();
				t3.stop();
				txt.setEnabled(false);
			}
		});
		
		JButton btn5 = new JButton("Puntuaciones");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verpts();
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Consolas", Font.PLAIN, 12));
		btn5.setBackground(Color.GRAY);
		btn5.setBounds(262, 5, 132, 23);
		pbt.add(btn5);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.GRAY);
		btn2.setFont(new Font("Consolas", Font.PLAIN, 12));
		btn2.setBounds(113, 5, 93, 23);
		pbt.add(btn2);
		
		this.setVisible(true);
	}
}