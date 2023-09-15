package Sem3;

public class Sem3_2_check {
    public static void main(String[] args) {
//        Sem3_2_main m = new Sem3_2_main();
//        System.out.println(m.getCount());
//        try {
//            m.close();
//        } catch (Exception e) {
//
//        }

        try (Sem3_2_main l = new Sem3_2_main()) {
            System.out.println(l.getCount());
        }  catch(Exception e) {

        }
    }
}
