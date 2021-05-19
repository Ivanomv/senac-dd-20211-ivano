package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPrincipalEstoque extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipalEstoque frame = new TelaPrincipalEstoque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipalEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 370);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Consultar");
		mnNewMenu.setIcon(new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-pesquisa-paga-48.png")));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Consultar Produtos");
		mntmNewMenuItem
				.setIcon(new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-pesquisa-paga-50.png")));
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Cadastrar");
		mnNewMenu_1.setIcon(new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-criar-ordem-50.png")));
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1
				.setIcon(new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-criar-ordem-60.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_2 = new JMenu("Alterar");
		mnNewMenu_2.setIcon(new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-servi\u00E7o-48.png")));
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_2.setIcon(
				new ImageIcon(TelaPrincipalEstoque.class.getResource("/icons/icons8-servi\u00E7o-48 (1).png")));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
