package A;

import Od.C;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1a = new b();

    public static final boolean d() {
        if (!C.E("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String HARDWARE = Build.HARDWARE;
            AbstractC4862t.d(HARDWARE, "HARDWARE");
            Locale locale = Locale.ROOT;
            String lowerCase = HARDWARE.toLowerCase(locale);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            if (!C.P(lowerCase, "ums", false, 2, null)) {
                if (f1a.c()) {
                    AbstractC4862t.d(HARDWARE, "HARDWARE");
                    String lowerCase2 = HARDWARE.toLowerCase(locale);
                    AbstractC4862t.d(lowerCase2, "toLowerCase(...)");
                    if (C.P(lowerCase2, "sp", false, 2, null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        return C.E(str, str2, true);
    }

    public final boolean b(String str) {
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC4862t.d(MANUFACTURER, "MANUFACTURER");
        if (a(MANUFACTURER, str)) {
            return true;
        }
        String BRAND = Build.BRAND;
        AbstractC4862t.d(BRAND, "BRAND");
        return a(BRAND, str);
    }

    public final boolean c() {
        return b("Itel");
    }
}
