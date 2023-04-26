import java.util.Scanner;

public class ControleFluxo extends NumeroInvalido{
    public ControleFluxo(String code, String message) {
        super(code, message);
    }

    public static void main(String[] args){
		int PrimeiroNumero;
		int SegundoNumero;

        try (Scanner Valor = new Scanner(System.in)) {
            System.out.println("Digite o Primeiro Número e tecle ENTER");
            PrimeiroNumero = Valor.nextInt();

            System.out.println("Digite o Segundo Número e tecle ENTER");
            SegundoNumero = Valor.nextInt();

            try {
                contar(PrimeiroNumero, SegundoNumero);		
            }catch (NumeroInvalido e) {
                System.out.println(e.getMessage());
            }
        }
	}

    static void contar(int PrimeiroNumero, int SegundoNumero ) throws NumeroInvalido {
        if(PrimeiroNumero > SegundoNumero){
            throw new NumeroInvalido(null, "O Segundo Número deve ser maior que o Primeiro Número", null);
        }
        else{
            int contagem = SegundoNumero - PrimeiroNumero;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o Número " + i);
            }
        }
	}
}