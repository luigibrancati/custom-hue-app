package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC2736q;
import com.google.android.gms.dynamic.IFragmentWrapper;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentCallbacksC2736q f29110a;

    public SupportFragmentWrapper(ComponentCallbacksC2736q componentCallbacksC2736q) {
        this.f29110a = componentCallbacksC2736q;
    }

    public static SupportFragmentWrapper wrap(ComponentCallbacksC2736q componentCallbacksC2736q) {
        if (componentCallbacksC2736q != null) {
            return new SupportFragmentWrapper(componentCallbacksC2736q);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void F(boolean z10) {
        this.f29110a.setRetainInstance(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void H(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC6056k.l(view);
        this.f29110a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void I(boolean z10) {
        this.f29110a.setUserVisibleHint(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean M() {
        return this.f29110a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean O() {
        return this.f29110a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void O1(Intent intent, int i10) {
        this.f29110a.startActivityForResult(intent, i10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void T0(boolean z10) {
        this.f29110a.setMenuVisibility(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void U5(Intent intent) {
        this.f29110a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle b() {
        return this.f29110a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int c() {
        return this.f29110a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper d() {
        return wrap(this.f29110a.getParentFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper e() {
        return ObjectWrapper.wrap(this.f29110a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String f() {
        return this.f29110a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper g() {
        return wrap(this.f29110a.getTargetFragment());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean h() {
        return this.f29110a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean i() {
        return this.f29110a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper j() {
        return ObjectWrapper.wrap(this.f29110a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int k() {
        return this.f29110a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean m() {
        return this.f29110a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean n() {
        return this.f29110a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean p() {
        return this.f29110a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean q() {
        return this.f29110a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean r() {
        return this.f29110a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r0(boolean z10) {
        this.f29110a.setHasOptionsMenu(z10);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void y3(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        AbstractC6056k.l(view);
        this.f29110a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.f29110a.getActivity());
    }
}
