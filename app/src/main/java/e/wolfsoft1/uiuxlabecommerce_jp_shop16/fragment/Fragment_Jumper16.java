package e.wolfsoft1.uiuxlabecommerce_jp_shop16.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop16.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop16.adapter.Jumper_Adapter16;
import e.wolfsoft1.uiuxlabecommerce_jp_shop16.model.Model_Shop15;

public class Fragment_Jumper16 extends android.support.v4.app.Fragment {

    private RecyclerView recyclerview_jumper;
    private ArrayList<Model_Shop15> jumperArrayList;

    Integer[] jumper_image = {R.drawable.profile15_1, R.drawable.profile15_2, R.drawable.profile15_3,R.drawable.profile15_1, R.drawable.profile15_2, R.drawable.profile15_3};
    String[] jumper_name = {"JUMPER", "IVORY TIE DETAIL JUMPER", "SOLID LONGLINE JUMPER","JUMPER", "IVORY TIE DETAIL JUMPER", "SOLID LONGLINE JUMPER"};
    String[] price = {"$ 323", "$ 379", "$ 236","$ 323", "$ 379", "$ 236"};
    String[] description = {"The classic knitted design all over.", "Stay warm, stay stylish.", "Look unique and trendy.","The classic knitted design all over.", "Stay warm, stay stylish.", "Look unique and trendy."};
    String[] style = {"DOROTHY PERKINS", "WHITE LACE", "BLACK STAR EMBELLISHED","DOROTHY PERKINS", "WHITE LACE", "BLACK STAR EMBELLISHED"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jumper16, container, false);
        recyclerview_jumper = view.findViewById(R.id.recyclerview_jumper);

        jumperArrayList = new ArrayList<>();


        for (int i = 0; i < jumper_image.length; i++) {
            Model_Shop15 modelShop15 = new Model_Shop15(jumper_image[i], jumper_name[i], price[i], description[i], style[i]);
            jumperArrayList.add(modelShop15);
        }

        Jumper_Adapter16 jumper_adapter = new Jumper_Adapter16(getActivity(), jumperArrayList);
        recyclerview_jumper.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview_jumper.setAdapter(jumper_adapter);
        return view;
    }
}
