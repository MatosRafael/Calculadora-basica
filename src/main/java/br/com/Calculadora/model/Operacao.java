package br.com.Calculadora.model;

public class Operacao {
    private double numero1;
    private double numero2;
    private String operador;
    private double resultado;
    
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public String getOperador() {
        return operador;
    }
    public void setOperador(String operador) {
        this.operador = operador;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
