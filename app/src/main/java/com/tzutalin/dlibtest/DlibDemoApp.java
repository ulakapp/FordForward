

package com.tzutalin.dlibtest;

import android.app.Application;
import android.util.Log;

import timber.log.Timber;

/**
 * Created by tzutalin on 2017/2/23.
 */
public class DlibDemoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
            //Timber.plant(new DebugLogFileTree(Environment.getExternalStorageDirectory().toString()));
        } else {
            Timber.plant(new ReleaseTree());
        }
    }

    /**
     * A tree which logs important information
     */
    private static class ReleaseTree extends Timber.DebugTree {
        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return;
            }
            super.log(priority, tag, message, t);
        }
    }
}
