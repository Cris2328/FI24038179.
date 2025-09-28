public class Inverso {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor ingrese un número natural como argumento.");
            return;
        }

        int numero = Integer.parseInt(args[0]);
        int inverso = invertir(numero, 0);

        System.out.println(numero + " → " + inverso);
    }

    public static int invertir(int numero, int acumulador) {
        if (numero == 0) {
            return acumulador;
        }
        int residuo = numero % 10;    
        int cociente = numero / 10;     
        acumulador = acumulador * 10 + residuo;
        return invertir(cociente, acumulador);
    }
}
