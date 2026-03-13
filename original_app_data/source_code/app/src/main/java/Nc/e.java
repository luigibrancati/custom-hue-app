package Nc;

import Cd.M;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10630a = new a();

        @Override // Nc.e
        public M a(kd.b classId, M computedType) {
            AbstractC4862t.e(classId, "classId");
            AbstractC4862t.e(computedType, "computedType");
            return computedType;
        }
    }

    M a(kd.b bVar, M m10);
}
