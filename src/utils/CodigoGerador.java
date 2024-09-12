package utils;

public class CodigoGerador {

    private static int sequencialId = 1;

    public static int gerarCodigoUsuario(){
        return sequencialId++;
    }

    public static int gerarCodigoLivro(){
        return sequencialId++;
    }

    public static int gerarCodigoAluno(){
        return sequencialId++;
    }

}
