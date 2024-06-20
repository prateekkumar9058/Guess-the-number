import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MainSceneController {

    @FXML
    private Pane MainPane;

    @FXML
    private Pane MainPane78;

    @FXML
    private Pane MainPane1;

    @FXML
    private Label chanceTarget;

    @FXML
    private Label numInfo1;

    @FXML
    private Pane difficultyPane;

    @FXML
    private Label numInfo;

    @FXML
    private TextField numberField;

    @FXML
    private Button onClickCheck;

    @FXML
    private Label target;

    @FXML
    private Label correctNo;

    @FXML
    private Pane gameOverPane;

    @FXML
    private Label target12;

    @FXML
    private Label noOfGuesses;

    // initialize varaibles
    int chances = 10;
    int guesses = 0;
    int Target;
    int num;

    // type cast integer to string
    String randomNum = Integer.toString(num);

    @FXML
    void onClickCheck(ActionEvent event) {

        // check condition whether how many chances you left for guess the number
        if (chances == 1) {
            String corrNo = Integer.toString(num);
            correctNo.setText(corrNo);
            gameOverPane.setVisible(true);
        } else {
            chances--;
            guesses++;
            String Guesses = Integer.toString(guesses);
            String ChancesLeft = Integer.toString(chances);
            chanceTarget.setText(ChancesLeft);
            String getNum = numberField.getText();
            int Num = Integer.parseInt(getNum);

            // check condition whether a number you guessed is smaller or greater from the correct number
            if (num > Num && Num > 0) {
                numInfo.setText("You guess small number!!");
                numInfo.setVisible(true);
            } else if (Num > num && Num < Target) {
                numInfo.setText("You guess large number!!");
                numInfo.setVisible(true);
            } else if (num == Num) {
                noOfGuesses.setText(Guesses);
                MainPane1.setVisible(true);
            }
            else if (Num > Target) {
                numInfo.setText("Please enter valid input!!");
                numInfo.setVisible(true);
            }
            else {
                numInfo.setText("Please enter valid input!!");
                numInfo.setVisible(true);
            }

            // clear the textfield after you click the button
            numberField.clear();
        }
    }

    @FXML

    // it generates a number between 1 to 10
    void onClickEasy(ActionEvent event) {
        Target = 10;
        num = game.getRandomNum(10);
        MainPane78.setVisible(true);
        System.out.println(num);

    }

    // it generates a number between 1 to 50
    @FXML
    void onClickHard(ActionEvent event) {
        Target = 50;
        num = game.getRandomNum(50);
        target.setText("50");
        MainPane78.setVisible(true);
    }

    // it generates a number between 1 to 20
    @FXML
    void onClickMedium(ActionEvent event) {
        Target = 20;
        num = game.getRandomNum(20);
        target.setText("20");
        MainPane78.setVisible(true);
    }

    // it generates a number between 1 to 100
    @FXML
    void onClickVeryHard(ActionEvent event) {
        Target = 100;
        num = game.getRandomNum(100);
        target.setText("100");
        MainPane78.setVisible(true);
    }
}
