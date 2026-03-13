package g1;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g1.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4108r extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4108r(Exception ex) {
        super(ex);
        AbstractC4862t.e(ex, "ex");
        this.f35088a = "Encountered a [" + ex.getMessage() + "]. If you are trying to use DataStore during direct boot, this exception likely indicates that your DataStore file is not located in the Device Encrypted Storage and therefore is not available for write access during direct boot mode. DataStore to be used during direct boot must be initialized using `DataStoreFactory.createInDeviceProtectedStorage()`.";
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f35088a;
    }
}
