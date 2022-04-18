package telasGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPaciente extends JFrame {

    private JTextField edtNome;
    private JTextField edtCpf;
    private JTextField edtEndereco;
    private JTextField edtFone;
    private JTextField edtPeso;
    private JTextField edtAltura;
    private JTextField edtIdade;

    public TelaPaciente() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        setSize(600, 400);
        setTitle("Sistema ");
        JPanel painel = new JPanel();
        painel.setLayout(null);
        JLabel label = new JLabel();
        label = new JLabel("Olá mundo !");
        painel.add(label);
        label.setBounds(250, 150, 300, 50);
        add(painel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
         */
    }
}
