package Oa;

import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12102a;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // Oa.c
        public String a() {
            return this.f12102a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && AbstractC4862t.a(a(), ((a) obj).a());
            }
            return true;
        }

        public int hashCode() {
            String strA = a();
            if (strA != null) {
                return strA.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "BluetoothHeadset(name=" + a() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name) {
            super(null);
            AbstractC4862t.e(name, "name");
            this.f12102a = name;
        }

        public /* synthetic */ a(String str, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? "Bluetooth" : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12103a;

        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // Oa.c
        public String a() {
            return this.f12103a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && AbstractC4862t.a(a(), ((b) obj).a());
            }
            return true;
        }

        public int hashCode() {
            String strA = a();
            if (strA != null) {
                return strA.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Earpiece(name=" + a() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name) {
            super(null);
            AbstractC4862t.e(name, "name");
            this.f12103a = name;
        }

        public /* synthetic */ b(String str, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? "Earpiece" : str);
        }
    }

    /* JADX INFO: renamed from: Oa.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0158c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12104a;

        public C0158c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // Oa.c
        public String a() {
            return this.f12104a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0158c) && AbstractC4862t.a(a(), ((C0158c) obj).a());
            }
            return true;
        }

        public int hashCode() {
            String strA = a();
            if (strA != null) {
                return strA.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Speakerphone(name=" + a() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0158c(String name) {
            super(null);
            AbstractC4862t.e(name, "name");
            this.f12104a = name;
        }

        public /* synthetic */ C0158c(String str, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? "Speakerphone" : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12105a;

        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // Oa.c
        public String a() {
            return this.f12105a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && AbstractC4862t.a(a(), ((d) obj).a());
            }
            return true;
        }

        public int hashCode() {
            String strA = a();
            if (strA != null) {
                return strA.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WiredHeadset(name=" + a() + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String name) {
            super(null);
            AbstractC4862t.e(name, "name");
            this.f12105a = name;
        }

        public /* synthetic */ d(String str, int i10, AbstractC4854k abstractC4854k) {
            this((i10 & 1) != 0 ? "Wired Headset" : str);
        }
    }

    public c() {
    }

    public abstract String a();

    public /* synthetic */ c(AbstractC4854k abstractC4854k) {
        this();
    }
}
