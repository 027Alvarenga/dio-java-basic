import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Crio o Scanner para ler os dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        //Variáveis a serem utilizadas
        int numeroConta = 1021;
        String Agencia = "067-8", NomeCliente = "Jose Marcio";
        double saldo = 237.48;
        final int senha = 9098;
        
        //Solicitação dos dados da conta
        System.out.println("Por favor, insira o numero da agencia !");
        numeroConta = sc.nextInt();

        System.out.println("Insira a senha de 4 digitos para acessar os demais dados da sua conta:");
        int recebeSenha = sc.nextInt();
        
        //Logica para conferir se a senha está correta
        if(recebeSenha != senha){
            System.out.println("Senha incorreta!");
            System.out.println("Digite a senha novamente:");
            recebeSenha = sc.nextInt();
        } 

        System.out.println("Ola " + NomeCliente + ", obrigador por criar uma cotna em nosso banco, sua agencia e " + Agencia + " , conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque");


        sc.close();
    }
}
