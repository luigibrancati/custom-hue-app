package yd;

import Cd.M;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface s {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48612a = new a();

        @Override // yd.s
        public Cd.E a(fd.q proto, String flexibleId, M lowerBound, M upperBound) {
            AbstractC4862t.e(proto, "proto");
            AbstractC4862t.e(flexibleId, "flexibleId");
            AbstractC4862t.e(lowerBound, "lowerBound");
            AbstractC4862t.e(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    Cd.E a(fd.q qVar, String str, M m10, M m11);
}
