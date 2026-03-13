package io.lindstrom.m3u8.parser;

import Db.L;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class K implements InterfaceC4574d {
    public static final K CAN_SKIP_UNTIL = new a("CAN_SKIP_UNTIL", 0);
    public static final K CAN_SKIP_DATERANGES = new K("CAN_SKIP_DATERANGES", 1) { // from class: io.lindstrom.m3u8.parser.K.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(L.a aVar, String str) {
            aVar.j(AbstractC4588s.g(str));
        }
    };
    public static final K HOLD_BACK = new K("HOLD_BACK", 2) { // from class: io.lindstrom.m3u8.parser.K.c
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(L.a aVar, String str) {
            aVar.l(Double.parseDouble(str));
        }
    };
    public static final K PART_HOLD_BACK = new K("PART_HOLD_BACK", 3) { // from class: io.lindstrom.m3u8.parser.K.d
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(L.a aVar, String str) {
            aVar.m(Double.parseDouble(str));
        }
    };
    public static final K CAN_BLOCK_RELOAD = new K("CAN_BLOCK_RELOAD", 4) { // from class: io.lindstrom.m3u8.parser.K.e
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(L.a aVar, String str) {
            aVar.h(AbstractC4588s.g(str));
        }
    };
    private static final /* synthetic */ K[] $VALUES = j();
    static final Map<String, K> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.J
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((K) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends K {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(L.a aVar, String str) {
            aVar.k(Double.parseDouble(str));
        }
    }

    public K(String str, int i10) {
    }

    public static /* synthetic */ K[] j() {
        return new K[]{CAN_SKIP_UNTIL, CAN_SKIP_DATERANGES, HOLD_BACK, PART_HOLD_BACK, CAN_BLOCK_RELOAD};
    }

    public static Db.L p(String str, C4589t c4589t) throws y {
        L.a aVarBuilder = Db.L.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.g();
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) $VALUES.clone();
    }

    public /* synthetic */ K(String str, int i10, a aVar) {
        this(str, i10);
    }
}
