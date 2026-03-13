package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T5 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f29345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V5 f29346d;

    public /* synthetic */ T5(V5 v52, byte[] bArr) {
        Objects.requireNonNull(v52);
        this.f29346d = v52;
        this.f29343a = -1;
    }

    public final Iterator a() {
        if (this.f29345c == null) {
            this.f29345c = this.f29346d.k().entrySet().iterator();
        }
        return this.f29345c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f29343a + 1;
        V5 v52 = this.f29346d;
        if (i10 >= v52.j()) {
            return !v52.k().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f29344b = true;
        int i10 = this.f29343a + 1;
        this.f29343a = i10;
        V5 v52 = this.f29346d;
        return i10 < v52.j() ? (S5) v52.i()[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f29344b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f29344b = false;
        V5 v52 = this.f29346d;
        v52.h();
        int i10 = this.f29343a;
        if (i10 >= v52.j()) {
            a().remove();
        } else {
            this.f29343a = i10 - 1;
            v52.g(i10);
        }
    }
}
