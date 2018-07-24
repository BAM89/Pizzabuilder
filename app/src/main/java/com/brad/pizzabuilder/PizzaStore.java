package com.brad.pizzabuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class PizzaStore extends AppCompatActivity {
    public Button btnOrder;
    public TextView tvTitle;
    public MeatLovers meatPizza;
    public Veggie vegetablePizza;
    public CustomPi custPizza;
    public PizzaBuilder builder;
    public ListView listViewToppings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_store);
        this.btnOrder = (Button)findViewById(R.id.orderButton);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Place your Order",Toast.LENGTH_LONG).show();
                startActivity(new Intent(PizzaStore.this,CustomPizza.class));
            }
        });
        PizzaManager.getInstance().startOrder();
        String jsonData = PizzaManager.getInstance().loadJSONFromAsset(getApplicationContext());
        JSONObject menu = new JSONObject(jsonData);
        

        this.tvTitle = (TextView)findViewById(R.id.header);
        //tvTitle.setText(PizzaManager.getInstance().getName());
       // meatPizza = new MeatLovers();
        //tvTitle.setText(String.valueOf(meatPizza.getPrice()));
        /*vegetablePizza = new Veggie();*/
        //builder = new PizzaBuilder();
        //builder.buildMeatLovers().getName();

       // tvTitle.setText(String.valueOf(PizzaManager.getInstance().makePizza(PizzaType.Custom).getName()));

    }

    @Override
    protected void onStart(){
        super.onStart();
    }

}
