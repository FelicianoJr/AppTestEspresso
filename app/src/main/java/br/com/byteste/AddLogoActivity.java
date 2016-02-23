package br.com.byteste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by feliciano on 23/02/16.
 */
public class AddLogoActivity extends AppCompatActivity implements AddLogoContract.View{

    private AddLogoContract.UserActionsListener mActionsListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLogoList() {

    }
}
