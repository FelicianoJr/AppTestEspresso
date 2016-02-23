package br.com.byteste;

/**
 * Created by feliciano on 23/02/16.
 */
public interface AddLogoContract {
    interface View {
        void showLogoList();
    }

    interface UserActionsListener {
        void saveLogo();
    }
}
