package Od;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: Od.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C1828h implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f12440f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f12441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12445e;

    /* JADX INFO: renamed from: Od.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public C1828h(CharSequence string) {
        AbstractC4862t.e(string, "string");
        this.f12441a = string;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12442b = 0;
        int i10 = this.f12444d;
        int i11 = this.f12443c;
        this.f12443c = this.f12445e + i10;
        return this.f12441a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f12442b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f12445e < 0) {
            this.f12442b = 2;
            return false;
        }
        int length = this.f12441a.length();
        int length2 = this.f12441a.length();
        for (int i13 = this.f12443c; i13 < length2; i13++) {
            char cCharAt = this.f12441a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f12441a.length() && this.f12441a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f12442b = 1;
                this.f12445e = i10;
                this.f12444d = length;
                return true;
            }
        }
        i10 = -1;
        this.f12442b = 1;
        this.f12445e = i10;
        this.f12444d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
