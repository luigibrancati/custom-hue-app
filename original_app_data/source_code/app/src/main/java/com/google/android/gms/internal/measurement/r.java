package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3312t f29593b;

    public r(C3312t c3312t) {
        Objects.requireNonNull(c3312t);
        this.f29593b = c3312t;
        this.f29592a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29592a < this.f29593b.f().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strF = this.f29593b.f();
        int i10 = this.f29592a;
        if (i10 >= strF.length()) {
            throw new NoSuchElementException();
        }
        this.f29592a = i10 + 1;
        return new C3312t(String.valueOf(i10));
    }
}
