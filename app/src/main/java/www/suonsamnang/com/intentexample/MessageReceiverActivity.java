package www.suonsamnang.com.intentexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageReceiverActivity extends AppCompatActivity {

    public static String MessageSent;
    EditText txtMessageReceived;
    Button btnRetourner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_receiver);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtMessageReceived = (EditText) findViewById(R.id.txtMessageReceived);
        if(getIntent().hasExtra(MessageSent)) {
            txtMessageReceived.setText(getIntent().getStringExtra(MessageSent));
        } else {
            txtMessageReceived.setText("Nothing has been sent...");
        }
        btnRetourner = (Button) findViewById(R.id.btnRetourner);
        btnRetourner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
