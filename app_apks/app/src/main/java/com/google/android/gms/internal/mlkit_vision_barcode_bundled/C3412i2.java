package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3412i2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29864a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f29866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3432m2 f29867d;

    public /* synthetic */ C3412i2(AbstractC3432m2 abstractC3432m2, AbstractC3407h2 abstractC3407h2) {
        this.f29867d = abstractC3432m2;
    }

    public final Iterator a() {
        if (this.f29866c == null) {
            this.f29866c = this.f29867d.f29873c.entrySet().iterator();
        }
        return this.f29866c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f29864a + 1;
        AbstractC3432m2 abstractC3432m2 = this.f29867d;
        if (i10 >= abstractC3432m2.f29872b) {
            return !abstractC3432m2.f29873c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f29865b = true;
        int i10 = this.f29864a + 1;
        this.f29864a = i10;
        AbstractC3432m2 abstractC3432m2 = this.f29867d;
        return i10 < abstractC3432m2.f29872b ? (C3402g2) abstractC3432m2.f29871a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f29865b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f29865b = false;
        this.f29867d.o();
        int i10 = this.f29864a;
        AbstractC3432m2 abstractC3432m2 = this.f29867d;
        if (i10 >= abstractC3432m2.f29872b) {
            a().remove();
        } else {
            this.f29864a = i10 - 1;
            abstractC3432m2.m(i10);
        }
    }
}
