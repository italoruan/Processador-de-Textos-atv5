
public abstract class ProcessadorTexto {

    public final String processarTexto(String entrada) {
        if (entrada == null) return null;
        
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        
        return resultado;
    }

    private char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    protected abstract char[] converterCaracteres(char[] chars);

    private String juntarCaracteres(char[] chars) {
        return new String(chars);
    }
}