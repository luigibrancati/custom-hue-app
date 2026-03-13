package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f30110a = "";

    public X(Comparable comparable) {
    }

    public abstract int a(X x10);

    public abstract void b(StringBuilder sb2);

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            try {
                if (a((X) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    public abstract void j(StringBuilder sb2);
}
