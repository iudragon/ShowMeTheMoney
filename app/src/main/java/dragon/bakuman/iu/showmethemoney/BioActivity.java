package dragon.bakuman.iu.showmethemoney;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView mActivityBioImage;
    private TextView mActivityBioNameText;
    private TextView mActivityBioDescriptionText;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        mActivityBioImage = findViewById(R.id.activity_bio_image);
        mActivityBioDescriptionText = findViewById(R.id.activity_bio_description_text);
        mActivityBioNameText = findViewById(R.id.activity_bio_name_text);

        extras = getIntent().getExtras();
        if (extras != null){

            String name = extras.getString("name");
            String description = extras.getString("description");

            setUp(name, description);

        }


    }

    public void setUp(String name, String description) {

        if (name.equals("Zura")){

            //show up stuff

            mActivityBioImage.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.ic_launcher_background));
            mActivityBioNameText.setText(name);
            mActivityBioDescriptionText.setText(description);

        } else if (name.equals("Gin")){

            mActivityBioImage.setImageDrawable(ContextCompat.getDrawable(BioActivity.this, R.drawable.ic_launcher_background));
            mActivityBioNameText.setText(name);
            mActivityBioDescriptionText.setText(description);

        }

    }
}
