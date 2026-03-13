package com.braze.managers;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f27837a;

    public a(Class javaClass) {
        AbstractC4862t.e(javaClass, "javaClass");
        this.f27837a = javaClass;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC4862t.a(this.f27837a, ((a) obj).f27837a);
    }

    public final int hashCode() {
        return this.f27837a.hashCode();
    }

    public final String toString() {
        return "ActivitySessionWrapper(javaClass=" + this.f27837a + ")";
    }
}
