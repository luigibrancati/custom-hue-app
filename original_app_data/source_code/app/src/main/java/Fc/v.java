package Fc;

import Cc.m;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class v extends y implements Cc.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.b f4012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC4028k f4013n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.c implements m.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final v f4014h;

        public a(v property) {
            AbstractC4862t.e(property, "property");
            this.f4014h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public v i() {
            return this.f4014h;
        }

        @Override // vc.InterfaceC6082a
        public Object invoke() {
            return i().get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(v.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public final Object invoke() {
            v vVar = v.this;
            return vVar.D(vVar.B(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4012m = bVarB;
        this.f4013n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }

    @Override // Cc.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a g() {
        Object objInvoke = this.f4012m.invoke();
        AbstractC4862t.d(objInvoke, "_getter()");
        return (a) objInvoke;
    }

    @Override // Cc.m
    public Object get() {
        return g().call(new Object[0]);
    }

    @Override // vc.InterfaceC6082a
    public Object invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4012m = bVarB;
        this.f4013n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }
}
