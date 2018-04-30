package affwl.com.pppoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LodingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding_page);

        Intent homeIntent = new Intent(LodingPage.this, MainActivity.class);
        startActivity(homeIntent);
    }
}
