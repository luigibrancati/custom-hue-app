package W1;

import D1.C0748f;
import D1.o;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import G1.B;
import G1.M;
import H1.g;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import i2.AbstractC4321a;
import org.apache.tika.metadata.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f17746b;

    public n(androidx.media3.exoplayer.rtsp.e eVar, a aVar, Uri uri) {
        AbstractC0853a.b(aVar.f17675i.containsKey("control"), "missing attribute control");
        this.f17745a = b(aVar);
        this.f17746b = a(eVar, uri, (String) M.i((String) aVar.f17675i.get("control")));
    }

    public static Uri a(androidx.media3.exoplayer.rtsp.e eVar, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(eVar.d("Content-Base"))) {
            uri = Uri.parse(eVar.d("Content-Base"));
        } else if (!TextUtils.isEmpty(eVar.d(HttpHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(eVar.d(HttpHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static W1.g b(W1.a r13) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.n.b(W1.a):W1.g");
    }

    public static byte[] c(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = H1.g.f5132a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    public static int d(int i10, String str) {
        return i10 != -1 ? i10 : str.equals("audio/ac3") ? 6 : 1;
    }

    public static AbstractC4321a.b e(String str) {
        B b10 = new B(M.R(str));
        AbstractC0853a.b(b10.h(1) == 0, "Only supports audio mux version 0.");
        AbstractC0853a.b(b10.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
        b10.r(6);
        AbstractC0853a.b(b10.h(4) == 0, "Only supports one program.");
        AbstractC0853a.b(b10.h(3) == 0, "Only supports one numLayer.");
        try {
            return AbstractC4321a.e(b10, false);
        } catch (D1.w e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void f(o.b bVar, AbstractC1083x abstractC1083x, String str, int i10, int i11) {
        String str2 = (String) abstractC1083x.get("profile-level-id");
        if (str2 == null && str.equals("MP4A-LATM")) {
            str2 = "30";
        }
        AbstractC0853a.b((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        bVar.U("mp4a.40." + str2);
        bVar.k0(AbstractC1081v.A(AbstractC4321a.a(i11, i10)));
    }

    public static void g(o.b bVar, AbstractC1083x abstractC1083x) {
        AbstractC0853a.b(abstractC1083x.containsKey("sprop-parameter-sets"), "missing sprop parameter");
        String[] strArrH1 = M.h1((String) AbstractC0853a.e((String) abstractC1083x.get("sprop-parameter-sets")), ",");
        AbstractC0853a.b(strArrH1.length == 2, "empty sprop value");
        AbstractC1081v abstractC1081vB = AbstractC1081v.B(c(strArrH1[0]), c(strArrH1[1]));
        bVar.k0(abstractC1081vB);
        byte[] bArr = (byte[]) abstractC1081vB.get(0);
        g.m mVarC = H1.g.C(bArr, H1.g.f5132a.length, bArr.length);
        bVar.u0(mVarC.f5201h);
        bVar.h0(mVarC.f5200g);
        bVar.F0(mVarC.f5199f);
        bVar.V(new C0748f.b().d(mVarC.f5210q).c(mVarC.f5211r).e(mVarC.f5212s).g(mVarC.f5202i + 8).b(mVarC.f5203j + 8).a());
        String str = (String) abstractC1083x.get("profile-level-id");
        if (str == null) {
            bVar.U(AbstractC0861i.f(mVarC.f5194a, mVarC.f5195b, mVarC.f5196c));
            return;
        }
        bVar.U("avc1." + str);
    }

    public static void h(o.b bVar, AbstractC1083x abstractC1083x) {
        if (abstractC1083x.containsKey("sprop-max-don-diff")) {
            int i10 = Integer.parseInt((String) AbstractC0853a.e((String) abstractC1083x.get("sprop-max-don-diff")));
            AbstractC0853a.b(i10 == 0, "non-zero sprop-max-don-diff " + i10 + " is not supported");
        }
        AbstractC0853a.b(abstractC1083x.containsKey("sprop-vps"), "missing sprop-vps parameter");
        String str = (String) AbstractC0853a.e((String) abstractC1083x.get("sprop-vps"));
        AbstractC0853a.b(abstractC1083x.containsKey("sprop-sps"), "missing sprop-sps parameter");
        String str2 = (String) AbstractC0853a.e((String) abstractC1083x.get("sprop-sps"));
        AbstractC0853a.b(abstractC1083x.containsKey("sprop-pps"), "missing sprop-pps parameter");
        AbstractC1081v abstractC1081vE = AbstractC1081v.E(c(str), c(str2), c((String) AbstractC0853a.e((String) abstractC1083x.get("sprop-pps"))));
        bVar.k0(abstractC1081vE);
        byte[] bArr = (byte[]) abstractC1081vE.get(1);
        g.h hVarU = H1.g.u(bArr, H1.g.f5132a.length, bArr.length, null);
        bVar.u0(hVarU.f5176l);
        bVar.h0(hVarU.f5173i).F0(hVarU.f5172h);
        bVar.V(new C0748f.b().d(hVarU.f5178n).c(hVarU.f5179o).e(hVarU.f5180p).g(hVarU.f5169e + 8).b(hVarU.f5170f + 8).a());
        g.c cVar = hVarU.f5167c;
        if (cVar != null) {
            bVar.U(AbstractC0861i.h(cVar.f5141a, cVar.f5142b, cVar.f5143c, cVar.f5144d, cVar.f5145e, cVar.f5146f));
        }
    }

    public static void i(o.b bVar, AbstractC1083x abstractC1083x) {
        String str = (String) abstractC1083x.get("config");
        if (str != null) {
            byte[] bArrR = M.R(str);
            bVar.k0(AbstractC1081v.A(bArrR));
            Pair pairX = AbstractC0861i.x(bArrR);
            bVar.F0(((Integer) pairX.first).intValue()).h0(((Integer) pairX.second).intValue());
        } else {
            bVar.F0(352).h0(288);
        }
        String str2 = (String) abstractC1083x.get("profile-level-id");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mp4v.");
        if (str2 == null) {
            str2 = "1";
        }
        sb2.append(str2);
        bVar.U(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f17745a.equals(nVar.f17745a) && this.f17746b.equals(nVar.f17746b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((217 + this.f17745a.hashCode()) * 31) + this.f17746b.hashCode();
    }
}
