import java.util.Scanner;

public class Login{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String user_criado = "";
        String senha_criada = "";
        int idade = 0;
        boolean sistema = true;
        int tentativa = 0;
        int limite = 3;

        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.print("Qual sua idade? ");
        idade = sc.nextInt();
        sc.nextLine();

        if(idade < 18){
        System.out.println("Acesso não Liberado, Você é menor de idade.");
        return;
        } else {
        System.out.println("");
        }

        System.out.printf("Olá %s Seja Bem Vindo!\n", nome);

        System.out.println("Crie um User: ");
        user_criado = sc.nextLine();

        System.out.println("Crie uma Senha: ");
        senha_criada = sc.nextLine();

        while (sistema){

            System.out.println("Digite seu User: ");
            String user = sc.nextLine();
            
            System.out.println("Digite sua Senha: ");
            String senha = sc.nextLine();

            if(user.equals(user_criado) && senha.equals(senha_criada)){
                System.out.println("Acesso Autorizado!");
                sistema = false;

            } else if(!user.equals(user_criado) && senha.equals(senha_criada)){
                System.out.println("User Incorreto!");
                tentativa++;

            } else if(user.equals(user_criado) && !senha.equals(senha_criada)){
                System.out.println("Senha Incorreta!");
                tentativa++;

            } else {
                System.out.println("User e Senha Incorretos!");
                tentativa++;
            }
            if (tentativa >= limite){
                System.out.println("Limite de tentativa ultrapassado!");
                sistema = false;
            } else {
                System.out.printf("Você tem %d tentativas restante.\n", (limite - tentativa));
            }
        }   
    }
}