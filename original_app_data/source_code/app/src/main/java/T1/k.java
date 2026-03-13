package T1;

import G1.AbstractC0853a;
import T1.k;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f15944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f15946c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        public a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return k.this.f15945b.a(bundle);
        }
    }

    public k() {
        this(b.f15948a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f15946c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC0853a.g(this.f15944a.add(mediaCodec));
        }
    }

    public void c() {
        this.f15944a.clear();
        LoudnessCodecController loudnessCodecController = this.f15946c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f15944a.remove(mediaCodec) || (loudnessCodecController = this.f15946c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f15946c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f15946c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, O7.f.a(), new a());
        this.f15946c = loudnessCodecControllerCreate;
        Iterator it = this.f15944a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public k(b bVar) {
        this.f15944a = new HashSet();
        this.f15945b = bVar;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15948a = new b() { // from class: T1.l
            @Override // T1.k.b
            public final Bundle a(Bundle bundle) {
                return k.b.b(bundle);
            }
        };

        Bundle a(Bundle bundle);

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }
    }
}
