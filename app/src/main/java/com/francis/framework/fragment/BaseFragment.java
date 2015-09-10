package com.francis.framework.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.francis.framework.utils.T;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2015/9/6.
 */
public class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this,view);
        return view;
    }

    /** ͨ��Class��ת���� **/
    protected void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }

    /** ����Bundleͨ��Class��ת���� **/
    protected void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(getActivity(), cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /** ͨ��Action��ת���� **/
    protected void startActivity(String action) {
        startActivity(action, null);
    }

    /** ����Bundleͨ��Action��ת���� **/
    protected void startActivity(String action, Bundle bundle) {
        Intent intent = new Intent();
        intent.setAction(action);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /**
     * ��˾
     *
     * @param message
     */
    protected void showShort(String message) {
        T.showShort(getActivity(), message);
    }

    protected void showLong(String message) {
        T.showLong(getActivity(), message);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
