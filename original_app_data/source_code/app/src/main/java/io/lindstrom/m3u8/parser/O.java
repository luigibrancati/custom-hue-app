package io.lindstrom.m3u8.parser;

import Db.P;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class O implements InterfaceC4574d {
    public static final O SKIPPED_SEGMENTS = new a("SKIPPED_SEGMENTS", 0);
    public static final O RECENTLY_REMOVED_DATERANGES = new O("RECENTLY_REMOVED_DATERANGES", 1) { // from class: io.lindstrom.m3u8.parser.O.b
        {
            a aVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(P.a aVar, String str) {
            aVar.h(AbstractC4588s.e(str, "\t"));
        }
    };
    private static final /* synthetic */ O[] $VALUES = j();
    static final Map<String, O> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.N
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((O) obj).key();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a extends O {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(P.a aVar, String str) {
            aVar.i(Long.parseLong(str));
        }
    }

    public O(String str, int i10) {
    }

    public static /* synthetic */ O[] j() {
        return new O[]{SKIPPED_SEGMENTS, RECENTLY_REMOVED_DATERANGES};
    }

    public static Db.P p(String str, C4589t c4589t) throws y {
        P.a aVarBuilder = Db.P.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.e();
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }

    public /* synthetic */ O(String str, int i10, a aVar) {
        this(str, i10);
    }
}
