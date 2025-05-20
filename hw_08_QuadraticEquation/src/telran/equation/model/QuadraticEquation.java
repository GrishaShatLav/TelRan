package telran.equation.model;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
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
    public void display(){
        //todoo ax(2) + bx + c = 0
        System.out.println("("+a+"x^2) + "+"("+b+"x) + "+"("+c+") = 0" );
    }

    public double delta(){
        return (b*b)-(4*a*c);
    }

    public int quantityroots(){
        int amofroots;
        if(delta()>0)
            amofroots =2;
        else if (delta() ==0)
            amofroots = 1;
        else
            amofroots = 0;

        return amofroots;
    }

    public double[] getroots(){
        double[] roots = new double[2];
        double x1;
        double x2;
        if(quantityroots()==2){
            x1 = (-b+Math.sqrt(delta()))/(2*a);
            x2 = (-b-Math.sqrt(delta()))/(2*a);
            roots[0]=x1;
            roots[1]=x2;

        }
        else if (quantityroots() ==1){
            x1 = (-b+Math.sqrt(delta()))/(2*a);
            x2 = (-b-Math.sqrt(delta()))/(2*a);
            roots[0]=x1;
            roots[1]=x2;

        }
        else
            return null;


        return roots;
    }
    //delta

}
