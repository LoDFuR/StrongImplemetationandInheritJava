package org.example;

import org.example.Pizza.Pizza;
import org.example.Pizza.PizzaExtraCheese;
import org.example.Pizza.PizzaExtraCheeseExtraTomato;
import org.example.Tempeture.Run;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pizza classic = new Pizza();
        PizzaExtraCheese extraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato extraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(classic.name());
        System.out.println(extraCheese.name());
        System.out.println(extraCheeseExtraTomato.name());
        Run Degrees = new Run();
        Degrees.setCelsDegree(5.4);
        Degrees.main();
    }
}