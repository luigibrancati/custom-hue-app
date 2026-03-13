package Fc;

import Cc.n;
import Fc.F;
import Fc.y;
import Lc.U;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class w extends y implements Cc.n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.b f4017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC4028k f4018n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends y.c implements n.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final w f4019h;

        public a(w property) {
            AbstractC4862t.e(property, "property");
            this.f4019h = property;
        }

        @Override // Cc.l.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public w i() {
            return this.f4019h;
        }

        @Override // vc.l
        public Object invoke(Object obj) {
            return i().get(obj);
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
            return new a(w.this);
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
            return w.this.B();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(signature, "signature");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4017m = bVarB;
        this.f4018n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }

    @Override // Cc.l
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a g() {
        Object objInvoke = this.f4017m.invoke();
        AbstractC4862t.d(objInvoke, "_getter()");
        return (a) objInvoke;
    }

    @Override // Cc.n
    public Object get(Object obj) {
        return g().call(obj);
    }

    @Override // vc.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n container, U descriptor) {
        super(container, descriptor);
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(descriptor, "descriptor");
        F.b bVarB = F.b(new b());
        AbstractC4862t.d(bVarB, "lazy { Getter(this) }");
        this.f4017m = bVarB;
        this.f4018n = C4029l.a(EnumC4031n.PUBLICATION, new c());
    }
}
