package com.tzutalin.dlib;

import android.os.Environment;

import java.io.File;

public final class Constants {
    private Constants() {
    }

    public static String getFaceShapeModelPath() {
        File sdcard = Environment.getExternalStorageDirectory();
        String targetPath = sdcard.getAbsolutePath() + File.separator + "shape_predictor_68_face_landmarks.dat";
        return targetPath;
    }
}
