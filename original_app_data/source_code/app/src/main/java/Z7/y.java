package Z7;

import g8.C4160a;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4160a f20395a = C4160a.a(new byte[0]);

    public static final C4160a a(int i10) {
        return C4160a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final C4160a b(int i10) {
        return C4160a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
