package com.practice.adapters.adapter;

import android.content.Context;

import com.practice.adapters.model.Behavioral;

import java.util.List;

public class BehavioralAdapter {//Extender de RecyclerView.Adapter<ViewHolder>
    //El layout del adapter -> card_category_pet.xml
    //El View Holder debe contener el CardView, ImageView y TextView
    List<Behavioral> behaviors;
    Context context;

    public BehavioralAdapter(Context context, List<Behavioral> behaviors) {
        this.context = context;
        this.behaviors = behaviors;
    }
}
