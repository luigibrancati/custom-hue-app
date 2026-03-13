package v0;

import androidx.compose.ui.node.NodeCoordinator;
import fc.C4015H;
import gc.Q;
import io.flutter.embedding.android.KeyboardMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import n0.AbstractC5066d;
import u0.AbstractC5892a;
import u0.AbstractC5893b;
import u0.C5894c;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6026a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC6027b f45705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC6027b f45712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f45713i;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0623a extends kotlin.jvm.internal.v implements vc.l {
        public C0623a() {
            super(1);
        }

        public final void a(InterfaceC6027b interfaceC6027b) {
            if (interfaceC6027b.n() == Integer.MAX_VALUE) {
                return;
            }
            if (interfaceC6027b.a().g()) {
                interfaceC6027b.i();
            }
            Map map = interfaceC6027b.a().f45713i;
            AbstractC6026a abstractC6026a = AbstractC6026a.this;
            for (Map.Entry entry : map.entrySet()) {
                abstractC6026a.c((AbstractC5892a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC6027b.m());
            }
            NodeCoordinator nodeCoordinatorD0 = interfaceC6027b.m().D0();
            AbstractC4862t.b(nodeCoordinatorD0);
            while (!AbstractC4862t.a(nodeCoordinatorD0, AbstractC6026a.this.f().m())) {
                Set<AbstractC5892a> setKeySet = AbstractC6026a.this.e(nodeCoordinatorD0).keySet();
                AbstractC6026a abstractC6026a2 = AbstractC6026a.this;
                for (AbstractC5892a abstractC5892a : setKeySet) {
                    abstractC6026a2.c(abstractC5892a, abstractC6026a2.i(nodeCoordinatorD0, abstractC5892a), nodeCoordinatorD0);
                }
                nodeCoordinatorD0 = nodeCoordinatorD0.D0();
                AbstractC4862t.b(nodeCoordinatorD0);
            }
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6027b) obj);
            return C4015H.f34254a;
        }
    }

    public /* synthetic */ AbstractC6026a(InterfaceC6027b interfaceC6027b, AbstractC4854k abstractC4854k) {
        this(interfaceC6027b);
    }

    public final void c(AbstractC5892a abstractC5892a, int i10, NodeCoordinator nodeCoordinator) {
        float f10 = i10;
        long jB = AbstractC5066d.b((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & KeyboardMap.kValueMask));
        while (true) {
            jB = d(nodeCoordinator, jB);
            nodeCoordinator = nodeCoordinator.D0();
            AbstractC4862t.b(nodeCoordinator);
            if (AbstractC4862t.a(nodeCoordinator, this.f45705a.m())) {
                break;
            } else if (e(nodeCoordinator).containsKey(abstractC5892a)) {
                float fI = i(nodeCoordinator, abstractC5892a);
                jB = AbstractC5066d.b((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI)) & KeyboardMap.kValueMask));
            }
        }
        int iRound = Math.round(abstractC5892a instanceof C5894c ? Float.intBitsToFloat((int) (jB & KeyboardMap.kValueMask)) : Float.intBitsToFloat((int) (jB >> 32)));
        Map map = this.f45713i;
        if (map.containsKey(abstractC5892a)) {
            iRound = AbstractC5893b.a(abstractC5892a, ((Number) Q.j(this.f45713i, abstractC5892a)).intValue(), iRound);
        }
        map.put(abstractC5892a, Integer.valueOf(iRound));
    }

    public abstract long d(NodeCoordinator nodeCoordinator, long j10);

    public abstract Map e(NodeCoordinator nodeCoordinator);

    public final InterfaceC6027b f() {
        return this.f45705a;
    }

    public final boolean g() {
        return this.f45706b;
    }

    public final Map h() {
        return this.f45713i;
    }

    public abstract int i(NodeCoordinator nodeCoordinator, AbstractC5892a abstractC5892a);

    public final boolean j() {
        return this.f45707c || this.f45709e || this.f45710f || this.f45711g;
    }

    public final boolean k() {
        o();
        return this.f45712h != null;
    }

    public final boolean l() {
        return this.f45708d;
    }

    public final void m() {
        this.f45706b = true;
        InterfaceC6027b interfaceC6027bC = this.f45705a.c();
        if (interfaceC6027bC == null) {
            return;
        }
        if (this.f45707c) {
            interfaceC6027bC.r();
        } else if (this.f45709e || this.f45708d) {
            interfaceC6027bC.requestLayout();
        }
        if (this.f45710f) {
            this.f45705a.r();
        }
        if (this.f45711g) {
            this.f45705a.requestLayout();
        }
        interfaceC6027bC.a().m();
    }

    public final void n() {
        this.f45713i.clear();
        this.f45705a.g(new C0623a());
        this.f45713i.putAll(e(this.f45705a.m()));
        this.f45706b = false;
    }

    public final void o() {
        InterfaceC6027b interfaceC6027b;
        AbstractC6026a abstractC6026aA;
        AbstractC6026a abstractC6026aA2;
        if (j()) {
            interfaceC6027b = this.f45705a;
        } else {
            InterfaceC6027b interfaceC6027bC = this.f45705a.c();
            if (interfaceC6027bC == null) {
                return;
            }
            interfaceC6027b = interfaceC6027bC.a().f45712h;
            if (interfaceC6027b == null || !interfaceC6027b.a().j()) {
                InterfaceC6027b interfaceC6027b2 = this.f45712h;
                if (interfaceC6027b2 == null || interfaceC6027b2.a().j()) {
                    return;
                }
                InterfaceC6027b interfaceC6027bC2 = interfaceC6027b2.c();
                if (interfaceC6027bC2 != null && (abstractC6026aA2 = interfaceC6027bC2.a()) != null) {
                    abstractC6026aA2.o();
                }
                InterfaceC6027b interfaceC6027bC3 = interfaceC6027b2.c();
                interfaceC6027b = (interfaceC6027bC3 == null || (abstractC6026aA = interfaceC6027bC3.a()) == null) ? null : abstractC6026aA.f45712h;
            }
        }
        this.f45712h = interfaceC6027b;
    }

    public final void p(boolean z10) {
        this.f45709e = z10;
    }

    public final void q(boolean z10) {
        this.f45711g = z10;
    }

    public final void r(boolean z10) {
        this.f45710f = z10;
    }

    public final void s(boolean z10) {
        this.f45708d = z10;
    }

    public final void t(boolean z10) {
        this.f45707c = z10;
    }

    public AbstractC6026a(InterfaceC6027b interfaceC6027b) {
        this.f45705a = interfaceC6027b;
        this.f45706b = true;
        this.f45713i = new HashMap();
    }
}
