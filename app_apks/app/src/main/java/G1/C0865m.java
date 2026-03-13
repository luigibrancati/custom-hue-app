package G1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: G1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0865m implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4302a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4303b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f4304c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f4305d = Collections.EMPTY_LIST;

    public void c(Object obj) {
        synchronized (this.f4302a) {
            try {
                ArrayList arrayList = new ArrayList(this.f4305d);
                arrayList.add(obj);
                this.f4305d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f4303b.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f4304c);
                    hashSet.add(obj);
                    this.f4304c = Collections.unmodifiableSet(hashSet);
                }
                this.f4303b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int d(Object obj) {
        int iIntValue;
        synchronized (this.f4302a) {
            try {
                iIntValue = this.f4303b.containsKey(obj) ? ((Integer) this.f4303b.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public Set e() {
        Set set;
        synchronized (this.f4302a) {
            set = this.f4304c;
        }
        return set;
    }

    public void f(Object obj) {
        synchronized (this.f4302a) {
            try {
                Integer num = (Integer) this.f4303b.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f4305d);
                arrayList.remove(obj);
                this.f4305d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f4303b.remove(obj);
                    HashSet hashSet = new HashSet(this.f4304c);
                    hashSet.remove(obj);
                    this.f4304c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f4303b.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Iterator it;
        synchronized (this.f4302a) {
            it = this.f4305d.iterator();
        }
        return it;
    }
}
