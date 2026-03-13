package io.lindstrom.m3u8.parser;

import Db.InterfaceC0760g;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4576f implements InterfaceC4574d {
    public static final EnumC4576f ID = new c("ID", 0);
    public static final EnumC4576f CLASS = new EnumC4576f("CLASS", 1) { // from class: io.lindstrom.m3u8.parser.f.d
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.o(str);
        }
    };
    public static final EnumC4576f START_DATE = new EnumC4576f("START_DATE", 2) { // from class: io.lindstrom.m3u8.parser.f.e
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.B(OffsetDateTime.parse(str, AbstractC4588s.f38395a));
        }
    };
    public static final EnumC4576f END_DATE = new EnumC4576f("END_DATE", 3) { // from class: io.lindstrom.m3u8.parser.f.f
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.r(OffsetDateTime.parse(str, AbstractC4588s.f38395a));
        }
    };
    public static final EnumC4576f DURATION = new EnumC4576f("DURATION", 4) { // from class: io.lindstrom.m3u8.parser.f.g
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.q(Double.parseDouble(str));
        }
    };
    public static final EnumC4576f PLANNED_DURATION = new EnumC4576f("PLANNED_DURATION", 5) { // from class: io.lindstrom.m3u8.parser.f.h
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.w(Double.parseDouble(str));
        }
    };
    public static final EnumC4576f SCTE35_CMD = new EnumC4576f("SCTE35_CMD", 6) { // from class: io.lindstrom.m3u8.parser.f.i
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.y(str);
        }
    };
    public static final EnumC4576f SCTE35_OUT = new EnumC4576f("SCTE35_OUT", 7) { // from class: io.lindstrom.m3u8.parser.f.j
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.A(str);
        }
    };
    public static final EnumC4576f SCTE35_IN = new EnumC4576f("SCTE35_IN", 8) { // from class: io.lindstrom.m3u8.parser.f.k
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.z(str);
        }
    };
    public static final EnumC4576f END_ON_NEXT = new EnumC4576f("END_ON_NEXT", 9) { // from class: io.lindstrom.m3u8.parser.f.a
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.s(AbstractC4588s.g(str));
        }
    };
    public static final EnumC4576f CLIENT_ATTRIBUTE = new EnumC4576f("CLIENT_ATTRIBUTE", 10) { // from class: io.lindstrom.m3u8.parser.f.b
        {
            c cVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            throw new IllegalStateException();
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0760g.a aVar, String str, String str2) {
            aVar.x(str, str2);
        }
    };
    private static final /* synthetic */ EnumC4576f[] $VALUES = j();
    static final Map<String, EnumC4576f> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.e
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4576f) obj).key();
        }
    });

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c extends EnumC4576f {
        public c(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0760g.a aVar, String str) {
            aVar.v(str);
        }
    }

    public EnumC4576f(String str, int i10) {
    }

    public static /* synthetic */ EnumC4576f[] j() {
        return new EnumC4576f[]{ID, CLASS, START_DATE, END_DATE, DURATION, PLANNED_DURATION, SCTE35_CMD, SCTE35_OUT, SCTE35_IN, END_ON_NEXT, CLIENT_ATTRIBUTE};
    }

    public static InterfaceC0760g p(String str, C4589t c4589t) throws y {
        InterfaceC0760g.a aVarBuilder = InterfaceC0760g.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.n();
    }

    public static EnumC4576f valueOf(String str) {
        return (EnumC4576f) Enum.valueOf(EnumC4576f.class, str);
    }

    public static EnumC4576f[] values() {
        return (EnumC4576f[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4576f(String str, int i10, c cVar) {
        this(str, i10);
    }
}
