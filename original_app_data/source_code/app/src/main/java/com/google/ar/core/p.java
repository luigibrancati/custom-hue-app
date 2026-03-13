package com.google.ar.core;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f31213a = new o(this);

    public static /* synthetic */ String b(byte b10, int i10, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + b10);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public final synchronized AugmentedFace a(long j10, Session session) {
        Map map = this.f31213a;
        Long lValueOf = Long.valueOf(j10);
        AugmentedFace augmentedFace = (AugmentedFace) map.get(lValueOf);
        if (augmentedFace != null) {
            return augmentedFace;
        }
        AugmentedFace augmentedFace2 = new AugmentedFace(j10, session);
        map.put(lValueOf, augmentedFace2);
        return augmentedFace2;
    }
}
