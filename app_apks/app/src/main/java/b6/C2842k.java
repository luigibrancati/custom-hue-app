package b6;

import d6.AbstractC3833d;
import d6.InterfaceC3831b;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: b6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2842k implements InterfaceC3831b {

    /* JADX INFO: renamed from: b6.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2842k f25361a = new C2842k();
    }

    public static C2842k a() {
        return a.f25361a;
    }

    public static Executor b() {
        return (Executor) AbstractC3833d.d(AbstractC2841j.a());
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
