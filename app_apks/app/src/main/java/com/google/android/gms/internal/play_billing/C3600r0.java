package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3600r0 implements InterfaceC3642y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f30231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f30233c;

    public C3600r0(Iterator it) {
        it.getClass();
        this.f30231a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30232b || this.f30231a.hasNext();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3642y0, java.util.Iterator
    public final Object next() {
        if (!this.f30232b) {
            return this.f30231a.next();
        }
        Object obj = this.f30233c;
        this.f30232b = false;
        this.f30233c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f30232b) {
            throw new IllegalStateException("Can't remove after you've peeked at next");
        }
        this.f30231a.remove();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3642y0
    public final Object zza() {
        if (!this.f30232b) {
            this.f30233c = this.f30231a.next();
            this.f30232b = true;
        }
        return this.f30233c;
    }
}
