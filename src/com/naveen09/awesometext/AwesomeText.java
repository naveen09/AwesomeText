package com.naveen09.awesometext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class AwesomeText
    extends TextView
{
    public AwesomeText(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        ctx = context;

    }

    private static String SPACE        = " ";

    private static String font_awesome = "fonts/fontawesome-webfont.ttf";

    private Context       ctx;

    public void setIcon(String iconText, AwesomeTextUtils position)
    {
        String currentText = getText() == null ? "" : getText().toString();
        switch (position)
        {
        case LEFT:
            setText(iconText + SPACE + currentText);
            break;

        case RIGHT:
            setText(currentText + SPACE + iconText);
            break;
        }
        setTypeface(getFAFont(ctx));
    }

    public static Typeface getFAFont(Context context)
    {
        Typeface tf = Typeface.createFromAsset(context.getAssets(),
                                               font_awesome);
        return tf;
    }
}
