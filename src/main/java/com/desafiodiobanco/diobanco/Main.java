package com.desafiodiobanco.diobanco;

import com.desafiodiobanco.diobanco.Models.Conta;
import com.desafiodiobanco.diobanco.Models.ContaCorrente;

public class Main {

    public static void main(String[] args){
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaCorrente();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
