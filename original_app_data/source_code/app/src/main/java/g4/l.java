package g4;

import android.os.Parcel;
import android.os.Parcelable;
import j4.AbstractC4689h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35464a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends l {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f35465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f35466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AbstractC4689h f35467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map f35468e;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC4862t.e(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                AbstractC4689h abstractC4689h = (AbstractC4689h) parcel.readParcelable(b.class.getClassLoader());
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new b(string, arrayListCreateStringArrayList, abstractC4689h, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String base, List transformations, AbstractC4689h abstractC4689h, Map parameters) {
            super(null);
            AbstractC4862t.e(base, "base");
            AbstractC4862t.e(transformations, "transformations");
            AbstractC4862t.e(parameters, "parameters");
            this.f35465b = base;
            this.f35466c = transformations;
            this.f35467d = abstractC4689h;
            this.f35468e = parameters;
        }

        public final AbstractC4689h a() {
            return this.f35467d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC4862t.a(this.f35465b, bVar.f35465b) && AbstractC4862t.a(this.f35466c, bVar.f35466c) && AbstractC4862t.a(this.f35467d, bVar.f35467d) && AbstractC4862t.a(this.f35468e, bVar.f35468e);
        }

        public int hashCode() {
            int iHashCode = ((this.f35465b.hashCode() * 31) + this.f35466c.hashCode()) * 31;
            AbstractC4689h abstractC4689h = this.f35467d;
            return ((iHashCode + (abstractC4689h == null ? 0 : abstractC4689h.hashCode())) * 31) + this.f35468e.hashCode();
        }

        public String toString() {
            return "Complex(base=" + this.f35465b + ", transformations=" + this.f35466c + ", size=" + this.f35467d + ", parameters=" + this.f35468e + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i10) {
            AbstractC4862t.e(out, "out");
            out.writeString(this.f35465b);
            out.writeStringList(this.f35466c);
            out.writeParcelable(this.f35467d, i10);
            Map map = this.f35468e;
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
    }

    public /* synthetic */ l(AbstractC4854k abstractC4854k) {
        this();
    }

    public l() {
    }
}
