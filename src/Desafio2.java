import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
        int Maius = 0;
        int Minus = 0;
        int Dig = 0;
        int CaractereEspecial = 0;
        
        System.out.print("Pro favor, insira a sua senha: ");
        Scanner sc = new Scanner(System.in);
        String senha = sc.next();
        
        if(senha.length() < 6) {
            int digitosRestantes = 6 - senha.length();
            System.out.printf("Sua senha ainda não é segura. ela possui menos de 6 dígitos, por favor, insira mais %d dígitos", digitosRestantes);
        }
        
        for(int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if(Character.isUpperCase(c)) {
                Maius += 1;
            }
            else if(Character.isLowerCase(c)) {
                Minus += 1;
            }
            else if(Character.isDigit(c)) {
                Dig += 1;
            }
            else if(senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*") || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
                CaractereEspecial +=1;
            }
            
        }
        
        if(Maius == 0) {
            System.out.println("Sua não possui letra maiúscula");
        }
        else if(Minus == 0) {
            System.out.println("Sua senha não possui letra miúscula");
        }
        else if(Dig == 0) {
            System.out.println("Sua senha não possui no minimo 8 dígito");
        }
        else if(CaractereEspecial == 0) {
            System.out.println("Sua senha não possui caractere especial");
        }
        else {
            System.out.println("Sua senha é segura!");
        }
        
        sc.close();
    }

}


