package Y0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19575a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f19576a;

        public a(View view) {
            this.f19576a = view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f19577b;

        public b(View view) {
            super(view);
            this.f19577b = view;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
    }

    public A(View view) {
        this.f19575a = new b(view);
    }
}
