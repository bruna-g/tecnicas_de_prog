class Pessoa{
    private String nome;
    private int idade;
    private char sexo;

    Pessoa() {
        this("Sem Nome",0,' ');
    }

    Pessoa (String nome) {
        this(nome,0,' ');
    }

    Pessoa (String nome, int idade){
        this.setNome(nome);
    }

    Pessoa (String nome, int idade, char sexo) {
        this.setNome(nome);
    }

}