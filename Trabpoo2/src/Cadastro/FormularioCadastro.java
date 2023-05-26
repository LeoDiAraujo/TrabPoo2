
package Cadastro;

import javax.swing.*;
import java.awt.event.*;

public class FormularioCadastro extends JFrame {
    private JLabel labelNomeReal;
    private JLabel labelLogin;
    private JLabel labelSenha;
    private JTextField campoNomeReal;
    private JTextField campoLogin;
    private JPasswordField campoSenha;
    private JButton botaoEnviar;
    private JButton botaoLogin;

    public FormularioCadastro() {
        super("Formulário de Cadastro");
        setLayout(null);

        labelNomeReal = new JLabel("Nome real:");
        labelNomeReal.setBounds(10, 10, 80, 25);
        add(labelNomeReal);

        campoNomeReal = new JTextField(20);
        campoNomeReal.setBounds(100, 10, 160, 25);
        add(campoNomeReal);

        labelLogin = new JLabel("Login:");
        labelLogin.setBounds(10, 45, 80, 25);
        add(labelLogin);

        campoLogin = new JTextField(20);
        campoLogin.setBounds(100, 45, 160, 25);
        add(campoLogin);

        labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(10, 80, 80, 25);
        add(labelSenha);

        campoSenha = new JPasswordField(20);
        campoSenha.setBounds(100, 80, 160, 25);
        add(campoSenha);

        botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(10, 115, 260, 25);
        add(botaoEnviar);

        botaoLogin = new JButton("Caso já tenha cadastro, faça o login aqui");
        botaoLogin.setBounds(10, 150, 260, 25);
        add(botaoLogin);

        setSize(280, 215);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioCadastro();
    }
}