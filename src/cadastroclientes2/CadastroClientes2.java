
package cadastroclientes2;

public class CadastroClientes2 {
    public static void main(String[] args) {
        
        //Instanciar os objetos
        UICadastroCliente formulario = new UICadastroCliente();
        Pessoa cliente = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
        
    }    
}
