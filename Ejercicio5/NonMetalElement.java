package Ejercicio5;

public class NonMetalElement extends Element{

    public NonMetalElement(String simbolo, Integer noAtomico, Double pesoAtomico) {
        super(simbolo, noAtomico, pesoAtomico);
    }

    @Override
    public void describeElement() {
        System.out.println("los no metales son malos conductores de electricidad");
    }
}
