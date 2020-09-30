package com.example.costumlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    ArrayList<thoitiet> arrayThoiTiet;
    thoitietAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new thoitietAdapter(this,R.layout.dong_thoitiet,arrayThoiTiet);
        list.setAdapter(adapter);
    }

    private void Anhxa() {
        list = (ListView) findViewById(R.id.listviewThoiTiet);
        arrayThoiTiet = new ArrayList<>();
        arrayThoiTiet.add(new thoitiet("Hà nội","30 độ",R.drawable.may));
        arrayThoiTiet.add(new thoitiet("Đông hà","30 độ",R.drawable.muanang));
        arrayThoiTiet.add(new thoitiet("Đà nẵng","30 độ",R.drawable.nang));
        arrayThoiTiet.add(new thoitiet("Đồng nai","30 độ",R.drawable.nangmay));
        arrayThoiTiet.add(new thoitiet("TP. HCM","30 độ",R.drawable.nangmua));
        arrayThoiTiet.add(new thoitiet("Hà nội","30 độ",R.drawable.may));
        arrayThoiTiet.add(new thoitiet("Đông hà","30 độ",R.drawable.muanang));
        arrayThoiTiet.add(new thoitiet("Đà nẵng","30 độ",R.drawable.nang));
        arrayThoiTiet.add(new thoitiet("Đồng nai","30 độ",R.drawable.nangmay));
        arrayThoiTiet.add(new thoitiet("TP. HCM","30 độ",R.drawable.nangmua));
    }
}