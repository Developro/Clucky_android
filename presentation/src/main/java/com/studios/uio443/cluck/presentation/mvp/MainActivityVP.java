package com.studios.uio443.cluck.presentation.mvp;

import android.app.Fragment;

import com.studios.uio443.cluck.presentation.view.fragment.BaseFragment;

/**
 * Created by zundarik on 29.07.2018
 */

public interface MainActivityVP {
    interface View {
        void setFragment(BaseFragment fragment);

        void setFragment(Fragment fragment);

        void startActivity(Class activityClass);
    }

    interface Presenter {
        void selectDrawerNavItem(String nameItem);
    }
}
