/* Task1.java   0.1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */

package core.view;
import core.view.EMessage;


/*
 * This is the View class for program
 * It contain`s messages for user
 *
 * @version     0.1     29.06.2018
 * @author      Yurii Shmorgun
 */
public class View {



    public void go(){

        EMessage.INPUT_ERROR.getMessage();
    }

    /*messages for user*/
    public static final String INPUT_WORD_HELLO ="Input word 'Hello'";
    public static final String INPUT_WORD_WORLD ="Input word 'world!'";
    public static final String INPUT_ERROR ="Input is incorrect";

    /*method for print messages for user*/
    public void printMessage (String message){
        System.out.println(message);
    }

    /* TODO method for print messages for user*/
    ///public void printMessage
}
