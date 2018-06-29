/* Task1.java   0.1   28.06.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task1 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */


package core.model;

import java.util.ArrayList;

/*
 * This is the model class for running program
 * req ArrayList
 * get String
 *
 * We use ArrayList to
 *
 * @version     0.3     29.06.2018
 * @author      Yurii Shmorgun
*/
public class Model {

    /*variable which contain our results*/
    private StringBuffer resultForUser = new StringBuffer();

    /**
     *  This method use ArrayList to fil variable and check the numbers left to the end
     * of the List. If we have next element it add`s space between them.
     */
    public void summationValues(ArrayList<String> stringList){
        for (int i =0; i<stringList.size(); i++){
            resultForUser.append(stringList.get(i));

            /*Check the numbers left and add the space between*/
            if (i < stringList.size()){
                resultForUser.append(" ");
            }
        }
    }

    /*This method get StringBuffer 'resultForUser' using String format*/
    public String getResultForUserString() {
        return resultForUser.toString();
    }
}
