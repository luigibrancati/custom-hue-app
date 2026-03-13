package c0;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(String message) {
        AbstractC4862t.e(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        AbstractC4862t.e(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void c(String message) {
        AbstractC4862t.e(message, "message");
        throw new IndexOutOfBoundsException(message);
    }
}
