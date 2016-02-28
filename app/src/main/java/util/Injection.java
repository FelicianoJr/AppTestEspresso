package util;

import repository.EspressoRepository;
import repository.EspressoServiceApiImpl;

/**
 * Created by feliciano on 23/02/16.
 */
public class Injection {
    public static EspressoRepository providerEspressoRepository() {
        return Repositories.getInMemoryRepoInstance(new EspressoServiceApiImpl());
    }
}
