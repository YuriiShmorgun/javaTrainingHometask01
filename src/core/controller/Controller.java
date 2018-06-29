/* Task1.java   0.1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */

package core.controller;

import core.model.Model;
import core.view.EMessage;
import core.view.View;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * This is the controller
 *
 * @version     1     29.06.2018
 * @author      Yurii Shmorgun
*/
public class Controller {

    /*create classes for */
    private Model model;
    private View view;

    /*Create List for collecting Strings from input*/
    private ArrayList<String> stringList = new ArrayList<>();

    /*constructor*/
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /*main methods*/
    public void processUser(){
        Scanner scanner = new Scanner(System.in);

            stringList.add(inputStringFromScanner("Hello",scanner, EMessage.INPUT_WORD_HELLO));
            stringList.add(inputStringFromScanner("world!", scanner, EMessage.INPUT_WORD_WORLD));

        scanner.close();

        model.summationValues(stringList);

        view.printControllerMessage(model.getResultForUserString());
    }

    /*Check methods for input Strings*/
    private String inputStringFromScanner (String string, Scanner scanner, EMessage eMessage){
      view.printMessage(eMessage);

        while( ! scanner.hasNext(string)){
            view.printMessage(EMessage.INPUT_ERROR );
            view.printMessage(eMessage);
            scanner.next();
        }
        return scanner.next();
    }

}
