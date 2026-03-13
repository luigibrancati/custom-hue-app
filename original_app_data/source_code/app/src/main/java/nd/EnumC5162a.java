package nd;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: renamed from: nd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC5162a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);

    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    EnumC5162a(boolean z10, boolean z11) {
        this.includeAnnotationArguments = z10;
        this.includeEmptyAnnotationArguments = z11;
    }

    public final boolean b() {
        return this.includeAnnotationArguments;
    }

    public final boolean j() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ EnumC5162a(boolean z10, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
