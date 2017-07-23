package com.princekumar.zolo.mvp;

/**
 * Created by princ on 22-07-2017.
 */

public class AppAllInterfaceTaskFinish {
    public interface OnLoginFinishedListener {
        void onError(int errorCode);
        void onSuccess();
    }

    public interface OnRegistrationFinishedListener {
        void onRegError(int errorCode);
        void onRegSuccess();
    }

    public interface OnResetPasswordListener {
        void resetPasswordError(int errorCode);
        void resetPasswordSuccess();
    }


}
