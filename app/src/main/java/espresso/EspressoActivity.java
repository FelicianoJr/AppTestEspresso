package espresso;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import util.Injection;

/**
 * Created by feliciano on 24/02/16.
 */
public class EspressoActivity extends AppCompatActivity implements EspressoContract.View {


    private EditText editText;
    private Button button;
    private EspressoContract.UserActionListener userActionListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        userActionListener = new EspressoPresenter(Injection.providerEspressoRepository(),this);

        editText = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userActionListener.save(editText.getText().toString());
                userActionListener.getEspressos();
            }
        });
    }

    @Override
    public void showToast() {
        Toast.makeText(EspressoActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToastError() {
        Toast.makeText(EspressoActivity.this, "Error", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setUserActionListener(EspressoContract.UserActionListener listener) {
        userActionListener = listener;
    }
}
