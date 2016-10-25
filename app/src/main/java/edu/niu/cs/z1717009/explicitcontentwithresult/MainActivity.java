package edu.niu.cs.z1717009.explicitcontentwithresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button getNameBtn;
    private TextView nameTV;
    static final int REQUEST_CODE = 501;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getNameBtn = (Button) findViewById(R.id.getNameButton);
        nameTV = (TextView) findViewById(R.id.nameTextView);
    }

    public void getName(View view){
        Intent nameIntent = new Intent(MainActivity.this, Name.class);
        startActivityForResult(nameIntent,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       // super.onActivityResult(requestCode, resultCode, data);
        String name;
        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK){
            name = data.getStringExtra("nameID");
            nameTV.setText("Your Name is "+name);
        }
    }
}
