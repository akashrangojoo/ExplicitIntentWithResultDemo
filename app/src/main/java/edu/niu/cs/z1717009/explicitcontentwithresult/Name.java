package edu.niu.cs.z1717009.explicitcontentwithresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Name extends Activity {

    private Button returnBtn;
    private EditText nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        returnBtn = (Button) findViewById(R.id.backButton);
        nameET = (EditText) findViewById(R.id.nameEditText);

    }

    public void goBack(View view){
        String name;
        name = nameET.getText().toString();

        Intent intent;
        intent= getIntent();
        intent.putExtra("nameID",name);

        ((Activity)view.getContext()).setResult(RESULT_OK,intent);

        finish();
    }
}
