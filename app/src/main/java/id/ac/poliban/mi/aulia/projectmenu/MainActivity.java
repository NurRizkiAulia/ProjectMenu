package id.ac.poliban.mi.aulia.projectmenu;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.view.menu.MenuAdapter;

//import android.content.ClipData;
//import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
      //  if (item.getItemId() == R.id.menu1) {
      //      startActivity(new Intent(this, Menu1.class));
      // } else if (item.getItemId() == R.id.menu2) {
      //      startActivity(new Intent(this, Menu2.class));
      //  } else if (item.getItemId() == R.id.menu3) {
      //      startActivity(new Intent(this, Menu3.class));
      //  }
      //  return true;
        switch (item.getItemId()){
            case R.id.menu1 :
                Toast.makeText(this, "Menu 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2 :
                Toast.makeText(this, "Menu 2 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3 :
                Toast.makeText(this, "Menu 3 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}