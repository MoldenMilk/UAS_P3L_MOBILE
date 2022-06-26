package com.example.atmarental.Data;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.databinding.DataBindingUtil;
import com.example.atmarental.R;
import com.example.atmarental.databinding.RvMobilBinding;

import java.util.ArrayList;

public class RecyclerViewDaftarMobil extends RecyclerView.Adapter<RecyclerViewDaftarMobil.viewHolder> {
    ArrayList<Mobil> listMobil = new DaftarMobil().Mobil;

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        RvMobilBinding data =DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.rv_mobil, parent, false);
        return new viewHolder(data);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewDaftarMobil.viewHolder holder, int position) {
        Mobil list = listMobil.get(position);
        holder.data.setMobil(list);
    }

    @Override
    public int getItemCount() {
        if (listMobil != null) {
            return listMobil.size();
        } else {
            return 0;
        }
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private RvMobilBinding data;

        public viewHolder(@NonNull RvMobilBinding data) {
            super(data.getRoot());
            this.data = data;
        }
    }
}
