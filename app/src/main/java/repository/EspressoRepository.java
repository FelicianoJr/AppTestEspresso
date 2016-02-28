package repository;

import android.support.annotation.NonNull;

import java.util.List;

import data.Espresso;

/**
 * Created by feliciano on 27/02/16.
 */
public interface EspressoRepository {

    interface LoadEspressoCallBack {
        void onEspressoLoaded(List<Espresso> espressos);
    }

    interface GetEspressoCallBack {
        void onEspressoLoaded(Espresso espresso);
    }

    void getEspressos(@NonNull LoadEspressoCallBack callback);

    void getEspresso(@NonNull String noteId, @NonNull GetEspressoCallBack callback);

    void saveEspresso(@NonNull Espresso espresso);

    void refreshData();


}
