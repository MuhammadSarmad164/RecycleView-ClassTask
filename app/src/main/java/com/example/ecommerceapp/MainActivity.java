package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SelectListener{
     RecyclerView recyclerView;
     CustomAdapter adapter;
     ArrayList<ModelClass> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RecyclerView);
        arrayList=new ArrayList<>();

        arrayList.add(new ModelClass(R.drawable.item1, "Pakistan's e-commerence mainly involves buying and selling goods, and services using internet or telephone", "Store Shop items", "9"));
        arrayList.add(new ModelClass(R.drawable.icon6, "Head & Shoulders is a trusted brand for dandruff control, ensuring a healthy scalp.", "Head & Shoulders", "8"));
        arrayList.add(new ModelClass(R.drawable.item6, "Fast Food shampoos provide nourishment and moisture, heigh protien soft and manageable.", "Fast Food Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item7, "live Kitchen  offers advanced food option and fresh taste  results for various food quality.", "Live Kitchen Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item5, "Home Appliences  infuses natural ingredients for a refreshing and aromatic hair-washing experience.", "Home Appliences", "8"));
        arrayList.add(new ModelClass(R.drawable.item4, "Online Shope focus on the power of fruits and botanicals for healthy and vibrant hair.", "Online Shope Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item3, "Tresemmé offers salon-quality shampoos designed to give your hair a professional touch.", "Online Trading", "8"));
        arrayList.add(new ModelClass(R.drawable.item8, "Aveda's plant-based products promote hair and scalp wellness while being environmentally conscious.", "Washroom Clean Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item9, "Glass Wash Items is known for its affordable yet effective hair care solutions, suitable for daily use.", "Glash Wash Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item10, "Nexxus specializes in luxurious hair care, targeting specific hair concerns and restoring shine and strength.", "Nexxus", "8"));
        arrayList.add(new ModelClass(R.drawable.icon6, "Head & Shoulders is a trusted brand for dandruff control, ensuring a healthy scalp.", "Head & Shoulders", "8"));
        arrayList.add(new ModelClass(R.drawable.item6, "Fast Food shampoos provide nourishment and moisture, heigh protien soft and manageable.", "Fast Food Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item7, "live Kitchen  offers advanced food option and fresh taste  results for various food quality.", "Live Kitchen Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item5, "Home Appliences infuses natural ingredients for a refreshing and aromatic hair-washing experience.", "Home Appliences ", "8"));
        arrayList.add(new ModelClass(R.drawable.item4, "Online Shope focus on the power of fruits and botanicals for healthy and vibrant hair.", "Online Shope Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item3, "Tresemmé offers salon-quality shampoos designed to give your hair a professional touch.", "Online Trading", "8"));
        arrayList.add(new ModelClass(R.drawable.item8, "Aveda's plant-based products promote hair and scalp wellness while being environmentally conscious.", "Washroom Clean Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item9, "Glass Wash Items  is known for its affordable yet effective hair care solutions, suitable for daily use.", "Glash Wash Items", "8"));
        arrayList.add(new ModelClass(R.drawable.item10, "Nexxus specializes in luxurious hair care, targeting specific hair concerns and restoring shine and strength.", "Nexxus", "8"));
        adapter=new CustomAdapter(MainActivity.this,arrayList,this);


        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setHasFixedSize(true);

    }

    @Override
    public void onItemClicked(ModelClass modelClass) {
       Intent i=new Intent(MainActivity.this, ProductInfo.class);
       i.putExtra("product_name",modelClass.NameP);
       i.putExtra("image_data",modelClass.flagImg);
       i.putExtra("desciptionProduct",modelClass.Description);
       i.putExtra("remainingProduct",modelClass.RemaingP);
       startActivity(i);
    }
}