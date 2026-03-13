package I;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends G.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f5386i = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f5388h = b.IMAGE_FORMAT;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public d(int i10) {
        this.f5387g = i10;
    }

    @Override // G.b
    public b c() {
        return this.f5388h;
    }

    public final int f() {
        return this.f5387g;
    }

    public final String g() {
        int i10 = this.f5387g;
        if (i10 == 0) {
            return "JPEG";
        }
        if (i10 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + this.f5387g + ')';
    }

    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + g() + ')';
    }
}
