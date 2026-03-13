package ge;

import fe.InterfaceC4047c;
import fe.InterfaceC4049e;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4223a implements ce.b {
    public /* synthetic */ AbstractC4223a(AbstractC4854k abstractC4854k) {
        this();
    }

    public static /* synthetic */ void k(AbstractC4223a abstractC4223a, InterfaceC4047c interfaceC4047c, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC4223a.j(interfaceC4047c, i10, obj, z10);
    }

    public abstract Object c();

    public abstract int d(Object obj);

    @Override // ce.InterfaceC3118a
    public Object deserialize(InterfaceC4049e decoder) {
        AbstractC4862t.e(decoder, "decoder");
        return h(decoder, null);
    }

    public abstract void e(Object obj, int i10);

    public abstract Iterator f(Object obj);

    public abstract int g(Object obj);

    public final Object h(InterfaceC4049e decoder, Object obj) {
        Object objC;
        AbstractC4862t.e(decoder, "decoder");
        if (obj == null || (objC = m(obj)) == null) {
            objC = c();
        }
        Object obj2 = objC;
        int iD = d(obj2);
        InterfaceC4047c interfaceC4047cA = decoder.a(getDescriptor());
        if (!interfaceC4047cA.q()) {
            while (true) {
                int iJ = interfaceC4047cA.j(getDescriptor());
                if (iJ == -1) {
                    break;
                }
                k(this, interfaceC4047cA, iD + iJ, obj2, false, 8, null);
            }
        } else {
            i(interfaceC4047cA, obj2, iD, l(interfaceC4047cA, obj2));
        }
        interfaceC4047cA.c(getDescriptor());
        return n(obj2);
    }

    public abstract void i(InterfaceC4047c interfaceC4047c, Object obj, int i10, int i11);

    public abstract void j(InterfaceC4047c interfaceC4047c, int i10, Object obj, boolean z10);

    public final int l(InterfaceC4047c interfaceC4047c, Object obj) {
        int iS = interfaceC4047c.s(getDescriptor());
        e(obj, iS);
        return iS;
    }

    public abstract Object m(Object obj);

    public abstract Object n(Object obj);

    public AbstractC4223a() {
    }
}
