package e2;

import G1.AbstractC0853a;
import G1.AbstractC0854b;
import G1.InterfaceC0860h;
import G1.M;
import G1.y;
import I1.x;
import J7.s;
import K7.AbstractC1081v;
import K7.AbstractC1083x;
import android.content.Context;
import android.os.Handler;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.api.Endpoint;
import com.google.protobuf.DescriptorProtos$FileOptions;
import e2.d;
import io.flutter.Build;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements d, x {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC1081v f33592r = AbstractC1081v.I(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AbstractC1081v f33593s = AbstractC1081v.I(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AbstractC1081v f33594t = AbstractC1081v.I(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AbstractC1081v f33595u = AbstractC1081v.I(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AbstractC1081v f33596v = AbstractC1081v.I(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AbstractC1081v f33597w = AbstractC1081v.I(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static i f33598x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1083x f33600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.a.C0419a f33601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0860h f33602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f33603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f33604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f33605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f33606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f33607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f33608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f33609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f33610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f33611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f33612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f33613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f33614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f33615q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f33616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f33617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC0860h f33619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f33620e;

        public b(Context context) {
            this.f33616a = context == null ? null : context.getApplicationContext();
            this.f33618c = 2000;
            this.f33619d = InterfaceC0860h.f4292a;
            this.f33620e = true;
            HashMap map = new HashMap(8);
            this.f33617b = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public i a() {
            return new i(this.f33616a, this.f33617b, this.f33618c, this.f33619d, this.f33620e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] k(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b10 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b10 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b10 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b10 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b10 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b10 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b10 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b10 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b10 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b10 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b10 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b10 = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b10 = 12;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b10 = 13;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b10 = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b10 = 15;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b10 = 16;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b10 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b10 = 18;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b10 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b10 = 20;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b10 = 21;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b10 = 22;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b10 = 23;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b10 = 24;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b10 = 25;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b10 = 26;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b10 = 27;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b10 = 28;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b10 = 29;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b10 = 30;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b10 = 31;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b10 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b10 = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b10 = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b10 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b10 = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b10 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b10 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b10 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b10 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b10 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b10 = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b10 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b10 = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b10 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b10 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b10 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b10 = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b10 = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b10 = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b10 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b10 = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b10 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b10 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b10 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b10 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b10 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b10 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b10 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b10 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b10 = 61;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b10 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b10 = 63;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b10 = 64;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b10 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b10 = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b10 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b10 = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b10 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b10 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b10 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b10 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b10 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b10 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b10 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b10 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b10 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b10 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b10 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b10 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b10 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b10 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b10 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b10 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b10 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b10 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b10 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b10 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b10 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b10 = 90;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b10 = 91;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b10 = 92;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b10 = 93;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b10 = 94;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b10 = 95;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b10 = 96;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b10 = 97;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b10 = 98;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b10 = 99;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b10 = 100;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b10 = 101;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b10 = 102;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b10 = 103;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b10 = 104;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b10 = 105;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b10 = 106;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b10 = 107;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b10 = 108;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b10 = 109;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b10 = 110;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b10 = 111;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b10 = 112;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b10 = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b10 = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b10 = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b10 = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b10 = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b10 = 118;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b10 = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b10 = 120;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b10 = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b10 = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b10 = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b10 = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b10 = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b10 = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b10 = 127;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b10 = 128;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b10 = 129;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b10 = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b10 = 131;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b10 = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b10 = 133;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b10 = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b10 = 135;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b10 = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b10 = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b10 = 138;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b10 = 139;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b10 = 140;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b10 = 141;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b10 = 142;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b10 = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b10 = 144;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b10 = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b10 = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b10 = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b10 = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b10 = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b10 = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b10 = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b10 = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b10 = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b10 = 154;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    b10 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b10 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b10 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b10 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b10 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b10 = 160;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b10 = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b10 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b10 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b10 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b10 = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b10 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b10 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b10 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b10 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b10 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b10 = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b10 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b10 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b10 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b10 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b10 = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b10 = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b10 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b10 = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b10 = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b10 = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b10 = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b10 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b10 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b10 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b10 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b10 = ByteSourceJsonBootstrapper.UTF8_BOM_2;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b10 = 188;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b10 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b10 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b10 = ByteSourceJsonBootstrapper.UTF8_BOM_3;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b10 = 192;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b10 = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b10 = 194;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b10 = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b10 = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b10 = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b10 = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b10 = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b10 = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b10 = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b10 = 202;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b10 = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b10 = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b10 = 205;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b10 = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b10 = 207;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b10 = 208;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b10 = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b10 = 210;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b10 = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b10 = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b10 = 213;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b10 = 214;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b10 = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b10 = 216;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b10 = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b10 = 218;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b10 = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b10 = 220;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b10 = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b10 = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b10 = 223;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b10 = 224;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b10 = 225;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b10 = 226;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b10 = 227;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b10 = 228;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b10 = 229;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b10 = 230;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b10 = 231;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b10 = 232;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b10 = 233;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b10 = 234;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b10 = 235;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b10 = 236;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b10 = 237;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b10 = 238;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case 195:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case 214:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case 203:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case 141:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case Build.API_LEVELS.API_30 /* 30 */:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case 219:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 62:
            case 134:
                return new int[]{3, 4, 3, 3, 2, 2};
            case DescriptorProtos$FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case 111:
            case 161:
            case 210:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case 209:
                return new int[]{3, 3, 4, 4, 2, 2};
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case 74:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 81:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 82:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case Endpoint.TARGET_FIELD_NUMBER /* 101 */:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case 108:
                return new int[]{3, 2, 1, 1, 1, 2};
            case 109:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 110:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 3, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 120:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 125:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case 216:
            case 231:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 152:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case 235:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 163:
                return new int[]{0, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 2, 4, 2};
            case 166:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 184:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case 238:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case 193:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 197:
                return new int[]{2, 2, 3, 4, 4, 2};
            case 198:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 205:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 207:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 212:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 215:
                return new int[]{2, 4, 1, 0, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 218:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case 223:
                return new int[]{1, 2, 3, 4, 3, 2};
            case 227:
                return new int[]{2, 2, 1, 1, 2, 4};
            case 228:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 229:
                return new int[]{0, 0, 1, 2, 2, 2};
            case 233:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 236:
                return new int[]{2, 4, 2, 1, 1, 2};
            case 237:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public static long m(String str, int i10) {
        int[] iArrK = k(s.c(str));
        if (i10 != 2) {
            if (i10 == 3) {
                return ((Long) f33593s.get(iArrK[1])).longValue();
            }
            if (i10 == 4) {
                return ((Long) f33594t.get(iArrK[2])).longValue();
            }
            if (i10 == 5) {
                return ((Long) f33595u.get(iArrK[3])).longValue();
            }
            if (i10 != 7) {
                if (i10 == 9) {
                    return ((Long) f33597w.get(iArrK[5])).longValue();
                }
                if (i10 != 10) {
                    return 1000000L;
                }
                return ((Long) f33596v.get(iArrK[4])).longValue();
            }
        }
        return ((Long) f33592r.get(iArrK[0])).longValue();
    }

    public static synchronized i n(Context context) {
        try {
            if (f33598x == null) {
                f33598x = new b(context).a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33598x;
    }

    public static boolean o(I1.j jVar, boolean z10) {
        return z10 && !jVar.d(8);
    }

    @Override // I1.x
    public synchronized void b(I1.f fVar, I1.j jVar, boolean z10, int i10) {
        if (o(jVar, z10)) {
            this.f33607i += (long) i10;
        }
    }

    @Override // e2.d
    public void c(d.a aVar) {
        this.f33601c.d(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // I1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void d(I1.f r11, I1.j r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = o(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.f33605g     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            G1.AbstractC0853a.g(r11)     // Catch: java.lang.Throwable -> L72
            G1.h r11 = r10.f33602d     // Catch: java.lang.Throwable -> L72
            long r0 = r11.c()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f33606h     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f33608j     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f33608j = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f33609k     // Catch: java.lang.Throwable -> L72
            long r6 = r10.f33607i     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.f33609k = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            e2.r r13 = r10.f33604f     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.c(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.f33608j     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.f33609k     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            e2.r r11 = r10.f33604f     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.f(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.f33610l = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.f33607i     // Catch: java.lang.Throwable -> L72
            long r8 = r10.f33610l     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.p(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.f33606h = r0     // Catch: java.lang.Throwable -> L6f
            r10 = 0
            r4.f33607i = r10     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r10 = r4.f33605g     // Catch: java.lang.Throwable -> L6f
            int r10 = r10 - r12
            r4.f33605g = r10     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)
            return
        L7d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.i.d(I1.f, I1.j, boolean):void");
    }

    @Override // e2.d
    public synchronized long f() {
        return this.f33610l;
    }

    @Override // e2.d
    public void h(Handler handler, d.a aVar) {
        AbstractC0853a.e(handler);
        AbstractC0853a.e(aVar);
        this.f33601c.b(handler, aVar);
    }

    @Override // I1.x
    public synchronized void i(I1.f fVar, I1.j jVar, boolean z10) {
        try {
            if (o(jVar, z10)) {
                if (this.f33605g == 0) {
                    this.f33606h = this.f33602d.c();
                }
                this.f33605g++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long l(int i10) {
        Long lValueOf = (Long) this.f33600b.get(Integer.valueOf(i10));
        if (lValueOf == null) {
            lValueOf = (Long) this.f33600b.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(m(this.f33615q, i10));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    public final void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f33611m) {
            return;
        }
        this.f33611m = j11;
        this.f33601c.c(i10, j10, j11);
    }

    public final synchronized void q(int i10) throws Throwable {
        i iVar;
        Throwable th;
        try {
            try {
                int i11 = this.f33612n;
                if (i11 != 0) {
                    try {
                        if (!this.f33603e) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iVar = this;
                    }
                }
                if (this.f33613o) {
                    i10 = this.f33614p;
                }
                if (i11 != i10 || this.f33615q == null) {
                    this.f33612n = i10;
                    if (i10 == 1 || i10 == 0 || i10 == 8) {
                        return;
                    }
                    if (this.f33615q == null) {
                        this.f33615q = M.V(this.f33599a);
                    }
                    this.f33610l = l(i10);
                    long jC = this.f33602d.c();
                    p(this.f33605g > 0 ? (int) (jC - this.f33606h) : 0, this.f33607i, this.f33610l);
                    this.f33606h = jC;
                    this.f33607i = 0L;
                    this.f33609k = 0L;
                    this.f33608j = 0L;
                    this.f33604f.g();
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                iVar = this;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public i(Context context, Map map, int i10, InterfaceC0860h interfaceC0860h, boolean z10) {
        this.f33599a = context == null ? null : context.getApplicationContext();
        this.f33600b = AbstractC1083x.c(map);
        this.f33601c = new d.a.C0419a();
        this.f33604f = new r(i10);
        this.f33602d = interfaceC0860h;
        this.f33603e = z10;
        if (context == null) {
            this.f33612n = 0;
            this.f33610l = 1000000L;
            return;
        }
        y yVarE = y.e(context);
        int iG = yVarE.g();
        this.f33612n = iG;
        this.f33610l = l(iG);
        yVarE.k(new y.c() { // from class: e2.h
            @Override // G1.y.c
            public final void a(int i11) throws Throwable {
                this.f33591a.q(i11);
            }
        }, AbstractC0854b.a());
    }

    @Override // e2.d
    public x e() {
        return this;
    }

    @Override // I1.x
    public void g(I1.f fVar, I1.j jVar, boolean z10) {
    }
}
