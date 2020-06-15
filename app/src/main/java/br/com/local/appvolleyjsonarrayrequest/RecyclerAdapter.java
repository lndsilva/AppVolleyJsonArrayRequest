package br.com.local.appvolleyjsonarrayrequest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    ArrayList<Contatos> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Contatos> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.modelo_lista, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.Nome.setText(arrayList.get(position).getNome());
        holder.Email.setText(arrayList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Nome, Email;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Nome = itemView.findViewById(R.id.txtNomeContato);
            Email = itemView.findViewById(R.id.txtEmailContato);
        }
    }
}
