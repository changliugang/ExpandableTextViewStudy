package com.changlg.cn.expandabletextviewstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.changlg.cn.expandabletextviewstudy.view.ExpandableTextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 不能直接在父级布局中使用
        ExpandableTextView etv = (ExpandableTextView) findViewById(R.id.expand_text_view);


        assert etv != null;
        etv.setOnExpandStateChangeListener(new ExpandableTextView.OnExpandStateChangeListener() {
            @Override
            public void onExpandStateChanged(TextView textView, boolean isExpanded) {
                if (isExpanded){
                    textView.setTextColor(getResources().getColor(android.R.color.holo_blue_light));
                }else {
                    textView.setTextColor(getResources().getColor(android.R.color.holo_orange_light));
                }
            }
        });
        etv.setText(getString(R.string.dummy_text3));

    }
}
