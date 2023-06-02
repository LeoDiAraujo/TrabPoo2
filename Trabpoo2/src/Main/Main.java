import Login.FormularioLogin;
import Cadastro.FormularioCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormularioLogin login = new FormularioLogin();
                login.setTitle("Login");
                login.setVisible(true);
            }
        });
        panel.add(loginButton);

        JButton cadastroButton = new JButton("Cadastro");
        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FomularioCadastro cadastro = new FomularioCadastro();
                cadastro.setTitle("Cadastro");
                cadastro.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}