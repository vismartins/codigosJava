package calculo_salarios;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Salarios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSalario;
	private JTextField txtPercentual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salarios frame = new Salarios();
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
	public Salarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora de Salarios");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel.setBounds(21, 11, 253, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Desenvolvimento de Software com Java");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(21, 36, 253, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salário");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(116, 74, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Percentual de desconto");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(21, 112, 142, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RESULTADOS");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(205, 211, 114, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblFerias = new JLabel("");
		lblFerias.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblFerias.setBounds(21, 242, 299, 14);
		contentPane.add(lblFerias);
		
		JLabel lblLiquido = new JLabel("");
		lblLiquido.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblLiquido.setBounds(21, 267, 298, 14);
		contentPane.add(lblLiquido);
		
		JLabel lblAnual = new JLabel("");
		lblAnual.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblAnual.setBounds(21, 292, 298, 14);
		contentPane.add(lblAnual);
		
		JLabel lblDecimo = new JLabel("");
		lblDecimo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblDecimo.setBounds(21, 317, 298, 14);
		contentPane.add(lblDecimo);
		
		JLabel lblNewLabel_5 = new JLabel("Desenvolvido por v s martins");
		lblNewLabel_5.setFont(new Font("Lucida Sans", Font.ITALIC, 11));
		lblNewLabel_5.setBounds(189, 371, 169, 14);
		contentPane.add(lblNewLabel_5);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(189, 71, 130, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtPercentual = new JTextField();
		txtPercentual.setBounds(188, 109, 86, 20);
		contentPane.add(txtPercentual);
		txtPercentual.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double salario = Double.parseDouble(txtSalario.getText());
				double percentual = Double.parseDouble(txtPercentual.getText());
				
				double resultado = salario-(salario/100)*percentual;
				double anual = resultado*12;
				double decimo = resultado;
				double ferias = (salario/3)+resultado;
				
				DecimalFormat formato = new DecimalFormat("#0.00");
				String resultadoFormatado = formato.format(resultado);
				String anualFormatado = formato.format(anual);
				String decimoFormatado = formato.format(decimo);
				String feriasFormatado = formato.format(ferias);
				
				lblLiquido.setText("Valor Mensal: R$ "+resultadoFormatado);
				lblAnual.setText("Valor Anual: R$ "+anualFormatado);
				lblDecimo.setText("Valor 13° Salario: R$ "+decimoFormatado);
				lblFerias.setText("Valor de Férias: R$ "+feriasFormatado);
			}
		});
		btnCalcular.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnCalcular.setBounds(189, 147, 130, 42);
		contentPane.add(btnCalcular);
	}
}
