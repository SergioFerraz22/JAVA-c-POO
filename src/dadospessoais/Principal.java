
package dadospessoais;

public class Principal {
    public static void main(String args[ ]){
            
            //instaciando um cliente
            RegistroCliente cliente = new RegistroCliente("Roberto","Rua alegria", "Botafogo", "rio de janeiro", "RJ", "5555-5555" , 876543210, 12345678, 5000, "Centro", 22012222);
            
            //instanciando um fornecedor
                RegistroFornecedor fornecedor = new RegistroFornecedor("Carla","rua das dores","copacabana","rio de janeiro", "RJ", 56487995, "7777-777", 20843834, 10000, "Dinheiro", "7777777777777", "joao");
                
                //instaciando uma transportadora
                //RegistroTransportadora transportadora = new RegistroTransportadora("Transportes express","rua big big","madureira","rio de janeiro", "2222-2222","20758264", 878243219, 20000, "CartÑo Credito", "555555555", "Maria");
                
                //Mostrando os dados do cliente
                System.out.println("Mostrando os dados do cliente \n");
                System.out.println("Nome: " + cliente.getNome()  );
                System.out.println("Endereco: " + cliente.getEndereco()  );
                System.out.println("Bairro: " + cliente.getBairro() );
                System.out.println("Cidade: " + cliente.getCidade() );
                System.out.println("Telefone: " + cliente.getTelefone() );
                System.out.println("CEP: " + cliente.getCep() );
                System.out.println("CPF: " + cliente.getCpf() );
                System.out.println("Limite de Credito: " + cliente.getLimiteCredito() );
                System.out.println("Local de Trabalho: " + cliente.getLocalTrabalho() );
                System.out.println("Telefone de contato: " + cliente.getTelefoneContato() );
                System.out.println("\n-----------------------------------\n");
                
                //Mostrando os dados do fornecedor
                System.out.println("Mostrando os dados do fornecedor \n");
                System.out.println("Nome: " + fornecedor.getNome()  );
                System.out.println("Endereco: "  + fornecedor.getEndereco() );
                System.out.println("Bairro: " + fornecedor.getBairro() );
                System.out.println("Cidade: " + fornecedor.getCidade() );
                System.out.println("Telefone: " + fornecedor.getTelefone() );
                System.out.println("CEP: " + fornecedor.getCep());
                System.out.println("CNPJ: " + fornecedor.getCnpj() );
                System.out.println("Limite de Venda: " + fornecedor.getLimiteVenda() );
                System.out.println("Forma de Pagamento: " + fornecedor.getFormaPagamento() );
                System.out.println("Inscri¡Ño Estadual: " + fornecedor.getInscricaoEstadual() );
                System.out.println("Representante Comercial: " + fornecedor.getRepresentanteComercial() ) ;
                System.out.println("\n-----------------------------------\n");
                
                //Mostrando os dados da transportadora
                /*
                System.out.println("Mostrando os dados da transportadora \n");
                System.out.println("Nome: " + transportadora.getNome()  );
                System.out.println("Endereco: "  + transportadora.getEndereco() );
                System.out.println("Bairro: " + transportadora.getBairro() );
                System.out.println("Cidade: " + transportadora.getCidade() );
                System.out.println("Telefone: " + transportadora.getTelefone() );
                System.out.println("CEP: " + transportadora.getCep());
                System.out.println("CNPJ: " + transportadora.getCnpj() );
                System.out.println("Limite de Venda: " + transportadora.getLimiteVenda() );
                System.out.println("Forma de Pagamento: " + transportadora.getFormaPagamento() );
                System.out.println("Inscri¡Ño Estadual: " + transportadora.getInscricaoEstadual() );
                System.out.println("Representante Comercial: " + transportadora.getRepresentanteComercial() ) ;
                */
                
    }
}// fim da classe



