package util;

import java.util.Locale;

public class Calculator {
    Calculator(){}

    private Double num1, num2, num3, num4, pol1, pol2;


    public Calculator(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double Calc1(Double num1, Double num2){
        if (num1 >= 0) {
            num3 = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
            num4 = Math.atan(num2 / num1);
            num4 = Math.toDegrees(num4);
        } else {
            num3 = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
            num4 = Math.atan(num2 / num1);
            num4 = Math.toDegrees(num4) + 180;
        }
     //   pol1.setText(String.format(Locale.ROOT,"%.2f",num3));
      //  pol2.setText(String.format(Locale.ROOT,"%.2f",num4));
        return null;
    }
    /*

      */
}
