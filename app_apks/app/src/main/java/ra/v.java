package ra;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class v implements ua.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f43903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f43905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f43906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f43909h;

    public v(List list, List list2, SparseArray sparseArray, Map map, int i10, int i11, String str, byte[] bArr) {
        this.f43903b = list;
        this.f43904c = list2;
        this.f43905d = sparseArray;
        this.f43906e = map;
        this.f43908g = str;
        this.f43902a = i10;
        this.f43907f = i11;
        this.f43909h = bArr;
    }

    @Override // ua.e
    public String a() {
        return this.f43908g;
    }

    @Override // ua.e
    public byte[] b(int i10) {
        return (byte[]) this.f43905d.get(i10);
    }

    @Override // ua.e
    public SparseArray c() {
        return this.f43905d;
    }

    @Override // ua.e
    public List d() {
        return this.f43903b;
    }

    @Override // ua.e
    public Map e() {
        return this.f43906e;
    }

    @Override // ua.e
    public byte[] f() {
        return this.f43909h;
    }

    @Override // ua.e
    public List g() {
        return this.f43904c;
    }

    @Override // ua.e
    public byte[] h(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return (byte[]) this.f43906e.get(parcelUuid);
    }
}
