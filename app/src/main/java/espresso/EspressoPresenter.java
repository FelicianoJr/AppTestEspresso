package espresso;

import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

import data.Espresso;
import repository.EspressoRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by feliciano on 26/02/16.
 */
public class EspressoPresenter implements EspressoContract.UserActionListener {

    private final EspressoRepository mRepository;
    private final EspressoContract.View mEspressoView;

    public EspressoPresenter(EspressoRepository repository, EspressoContract.View view) {
        mEspressoView = checkNotNull(view);
        mRepository = checkNotNull(repository);
        mEspressoView.setUserActionListener(this);
    }

    @Override
    public void save(String name) {

        Espresso espresso = new Espresso(name);
        if (null == espresso.getName() || espresso.getName().isEmpty()) {
            mEspressoView.showToastError();
        } else {
            mRepository.saveEspresso(espresso);
            mEspressoView.showToast();
        }
    }

    @Override
    public void openEspresso(@Nullable String id) {

    }

    @Override
    public void getEspressos() {
        mRepository.getEspressos(new EspressoRepository.LoadEspressoCallBack() {
            @Override
            public void onEspressoLoaded(List<Espresso> espressos) {
                Log.i("TAG", String.valueOf(espressos.size()));
            }
        });
    }
}
