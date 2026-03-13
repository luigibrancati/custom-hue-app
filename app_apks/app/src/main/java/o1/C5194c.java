package o1;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5194c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f41113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC5195d f41116e = AbstractC5195d.a();

    public int a(int i10) {
        return i10 + this.f41113b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f41115d) {
            return this.f41113b.getShort(this.f41114c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f41113b = byteBuffer;
        if (byteBuffer == null) {
            this.f41112a = 0;
            this.f41114c = 0;
            this.f41115d = 0;
        } else {
            this.f41112a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f41114c = i11;
            this.f41115d = this.f41113b.getShort(i11);
        }
    }

    public int d(int i10) {
        int i11 = i10 + this.f41112a;
        return i11 + this.f41113b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f41112a;
        return this.f41113b.getInt(i11 + this.f41113b.getInt(i11));
    }
}
