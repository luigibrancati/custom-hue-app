package g1;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: g1.X, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4088X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34880a = a.f34881a;

    /* JADX INFO: renamed from: g1.X$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f34881a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NativeSharedCounter f34882b;

        static {
            System.loadLibrary("datastore_shared_counter");
            f34882b = new NativeSharedCounter();
        }

        public final InterfaceC4088X a(InterfaceC6082a produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            AbstractC4862t.e(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                try {
                    AbstractC4862t.b(parcelFileDescriptorOpen);
                    InterfaceC4088X interfaceC4088XB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return interfaceC4088XB;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public final InterfaceC4088X b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            NativeSharedCounter nativeSharedCounter = f34882b;
            if (nativeSharedCounter == null) {
                throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
            }
            int fd2 = parcelFileDescriptor.getFd();
            if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new b(nativeSharedCounter, jNativeCreateSharedCounter);
            }
            throw new IOException("Failed to mmap counter file");
        }
    }

    /* JADX INFO: renamed from: g1.X$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC4088X {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NativeSharedCounter f34883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f34884c;

        public b(NativeSharedCounter nativeSharedCounter, long j10) {
            AbstractC4862t.e(nativeSharedCounter, "nativeSharedCounter");
            this.f34883b = nativeSharedCounter;
            this.f34884c = j10;
        }

        @Override // g1.InterfaceC4088X
        public int a() {
            return this.f34883b.nativeIncrementAndGetCounterValue(this.f34884c);
        }

        @Override // g1.InterfaceC4088X
        public int getValue() {
            return this.f34883b.nativeGetCounterValue(this.f34884c);
        }
    }

    int a();

    int getValue();
}
