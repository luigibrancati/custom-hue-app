package b0;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f24932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24933b;

    public /* synthetic */ o(int i10, AbstractC4854k abstractC4854k) {
        this(i10);
    }

    public static /* synthetic */ String b(o oVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return oVar.a(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final String a(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f24932a;
        int i11 = this.f24933b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(j10);
            i12++;
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            int i10 = oVar.f24933b;
            int i11 = this.f24933b;
            if (i10 == i11) {
                long[] jArr = this.f24932a;
                long[] jArr2 = oVar.f24932a;
                Bc.f fVarP = Bc.k.p(0, i11);
                int iC = fVarP.c();
                int iD = fVarP.d();
                if (iC > iD) {
                    return true;
                }
                while (jArr[iC] == jArr2[iC]) {
                    if (iC == iD) {
                        return true;
                    }
                    iC++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        long[] jArr = this.f24932a;
        int i10 = this.f24933b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return b(this, null, "[", "]", 0, null, 25, null);
    }

    public o(int i10) {
        this.f24932a = i10 == 0 ? q.a() : new long[i10];
    }
}
