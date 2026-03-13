package Z9;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import v6.AbstractC6056k;
import v6.C6051f;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C6051f f20409c = new C6051f("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f20410a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20411b = -1;

    public void a(Y9.a aVar) {
        if (aVar.g() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f20410a.add(Long.valueOf(jElapsedRealtime));
        if (this.f20410a.size() > 5) {
            this.f20410a.removeFirst();
        }
        if (this.f20410a.size() != 5 || jElapsedRealtime - ((Long) AbstractC6056k.l((Long) this.f20410a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j10 = this.f20411b;
        if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f20411b = jElapsedRealtime;
            f20409c.g("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
