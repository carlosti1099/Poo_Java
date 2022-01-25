package Questao_6_Funcionando;

public class Equacao {
    
    public Double a, b, c, d, e;
    public Double result;
    
    public void calcular(){
        result = Math.pow((a + b * c / d), (2 * e));
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Double getResult() {
        return result;
    }   
    
}
