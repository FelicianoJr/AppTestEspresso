package br.com.by.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by feliciano on 23/02/16.
 */
public interface LogoRepository {
    interface LoadLogoCallback {

        void onNotesLoaded(List<Logo> logos);
    }

    interface GetLogoCallback {

        void onNoteLoaded(Logo logo);
    }

    void getNotes(@NonNull LoadLogoCallback callback);

    void getNote(@NonNull String noteId, @NonNull GetLogoCallback callback);

    void saveNote(@NonNull Logo logo);

    void refreshData();
}
