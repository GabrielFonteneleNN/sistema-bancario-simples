import java.util.Scanner;

public class ContaBancaria {

    private final Double valorChequeOriginial;
    private Double saldo;
    private Double chequeEspecial;
    private Double limiteChequeEspecial;

    //METODO PARA A CRIAÇÃO DE CONTA + CALCULO DE CHEQUE ESPECIAL DE ACORDO COM SALDO

    public ContaBancaria (Double saldo) {
        this.saldo = saldo;
        if (saldo <= 500.00) {
            chequeEspecial = 50.00;
        } else if (saldo > 500.00) {
            chequeEspecial = (saldo * 0.5);
        }
        this.valorChequeOriginial = this.chequeEspecial;
    }

    /*
    *METODO DE DEPÓSITO NA CONTA
    *
    *(aqui foi utilizado void porque esse metodo é para somente realizar uma ação, a de depositar, não de mostrar nada de volta)
    * */

    public void depositar (Double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    /*METODO DE SAQUE DO SALDO
    *
    *O valor do saque cabe no saldo -> só subtrai do saldo.
    *O valor não cabe no saldo, mas cabe no saldo + cheque especial -> usa o cheque.
    *O valor não cabe em nenhum dos dois -> operação negada.
    * */

    public void saque (Double valorSaque) {

        //VARIAVEL LIMITE CHEQUE ESPECIAL É A SOMA DO SALDO DA CONTA + CHEQUE ESPECIAL

        limiteChequeEspecial = this.saldo + this.chequeEspecial;
        if (valorSaque <= saldo) {
            this.saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso");
        } else if (valorSaque > saldo && valorSaque <= limiteChequeEspecial) {
            Double restoValorCheque = valorSaque - saldo;
            var scanner = new Scanner(System.in);
            System.out.println("Valor do saldo insuficiente para saque. Deseja utilizar saldo disponivel e cheque especial para saque? digite true(sim) pu false(não)");
            var escolhaSaque = scanner.nextBoolean();
            if (escolhaSaque == true) {
                chequeEspecial = chequeEspecial - restoValorCheque;
                saldo = 0.0;
            } else {
                System.out.print("Operação encerrada");
            }
        } else {
            System.out.println("Saldo insuficiente. Operação encerrada");
        }
    }

    /*METODO DE PAGAMENTO DE BOLETO
    *
    *Esse metodo utiliza a mesma estrutura do metodo saque, pois ele segue o mesmo raciocinio.
    * */

    public void pagarBoleto (Double valorBoleto) {
        this.saque(valorBoleto);
    }

    /*METODO DE VERIFICAR SE O CHEQUE ESPECIAL ESTÁ SENDO USADO
    *
    * (Caso o cheque especial seja usado, deve ser cobrado 20% em cima do valor que foi utilizado pelo cheque especial)
    * */

    public void verificarCheuqueEmUso () {
        if (valorChequeOriginial == chequeEspecial) {
            System.out.println("Cheque especial não está em uso");
        } else {
            System.out.println("Cheque especial em uso. Será cobrado uma taxa de 20% em cima do valor gasto no cheque especial");
            Double taxaChequeEspecial = (valorChequeOriginial - chequeEspecial) * 0.2;
            System.out.println("Taxa a ser paga será de R$ "+ taxaChequeEspecial + " reais.");
        }
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public Double getLimiteChequeEspecial() {
        return this.limiteChequeEspecial;
    }
}
