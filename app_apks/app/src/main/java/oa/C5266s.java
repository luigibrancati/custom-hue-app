package oa;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import oa.InterfaceC5251c;
import sa.InterfaceC5813a;

/* JADX INFO: renamed from: oa.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5266s implements InterfaceC5262n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5813a f41482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5251c.a f41483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Eb.q f41484c;

    public C5266s(InterfaceC5813a interfaceC5813a, InterfaceC5251c.a aVar, Eb.q qVar) {
        this.f41482a = interfaceC5813a;
        this.f41483b = aVar;
        this.f41484c = qVar;
    }

    public static /* synthetic */ void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC5261m) it.next()).b();
        }
    }

    public static /* synthetic */ Eb.n c(C5266s c5266s, ka.z zVar) {
        InterfaceC5251c interfaceC5251cBuild = c5266s.f41483b.b(zVar.f39524a).c(zVar.f39525b).a(zVar.f39526c).build();
        final Set setA = interfaceC5251cBuild.a();
        return g(interfaceC5251cBuild).d0(f(interfaceC5251cBuild)).s(c5266s.e(interfaceC5251cBuild)).A(new Jb.d() { // from class: oa.p
            @Override // Jb.d
            public final void accept(Object obj) {
                C5266s.d(setA, (Hb.c) obj);
            }
        }).v(new Jb.a() { // from class: oa.q
            @Override // Jb.a
            public final void run() {
                C5266s.b(setA);
            }
        }).w0(c5266s.f41484c).K0(c5266s.f41484c);
    }

    public static /* synthetic */ void d(Set set, Hb.c cVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC5261m) it.next()).c();
        }
    }

    public static Eb.k f(InterfaceC5251c interfaceC5251c) {
        return interfaceC5251c.c().l();
    }

    public static Eb.k g(final InterfaceC5251c interfaceC5251c) {
        Objects.requireNonNull(interfaceC5251c);
        return Eb.k.T(new Callable() { // from class: oa.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return interfaceC5251c.d();
            }
        });
    }

    @Override // oa.InterfaceC5262n
    public Eb.k a(final ka.z zVar) {
        return Eb.k.o(new Callable() { // from class: oa.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5266s.c(this.f41476a, zVar);
            }
        });
    }

    public Eb.k e(InterfaceC5251c interfaceC5251c) {
        return this.f41482a.a(interfaceC5251c.b());
    }
}
