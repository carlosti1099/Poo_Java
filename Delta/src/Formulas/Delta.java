package Formulas;

public class Delta {
    
    public double a, b, c;
    public double deltaa;
    
    
    public void calcular(){
        double delta;
        delta = Math.pow(b, 2) - 4 * a * c;
        
        //if (delta > 0){
        //    this.x1 = (-b + Math.sqrt(delta)) / (2*a);
        //    this.x2 = (-b - Math.sqrt(delta)) / (2*a);
        //} else{
        //    this.x1 = -1d;
        //    this.x2 = -1d;
        //}
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDeltaa() {
        return deltaa;
    }

    public void setDelta(double deltaa) {
        this.deltaa = deltaa;
    }

    public String deltaa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
