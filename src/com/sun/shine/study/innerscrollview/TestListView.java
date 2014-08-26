
package com.sun.shine.study.innerscrollview;

import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;

import com.sun.shine.study.innerscrollview.view.InnerListView;
import com.sun.shine.study.innerscrollview.view.InnerScrollView;

public class TestListView extends Activity {

    ScrollView scrollView;

    InnerListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_test);
        listView = (InnerListView)findViewById(R.id.list);
        scrollView = (ScrollView)findViewById(R.id.scroll_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.select_dialog_singlechoice);
        for (int i = 0; i < 100; i++) {
            adapter.add(String.valueOf(i));
        }
        listView.setAdapter(adapter);
        listView.setCacheColorHint(0x00000000);
        listView.setBackgroundDrawable(null);
        listView.setBackgroundColor(Color.WHITE);
        listView.setParentScrollView(scrollView);
        listView.setMaxHeight(400);

    }
}
