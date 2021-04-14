package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ControladoraVacina;
import model.entity.vacinacao.Vacina;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultaVacina extends JFrame {

	private JPanel contentPane;
	private JTable tblvacina;
	private List<Vacina> vacinas;
	private ControladoraVacina controlador = new ControladoraVacina();
	private String[] nomesColunas = { "Nome", "Pais", "Estagio", "Data Pesquisa", "Pesquisador" , "Fase", "Quantidade"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaVacina frame = new ConsultaVacina();
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
	public ConsultaVacina() {
		setTitle("Tela Listagem Vacina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				atualizarVacina();
				
				
				
			}

			private void atualizarVacina() {
				
				vacinas = controlador.consultarVacinas();
				this.limpartabela();
				
				DefaultTableModel model = (DefaultTableModel) tblvacina.getModel();
				
				for(Vacina end: vacinas) {
					Object[] novaLinhaTabela = new Object[5];
					
					
					novaLinhaTabela[0] = end.getNome();
					novaLinhaTabela[1] = end.getPaisOrigem();
					novaLinhaTabela[2] = end.getEstagioPesquisa();
					novaLinhaTabela[3] = end.getDataInicioPesquisa();
					novaLinhaTabela[4] = end.getPesquisadorResponsavel();
					novaLinhaTabela[5] = end.getFase();
					novaLinhaTabela[6] = end.getQuantidadeDoses();
					
					model.addRow(novaLinhaTabela);
				
				}
			}

			private void limpartabela() {
				
				tblvacina.setModel(new DefaultTableModel(new Object[][] { nomesColunas, }, nomesColunas));
				
				
				
				
				
				
			}
		});
		btnPesquisar.setBounds(10, 23, 89, 35);
		contentPane.add(btnPesquisar);
		
		
		
		
		
		tblvacina = new JTable();
		tblvacina.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		tblvacina.setBounds(10, 112, 484, 165);
		contentPane.add(tblvacina);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(239, 23, 89, 35);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(338, 23, 89, 35);
		contentPane.add(btnExcluir);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.setBounds(109, 23, 89, 35);
		contentPane.add(btnNewButton);
	}
}
