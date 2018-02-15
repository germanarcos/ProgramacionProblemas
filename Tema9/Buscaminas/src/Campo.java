import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class Campo {
	static private int dimensiones;
	static JButton[][] botones;
	private JFrame frame;
	static boolean[][] minas;
	String texto;
	int num;
	ActionListener[][] action;

	/**
	 * Launch the application.
	 */
	public static void Campo(int dimensiones) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Campo window = new Campo(dimensiones);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Campo(int dimensiones) {
		Campo.dimensiones = dimensiones;
		botones = new JButton[dimensiones][dimensiones];
		minas = new boolean[dimensiones][dimensiones];
		for (int j = 0; j < dimensiones; j++) {
			for (int i = 0; i < dimensiones; i++) {
				if ((int) (Math.random() * 2) == 0) {
					minas[j][i] = true;
				} else {
					minas[j][i] = false;
				}
			}
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		action = new ActionListener[dimensiones][dimensiones];
		for (int j = 0; j < dimensiones; j++) {
			for (int i = 0; i < dimensiones; i++) {
				texto= "";
				botones[j][i] = new JButton(texto);
				botones[j][i].setBounds(i * 50, j * 50, 50, 50);
				action[j][i] = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						for (int j = 0; j < dimensiones; j++) {
							for (int i = 0; i < dimensiones; i++) {
								if(e.getSource()==botones[j][i]){
									if((e.getModifiers() & InputEvent.BUTTON1_MASK)==InputEvent.BUTTON1_MASK){
										if (minas[j][i]) {
											acabar();
											System.exit(0);
										} else {
											texto = "N";
										}
										botones[j][i].setText(texto);
									}
								}
//								if (e.getSource() == botones[j * dimensiones + i] && (e.getModifiers() & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
//									botones[j * dimensiones + i].setText("izq");
//								} else if (e.getSource() == botones[j * dimensiones + i] && (e.getModifiers() & InputEvent.BUTTON2_DOWN_MASK) == InputEvent.BUTTON2_DOWN_MASK){
//									if (e.getSource() == botones[j * dimensiones + i]) {
//										botones[j * dimensiones + i].setText("der");
//									}
//								}
							}
						}
					}
				};
				botones[j][i].addActionListener(action[j][i]);
				frame.getContentPane().add(botones[j][i]);

			}
		}

		// JButton btnNewButton = new JButton("New button");
		// btnNewButton.setBounds(0, 0, 25, 25);
		// frame.getContentPane().add(btnNewButton);
		//
		// JButton button = new JButton("New button");
		// button.setBounds(25, 0, 25, 25);
		// frame.getContentPane().add(button);
	}
	public void acabar(){
		for(int k = 0; k<dimensiones;k++){
			for(int l = 0;l<dimensiones;l++){
				if (minas[k][l]) {
					texto = "B";
					System.exit(0);
				} else {
					texto = "N";
				}
				botones[k][l].setText(texto);
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

//TODO
//Mirar MouseAdapter, crear metodo mousePressed e.getModifiersEx()==MouseEvent.BUTTON_DOWN_MASK

