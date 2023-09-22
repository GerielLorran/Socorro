/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CyberPhoenix
 */
public class Sucesso implements ActionListener{
   
   @Override
   public void actionPerformed(ActionEvent evento){
      
      String click = evento.getActionCommand();
      Entrar entrar = new Entrar();
      
      if("Entrar".equals(click) && (""/* || entrar.getSenha() == ""*/.equals(entrar.getUsuario())))
         JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
      
      else
         JOptionPane.showMessageDialog(null, "Funcionou");
      
   }

}
