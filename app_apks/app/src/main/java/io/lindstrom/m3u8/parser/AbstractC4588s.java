package io.lindstrom.m3u8.parser;

import Db.InterfaceC0756c;
import Db.InterfaceC0758e;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.lindstrom.m3u8.parser.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4588s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f38395a = new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+00:00").optionalEnd().optionalStart().appendOffset("+HHMM", "+0000").optionalEnd().optionalStart().appendOffset("+HH", "Z").optionalEnd().toFormatter();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f38396b = Pattern.compile("([A-Z0-9\\-]+)=(?:(?:\"([^\"]+)\")|([^,]+))");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f38397c = Pattern.compile("(\\d+)(?:@(\\d+))?");

    public static InterfaceC0756c a(String str) throws y {
        Matcher matcher = f38397c.matcher(str);
        if (!matcher.matches()) {
            throw new y("Invalid byte range " + str);
        }
        InterfaceC0756c.a aVarBuilder = InterfaceC0756c.builder();
        aVarBuilder.e(Long.parseLong(matcher.group(1)));
        if (matcher.group(2) != null) {
            aVarBuilder.f(Long.parseLong(matcher.group(2)));
        }
        return aVarBuilder.c();
    }

    public static InterfaceC0758e b(String str) throws y {
        InterfaceC0758e.a aVarBuilder = InterfaceC0758e.builder();
        String[] strArrSplit = str.split("/");
        try {
            aVarBuilder.f(Integer.parseInt(strArrSplit[0]));
            if (strArrSplit.length > 1) {
                aVarBuilder.i(e(strArrSplit[1], ","));
            }
            return aVarBuilder.e();
        } catch (NumberFormatException unused) {
            throw new y("Invalid channels: " + str);
        }
    }

    public static Db.F c(String str) throws y {
        String[] strArrSplit = str.split("x");
        try {
            return Db.F.a(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            throw new y("Invalid resolution: " + str);
        }
    }

    public static void d(Map map, String str, Object obj, C4589t c4589t) throws y {
        Matcher matcher = f38396b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(matcher.group(2) == null ? 3 : 2);
            boolean zStartsWith = strGroup.startsWith("X-");
            InterfaceC4574d interfaceC4574d = (InterfaceC4574d) map.get(zStartsWith ? "CLIENT-ATTRIBUTE" : strGroup);
            if (interfaceC4574d != null) {
                if (zStartsWith) {
                    interfaceC4574d.a(obj, strGroup, strGroup2);
                } else {
                    interfaceC4574d.b(obj, strGroup2);
                }
            } else if (c4589t.a()) {
                throw new y("Unknown attribute: " + strGroup);
            }
        }
    }

    public static List e(String str, String str2) {
        return Arrays.asList(str.split(str2));
    }

    public static Map f(Object[] objArr, Function function) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(objArr.length);
        for (Object obj : objArr) {
            linkedHashMap.put((String) function.apply(obj), obj);
        }
        return linkedHashMap;
    }

    public static boolean g(String str) throws y {
        str.getClass();
        if (str.equals("NO")) {
            return false;
        }
        if (str.equals("YES")) {
            return true;
        }
        throw new y("Expected YES or NO, got " + str);
    }
}
