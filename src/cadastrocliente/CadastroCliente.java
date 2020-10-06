/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrocliente;

import com.sun.nio.sctp.PeerAddressChangeNotification;

/**
 *
 * @author User
 */
public class CadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UICadastroCliente formulario = new UICadastroCliente();
        Pessoa cliente = new Pessoa(0, formulario.nome, formulario.cpf, formulario.sexo, 
                formulario.endereco, formulario.cidade, formulario.estado);
        
        
    }
    
}
