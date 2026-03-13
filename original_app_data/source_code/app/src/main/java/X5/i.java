package X5;

import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18135a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileChannel f18136b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f18136b = new FileInputStream(file).getChannel();
    }

    public final long a(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e eVarB = dVar.b(j12);
            if (eVarB.f18128a == 1) {
                long j13 = eVarB.f18130c;
                if (j13 <= j11 && j11 <= eVarB.f18131d + j13) {
                    return (j11 - j13) + eVarB.f18129b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d b() throws IOException {
        this.f18136b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (j(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sF = f(byteBufferAllocate, 4L);
        boolean z10 = f(byteBufferAllocate, 5L) == 2;
        if (sF == 1) {
            return new g(z10, this);
        }
        if (sF == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List c() throws IOException {
        long j10;
        long j11;
        this.f18136b.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarB = b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarB.f18119a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVarB.f18124f;
        int i10 = 0;
        if (j12 == 65535) {
            j12 = dVarB.c(0).f18132a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            e eVarB = dVarB.b(j13);
            if (eVarB.f18128a == 2) {
                j11 = eVarB.f18129b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c cVarA = dVarB.a(j11, i10);
            long j15 = j10;
            long j16 = cVarA.f18117a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(cVarA.f18118b));
            } else if (j16 == 5) {
                j14 = cVarA.f18118b;
            }
            i10++;
            if (cVarA.f18117a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarB, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(i(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18136b.close();
    }

    public void d(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f18136b.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & ForkServer.ERROR);
    }

    public int g(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long h(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    public String i(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sF = f(byteBuffer, j10);
            if (sF == 0) {
                return sb2.toString();
            }
            sb2.append((char) sF);
            j10 = j11;
        }
    }

    public long j(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & KeyboardMap.kValueMask;
    }
}
