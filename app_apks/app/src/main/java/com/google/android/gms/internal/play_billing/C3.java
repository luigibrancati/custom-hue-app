package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30007a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f30009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F3 f30010d;

    public /* synthetic */ C3(F3 f32, E3 e32) {
        this.f30010d = f32;
    }

    public final Iterator a() {
        if (this.f30009c == null) {
            this.f30009c = this.f30010d.f30024c.entrySet().iterator();
        }
        return this.f30009c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f30007a + 1;
        F3 f32 = this.f30010d;
        if (i10 >= f32.f30023b) {
            return !f32.f30024c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f30008b = true;
        int i10 = this.f30007a + 1;
        this.f30007a = i10;
        F3 f32 = this.f30010d;
        return i10 < f32.f30023b ? (B3) f32.f30022a[i10] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f30008b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f30008b = false;
        this.f30010d.o();
        int i10 = this.f30007a;
        F3 f32 = this.f30010d;
        if (i10 >= f32.f30023b) {
            a().remove();
        } else {
            this.f30007a = i10 - 1;
            f32.m(i10);
        }
    }
}
