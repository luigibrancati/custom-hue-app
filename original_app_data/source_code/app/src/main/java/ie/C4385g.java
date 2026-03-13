package ie;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: renamed from: ie.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4385g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4385g f37530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f37531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f37532c;

    static {
        C4385g c4385g = new C4385g();
        f37530a = c4385g;
        f37531b = new char[117];
        f37532c = new byte[126];
        c4385g.f();
        c4385g.e();
    }

    public final void a(char c10, char c11) {
        b(c10, c11);
    }

    public final void b(int i10, char c10) {
        if (c10 != 'u') {
            f37531b[c10] = (char) i10;
        }
    }

    public final void c(char c10, byte b10) {
        d(c10, b10);
    }

    public final void d(int i10, byte b10) {
        f37532c[i10] = b10;
    }

    public final void e() {
        for (int i10 = 0; i10 < 33; i10++) {
            d(i10, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c(JsonFactory.DEFAULT_QUOTE_CHAR, (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i10 = 0; i10 < 32; i10++) {
            b(i10, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a(JsonPointer.SEPARATOR, JsonPointer.SEPARATOR);
        a(JsonFactory.DEFAULT_QUOTE_CHAR, JsonFactory.DEFAULT_QUOTE_CHAR);
        a('\\', '\\');
    }
}
