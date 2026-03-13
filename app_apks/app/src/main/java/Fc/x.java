package Fc;

import Cc.o;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC4849f;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class x extends y implements Cc.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.b f4022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC4028k f4023n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.c implements o.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final x f4024h;

        public a(x property) {
            AbstractC4862t.e(property, "property");
            this.f4024h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public x i() {
            return this.f4024h;
        }

        @Override // vc.p
        public Object invoke(Object obj, Object obj2) {
            return C().q(obj, obj2);
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
            return new a(x.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Member invoke() {
            return x.this.B();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n container, String name, String signature) {
        super(container, name, signature, AbstractC4849f.NO_RECEIVER);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4022m = bVarB;
        this.f4023n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }

    @Override // Cc.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a g() {
        Object objInvoke = this.f4022m.invoke();
        AbstractC4862t.d(objInvoke, "_getter()");
        return (a) objInvoke;
    }

    @Override // vc.p
    public Object invoke(Object obj, Object obj2) {
        return q(obj, obj2);
    }

    @Override // Cc.o
    public Object q(Object obj, Object obj2) {
        return F().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4022m = bVarB;
        this.f4023n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }
}
