package com.braze.managers;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f27848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27849c;

    public d(String placementId, WeakReference view, boolean z10) {
        AbstractC4862t.e(placementId, "placementId");
        AbstractC4862t.e(view, "view");
        this.f27847a = placementId;
        this.f27848b = view;
        this.f27849c = z10;
    }

    public final String a() {
        return this.f27847a;
    }
}
