package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j<S> extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.material.datepicker.a f30731c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends n {
        public a() {
        }
    }

    public static j n(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        jVar.setArguments(bundle);
        return jVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f30730b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.a.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f30731c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f30730b));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC2736q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f30730b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f30731c);
    }
}
