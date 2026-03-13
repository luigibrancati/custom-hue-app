package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31855a;

    public g() {
        this.f31855a = null;
    }

    public static g a() {
        return new g();
    }

    public static g b(Object obj) {
        return obj == null ? a() : e(obj);
    }

    public static g e(Object obj) {
        return new g(obj);
    }

    public Object c() {
        Object obj = this.f31855a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        return this.f31855a != null;
    }

    public g(Object obj) {
        if (obj != null) {
            this.f31855a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
