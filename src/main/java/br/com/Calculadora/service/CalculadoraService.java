package br.com.Calculadora.service;

import org.springframework.stereotype.Service;

import br.com.Calculadora.model.Operacao;

@Service
public class CalculadoraService {

    public double calcular(Operacao operacao) {
        double resultado = 0;
        switch (operacao.getOperador()) {
            case "+":
                resultado = operacao.getNumero1() + operacao.getNumero2();
                break;
            case "-":
                resultado = operacao.getNumero1() - operacao.getNumero2();
                break;
            case "*":
                resultado = operacao.getNumero1() * operacao.getNumero2();
                break;
            case "/":
                if (operacao.getNumero2() != 0) {
                    resultado = operacao.getNumero1() / operacao.getNumero2();
                } else {
                    throw new IllegalArgumentException("Divisão por zero não é perrmitida.");
                }
                break;
            default:
                throw new IllegalArgumentException("Operador desconhecido.");
        }
        operacao.setResultado(resultado);
        return resultado;
    }

}
