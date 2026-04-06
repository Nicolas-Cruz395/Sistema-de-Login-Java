import java.util.Scanner;

public class Login{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String nome = "";
        String user_criado = "";
        String senha_criada = "";
        int idade = 0;
        int limite = 3;
        int tentativa = 0;
        String user_digitado = "";
        String senha_digitada = "";


        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        if(idade < 18){
            System.out.println("Você é menor de idade, acesso não autorizado.");
            return;
        } else {
            System.out.printf("Olá %s, Seja muito bem vindo!", nome);
        }

        System.out.println("\nCrie um User: ");
        user_criado = sc.nextLine();

        System.out.println("Crie uma senha: ");
        senha_criada = sc.nextLine();

        System.out.println("\nUsuario e senha de acesso criado com sucesso!");

        while (tentativa < limite){

            System.out.println("Digite seu User: ");
            user_digitado = sc.nextLine();

            System.out.println("Digite sua senha: ");
            senha_digitada = sc.nextLine();

            if(user_digitado.equals(user_criado) && senha_digitada.equals(senha_criada)){
              System.out.printf("Acesso Autorizado!\nSeja bem vindo ao nosso servidor %s", nome);
              break;

        }   else if(!user_digitado.equals(user_criado) && senha_digitada.equals(senha_criada)){
              System.out.println("User incorreto!");
              tentativa++;

        }   else if(user_digitado.equals(user_criado) && !senha_digitada.equals(senha_criada)){
              System.out.println("Senha incorreta!");
              tentativa++;

        }   else {
              System.out.println("Usuario e Senha Incorreto!");
              tentativa++;
        }

            if(tentativa >= limite){
               System.out.println("Limite de tentativas ultrapassado, Acesso bloqueado!");
               break;

        }   else {
              System.out.printf("Você tem %d tentativa(s) restante(s).\n", (limite - tentativa));
        }
        }

        sc.close();

    }
} 
