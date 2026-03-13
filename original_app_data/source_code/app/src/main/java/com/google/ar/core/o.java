package com.google.ar.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class o extends LinkedHashMap {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(1, 0.75f, true);
        Objects.requireNonNull(pVar);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
