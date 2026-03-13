package z0;

import io.flutter.embedding.android.KeyboardMap;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: z0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6495i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48686a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f48687b = b(0);

    /* JADX INFO: renamed from: z0.i$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final long a() {
            return AbstractC6495i.f48687b;
        }

        public a() {
        }
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final int d(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static long b(long j10) {
        return j10;
    }
}
