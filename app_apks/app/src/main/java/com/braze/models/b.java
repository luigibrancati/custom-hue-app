package com.braze.models;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f28034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28035b;

    public b(LinkedHashSet eventsList) {
        AbstractC4862t.e(eventsList, "eventsList");
        this.f28034a = eventsList;
        this.f28035b = eventsList.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && AbstractC4862t.a(this.f28034a, ((b) obj).f28034a);
    }

    public final int hashCode() {
        return this.f28034a.hashCode();
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.f28035b;
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.f28034a + ")";
    }
}
