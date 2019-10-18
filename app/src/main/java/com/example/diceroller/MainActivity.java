package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click(View view){
         TextView tv = this.findViewById(R.id.textView);
         TextView inputbox = this.findViewById(R.id.input);

         int usrNumber = Integer.parseInt(inputbox.getText().toString());
         Random r = new Random();
        int number = r.nextInt(7);

        if(usrNumber == number){
            tv.setText("Congratulations!");
        }
        else if((usrNumber < 1)||(usrNumber > 6)){
            tv.setText("Invalid number");
        }
        else {
            tv.setText(Integer.toString(number));
        }
    }
}
