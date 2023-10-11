package actividadesTema1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class psp_window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					psp_window window = new psp_window();
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
	public psp_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Prácticas de la vida");
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Calculadora");
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\ptorres8870\\Downloads\\calculadoraIcon.png"));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ptorres8870\\fotos\\calculadora.png"));
		btnNewButton.setBounds(173, 59, 151, 49);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Block de notas");
		btnNewButton_1.setSelectedIcon(new ImageIcon("C:\\Users\\ptorres8870\\fotos\\notepad.jfif"));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ptorres8870\\fotos\\notepad.jfif"));
		btnNewButton_1.setBounds(173, 159, 151, 57);
		frame.getContentPane().add(btnNewButton_1);

		ActionListener actionCalcu = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LanzadorProcesos lP = new LanzadorProcesos();

				lP.ejecutar("C://WINDOWS//SYSTEM32//calc.exe");
			}
		};
		btnNewButton.addActionListener(actionCalcu);

		ActionListener actionBlock = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				LanzadorProcesos lP = new LanzadorProcesos();
				String ruta = "C://WINDOWS/System32//notepad.exe";
				lP.ejecutar(ruta);
			}
		};
		btnNewButton_1.addActionListener(actionBlock);

	}

}
