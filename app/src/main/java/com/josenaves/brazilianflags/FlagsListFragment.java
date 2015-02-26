package com.josenaves.brazilianflags;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class FlagsListFragment extends ListFragment  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Resources res = getResources();

        ImageTextAdapter adapter = new ImageTextAdapter(
                getActivity(),
                R.layout.fragment_list_item,
                res.getStringArray(R.array.state_names),
                res.obtainTypedArray(R.array.state_flags));

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(getActivity(), item + " selected", Toast.LENGTH_SHORT).show();
    }
}