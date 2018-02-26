
package com.example.lenovo.ljq_shiyan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"you clicked ADD",Toast.LENGTH_SHORT).show();
                break;
            case R.id.add_remove:
                Toast.makeText(this,"you clicked remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           btn= (Button) findViewById(R.id.btn);
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,Main2Activity.class));
//                   Toast.makeText(MainActivity.this,"you clicked butoon",Toast.LENGTH_SHORT).show();

                   String data="hello word";
                   Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                   intent.putExtra("extra_data",data);
                   startActivity(intent);

//                   Intent intent= new Intent(Intent.ACTION_VIEW);
//                   intent.setData(Uri.parse("http://www.baidu.com"));
//                   startActivity(intent);



               }
           });


    }
}
