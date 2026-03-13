package Q1;

import D1.o;
import F2.s;
import G1.AbstractC0853a;
import G1.H;
import K7.AbstractC1081v;
import L1.B0;
import P2.C1842b;
import P2.C1845e;
import P2.C1848h;
import P2.C1850j;
import P2.K;
import android.net.Uri;
import android.text.TextUtils;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f13337f = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.a f13339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13342e;

    public d() {
        this(0, true);
    }

    public static void f(int i10, List list) {
        if (N7.g.k(f13337f, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    public static C2.h i(s.a aVar, boolean z10, H h10, D1.o oVar, List list, int i10) {
        int i11 = m(oVar) ? 4 : 0;
        if (!z10) {
            aVar = s.a.f3686a;
            i11 |= 32;
        }
        s.a aVar2 = aVar;
        int iH = i11 | C2.h.h(i10);
        if (list == null) {
            list = AbstractC1081v.z();
        }
        return new C2.h(aVar2, iH, h10, null, list, null);
    }

    public static K j(int i10, boolean z10, D1.o oVar, List list, H h10, s.a aVar, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new o.b().y0("application/cea-608").P()) : Collections.EMPTY_LIST;
        }
        String str = oVar.f1801k;
        if (!TextUtils.isEmpty(str)) {
            if (!D1.v.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!D1.v.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            aVar = s.a.f3686a;
            i11 = 1;
        }
        return new K(2, i11, aVar, h10, new C1850j(i12, list), 112800);
    }

    public static boolean m(D1.o oVar) {
        D1.u uVar = oVar.f1802l;
        if (uVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < uVar.e(); i10++) {
            if (uVar.d(i10) instanceof t) {
                return !((t) r2).f13510c.isEmpty();
            }
        }
        return false;
    }

    public static boolean o(InterfaceC4336p interfaceC4336p, InterfaceC4337q interfaceC4337q) {
        try {
            boolean zJ = interfaceC4336p.j(interfaceC4337q);
            interfaceC4337q.i();
            return zJ;
        } catch (EOFException unused) {
            interfaceC4337q.i();
            return false;
        } catch (Throwable th) {
            interfaceC4337q.i();
            throw th;
        }
    }

    @Override // Q1.h
    public D1.o d(D1.o oVar) {
        String str;
        if (!this.f13340c || !this.f13339b.a(oVar)) {
            return oVar;
        }
        o.b bVarY = oVar.b().y0("application/x-media3-cues").Y(this.f13339b.c(oVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(oVar.f1805o);
        if (oVar.f1801k != null) {
            str = StringUtils.SPACE + oVar.f1801k;
        } else {
            str = "";
        }
        sb2.append(str);
        return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
    }

    @Override // Q1.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b e(Uri uri, D1.o oVar, List list, H h10, Map map, InterfaceC4337q interfaceC4337q, B0 b02) {
        int iA = D1.l.a(oVar.f1805o);
        int iB = D1.l.b(map);
        int iC = D1.l.c(uri);
        int[] iArr = f13337f;
        ArrayList arrayList = new ArrayList(iArr.length);
        f(iA, arrayList);
        f(iB, arrayList);
        f(iC, arrayList);
        int i10 = 0;
        for (int i11 : iArr) {
            f(i11, arrayList);
        }
        interfaceC4337q.i();
        InterfaceC4336p interfaceC4336p = null;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            ArrayList arrayList2 = arrayList;
            InterfaceC4336p interfaceC4336p2 = (InterfaceC4336p) AbstractC0853a.e(h(iIntValue, oVar, list, h10));
            if (o(interfaceC4336p2, interfaceC4337q)) {
                return new b(interfaceC4336p2, oVar, h10, this.f13339b, this.f13340c);
            }
            if (interfaceC4336p == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                interfaceC4336p = interfaceC4336p2;
            }
            i10++;
            arrayList = arrayList2;
        }
        return new b((InterfaceC4336p) AbstractC0853a.e(interfaceC4336p), oVar, h10, this.f13339b, this.f13340c);
    }

    public final InterfaceC4336p h(int i10, D1.o oVar, List list, H h10) {
        if (i10 == 0) {
            return new C1842b();
        }
        if (i10 == 1) {
            return new C1845e();
        }
        if (i10 == 2) {
            return new C1848h();
        }
        if (i10 == 7) {
            return new B2.f(0, 0L);
        }
        if (i10 == 8) {
            return i(this.f13339b, this.f13340c, h10, oVar, list, this.f13341d);
        }
        if (i10 == 11) {
            return j(this.f13338a, this.f13342e, oVar, list, h10, this.f13339b, this.f13340c);
        }
        if (i10 != 13) {
            return null;
        }
        return new w(oVar.f1794d, h10, this.f13339b, this.f13340c);
    }

    @Override // Q1.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public d b(boolean z10) {
        this.f13340c = z10;
        return this;
    }

    @Override // Q1.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public d c(int i10) {
        this.f13341d = i10;
        return this;
    }

    @Override // Q1.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d a(s.a aVar) {
        this.f13339b = aVar;
        return this;
    }

    public d(int i10, boolean z10) {
        this.f13338a = i10;
        this.f13342e = z10;
        this.f13339b = new F2.h();
    }
}
