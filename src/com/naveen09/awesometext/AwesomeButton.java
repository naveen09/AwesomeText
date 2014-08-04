package com.naveen09.awesometext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

import com.naveen09.awesometext.AwesomeWidgetUtils.POSITION;

/**
 * 
 * @author naveen09 Naveen Aechan
 * 
 */
public class AwesomeButton
    extends Button
{
    final static String TAG = "AwesomeButton";

    private Context     mContext;

    /**
     * 
     * @param context
     * @param attrs
     * @param defStyle
     */
    public AwesomeButton(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        mContext = context;
    }

    /**
     * 
     * @param context
     * @param attrs
     */
    public AwesomeButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        mContext = context;
        TypedArray attributes = mContext.obtainStyledAttributes(attrs,
                                                                R.styleable.AwesomeWidget);
        String icon = attributes.getString(R.styleable.AwesomeWidget_faIcon);
        String iconPosition = attributes.getString(R.styleable.AwesomeWidget_iconPosition);
        if (null != icon)
        {
            setIcon(icon, AwesomeWidgetUtils.getPosition(iconPosition));
        }
        attributes.recycle();
    }

    /**
     * 
     * @param context
     */
    public AwesomeButton(Context context)
    {
        super(context);
        mContext = context;
    }

    /**
     * 
     * @param iconText
     * @param position
     */
    public void setIcon(String iconText, POSITION position)
    {
        updateWidget(iconText, position);
    }

    /**
     * 
     * @param iconText
     * @param position
     */
    public void setIcon(int iconText, POSITION position)
    {
        String icon = mContext.getResources().getString(iconText);
        updateWidget(icon, position);
    }

    /**
     * 
     * @param icon
     * @param position
     */
    private void updateWidget(String icon, POSITION position)
    {
        String currentText = getText() == null ? "" : getText().toString();
        switch (position)
        {
        case LEFT:
            setText(icon + AwesomeWidgetUtils.SPACE + currentText);
            break;

        case RIGHT:
            setText(currentText + AwesomeWidgetUtils.SPACE + icon);
            break;
        }
        setTypeface(AwesomeWidgetUtils.getFAFont(mContext));
    }

}
