L0:     PUSH         1         ; Declaring INT i1
        PUSH         1         ; Declaring INT i2
        PUSH         1         ; Declaring INT i3
        PUSH         1         ; Declaring BOOL b1
        PUSH         1         ; Declaring BOOL b2
        PUSH         1         ; Declaring CHAR c1
        LOADA(1)     0[SB]     ; Loading address of i1
        LOADL        69        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        LOADL        105       ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        103       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        58        ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        CALL         getint    ; Reading int i1
        LOADA(1)     1[SB]     ; Loading address of i2
        LOADL        69        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        LOADL        105       ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        103       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        58        ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        CALL         getint    ; Reading int i2
        LOAD(1)      0[SB]     ; Loading i1
        CALL         putint    ; Print int
        CALL         puteol
        LOAD(1)      1[SB]     ; Loading i2
        CALL         putint    ; Print int
        CALL         puteol
        LOADA(1)     0[SB]     ; Loading address of i1
        LOADL        69        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        LOADL        105       ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        103       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        58        ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        CALL         getint    ; Reading int i1
        LOAD(1)      0[SB]     ; Loading i1 for next expression
        STORE(1)     2[SB]     ; Assigning i3
        LOAD(1)      2[SB]     ; Loading i3
        CALL         putint    ; Print int
        CALL         puteol
        LOAD(1)      0[SB]     ; Loading i1
        CALL         putint    ; Print int
        CALL         puteol
        LOADA(1)     3[SB]     ; Loading address of b1
        LOADL        69        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        LOADL        98        ; Loading character
        CALL         put       ; Print character
        LOADL        111       ; Loading character
        CALL         put       ; Print character
        LOADL        111       ; Loading character
        CALL         put       ; Print character
        LOADL        108       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        97        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        58        ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        CALL         getint    ; Reading boolean b1
        LOADA(1)     5[SB]     ; Loading address of c1
        LOADL        69        ; Loading character
        CALL         put       ; Print character
        LOADL        110       ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        LOADL        99        ; Loading character
        CALL         put       ; Print character
        LOADL        104       ; Loading character
        CALL         put       ; Print character
        LOADL        97        ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        97        ; Loading character
        CALL         put       ; Print character
        LOADL        99        ; Loading character
        CALL         put       ; Print character
        LOADL        116       ; Loading character
        CALL         put       ; Print character
        LOADL        101       ; Loading character
        CALL         put       ; Print character
        LOADL        114       ; Loading character
        CALL         put       ; Print character
        LOADL        58        ; Loading character
        CALL         put       ; Print character
        LOADL        32        ; Loading character
        CALL         put       ; Print character
        CALL         get       ; Reading character c1
        PUSH         1         ; Pushing for helper register 
        LOAD(1)      3[SB]     ; Loading b1
        STORE(1)     6[SB]     ; Assigning temp
        LOAD(1)      6[SB]     ; Loading temp
        CALL         putint    ; Print boolean
        CALL         puteol
        LOAD(1)      6[SB]     ; Loading temp
        STORE(1)     4[SB]     ; Assigning b2
        LOAD(1)      4[SB]     ; Loading b2
        CALL         putint    ; Print boolean
        CALL         puteol
        LOAD(1)      5[SB]     ; Loading c1
        CALL         put       ; Print character
        CALL         puteol
        LOADL        12
        LOADL        5
        CALL         div       ; Devide
        LOADL        5
        CALL         mult      ; Multiplication
        LOADL        12
        LOADL        5
        CALL         mod       ; Modulo
        CALL         add       ; Adition
        LOADL        12
        LOADL        1
        CALL         eq
        LOADL        6
        LOADL        6
        CALL         ge        ; Greater than or equal
        CALL         and
        CALL         putint    ; Print boolean
        CALL         puteol
        LOADL        16
        LOADL        2
        LOADL        8
        CALL         neg       ; Integer negation
        CALL         mult      ; Multiplication
        CALL         add       ; Adition
        CALL         putint    ; Print int
        CALL         puteol
        PUSH         1         ; Pushing for helper register 
        LOADL        16
        LOADL        2
        LOADL        8
        CALL         neg       ; Integer negation
        CALL         mult      ; Multiplication
        CALL         add       ; Adition
        LOADL        0
        LOADL        1
        CALL         eq
        STORE(1)     7[SB]     ; Assigning temp
        LOAD(1)      7[SB]     ; Loading temp
        CALL         putint    ; Print boolean
        CALL         puteol
        LOAD(1)      7[SB]     ; Loading temp
        STORE(1)     3[SB]     ; Assigning b1
        LOAD(1)      3[SB]     ; Loading b1
        CALL         putint    ; Print boolean
        CALL         puteol
        POP(0)       8
        HALT                   ; Generated by the Noot Compiler (2013/07/08 17:23)
