package Lc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum D {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final D a(boolean z10, boolean z11, boolean z12) {
            return z10 ? D.SEALED : z11 ? D.ABSTRACT : z12 ? D.OPEN : D.FINAL;
        }

        public a() {
        }
    }
}
