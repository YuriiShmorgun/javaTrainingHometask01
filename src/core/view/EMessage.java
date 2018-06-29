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
 * Enum used for keeping messages for users
 * It has no modifier access, so it can be used only from view package
 *
 * @version     0.2     29.06.2018
 * @author      Yurii Shmorgun
 */
public enum EMessage {
    INPUT_WORD_HELLO ("Input word 'Hello'"),
    INPUT_WORD_WORLD ("Input word 'world!'"),
    INPUT_ERROR ("Input is incorrect");

    /*String field for each message*/
    private String description;

    /*Constructor*/
    private EMessage(String description) {
        this.description = description;
    }

    /*Method for return String variable (message)*/
    public String getMessage(){
        return description;
    }

}
