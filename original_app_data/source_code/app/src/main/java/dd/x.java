package dd;

import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface x {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33463a = new a();

        @Override // dd.x
        public List a(String packageFqName) {
            AbstractC4862t.e(packageFqName, "packageFqName");
            return C4206t.k();
        }
    }

    List a(String str);
}
