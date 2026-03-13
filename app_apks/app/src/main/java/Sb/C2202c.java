package Sb;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Sb.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2202c extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb.a f15654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.d f15656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f15657d = new AtomicInteger();

    public C2202c(Zb.a aVar, int i10, Jb.d dVar) {
        this.f15654a = aVar;
        this.f15655b = i10;
        this.f15656c = dVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15654a.f(pVar);
        if (this.f15657d.incrementAndGet() == this.f15655b) {
            this.f15654a.Q0(this.f15656c);
        }
    }
}
