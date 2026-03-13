package c2;

import F2.j;
import F2.k;
import F2.s;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2931b extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f25554p;

    public C2931b(String str, s sVar) {
        super(str);
        this.f25554p = sVar;
    }

    @Override // F2.j
    public k B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f25554p.reset();
        }
        return this.f25554p.a(bArr, 0, i10);
    }
}
