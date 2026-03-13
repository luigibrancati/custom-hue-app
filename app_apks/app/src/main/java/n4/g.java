package n4;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final void a(l lVar, String tag, Throwable throwable) {
        AbstractC4862t.e(lVar, "<this>");
        AbstractC4862t.e(tag, "tag");
        AbstractC4862t.e(throwable, "throwable");
        if (lVar.getLevel() <= 6) {
            lVar.a(tag, 6, null, throwable);
        }
    }
}
