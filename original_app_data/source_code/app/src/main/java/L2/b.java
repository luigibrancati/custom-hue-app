package L2;

import K7.AbstractC1085z;
import android.text.TextUtils;
import io.sentry.MeasurementUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f8476d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1085z f8477e = AbstractC1085z.A("auto", MeasurementUnit.NONE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC1085z f8478f = AbstractC1085z.B("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC1085z f8479g = AbstractC1085z.A("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC1085z f8480h = AbstractC1085z.B("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8483c;

    public b(int i10, int i11, int i12) {
        this.f8481a = i10;
        this.f8482b = i11;
        this.f8483c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = J7.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(AbstractC1085z.v(TextUtils.split(strE, f8476d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L2.b b(K7.AbstractC1085z r7) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.b.b(K7.z):L2.b");
    }
}
