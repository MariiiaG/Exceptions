package Lec2;

/*
* Применение нескольких операторов catch. Иногда в одном фрагменте кода может возникнуть несколько разных исключений.
* Чтобы справиться с такой ситуацией, можно указать два или больше оператора catch,
* каждый из которых предназначается для перехвата отдельного типа исключения.
* Когда генерируется исключение, каждый оператор catch проверяется по порядку, и выполняется тот из них,
* что совпадает по типу с возникшим исключением. По завершении одного из операторов catch остальные пропускаются,
* и выполнение программы продолжается с оператора, следующего сразу после блока операторов try/catch.
* В следующем примере программы перехватывают два разных типа исключений
* */

import java.util.Collections;

public class lec2_6_multipleTryCatch {
    public static void main(String args[]) {
        int number = 1;
        try {
            number = 10 / 0;

            String test = null;
            System.out.println(test.length());

            Collections.emptyList().add(new Object()); // not specified in catch, so it'll trigger "Exception"
        } catch (NullPointerException e) {
            System.out.println("nullpointer exception");
        } catch (ArithmeticException e) {
            System.out.println("divide by zero not supported");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
// Исключния обрабатываются по порядку, поэтому надо сначала ставить более "узкие" исключения и лишь потом более обобщенные
// catch(Exception e) будет самым последним, т к он включает в себя все возможные исключения