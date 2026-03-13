package Q1;

import G1.AbstractC0853a;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13343a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends LinkedHashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f13344a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f13344a = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f13344a;
        }
    }

    public e(int i10) {
        this.f13343a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f13343a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f13343a.put((Uri) AbstractC0853a.e(uri), (byte[]) AbstractC0853a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f13343a.remove(AbstractC0853a.e(uri));
    }
}
