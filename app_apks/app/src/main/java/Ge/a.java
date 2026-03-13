package Ge;

import Fe.C0843e;
import Fe.N;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4729a = N.a("0123456789abcdef");

    public static final byte[] a() {
        return f4729a;
    }

    public static final String b(C0843e c0843e, long j10) throws EOFException {
        AbstractC4862t.e(c0843e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c0843e.q(j11) == 13) {
                String strO0 = c0843e.o0(j11);
                c0843e.skip(2L);
                return strO0;
            }
        }
        String strO02 = c0843e.o0(j10);
        c0843e.skip(1L);
        return strO02;
    }
}
