import java.util.Scanner;

public class Main {
    
    //Atributos
    double valorImovel;
    int parcelas;
    double jurosMensais;

    //Metodos
    Main(double ValorImovelUsuario, int ParcelasCasa){
        this.valorImovel = ValorImovelUsuario;
        this.parcelas = ParcelasCasa;
        return;
    }

    double Valorparcelas(){
            return valorImovel / parcelas;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.println(("Qual o valor da casa?"));
        double ValorCasaUsuario = sc.nextDouble();
        System.out.println("Quantas parcelas?");
        int ParcelasUsuario = sc.nextInt();
        Main Casa1 = new Main(ValorCasaUsuario,ParcelasUsuario);
        System.out.println("Valor Mensal das Parcelas:"+Casa1.Valorparcelas());
    }     
}