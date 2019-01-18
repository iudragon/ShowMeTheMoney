package dragon.bakuman.iu.showmethemoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mActivityShowMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActivityShowMeButton = findViewById(R.id.activty_show_me_button);
        mActivityShowMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", "love");


                startActivity(intent);

            }
        });


    }




}
