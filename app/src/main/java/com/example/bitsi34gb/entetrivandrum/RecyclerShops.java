package com.example.bitsi34gb.entetrivandrum;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerShops extends RecyclerView.Adapter<RecyclerShops.ViewHolder>{
    private List<String> arrayList = new ArrayList<>();
    private Context context;
    @NonNull
    @Override
    public RecyclerShops.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView view = (CardView)
                LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewshops,parent,false);
        return new ViewHolder(view);
    }


    public RecyclerShops(Context context) {
        this.context = context;
    }


        public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.card_view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerShops.ViewHolder viewHolder, int i) {
        final CardView cardView = viewHolder.cardView;
        final Context context = cardView.getContext();
        final TextView textView3 = (TextView)cardView.findViewById(R.id.textView3);
        final ImageView imageView = (ImageView)cardView.findViewById(R.id.imageView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(),Shopsoffer.class);
                context.startActivity(intent);

            }
        });



/*
        try{
            if(arrayList!=null){
                textView.setText(arrayList.get(i).getName());
                textView3.setText(arrayList.get(i).getArtists());
                Glide.with(context).load(arrayList.get(i).getImage()).into(imageView);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context.getApplicationContext(),Exoplayer.class);
                        intent.putExtra(String.valueOf(Exoplayer.play_pos),position);
                        intent.putExtra(Exoplayer.play_url,arrayList.get(position).getUrl1());
                        context.startActivity(intent);

                    }
                });
            }
        }catch (Exception e){
            e.printStackTrace();
            Toast toast = Toast.makeText(context,"its error",Toast.LENGTH_LONG);
            toast.show();
        }
*/


    }

    @Override
    public int getItemCount() {

        //int length = arrayList.size();
        return 10;

    }
}
