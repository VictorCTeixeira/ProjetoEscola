package poo.projeto.dominio;

import java.time.LocalDate;

public class Professor extends BasePessoa{
    private String cargo;
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Professor(int codigo, String nome, String senha, LocalDate dataNascimento, String nomeUsuario,
            String cargo) {
        super(codigo, nome, senha, dataNascimento, nomeUsuario);
        this.cargo = cargo;
    }

    public void Imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
    }
}
