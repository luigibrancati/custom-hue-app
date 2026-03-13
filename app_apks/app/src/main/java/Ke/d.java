package Ke;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final OpenOption[] f7868j = Le.b.f8802j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7869b = 8192;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7870c = 8192;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7871d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Charset f7872e = Charset.defaultCharset();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Charset f7873f = Charset.defaultCharset();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OpenOption[] f7874g = f7868j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IntUnaryOperator f7875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IntUnaryOperator f7876i;

    public d() {
        IntUnaryOperator intUnaryOperator = new IntUnaryOperator() { // from class: Ke.c
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i10) {
                return d.f(this.f7867a, i10);
            }
        };
        this.f7875h = intUnaryOperator;
        this.f7876i = intUnaryOperator;
    }

    public static /* synthetic */ int f(d dVar, int i10) {
        int i11 = dVar.f7871d;
        return i10 > i11 ? dVar.j(i10, i11) : i10;
    }

    public int g() {
        return this.f7869b;
    }

    public InputStream h() {
        return b().d(i());
    }

    public OpenOption[] i() {
        return this.f7874g;
    }

    public final int j(int i10, int i11) {
        throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i10), Integer.valueOf(i11)));
    }
}
