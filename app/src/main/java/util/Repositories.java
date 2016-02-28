package util;

import android.support.annotation.NonNull;

import repository.EspressoRepository;
import repository.EspressoServiceApi;
import repository.InMemoryEspressoRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by feliciano on 23/02/16.
 */
public class Repositories {
    private static EspressoRepository repository = null;

    public synchronized static EspressoRepository getInMemoryRepoInstance(@NonNull EspressoServiceApi espressoServiceApi) {
        checkNotNull(espressoServiceApi);
        if (null == repository) {
            repository = new InMemoryEspressoRepository(espressoServiceApi);
        }
        return repository;
    }
}
