package P;

import L.B;
import L.G;
import L.I;
import android.util.Range;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12527a = b.f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f12528b = new a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements m {
        @Override // P.m
        public l b(int i10, I cameraInfoInternal, List newUseCases, List attachedUseCases, B cameraConfig, int i11, Range targetFrameRate, boolean z10, boolean z11) {
            AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
            AbstractC4862t.e(newUseCases, "newUseCases");
            AbstractC4862t.e(attachedUseCases, "attachedUseCases");
            AbstractC4862t.e(cameraConfig, "cameraConfig");
            AbstractC4862t.e(targetFrameRate, "targetFrameRate");
            return new l(null, 0, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f12529a = new b();
    }

    default void a(G cameraDeviceSurfaceManager) {
        AbstractC4862t.e(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
    }

    l b(int i10, I i11, List list, List list2, B b10, int i12, Range range, boolean z10, boolean z11);
}
