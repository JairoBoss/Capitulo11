package Ejercicio5;

public class MetalElement extends Element{

    public MetalElement(String simbolo, Integer noAtomico, Double pesoAtomico) {
        super(simbolo, noAtomico, pesoAtomico);
    }

    @Override
    public void describeElement() {
        System.out.println("Los metales son buenos conductores de electricidad");
    }
}
