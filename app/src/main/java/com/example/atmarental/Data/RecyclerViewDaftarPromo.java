package com.example.atmarental.Data;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.databinding.DataBindingUtil;
import com.example.atmarental.databinding.RvPromoBinding;
import com.example.atmarental.R;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class RecyclerViewDaftarPromo extends RecyclerView.Adapter<RecyclerViewDaftarPromo.viewHolder> {
    ArrayList<Promo> listPromo = new DaftarPromo().Promo;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        RvPromoBinding data =DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.rv_promo, parent, false);
        return new viewHolder(data);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewDaftarPromo.viewHolder holder, int position) {
        Promo list = listPromo.get(position);
        holder.data.setPromo(list);
    }

    @Override
    public int getItemCount() {
        if (listPromo != null) {
            return listPromo.size();
        } else {
            return 0;
        }
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private RvPromoBinding data;

        public viewHolder(@NonNull RvPromoBinding data) {
            super(data.getRoot());
            this.data = data;
        }
    }
}
