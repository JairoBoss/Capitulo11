package Ejercicio5;

public abstract class Element {
    private String simbolo;
    private  Integer noAtomico;
    private Double pesoAtomico;

    public abstract void describeElement();

    public Element(String simbolo, Integer noAtomico, Double pesoAtomico) {
        this.simbolo = simbolo;
        this.noAtomico = noAtomico;
        this.pesoAtomico = pesoAtomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNoAtomico() {
        return noAtomico;
    }

    public Double getPesoAtomico() {
        return pesoAtomico;
    }
}
