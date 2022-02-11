package com.practice.adapters.adapter;

import android.content.Context;

import java.util.List;

public class BadgePetAdapter {//Extender de RecyclerView.Adapter<ViewHolder>
    //El layout del adapter -> card_badge_pet.xml
    //El View Holder debe contener el TextView
    //Para el icono del Badge se recomienda usar la propiedad TextView.setCompoundDrawablesWithIntrinsicBounds(null,null, <Icon>, null);
    //Si requiere obtener el Drawable desde los recursos debe usar context.getResource().getDrawable(<Id>)
    List<String> badges;
    boolean showIcon;
    OnClickBadgePet onClickBadgeListener;
    Context context;

    public BadgePetAdapter(Context context, List<String> badges, boolean showIcon) {
        this.context = context;
        this.badges = badges;
        this.showIcon = showIcon;
    }
    //Interfaz para implementar la comunicación del Badge seleccionado
    public void setOnClickBadgeListener(OnClickBadgePet onClickBadgeListener) {
        this.onClickBadgeListener = onClickBadgeListener;
    }

    public interface OnClickBadgePet {
        void onClick(int position);
    }
}
