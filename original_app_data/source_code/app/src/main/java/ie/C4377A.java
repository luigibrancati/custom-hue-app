package ie;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ie.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4377A implements InterfaceC4393o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f37463a = C4383e.f37527c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37464b;

    @Override // ie.InterfaceC4393o
    public void a(char c10) {
        e(1);
        char[] cArr = this.f37463a;
        int i10 = this.f37464b;
        this.f37464b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // ie.InterfaceC4393o
    public void b(String text) {
        AbstractC4862t.e(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f37463a;
        int i10 = this.f37464b;
        int i11 = i10 + 1;
        cArr[i10] = JsonFactory.DEFAULT_QUOTE_CHAR;
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < M.a().length && M.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.f37464b = i12 + 1;
    }

    @Override // ie.InterfaceC4393o
    public void c(String text) {
        AbstractC4862t.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f37463a, this.f37464b);
        this.f37464b += length;
    }

    public final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= M.a().length || (b10 = M.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f37463a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = M.b()[cCharAt];
                    AbstractC4862t.b(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f37463a, iF2);
                    i11 = iF2 + str2.length();
                    this.f37464b = i11;
                } else {
                    char[] cArr = this.f37463a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                    this.f37464b = i11;
                }
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f37463a[iF3] = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.f37464b = iF3 + 1;
    }

    public final void e(int i10) {
        f(this.f37464b, i10);
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f37463a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, Bc.k.e(i12, i10 * 2));
            AbstractC4862t.d(cArrCopyOf, "copyOf(...)");
            this.f37463a = cArrCopyOf;
        }
        return i10;
    }

    public void g() {
        C4383e.f37527c.c(this.f37463a);
    }

    public String toString() {
        return new String(this.f37463a, 0, this.f37464b);
    }

    @Override // ie.InterfaceC4393o
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
