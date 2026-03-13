package x;

import y.C6378n;

/* JADX INFO: renamed from: x.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6245n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47083a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6378n f47084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47085c;

    public C6245n1(C6378n c6378n, int i10) {
        this.f47084b = c6378n;
        this.f47085c = i10;
    }

    public int a() {
        int i10;
        synchronized (this.f47083a) {
            i10 = this.f47085c;
        }
        return i10;
    }

    public void b(int i10) {
        synchronized (this.f47083a) {
            this.f47085c = i10;
        }
    }
}
