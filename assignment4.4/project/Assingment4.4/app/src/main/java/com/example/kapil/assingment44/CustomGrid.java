package com.example.kapil.assingment44;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

    class CustomGrid extends BaseAdapter {
        private Context mContext;
        private final String[] iname;
        private final Integer[] Imageid;

        public CustomGrid(Context c, String[] iname, Integer[] Imageid) {
            mContext = c;
            this.Imageid = Imageid;
            this.iname = iname;
        }

        @Override
        public int getCount() {
            return iname.length;
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
            View grid;
            LayoutInflater inflater = (LayoutInflater) mContext
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (convertView == null) {

                grid = inflater.inflate(R.layout.row, null);
                TextView textView = (TextView) grid.findViewById(R.id.image);
                ImageView imageView = (ImageView) grid.findViewById(R.id.image);
                textView.setText(iname[position]);
                imageView.setImageResource(Imageid[position]);
            } else {
                grid = convertView;
            }

            return grid;
        }
    }