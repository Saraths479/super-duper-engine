package com.lolipop.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruitArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple", R.drawable.apple_1));
        fruitArrayList.add(new Fruit("Banana", R.drawable.banana));
        fruitArrayList.add(new Fruit("bowl", R.drawable.bowl_1));
        fruitArrayList.add(new Fruit("bowl", R.drawable.bowl));
        fruitArrayList.add(new Fruit("broccoli", R.drawable.broccoli));
        fruitArrayList.add(new Fruit("cup", R.drawable.cup));
        fruitArrayList.add(new Fruit("cupcake", R.drawable.cupcake));
        fruitArrayList.add(new Fruit("dairy", R.drawable.dairy));
        fruitArrayList.add(new Fruit("dish", R.drawable.dish));
        fruitArrayList.add(new Fruit("egg", R.drawable.egg));
        fruitArrayList.add(new Fruit("fish", R.drawable.fish));
        fruitArrayList.add(new Fruit("flour", R.drawable.flour));
        fruitArrayList.add(new Fruit("food", R.drawable.food));
        fruitArrayList.add(new Fruit("fork", R.drawable.fork));
        fruitArrayList.add(new Fruit("grain", R.drawable.grain));
        fruitArrayList.add(new Fruit("grapes", R.drawable.grapes));
        fruitArrayList.add(new Fruit("ham", R.drawable.ham));

        FruitAdapter fruitAdapter = new FruitAdapter(this, fruitArrayList);
        ListView fruitListView = findViewById(R.id.fruitListView);
        fruitListView.setAdapter(fruitAdapter);
    }
}
