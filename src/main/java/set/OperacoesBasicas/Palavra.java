package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Palavra {
    private String palavraUnica;

    public Palavra(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Palavra palavra)) return false;
        return getPalavraUnica() == palavra.getPalavraUnica();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavraUnica());
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavraUnica='" + palavraUnica + '\'' +
                '}';
    }
}
