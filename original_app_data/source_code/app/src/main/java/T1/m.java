package T1;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f15949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f15950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final D1.o f15951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f15952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f15953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final k f15954f;

        public a(p pVar, MediaFormat mediaFormat, D1.o oVar, Surface surface, MediaCrypto mediaCrypto, k kVar) {
            this.f15949a = pVar;
            this.f15950b = mediaFormat;
            this.f15951c = oVar;
            this.f15952d = surface;
            this.f15953e = mediaCrypto;
            this.f15954f = kVar;
        }

        public static a a(p pVar, MediaFormat mediaFormat, D1.o oVar, MediaCrypto mediaCrypto, k kVar) {
            return new a(pVar, mediaFormat, oVar, null, mediaCrypto, kVar);
        }

        public static a b(p pVar, MediaFormat mediaFormat, D1.o oVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, oVar, surface, mediaCrypto, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15955a = new j();

        static b a(Context context) {
            return new j(context);
        }

        m b(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void a(m mVar, long j10, long j11);
    }

    void a(int i10, int i11, J1.c cVar, long j10, int i12);

    void b();

    default boolean c(c cVar) {
        return false;
    }

    void d(d dVar, Handler handler);

    void e(int i10);

    void f(Surface surface);

    void flush();

    boolean g();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(int i10, long j10);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);
}
