package com.example.suleymansrc.servisamca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Hakkimizda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkimizda);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.cikis){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }else if(id==R.id.sifremidegitir){
            Intent intent=new Intent(Hakkimizda.this,SifreDegistir.class);
            startActivity(intent);
        }else if(id==R.id.hakkında){
            Intent intent=new Intent(Hakkimizda.this,Hakkimizda.class);
            startActivity(intent);
        }else if(id==R.id.anasayfa){
            Intent intent=new Intent(Hakkimizda.this,MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }
}
