package e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop16.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop16.model.Model_Shop15;

public class Jumper_Adapter16 extends RecyclerView.Adapter<Jumper_Adapter16.MyjumperHolder> {

    private final Context context;
    private final ArrayList<Model_Shop15> jumperArrayList;

    public Jumper_Adapter16(Context context, ArrayList<Model_Shop15> jumperArrayList) {
        this.context = context;
        this.jumperArrayList = jumperArrayList;
    }

    @NonNull
    @Override
    public MyjumperHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.item_jumper16, viewGroup, false);
        return new MyjumperHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyjumperHolder myjumperHolder, int i) {

        myjumperHolder.jumper_image.setImageResource(jumperArrayList.get(i).jumper_image());
        myjumperHolder.jumper_name.setText(jumperArrayList.get(i).getJumper_name());
        myjumperHolder.description.setText(jumperArrayList.get(i).getDescription());
        myjumperHolder.price.setText(jumperArrayList.get(i).getPrice());
        myjumperHolder.style.setText(jumperArrayList.get(i).getStyle());

        myjumperHolder.item_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(myjumperHolder.total_item.getText().toString());
                int value = i + 1;
                myjumperHolder.total_item.setText(String.valueOf(value));
            }
        });
        myjumperHolder.item_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(myjumperHolder.total_item.getText().toString());
                if (i != 0) {
                    int value = i - 1;
                    myjumperHolder.total_item.setText(String.valueOf(value));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return jumperArrayList.size();
    }

    class MyjumperHolder extends RecyclerView.ViewHolder {

        ImageView jumper_image;
        LinearLayout item_minus, item_plus;
        TextView jumper_name, description, price, style, total_item;

        public MyjumperHolder(@NonNull View itemView) {
            super(itemView);

            jumper_image = itemView.findViewById(R.id.jumper_image);
            jumper_name = itemView.findViewById(R.id.jumper_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            style = itemView.findViewById(R.id.style);
            item_minus = itemView.findViewById(R.id.item_minus);
            item_plus = itemView.findViewById(R.id.item_plus);
            total_item = itemView.findViewById(R.id.total_item);


        }
    }
}
