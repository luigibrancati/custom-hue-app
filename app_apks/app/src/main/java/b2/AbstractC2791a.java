package b2;

import G1.AbstractC0853a;

/* JADX INFO: renamed from: b2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2791a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f24964k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f24965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C2793c f24966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f24967n;

    public AbstractC2791a(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(fVar, jVar, oVar, i10, obj, j10, j11, j14);
        this.f24964k = j12;
        this.f24965l = j13;
    }

    public final int h(int i10) {
        return ((int[]) AbstractC0853a.i(this.f24967n))[i10];
    }

    public final C2793c i() {
        return (C2793c) AbstractC0853a.i(this.f24966m);
    }

    public void j(C2793c c2793c) {
        this.f24966m = c2793c;
        this.f24967n = c2793c.a();
    }
}
