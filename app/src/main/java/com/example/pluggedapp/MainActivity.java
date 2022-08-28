package com.example.pluggedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.morgoo.droidplugin.PluginApplication;
import com.morgoo.droidplugin.PluginHelper;
import com.morgoo.droidplugin.pm.PluginManager;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"kkk",Toast.LENGTH_SHORT).show();
                try {


                    PluginManager.getInstance().installPackage("C:\\Users\\hp\\AndroidStudioProjects\\Embed_unityLibrary_task\\app\\build\\intermediates\\apk\\debug",0);
                } catch (RemoteException e) {

                    e.printStackTrace();
                }
            }
        });
}


}