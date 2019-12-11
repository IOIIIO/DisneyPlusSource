package kotlin.reflect.jvm.internal.impl.util;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12815k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: OperatorNameConventions.kt */
public final class OperatorNameConventions {
    public static final Name AND;
    public static final Set<Name> ASSIGNMENT_OPERATIONS = C13188p0.m40533b(TIMES_ASSIGN, DIV_ASSIGN, MOD_ASSIGN, REM_ASSIGN, PLUS_ASSIGN, MINUS_ASSIGN);
    public static final Set<Name> BINARY_OPERATION_NAMES = C13188p0.m40533b(TIMES, PLUS, MINUS, DIV, MOD, REM, RANGE_TO);
    public static final Name COMPARE_TO;
    public static final C12815k COMPONENT_REGEX = new C12815k("component\\d+");
    public static final Name CONTAINS;
    public static final Name DEC;
    public static final Name DIV;
    public static final Name DIV_ASSIGN;
    public static final Name EQUALS;
    public static final Name GET;
    public static final Name GET_VALUE;
    public static final Name HAS_NEXT;
    public static final Name INC;
    public static final OperatorNameConventions INSTANCE = new OperatorNameConventions();
    public static final Name INVOKE;
    public static final Name ITERATOR;
    public static final Name MINUS;
    public static final Name MINUS_ASSIGN;
    public static final Name MOD;
    public static final Name MOD_ASSIGN;
    public static final Name NEXT;
    public static final Name NOT;

    /* renamed from: OR */
    public static final Name f29583OR;
    public static final Name PLUS;
    public static final Name PLUS_ASSIGN;
    public static final Name PROVIDE_DELEGATE;
    public static final Name RANGE_TO;
    public static final Name REM;
    public static final Name REM_ASSIGN;
    public static final Name SET;
    public static final Name SET_VALUE;
    public static final Set<Name> SIMPLE_UNARY_OPERATION_NAMES = C13188p0.m40533b(UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name TIMES;
    public static final Name TIMES_ASSIGN;
    public static final Name UNARY_MINUS;
    public static final Set<Name> UNARY_OPERATION_NAMES = C13188p0.m40533b(INC, DEC, UNARY_PLUS, UNARY_MINUS, NOT);
    public static final Name UNARY_PLUS;

    static {
        Name identifier = Name.identifier("getValue");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier, "Name.identifier(\"getValue\")");
        GET_VALUE = identifier;
        Name identifier2 = Name.identifier("setValue");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier2, "Name.identifier(\"setValue\")");
        SET_VALUE = identifier2;
        Name identifier3 = Name.identifier("provideDelegate");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier3, "Name.identifier(\"provideDelegate\")");
        PROVIDE_DELEGATE = identifier3;
        Name identifier4 = Name.identifier("equals");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier4, "Name.identifier(\"equals\")");
        EQUALS = identifier4;
        Name identifier5 = Name.identifier("compareTo");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier5, "Name.identifier(\"compareTo\")");
        COMPARE_TO = identifier5;
        Name identifier6 = Name.identifier("contains");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier6, "Name.identifier(\"contains\")");
        CONTAINS = identifier6;
        Name identifier7 = Name.identifier("invoke");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier7, "Name.identifier(\"invoke\")");
        INVOKE = identifier7;
        Name identifier8 = Name.identifier("iterator");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier8, "Name.identifier(\"iterator\")");
        ITERATOR = identifier8;
        Name identifier9 = Name.identifier("get");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier9, "Name.identifier(\"get\")");
        GET = identifier9;
        Name identifier10 = Name.identifier("set");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier10, "Name.identifier(\"set\")");
        SET = identifier10;
        Name identifier11 = Name.identifier("next");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier11, "Name.identifier(\"next\")");
        NEXT = identifier11;
        Name identifier12 = Name.identifier("hasNext");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier12, "Name.identifier(\"hasNext\")");
        HAS_NEXT = identifier12;
        Name identifier13 = Name.identifier("and");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier13, "Name.identifier(\"and\")");
        AND = identifier13;
        Name identifier14 = Name.identifier("or");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier14, "Name.identifier(\"or\")");
        f29583OR = identifier14;
        Name identifier15 = Name.identifier("inc");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier15, "Name.identifier(\"inc\")");
        INC = identifier15;
        Name identifier16 = Name.identifier("dec");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier16, "Name.identifier(\"dec\")");
        DEC = identifier16;
        Name identifier17 = Name.identifier("plus");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier17, "Name.identifier(\"plus\")");
        PLUS = identifier17;
        Name identifier18 = Name.identifier("minus");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier18, "Name.identifier(\"minus\")");
        MINUS = identifier18;
        Name identifier19 = Name.identifier("not");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier19, "Name.identifier(\"not\")");
        NOT = identifier19;
        Name identifier20 = Name.identifier("unaryMinus");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier20, "Name.identifier(\"unaryMinus\")");
        UNARY_MINUS = identifier20;
        Name identifier21 = Name.identifier("unaryPlus");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier21, "Name.identifier(\"unaryPlus\")");
        UNARY_PLUS = identifier21;
        Name identifier22 = Name.identifier("times");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier22, "Name.identifier(\"times\")");
        TIMES = identifier22;
        Name identifier23 = Name.identifier("div");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier23, "Name.identifier(\"div\")");
        DIV = identifier23;
        Name identifier24 = Name.identifier("mod");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier24, "Name.identifier(\"mod\")");
        MOD = identifier24;
        Name identifier25 = Name.identifier("rem");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier25, "Name.identifier(\"rem\")");
        REM = identifier25;
        Name identifier26 = Name.identifier("rangeTo");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier26, "Name.identifier(\"rangeTo\")");
        RANGE_TO = identifier26;
        Name identifier27 = Name.identifier("timesAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier27, "Name.identifier(\"timesAssign\")");
        TIMES_ASSIGN = identifier27;
        Name identifier28 = Name.identifier("divAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier28, "Name.identifier(\"divAssign\")");
        DIV_ASSIGN = identifier28;
        Name identifier29 = Name.identifier("modAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier29, "Name.identifier(\"modAssign\")");
        MOD_ASSIGN = identifier29;
        Name identifier30 = Name.identifier("remAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier30, "Name.identifier(\"remAssign\")");
        REM_ASSIGN = identifier30;
        Name identifier31 = Name.identifier("plusAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier31, "Name.identifier(\"plusAssign\")");
        PLUS_ASSIGN = identifier31;
        Name identifier32 = Name.identifier("minusAssign");
        Intrinsics.checkReturnedValueIsNotNull((Object) identifier32, "Name.identifier(\"minusAssign\")");
        MINUS_ASSIGN = identifier32;
    }

    private OperatorNameConventions() {
    }
}
