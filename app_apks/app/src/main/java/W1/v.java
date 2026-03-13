package W1;

import G1.AbstractC0853a;
import G1.J;
import G1.M;
import K7.AbstractC1081v;
import android.net.Uri;
import io.sentry.Session;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f17769c;

    public v(long j10, int i10, Uri uri) {
        this.f17767a = j10;
        this.f17768b = i10;
        this.f17769c = uri;
    }

    public static AbstractC1081v a(String str, Uri uri) throws D1.w {
        AbstractC1081v.a aVar = new AbstractC1081v.a();
        String[] strArrH1 = M.h1(str, ",");
        int length = strArrH1.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArrH1[i10];
            String[] strArrH12 = M.h1(str2, ";");
            int length2 = strArrH12.length;
            int i11 = i10;
            long j10 = -9223372036854775807L;
            int i12 = 0;
            Uri uriB = null;
            int i13 = -1;
            while (i12 < length2) {
                String str3 = strArrH12[i12];
                try {
                    String[] strArrI1 = M.i1(str3, "=");
                    String str4 = strArrI1[0];
                    String str5 = strArrI1[1];
                    int iHashCode = str4.hashCode();
                    String[] strArr = strArrH1;
                    if (iHashCode != 113759) {
                        if (iHashCode != 116079) {
                            if (iHashCode != 1524180539 || !str4.equals("rtptime")) {
                                throw D1.w.c(str4, null);
                            }
                            j10 = Long.parseLong(str5);
                            i12++;
                            strArrH1 = strArr;
                        } else {
                            if (!str4.equals("url")) {
                                throw D1.w.c(str4, null);
                            }
                            uriB = b(str5, uri);
                            i12++;
                            strArrH1 = strArr;
                        }
                    } else {
                        if (!str4.equals(Session.JsonKeys.SEQ)) {
                            throw D1.w.c(str4, null);
                        }
                        i13 = Integer.parseInt(str5);
                        i12++;
                        strArrH1 = strArr;
                    }
                } catch (Exception e10) {
                    throw D1.w.c(str3, e10);
                }
            }
            String[] strArr2 = strArrH1;
            if (uriB == null || uriB.getScheme() == null || (i13 == -1 && j10 == -9223372036854775807L)) {
                throw D1.w.c(str2, null);
            }
            aVar.a(new v(j10, i13, uriB));
            i10 = i11 + 1;
            strArrH1 = strArr2;
        }
        return aVar.k();
    }

    public static Uri b(String str, Uri uri) {
        AbstractC0853a.a(((String) AbstractC0853a.e(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) AbstractC0853a.e(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return J.g(string, str);
        }
        return J.g(string + "/", str);
    }
}
