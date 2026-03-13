package k2;

import D1.o;
import G1.C;
import G1.M;
import G1.t;
import K7.AbstractC1081v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC4790a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f39252a;

    public g(o oVar) {
        this.f39252a = oVar;
    }

    public static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    public static InterfaceC4790a c(C c10) {
        c10.b0(4);
        int iY = c10.y();
        int iY2 = c10.y();
        c10.b0(4);
        int iY3 = c10.y();
        String strA = a(iY3);
        if (strA != null) {
            o.b bVar = new o.b();
            bVar.F0(iY).h0(iY2).y0(strA);
            return new g(bVar.P());
        }
        t.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iY3);
        return null;
    }

    public static InterfaceC4790a d(int i10, C c10) {
        if (i10 == 2) {
            return c(c10);
        }
        if (i10 == 1) {
            return e(c10);
        }
        t.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + M.t0(i10));
        return null;
    }

    public static InterfaceC4790a e(C c10) {
        int iD = c10.D();
        String strB = b(iD);
        if (strB == null) {
            t.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + iD);
            return null;
        }
        int iD2 = c10.D();
        int iY = c10.y();
        c10.b0(6);
        int iI0 = M.i0(c10.D());
        int iD3 = c10.a() > 0 ? c10.D() : 0;
        o.b bVar = new o.b();
        bVar.y0(strB).T(iD2).z0(iY);
        if (strB.equals("audio/raw") && iI0 != 0) {
            bVar.s0(iI0);
        }
        if (strB.equals("audio/mp4a-latm") && iD3 > 0) {
            byte[] bArr = new byte[iD3];
            c10.q(bArr, 0, iD3);
            bVar.k0(AbstractC1081v.A(bArr));
        }
        return new g(bVar.P());
    }

    @Override // k2.InterfaceC4790a
    public int getType() {
        return 1718776947;
    }
}
