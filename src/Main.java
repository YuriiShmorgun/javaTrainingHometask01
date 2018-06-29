/* Task1.java   1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */


import core.controller.Controller;
import core.model.Model;
import core.view.View;

/*
 * This is the main class for running program
 *
 * @version     1     29.06.2018
 * @author      Yurii Shmorgun
*/
public class Main {

    public static void main(String[] args) {

    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.processUser();
    }
}