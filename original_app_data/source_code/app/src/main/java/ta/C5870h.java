package ta;

import android.util.Pair;
import java.util.UUID;

/* JADX INFO: renamed from: ta.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5870h extends Pair {
    public C5870h(UUID uuid, Integer num) {
        super(uuid, num);
    }

    @Override // android.util.Pair
    public String toString() {
        return "CharacteristicNotificationId{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + '}';
    }
}
