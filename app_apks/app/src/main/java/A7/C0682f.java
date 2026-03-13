package A7;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: renamed from: A7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0682f implements InterfaceC0677a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f199e = new Handler(Looper.getMainLooper());

    public C0682f(r rVar, N n10, I i10, t tVar) {
        this.f195a = rVar;
        this.f196b = n10;
        this.f197c = i10;
        this.f198d = tVar;
    }

    @Override // A7.InterfaceC0677a
    public final synchronized void a(InterfaceC0680d interfaceC0680d) {
        this.f196b.d(interfaceC0680d);
    }

    @Override // A7.InterfaceC0677a
    public final Set b() {
        return this.f197c.b();
    }

    @Override // A7.InterfaceC0677a
    public final synchronized void c(InterfaceC0680d interfaceC0680d) {
        this.f196b.b(interfaceC0680d);
    }
}
