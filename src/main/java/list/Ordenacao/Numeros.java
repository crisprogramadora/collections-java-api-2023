package main.java.list.Ordenacao;

public class Numeros implements Comparable <Numeros> {
    private Integer numeros;

    public Numeros(Integer numeros) {
        this.numeros = numeros;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(numeros, n.getNumeros());
    }

    public Integer getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return "{" + numeros +
                "}";
    }
}