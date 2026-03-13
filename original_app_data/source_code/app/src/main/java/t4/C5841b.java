package t4;

import android.app.Activity;
import androidx.fragment.app.ActivityC2740v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import vc.p;

/* JADX INFO: renamed from: t4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5841b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5841b f44746a = new C5841b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f44747b = new WeakHashMap();

    public final void a(Activity activity, p track, A4.a logger) {
        AbstractC4862t.e(activity, "<this>");
        AbstractC4862t.e(track, "track");
        AbstractC4862t.e(logger, "logger");
        ActivityC2740v activityC2740v = activity instanceof ActivityC2740v ? (ActivityC2740v) activity : null;
        if (activityC2740v == null) {
            logger.a("Activity is not a FragmentActivity");
            return;
        }
        C5840a c5840a = new C5840a(track, logger);
        activityC2740v.getSupportFragmentManager().h1(c5840a, true);
        WeakHashMap weakHashMap = f44747b;
        Object arrayList = weakHashMap.get(activityC2740v);
        if (arrayList == null) {
            arrayList = new ArrayList();
            weakHashMap.put(activityC2740v, arrayList);
        }
        ((List) arrayList).add(c5840a);
    }

    public final void b(Activity activity, A4.a logger) {
        AbstractC4862t.e(activity, "<this>");
        AbstractC4862t.e(logger, "logger");
        ActivityC2740v activityC2740v = activity instanceof ActivityC2740v ? (ActivityC2740v) activity : null;
        if (activityC2740v == null) {
            logger.a("Activity is not a FragmentActivity");
            return;
        }
        List list = (List) f44747b.remove(activityC2740v);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                activityC2740v.getSupportFragmentManager().x1((C5840a) it.next());
            }
        }
    }
}
