package io.lindstrom.m3u8.parser;

import Db.InterfaceC0769p;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.function.Function;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements S {
    public static final r EXT_X_DISCONTINUITY = new d("EXT_X_DISCONTINUITY", 0);
    public static final r EXT_X_PROGRAM_DATE_TIME = new r("EXT_X_PROGRAM_DATE_TIME", 1) { // from class: io.lindstrom.m3u8.parser.r.e
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.J(OffsetDateTime.parse(str, AbstractC4588s.f38395a));
        }
    };
    public static final r EXT_X_GAP = new r("EXT_X_GAP", 2) { // from class: io.lindstrom.m3u8.parser.r.f
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.G(true);
        }
    };
    public static final r EXT_X_DATERANGE = new r("EXT_X_DATERANGE", 3) { // from class: io.lindstrom.m3u8.parser.r.g
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.B(EnumC4576f.p(str, c4589t));
        }
    };
    public static final r EXT_X_CUE_OUT = new r("EXT_X_CUE_OUT", 4) { // from class: io.lindstrom.m3u8.parser.r.h
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            try {
                int iIndexOf = str.indexOf(34);
                if (iIndexOf >= 0) {
                    int i10 = iIndexOf + 1;
                    str = str.substring(i10, str.indexOf(34, i10));
                } else if (str.startsWith("DURATION=")) {
                    str = str.substring(9);
                }
                aVar.A(Double.parseDouble(str));
            } catch (IndexOutOfBoundsException | NumberFormatException e10) {
                if (c4589t == C4589t.f38398c) {
                    throw e10;
                }
            }
        }
    };
    public static final r EXT_X_CUE_IN = new r("EXT_X_CUE_IN", 5) { // from class: io.lindstrom.m3u8.parser.r.i
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.y(true);
        }
    };
    public static final r EXT_X_BITRATE = new r("EXT_X_BITRATE", 6) { // from class: io.lindstrom.m3u8.parser.r.j
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.u(Long.parseLong(str));
        }
    };
    public static final r EXT_X_MAP = new r("EXT_X_MAP", 7) { // from class: io.lindstrom.m3u8.parser.r.k
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.L(I.p(str, c4589t));
        }
    };
    public static final r EXTINF = new r("EXTINF", 8) { // from class: io.lindstrom.m3u8.parser.r.l
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            int iIndexOf = str.indexOf(44);
            if (iIndexOf < 0) {
                aVar.E(Double.parseDouble(str));
                return;
            }
            aVar.E(Double.parseDouble(str.substring(0, iIndexOf)));
            String strSubstring = str.substring(iIndexOf + 1);
            if (strSubstring.isEmpty()) {
                return;
            }
            aVar.M(strSubstring);
        }
    };
    public static final r EXT_X_BYTERANGE = new r("EXT_X_BYTERANGE", 9) { // from class: io.lindstrom.m3u8.parser.r.a
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.w(AbstractC4588s.a(str));
        }
    };
    public static final r EXT_X_KEY = new r("EXT_X_KEY", 10) { // from class: io.lindstrom.m3u8.parser.r.b
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.K(G.p(str, c4589t));
        }
    };
    public static final r EXT_X_PART = new r("EXT_X_PART", 11) { // from class: io.lindstrom.m3u8.parser.r.c
        {
            d dVar = null;
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.t(v.p(str, c4589t));
        }
    };
    private static final /* synthetic */ r[] $VALUES = b();
    static final Map<String, r> tags = AbstractC4588s.f(values(), new Function() { // from class: io.lindstrom.m3u8.parser.q
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((r) obj).tag();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d extends r {
        public d(String str, int i10) {
            super(str, i10, null);
        }

        @Override // io.lindstrom.m3u8.parser.S
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void a(InterfaceC0769p.a aVar, String str, C4589t c4589t) {
            aVar.C(true);
        }
    }

    public r(String str, int i10) {
    }

    public static /* synthetic */ r[] b() {
        return new r[]{EXT_X_DISCONTINUITY, EXT_X_PROGRAM_DATE_TIME, EXT_X_GAP, EXT_X_DATERANGE, EXT_X_CUE_OUT, EXT_X_CUE_IN, EXT_X_BITRATE, EXT_X_MAP, EXTINF, EXT_X_BYTERANGE, EXT_X_KEY, EXT_X_PART};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public /* synthetic */ r(String str, int i10, d dVar) {
        this(str, i10);
    }
}
