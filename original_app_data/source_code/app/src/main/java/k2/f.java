package k2;

import G1.C;
import K7.AbstractC1081v;
import K7.Y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC4790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1081v f39250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39251b;

    public f(int i10, AbstractC1081v abstractC1081v) {
        this.f39251b = i10;
        this.f39250a = abstractC1081v;
    }

    public static InterfaceC4790a a(int i10, int i11, C c10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, c10);
            case 1751742049:
                return c.b(c10);
            case 1752331379:
                return d.c(c10);
            case 1852994675:
                return h.a(c10);
            default:
                return null;
        }
    }

    public static f c(int i10, C c10) {
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        int iJ = c10.j();
        int iB = -2;
        while (c10.a() > 8) {
            int iY = c10.y();
            int iG = c10.g() + c10.y();
            c10.Z(iG);
            InterfaceC4790a interfaceC4790aC = iY == 1414744396 ? c(c10.y(), c10) : a(iY, iB, c10);
            if (interfaceC4790aC != null) {
                if (interfaceC4790aC.getType() == 1752331379) {
                    iB = ((d) interfaceC4790aC).b();
                }
                aVar.a(interfaceC4790aC);
            }
            c10.a0(iG);
            c10.Z(iJ);
        }
        return new f(i10, aVar.k());
    }

    public InterfaceC4790a b(Class cls) {
        Y it = this.f39250a.iterator();
        while (it.hasNext()) {
            InterfaceC4790a interfaceC4790a = (InterfaceC4790a) it.next();
            if (interfaceC4790a.getClass() == cls) {
                return interfaceC4790a;
            }
        }
        return null;
    }

    @Override // k2.InterfaceC4790a
    public int getType() {
        return this.f39251b;
    }
}
