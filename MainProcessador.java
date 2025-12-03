public class MainProcessador {
    public static void main(String[] args) {
        String textoOriginal = "Exemplo de Texto NO Padrão TEMPLATE Method ParA VeR SE funCioNa";
        
        System.out.println("Original: " + textoOriginal);

        ProcessadorTexto maiuscula = new TudoMaiuscula();
        System.out.println("Maiúscula: " + maiuscula.processarTexto(textoOriginal));

        ProcessadorTexto minuscula = new TudoMinuscula();
        System.out.println("Minúscula: " + minuscula.processarTexto(textoOriginal));
    }
}