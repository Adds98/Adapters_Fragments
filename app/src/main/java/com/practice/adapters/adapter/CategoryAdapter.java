package com.practice.adapters.adapter;

import com.practice.adapters.model.Category;

import java.util.List;

public class CategoryAdapter{ //Extender de RecyclerView.Adapter<ViewHolder>
    //El layout del adapter -> card_category_pet.xml
    //El View Holder debe contener el CardView, ImageView y el TextView
    List<Category> categories;
    OnClickCategoryPet onClickCategoryPet;


    public CategoryAdapter(List<Category> categories){
        this.categories = categories;
    }

    //Interfaz para implementar la comunicación de la categoría seleccionada
    public void setCategoryPet(OnClickCategoryPet onClickCategoryPet) {
        this.onClickCategoryPet = onClickCategoryPet;
    }

    public interface OnClickCategoryPet {
         void onCategorySelected(Category category, int position);
    }
}
