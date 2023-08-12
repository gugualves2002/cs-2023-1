package org.example._03;

import java.util.Optional;

public class CalcQuadraticEq {
    private final double a;
    private final double b;
    private final double c;

    public CalcQuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Optional<String> solve() {
        double delta = b * b - 4 * a * c;

        if (a == 0) {
            return Optional.empty(); // Não é uma equação quadrática válida
        } else if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return Optional.of("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return Optional.of("x = " + x);
        } else {
            return Optional.of("Equation has no roots");
        }
    }
}