package com.city.cityjava;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AlgorithmConstraints;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    Context c;
    List<Model> list;
    int size;

    public  Adapter(Context c, List<Model> list, int size){
        this.c=c;
        this.list=list;
        this.size=size;
    }

    @NonNull
    @Override
    public Adapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyAdapter(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyAdapter holder, int position) {
        Model model=list.get(position);
        holder.profileImage.setImageResource(model.getProfileImage());
        holder.userCidade.setText(model.getUserCidade());
        holder.userEstado.setText(model.getUserEstado());
        holder.destalhesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(view.getRootView().getContext());
                View dialogView=LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.detalhes_dialog,null);
                de.hdodenhof.circleimageview.CircleImageView dialog_box_profile_image;
                TextView dialog_box_user_cidade;
                TextView dialog_box_user_estado;
                dialog_box_profile_image=dialogView.findViewById(R.id.dialog_box_user_image);
                dialog_box_user_cidade=dialogView.findViewById(R.id.dialog_box_user_cidade);
                dialog_box_user_estado=dialogView.findViewById(R.id.dialog_box_user_estado);
                dialog_box_profile_image.setImageResource(model.getProfileImage());
                dialog_box_user_cidade.setText(model.getUserCidade());
                dialog_box_user_estado.setText(model.getUserEstado());
                builder.setView(dialogView);
                builder.setCancelable(true);
                builder.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class MyAdapter extends RecyclerView.ViewHolder {
        de.hdodenhof.circleimageview.CircleImageView profileImage;
        TextView userCidade;
        TextView userEstado;
        Button destalhesBtn;

        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            profileImage=itemView.findViewById(R.id.imageView);
            userCidade=itemView.findViewById(R.id.user_cidade);
            userEstado=itemView.findViewById(R.id.user_estado);
            destalhesBtn=itemView.findViewById(R.id.user_detalhes);
        }
    }
}
