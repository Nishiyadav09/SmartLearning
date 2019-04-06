package e.nishu.smartlearning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Nursery extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nursery);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "https://www.youtube.com/watch?v=kV189Or1s2M&list=PLcOX2pEnb6yllUEyoeEso9SSd__1X4h2r";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
                startActivity(webIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "https://www.youtube.com/watch?v=i7ygKQunfmE";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
                startActivity(webIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "https://www.youtube.com/watch?v=M8jLh2RPja4";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
                startActivity(webIntent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "https://www.youtube.com/watch?v=glkQwKA5_PU";
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(s1));
                startActivity(webIntent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                startActivityForResult(intent, 7);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub

        switch(requestCode){

            case 7:

                if(resultCode==RESULT_OK){

                    String PathHolder = data.getData().getPath();

                    Toast.makeText(Nursery.this, PathHolder , Toast.LENGTH_LONG).show();

                }
                break;

        }
    }
}
