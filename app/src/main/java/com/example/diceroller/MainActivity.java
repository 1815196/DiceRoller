package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String questions[] = new String[]{"If you could go anywhere in the world, where would you go?",
            "If you were stranded on a desert island, what three things would you want to take with you?",
            "If you could eat only one food for the rest of your life, what would that be?",
            "If you won a million dollars, what is the first thing you would buy?",
            "If you could spend the day with one fictional character, who would it be?",
            "If you found a magic lantern and a genie gave you three wishes, what would you wish?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void on_button_click(View view){
         TextView tv = this.findViewById(R.id.textView);
         TextView inputBox = this.findViewById(R.id.input);
         TextView scoreBox = this.findViewById(R.id.scoreNumber);
         try{
         int usrNumber = Integer.parseInt(inputBox.getText().toString());

         int number = roll_the_dice(6);
         int score = Integer.parseInt(scoreBox.getText().toString());

        if(usrNumber == number){
            tv.setText("Congratulations!");
            score++;
            scoreBox.setText(Integer.toString(score));
        }
        else if((usrNumber < 1)||(usrNumber > 6)){
            tv.setText("Invalid number");
        }
        else
            tv.setText(Integer.toString(number));
    }
         catch (Exception e){
             tv.setText("Bruh");
         }
    }

    public void on_ice_click(View view){
        TextView tv = this.findViewById(R.id.textView);
        try {
            tv.setText(questions[roll_the_dice(6)]);
        }
        catch (Exception e){
            tv.setText("");
        }
    }

    public int roll_the_dice(int MaxRandNumber){
        Random r = new Random();
        int RandNumber = r.nextInt(MaxRandNumber)+1;
        return RandNumber;
    }
}
