package Adapters;

import android.content.Context;
import android.media.Image;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mauryafood.Bottom_Sheet_Fragment;
import com.example.mauryafood.Models.Food_model;
import com.example.mauryafood.R;

import java.util.ArrayList;

public class Food_Ad extends RecyclerView.Adapter<Food_Ad.viewHolder> {

    ArrayList<Food_model> list;
    Context context;
    public Food_Ad(ArrayList<Food_model> list,Context context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view= LayoutInflater.from(context).inflate(R.layout.recycle_design,null);
        return new viewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder,int position){
        Food_model model=list.get(position);
        holder.img.setImageResource(model.getPic());
        holder.text.setText(model.getText());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"It's Food",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount(){
        return list.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        public viewHolder(@NonNull View itemView){
            super(itemView);

            img=itemView.findViewById(R.id.image);
            text=itemView.findViewById(R.id.textV);
        }
    }
}
