package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3624v0 extends AbstractC3636x0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3624v0 f30257a = new C3624v0();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
