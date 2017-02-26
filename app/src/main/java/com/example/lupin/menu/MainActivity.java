package com.example.lupin.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.menutest.R;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

      /*  MenuInflater m=getMenuInflater();
        m.inflate(R.menu.menulayout,menu);*/
        Toast.makeText(MainActivity.this," onCreateOptionsMenu()菜单初始化是调用，只调用一次", Toast.LENGTH_SHORT).show();
        menu.add(0,1,0,R.string.menu_name);
        menu.add(0,2,0,R.string.rice);
        menu.add(0,3,0,R.string.soup);

        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        Toast.makeText(MainActivity.this,"onPrepareOptionsMenu()在菜单显示前，调用该方法", Toast.LENGTH_SHORT).show();
         // menu.add("onPrepareOptionsMenu添加第一个Item");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        Toast.makeText(MainActivity.this,"onMenuOpened（）菜单点开", Toast.LENGTH_SHORT).show();

        return super.onMenuOpened(featureId, menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(MainActivity.this,item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }


}
