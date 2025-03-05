package com.epam.rd.autotasks;

public class QuadraticEquation {

    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero.");
        }
    
        double discriminant = b * b - 4 * a * c;
        double epsilon = 1e-10;  // Margen para errores de redondeo
    
        if (discriminant < -epsilon) {
            return "no roots";
        } else if (Math.abs(discriminant) <= epsilon) {
            double root = -b / (2 * a);
            return String.valueOf(root);
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            return root1 + " " + root2;
        }
    }
    
}
