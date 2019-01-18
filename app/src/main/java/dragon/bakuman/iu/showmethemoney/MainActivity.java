package dragon.bakuman.iu.showmethemoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mActivityUpImage, mActivityDownImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActivityUpImage = findViewById(R.id.activity_up_image);
        mActivityDownImage = findViewById(R.id.activity_down_image);

        mActivityUpImage.setOnClickListener(this);
        mActivityDownImage.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.activity_up_image :

                Intent upIntent = new Intent(MainActivity.this, BioActivity.class);
                upIntent.putExtra("name", "Zura");
                upIntent.putExtra("description", "Zura Ja Nai, Katsura Da!");
                startActivity(upIntent);


                break;

            case R.id.activity_down_image :

                Intent downIntent = new Intent(MainActivity.this, BioActivity.class);
                downIntent.putExtra("name", "Gin");
                downIntent.putExtra("description", "Gintoki!");
                startActivity(downIntent);


                break;



        }

    }
}
