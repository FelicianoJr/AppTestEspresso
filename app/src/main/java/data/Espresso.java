package data;

import android.support.annotation.Nullable;

/**
 * Created by feliciano on 27/02/16.
 */
public final class Espresso {

    @Nullable
    private final String name;

    public Espresso(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getName() {
        return name;
    }
}
