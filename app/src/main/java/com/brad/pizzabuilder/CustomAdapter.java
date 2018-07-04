package com.brad.pizzabuilder;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.CheckBox;
        import android.widget.TextView;
        import java.util.ArrayList;
        import java.util.List;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Topping> toppings;
    Context mContext;
    LayoutInflater mInflater;
    private ArrayList<Topping> tempToppings = null;

    public CustomAdapter(Context context, ArrayList<Topping> toppings, ArrayList<Topping> tempToppings){
        mContext = context;
        this.toppings =  toppings;
        this.tempToppings = tempToppings;
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
        View view = mInflater.inflate(R.layout.toppingcell, null);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.checkBoxTopping);
        checkBox.setText(toppings.get(position).getName());
        if (this.tempToppings!= null){
            int i;
            for (i=0;i<=tempToppings.size();i++){
                if (this.tempToppings.get(i).getName().equals(toppings.get(position).getName())){
                    checkBox.setChecked(true);
                }
            }


        }

        return view;
    }
}
