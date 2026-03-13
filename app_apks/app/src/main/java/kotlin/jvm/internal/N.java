package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class N {
    public Cc.d b(Class cls) {
        return new C4852i(cls);
    }

    public Cc.g c(Class cls, String str) {
        return new A(cls, str);
    }

    public String h(InterfaceC4858o interfaceC4858o) {
        String string = interfaceC4858o.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String i(v vVar) {
        return h(vVar);
    }

    public Cc.h a(AbstractC4859p abstractC4859p) {
        return abstractC4859p;
    }

    public Cc.j d(x xVar) {
        return xVar;
    }

    public Cc.m e(B b10) {
        return b10;
    }

    public Cc.n f(D d10) {
        return d10;
    }

    public Cc.o g(F f10) {
        return f10;
    }
}
