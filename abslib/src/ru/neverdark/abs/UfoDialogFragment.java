package ru.neverdark.abs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.actionbarsherlock.app.SherlockDialogFragment;

interface PrivateInterface {
    
}



public abstract class UfoDialogFragment extends SherlockDialogFragment implements CommonApi {
    protected AlertDialog.Builder mAlertDialog;
    protected View mView;
    protected PrivateInterface mCallback;
    protected Context mContext;
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        bindObjects();
        createDialog();
        setListeners();

        return mAlertDialog.create();
    }
    
    protected void createDialog() {
        mAlertDialog = new AlertDialog.Builder(mContext);
        mAlertDialog.setView(mView);
    }
    
    protected void setCallback(PrivateInterface callback) {
        mCallback = callback;
    }
    
}
