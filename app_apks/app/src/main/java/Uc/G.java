package Uc;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum G {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    public static final a Companion = new a(null);
    private final String description;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    G(String str) {
        this.description = str;
    }

    public final String b() {
        return this.description;
    }

    public final boolean j() {
        return this == IGNORE;
    }

    public final boolean p() {
        return this == WARN;
    }
}
