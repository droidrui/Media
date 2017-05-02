package com.droidrui.media;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/28.
 */

public class TestItemAdapter extends BaseAdapter {

    private ArrayList<String> mList;
    private LayoutInflater mInflater;
    private Activity mActivity;

    public TestItemAdapter(Activity activity, ArrayList<String> list) {
        mActivity = activity;
        mList = list;
        mInflater = LayoutInflater.from(mActivity);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_test, parent, false);
            holder.mTitleTv = (TextView) convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mTitleTv.setText(mList.get(position));
        return convertView;
    }

    private class ViewHolder {
        private TextView mTitleTv;
    }
}
