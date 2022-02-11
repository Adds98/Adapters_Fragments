package com.practice.adapters.adapter;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;

import java.util.List;

public class ImagePetAdapter {//Extender de RecyclerView.Adapter<ViewHolder>
    //El layout del adapter -> card_img_pet.xml
    //El View Holder debe contener el ImageView y ImageButton
    Context context;
    List<Uri> uris;
    OnClickImagePetListener onClickImagePetListener;

    //Si cuenta con una Lista de Strings donde se encuentran las rutas o url de las imagenes
    //Puede usar la clase Convert.stringsToUris() o Convert.urisToStrings() del paquete utils
    public ImagePetAdapter(Context context, List<Uri> uris) {
        this.context = context;
        this.uris = uris;
    }
    //Interfaz para implementar la comunicación de la Imagen seleccionada a eliminar
    public void setOnClickImagePetListener(@NonNull OnClickImagePetListener listener){
        this.onClickImagePetListener = listener;
    }

    public interface OnClickImagePetListener {
        void onRemoveImage(int position);
    }
}
