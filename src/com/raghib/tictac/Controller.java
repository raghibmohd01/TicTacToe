package com.raghib.tictac;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
     int flags [][]=new  int[3][3];

     String player1="Player 1";
     String player2="Player 2";
     boolean isPlyr1=true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        button1.setOnAction(event -> {
                    System.out.println("button1 cliked");

                   flags[0][0]=isPlyr1?1:2;
                    check(flags[0][0]);
                    changeButtonText(button1);

                }
        );
        button2.setOnAction(event ->
                {
                    System.out.println("button1 cliked");

                    changeButtonText(button2);
                    flags[0][1]=isPlyr1?1:2;
                    check(flags[0][0]);
                }


        );
        button3.setOnAction(event ->
                {
                    System.out.println("button3 cliked");
                    flags[0][2]=isPlyr1?1:2;

                    changeButtonText(button3);
                    check(flags[0][0]);
                }


        );
        button4.setOnAction(event ->
                {
                    System.out.println("button4 cliked");
                    flags[1][0]=isPlyr1?1:2;
                    changeButtonText(button4);
                    check(flags[0][0]);
                }


        );
        button5.setOnAction(event ->
                {
                    System.out.println("button5 cliked");
                    flags[1][1]=isPlyr1?1:2;
                    changeButtonText(button5);
                    check(flags[0][0]);
                }


        );
        button6.setOnAction(event ->
                {
                    System.out.println("button6 cliked");
                    flags[1][2]=isPlyr1?1:2;
                    changeButtonText(button6);
                    check(flags[0][0]);
                }
        );
        button7.setOnAction(event ->
                {
                    System.out.println("button7 cliked");
                    flags[2][0]=isPlyr1?1:2;
                    changeButtonText(button7);
                    check(flags[0][0]);
                }


        );
        button8.setOnAction(event ->
                {
                    System.out.println("button8 cliked");
                    flags[2][1]=isPlyr1?1:2;
                    changeButtonText(button8);
                    check(flags[0][0]);
                }

        );
        button9.setOnAction(event ->{
                System.out.println("button9 cliked");
                    flags[2][2]=isPlyr1?1:2;
        changeButtonText(button9);
                    check(flags[0][0]);
    }


        );




    }

    private boolean check(int value) {
        if(value==1||value==2)
        {
                        //code if user already clicked a button
        }

        for(int i=0;i<3;i++)
        {
            boolean tempFlag=true;
            int temp=flags[i][0];
            for(int j=0;j<3;j++)
            {
                if(temp!=flags[i][j]) {
                    tempFlag=false;
                }
                }
               if(tempFlag==true)
                   System.out.println("wins: "+temp);
            }


        return  true;

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
