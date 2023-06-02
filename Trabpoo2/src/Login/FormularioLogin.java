package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormularioLogin extends JFrame {
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public FormularioLogin() {
        super("Login");
        setLayout(null);

        userLabel = new JLabel("Usuário");
        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        add(userText);

        passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(10, 40, 80, 25);
        add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        add(passwordText);

        loginButton = new JButton("Enter");
        loginButton.setBounds(10, 80, 80, 25);
        add(loginButton);

        registerButton = new JButton("Não tem login? Cadastre-se!");
        registerButton.setBounds(100, 80, 200, 25);
        add(registerButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Envia as informações ao banco de dados
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Muda para a tela de Cadastro
            }
        });

        setSize(320, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioLogin();
    }
}