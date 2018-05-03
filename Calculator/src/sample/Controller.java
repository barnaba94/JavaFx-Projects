package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }

    //variable
    public char aChar;
    public long temp;

    //fxml items
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
    Button button0;
    @FXML
    Button buttonplus;
    @FXML
    Button buttonminus;
    @FXML
    Button buttondiv;
    @FXML
    Button buttonmult;

    @FXML
    TextField text1;

    public void Click1()
    {
        String str = text1.getText();
        String p1 = "1";
        text1.setText(str+p1);
    }

    public void Click2()
    {
        String str = text1.getText();
        String p1 = "2";
        text1.setText(str+p1);
    }

    public void Click3()
    {
        String str = text1.getText();
        String p1 = "3";
        text1.setText(str+p1);
    }

    public void Click4()
    {
        String str = text1.getText();
        String p1 = "4";
        text1.setText(str+p1);
    }

    public void Click5()
    {
        String str = text1.getText();
        String p1 = "5";
        text1.setText(str+p1);
    }

    public void Click6()
    {
        String str = text1.getText();
        String p1 = "6";
        text1.setText(str+p1);
    }

    public void Click7()
    {
        String str = text1.getText();
        String p1 = "7";
        text1.setText(str+p1);
    }

    public void Click8()
    {
        String str = text1.getText();
        String p1 = "8";
        text1.setText(str+p1);
    }

    public void Click9()
    {
        String str = text1.getText();
        String p1 = "9";
        text1.setText(str+p1);
    }

    public void Click0()
    {
        String str = text1.getText();
        String p1 = "0";
        text1.setText(str+p1);
    }

    public void ClickPuls()
    {
        aChar = '+';
        String str = text1.getText();
        temp = Integer.parseInt(str);
        text1.setText("");
    }

    public void ClickMinus()
    {
        aChar = '-';
        String str = text1.getText();
        temp = Integer.parseInt(str);
        text1.setText("");
    }

    public void ClickDiv()
    {
        aChar = '/';
        String str = text1.getText();
        temp = Integer.parseInt(str);
        text1.setText("");
    }

    public void ClickMult()
    {
        aChar = '*';
        String str = text1.getText();
        temp = Integer.parseInt(str);
        text1.setText("");
    }

    public void ClickEqual()
    {
        String Value2 = text1.getText();
        long res = 0;

        switch(aChar) {
            case '+':
                res = temp + Integer.parseInt(Value2);
                text1.setText( Long.valueOf( res ).toString() );
                break;
            case '-':
                res = temp - Integer.parseInt(Value2);
                text1.setText( Long.valueOf( res ).toString() );
                break;
            case '/':
                if (Integer.parseInt(Value2) != 0)
                {
                    res = temp / Integer.parseInt(Value2);
                    text1.setText( Long.valueOf( res ).toString() );
                }
                else
                    text1.setText("Error!!!: divide by zero");
                break;
            case '*':
                res = temp * Integer.parseInt(Value2);
                text1.setText( Long.valueOf( res ).toString() );
                break;
        }
    }

}