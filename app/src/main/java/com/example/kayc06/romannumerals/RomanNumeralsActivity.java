package com.example.kayc06.romannumerals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class RomanNumeralsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roman_numerals);

        final EditText editText = (EditText) findViewById(R.id.roman_numeral_input);
        final TextView heading = (TextView) findViewById(R.id.heading);
        if (heading != null) {
            heading.setText(R.string.enter_number_string);
        }

        assert editText != null;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    boolean handled = false;
                    if (actionId == EditorInfo.IME_ACTION_SEND) {
                        int myNum = Integer.parseInt(v.getText().toString());
                        convert(myNum);
                        handled = true;
                    }
                    return handled;
                }
            });
        }

    public String convert(int number) {
        TextView converted = (TextView) findViewById(R.id.converted_number);
        String convertedValue;
        convertedValue = getConvertedString(number);
        assert converted != null;
        converted.setText(convertedValue);

        return convertedValue;
    }

    String getConvertedString(int number) {
        if(number < 1) {
            return  "";
        }
        
        if(number >= 500){ return "D" + getConvertedString(number - 500);}
        if(number >= 400){ return "CD" + getConvertedString(number - 400);}
        if(number >= 100){ return "C" + getConvertedString(number - 100);}
        if(number >= 90){ return "XC" + getConvertedString(number - 90);}
        if(number >= 50){ return "L" + getConvertedString(number - 50);}
        if(number >= 40){ return "XL" + getConvertedString(number - 40);}
        if(number >= 10){ return "X" + getConvertedString(number - 10);}
        if(number >= 9){ return "IX";}
        if(number >= 5) {return  "V" + getConvertedString(number - 5);}
        if(number == 4) {return  "IV";}
        if(number >= 1) {return  "I" + getConvertedString(number - 1);}

        return "";
    }
}
