package com.braze.requests.framework.queue;

import java.util.Comparator;
import jc.C4757a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C4757a.a(Long.valueOf(((com.braze.requests.framework.h) obj).f28281b), Long.valueOf(((com.braze.requests.framework.h) obj2).f28281b));
    }
}
