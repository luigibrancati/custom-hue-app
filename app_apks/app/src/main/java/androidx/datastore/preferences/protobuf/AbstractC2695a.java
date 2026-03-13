package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2700f;
import androidx.datastore.preferences.protobuf.K;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2695a implements K {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class AbstractC0285a implements K.a {
        public static void e(Iterable iterable, List list) {
            AbstractC2714u.a(iterable);
            g(iterable, list);
        }

        public static void g(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static f0 j(K k10) {
            return new f0(k10);
        }

        @Override // 
        public abstract AbstractC0285a i();
    }

    public static void b(Iterable iterable, List list) {
        AbstractC0285a.e(iterable, list);
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public int d(Z z10) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iD = z10.d(this);
        g(iD);
        return iD;
    }

    public final String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public f0 f() {
        return new f0(this);
    }

    public void g(int i10) {
        throw new UnsupportedOperationException();
    }

    public void h(OutputStream outputStream) {
        AbstractC2703i abstractC2703iB0 = AbstractC2703i.b0(outputStream, AbstractC2703i.F(getSerializedSize()));
        a(abstractC2703iB0);
        abstractC2703iB0.Y();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public AbstractC2700f toByteString() {
        try {
            AbstractC2700f.h hVarS = AbstractC2700f.s(getSerializedSize());
            a(hVarS.b());
            return hVarS.a();
        } catch (IOException e10) {
            throw new RuntimeException(this.e("ByteString"), e10);
        }
    }
}
