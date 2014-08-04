package com.naveen09.awesometext;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.Toast;

/**
 * 
 * @author naveen09 Naveen Aechan
 * 
 */
class AwesomeWidgetUtils
{
    final static String   TAG          = "AwesomeWidgetUtils";

    public static String  SPACE        = " ";

    private static String font_awesome = "fonts/fontawesome-webfont.ttf";

    public enum POSITION {
        LEFT, RIGHT;
    }

    /**
     * 
     * @param iconPosition
     * @return
     */
    public static POSITION getPosition(String iconPosition)
    {
        if (null == iconPosition)
        {
            return POSITION.LEFT;
        }
        return iconPosition.equals("0") ? POSITION.LEFT : POSITION.RIGHT;
    }

    /**
     * 
     * @param context
     * @return
     */
    public static Typeface getFAFont(Context context)
    {
        Typeface tf = null;
        try
        {
            tf = Typeface.createFromAsset(context.getAssets(), font_awesome);
        } catch (Exception e)
        {
            Log.e(TAG, "Failed to load FontAwesome Font");
            Toast.makeText(context,
                           "Failed to load FontAwesome Font",
                           Toast.LENGTH_SHORT).show();
        }
        return tf;
    }
}
