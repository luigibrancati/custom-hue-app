package J1;

import D1.o;
import D1.s;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f extends J1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f5876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f5878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f5881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5883i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends IllegalStateException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5885b;

        public a(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f5884a = i10;
            this.f5885b = i11;
        }
    }

    static {
        s.a("media3.decoder");
    }

    public f(int i10) {
        this(i10, 0);
    }

    public static f G() {
        return new f(0);
    }

    public final ByteBuffer C(int i10) {
        int i11 = this.f5882h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f5878d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public void D(int i10) {
        int i11 = i10 + this.f5883i;
        ByteBuffer byteBuffer = this.f5878d;
        if (byteBuffer == null) {
            this.f5878d = C(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f5878d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferC = C(i12);
        byteBufferC.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferC.put(byteBuffer);
        }
        this.f5878d = byteBufferC;
    }

    public final void E() {
        ByteBuffer byteBuffer = this.f5878d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f5881g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean F() {
        return u(1073741824);
    }

    public void H(int i10) {
        ByteBuffer byteBuffer = this.f5881g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f5881g = ByteBuffer.allocate(i10);
        } else {
            this.f5881g.clear();
        }
    }

    @Override // J1.a
    public void s() {
        super.s();
        ByteBuffer byteBuffer = this.f5878d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f5881g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f5879e = false;
    }

    public f(int i10, int i11) {
        this.f5877c = new c();
        this.f5882h = i10;
        this.f5883i = i11;
    }
}
