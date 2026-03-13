package p9;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f42427a = new a0();

    @Override // p9.Z
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC4862t.d(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
