package T1;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15891a;

    public C(MediaCodec mediaCodec) {
        this.f15891a = mediaCodec;
    }

    @Override // T1.n
    public void a(int i10, int i11, J1.c cVar, long j10, int i12) {
        this.f15891a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // T1.n
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f15891a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // T1.n
    public void setParameters(Bundle bundle) {
        this.f15891a.setParameters(bundle);
    }

    @Override // T1.n
    public void b() {
    }

    @Override // T1.n
    public void flush() {
    }

    @Override // T1.n
    public void shutdown() {
    }

    @Override // T1.n
    public void start() {
    }
}
