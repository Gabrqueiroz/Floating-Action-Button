package fcom.tads.fab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

//Link Materia de apoio https://www.youtube.com/watch?v=sZqQaZpVWdA

import com.google.android.material.internal.NavigationMenu;

import io.github.yavski.fabspeeddial.FabSpeedDial;

public class MainActivity extends AppCompatActivity {
    FabSpeedDial fabSpeedDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabSpeedDial = (FabSpeedDial) findViewById(R.id.button_fab);
        fabSpeedDial.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {

                Toast.makeText(getApplicationContext(),getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
