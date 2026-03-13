package j1;

import android.content.Context;
import f1.AbstractC3985a;
import java.io.File;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: j1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4671c {
    public static final File a(Context context, String name) {
        AbstractC4862t.e(context, "<this>");
        AbstractC4862t.e(name, "name");
        return AbstractC3985a.a(context, name + ".preferences_pb");
    }
}
