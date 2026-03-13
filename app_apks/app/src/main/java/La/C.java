package La;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8617b;

    public C(String str, List list) {
        this.f8616a = str;
        this.f8617b = list == null ? new ArrayList() : list;
    }

    public static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            bArr[i10] = (byte) ((Integer) list.get(i10)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        List list = this.f8617b;
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object objF = f(this.f8617b.get(i10));
                int i11 = i10 + 1;
                if (objF == null) {
                    sQLiteProgram.bindNull(i11);
                } else if (objF instanceof byte[]) {
                    sQLiteProgram.bindBlob(i11, (byte[]) objF);
                } else if (objF instanceof Double) {
                    sQLiteProgram.bindDouble(i11, ((Double) objF).doubleValue());
                } else if (objF instanceof Integer) {
                    sQLiteProgram.bindLong(i11, ((Integer) objF).intValue());
                } else if (objF instanceof Long) {
                    sQLiteProgram.bindLong(i11, ((Long) objF).longValue());
                } else if (objF instanceof String) {
                    sQLiteProgram.bindString(i11, (String) objF);
                } else {
                    if (!(objF instanceof Boolean)) {
                        throw new IllegalArgumentException("Could not bind " + objF + " from index " + i10 + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i11, ((Boolean) objF).booleanValue() ? 1L : 0L);
                }
                i10 = i11;
            }
        }
    }

    public List b() {
        return this.f8617b;
    }

    public String c() {
        return this.f8616a;
    }

    public Object[] d() {
        return e(this.f8617b);
    }

    public final Object[] e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        String str = this.f8616a;
        if (str != null) {
            if (!str.equals(c10.f8616a)) {
                return false;
            }
        } else if (c10.f8616a != null) {
            return false;
        }
        if (this.f8617b.size() != c10.f8617b.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f8617b.size(); i10++) {
            if ((this.f8617b.get(i10) instanceof byte[]) && (c10.f8617b.get(i10) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f8617b.get(i10), (byte[]) c10.f8617b.get(i10))) {
                    return false;
                }
            } else if (!this.f8617b.get(i10).equals(c10.f8617b.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f8616a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8616a);
        List list = this.f8617b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = StringUtils.SPACE + this.f8617b;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
