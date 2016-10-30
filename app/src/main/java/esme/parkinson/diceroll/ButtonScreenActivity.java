package esme.parkinson.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ButtonScreenActivity extends AppCompatActivity {
    // Declare variables
    private Button mButtonFour;
    private Button mButtonSix;
    private Button mButtonEight;
    private Button mButtonTen;
    private Button mButtonTwelve;
    private Button mButtonTwenty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_screen);

        // Assign Views to variables
        mButtonFour = (Button) findViewById(R.id.buttond4);
        mButtonSix = (Button) findViewById(R.id.buttond6);
        mButtonEight = (Button) findViewById(R.id.buttond8);
        mButtonTen = (Button) findViewById(R.id.buttond10);
        mButtonTwelve = (Button) findViewById(R.id.buttond12);
        mButtonTwenty = (Button) findViewById(R.id.buttond20);


        View.OnClickListener listenerFour = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d4";
                int mMaxInt = 4;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonFour.setOnClickListener(listenerFour);

        View.OnClickListener listenerSix = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d6";
                int mMaxInt = 6;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonSix.setOnClickListener(listenerSix);


        View.OnClickListener listenerEight = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d8";
                int mMaxInt = 8;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonEight.setOnClickListener(listenerEight);

        View.OnClickListener listenerTen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d10";
                int mMaxInt = 10;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonTen.setOnClickListener(listenerTen);

        View.OnClickListener listenerTwelve = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d12";
                int mMaxInt = 12;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonTwelve.setOnClickListener(listenerTwelve);

        View.OnClickListener listenerTwenty = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = "d20";
                int mMaxInt = 20;
                int rollResult = rollDie(mMaxInt);
                announce(mString, rollResult);
            }
        };
        mButtonTwenty.setOnClickListener(listenerTwenty);
    }

    public int rollDie(int myMax){
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(myMax);
        int y = x + 1;
        return y;
    }

    public void announce(String die, int result){
        String print = "You rolled a " + die + " for " + result;
        Toast.makeText(getApplicationContext(), print, Toast.LENGTH_SHORT).show();
    }
}
