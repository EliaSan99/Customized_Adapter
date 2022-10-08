package com.example.actv4customizedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ListView lvNombres;
    private ArrayList<Info> info;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNombres = (ListView) findViewById(R.id.lvNombres);
        info = new ArrayList<Info>();
        info.add(new Info("Elias","Sanchez", "Garcia"));
        info.add(new Info("Carlos","Morales", "Bautista"));
        info.add(new Info("Violeta","Castro", "Flores"));
        info.add(new Info("Pilar","Arellanos", "Garcia"));
        info.add(new Info("Javier","Gatica", "Lopez"));
        info.add(new Info("Felipe","Vargas", "Garcia"));
        info.add(new Info("Arely","Flores", "Martinez"));

        NamesAdapter adapter = new NamesAdapter(this, R.layout.list_alumnos,info);
        lvNombres.setAdapter(adapter);

        lvNombres.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(MainActivity.this, "Hiciste tap en: "+ info.get(position), Toast.LENGTH_LONG).show();
            }
        });


    }
}