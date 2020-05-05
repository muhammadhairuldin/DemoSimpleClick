package sg.edu.rp.c346.id19037272.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    EditText etInput;
    TextView tvDisplay;
    ToggleButton tbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = etInput.getText().toString();
                tvDisplay.setText(value);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()) {
                    etInput.setEnabled(true);
                    tbtn.setTextOn("off");
            }
                else {
                    etInput.setEnabled(false);
                    tbtn.setTextOff("on");
                }
        }
        });
    }
}
