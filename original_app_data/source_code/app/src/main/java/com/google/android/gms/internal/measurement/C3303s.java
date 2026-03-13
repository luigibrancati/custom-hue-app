package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3303s implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3312t f29598b;

    public C3303s(C3312t c3312t) {
        Objects.requireNonNull(c3312t);
        this.f29598b = c3312t;
        this.f29597a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29597a < this.f29598b.f().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C3312t c3312t = this.f29598b;
        String strF = c3312t.f();
        int i10 = this.f29597a;
        if (i10 >= strF.length()) {
            throw new NoSuchElementException();
        }
        this.f29597a = i10 + 1;
        return new C3312t(String.valueOf(c3312t.f().charAt(i10)));
    }
}
