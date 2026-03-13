package androidx.camera.camera2.internal.compat.quirk;

import L.T0;
import L.g1;
import L.h1;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f21941a = d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f21942b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f21943c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f21944d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"));

    public static g1 d() {
        g1 g1Var = new g1();
        h1.d dVar = h1.d.YUV;
        g1Var.a(h1.c(dVar, h1.b.VGA));
        g1Var.a(h1.c(h1.d.PRIV, h1.b.PREVIEW));
        g1Var.a(h1.c(dVar, h1.b.MAXIMUM));
        return g1Var;
    }

    public static g1 e() {
        g1 g1Var = new g1();
        h1.d dVar = h1.d.PRIV;
        g1Var.a(h1.c(dVar, h1.b.PREVIEW));
        g1Var.a(h1.c(dVar, h1.b.VGA));
        g1Var.a(h1.c(h1.d.YUV, h1.b.MAXIMUM));
        return g1Var;
    }

    public static boolean h() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean i() {
        return h() || j() || k();
    }

    public static boolean j() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f21943c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean k() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f21944d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public List f(String str) {
        return h() ? g(str) : (j() || k()) ? Collections.singletonList(f21942b) : Collections.EMPTY_LIST;
    }

    public final List g(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f21941a);
        }
        return arrayList;
    }
}
