package ze;

import Fe.InterfaceC0844f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ze.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6562a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48900c;

    public C6562a(String sections, String ranges, String mappings) {
        AbstractC4862t.e(sections, "sections");
        AbstractC4862t.e(ranges, "ranges");
        AbstractC4862t.e(mappings, "mappings");
        this.f48898a = sections;
        this.f48899b = ranges;
        this.f48900c = mappings;
    }

    public final int a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & 127;
        int i15 = i12 - 1;
        while (true) {
            if (i11 > i15) {
                i13 = (-i11) - 1;
                break;
            }
            i13 = (i11 + i15) / 2;
            int iF = AbstractC4862t.f(i14, this.f48899b.charAt(i13 * 4));
            if (iF >= 0) {
                if (iF <= 0) {
                    break;
                }
                i11 = i13 + 1;
            } else {
                i15 = i13 - 1;
            }
        }
        return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
    }

    public final int b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f48898a.length() / 4) - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                i11 = (-i13) - 1;
                break;
            }
            i11 = (i13 + length) / 2;
            int iF = AbstractC4862t.f(i12, AbstractC6564c.a(this.f48898a, i11 * 4));
            if (iF >= 0) {
                if (iF <= 0) {
                    break;
                }
                i13 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
    }

    public final boolean c(int i10, InterfaceC0844f sink) {
        AbstractC4862t.e(sink, "sink");
        int iB = b(i10);
        int iA = a(i10, AbstractC6564c.a(this.f48898a, iB + 2), iB + 4 < this.f48898a.length() ? AbstractC6564c.a(this.f48898a, iB + 6) : this.f48899b.length() / 4);
        char cCharAt = this.f48899b.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iA2 = AbstractC6564c.a(this.f48899b, iA + 2);
            sink.W(this.f48900c, iA2, cCharAt + iA2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            sink.B(i10 - (this.f48899b.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.f48899b.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            sink.B(i10 + (this.f48899b.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.f48899b.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            return true;
        }
        if (cCharAt == 'x') {
            sink.B(i10);
            return true;
        }
        if (cCharAt == 'y') {
            sink.B(i10);
            return false;
        }
        if (cCharAt == 'z') {
            sink.writeByte(this.f48899b.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            sink.writeByte(this.f48899b.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            sink.writeByte(this.f48899b.charAt(iA + 2));
            sink.writeByte(this.f48899b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            sink.writeByte(this.f48899b.charAt(iA + 2) | 128);
            sink.writeByte(this.f48899b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            sink.writeByte(this.f48899b.charAt(iA + 2));
            sink.writeByte(this.f48899b.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            sink.writeByte(this.f48899b.charAt(iA + 2) | 128);
            sink.writeByte(this.f48899b.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
