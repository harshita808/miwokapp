package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word>words) {
        super(context,0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
View listItemView=convertView;
if(listItemView==null){
    listItemView= LayoutInflater.from(getContext()).inflate(
            R.layout.list_item,parent,false);
}
        Word currentWord=getItem(position);

//find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

//find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()){
            //set the ImageView to the image resource specified in the current Word.
            imageView.setImageResource(currentWord.getImageResourceId());

            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }

        else{
            //otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }



        return  listItemView;
    }
}
