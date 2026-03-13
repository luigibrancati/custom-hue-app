package k2;

import G1.C;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC4790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39228d;

    public c(int i10, int i11, int i12, int i13) {
        this.f39225a = i10;
        this.f39226b = i11;
        this.f39227c = i12;
        this.f39228d = i13;
    }

    public static c b(C c10) {
        int iY = c10.y();
        c10.b0(8);
        int iY2 = c10.y();
        int iY3 = c10.y();
        c10.b0(4);
        int iY4 = c10.y();
        c10.b0(12);
        return new c(iY, iY2, iY3, iY4);
    }

    public boolean a() {
        return (this.f39226b & 16) == 16;
    }

    @Override // k2.InterfaceC4790a
    public int getType() {
        return 1751742049;
    }
}
