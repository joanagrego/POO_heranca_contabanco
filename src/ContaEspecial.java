public class ContaEspecial extends ContaCorrente{
    // o final em classes impede que eu tenha uma classe filha.
    // classe neta
    public ContaEspecial(String numero, String agencia){ //construtor de Conta Especial
        super(numero, agencia);
    }

    public ContaEspecial(String numero){ //construtor sem parametros
        super(numero, "0001");
    }

    public ContaEspecial(){

        super("numero", "0001");      
    }

    public static void main(String[] args) {

        //  ContaEspecial contaEspecial = new ContaEspecial(); //sem parametros
       //   ContaEspecial contaEspecial1 = new ContaEspecial("", "");
      //    contaEspecial.getAgencia();
     //     contaEspecial.getChequeEspecial();

    }
}
