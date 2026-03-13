package b0;

import gc.C4202o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y extends o {
    public y() {
        this(0, 1, null);
    }

    public final boolean c(long j10) {
        e(this.f24933b + 1);
        long[] jArr = this.f24932a;
        int i10 = this.f24933b;
        jArr[i10] = j10;
        this.f24933b = i10 + 1;
        return true;
    }

    public final boolean d(int i10, long[] elements) {
        AbstractC4862t.e(elements, "elements");
        if (i10 < 0 || i10 > this.f24933b) {
            c0.d.c("");
        }
        if (elements.length == 0) {
            return false;
        }
        e(this.f24933b + elements.length);
        long[] jArr = this.f24932a;
        int i11 = this.f24933b;
        if (i10 != i11) {
            C4202o.l(jArr, jArr, elements.length + i10, i10, i11);
        }
        C4202o.q(elements, jArr, i10, 0, 0, 12, null);
        this.f24933b += elements.length;
        return true;
    }

    public final void e(int i10) {
        long[] jArr = this.f24932a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            AbstractC4862t.d(jArrCopyOf, "copyOf(...)");
            this.f24932a = jArrCopyOf;
        }
    }

    public y(int i10) {
        super(i10, null);
    }

    public /* synthetic */ y(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
