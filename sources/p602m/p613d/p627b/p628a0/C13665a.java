package p602m.p613d.p627b.p628a0;

import java.lang.reflect.Array;
import p602m.p613d.p627b.C13679d;
import p602m.p613d.p627b.C13697f;
import p602m.p613d.p627b.C13705i;
import p602m.p613d.p627b.C13716t;
import p602m.p613d.p627b.p632d0.C13692m;
import p602m.p613d.p683g.C14079a;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.a0.a */
/* compiled from: AESEngine */
public class C13665a implements C13679d {

    /* renamed from: i */
    private static final byte[] f30383i = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, Framer.STDOUT_FRAME_PREFIX, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, Framer.ENTER_FRAME_PREFIX, 16, -1, -13, -46, -51, 12, 19, -20, Framer.STDIN_REQUEST_FRAME_PREFIX, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, Framer.STDERR_FRAME_PREFIX, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, Framer.EXIT_FRAME_PREFIX, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, Framer.STDIN_FRAME_PREFIX, 15, -80, 84, -69, 22};

    /* renamed from: j */
    private static final byte[] f30384j = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, Framer.STDERR_FRAME_PREFIX, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, Framer.EXIT_FRAME_PREFIX, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, Framer.STDOUT_FRAME_PREFIX, -79, 18, 16, 89, 39, Byte.MIN_VALUE, -20, Framer.STDIN_REQUEST_FRAME_PREFIX, 96, 81, Byte.MAX_VALUE, -87, 25, -75, 74, 13, Framer.STDIN_FRAME_PREFIX, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, Framer.ENTER_FRAME_PREFIX, 12, 125};

    /* renamed from: k */
    private static final int[] f30385k = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};

    /* renamed from: l */
    private static final int[] f30386l = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    /* renamed from: m */
    private static final int[] f30387m = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    /* renamed from: a */
    private int f30388a;

    /* renamed from: b */
    private int[][] f30389b = null;

    /* renamed from: c */
    private int f30390c;

    /* renamed from: d */
    private int f30391d;

    /* renamed from: e */
    private int f30392e;

    /* renamed from: f */
    private int f30393f;

    /* renamed from: g */
    private boolean f30394g;

    /* renamed from: h */
    private byte[] f30395h;

    /* renamed from: a */
    private static int m41981a(int i) {
        return (((i & -2139062144) >>> 7) * 27) ^ ((2139062143 & i) << 1);
    }

    /* renamed from: a */
    private static int m41982a(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    /* renamed from: a */
    private int[][] m41985a(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        this.f30388a = i + 6;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{this.f30388a + 1, 4});
        if (i == 4) {
            int c = C14087h.m44479c(bArr2, 0);
            iArr[0][0] = c;
            int c2 = C14087h.m44479c(bArr2, 4);
            iArr[0][1] = c2;
            int c3 = C14087h.m44479c(bArr2, 8);
            iArr[0][2] = c3;
            int c4 = C14087h.m44479c(bArr2, 12);
            iArr[0][3] = c4;
            int i2 = c3;
            int i3 = c;
            int i4 = c4;
            for (int i5 = 1; i5 <= 10; i5++) {
                i3 ^= m41990d(m41982a(i4, 8)) ^ f30385k[i5 - 1];
                iArr[i5][0] = i3;
                c2 ^= i3;
                iArr[i5][1] = c2;
                i2 ^= c2;
                iArr[i5][2] = i2;
                i4 ^= i2;
                iArr[i5][3] = i4;
            }
        } else if (i == 6) {
            int c5 = C14087h.m44479c(bArr2, 0);
            iArr[0][0] = c5;
            int c6 = C14087h.m44479c(bArr2, 4);
            iArr[0][1] = c6;
            int c7 = C14087h.m44479c(bArr2, 8);
            iArr[0][2] = c7;
            int c8 = C14087h.m44479c(bArr2, 12);
            iArr[0][3] = c8;
            int c9 = C14087h.m44479c(bArr2, 16);
            iArr[1][0] = c9;
            int c10 = C14087h.m44479c(bArr2, 20);
            iArr[1][1] = c10;
            int d = c5 ^ (m41990d(m41982a(c10, 8)) ^ 1);
            iArr[1][2] = d;
            int i6 = c6 ^ d;
            iArr[1][3] = i6;
            int i7 = c7 ^ i6;
            iArr[2][0] = i7;
            int i8 = c8 ^ i7;
            iArr[2][1] = i8;
            int i9 = c9 ^ i8;
            iArr[2][2] = i9;
            int i10 = c10 ^ i9;
            iArr[2][3] = i10;
            int i11 = i9;
            int i12 = i8;
            int i13 = 2;
            int i14 = i7;
            int i15 = d;
            int i16 = i10;
            for (int i17 = 3; i17 < 12; i17 += 3) {
                int d2 = m41990d(m41982a(i16, 8)) ^ i13;
                int i18 = i13 << 1;
                int i19 = i15 ^ d2;
                iArr[i17][0] = i19;
                int i20 = i6 ^ i19;
                iArr[i17][1] = i20;
                int i21 = i14 ^ i20;
                iArr[i17][2] = i21;
                int i22 = i12 ^ i21;
                iArr[i17][3] = i22;
                int i23 = i11 ^ i22;
                int i24 = i17 + 1;
                iArr[i24][0] = i23;
                int i25 = i16 ^ i23;
                iArr[i24][1] = i25;
                int d3 = m41990d(m41982a(i25, 8)) ^ i18;
                i13 = i18 << 1;
                i15 = i19 ^ d3;
                iArr[i24][2] = i15;
                i6 = i20 ^ i15;
                iArr[i24][3] = i6;
                i14 = i21 ^ i6;
                int i26 = i17 + 2;
                iArr[i26][0] = i14;
                i12 = i22 ^ i14;
                iArr[i26][1] = i12;
                i11 = i23 ^ i12;
                iArr[i26][2] = i11;
                i16 = i25 ^ i11;
                iArr[i26][3] = i16;
            }
            int d4 = (m41990d(m41982a(i16, 8)) ^ i13) ^ i15;
            iArr[12][0] = d4;
            int i27 = d4 ^ i6;
            iArr[12][1] = i27;
            int i28 = i27 ^ i14;
            iArr[12][2] = i28;
            iArr[12][3] = i28 ^ i12;
        } else if (i == 8) {
            int c11 = C14087h.m44479c(bArr2, 0);
            iArr[0][0] = c11;
            int c12 = C14087h.m44479c(bArr2, 4);
            iArr[0][1] = c12;
            int c13 = C14087h.m44479c(bArr2, 8);
            iArr[0][2] = c13;
            int c14 = C14087h.m44479c(bArr2, 12);
            iArr[0][3] = c14;
            int c15 = C14087h.m44479c(bArr2, 16);
            iArr[1][0] = c15;
            int c16 = C14087h.m44479c(bArr2, 20);
            iArr[1][1] = c16;
            int c17 = C14087h.m44479c(bArr2, 24);
            iArr[1][2] = c17;
            int c18 = C14087h.m44479c(bArr2, 28);
            iArr[1][3] = c18;
            int i29 = c11;
            int i30 = c17;
            int i31 = c18;
            int i32 = c16;
            int i33 = c15;
            int i34 = 1;
            for (int i35 = 2; i35 < 14; i35 += 2) {
                int d5 = m41990d(m41982a(i31, 8)) ^ i34;
                i34 <<= 1;
                i29 ^= d5;
                iArr[i35][0] = i29;
                c12 ^= i29;
                iArr[i35][1] = c12;
                c13 ^= c12;
                iArr[i35][2] = c13;
                c14 ^= c13;
                iArr[i35][3] = c14;
                i33 ^= m41990d(c14);
                int i36 = i35 + 1;
                iArr[i36][0] = i33;
                i32 ^= i33;
                iArr[i36][1] = i32;
                i30 ^= i32;
                iArr[i36][2] = i30;
                i31 ^= i30;
                iArr[i36][3] = i31;
            }
            int d6 = (m41990d(m41982a(i31, 8)) ^ i34) ^ i29;
            iArr[14][0] = d6;
            int i37 = d6 ^ c12;
            iArr[14][1] = i37;
            int i38 = i37 ^ c13;
            iArr[14][2] = i38;
            iArr[14][3] = i38 ^ c14;
        } else {
            throw new IllegalStateException("Should never get here");
        }
        if (!z) {
            for (int i39 = 1; i39 < this.f30388a; i39++) {
                for (int i40 = 0; i40 < 4; i40++) {
                    iArr[i39][i40] = m41989c(iArr[i39][i40]);
                }
            }
        }
        return iArr;
    }

    /* renamed from: b */
    private static int m41986b(int i) {
        int i2 = i & -1061109568;
        int i3 = i2 ^ (i2 >>> 1);
        return (i3 >>> 5) ^ (((1061109567 & i) << 2) ^ (i3 >>> 2));
    }

    /* renamed from: b */
    private void m41987b(byte[] bArr, int i) {
        int i2 = i + 1;
        this.f30390c = bArr[i] & 255;
        int i3 = i2 + 1;
        this.f30390c |= (bArr[i2] & 255) << 8;
        int i4 = i3 + 1;
        this.f30390c |= (bArr[i3] & 255) << 16;
        int i5 = i4 + 1;
        this.f30390c |= bArr[i4] << 24;
        int i6 = i5 + 1;
        this.f30391d = bArr[i5] & 255;
        int i7 = i6 + 1;
        this.f30391d = ((bArr[i6] & 255) << 8) | this.f30391d;
        int i8 = i7 + 1;
        this.f30391d |= (bArr[i7] & 255) << 16;
        int i9 = i8 + 1;
        this.f30391d |= bArr[i8] << 24;
        int i10 = i9 + 1;
        this.f30392e = bArr[i9] & 255;
        int i11 = i10 + 1;
        this.f30392e = ((bArr[i10] & 255) << 8) | this.f30392e;
        int i12 = i11 + 1;
        this.f30392e |= (bArr[i11] & 255) << 16;
        int i13 = i12 + 1;
        this.f30392e |= bArr[i12] << 24;
        int i14 = i13 + 1;
        this.f30393f = bArr[i13] & 255;
        int i15 = i14 + 1;
        this.f30393f = ((bArr[i14] & 255) << 8) | this.f30393f;
        int i16 = i15 + 1;
        this.f30393f |= (bArr[i15] & 255) << 16;
        this.f30393f = (bArr[i16] << 24) | this.f30393f;
    }

    /* renamed from: c */
    private static int m41989c(int i) {
        int a = m41982a(i, 8) ^ i;
        int a2 = i ^ m41981a(a);
        int b = a ^ m41986b(a2);
        return a2 ^ (b ^ m41982a(b, 16));
    }

    /* renamed from: d */
    private static int m41990d(int i) {
        byte[] bArr = f30383i;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    /* renamed from: a */
    public int mo34903a() {
        return 16;
    }

    public void reset() {
    }

    /* renamed from: b */
    private void m41988b(int[][] iArr) {
        char c = 0;
        int i = 1;
        int i2 = this.f30393f ^ iArr[0][3];
        int i3 = this.f30392e ^ iArr[0][2];
        int i4 = this.f30391d ^ iArr[0][1];
        int i5 = this.f30390c ^ iArr[0][0];
        int i6 = 1;
        while (i6 < this.f30388a - i) {
            int[] iArr2 = f30386l;
            int a = (((m41982a(iArr2[(i4 >> 8) & 255], 24) ^ iArr2[i5 & 255]) ^ m41982a(f30386l[(i3 >> 16) & 255], 16)) ^ m41982a(f30386l[(i2 >> 24) & 255], 8)) ^ iArr[i6][c];
            int[] iArr3 = f30386l;
            int a2 = (((m41982a(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i4 & 255]) ^ m41982a(f30386l[(i2 >> 16) & 255], 16)) ^ m41982a(f30386l[(i5 >> 24) & 255], 8)) ^ iArr[i6][i];
            int[] iArr4 = f30386l;
            int a3 = (((m41982a(iArr4[(i2 >> 8) & 255], 24) ^ iArr4[i3 & 255]) ^ m41982a(f30386l[(i5 >> 16) & 255], 16)) ^ m41982a(f30386l[(i4 >> 24) & 255], 8)) ^ iArr[i6][2];
            int[] iArr5 = f30386l;
            int a4 = ((m41982a(iArr5[(i5 >> 8) & 255], 24) ^ iArr5[i2 & 255]) ^ m41982a(f30386l[(i4 >> 16) & 255], 16)) ^ m41982a(f30386l[(i3 >> 24) & 255], 8);
            int i7 = i6 + 1;
            int i8 = iArr[i6][3] ^ a4;
            int[] iArr6 = f30386l;
            i5 = (((m41982a(iArr6[(a2 >> 8) & 255], 24) ^ iArr6[a & 255]) ^ m41982a(f30386l[(a3 >> 16) & 255], 16)) ^ m41982a(f30386l[(i8 >> 24) & 255], 8)) ^ iArr[i7][0];
            int[] iArr7 = f30386l;
            int a5 = (((m41982a(iArr7[(a3 >> 8) & 255], 24) ^ iArr7[a2 & 255]) ^ m41982a(f30386l[(i8 >> 16) & 255], 16)) ^ m41982a(f30386l[(a >> 24) & 255], 8)) ^ iArr[i7][1];
            int[] iArr8 = f30386l;
            int a6 = (((m41982a(iArr8[(i8 >> 8) & 255], 24) ^ iArr8[a3 & 255]) ^ m41982a(f30386l[(a >> 16) & 255], 16)) ^ m41982a(f30386l[(a2 >> 24) & 255], 8)) ^ iArr[i7][2];
            int[] iArr9 = f30386l;
            int a7 = ((iArr9[i8 & 255] ^ m41982a(iArr9[(a >> 8) & 255], 24)) ^ m41982a(f30386l[(a2 >> 16) & 255], 16)) ^ m41982a(f30386l[(a3 >> 24) & 255], 8);
            int i9 = i7 + 1;
            int i10 = a7 ^ iArr[i7][3];
            i4 = a5;
            i3 = a6;
            i = 1;
            i2 = i10;
            i6 = i9;
            c = 0;
        }
        int[] iArr10 = f30386l;
        int a8 = (((m41982a(iArr10[(i4 >> 8) & 255], 24) ^ iArr10[i5 & 255]) ^ m41982a(f30386l[(i3 >> 16) & 255], 16)) ^ m41982a(f30386l[(i2 >> 24) & 255], 8)) ^ iArr[i6][0];
        int[] iArr11 = f30386l;
        int a9 = (((m41982a(iArr11[(i3 >> 8) & 255], 24) ^ iArr11[i4 & 255]) ^ m41982a(f30386l[(i2 >> 16) & 255], 16)) ^ m41982a(f30386l[(i5 >> 24) & 255], 8)) ^ iArr[i6][1];
        int[] iArr12 = f30386l;
        int a10 = (((m41982a(iArr12[(i2 >> 8) & 255], 24) ^ iArr12[i3 & 255]) ^ m41982a(f30386l[(i5 >> 16) & 255], 16)) ^ m41982a(f30386l[(i4 >> 24) & 255], 8)) ^ iArr[i6][2];
        int[] iArr13 = f30386l;
        int a11 = ((m41982a(iArr13[(i5 >> 8) & 255], 24) ^ iArr13[i2 & 255]) ^ m41982a(f30386l[(i4 >> 16) & 255], 16)) ^ m41982a(f30386l[(i3 >> 24) & 255], 8);
        int i11 = i6 + 1;
        int i12 = iArr[i6][3] ^ a11;
        byte[] bArr = f30383i;
        byte b = (bArr[a8 & 255] & 255) ^ ((bArr[(a9 >> 8) & 255] & 255) << 8);
        byte[] bArr2 = this.f30395h;
        this.f30390c = ((b ^ ((bArr2[(a10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i12 >> 24) & 255] << 24)) ^ iArr[i11][0];
        this.f30391d = ((((bArr2[a9 & 255] & 255) ^ ((bArr[(a10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(a8 >> 24) & 255] << 24)) ^ iArr[i11][1];
        this.f30392e = ((((bArr2[a10 & 255] & 255) ^ ((bArr[(i12 >> 8) & 255] & 255) << 8)) ^ ((bArr[(a8 >> 16) & 255] & 255) << 16)) ^ (bArr[(a9 >> 24) & 255] << 24)) ^ iArr[i11][2];
        this.f30393f = ((((bArr2[i12 & 255] & 255) ^ ((bArr2[(a8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(a9 >> 16) & 255] & 255) << 16)) ^ (bArr[(a10 >> 24) & 255] << 24)) ^ iArr[i11][3];
    }

    /* renamed from: a */
    public void mo34905a(boolean z, C13697f fVar) {
        if (fVar instanceof C13692m) {
            this.f30389b = m41985a(((C13692m) fVar).mo34946a(), z);
            this.f30394g = z;
            if (z) {
                this.f30395h = C14079a.m44450a(f30383i);
            } else {
                this.f30395h = C14079a.m44450a(f30384j);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid parameter passed to AES init - ");
            sb.append(fVar.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public int mo34904a(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.f30389b == null) {
            throw new IllegalStateException("AES engine not initialised");
        } else if (i + 16 > bArr.length) {
            throw new C13705i("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            if (this.f30394g) {
                m41987b(bArr, i);
                m41988b(this.f30389b);
                m41983a(bArr2, i2);
            } else {
                m41987b(bArr, i);
                m41984a(this.f30389b);
                m41983a(bArr2, i2);
            }
            return 16;
        } else {
            throw new C13716t("output buffer too short");
        }
    }

    /* renamed from: a */
    private void m41983a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = this.f30390c;
        bArr[i] = (byte) i3;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i3 >> 24);
        int i7 = i6 + 1;
        int i8 = this.f30391d;
        bArr[i6] = (byte) i8;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i8 >> 24);
        int i12 = i11 + 1;
        int i13 = this.f30392e;
        bArr[i11] = (byte) i13;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i13 >> 24);
        int i17 = i16 + 1;
        int i18 = this.f30393f;
        bArr[i16] = (byte) i18;
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 8);
        int i20 = i19 + 1;
        bArr[i19] = (byte) (i18 >> 16);
        bArr[i20] = (byte) (i18 >> 24);
    }

    /* renamed from: a */
    private void m41984a(int[][] iArr) {
        int i = this.f30390c;
        int i2 = this.f30388a;
        char c = 0;
        int i3 = i ^ iArr[i2][0];
        int i4 = 1;
        int i5 = this.f30391d ^ iArr[i2][1];
        int i6 = this.f30392e ^ iArr[i2][2];
        int i7 = i2 - 1;
        int i8 = iArr[i2][3] ^ this.f30393f;
        while (i7 > i4) {
            int[] iArr2 = f30387m;
            int a = (((m41982a(iArr2[(i8 >> 8) & 255], 24) ^ iArr2[i3 & 255]) ^ m41982a(f30387m[(i6 >> 16) & 255], 16)) ^ m41982a(f30387m[(i5 >> 24) & 255], 8)) ^ iArr[i7][c];
            int[] iArr3 = f30387m;
            int a2 = (((m41982a(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ m41982a(f30387m[(i8 >> 16) & 255], 16)) ^ m41982a(f30387m[(i6 >> 24) & 255], 8)) ^ iArr[i7][i4];
            int[] iArr4 = f30387m;
            int a3 = (((m41982a(iArr4[(i5 >> 8) & 255], 24) ^ iArr4[i6 & 255]) ^ m41982a(f30387m[(i3 >> 16) & 255], 16)) ^ m41982a(f30387m[(i8 >> 24) & 255], 8)) ^ iArr[i7][2];
            int[] iArr5 = f30387m;
            int a4 = m41982a(f30387m[(i3 >> 24) & 255], 8) ^ ((iArr5[i8 & 255] ^ m41982a(iArr5[(i6 >> 8) & 255], 24)) ^ m41982a(f30387m[(i5 >> 16) & 255], 16));
            int i9 = i7 - 1;
            int i10 = a4 ^ iArr[i7][3];
            int[] iArr6 = f30387m;
            int a5 = (((m41982a(iArr6[(i10 >> 8) & 255], 24) ^ iArr6[a & 255]) ^ m41982a(f30387m[(a3 >> 16) & 255], 16)) ^ m41982a(f30387m[(a2 >> 24) & 255], 8)) ^ iArr[i9][0];
            int[] iArr7 = f30387m;
            int a6 = (((m41982a(iArr7[(a >> 8) & 255], 24) ^ iArr7[a2 & 255]) ^ m41982a(f30387m[(i10 >> 16) & 255], 16)) ^ m41982a(f30387m[(a3 >> 24) & 255], 8)) ^ iArr[i9][1];
            int[] iArr8 = f30387m;
            int a7 = (((m41982a(iArr8[(a2 >> 8) & 255], 24) ^ iArr8[a3 & 255]) ^ m41982a(f30387m[(a >> 16) & 255], 16)) ^ m41982a(f30387m[(i10 >> 24) & 255], 8)) ^ iArr[i9][2];
            int[] iArr9 = f30387m;
            int a8 = ((iArr9[i10 & 255] ^ m41982a(iArr9[(a3 >> 8) & 255], 24)) ^ m41982a(f30387m[(a2 >> 16) & 255], 16)) ^ m41982a(f30387m[(a >> 24) & 255], 8);
            int i11 = i9 - 1;
            i8 = iArr[i9][3] ^ a8;
            i3 = a5;
            i5 = a6;
            i6 = a7;
            i4 = 1;
            i7 = i11;
            c = 0;
        }
        int[] iArr10 = f30387m;
        int a9 = (((m41982a(iArr10[(i8 >> 8) & 255], 24) ^ iArr10[i3 & 255]) ^ m41982a(f30387m[(i6 >> 16) & 255], 16)) ^ m41982a(f30387m[(i5 >> 24) & 255], 8)) ^ iArr[i7][0];
        int[] iArr11 = f30387m;
        int a10 = (((m41982a(iArr11[(i3 >> 8) & 255], 24) ^ iArr11[i5 & 255]) ^ m41982a(f30387m[(i8 >> 16) & 255], 16)) ^ m41982a(f30387m[(i6 >> 24) & 255], 8)) ^ iArr[i7][1];
        int[] iArr12 = f30387m;
        int a11 = (((m41982a(iArr12[(i5 >> 8) & 255], 24) ^ iArr12[i6 & 255]) ^ m41982a(f30387m[(i3 >> 16) & 255], 16)) ^ m41982a(f30387m[(i8 >> 24) & 255], 8)) ^ iArr[i7][2];
        int[] iArr13 = f30387m;
        int a12 = (m41982a(f30387m[(i3 >> 24) & 255], 8) ^ ((iArr13[i8 & 255] ^ m41982a(iArr13[(i6 >> 8) & 255], 24)) ^ m41982a(f30387m[(i5 >> 16) & 255], 16))) ^ iArr[i7][3];
        byte[] bArr = f30384j;
        byte b = bArr[a9 & 255] & 255;
        byte[] bArr2 = this.f30395h;
        this.f30390c = (((b ^ ((bArr2[(a12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(a11 >> 16) & 255] & 255) << 16)) ^ (bArr[(a10 >> 24) & 255] << 24)) ^ iArr[0][0];
        this.f30391d = ((((bArr2[a10 & 255] & 255) ^ ((bArr2[(a9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(a12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(a11 >> 24) & 255] << 24)) ^ iArr[0][1];
        this.f30392e = ((((bArr2[a11 & 255] & 255) ^ ((bArr[(a10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(a9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(a12 >> 24) & 255] << 24)) ^ iArr[0][2];
        this.f30393f = ((((bArr[a12 & 255] & 255) ^ ((bArr2[(a11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(a10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(a9 >> 24) & 255] << 24)) ^ iArr[0][3];
    }
}