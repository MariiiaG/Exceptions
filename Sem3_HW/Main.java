package Sem3_HW;

import Sem3_HW.controller.Controller;
import Sem3_HW.model.Model;
import Sem3_HW.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.NewUser();
    }
}
