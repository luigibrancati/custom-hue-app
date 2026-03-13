package s4;

import Od.C;
import Od.F;
import android.app.Activity;
import fc.AbstractC4040w;
import gc.C4179C;
import gc.Q;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import org.apache.tika.utils.StringUtils;
import vc.l;
import z4.C6510i;

/* JADX INFO: renamed from: s4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5718d {

    /* JADX INFO: renamed from: s4.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f44025a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            AbstractC4862t.e(it, "it");
            if (it.length() <= 0) {
                return it;
            }
            StringBuilder sb2 = new StringBuilder();
            String strValueOf = String.valueOf(it.charAt(0));
            AbstractC4862t.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC4862t.d(upperCase, "toUpperCase(...)");
            sb2.append((Object) upperCase);
            String strSubstring = it.substring(1);
            AbstractC4862t.d(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
    }

    public static final Map a(C5717c target, Activity activity) {
        AbstractC4862t.e(target, "target");
        AbstractC4862t.e(activity, "activity");
        return Q.l(AbstractC4040w.a("[Amplitude] Action", "touch"), AbstractC4040w.a("[Amplitude] Target Class", target.c()), AbstractC4040w.a("[Amplitude] Target Resource", target.e()), AbstractC4040w.a("[Amplitude] Target Tag", target.g()), AbstractC4040w.a("[Amplitude] Target Text", target.h()), AbstractC4040w.a("[Amplitude] Target Source", C4179C.q0(F.I0(C.L(target.f(), "_", StringUtils.SPACE, false, 4, null), new String[]{StringUtils.SPACE}, false, 0, 6, null), StringUtils.SPACE, null, null, 0, null, a.f44025a, 30, null)), AbstractC4040w.a("[Amplitude] Hierarchy", target.d()), AbstractC4040w.a("[Amplitude] Screen Name", C6510i.f48764c.a(activity)));
    }
}
