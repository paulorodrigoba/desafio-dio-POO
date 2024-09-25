package br.com.dio.desafio.dominio;

public class Curso {
    private String curso;
    private String descricao;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "curso='" + curso + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    public Curso() {
    }
}
