package core.controller;

import core.model.Model;
import core.view.EMessage;
import core.view.View;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Yurii on 29.06.2018.
 */
public class Controller {



    private Model model;
    private View view;
    private ArrayList<String> stringList = new ArrayList<>();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner scanner = new Scanner(System.in);

            stringList.add(inputStringFromScanner("Hello",scanner, EMessage.INPUT_WORD_HELLO));
            stringList.add(inputStringFromScanner("world!", scanner, EMessage.INPUT_WORD_WORLD));

        scanner.close();

        model.summationValues(stringList);

        view.printControllerMessage(model.getResultForUserString());
    }

    private String inputStringFromScanner (String string, Scanner scanner, EMessage eMessage){
      view.printMessage(eMessage);

        while( ! scanner.hasNext(string)){
            view.printMessage(EMessage.INPUT_ERROR);
            scanner.next();
        }
        return scanner.next();
    }

}
