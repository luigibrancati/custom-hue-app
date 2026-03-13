package i3;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: i3.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4351l {
    public static final ArrayList a(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
