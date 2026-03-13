package z;

import E.J;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z.C6485e;

/* JADX INFO: renamed from: z.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C6486f implements C6485e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f48667a;

    public C6486f(Object obj) {
        this.f48667a = (DynamicRangeProfiles) obj;
    }

    public static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static J f(long j10) {
        return (J) X0.h.h(AbstractC6483c.b(j10), "Dynamic range profile cannot be converted to a DynamicRange object: " + j10);
    }

    @Override // z.C6485e.a
    public DynamicRangeProfiles a() {
        return this.f48667a;
    }

    @Override // z.C6485e.a
    public Set b() {
        return e(this.f48667a.getSupportedProfiles());
    }

    @Override // z.C6485e.a
    public Set c(J j10) {
        Long lD = d(j10);
        X0.h.b(lD != null, "DynamicRange is not supported: " + j10);
        return e(this.f48667a.getProfileCaptureRequestConstraints(lD.longValue()));
    }

    public final Long d(J j10) {
        return AbstractC6483c.a(j10, this.f48667a);
    }
}
