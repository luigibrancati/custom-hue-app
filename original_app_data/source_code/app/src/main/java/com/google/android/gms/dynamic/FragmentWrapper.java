package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IFragmentWrapper;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f29108a;

    public FragmentWrapper(Fragment fragment) {
        this.f29108a = fragment;
    }

    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void F(boolean z10) {
        this.f29108a.setRetainInstance(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void H(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC6056k.l(view);
        this.f29108a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void I(boolean z10) {
        this.f29108a.setUserVisibleHint(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean M() {
        return this.f29108a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean O() {
        return this.f29108a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O1(Intent intent, int i10) {
        this.f29108a.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void T0(boolean z10) {
        this.f29108a.setMenuVisibility(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U5(Intent intent) {
        this.f29108a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle b() {
        return this.f29108a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.f29108a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper d() {
        return wrap(this.f29108a.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper e() {
        return ObjectWrapper.wrap(this.f29108a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String f() {
        return this.f29108a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper g() {
        return wrap(this.f29108a.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean h() {
        return this.f29108a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean i() {
        return this.f29108a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper j() {
        return ObjectWrapper.wrap(this.f29108a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int k() {
        return this.f29108a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f29108a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f29108a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f29108a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f29108a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean r() {
        return this.f29108a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r0(boolean z10) {
        this.f29108a.setHasOptionsMenu(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void y3(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC6056k.l(view);
        this.f29108a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.f29108a.getActivity());
    }
}
