package m6;

import Y5.f;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5024a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray f40199a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f40200b;

    static {
        HashMap map = new HashMap();
        f40200b = map;
        map.put(f.DEFAULT, 0);
        f40200b.put(f.VERY_LOW, 1);
        f40200b.put(f.HIGHEST, 2);
        for (f fVar : f40200b.keySet()) {
            f40199a.append(((Integer) f40200b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f40200b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i10) {
        f fVar = (f) f40199a.get(i10);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
