package io.lindstrom.m3u8.parser;

import Db.InterfaceC0762i;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC4578h implements InterfaceC4574d {
    public static final EnumC4578h URI = new f("URI", 0);
    public static final EnumC4578h BANDWIDTH = new EnumC4578h("BANDWIDTH", 1) { // from class: io.lindstrom.m3u8.parser.h.g
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.t(Long.parseLong(str));
        }
    };
    public static final EnumC4578h AVERAGE_BANDWIDTH = new EnumC4578h("AVERAGE_BANDWIDTH", 2) { // from class: io.lindstrom.m3u8.parser.h.h
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.s(Long.parseLong(str));
        }
    };
    public static final EnumC4578h SCORE = new EnumC4578h("SCORE", 3) { // from class: io.lindstrom.m3u8.parser.h.i
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.D(Double.parseDouble(str));
        }
    };
    public static final EnumC4578h CODECS = new EnumC4578h("CODECS", 4) { // from class: io.lindstrom.m3u8.parser.h.j
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.v(AbstractC4588s.e(str, ","));
        }
    };
    public static final EnumC4578h RESOLUTION = new EnumC4578h("RESOLUTION", 5) { // from class: io.lindstrom.m3u8.parser.h.k
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.C(AbstractC4588s.c(str));
        }
    };
    public static final EnumC4578h HDCP_LEVEL = new EnumC4578h("HDCP_LEVEL", 6) { // from class: io.lindstrom.m3u8.parser.h.l
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.y(str);
        }
    };
    public static final EnumC4578h ALLOWED_CPC = new EnumC4578h("ALLOWED_CPC", 7) { // from class: io.lindstrom.m3u8.parser.h.m
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.r(AbstractC4588s.e(str, ","));
        }
    };
    public static final EnumC4578h STABLE_VARIANT_ID = new EnumC4578h("STABLE_VARIANT_ID", 8) { // from class: io.lindstrom.m3u8.parser.h.n
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.E(str);
        }
    };
    public static final EnumC4578h VIDEO = new EnumC4578h("VIDEO", 9) { // from class: io.lindstrom.m3u8.parser.h.a
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.G(str);
        }
    };
    public static final EnumC4578h PROGRAM_ID = new EnumC4578h("PROGRAM_ID", 10) { // from class: io.lindstrom.m3u8.parser.h.b
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.B(Integer.parseInt(str));
        }
    };
    public static final EnumC4578h VIDEO_RANGE = new EnumC4578h("VIDEO_RANGE", 11) { // from class: io.lindstrom.m3u8.parser.h.c
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.I(str);
        }
    };
    public static final EnumC4578h NAME = new EnumC4578h("NAME", 12) { // from class: io.lindstrom.m3u8.parser.h.d
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.A(str);
        }
    };
    public static final EnumC4578h LANGUAGE = new EnumC4578h("LANGUAGE", 13) { // from class: io.lindstrom.m3u8.parser.h.e
        {
            f fVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.z(str);
        }
    };
    private static final /* synthetic */ EnumC4578h[] $VALUES = j();
    static final Map<String, EnumC4578h> attributeMap = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.g
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((EnumC4578h) obj).key();
        }
    });

    /* JADX INFO: renamed from: io.lindstrom.m3u8.parser.h$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum f extends EnumC4578h {
        public f(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.InterfaceC4574d
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC0762i.a aVar, String str) {
            aVar.F(str);
        }
    }

    public EnumC4578h(String str, int i10) {
    }

    public static /* synthetic */ EnumC4578h[] j() {
        return new EnumC4578h[]{URI, BANDWIDTH, AVERAGE_BANDWIDTH, SCORE, CODECS, RESOLUTION, HDCP_LEVEL, ALLOWED_CPC, STABLE_VARIANT_ID, VIDEO, PROGRAM_ID, VIDEO_RANGE, NAME, LANGUAGE};
    }

    public static InterfaceC0762i p(String str, C4589t c4589t) throws y {
        InterfaceC0762i.a aVarBuilder = InterfaceC0762i.builder();
        AbstractC4588s.d(attributeMap, str, aVarBuilder, c4589t);
        return aVarBuilder.u();
    }

    public static EnumC4578h valueOf(String str) {
        return (EnumC4578h) Enum.valueOf(EnumC4578h.class, str);
    }

    public static EnumC4578h[] values() {
        return (EnumC4578h[]) $VALUES.clone();
    }

    public /* synthetic */ EnumC4578h(String str, int i10, f fVar) {
        this(str, i10);
    }
}
