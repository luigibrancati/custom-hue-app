package T1;

import G1.AbstractC0861i;
import G1.M;
import K7.AbstractC1081v;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16059a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f16060b = -1;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16063c;

        public b(String str, boolean z10, boolean z11) {
            this.f16061a = str;
            this.f16062b = z10;
            this.f16063c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f16061a, bVar.f16061a) && this.f16062b == bVar.f16062b && this.f16063c == bVar.f16063c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f16061a.hashCode() + 31) * 31) + (this.f16062b ? 1231 : 1237)) * 31) + (this.f16063c ? 1231 : 1237);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f16065b;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f16064a = (z10 || z11 || z12) ? 1 : 0;
        }

        @Override // T1.z.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.f16065b[i10];
        }

        @Override // T1.z.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // T1.z.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // T1.z.d
        public int d() {
            f();
            return this.f16065b.length;
        }

        @Override // T1.z.d
        public boolean e() {
            return true;
        }

        public final void f() {
            if (this.f16065b == null) {
                this.f16065b = new MediaCodecList(this.f16064a).getCodecInfos();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        int a(Object obj);
    }

    public static void A(List list, final f fVar) {
        Collections.sort(list, new Comparator() { // from class: T1.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return z.a(fVar, obj, obj2);
            }
        });
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(p pVar) {
        return (pVar.f15967i ? 2 : 0) + (!pVar.f15968j ? 1 : 0);
    }

    public static /* synthetic */ int c(D1.o oVar, p pVar) {
        return pVar.o(oVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(p pVar) {
        String str = pVar.f15959a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    public static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            A(list, new f() { // from class: T1.w
                @Override // T1.z.f
                public final int a(Object obj) {
                    return z.d((p) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((p) list.get(0)).f15959a)) {
            return;
        }
        list.add((p) list.remove(0));
    }

    public static String f(D1.o oVar) {
        Pair pairI;
        if ("audio/eac3-joc".equals(oVar.f1805o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(oVar.f1805o) && (pairI = i(oVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(oVar.f1805o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List g(u uVar, D1.o oVar, boolean z10, boolean z11) {
        String strF = f(oVar);
        return strF == null ? AbstractC1081v.z() : uVar.b(strF, z10, z11);
    }

    public static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair i(D1.o oVar) {
        return AbstractC0861i.s(oVar);
    }

    public static p j(String str, boolean z10, boolean z11) {
        List listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return (p) listK.get(0);
    }

    public static synchronized List k(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap map = f16059a;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListL = l(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
            if (z10) {
                arrayListL.isEmpty();
            }
            e(str, arrayListL);
            AbstractC1081v abstractC1081vV = AbstractC1081v.v(arrayListL);
            map.put(bVar, abstractC1081vV);
            return abstractC1081vV;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList l(T1.z.b r16, T1.z.d r17) throws T1.z.c {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.z.l(T1.z$b, T1.z$d):java.util.ArrayList");
    }

    public static List m(u uVar, D1.o oVar, boolean z10, boolean z11) {
        List listB = uVar.b(oVar.f1805o, z10, z11);
        return AbstractC1081v.r().j(listB).j(g(uVar, oVar, z10, z11)).k();
    }

    public static List n(List list, final D1.o oVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: T1.x
            @Override // T1.z.f
            public final int a(Object obj) {
                return z.c(oVar, (p) obj);
            }
        });
        return arrayList;
    }

    public static List o(List list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new f() { // from class: T1.v
            @Override // T1.z.f
            public final int a(Object obj) {
                return z.b((p) obj);
            }
        });
        return AbstractC1081v.v(arrayList);
    }

    public static p p() {
        return j("audio/raw", false, false);
    }

    public static Pair q(D1.o oVar) {
        String strH = H1.g.h(oVar.f1808r);
        if (strH == null) {
            return null;
        }
        return AbstractC0861i.v(strH, M.h1(strH.trim(), "\\."), oVar.f1778E);
    }

    public static boolean r(MediaCodecInfo mediaCodecInfo) {
        return s(mediaCodecInfo);
    }

    public static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z10 || !str.endsWith(".secure");
    }

    public static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return v(mediaCodecInfo);
    }

    public static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        return x(mediaCodecInfo);
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean y(MediaCodecInfo mediaCodecInfo) {
        return z(mediaCodecInfo);
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
