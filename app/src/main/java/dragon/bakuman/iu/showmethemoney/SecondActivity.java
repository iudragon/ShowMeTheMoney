package dragon.bakuman.iu.showmethemoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mActivityPassDataText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        mActivityPassDataText = findViewById(R.id.activity_pass_data_text);

        if (bundle != null){

            String message = bundle.getString("key");
            mActivityPassDataText.setText(message);
        }



    }
}
