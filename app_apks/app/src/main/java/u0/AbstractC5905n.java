package u0;

import io.flutter.embedding.android.KeyboardMap;
import z0.AbstractC6493g;
import z0.AbstractC6495i;
import z0.C6487a;
import z0.InterfaceC6489c;

/* JADX INFO: renamed from: u0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5905n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f45033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45034d = o.f45038b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45035e = AbstractC6493g.f48683a.b();

    /* JADX INFO: renamed from: u0.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a implements InterfaceC6489c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45036a;

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(AbstractC5905n abstractC5905n) {
            if (abstractC5905n instanceof v0.l) {
                ((v0.l) abstractC5905n).h(this.f45036a);
            }
        }

        public final void c(AbstractC5905n abstractC5905n, long j10, float f10) {
            b(abstractC5905n);
            abstractC5905n.A(AbstractC6493g.h(j10, abstractC5905n.f45035e), f10, null);
        }

        public final void d(AbstractC5905n abstractC5905n, long j10, float f10, vc.l lVar) {
            b(abstractC5905n);
            abstractC5905n.A(AbstractC6493g.h(j10, abstractC5905n.f45035e), f10, lVar);
        }
    }

    public AbstractC5905n() {
        long j10 = 0;
        this.f45033c = AbstractC6495i.b((j10 & KeyboardMap.kValueMask) | (j10 << 32));
    }

    public abstract void A(long j10, float f10, vc.l lVar);

    public final void B(long j10) {
        if (AbstractC6495i.c(this.f45033c, j10)) {
            return;
        }
        this.f45033c = j10;
        z();
    }

    public final void C(long j10) {
        if (C6487a.d(this.f45034d, j10)) {
            return;
        }
        this.f45034d = j10;
        z();
    }

    public final long u() {
        return this.f45035e;
    }

    public final int v() {
        return this.f45032b;
    }

    public final long w() {
        return this.f45033c;
    }

    public final long x() {
        return this.f45034d;
    }

    public final int y() {
        return this.f45031a;
    }

    public final void z() {
        this.f45031a = Bc.k.k((int) (this.f45033c >> 32), C6487a.h(this.f45034d), C6487a.f(this.f45034d));
        int iK = Bc.k.k((int) (this.f45033c & KeyboardMap.kValueMask), C6487a.g(this.f45034d), C6487a.e(this.f45034d));
        this.f45032b = iK;
        int i10 = this.f45031a;
        long j10 = this.f45033c;
        this.f45035e = AbstractC6493g.c((((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (KeyboardMap.kValueMask & ((long) ((iK - ((int) (j10 & KeyboardMap.kValueMask))) / 2))));
    }
}
