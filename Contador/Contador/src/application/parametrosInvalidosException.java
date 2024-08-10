package application;

public class parametrosInvalidosException extends Exception {
    public parametrosInvalidosException(){
        super("Parâmetros inválidos: o primeiro parâmetro é maior que o segundo");
    }
}
