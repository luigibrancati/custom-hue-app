package F2;

import G1.AbstractC0853a;
import G1.AbstractC0859g;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, i10, i11);
        parcelObtain.setDataPosition(0);
        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
        parcelObtain.recycle();
        return new e(AbstractC0859g.a(new J7.f() { // from class: F2.a
            @Override // J7.f
            public final Object apply(Object obj) {
                return F1.a.b((Bundle) obj);
            }
        }, (ArrayList) AbstractC0853a.e(bundle.getParcelableArrayList("c"))), j10, bundle.getLong("d"));
    }
}
