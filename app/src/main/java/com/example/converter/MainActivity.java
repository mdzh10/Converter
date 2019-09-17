    package com.example.converter;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

        private Button Feet,Pound,tk1,tk2,km;
        private EditText et1,et2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Feet = (Button)findViewById(R.id.btn1);
            Pound = (Button)findViewById(R.id.btn2);
            tk1 = (Button)findViewById(R.id.btn3);
            tk2 = (Button)findViewById(R.id.btn4);
            km = (Button)findViewById(R.id.btn5);


            et1 = (EditText) findViewById(R.id.input);
            et2 = (EditText) findViewById(R.id.output);

            Feet.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            double val1, val2;
                                            val1 = Double.valueOf(et1.getText().toString());
                                            val2 = val1 * 3.28084;
                                            et2.setText(String.valueOf(val2));
                                        }
                                    });



        }
    }