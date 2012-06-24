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
            cliente.setNome("Ariolano");
            cliente.setCpf("1212324354");
            clienteEjb.salvar(cliente);
            
            Produto produto = new Produto();
           
            produto.setDescricao("Oleo para motor");
            produto.setValorUnitario(2);
            produtoEjb.salvar(produto);
            
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setNome("Petrobraz");
            fornecedor.setCnpj("412514265234");
            fornecedorEjb.salvar(fornecedor);
            
            Usuario usuario = new Usuario();
            usuario.setLogin("hugo");
            usuario.setSenha("123");
            usuario.setNome("Hugo Santos");
            usuarioEjb.salvar(usuario);
            
            Compra compra = new Compra();
            
            Venda venda = new Venda();
            
            Endereco endereco = new Endereco();
            endereco.setNumero("123");
            endereco.setRua("nove");
            endereco.setBairro("dez");
            endereco.setCidade("Montes Claros");
            endereco.setCep("21323621");
            enderecoEjb.salvar(endereco);
            
            
        } catch (NamingException e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
        }
        // TODO code application logic here
    }
}
