package com.example.jonathas.mysql;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathas on 30/10/2017.
 */

public class ContatoAdapter extends ArrayAdapter {
    List list = new ArrayList<>();
    public ContatoAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public void add(@Nullable Contatos object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row;
        row = convertView;
        ContatoHolder contatoHolder;


        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout, parent,false);

            contatoHolder = new ContatoHolder();
            contatoHolder.tx_name = row.findViewById(R.id.text_name);
            contatoHolder.tx_user_name = row.findViewById(R.id.text_user_name);
            contatoHolder.tx_user_pass = row.findViewById(R.id.text_user_pass);

            row.setTag(contatoHolder);
        }
        else{
            contatoHolder = (ContatoHolder) row.getTag();
        }

        Contatos contatos = (Contatos) this.getItem(position);
        contatoHolder.tx_name.setText("texto");
        contatoHolder.tx_user_name.setText(contatos.getUser_name());
        contatoHolder.tx_user_pass.setText(contatos.getUser_pass());

        return row;
    }

    static class ContatoHolder{
        TextView tx_name, tx_user_name, tx_user_pass;
    }

}
