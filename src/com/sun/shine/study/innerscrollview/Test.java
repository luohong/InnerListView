
package com.sun.shine.study.innerscrollview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        View list_view = findViewById(R.id.list_view);
        list_view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(Test.this, TestListView.class);
                startActivity(intent);
            }
        });

        View scroll_view = findViewById(R.id.scroll_view);
        scroll_view.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent = new Intent(Test.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
