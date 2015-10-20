package training.course.getting_started;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by wangbin on 15-10-15.
 */
public class Logs {
    private static final String TAG = "wangb";
    public static void d(String info){
        Log.d(TAG, TextUtils.isEmpty(info)?"":info);
    }
    public static void d(int lineNumber){
        Log.d(TAG,String.valueOf(lineNumber));
    }
}
