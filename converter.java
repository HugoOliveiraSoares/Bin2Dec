import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        
        String numero_binario = "";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número binario: ");
        numero_binario = teclado.nextLine();

        if (numero_binario.equals(""))
            System.out.println("Digite algum valor");
        else if (validate_input(numero_binario))
            System.out.println("Digite somente 0's e 1's");
        else
            System.out.println("Decimal: "+bin2dec(numero_binario));
        
        teclado.close();

    }

    // Returns false if the binary String not contains anything other than 0 or 1
    public static boolean validate_input(String bin) {
        
        boolean flag = false;

        for (int aux = 0; aux < bin.length(); aux++) {
            if (bin.split("")[aux].compareTo("1") > 0)
                flag = true;
        }
        return flag;
    }

    public static int bin2dec(String bin)
    {
        int decimal = 0;
        for (int aux = bin.length() - 1; aux >= 0; aux--)
        {
            decimal += Integer.parseInt(bin.split("")[aux]) 
                * Math.pow(2, bin.length() - 1 - aux);
        }

        return decimal;
    }

}