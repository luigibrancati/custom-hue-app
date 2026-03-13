package K;

import E.AbstractC0804o;
import K.C0977t;
import K.X;
import L.AbstractC1109l0;
import L.C1095e0;
import L.C1128v0;
import L.InterfaceC1093d0;
import L.InterfaceC1097f0;
import L.InterfaceC1130w0;
import L.a1;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import androidx.camera.core.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: K.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0982y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f6646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S.b f6647g = new S.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1128v0 f6648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1095e0 f6649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0977t f6650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f6651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0977t.c f6652e;

    public C0982y(C1128v0 c1128v0, Size size, CameraCharacteristics cameraCharacteristics, AbstractC0804o abstractC0804o, boolean z10, F f10) {
        M.x.b();
        this.f6648a = c1128v0;
        this.f6649b = C1095e0.a.i(c1128v0).h();
        C0977t c0977t = new C0977t();
        this.f6650c = c0977t;
        Executor executorI0 = c1128v0.i0(N.a.c());
        Objects.requireNonNull(executorI0);
        P p10 = new P(executorI0, cameraCharacteristics, null);
        this.f6651d = p10;
        ArrayList arrayList = new ArrayList();
        if (c1128v0.T() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            arrayList.add(Integer.valueOf(i()));
        }
        int inputFormat = c1128v0.getInputFormat();
        c1128v0.h0();
        C0977t.c cVarN = C0977t.c.n(size, inputFormat, arrayList, z10, null, f10);
        this.f6652e = cVarN;
        p10.p(c0977t.s(cVarN));
    }

    public void a() {
        M.x.b();
        this.f6650c.n();
        this.f6651d.n();
    }

    public final C0968j b(int i10, InterfaceC1093d0 interfaceC1093d0, h0 h0Var, W w10) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(interfaceC1093d0.hashCode());
        List<InterfaceC1097f0> listA = interfaceC1093d0.a();
        Objects.requireNonNull(listA);
        for (InterfaceC1097f0 interfaceC1097f0 : listA) {
            C1095e0.a aVar = new C1095e0.a();
            aVar.t(this.f6649b.k());
            aVar.e(this.f6649b.g());
            aVar.a(h0Var.p());
            aVar.f(this.f6652e.l());
            if (this.f6652e.e().size() > 1 && this.f6652e.j() != null) {
                aVar.f(this.f6652e.j());
            }
            boolean zL = l();
            if (zL) {
                AbstractC1109l0 abstractC1109l0G = this.f6652e.g();
                Objects.requireNonNull(abstractC1109l0G);
                aVar.f(abstractC1109l0G);
            }
            aVar.r(zL);
            if (T.b.e(this.f6652e.d()) || T.b.f(this.f6652e.d())) {
                if (f6647g.a()) {
                    aVar.d(C1095e0.f8038i, Integer.valueOf(h0Var.m()));
                }
                aVar.d(C1095e0.f8039j, Integer.valueOf(g(h0Var)));
            }
            aVar.e(interfaceC1097f0.a().g());
            aVar.g(strValueOf, Integer.valueOf(interfaceC1097f0.getId()));
            aVar.p(i10);
            aVar.c(this.f6652e.a());
            if (this.f6652e.e().size() > 1 && this.f6652e.i() != null) {
                aVar.c(this.f6652e.i());
            }
            arrayList.add(aVar.h());
        }
        return new C0968j(arrayList, w10);
    }

    public final InterfaceC1093d0 c() {
        InterfaceC1093d0 interfaceC1093d0D0 = this.f6648a.d0(E.H.b());
        Objects.requireNonNull(interfaceC1093d0D0);
        return interfaceC1093d0D0;
    }

    public final Q d(int i10, InterfaceC1093d0 interfaceC1093d0, h0 h0Var, W w10, O7.e eVar) {
        return new Q(interfaceC1093d0, h0Var, w10, eVar, i10);
    }

    public X0.d e(h0 h0Var, W w10, O7.e eVar) {
        M.x.b();
        InterfaceC1093d0 interfaceC1093d0C = c();
        int i10 = f6646f;
        f6646f = i10 + 1;
        return new X0.d(b(i10, interfaceC1093d0C, h0Var, w10), d(i10, interfaceC1093d0C, h0Var, w10, eVar));
    }

    public a1.b f(Size size) {
        a1.b bVarQ = a1.b.q(this.f6648a, size);
        bVarQ.h(this.f6652e.l());
        if (this.f6652e.e().size() > 1 && this.f6652e.j() != null) {
            bVarQ.h(this.f6652e.j());
        }
        if (this.f6652e.g() != null) {
            bVarQ.v(this.f6652e.g());
        }
        return bVarQ;
    }

    public int g(h0 h0Var) {
        h0Var.k();
        M.y.g(h0Var.h(), this.f6652e.k());
        return h0Var.j();
    }

    public int h() {
        M.x.b();
        return this.f6650c.i();
    }

    public final int i() {
        Integer num = (Integer) this.f6648a.c(C1128v0.f8202T, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f6648a.c(InterfaceC1130w0.f8213j, null);
        if (num2 == null || num2.intValue() != 4101) {
            return (num2 == null || num2.intValue() != 32) ? 256 : 32;
        }
        return 4101;
    }

    public void j(X.a aVar) {
        M.x.b();
        this.f6652e.b().accept(aVar);
    }

    public void k(b.a aVar) {
        M.x.b();
        this.f6650c.r(aVar);
    }

    public final boolean l() {
        return this.f6652e.g() != null;
    }

    public void m(Q q10) {
        M.x.b();
        this.f6652e.h().accept(q10);
    }
}
