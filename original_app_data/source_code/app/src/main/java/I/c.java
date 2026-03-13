package I;

import android.util.Range;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends G.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f5381j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Range f5382k = new Range(30, 30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f5385i = b.FPS_RANGE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c(int i10, int i11) {
        this.f5383g = i10;
        this.f5384h = i11;
    }

    @Override // G.b
    public b c() {
        return this.f5385i;
    }

    public final int f() {
        return this.f5384h;
    }

    public final int g() {
        return this.f5383g;
    }

    public String toString() {
        return "FpsRangeFeature(minFps=" + this.f5383g + ", maxFps=" + this.f5384h + ')';
    }
}
