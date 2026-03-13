package n1;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o1.C5193b;

/* JADX INFO: renamed from: n1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5077h {

    /* JADX INFO: renamed from: n1.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f40504a;

        public a(ByteBuffer byteBuffer) {
            this.f40504a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // n1.AbstractC5077h.c
        public void a(int i10) {
            ByteBuffer byteBuffer = this.f40504a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // n1.AbstractC5077h.c
        public int b() {
            return this.f40504a.getInt();
        }

        @Override // n1.AbstractC5077h.c
        public long c() {
            return AbstractC5077h.c(this.f40504a.getInt());
        }

        @Override // n1.AbstractC5077h.c
        public long getPosition() {
            return this.f40504a.position();
        }

        @Override // n1.AbstractC5077h.c
        public int readUnsignedShort() {
            return AbstractC5077h.d(this.f40504a.getShort());
        }
    }

    /* JADX INFO: renamed from: n1.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40506b;

        public b(long j10, long j11) {
            this.f40505a = j10;
            this.f40506b = j11;
        }

        public long a() {
            return this.f40505a;
        }
    }

    /* JADX INFO: renamed from: n1.h$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(int i10);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    public static b a(c cVar) throws IOException {
        long jC;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iB = cVar.b();
            cVar.a(4);
            jC = cVar.c();
            cVar.a(4);
            if (1835365473 == iB) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            cVar.a((int) (jC - cVar.getPosition()));
            cVar.a(12);
            long jC2 = cVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iB2 = cVar.b();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static C5193b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return C5193b.h(byteBufferDuplicate);
    }

    public static long c(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    public static int d(short s10) {
        return s10 & 65535;
    }
}
