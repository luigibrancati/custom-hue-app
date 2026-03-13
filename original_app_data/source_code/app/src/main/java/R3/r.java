package R3;

import I3.AbstractC0890u;
import android.content.ComponentName;
import android.content.Context;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14542a = AbstractC0890u.i("PackageManagerHelper");

    public static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static boolean b(int i10, boolean z10) {
        return i10 == 0 ? z10 : i10 == 1;
    }

    public static void c(Context context, Class cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                AbstractC0890u.e().a(f14542a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC0890u abstractC0890uE = AbstractC0890u.e();
            String str = f14542a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(StringUtils.SPACE);
            sb2.append(z10 ? "enabled" : "disabled");
            abstractC0890uE.a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC0890u abstractC0890uE2 = AbstractC0890u.e();
            String str2 = f14542a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            abstractC0890uE2.b(str2, sb3.toString(), e10);
        }
    }
}
