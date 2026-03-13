package Y0;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f19673a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScrollFeedbackProvider f19674a;

        public b(View view) {
            this.f19674a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // Y0.z.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f19674a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // Y0.z.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f19674a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    public z(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f19673a = new b(view);
        } else {
            this.f19673a = new c();
        }
    }

    public static z a(View view) {
        return new z(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f19673a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f19673a.onScrollProgress(i10, i11, i12, i13);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c implements d {
        public c() {
        }

        @Override // Y0.z.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // Y0.z.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }
}
