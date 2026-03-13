package nd;

import gc.C4179C;
import gc.C4204q;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: nd.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5166e {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<EnumC5166e> ALL;
    public static final Set<EnumC5166e> ALL_EXCEPT_ANNOTATIONS;
    public static final a Companion = new a(null);
    private final boolean includeByDefault;

    /* JADX INFO: renamed from: nd.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    static {
        EnumC5166e[] enumC5166eArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC5166e enumC5166e : enumC5166eArrValues) {
            if (enumC5166e.includeByDefault) {
                arrayList.add(enumC5166e);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = C4179C.Z0(arrayList);
        ALL = C4204q.b1(values());
    }

    EnumC5166e(boolean z10) {
        this.includeByDefault = z10;
    }
}
