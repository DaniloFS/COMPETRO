
package br.com.competro.presentation.console;


import br.com.competro.domainModel.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Danilo
 * @author Hugo
 * @author Ary
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try {
            Context context = new InitialContext();
            ClienteRepository clienteEjb = (ClienteRepository) context.lookup("java:global/Competro/Competro-ejb/ClienteDAO");
            ProdutoRepository produtoEjb =(ProdutoRepository) context.lookup("java:global/Competro/Competro-ejb/ProdutoDAO");
            FornecedorRepository fornecedorEjb = (FornecedorRepository) context.lookup("java:global/Competro/Competro-ejb/FornecedorDAO");
            CompraRepository compraEjb = (CompraRepository) context.lookup("java:global/Competro/Competro-ejb/CompraDAO");
            VendaRepository vendaEjb = (VendaRepository) context.lookup("java:global/Competro/Competro-ejb/VendaDAO");
            UsuarioRepository usuarioEjb = (UsuarioRepository) context.lookup("java:global/Competro/Competro-ejb/UsuarioDAO");
            EnderecoRepository enderecoEjb = (EnderecoRepository) context.lookup("java:global/Competro/Competro-ejb/EnderecoDAO");
            
            Cliente cliente = new Cliente();
            cliente.setNome("Hugo");
            cliente.setCpf("1212324354");
            
            cliente.setNumero("457");
            cliente.setRua("Putigen");
            cliente.setBairro("Sion");
            cliente.setCidade("Montes Claros");
            cliente.setCep("39400-300");
                        
            clienteEjb.salvar(cliente);
            
            Produto produto = new Produto();
           
            produto.setDescricao("Graxo");
            produto.setValorUnitario(10);
            produtoEjb.salvar(produto);
            
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setNome("Petrobraz");
            fornecedor.setCnpj("412514265234");
            fornecedor.setNumero("1");
            fornecedor.setRua("SantoAgostinho");
            fornecedor.setBairro("JK");
            fornecedor.setCidade("MOC");
            fornecedor.setCep("39400-000");
            fornecedorEjb.salvar(fornecedor);
            
            Usuario usuario = new Usuario();
            usuario.setLogin("hugo");
            usuario.setSenha("123");
            usuario.setNome("Hugo Santos");
            usuarioEjb.salvar(usuario);
            
            Compra compra = new Compra();
            
            Venda venda = new Venda();
            
            
        } catch (NamingException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        }
        // TODO code application logic here
    }
}
