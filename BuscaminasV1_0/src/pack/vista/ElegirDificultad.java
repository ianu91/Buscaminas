package pack.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirDificultad extends JFrame {

	private static ElegirDificultad mElegirDificultad = new ElegirDificultad();
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JButton btnFacil;
	private JButton btnMedia;
	private JButton btnDificil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirDificultad frame = new ElegirDificultad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static ElegirDificultad getElegirDificultad(){
		return mElegirDificultad;
	}
	
	public ElegirDificultad(){
		Initialize();
	}
	
	/**
	 * Create the frame.
	 */
	public void Initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblNewLabel(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Selecciona la dificultad con la que desea jugar: ");
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(getBtnFacil())
						.addGap(26)
						.addComponent(getBtnMedia())
						.addGap(18)
						.addComponent(getBtnDificil())
						.addContainerGap(39, Short.MAX_VALUE))
			);
			gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup()
						.addGap(103)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(getBtnFacil())
							.addComponent(getBtnMedia())
							.addComponent(getBtnDificil()))
						.addContainerGap(120, Short.MAX_VALUE))
			);
			panel.setLayout(gl_panel);
		}
		return panel;
	}
	private JButton getBtnFacil() {
		if (btnFacil == null) {
			btnFacil = new JButton("Facil");
			btnFacil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int dif = 1;
				}
			});
		}
		return btnFacil;
	}
	private JButton getBtnMedia() {
		if (btnMedia == null) {
			btnMedia = new JButton("Media");
			btnMedia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int dif = 2;
				}
			});
		}
		return btnMedia;
	}
	private JButton getBtnDificil() {
		if (btnDificil == null) {
			btnDificil = new JButton("Dificil");
			btnDificil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int dif = 2;
				}
			});
		}
		return btnDificil;
	}
}
