package d3;

import fc.C4029l;
import fc.InterfaceC4028k;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import n3.C5081a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4793c f32985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f32987c;

    public b(InterfaceC4793c driver, String fileName) {
        AbstractC4862t.e(driver, "driver");
        AbstractC4862t.e(fileName, "fileName");
        this.f32985a = driver;
        this.f32986b = fileName;
        this.f32987c = C4029l.b(new InterfaceC6082a() { // from class: d3.a
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return b.b(this.f32984a);
            }
        });
    }

    public static final c b(b bVar) {
        InterfaceC4792b interfaceC4792bA = bVar.f32985a.a(bVar.f32986b);
        AbstractC4862t.c(interfaceC4792bA, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
        return new c((C5081a) interfaceC4792bA);
    }

    @Override // d3.e
    public Object O0(boolean z10, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        return pVar.invoke(c(), interfaceC4988e);
    }

    public final c c() {
        return (c) this.f32987c.getValue();
    }

    @Override // d3.e, java.lang.AutoCloseable
    public void close() {
        c().f().close();
    }
}
