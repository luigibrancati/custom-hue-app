package C2;

import G1.C;
import i2.I;
import i2.InterfaceC4337q;
import java.util.ArrayList;
import java.util.List;
import x2.C6293c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J7.r f1046d = J7.r.d(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J7.r f1047e = J7.r.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1048a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1049b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1050c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f1052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1053c;

        public a(int i10, long j10, int i11) {
            this.f1051a = i10;
            this.f1052b = j10;
            this.f1053c = i11;
        }
    }

    public static int b(String str) throws D1.w {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw D1.w.a("Invalid SEF name", null);
        }
    }

    public static C6293c f(C c10, int i10) throws D1.w {
        ArrayList arrayList = new ArrayList();
        List listF = f1047e.f(c10.I(i10));
        for (int i11 = 0; i11 < listF.size(); i11++) {
            List listF2 = f1046d.f((CharSequence) listF.get(i11));
            if (listF2.size() != 3) {
                throw D1.w.a(null, null);
            }
            try {
                arrayList.add(new C6293c.a(Long.parseLong((String) listF2.get(0)), Long.parseLong((String) listF2.get(1)), 1 << (Integer.parseInt((String) listF2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw D1.w.a(null, e10);
            }
        }
        return new C6293c(arrayList);
    }

    public final void a(InterfaceC4337q interfaceC4337q, I i10) {
        C c10 = new C(8);
        interfaceC4337q.readFully(c10.f(), 0, 8);
        this.f1050c = c10.y() + 8;
        if (c10.u() != 1397048916) {
            i10.f36871a = 0L;
        } else {
            i10.f36871a = interfaceC4337q.getPosition() - ((long) (this.f1050c - 12));
            this.f1049b = 2;
        }
    }

    public int c(InterfaceC4337q interfaceC4337q, I i10, List list) throws D1.w {
        int i11 = this.f1049b;
        long j10 = 0;
        if (i11 == 0) {
            long length = interfaceC4337q.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            i10.f36871a = j10;
            this.f1049b = 1;
        } else if (i11 == 1) {
            a(interfaceC4337q, i10);
        } else if (i11 == 2) {
            d(interfaceC4337q, i10);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(interfaceC4337q, list);
            i10.f36871a = 0L;
        }
        return 1;
    }

    public final void d(InterfaceC4337q interfaceC4337q, I i10) {
        long length = interfaceC4337q.getLength();
        int i11 = this.f1050c - 20;
        C c10 = new C(i11);
        interfaceC4337q.readFully(c10.f(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            c10.b0(2);
            short sA = c10.A();
            if (sA == 2192 || sA == 2816 || sA == 2817 || sA == 2819 || sA == 2820) {
                this.f1048a.add(new a(sA, (length - ((long) this.f1050c)) - ((long) c10.y()), c10.y()));
            } else {
                c10.b0(8);
            }
        }
        if (this.f1048a.isEmpty()) {
            i10.f36871a = 0L;
        } else {
            this.f1049b = 3;
            i10.f36871a = ((a) this.f1048a.get(0)).f1052b;
        }
    }

    public final void e(InterfaceC4337q interfaceC4337q, List list) throws D1.w {
        long position = interfaceC4337q.getPosition();
        int length = (int) ((interfaceC4337q.getLength() - interfaceC4337q.getPosition()) - ((long) this.f1050c));
        C c10 = new C(length);
        interfaceC4337q.readFully(c10.f(), 0, length);
        for (int i10 = 0; i10 < this.f1048a.size(); i10++) {
            a aVar = (a) this.f1048a.get(i10);
            c10.a0((int) (aVar.f1052b - position));
            c10.b0(4);
            int iY = c10.y();
            int iB = b(c10.I(iY));
            int i11 = aVar.f1053c - (iY + 8);
            if (iB == 2192) {
                list.add(f(c10, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f1048a.clear();
        this.f1049b = 0;
    }
}
