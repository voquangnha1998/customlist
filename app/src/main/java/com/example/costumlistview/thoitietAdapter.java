package com.example.costumlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class thoitietAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<thoitiet> thoitietList;

    public thoitietAdapter(Context context, int layout, List<thoitiet> thoitietList) {
        this.context = context;
        this.layout = layout;
        this.thoitietList = thoitietList;
    }

    @Override
    public int getCount() {
        return thoitietList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen,txtMota;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder = new ViewHolder();
            //ánh xạ
            holder.txtTen  = (TextView) convertView.findViewById(R.id.txtthanhpho);
            holder.txtMota =(TextView) convertView.findViewById(R.id.txtviewMota);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imgviewHinh);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }


        //gán giá trị
        thoitiet thoitiet = thoitietList.get(position);
        holder.txtTen.setText(thoitiet.getThanhpho());
        holder.txtMota.setText(thoitiet.getMota());
        holder.imgHinh.setImageResource(thoitiet.getHinh());
        //gán animation
        Animation animation = AnimationUtils.loadAnimation(context,R.anim.scale_list);
        convertView.startAnimation(animation);
        return convertView;
    }
}
