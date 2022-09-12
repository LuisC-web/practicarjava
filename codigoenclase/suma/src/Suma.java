
public class Suma {
    // defino atributos
    private Integer n1;
    private Integer n2;

    // defino constructores
    public Suma() {
    }

    public Suma(Integer n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // defino get y sets
    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public Integer sumar() {
        return n1 + n2;
    }

}