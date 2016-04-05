package com.changlg.cn.expandabletextviewstudy.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import me.codeboy.android.aligntextview.AlignTextView;

/**
 * Created by chang on 2016/4/5.
 */
public class AlignExpandableTextView extends LinearLayout implements View.OnClickListener{

    private static final String TAG = "AlignExpandableTextView";

    // 默认最大行数
    private static final int MAX_COLLAPSED_LINES = 8;

    // 默认动画运行时间
    private static final int DEFAULT_ANIM_DURATION = 300;

    /* The default alpha value when the animation starts */
    private static final float DEFAULT_ANIM_ALPHA_START = 0.7f;

    protected AlignTextView mAlignTextView;// 核心文字显示控件

    protected ImageButton mButton; // 展开or闭合的按钮

    private boolean mRelayout;

    private boolean mCollapsed = true; // 默认是闭合的

    private int mCollapsedHeight;

    private int mTextHeightWithMaxLines;

    private int mMaxCollapsedLines;

    private int mMarginBetweenTxtAndBottom;

    private Drawable mExpandDrawable;

    private Drawable mCollapseDrawable;

    private int mAnimationDuration;

    private float mAnimAlphaStart;

    private boolean mAnimating;



    public AlignExpandableTextView(Context context) {
        super(context);
    }

    public AlignExpandableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AlignExpandableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public AlignExpandableTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public void onClick(View v) {
        
    }

    public interface OnExpandStateChangeListener{
        void onExpandStateChanged();
    }

}
