package he;

import fc.C4029l;
import fc.InterfaceC4028k;
import fe.InterfaceC4049e;
import fe.InterfaceC4050f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements ee.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC4028k f36611a;

        public a(InterfaceC6082a interfaceC6082a) {
            this.f36611a = C4029l.b(interfaceC6082a);
        }

        public final ee.e a() {
            return (ee.e) this.f36611a.getValue();
        }

        @Override // ee.e
        public boolean b() {
            return super.b();
        }

        @Override // ee.e
        public int c(String name) {
            AbstractC4862t.e(name, "name");
            return a().c(name);
        }

        @Override // ee.e
        public int d() {
            return a().d();
        }

        @Override // ee.e
        public String e(int i10) {
            return a().e(i10);
        }

        @Override // ee.e
        public ee.k f() {
            return a().f();
        }

        @Override // ee.e
        public List g(int i10) {
            return a().g(i10);
        }

        @Override // ee.e
        public List getAnnotations() {
            return super.getAnnotations();
        }

        @Override // ee.e
        public ee.e h(int i10) {
            return a().h(i10);
        }

        @Override // ee.e
        public String i() {
            return a().i();
        }

        @Override // ee.e
        public boolean isInline() {
            return super.isInline();
        }

        @Override // ee.e
        public boolean j(int i10) {
            return a().j(i10);
        }
    }

    public static final g d(InterfaceC4049e interfaceC4049e) {
        AbstractC4862t.e(interfaceC4049e, "<this>");
        g gVar = interfaceC4049e instanceof g ? (g) interfaceC4049e : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + M.b(interfaceC4049e.getClass()));
    }

    public static final r e(InterfaceC4050f interfaceC4050f) {
        AbstractC4862t.e(interfaceC4050f, "<this>");
        r rVar = interfaceC4050f instanceof r ? (r) interfaceC4050f : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + M.b(interfaceC4050f.getClass()));
    }

    public static final ee.e f(InterfaceC6082a interfaceC6082a) {
        return new a(interfaceC6082a);
    }

    public static final void g(InterfaceC4049e interfaceC4049e) {
        d(interfaceC4049e);
    }

    public static final void h(InterfaceC4050f interfaceC4050f) {
        e(interfaceC4050f);
    }
}
