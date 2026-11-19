import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        /*
    Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
        Consultar saldo -> FEITO
        consultar cheque especial -> FEITO
        Depositar dinheiro; -> FEITO
        Sacar dinheiro; -> FEITO
        Pagar um boleto. -> FEITO
        Verificar se a conta está usando cheque especial. -> FEITO

    Siga as seguintes regras para implementar

    A conta bancária deve ter um limite de cheque especial somado ao saldo da conta; -> FEITO

    O o valor do cheque especial é definido no momento da criação da conta, de acordo -> FEITO
    com o valor depositado na conta em sua criação;

    Se o valor depositado na criação da conta for de R$500,00 <= menos o cheque especial deve ser de R$50,00 -> FEITO
    Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado; -> FEITO

    Caso o limite de cheque especial seja usado, assim que possível a conta deve
    cobrar uma taxa de 20% do valor usado do cheque especial. -> FEITO
*/
        var scanner = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria(400.00);
        conta1.saque(420.00);
        conta1.verificarCheuqueEmUso();
        System.out.println("Seu saldo é de R$ " + conta1.getSaldo());
        System.out.println("Seu cheque especial é de R$ " + conta1.getChequeEspecial());
    }
}