package repository;

import android.support.annotation.NonNull;

import java.util.List;

import data.Espresso;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by feliciano on 27/02/16.
 */
public class InMemoryEspressoRepository implements EspressoRepository {

    private final EspressoServiceApi mEspressoServiceApi;


    public InMemoryEspressoRepository(@NonNull EspressoServiceApi espressoServiceApi) {
        mEspressoServiceApi = checkNotNull(espressoServiceApi);
    }

    @Override
    public void getEspressos(@NonNull final LoadEspressoCallBack callback) {
        mEspressoServiceApi.getAllEspressos(new EspressoServiceApi.EspressoServiceCallBack<List<Espresso>>() {
            @Override
            public void onLoaded(List<Espresso> data) {
                callback.onEspressoLoaded(data);
            }
        });
    }

    @Override
    public void getEspresso(@NonNull String noteId, @NonNull final GetEspressoCallBack callback) {
        mEspressoServiceApi.getEspresso(noteId, new EspressoServiceApi.EspressoServiceCallBack<Espresso>() {
            @Override
            public void onLoaded(Espresso data) {
                callback.onEspressoLoaded(data);
            }
        });
    }

    @Override
    public void saveEspresso(@NonNull Espresso espresso) {
        mEspressoServiceApi.saveEspresso(espresso);
    }

    @Override
    public void refreshData() {

    }
}
