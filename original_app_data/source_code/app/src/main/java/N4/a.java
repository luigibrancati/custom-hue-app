package N4;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(File location) throws IOException {
        AbstractC4862t.e(location, "location");
        if (location.exists() || location.mkdirs() || location.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + location);
    }
}
