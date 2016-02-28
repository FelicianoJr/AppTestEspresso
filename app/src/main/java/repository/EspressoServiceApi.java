package repository;

import java.util.List;

import data.Espresso;

/**
 * Created by feliciano on 27/02/16.
 */
public interface EspressoServiceApi {

    interface EspressoServiceCallBack<T> {
        void onLoaded(T data);
    }

    void getAllEspressos(EspressoServiceCallBack<List<Espresso>> callBack);

    void getEspresso(String id, EspressoServiceCallBack<Espresso> callBack);

    void saveEspresso(Espresso espresso);
}
