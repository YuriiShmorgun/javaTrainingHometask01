/* Task1.java   0.1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */

import core.controller.Controller;
import core.model.Model;
import core.view.EMessage;
import core.view.View;


import java.util.ArrayList;

/*
 * This is the main class for running program
 *
 * @version     0.1     29.06.2018
 * @author      Yurii Shmorgun
*/
public class Main {

    public static void main(String[] args) {
        // write your code here

        /*String first = "Hi all";
        String second = "My name is Yurii";
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(first);
        arrayList.add(second);

        Model model = new Model();
        model.summationValues(arrayList);
        System.out.println(model.getResultForUserString());
*/

       /* System.out.println(EMessage.INPUT_ERROR.getMesage());*/
/*

        View view = new View();
        view.printMessage(EMessage.INPUT_WORD_HELLO);
*/


    Model model = new Model();
    View view = new View();
    Controller controller = new Controller(model, view);
    controller.processUser();





    }
}