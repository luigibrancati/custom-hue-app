package Q4;

import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import vc.InterfaceC6082a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Q4.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LQ4/i;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "applicationDocuments", "temporary", "applicationSupport", "applicationLibrary", "root", "background_downloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnumC1889i {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC1889i[] $VALUES;
    private static final InterfaceC4028k $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumC1889i applicationDocuments = new EnumC1889i("applicationDocuments", 0);
    public static final EnumC1889i temporary = new EnumC1889i("temporary", 1);
    public static final EnumC1889i applicationSupport = new EnumC1889i("applicationSupport", 2);
    public static final EnumC1889i applicationLibrary = new EnumC1889i("applicationLibrary", 3);
    public static final EnumC1889i root = new EnumC1889i("root", 4);

    /* JADX INFO: renamed from: Q4.i$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Companion {
        public Companion() {
        }

        public final /* synthetic */ ce.b a() {
            return (ce.b) EnumC1889i.$cachedSerializer$delegate.getValue();
        }

        public final ce.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }
    }

    static {
        EnumC1889i[] enumC1889iArrB = b();
        $VALUES = enumC1889iArrB;
        $ENTRIES = AbstractC5277b.a(enumC1889iArrB);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = C4029l.a(EnumC4031n.PUBLICATION, new InterfaceC6082a() { // from class: Q4.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return EnumC1889i.j();
            }
        });
    }

    public EnumC1889i(String str, int i10) {
    }

    public static final /* synthetic */ EnumC1889i[] b() {
        return new EnumC1889i[]{applicationDocuments, temporary, applicationSupport, applicationLibrary, root};
    }

    public static final /* synthetic */ ce.b j() {
        return new C1892l();
    }

    public static InterfaceC5276a q() {
        return $ENTRIES;
    }

    public static EnumC1889i valueOf(String str) {
        return (EnumC1889i) Enum.valueOf(EnumC1889i.class, str);
    }

    public static EnumC1889i[] values() {
        return (EnumC1889i[]) $VALUES.clone();
    }
}
