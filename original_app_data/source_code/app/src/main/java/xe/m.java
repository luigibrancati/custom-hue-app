package xe;

import Fe.InterfaceC0845g;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48300a = a.f48302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f48301b = new a.C0670a();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f48302a = new a();

        /* JADX INFO: renamed from: xe.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0670a implements m {
            @Override // xe.m
            public boolean a(int i10, InterfaceC0845g source, int i11, boolean z10) {
                AbstractC4862t.e(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // xe.m
            public void b(int i10, b errorCode) {
                AbstractC4862t.e(errorCode, "errorCode");
            }

            @Override // xe.m
            public boolean c(int i10, List requestHeaders) {
                AbstractC4862t.e(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // xe.m
            public boolean d(int i10, List responseHeaders, boolean z10) {
                AbstractC4862t.e(responseHeaders, "responseHeaders");
                return true;
            }
        }
    }

    boolean a(int i10, InterfaceC0845g interfaceC0845g, int i11, boolean z10);

    void b(int i10, b bVar);

    boolean c(int i10, List list);

    boolean d(int i10, List list, boolean z10);
}
