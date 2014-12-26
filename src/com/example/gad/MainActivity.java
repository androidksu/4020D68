package com.example.gad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText text1, text2;
	Button button1;
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text1 = (EditText) findViewById(R.id.editText1);
		text2 = (EditText) findViewById(R.id.editText2);
		button1 = (Button) findViewById(R.id.button1);
	}

	public void Calc(View view) {
		double height = Double.parseDouble(text1.getText().toString()) / 100;
		double weight = Double.parseDouble(text2.getText().toString());
		double BMI = weight / (height * height);
		
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		
		
		textView1.setText(String.valueOf(BMI));
		
	}

}
