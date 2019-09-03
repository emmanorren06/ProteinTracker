package proteintracker.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView myTextView1 = new TextView(this);

        myTextView1.setText("Some Help Text");
        setContentView(myTextView1);
        Bundle b = getIntent().getExtras();
        String helpText = b.getString("helpString");
        myTextView1.setText(helpText);
        setContentView(myTextView1);
    }


}
