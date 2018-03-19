package com.firehook.quiz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


public class RecyclerItemListener implements RecyclerView.OnItemTouchListener {

    private RecyclerTouchListener listener;
    private GestureDetector gd;

    public interface RecyclerTouchListener{
        public void onClickItem(View view, int position);
        public void onLongClickItem(View v, int position); //TODO
    }

    public RecyclerItemListener(Context context, final RecyclerView rv,
                                final RecyclerTouchListener listener) {
        this.listener = listener;
        gd = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View v = rv.findChildViewUnder(e.getX(), e.getY());
                listener.onClickItem(v, rv.getChildPosition(v));
                Log.d("TAG", " * * * * * OnClick");
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        return ( child != null && gd.onTouchEvent(e));
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }
}
