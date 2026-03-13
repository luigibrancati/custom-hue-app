package ze;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ze.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6564c {
    public static final int a(String str, int i10) {
        AbstractC4862t.e(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
