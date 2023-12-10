import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cont;
        Scanner scan = new Scanner(System.in);
        do {
            String str = scan.next();
            cont = 0;
            for (int c = 0; c < str.length(); ++c) {
                char aux = Character.toUpperCase(str.charAt(c));
                if (aux != 'Ñ') {
                    cont += (aux <= 'N' ? aux - 'A' + 1 : aux - 'A' + 2);
                } else {
                    cont += 'O' - 'A' + 1;
                }
            }
            System.out.println(cont);
        } while (cont != 100);
    }
}
