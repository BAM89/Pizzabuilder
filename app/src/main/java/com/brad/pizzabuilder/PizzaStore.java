package com.brad.pizzabuilder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.net.*;

import java.io.IOException;
import java.net.*;
import android.graphics.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PizzaStore extends AppCompatActivity {
    public Button btnOrder;
    public TextView tvTitle;
    public MeatLovers meatPizza;
    public Veggie vegetablePizza;
    public CustomPi custPizza;
    public PizzaBuilder builder;
    public ListView listViewToppings;
    public ImageView imageView;

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
        try{
            JSONObject menu = new JSONObject(jsonData);
            JSONObject appetizer = menu.getJSONObject("Appetizer");
            Log.d("Appetizer", appetizer.getString("Breadsticks"));
            JSONArray chicken = menu.getJSONArray("Toppings");
            //Log.d("Wings"), chicken.getString(0);
            this.tvTitle = (TextView)findViewById(R.id.header);
            tvTitle.setText(chicken.getJSONObject(0).getString("Name"));
            this.imageView =(ImageView)findViewById(R.id.imageView);
           try{
               URL newurl = new URL(chicken.getJSONObject(0).getString("Image"));
               Bitmap mIcon_val = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
               this.imageView.setImageBitmap(mIcon_val);
           }catch (MalformedURLException e){
               Log.d("Appetizer", appetizer.getString("Breadsticks"));
           }catch (IOException e){

           }

        }catch (JSONException e){

        }


        //this.tvTitle = (TextView)findViewById(R.id.header);
        //tvTitle.setText(appetizer.getString(0));
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
