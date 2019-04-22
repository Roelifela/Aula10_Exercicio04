package br.com.digitalhouse;

public class Funcionario {

    public String nome;
    public int numeroDeRegistro;

    public Funcionario(String nome, int numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object novoFuncionario) {

        if (!(novoFuncionario instanceof Funcionario)){
            return false;
        }

        //((Funcionario) novoFuncionario).getNumeroDeRegistro();

        return ((Funcionario) novoFuncionario).getNumeroDeRegistro() == this.getNumeroDeRegistro();

    }
}
