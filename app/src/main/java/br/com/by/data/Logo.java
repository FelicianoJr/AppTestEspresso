package br.com.by.data;

import android.support.annotation.Nullable;

import java.util.UUID;

/**
 * Created by feliciano on 23/02/16.
 */
public final class Logo {

    private final String mId;
    @Nullable
    private final String mTitle;
    @Nullable
    private final String mDescription;


    public Logo(@Nullable String title, @Nullable String description) {
        this(title, description, null);
    }

    public Logo(@Nullable String title, @Nullable String description, @Nullable String imageUrl) {
        mId = UUID.randomUUID().toString();
        mTitle = title;
        mDescription = description;
    }

    public String getId() {
        return mId;
    }

    @Nullable
    public String getTitle() {
        return mTitle;
    }

    @Nullable
    public String getDescription() {
        return mDescription;
    }


}
