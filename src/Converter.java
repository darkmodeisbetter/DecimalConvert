import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        //User inputs 3 decimal numbers
        System.out.println("A program that takes 3 user decimal inputs. The first input is converted to binary, the second to hexadecimal and the third to octal.");
        Scanner result = new Scanner(System.in).useDelimiter("\\s");
        System.out.print("Enter 3 Decimal Numbers: ");

        //Convert 1st decimal input to binary.
        int decimal = result.nextInt();
        StringBuilder binary = new StringBuilder();
        System.out.print(decimal + " Converted to Binary: ");
        while(decimal > 0){
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal = decimal / 2;
        }
        System.out.print(binary.reverse());
        System.out.println();

        //Convert 2nd decimal input to Hexadecimal
        int dec2 = result.nextInt();
        System.out.print(dec2 + " Converted to Hexadecimal: ");
        int rem2;
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while(dec2>0)
        {
            rem2=dec2%16;
            hex.insert(0, hexChars[rem2]);
            dec2=dec2/16;
        }
        System.out.print(hex);
        System.out.println();

        //Convert 3rd decimal input to Octal.
        int dec3 = result.nextInt();
        System.out.print(dec3 + " Converted to Octal: ");
        StringBuilder oct = new StringBuilder();
        char[] octChars = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while(dec3>0)
        {
            int rem3 = dec3%8;
            oct.insert(0, octChars[rem3]);
            dec3 = dec3 / 8;
        }
        System.out.print(oct);
        System.out.println();
        result.close();
    }
}
