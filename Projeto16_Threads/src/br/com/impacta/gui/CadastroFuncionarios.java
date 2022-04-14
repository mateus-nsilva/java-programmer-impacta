package br.com.impacta.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.DocumentoCpf;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;
import java.awt.Color;

public class CadastroFuncionarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumento;
	private JTextField txtNome;
	private JTextField txtCargo;
	private JTextField txtIdade;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroFuncionarios frame = new CadastroFuncionarios();
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
	public CadastroFuncionarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cadastro de Funcionário");
		setBounds(100, 100, 510, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 482, 425);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Documento:");
		lblNewLabel.setBounds(10, 11, 92, 14);
		panel.add(lblNewLabel);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 54, 65, 14);
		panel.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 90, 46, 14);
		panel.add(lblIdade);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 133, 46, 14);
		panel.add(lblSexo);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 175, 46, 14);
		panel.add(lblCargo);

		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setBounds(10, 217, 46, 14);
		panel.add(lblSalrio);

		txtDocumento = new JTextField();
		txtDocumento.setBounds(112, 11, 138, 20);
		panel.add(txtDocumento);
		txtDocumento.setColumns(10);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(112, 54, 138, 20);
		panel.add(txtNome);

		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(112, 175, 138, 20);
		panel.add(txtCargo);

		JComboBox<Sexo> cmbSexo = new JComboBox();
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(112, 132, 138, 22);
		panel.add(cmbSexo);

		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(112, 90, 138, 20);
		panel.add(txtIdade);

		txtSalario = new JTextField();
		txtSalario.setColumns(10);
		txtSalario.setBounds(112, 217, 138, 20);
		panel.add(txtSalario);

		JButton btnIncluirFuncionario = new JButton("Incluir funcion\u00E1rio");
		btnIncluirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Obtendo documento
					Documento documento;
					String doc = txtDocumento.getText();

					if (doc.length() == 11) {
						documento = new DocumentoCpf(doc);
					} else if (doc.length() == 14) {
						documento = new DocumentoCnpj(doc);
					} else {
						throw new Exception("O documento informado não é CPF nem CNPJ");
					}

					// Obtendo o nome
					String nome = txtNome.getText();

					// Obtendo a idade
					int idade = Integer.parseInt(txtIdade.getText());

					// Obtendo o sexo
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();

					// Obtendo o cargo
					String cargo = txtCargo.getText();

					// Obtendo o salário
					double salario = Double.parseDouble(txtSalario.getText());

					Funcionario funcionario = new Funcionario(nome, idade, sexo, documento, cargo, salario);
					
					//apresentando os dados.
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, funcionario.mostrar());
					// funcionario.setDocumento(documento);
					// funcionario.setNome(nome);
					// funcionario.setIdade(idade);
					// funcionario.setSexo(sexo);
					// funcionario.setCargo(cargo);
					// funcionario.setSalario(salario);

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, "Erro: " + e2.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIncluirFuncionario.setBounds(10, 260, 168, 23);
		panel.add(btnIncluirFuncionario);
		
		JButton btnGerarArquivo = new JButton("Gerar Arquivo");
		btnGerarArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Obtendo documento
					Documento documento;
					String doc = txtDocumento.getText();

					if (doc.length() == 11) {
						documento = new DocumentoCpf(doc);
					} else if (doc.length() == 14) {
						documento = new DocumentoCnpj(doc);
					} else {
						throw new Exception("O documento informado não é CPF nem CNPJ");
					}

					// Obtendo o nome
					String nome = txtNome.getText();

					// Obtendo a idade
					int idade = Integer.parseInt(txtIdade.getText());

					// Obtendo o sexo
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();

					// Obtendo o cargo
					String cargo = txtCargo.getText();

					// Obtendo o salário
					double salario = Double.parseDouble(txtSalario.getText());
					
					
					FileWriter writer = new FileWriter("C:\\Eclipse\\Workspace\\Arquivos\\funcionarios.csv", true);
					
					StringBuilder sb = new StringBuilder();
					sb.append(nome).append(";")
					  .append(idade).append(";")
					  .append(sexo).append(";")
					  .append(doc).append(";")
					  .append(cargo).append(";")
					  .append(salario).append("\n");
					
					writer.write(sb.toString());
					writer.close();
					
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, "Dados gerados com sucesso!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, "Erro: " + e2.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnGerarArquivo.setBounds(190, 260, 114, 23);
		panel.add(btnGerarArquivo);
		
		JComboBox<Funcionario> cmbFuncionario = new JComboBox();
		cmbFuncionario.setBackground(new Color(255, 255, 255));
		cmbFuncionario.setBounds(10, 356, 168, 22);
		panel.add(cmbFuncionario);
		
		JButton btnGerarLista = new JButton("Gerar Lista");
		btnGerarLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader reader = new FileReader("C:\\Eclipse\\Workspace\\Arquivos\\funcionarios.csv");
					BufferedReader buffer = new BufferedReader(reader);
					
					List<Funcionario> listaFuncionarios = new ArrayList<>();
					
					while(true) {
						String linha = buffer.readLine();
						
						if(linha == null || linha.length() == 0) {
							break;
						}
						
						//Cada linha do excel representa um objeto funcionario
						String[] itens = linha.split(";");
						
						Funcionario func = new Funcionario(
								itens[0],
								Integer.parseInt(itens[1]),
								itens[2].equalsIgnoreCase("Masculino") ? Sexo.MASCULINO: Sexo.FEMININO,
								itens[3].length() == 11 ? new DocumentoCpf(itens[3]) : new DocumentoCnpj(itens[3]),
								itens[4],
								Double.parseDouble(itens[5])
								);
						
						listaFuncionarios.add(func);
					}
					
					//for na lista de funcionarios
					cmbFuncionario.removeAllItems();
					for (Funcionario funcionario : listaFuncionarios) {
						//Adicionar cada funcionario no combobox
						cmbFuncionario.addItem(funcionario);
					}
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroFuncionarios.this, 
							"Erro: " + e2.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnGerarLista.setBounds(326, 260, 104, 23);
		panel.add(btnGerarLista);
		
		JLabel lblFuncionriosCadastrados = new JLabel("Funcion\u00E1rios Cadastrados");
		lblFuncionriosCadastrados.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFuncionriosCadastrados.setBounds(10, 325, 180, 20);
		panel.add(lblFuncionriosCadastrados);
	}
}
