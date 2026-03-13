package z;

import E.J;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6483c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f48664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f48665b;

    static {
        HashMap map = new HashMap();
        f48664a = map;
        HashMap map2 = new HashMap();
        f48665b = map2;
        J j10 = J.f2794d;
        map.put(1L, j10);
        map2.put(j10, Collections.singletonList(1L));
        map.put(2L, J.f2796f);
        map2.put((J) map.get(2L), Collections.singletonList(2L));
        J j11 = J.f2797g;
        map.put(4L, j11);
        map2.put(j11, Collections.singletonList(4L));
        J j12 = J.f2798h;
        map.put(8L, j12);
        map2.put(j12, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f48664a.put((Long) it.next(), J.f2799i);
        }
        f48665b.put(J.f2799i, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f48664a.put((Long) it2.next(), J.f2800j);
        }
        f48665b.put(J.f2800j, listAsList2);
    }

    public static Long a(J j10, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f48665b.get(j10);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l10 : list) {
            if (supportedProfiles.contains(l10)) {
                return l10;
            }
        }
        return null;
    }

    public static J b(long j10) {
        return (J) f48664a.get(Long.valueOf(j10));
    }
}
