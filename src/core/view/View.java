/* Task1.java   0.1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */

package core.view;

/*
 * This is the View class for program
 * It`s print messages for user
 *
 * @version     0.3     29.06.2018
 * @author      Yurii Shmorgun
 */
public class View {

    /*method for print messages for user*/
    public void printMessage (EMessage message){
        System.out.println(message.getMessage());
    }

    public void printControllerMessage (String srting){
        System.out.println(srting);
    }

}
