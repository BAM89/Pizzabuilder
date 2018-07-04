package com.brad.pizzabuilder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.RadioGroup;
import android.content.Context;

public class CustomPizza extends AppCompatActivity {
    public Button makePizza;
    public ListView listViewToppings;
    RadioGroup radioGroup;
    public CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_pizza);
        this.makePizza=(Button)findViewById(R.id.btnMakePizza);
        makePizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CustomPizza.this,OrderSummary.class));

            }
        });
        PizzaManager.getInstance().startOrder();
        listViewToppings = (ListView)findViewById(R.id.listViewToppings);
        customAdapter = new CustomAdapter(this, PizzaManager.getInstance().getAllToppings(),null);
       listViewToppings.setAdapter(customAdapter);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButtonMeat:
                        customAdapter = new CustomAdapter(getApplicationContext(), PizzaManager.getInstance().getAllToppings(),PizzaManager.getInstance().makePizza(PizzaType.Meat).getToppings());
                        listViewToppings.setAdapter(customAdapter);
                        customAdapter.notifyDataSetChanged();

                        /*Toast toast = Toast.makeText(getApplicationContext(),"You've selected meat pizza.", Toast.LENGTH_LONG);
                        toast.show(); */
                        break;
                    case R.id.radioButtonVeggie:
                        /*toast = Toast.makeText(getApplicationContext(),"You've selected veggie pizza.", Toast.LENGTH_LONG);
                        toast.show();*/
                        break;
                    case R.id.radioButtonCustom:
                        /*toast = Toast.makeText(getApplicationContext(),"Please select your toppings.", Toast.LENGTH_LONG);
                        toast.show();*/
                        break;
                }
            }
        });

    }

    @Override
    protected void onStart(){
        super.onStart();
    }
}
