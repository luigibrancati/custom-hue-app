package j$.util;

import java.util.Collection;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Collection$EL {
    public static Object[] toArray(Collection collection, IntFunction intFunction) {
        return collection.toArray((Object[]) intFunction.apply(0));
    }
}
