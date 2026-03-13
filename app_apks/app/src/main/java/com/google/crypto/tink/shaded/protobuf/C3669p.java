package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3676x;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3669p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C3669p f31529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3669p f31530c = new C3669p(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f31531a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f31532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31533b;

        public a(Object obj, int i10) {
            this.f31532a = obj;
            this.f31533b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31532a == aVar.f31532a && this.f31533b == aVar.f31533b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f31532a) * 65535) + this.f31533b;
        }
    }

    public C3669p(boolean z10) {
    }

    public static C3669p b() {
        C3669p c3669pA;
        if (b0.f31427d) {
            return f31530c;
        }
        C3669p c3669p = f31529b;
        if (c3669p != null) {
            return c3669p;
        }
        synchronized (C3669p.class) {
            try {
                c3669pA = f31529b;
                if (c3669pA == null) {
                    c3669pA = AbstractC3668o.a();
                    f31529b = c3669pA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3669pA;
    }

    public AbstractC3676x.d a(Q q10, int i10) {
        android.support.v4.media.session.a.a(this.f31531a.get(new a(q10, i10)));
        return null;
    }
}
