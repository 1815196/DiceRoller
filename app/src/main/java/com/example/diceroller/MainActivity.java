package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click(View view){
         TextView tv = this.findViewById(R.id.textView);
         TextView inputBox = this.findViewById(R.id.input);
         TextView scoreBox = this.findViewById(R.id.scoreNumber);

         int usrNumber = Integer.parseInt(inputBox.getText().toString());
         Random r = new Random();
         int number = r.nextInt(6)+1;
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
}
