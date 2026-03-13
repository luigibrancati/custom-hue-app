package sc;

import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class k extends j {
    public static final g j(File file, h direction) {
        AbstractC4862t.e(file, "<this>");
        AbstractC4862t.e(direction, "direction");
        return new g(file, direction);
    }

    public static final g k(File file) {
        AbstractC4862t.e(file, "<this>");
        return j(file, h.BOTTOM_UP);
    }
}
