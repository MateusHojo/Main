package util;

public class Validacoes {

    private Validacoes() {
        
    }

    public static boolean nomeValido(String nome) {
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "Erro: O nome não pode estar vazio!";
       
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: O nome não pode conter números!";
        }
       
        return "";
    }

    public static boolean tipoValido(int tipo) {
        // Corrigido: 20.000 não é válido para int
        return tipo >= 1 && tipo <= 20000;
    }

    public static String mensagemErroTipo(int tipo) {
        // Ajustado para manter coerência com o método acima
        if (tipo < 1) {
            return "Erro: Esse tipo de fruta não existe!";
       
        } else if (tipo > 20000) {
            return "Erro: Tipo de fruta inválido!";
        }
    
        return "";
    }

    public static boolean precoValido(double preco) {
        return preco >= 0.5 && preco <= 10;
    }

    public static String mensagemErroPreco(double preco) {
        if (preco < 0.5) {
            return "Erro: Preço muito baixo!";
    
        } else if (preco > 10) {
            return "Erro: Preço inválido!";
        }
    
        return "";
    }
}