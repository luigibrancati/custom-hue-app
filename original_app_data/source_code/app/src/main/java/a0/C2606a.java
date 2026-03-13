package a0;

import E.C0813t;
import a0.h;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2606a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0813t f20461b;

    public C2606a(int i10, C0813t c0813t) {
        this.f20460a = i10;
        if (c0813t == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f20461b = c0813t;
    }

    @Override // a0.h.a
    public C0813t b() {
        return this.f20461b;
    }

    @Override // a0.h.a
    public int c() {
        return this.f20460a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h.a) {
            h.a aVar = (h.a) obj;
            if (this.f20460a == aVar.c() && this.f20461b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f20461b.hashCode() ^ ((this.f20460a ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Key{lifecycleOwnerHash=" + this.f20460a + ", cameraIdentifier=" + this.f20461b + "}";
    }
}
