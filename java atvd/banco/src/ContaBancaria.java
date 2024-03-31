public class ContaBancaria {

    private int numConta;
    private String nome;
    private float saldo;

    public ContaBancaria(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(float valor){
        saldo += valor; 
        System.out.print("Deposito de R$"+valor+" realizado com sucesso");
        System.out.print("\n");
    }

    public void sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$"+valor+" feito com sucesso\n");
        }else{
            System.out.println("Você esta pobre não tem esse valor!\n");
        }
    }
    
    public float consultarSaldo(){
        return saldo;
    }

}
