package com.brad.pizzabuilder;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.TextView;
        import java.util.ArrayList;
        import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Topping> toppings;
    Context mContext;
    LayoutInflater mInflater;
    private ArrayList<Topping> tempToppings = null;
    private PizzaType pizzaType;

    public CustomAdapter(Context context, ArrayList<Topping> toppings, ArrayList<Topping> tempToppings, PizzaType pizzaType){
        mContext = context;
        this.toppings =  toppings;
        this.tempToppings = tempToppings;
        this.pizzaType = pizzaType;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.toppings.size();
    }

    @Override
    public Object getItem(int position) {
        return toppings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BasePizza customPizza = null;
        View view = mInflater.inflate(R.layout.toppingcell, null);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBoxTopping);
        checkBox.setText(toppings.get(position).getName());
        final int checkboxIndex = position;

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switch (pizzaType){
                        case Meat:
                            BasePizza meatPizza = PizzaManager.getInstance().makePizza(PizzaType.Meat);
                            meatPizza.addTopping(toppings.get(checkboxIndex));
                            Toast toast = Toast.makeText(mContext,String.valueOf(meatPizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                        case Veggie:
                            BasePizza veggiePizza = PizzaManager.getInstance().makePizza(PizzaType.Veggie);
                            veggiePizza.addTopping(toppings.get(checkboxIndex));
                            toast = Toast.makeText(mContext,String.valueOf(veggiePizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                        case Custom:
                            BasePizza customPizza = PizzaManager.getInstance().makePizza(PizzaType.Custom);
                            customPizza.addTopping(toppings.get(checkboxIndex));
                             toast = Toast.makeText(mContext,String.valueOf(customPizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();
                            break;

                            //NOTE: TO ADD A TOPPING YOU HAVE TO USE THE PizzaManager to make a pizza and then add a topping
                            //by using the toppings list to add the current item that's checked to the list of toppings.
                            //You might have to create an integer index to hold the current position value to use as an index to
                            //the master list.
                            //  toast = Toast.makeText(mContext,"Custom.", Toast.LENGTH_SHORT);
                            // toast.show();
                    }

                }else{
                    switch (pizzaType){
                        case Meat:
                            BasePizza meatPizza = PizzaManager.getInstance().makePizza(PizzaType.Meat);
                            meatPizza.removeTopping(toppings.get(checkboxIndex));
                            Toast toast = Toast.makeText(mContext,String.valueOf(meatPizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();

                            break;
                        case Veggie:
                            BasePizza veggiePizza = PizzaManager.getInstance().makePizza(PizzaType.Veggie);
                            veggiePizza.removeTopping(toppings.get(checkboxIndex));
                            toast = Toast.makeText(mContext,String.valueOf(veggiePizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                        case Custom:
                            BasePizza customPizza = PizzaManager.getInstance().makePizza(PizzaType.Custom);
                            customPizza.removeTopping(toppings.get(checkboxIndex));
                            toast = Toast.makeText(mContext,String.valueOf(customPizza.toppings.size()),Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                    }

                }

            }
        });
        if (this.tempToppings!= null){
            int i;
            for (i=0;i<=tempToppings.size()-1;i++){
                if (this.tempToppings.get(i).getName().equals(toppings.get(position).getName())){
                    checkBox.setChecked(true);
                }
            }


        }

        return view;
    }
}
