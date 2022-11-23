package ru.mirea.Panferov.polishCalc;

public class Program {
    public static void main(String[] args) {
        PolishCalc polishCalc = new PolishCalc("12 -12 3 7 + * /");
        polishCalc.calcRes();
    }
}
