
package sistemaimpostos;

import java.util.Scanner;

public class SistemaImpostos {

    
    public static void main(String[] args) {    
        
        Scanner entrada = new Scanner(System.in);
        String nomeEmpresa;
        String opcao;
                    
                System.out.println("----Calculadora de Impostos----");
                System.out.print("Digite o nome da empresa : ");
                nomeEmpresa = entrada.nextLine();
                
                Pagamentos pagamentos = new Pagamentos(nomeEmpresa);
                
            do{

                System.out.print("Digite (1) para PIS, Digite (2) para IPI, Digite PARE para encerrar : ");
                opcao = entrada.nextLine();
                
                System.out.println();
                
            if( !"1".equals(opcao) && !"2".equals(opcao) && !"PARE".equalsIgnoreCase(opcao)){
                
                System.out.println("Opcao invalida \n");
            } 
            
            if("1".equals(opcao)){
                    
                    double valorCredito;
                    double valorDebito;
                    
                System.out.print("Qual o valor do Debito : ");
                valorDebito = entrada.nextDouble();
                
                System.out.print("Qual o valor do credito : ");
                valorCredito = entrada.nextDouble();
                
                System.out.println();
                
                entrada.nextLine();
                
                Pis pis1 = new Pis( valorDebito, valorCredito);
                
                pagamentos.adicionarImposto(pis1);
                
            }else if("2".equals(opcao)){
                
                    double valor;
                    double frete;
                    double seguro;
                    double despesas;
                    double aliquota;

                System.out.print("Qual o valor do Produto : ");
                valor = entrada.nextDouble();
                System.out.print("Qual o valor do Frete : ");
                frete = entrada.nextDouble();
                System.out.print("Qual o valor do seguro : ");
                seguro = entrada.nextDouble();
                System.out.print("Qual o valor das Despesas : ");
                despesas = entrada.nextDouble();
                System.out.print("Qual o valor da liquota : ");
                aliquota = entrada.nextDouble();
                
                System.out.println();
                
                Ipi ipi1 = new Ipi(valor, frete, seguro,despesas,aliquota);
                
                pagamentos.adicionarImposto(ipi1);
                
                entrada.nextLine();
            }
             
            }while(!opcao.equalsIgnoreCase("PARE"));
            
            pagamentos.mostrarImposto();
    }
}
