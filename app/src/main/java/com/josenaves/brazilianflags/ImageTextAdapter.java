package com.josenaves.brazilianflags;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageTextAdapter extends ArrayAdapter<String> {
	
	private LayoutInflater inflater;
	
	private String[] names;
	private TypedArray flags;
	
	private int viewResourceId;
	
	public ImageTextAdapter(Context ctx, int viewResourceId, String[] names, TypedArray flags) {
		super(ctx, viewResourceId, names);
		
		this.inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.names = names;
		this.flags = flags;
		this.viewResourceId = viewResourceId;
	}
	
	@Override
	public int getCount() {
		return names.length;
	}

	@Override
	public String getItem(int position) {
		return names[position];
	}
	
	@Override
	public long getItemId(int position) {
		return position;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = inflater.inflate(viewResourceId, null);
		
		ImageView imageView = (ImageView) convertView.findViewById(R.id.state_flag);
		imageView.setImageDrawable(flags.getDrawable(position));
		
		TextView textView = (TextView)convertView.findViewById(R.id.state);
		textView.setText(names[position]);
		
		return convertView;
	}
}