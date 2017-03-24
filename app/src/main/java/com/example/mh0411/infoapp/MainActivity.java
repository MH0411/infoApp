package com.example.mh0411.infoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialComponents();
    }

    protected void initialComponents(){

        View toolbarLayout = findViewById(R.id.toolbarLayout);
        Toolbar toolbar = (Toolbar) toolbarLayout.findViewById(R.id.toolbar);

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem username = new PrimaryDrawerItem().withIdentifier(1).withName(R.string.drawer_item_user);

        SecondaryDrawerItem home = new SecondaryDrawerItem().withIdentifier(2).withName(R.string.drawer_item_home);
        SecondaryDrawerItem first = new SecondaryDrawerItem().withIdentifier(3).withName(R.string.drawer_item_first);
        SecondaryDrawerItem second = new SecondaryDrawerItem().withIdentifier(4).withName(R.string.drawer_item_second);

        //create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(
                        username,
                        new DividerDrawerItem(),
                        home,
                        first,
                        second
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        // do something with the clicked item :D
                        return true;
                    }
                })
                .build();
    }
}
