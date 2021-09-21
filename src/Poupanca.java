public class Poupanca extends ContaBancaria{ // herença da conta bancaria (mesmos atributos)
    
    // Poupanca é uma subclasse de Conta Bancaria

    private static double taxaRendimento; // quando for atributo tipo static, acessar usando o nome da classe.


    public Poupanca(String numero, String agencia){

        super(numero, agencia); //o super chama o construtor de ContaBancaria
    }
    
    public static double getTaxaRendimento() { 
		return taxaRendimento;
	}

    public static void setTaxaRendimento(double TaxaRendimento) {
		Poupanca.taxaRendimento = taxaRendimento;
	}
    //taxa para calcular rendimento declarada como atributo

    public void rendimento(){

        double rendimento = this.getSaldo() * Poupanca.getTaxaRendimento();
        double novoSaldo = this.getSaldo() + rendimento;

        this.setSaldo(novoSaldo);

    }

    public void rendimentoBonus(double taxaBonus){

        double rendimentoBonus = this.getSaldo() * taxaBonus;
        double novoSaldo = this.getSaldo() + rendimentoBonus;

        this.setSaldo(novoSaldo);

    }

    public void creditar(double credito){
        double novosaldo = this.getSaldo() + credito;
        this.setSaldo(novosaldo);
    }

    public static void main(String[] args) {
       // Poupanca p = new Poupanca();
       // p.getAgencia();

        //ContaBancaria cBancaria = new ContaBancaria();

    }
}
