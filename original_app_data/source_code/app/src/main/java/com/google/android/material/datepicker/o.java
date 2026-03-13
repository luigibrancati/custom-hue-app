package com.google.android.material.datepicker;

import androidx.fragment.app.ComponentCallbacksC2736q;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends ComponentCallbacksC2736q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f30752a = new LinkedHashSet();

    public boolean l(n nVar) {
        return this.f30752a.add(nVar);
    }

    public void m() {
        this.f30752a.clear();
    }
}
