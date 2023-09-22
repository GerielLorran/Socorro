package novo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Entrar extends JFrame {
   
   private static final long serialVersionUID = 1L;
   
   public Entrar(){}
   
   public Entrar(String titulo){
      
      super(titulo);
      
      this.configuraTela();
   }
   
   private void configuraTela(){
      
      this.setLayout(new FlowLayout());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setSize(250, 160);
      this.setLocation(550, 200);
      
      labelUsuario = new JLabel("Usuário:");
      add(labelUsuario);
      
      campoUsuario = new JTextField(15);
      campoUsuario.setText(null);
      campoUsuario.setVisible(true);
      add(campoUsuario);
      
      labelSenha = new JLabel("   Senha:");
      add(labelSenha);
      
      campoSenha = new JTextField(15);
      campoSenha.setText(null);
      campoSenha.setVisible(true);
      add(campoSenha);
      
      botaoEntrar = new JButton();
      botaoEntrar.setText("Entrar");
      add(botaoEntrar);
      botaoEntrar.addActionListener(new Sucesso());
      
      botaoCadastro = new JButton();
      botaoCadastro.setText("Cadastrar Usuário");
      add(botaoCadastro);
      
   }
   
   public String getUsuario(){
      return campoUsuario.getText();
   }
   
   private JButton botaoCadastro;
   private JButton botaoEntrar;
   private JTextField campoSenha;
   private JTextField campoUsuario;
   private JLabel labelUsuario;
   private JLabel labelSenha;
   
}
