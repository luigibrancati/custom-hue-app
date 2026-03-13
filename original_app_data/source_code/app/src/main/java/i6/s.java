package i6;

import android.content.Context;
import d6.InterfaceC3831b;
import ec.InterfaceC3978a;
import j6.InterfaceC4724c;
import j6.InterfaceC4725d;
import java.util.concurrent.Executor;
import k6.InterfaceC4806b;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements InterfaceC3831b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3978a f37291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3978a f37292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3978a f37293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3978a f37294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3978a f37295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3978a f37296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3978a f37297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3978a f37298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3978a f37299i;

    public s(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7, InterfaceC3978a interfaceC3978a8, InterfaceC3978a interfaceC3978a9) {
        this.f37291a = interfaceC3978a;
        this.f37292b = interfaceC3978a2;
        this.f37293c = interfaceC3978a3;
        this.f37294d = interfaceC3978a4;
        this.f37295e = interfaceC3978a5;
        this.f37296f = interfaceC3978a6;
        this.f37297g = interfaceC3978a7;
        this.f37298h = interfaceC3978a8;
        this.f37299i = interfaceC3978a9;
    }

    public static s a(InterfaceC3978a interfaceC3978a, InterfaceC3978a interfaceC3978a2, InterfaceC3978a interfaceC3978a3, InterfaceC3978a interfaceC3978a4, InterfaceC3978a interfaceC3978a5, InterfaceC3978a interfaceC3978a6, InterfaceC3978a interfaceC3978a7, InterfaceC3978a interfaceC3978a8, InterfaceC3978a interfaceC3978a9) {
        return new s(interfaceC3978a, interfaceC3978a2, interfaceC3978a3, interfaceC3978a4, interfaceC3978a5, interfaceC3978a6, interfaceC3978a7, interfaceC3978a8, interfaceC3978a9);
    }

    public static r c(Context context, c6.e eVar, InterfaceC4725d interfaceC4725d, x xVar, Executor executor, InterfaceC4806b interfaceC4806b, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, InterfaceC4724c interfaceC4724c) {
        return new r(context, eVar, interfaceC4725d, xVar, executor, interfaceC4806b, interfaceC4957a, interfaceC4957a2, interfaceC4724c);
    }

    @Override // ec.InterfaceC3978a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f37291a.get(), (c6.e) this.f37292b.get(), (InterfaceC4725d) this.f37293c.get(), (x) this.f37294d.get(), (Executor) this.f37295e.get(), (InterfaceC4806b) this.f37296f.get(), (InterfaceC4957a) this.f37297g.get(), (InterfaceC4957a) this.f37298h.get(), (InterfaceC4724c) this.f37299i.get());
    }
}
