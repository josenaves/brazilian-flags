package com.josenaves.brazilianflags;

import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    
    @Override
    public void onCreate(Bundle savedState) {
		super.onCreate(savedState);
		setContentView(R.layout.main);

        Resources res = getResources();

        ImageTextAdapter adapter = new ImageTextAdapter(this,
                R.layout.row,
                res.getStringArray(R.array.state_names),
                res.obtainTypedArray(R.array.state_flags));

        setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();
	}
}
