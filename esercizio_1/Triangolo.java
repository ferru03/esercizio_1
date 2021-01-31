/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato3(double lato3) {
        this.lato3 = lato3;
    }

    public String tipologiaTriangolo() {

        if (lato1 == lato2 && lato1 == lato3 && lato2 == lato3) {
            return "Equilatero";
        } else if (lato1 != lato2 && lato1 != lato3 && lato2 != lato3) {
            return "Scaleno";
        }

        return "Isoscele";
    }

    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    public double calcolaArea() {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));

        return area;
    }
}
