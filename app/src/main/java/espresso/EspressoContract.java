package espresso;

import android.support.annotation.Nullable;

/**
 * Created by feliciano on 26/02/16.
 */
public interface EspressoContract {

    interface View {
        void showToast();

        void showToastError();

        void setUserActionListener(UserActionListener listener);
    }

    interface UserActionListener {

        void save(String name);

        void openEspresso(@Nullable String id);

        void getEspressos();

    }
}
