package b7;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: b7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2883q implements InterfaceC2882p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25419a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2864M f25421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f25425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25426h;

    public C2883q(int i10, C2864M c2864m) {
        this.f25420b = i10;
        this.f25421c = c2864m;
    }

    private final void b() {
        int i10 = this.f25422d + this.f25423e + this.f25424f;
        int i11 = this.f25420b;
        if (i10 == i11) {
            if (this.f25425g == null) {
                if (this.f25426h) {
                    this.f25421c.x();
                    return;
                } else {
                    this.f25421c.t(null);
                    return;
                }
            }
            C2864M c2864m = this.f25421c;
            int i12 = this.f25423e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 8 + String.valueOf(i11).length() + 24);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i11);
            sb2.append(" underlying tasks failed");
            c2864m.v(new ExecutionException(sb2.toString(), this.f25425g));
        }
    }

    @Override // b7.InterfaceC2871e
    public final void a() {
        synchronized (this.f25419a) {
            this.f25424f++;
            this.f25426h = true;
            b();
        }
    }

    @Override // b7.InterfaceC2873g
    public final void c(Exception exc) {
        synchronized (this.f25419a) {
            this.f25423e++;
            this.f25425g = exc;
            b();
        }
    }

    @Override // b7.InterfaceC2874h
    public final void onSuccess(Object obj) {
        synchronized (this.f25419a) {
            this.f25422d++;
            b();
        }
    }
}
