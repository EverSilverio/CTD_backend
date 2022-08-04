package Aula01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    LocalDate dataNascimento;
    List<String> colecao = new ArrayList<String>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> addNomes(Pessoa p) {
        int caracteres = p.getNome().length();
        int idade      = p.calculaIdade();

        if (caracteres >= 5 && idade >= 18) {
            colecao.add(p.getNome());
            System.out.println(colecao);
        }

        return null;
    }

    public int calculaIdade(){
        int idade = Period.between(this.dataNascimento, LocalDate.of(2022, 8, 1)).getYears();
        return idade;
    }


}
