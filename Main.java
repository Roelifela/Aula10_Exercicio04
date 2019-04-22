package br.com.digitalhouse;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("RODRIGO", 12345));
        funcionarios.add(new Funcionario("FELIPE", 12346));
        funcionarios.add(new Funcionario("LARISSA", 12347));
        funcionarios.add(new Funcionario("ELIZA", 12348));

        Funcionario luby = new Funcionario("Luby", 12349);


        System.out.println("O funcionário " + luby.getNome() + " está na lista de funcionarios? " + funcionarios.contains(luby));

    }


}
