package dev.rodni.ru.githubsearch.base;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import dev.rodni.ru.githubsearch.R;

public abstract class BaseActivity extends AppCompatActivity {

    //private ProgressBar mProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        //ButterKnife.bind(this);
        onViewReady(savedInstanceState, getIntent());
    }

    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        //To be used by child activities
    }

    @Override
    protected void onDestroy() {
        //ButterKnife.bind(this);
        super.onDestroy();
    }

    protected void hideKeyboard() {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (getCurrentFocus() != null)
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (Exception e) {
            Log.e("MultiBackStack", "Failed to add fragment to back stack", e);
        }
    }


    public void noInternetConnectionAvailable() {
        //showToast(getString(R.string.noNetworkFound));
    }


    protected void showBackArrow() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowHomeEnabled(true);
        }
    }

    //public void showProgressBar(String title, @NonNull String message) {
    //    if (mProgressBar == null) {
    //        mProgressBar = new mProgressBar(this);
    //        if (title != null)
    //            mProgressDialog.setTitle(title);
    //        mProgressDialog.setIcon(R.mipmap.ic_launcher);
    //        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    //        mProgressDialog.setCancelable(false);
    //    }
    //    if (!mProgressDialog.isShowing()) {
    //        mProgressDialog.setMessage(message);
    //        mProgressDialog.show();
    //    }
    //}
    //
    //
    //public void hideBar() {
    //    if (mProgressBar != null && mProgressBar.isShowing()) {
    //        mProgressBar.diss;
    //    }
    //}

    protected void showAlertDialog(String msg) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle(null);
        dialogBuilder.setIcon(R.mipmap.ic_launcher);
        dialogBuilder.setMessage(msg);
        dialogBuilder.setPositiveButton(getString(R.string.ok_string), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialogBuilder.setCancelable(false);
        dialogBuilder.show();
    }

    protected void showToast(String mToastMsg) {
        Toast.makeText(this, mToastMsg, Toast.LENGTH_LONG).show();
    }

    protected abstract int getContentView();

    protected abstract void setUpAuthFragment();
}
