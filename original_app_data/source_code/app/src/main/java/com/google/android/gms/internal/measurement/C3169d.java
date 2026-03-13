package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3169d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f29433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f29434b;

    public C3169d(C3187f c3187f, Iterator it, Iterator it2) {
        this.f29433a = it;
        this.f29434b = it2;
        Objects.requireNonNull(c3187f);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29433a.hasNext()) {
            return true;
        }
        return this.f29434b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f29433a;
        if (it.hasNext()) {
            return new C3312t(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f29434b;
        if (it2.hasNext()) {
            return new C3312t((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
