package com.raghib.tictac;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    Label playerLabel;

     int[][] matrix =new  int[3][3];

     String player1="Player 1";

     String player2="Player 2";
     boolean isPlyr1=true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        button1.setOnAction(event -> {
                    System.out.println("button1 cliked");

                   matrix[0][0]=isPlyr1?1:2;
                   System.out.println(matrix[0][0]);
                    check(matrix[0][0]);
                    changeButtonText(button1);

                }
        );
        button2.setOnAction(event ->
                {
                    System.out.println("button2 cliked");
                    matrix[0][1]=isPlyr1?1:2;

                    changeButtonText(button2);

                    check(matrix[0][0]);
                }


        );
        button3.setOnAction(event ->
                {
                    System.out.println("button3 cliked");
                    matrix[0][2]=isPlyr1?1:2;

                    changeButtonText(button3);
                    check(matrix[0][0]);
                }


        );
        button4.setOnAction(event ->
                {
                    System.out.println("button4 cliked");
                    matrix[1][0]=isPlyr1?1:2;
                    changeButtonText(button4);
                    check(matrix[0][0]);
                }


        );
        button5.setOnAction(event ->
                {
                    System.out.println("button5 cliked");
                    matrix[1][1]=isPlyr1?1:2;
                    changeButtonText(button5);
                    check(matrix[0][0]);
                }


        );
        button6.setOnAction(event ->
                {
                    System.out.println("button6 cliked");
                    matrix[1][2]=isPlyr1?1:2;
                    changeButtonText(button6);
                    check(matrix[0][0]);
                }
        );
        button7.setOnAction(event ->
                {
                    System.out.println("button7 cliked");
                    matrix[2][0]=isPlyr1?1:2;
                    changeButtonText(button7);
                    check(matrix[0][0]);
                }


        );
        button8.setOnAction(event ->
                {
                    System.out.println("button8 cliked");
                    matrix[2][1]=isPlyr1?1:2;
                    changeButtonText(button8);
                    check(matrix[0][0]);
                }

        );
        button9.setOnAction(event ->{
                System.out.println("button9 cliked");
                    matrix[2][2]=isPlyr1?1:2;
        changeButtonText(button9);
                    check(matrix[0][0]);
    }


        );




    }

    private boolean check(int value) {


        for(int tempArray[]:matrix)
        {


            boolean flag=true;
            int element=tempArray[0];

            for(int i=1;i<tempArray.length;i++)
            {

                if(element!=tempArray[i])
                {
                    flag=false;
                }

            }
            if(flag &&element!=0)
            {
                System.out.println("\n"+element+": player wins");
                winMessage(element);
            }

        }
        for (int i=0;i<3;i++)
        {
            boolean flag=true;
            int element=matrix[0][i];
            for(int j=1;j<3;j++)
            {
               if(matrix[j][i]!=element)
               {flag=false;
                 break;
               }

            }
            if(flag &&element!=0)
            {
                winMessage(element);
            }
        }
        int element=matrix[0][0];
        boolean flagTemp=true;
        for (int i=1;i<3;i++)
        {

            if(element!=matrix[i][i])
                 flagTemp=false;

        }
        if(flagTemp &&element!=0)
        {
            winMessage(element);
        }
        int element3=matrix[0][2];
        if(element3==matrix[1][1]&&matrix[2][0]==element3)
        {
            if(element3!=0)
                winMessage(element3);
        }

        return  true;

        }

    private void winMessage(int element) {
        Alert result=new Alert(Alert.AlertType.INFORMATION);
        result.setTitle("Result");
        result.setHeaderText("Winner");
        result.setContentText("Player "+element+" wins the game.");
        result.show();

        return;
    }


    private void changeButtonText(Button button) {
        if(isPlyr1) {
            button.setText("0");

           // playerLabel.setText("fjklas"); // prints next players turn
            isPlyr1=false;                         //
        }
        else
        {
            button.setText("X");
            //playerLabel.setText(player1+"'s Turn");  // prints next players turn
            isPlyr1=true;
        }
    }
}
