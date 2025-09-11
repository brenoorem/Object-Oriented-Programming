import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        /*
        -- Calculadora de Médias --

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média de notas é: " + media);
         */

        //Calculadora de Salário

        Scanner sc =  new Scanner(System.in);
        double valor_hora_aula = 30.00;
        double desconto_inss, salario_bruto, salario_liquido;
        int aulas_dadas;

        System.out.print("Quantas aulas foram dadas?: ");
        aulas_dadas = sc.nextInt();

        salario_bruto = aulas_dadas * valor_hora_aula;

        if(salario_bruto>8157.41) {
            desconto_inss = 951.62;
            salario_liquido = salario_bruto - desconto_inss;
        }
        else if (salario_bruto<8157.41 && salario_bruto>4190.83){
            desconto_inss = 0.14;
            salario_liquido = salario_bruto - (salario_bruto * desconto_inss);
        }

        else if (salario_bruto<4190.83 && salario_bruto>2793.89){
            desconto_inss = 0.12;
            salario_liquido = salario_bruto - (salario_bruto * desconto_inss);
        }
        else if (salario_bruto<2793.89 && salario_bruto>1518.01){
            desconto_inss = 0.09;
            salario_liquido = salario_bruto - (salario_bruto * desconto_inss);
        }
        else{
            desconto_inss = 0.075;
            salario_liquido = salario_bruto - (salario_bruto * desconto_inss);
        }

        System.out.println("Salário Bruto: " + salario_bruto);
        if(desconto_inss > 1)
            System.out.println("Desconto INSS: Valor fixo de R$" + desconto_inss);
        else
            System.out.println("Desconto INSS: " + desconto_inss*100 + "%");

        System.out.println("Salário liquido: " + salario_liquido);
    }
}