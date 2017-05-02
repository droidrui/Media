package com.droidrui.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView mListView;
    private ArrayList<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = new ArrayList<>();
        mList.add("EncodeAndMuxTest");
        mList.add("CameraToMpegTest");
        mList.add("EncodeDecodeTest");
        mList.add("DecoderTest ");
        mList.add("encodeAndMuxTest");
        mList.add("encodeAndMuxTest");
        mList.add("encodeAndMuxTest");
        mList.add("encodeAndMuxTest");
        mList.add("encodeAndMuxTest");
        mList.add("encodeAndMuxTest");

        mListView = (ListView) findViewById(R.id.list_view);
        TestItemAdapter adapter = new TestItemAdapter(this, mList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, EncodeAndMuxActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, CameraToMpegActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, EncodeDecodeActivity.class));
                        break;
                    case 3:

                        break;
                }
            }
        });
    }


}
