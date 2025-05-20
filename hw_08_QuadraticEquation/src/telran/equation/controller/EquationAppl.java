package telran.equation.controller;

import telran.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(2, -4, -6);
        eq.display();
        System.out.println(eq.delta());
        System.out.println("number of roots = " + eq.quantityroots());
        double[] roots = eq.getroots();
        for (int i = 0; i < roots.length; i++) {
            System.out.println("root[" +(i+1)+"] = " + roots[i]);

        }


    }

}
