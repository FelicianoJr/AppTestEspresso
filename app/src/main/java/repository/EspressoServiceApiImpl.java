package repository;

import android.os.Handler;
import android.support.v4.util.ArrayMap;

import java.util.ArrayList;
import java.util.List;

import data.Espresso;

/**
 * Created by feliciano on 27/02/16.
 */
public class EspressoServiceApiImpl implements EspressoServiceApi {
    private static final int SERVICE_LATENCY_IN_MILLIS = 2000;
    private final static ArrayMap DATA;

    static {
        DATA = new ArrayMap(2);
        DATA.put("x", new Espresso("2"));
        DATA.put("y", new Espresso("1"));
    }

    @Override
    public void getAllEspressos(final EspressoServiceCallBack<List<Espresso>> callBack) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<Espresso> espressos = new ArrayList<>(DATA.values());
                callBack.onLoaded(espressos);
            }
        },SERVICE_LATENCY_IN_MILLIS);
    }

    @Override
    public void getEspresso(String id, EspressoServiceCallBack<Espresso> callBack) {

    }

    @Override
    public void saveEspresso(Espresso espresso) {

    }
}
