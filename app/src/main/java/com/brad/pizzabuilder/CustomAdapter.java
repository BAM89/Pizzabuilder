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
                BasePizza genericPizza;
                genericPizza=PizzaManager.getInstance().createPizzaWithToppings(pizzaType,checkboxIndex,isChecked);
                Toast toast = Toast.makeText(mContext,String.valueOf(genericPizza.toppings.size()),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
/*        if (this.tempToppings!= null){
            int i;
            for (i=0;i<=tempToppings.size()-1;i++){
                if (this.tempToppings.get(i).getName().equals(toppings.get(position).getName())){
                    checkBox.setChecked(true);
                }
            }


        }*/

        return view;
    }
}
