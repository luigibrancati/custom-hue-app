package ta;

import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: ta.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5869g extends C5870h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f44853a;

    public C5869g(UUID uuid, Integer num, byte[] bArr) {
        super(uuid, num);
        this.f44853a = bArr;
    }

    @Override // android.util.Pair
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5869g)) {
            return (obj instanceof C5870h) && super.equals(obj);
        }
        if (super.equals(obj)) {
            return Arrays.equals(this.f44853a, ((C5869g) obj).f44853a);
        }
        return false;
    }

    @Override // android.util.Pair
    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f44853a);
    }

    @Override // ta.C5870h, android.util.Pair
    public String toString() {
        return "CharacteristicChangedEvent{UUID=" + ((UUID) ((Pair) this).first).toString() + ", instanceId=" + ((Integer) ((Pair) this).second).toString() + ", data=" + Arrays.toString(this.f44853a) + '}';
    }
}
