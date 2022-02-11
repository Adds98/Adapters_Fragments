package com.practice.adapters.adapter;

import android.content.Context;

import com.practice.adapters.model.Pet;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PetAdapter {//Extender de RecyclerView.Adapter<ViewHolder>
    //El layout del adapter -> card_pet.xml
    //El View Holder debe contener el ImageView, TextView(Nombre), TextView(Descripcion), TextView(Sexo) ImageView(Sexo), TextView(Edad) y ImageButton
    //Para cargar imagenes externas o desde una url(Uri en Java)
    //Se debe usar Picasso
    //    Picasso.get()
    //        .load(<Uri>)
    //        .resize(300, 300)
    //        .centerCrop()
    //        .placeholder(<Drawable para mostrar mientras se carga la imagen>)
    //        .error(<Drawable a mostrar si hay un error al cargar la imagen>)
    //        .into(<ImageView donde se cargara la imagen>);
    List<Pet> petList;
    Context context;
    OnClickPet onClickPet;
    public PetAdapter(Context context, List<Pet> petList) {
        this.petList = petList;
        this.context = context;
    }

    //Interfaz para implementar la comunicación de la Mascota seleccionada
    public void setOnClickPet(OnClickPet onClickPet) {
        this.onClickPet = onClickPet;
    }

    public interface OnClickPet{
        void onPetSelected(int position, Pet pet);
    }
}
