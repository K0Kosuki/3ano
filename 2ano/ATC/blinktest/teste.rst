                                      1 ;--------------------------------------------------------
                                      2 ; File Created by SDCC : free open source ANSI-C Compiler
                                      3 ; Version 4.2.0 #13081 (MINGW64)
                                      4 ;--------------------------------------------------------
                                      5 	.module teste
                                      6 	.optsdcc -mmcs51 --model-small
                                      7 	
                                      8 ;--------------------------------------------------------
                                      9 ; Public variables in this module
                                     10 ;--------------------------------------------------------
                                     11 	.globl _main
                                     12 	.globl _sdelay
                                     13 	.globl _SPIEN
                                     14 	.globl _TXBMT
                                     15 	.globl _NSSMD0
                                     16 	.globl _NSSMD1
                                     17 	.globl _RXOVRN
                                     18 	.globl _MODF
                                     19 	.globl _WCOL
                                     20 	.globl _SPIF
                                     21 	.globl _AD0CM0
                                     22 	.globl _AD0CM1
                                     23 	.globl _AD0CM2
                                     24 	.globl _AD0WINT
                                     25 	.globl _AD0BUSY
                                     26 	.globl _AD0INT
                                     27 	.globl _AD0TM
                                     28 	.globl _AD0EN
                                     29 	.globl _CCF0
                                     30 	.globl _CCF1
                                     31 	.globl _CCF2
                                     32 	.globl _CCF3
                                     33 	.globl _CCF4
                                     34 	.globl _CR
                                     35 	.globl _CF
                                     36 	.globl _PARITY
                                     37 	.globl _F1
                                     38 	.globl _OV
                                     39 	.globl _RS0
                                     40 	.globl _RS1
                                     41 	.globl _F0
                                     42 	.globl _AC
                                     43 	.globl _CY
                                     44 	.globl _T5XCLK
                                     45 	.globl _TR5
                                     46 	.globl _T5SPLIT
                                     47 	.globl _TF5LEN
                                     48 	.globl _TF5L
                                     49 	.globl _TF5H
                                     50 	.globl _T2XCLK
                                     51 	.globl _T2CSS
                                     52 	.globl _TR2
                                     53 	.globl _T2SPLIT
                                     54 	.globl _TF2CEN
                                     55 	.globl _TF2LEN
                                     56 	.globl _TF2L
                                     57 	.globl _TF2H
                                     58 	.globl _SI1
                                     59 	.globl _ACK1
                                     60 	.globl _ARBLOST1
                                     61 	.globl _ACKRQ1
                                     62 	.globl _STO1
                                     63 	.globl _STA1
                                     64 	.globl _TXMODE1
                                     65 	.globl _MASTER1
                                     66 	.globl _SI0
                                     67 	.globl _ACK0
                                     68 	.globl _ARBLOST0
                                     69 	.globl _ACKRQ0
                                     70 	.globl _STO0
                                     71 	.globl _STA0
                                     72 	.globl _TXMODE0
                                     73 	.globl _MASTER0
                                     74 	.globl _PX0
                                     75 	.globl _PT0
                                     76 	.globl _PX1
                                     77 	.globl _PT1
                                     78 	.globl _PS0
                                     79 	.globl _PT2
                                     80 	.globl _PSPI0
                                     81 	.globl _P3_7
                                     82 	.globl _P3_6
                                     83 	.globl _P3_5
                                     84 	.globl _P3_4
                                     85 	.globl _P3_3
                                     86 	.globl _P3_2
                                     87 	.globl _P3_1
                                     88 	.globl _P3_0
                                     89 	.globl _EX0
                                     90 	.globl _ET0
                                     91 	.globl _EX1
                                     92 	.globl _ET1
                                     93 	.globl _ES0
                                     94 	.globl _ET2
                                     95 	.globl _ESPI0
                                     96 	.globl _EA
                                     97 	.globl _P2_7
                                     98 	.globl _P2_6
                                     99 	.globl _P2_5
                                    100 	.globl _P2_4
                                    101 	.globl _P2_3
                                    102 	.globl _P2_2
                                    103 	.globl _P2_1
                                    104 	.globl _P2_0
                                    105 	.globl _RI0
                                    106 	.globl _TI0
                                    107 	.globl _RB80
                                    108 	.globl _TB80
                                    109 	.globl _REN0
                                    110 	.globl _MCE0
                                    111 	.globl _S0MODE
                                    112 	.globl _P1_7
                                    113 	.globl _P1_6
                                    114 	.globl _P1_5
                                    115 	.globl _P1_4
                                    116 	.globl _P1_3
                                    117 	.globl _P1_2
                                    118 	.globl _P1_1
                                    119 	.globl _P1_0
                                    120 	.globl _IT0
                                    121 	.globl _IE0
                                    122 	.globl _IT1
                                    123 	.globl _IE1
                                    124 	.globl _TR0
                                    125 	.globl _TF0
                                    126 	.globl _TR1
                                    127 	.globl _TF1
                                    128 	.globl _P0_7
                                    129 	.globl _P0_6
                                    130 	.globl _P0_5
                                    131 	.globl _P0_4
                                    132 	.globl _P0_3
                                    133 	.globl _P0_2
                                    134 	.globl _P0_1
                                    135 	.globl _P0_0
                                    136 	.globl _PCA0CP4
                                    137 	.globl _PCA0CP0
                                    138 	.globl _PCA0
                                    139 	.globl _PCA0CP3
                                    140 	.globl _PCA0CP2
                                    141 	.globl _PCA0CP1
                                    142 	.globl _TMR5
                                    143 	.globl _TMR2
                                    144 	.globl _TMR5RL
                                    145 	.globl _TMR2RL
                                    146 	.globl _ADC0LT
                                    147 	.globl _ADC0GT
                                    148 	.globl _ADC0
                                    149 	.globl _SBRL1
                                    150 	.globl _TMR4
                                    151 	.globl _TMR3
                                    152 	.globl _TMR4RL
                                    153 	.globl _TMR3RL
                                    154 	.globl _DP
                                    155 	.globl _VDM0CN
                                    156 	.globl _PCA0CPH4
                                    157 	.globl _PCA0CPL4
                                    158 	.globl _PCA0CPH0
                                    159 	.globl _PCA0CPL0
                                    160 	.globl _PCA0H
                                    161 	.globl _PCA0L
                                    162 	.globl _SPI0CN
                                    163 	.globl _EIP2
                                    164 	.globl _EIP1
                                    165 	.globl _P4MDIN
                                    166 	.globl _P3MDIN
                                    167 	.globl _P2MDIN
                                    168 	.globl _P1MDIN
                                    169 	.globl _P0MDIN
                                    170 	.globl _B
                                    171 	.globl _RSTSRC
                                    172 	.globl _PCA0CPH3
                                    173 	.globl _PCA0CPL3
                                    174 	.globl _PCA0CPH2
                                    175 	.globl _PCA0CPL2
                                    176 	.globl _PCA0CPH1
                                    177 	.globl _PCA0CPL1
                                    178 	.globl _ADC0CN
                                    179 	.globl _CKCON1
                                    180 	.globl _EIE2
                                    181 	.globl _EIE1
                                    182 	.globl _SMOD1
                                    183 	.globl _IT01CF
                                    184 	.globl _XBR2
                                    185 	.globl _XBR1
                                    186 	.globl _XBR0
                                    187 	.globl _ACC
                                    188 	.globl _P3SKIP
                                    189 	.globl _PCA0CPM4
                                    190 	.globl _PCA0CPM3
                                    191 	.globl _PCA0CPM2
                                    192 	.globl _PCA0CPM1
                                    193 	.globl _PCA0CPM0
                                    194 	.globl _PCA0MD
                                    195 	.globl _PCA0CN
                                    196 	.globl _USB0XCN
                                    197 	.globl _P2SKIP
                                    198 	.globl _P1SKIP
                                    199 	.globl _P0SKIP
                                    200 	.globl _SBUF1
                                    201 	.globl _SCON1
                                    202 	.globl _REF0CN
                                    203 	.globl _PSW
                                    204 	.globl _SMB1ADR
                                    205 	.globl _SMB1ADM
                                    206 	.globl _TMR5H
                                    207 	.globl _TMR5L
                                    208 	.globl _TMR5RLH
                                    209 	.globl _TMR5RLL
                                    210 	.globl _TMR5CN
                                    211 	.globl _SMB0ADR
                                    212 	.globl _SMB0ADM
                                    213 	.globl _TMR2H
                                    214 	.globl _TH2
                                    215 	.globl _TMR2L
                                    216 	.globl _TL2
                                    217 	.globl _TMR2RLH
                                    218 	.globl _RCAP2H
                                    219 	.globl _TMR2RLL
                                    220 	.globl _RCAP2L
                                    221 	.globl _REG01CN
                                    222 	.globl _TMR2CN
                                    223 	.globl _T2CON
                                    224 	.globl _SMB1DAT
                                    225 	.globl _SMB1CF
                                    226 	.globl _SMB1CN
                                    227 	.globl _P4
                                    228 	.globl _ADC0LTH
                                    229 	.globl _ADC0LTL
                                    230 	.globl _ADC0GTH
                                    231 	.globl _ADC0GTL
                                    232 	.globl _SMB0DAT
                                    233 	.globl _SMB0CF
                                    234 	.globl _SMB0CN
                                    235 	.globl _SMBTC
                                    236 	.globl _SFRPAGE
                                    237 	.globl _ADC0H
                                    238 	.globl _ADC0L
                                    239 	.globl _ADC0CF
                                    240 	.globl _AMX0P
                                    241 	.globl _AMX0N
                                    242 	.globl _CLKMUL
                                    243 	.globl _IP
                                    244 	.globl _FLKEY
                                    245 	.globl _FLSCL
                                    246 	.globl _SBRLH1
                                    247 	.globl _SBRLL1
                                    248 	.globl _OSCICL
                                    249 	.globl _OSCICN
                                    250 	.globl _OSCXCN
                                    251 	.globl _P3
                                    252 	.globl _PFE0CN
                                    253 	.globl _P4MDOUT
                                    254 	.globl _SBCON1
                                    255 	.globl __XPAGE
                                    256 	.globl _EMI0CN
                                    257 	.globl _CLKSEL
                                    258 	.globl _IE
                                    259 	.globl _P3MDOUT
                                    260 	.globl _P2MDOUT
                                    261 	.globl _P1MDOUT
                                    262 	.globl _P0MDOUT
                                    263 	.globl _SPI0DAT
                                    264 	.globl _SPI0CKR
                                    265 	.globl _SPI0CFG
                                    266 	.globl _P2
                                    267 	.globl _CPT0MX
                                    268 	.globl _CPT1MX
                                    269 	.globl _CPT0MD
                                    270 	.globl _CPT1MD
                                    271 	.globl _CPT0CN
                                    272 	.globl _CPT1CN
                                    273 	.globl _SBUF0
                                    274 	.globl _SCON0
                                    275 	.globl _TMR4RLH
                                    276 	.globl _TMR4RLL
                                    277 	.globl _TMR4CN
                                    278 	.globl _USB0DAT
                                    279 	.globl _USB0ADR
                                    280 	.globl _TMR3H
                                    281 	.globl _TMR3L
                                    282 	.globl _TMR3RLH
                                    283 	.globl _TMR3RLL
                                    284 	.globl _TMR3CN
                                    285 	.globl _P1
                                    286 	.globl _PSCTL
                                    287 	.globl _CKCON
                                    288 	.globl _TH1
                                    289 	.globl _TH0
                                    290 	.globl _TL1
                                    291 	.globl _TL0
                                    292 	.globl _TMOD
                                    293 	.globl _TCON
                                    294 	.globl _PCON
                                    295 	.globl _OSCLCN
                                    296 	.globl _EMI0CF
                                    297 	.globl _EMI0TC
                                    298 	.globl _DPH
                                    299 	.globl _DPL
                                    300 	.globl _SP
                                    301 	.globl _P0
                                    302 ;--------------------------------------------------------
                                    303 ; special function registers
                                    304 ;--------------------------------------------------------
                                    305 	.area RSEG    (ABS,DATA)
      000000                        306 	.org 0x0000
                           000080   307 G$P0$0_0$0 == 0x0080
                           000080   308 _P0	=	0x0080
                           000081   309 G$SP$0_0$0 == 0x0081
                           000081   310 _SP	=	0x0081
                           000082   311 G$DPL$0_0$0 == 0x0082
                           000082   312 _DPL	=	0x0082
                           000083   313 G$DPH$0_0$0 == 0x0083
                           000083   314 _DPH	=	0x0083
                           000084   315 G$EMI0TC$0_0$0 == 0x0084
                           000084   316 _EMI0TC	=	0x0084
                           000085   317 G$EMI0CF$0_0$0 == 0x0085
                           000085   318 _EMI0CF	=	0x0085
                           000086   319 G$OSCLCN$0_0$0 == 0x0086
                           000086   320 _OSCLCN	=	0x0086
                           000087   321 G$PCON$0_0$0 == 0x0087
                           000087   322 _PCON	=	0x0087
                           000088   323 G$TCON$0_0$0 == 0x0088
                           000088   324 _TCON	=	0x0088
                           000089   325 G$TMOD$0_0$0 == 0x0089
                           000089   326 _TMOD	=	0x0089
                           00008A   327 G$TL0$0_0$0 == 0x008a
                           00008A   328 _TL0	=	0x008a
                           00008B   329 G$TL1$0_0$0 == 0x008b
                           00008B   330 _TL1	=	0x008b
                           00008C   331 G$TH0$0_0$0 == 0x008c
                           00008C   332 _TH0	=	0x008c
                           00008D   333 G$TH1$0_0$0 == 0x008d
                           00008D   334 _TH1	=	0x008d
                           00008E   335 G$CKCON$0_0$0 == 0x008e
                           00008E   336 _CKCON	=	0x008e
                           00008F   337 G$PSCTL$0_0$0 == 0x008f
                           00008F   338 _PSCTL	=	0x008f
                           000090   339 G$P1$0_0$0 == 0x0090
                           000090   340 _P1	=	0x0090
                           000091   341 G$TMR3CN$0_0$0 == 0x0091
                           000091   342 _TMR3CN	=	0x0091
                           000092   343 G$TMR3RLL$0_0$0 == 0x0092
                           000092   344 _TMR3RLL	=	0x0092
                           000093   345 G$TMR3RLH$0_0$0 == 0x0093
                           000093   346 _TMR3RLH	=	0x0093
                           000094   347 G$TMR3L$0_0$0 == 0x0094
                           000094   348 _TMR3L	=	0x0094
                           000095   349 G$TMR3H$0_0$0 == 0x0095
                           000095   350 _TMR3H	=	0x0095
                           000096   351 G$USB0ADR$0_0$0 == 0x0096
                           000096   352 _USB0ADR	=	0x0096
                           000097   353 G$USB0DAT$0_0$0 == 0x0097
                           000097   354 _USB0DAT	=	0x0097
                           000091   355 G$TMR4CN$0_0$0 == 0x0091
                           000091   356 _TMR4CN	=	0x0091
                           000092   357 G$TMR4RLL$0_0$0 == 0x0092
                           000092   358 _TMR4RLL	=	0x0092
                           000093   359 G$TMR4RLH$0_0$0 == 0x0093
                           000093   360 _TMR4RLH	=	0x0093
                           000098   361 G$SCON0$0_0$0 == 0x0098
                           000098   362 _SCON0	=	0x0098
                           000099   363 G$SBUF0$0_0$0 == 0x0099
                           000099   364 _SBUF0	=	0x0099
                           00009A   365 G$CPT1CN$0_0$0 == 0x009a
                           00009A   366 _CPT1CN	=	0x009a
                           00009B   367 G$CPT0CN$0_0$0 == 0x009b
                           00009B   368 _CPT0CN	=	0x009b
                           00009C   369 G$CPT1MD$0_0$0 == 0x009c
                           00009C   370 _CPT1MD	=	0x009c
                           00009D   371 G$CPT0MD$0_0$0 == 0x009d
                           00009D   372 _CPT0MD	=	0x009d
                           00009E   373 G$CPT1MX$0_0$0 == 0x009e
                           00009E   374 _CPT1MX	=	0x009e
                           00009F   375 G$CPT0MX$0_0$0 == 0x009f
                           00009F   376 _CPT0MX	=	0x009f
                           0000A0   377 G$P2$0_0$0 == 0x00a0
                           0000A0   378 _P2	=	0x00a0
                           0000A1   379 G$SPI0CFG$0_0$0 == 0x00a1
                           0000A1   380 _SPI0CFG	=	0x00a1
                           0000A2   381 G$SPI0CKR$0_0$0 == 0x00a2
                           0000A2   382 _SPI0CKR	=	0x00a2
                           0000A3   383 G$SPI0DAT$0_0$0 == 0x00a3
                           0000A3   384 _SPI0DAT	=	0x00a3
                           0000A4   385 G$P0MDOUT$0_0$0 == 0x00a4
                           0000A4   386 _P0MDOUT	=	0x00a4
                           0000A5   387 G$P1MDOUT$0_0$0 == 0x00a5
                           0000A5   388 _P1MDOUT	=	0x00a5
                           0000A6   389 G$P2MDOUT$0_0$0 == 0x00a6
                           0000A6   390 _P2MDOUT	=	0x00a6
                           0000A7   391 G$P3MDOUT$0_0$0 == 0x00a7
                           0000A7   392 _P3MDOUT	=	0x00a7
                           0000A8   393 G$IE$0_0$0 == 0x00a8
                           0000A8   394 _IE	=	0x00a8
                           0000A9   395 G$CLKSEL$0_0$0 == 0x00a9
                           0000A9   396 _CLKSEL	=	0x00a9
                           0000AA   397 G$EMI0CN$0_0$0 == 0x00aa
                           0000AA   398 _EMI0CN	=	0x00aa
                           0000AA   399 G$_XPAGE$0_0$0 == 0x00aa
                           0000AA   400 __XPAGE	=	0x00aa
                           0000AC   401 G$SBCON1$0_0$0 == 0x00ac
                           0000AC   402 _SBCON1	=	0x00ac
                           0000AE   403 G$P4MDOUT$0_0$0 == 0x00ae
                           0000AE   404 _P4MDOUT	=	0x00ae
                           0000AF   405 G$PFE0CN$0_0$0 == 0x00af
                           0000AF   406 _PFE0CN	=	0x00af
                           0000B0   407 G$P3$0_0$0 == 0x00b0
                           0000B0   408 _P3	=	0x00b0
                           0000B1   409 G$OSCXCN$0_0$0 == 0x00b1
                           0000B1   410 _OSCXCN	=	0x00b1
                           0000B2   411 G$OSCICN$0_0$0 == 0x00b2
                           0000B2   412 _OSCICN	=	0x00b2
                           0000B3   413 G$OSCICL$0_0$0 == 0x00b3
                           0000B3   414 _OSCICL	=	0x00b3
                           0000B4   415 G$SBRLL1$0_0$0 == 0x00b4
                           0000B4   416 _SBRLL1	=	0x00b4
                           0000B5   417 G$SBRLH1$0_0$0 == 0x00b5
                           0000B5   418 _SBRLH1	=	0x00b5
                           0000B6   419 G$FLSCL$0_0$0 == 0x00b6
                           0000B6   420 _FLSCL	=	0x00b6
                           0000B7   421 G$FLKEY$0_0$0 == 0x00b7
                           0000B7   422 _FLKEY	=	0x00b7
                           0000B8   423 G$IP$0_0$0 == 0x00b8
                           0000B8   424 _IP	=	0x00b8
                           0000B9   425 G$CLKMUL$0_0$0 == 0x00b9
                           0000B9   426 _CLKMUL	=	0x00b9
                           0000BA   427 G$AMX0N$0_0$0 == 0x00ba
                           0000BA   428 _AMX0N	=	0x00ba
                           0000BB   429 G$AMX0P$0_0$0 == 0x00bb
                           0000BB   430 _AMX0P	=	0x00bb
                           0000BC   431 G$ADC0CF$0_0$0 == 0x00bc
                           0000BC   432 _ADC0CF	=	0x00bc
                           0000BD   433 G$ADC0L$0_0$0 == 0x00bd
                           0000BD   434 _ADC0L	=	0x00bd
                           0000BE   435 G$ADC0H$0_0$0 == 0x00be
                           0000BE   436 _ADC0H	=	0x00be
                           0000BF   437 G$SFRPAGE$0_0$0 == 0x00bf
                           0000BF   438 _SFRPAGE	=	0x00bf
                           0000B9   439 G$SMBTC$0_0$0 == 0x00b9
                           0000B9   440 _SMBTC	=	0x00b9
                           0000C0   441 G$SMB0CN$0_0$0 == 0x00c0
                           0000C0   442 _SMB0CN	=	0x00c0
                           0000C1   443 G$SMB0CF$0_0$0 == 0x00c1
                           0000C1   444 _SMB0CF	=	0x00c1
                           0000C2   445 G$SMB0DAT$0_0$0 == 0x00c2
                           0000C2   446 _SMB0DAT	=	0x00c2
                           0000C3   447 G$ADC0GTL$0_0$0 == 0x00c3
                           0000C3   448 _ADC0GTL	=	0x00c3
                           0000C4   449 G$ADC0GTH$0_0$0 == 0x00c4
                           0000C4   450 _ADC0GTH	=	0x00c4
                           0000C5   451 G$ADC0LTL$0_0$0 == 0x00c5
                           0000C5   452 _ADC0LTL	=	0x00c5
                           0000C6   453 G$ADC0LTH$0_0$0 == 0x00c6
                           0000C6   454 _ADC0LTH	=	0x00c6
                           0000C7   455 G$P4$0_0$0 == 0x00c7
                           0000C7   456 _P4	=	0x00c7
                           0000C0   457 G$SMB1CN$0_0$0 == 0x00c0
                           0000C0   458 _SMB1CN	=	0x00c0
                           0000C1   459 G$SMB1CF$0_0$0 == 0x00c1
                           0000C1   460 _SMB1CF	=	0x00c1
                           0000C2   461 G$SMB1DAT$0_0$0 == 0x00c2
                           0000C2   462 _SMB1DAT	=	0x00c2
                           0000C8   463 G$T2CON$0_0$0 == 0x00c8
                           0000C8   464 _T2CON	=	0x00c8
                           0000C8   465 G$TMR2CN$0_0$0 == 0x00c8
                           0000C8   466 _TMR2CN	=	0x00c8
                           0000C9   467 G$REG01CN$0_0$0 == 0x00c9
                           0000C9   468 _REG01CN	=	0x00c9
                           0000CA   469 G$RCAP2L$0_0$0 == 0x00ca
                           0000CA   470 _RCAP2L	=	0x00ca
                           0000CA   471 G$TMR2RLL$0_0$0 == 0x00ca
                           0000CA   472 _TMR2RLL	=	0x00ca
                           0000CB   473 G$RCAP2H$0_0$0 == 0x00cb
                           0000CB   474 _RCAP2H	=	0x00cb
                           0000CB   475 G$TMR2RLH$0_0$0 == 0x00cb
                           0000CB   476 _TMR2RLH	=	0x00cb
                           0000CC   477 G$TL2$0_0$0 == 0x00cc
                           0000CC   478 _TL2	=	0x00cc
                           0000CC   479 G$TMR2L$0_0$0 == 0x00cc
                           0000CC   480 _TMR2L	=	0x00cc
                           0000CD   481 G$TH2$0_0$0 == 0x00cd
                           0000CD   482 _TH2	=	0x00cd
                           0000CD   483 G$TMR2H$0_0$0 == 0x00cd
                           0000CD   484 _TMR2H	=	0x00cd
                           0000CE   485 G$SMB0ADM$0_0$0 == 0x00ce
                           0000CE   486 _SMB0ADM	=	0x00ce
                           0000CF   487 G$SMB0ADR$0_0$0 == 0x00cf
                           0000CF   488 _SMB0ADR	=	0x00cf
                           0000C8   489 G$TMR5CN$0_0$0 == 0x00c8
                           0000C8   490 _TMR5CN	=	0x00c8
                           0000CA   491 G$TMR5RLL$0_0$0 == 0x00ca
                           0000CA   492 _TMR5RLL	=	0x00ca
                           0000CB   493 G$TMR5RLH$0_0$0 == 0x00cb
                           0000CB   494 _TMR5RLH	=	0x00cb
                           0000CC   495 G$TMR5L$0_0$0 == 0x00cc
                           0000CC   496 _TMR5L	=	0x00cc
                           0000CD   497 G$TMR5H$0_0$0 == 0x00cd
                           0000CD   498 _TMR5H	=	0x00cd
                           0000CE   499 G$SMB1ADM$0_0$0 == 0x00ce
                           0000CE   500 _SMB1ADM	=	0x00ce
                           0000CF   501 G$SMB1ADR$0_0$0 == 0x00cf
                           0000CF   502 _SMB1ADR	=	0x00cf
                           0000D0   503 G$PSW$0_0$0 == 0x00d0
                           0000D0   504 _PSW	=	0x00d0
                           0000D1   505 G$REF0CN$0_0$0 == 0x00d1
                           0000D1   506 _REF0CN	=	0x00d1
                           0000D2   507 G$SCON1$0_0$0 == 0x00d2
                           0000D2   508 _SCON1	=	0x00d2
                           0000D3   509 G$SBUF1$0_0$0 == 0x00d3
                           0000D3   510 _SBUF1	=	0x00d3
                           0000D4   511 G$P0SKIP$0_0$0 == 0x00d4
                           0000D4   512 _P0SKIP	=	0x00d4
                           0000D5   513 G$P1SKIP$0_0$0 == 0x00d5
                           0000D5   514 _P1SKIP	=	0x00d5
                           0000D6   515 G$P2SKIP$0_0$0 == 0x00d6
                           0000D6   516 _P2SKIP	=	0x00d6
                           0000D7   517 G$USB0XCN$0_0$0 == 0x00d7
                           0000D7   518 _USB0XCN	=	0x00d7
                           0000D8   519 G$PCA0CN$0_0$0 == 0x00d8
                           0000D8   520 _PCA0CN	=	0x00d8
                           0000D9   521 G$PCA0MD$0_0$0 == 0x00d9
                           0000D9   522 _PCA0MD	=	0x00d9
                           0000DA   523 G$PCA0CPM0$0_0$0 == 0x00da
                           0000DA   524 _PCA0CPM0	=	0x00da
                           0000DB   525 G$PCA0CPM1$0_0$0 == 0x00db
                           0000DB   526 _PCA0CPM1	=	0x00db
                           0000DC   527 G$PCA0CPM2$0_0$0 == 0x00dc
                           0000DC   528 _PCA0CPM2	=	0x00dc
                           0000DD   529 G$PCA0CPM3$0_0$0 == 0x00dd
                           0000DD   530 _PCA0CPM3	=	0x00dd
                           0000DE   531 G$PCA0CPM4$0_0$0 == 0x00de
                           0000DE   532 _PCA0CPM4	=	0x00de
                           0000DF   533 G$P3SKIP$0_0$0 == 0x00df
                           0000DF   534 _P3SKIP	=	0x00df
                           0000E0   535 G$ACC$0_0$0 == 0x00e0
                           0000E0   536 _ACC	=	0x00e0
                           0000E1   537 G$XBR0$0_0$0 == 0x00e1
                           0000E1   538 _XBR0	=	0x00e1
                           0000E2   539 G$XBR1$0_0$0 == 0x00e2
                           0000E2   540 _XBR1	=	0x00e2
                           0000E3   541 G$XBR2$0_0$0 == 0x00e3
                           0000E3   542 _XBR2	=	0x00e3
                           0000E4   543 G$IT01CF$0_0$0 == 0x00e4
                           0000E4   544 _IT01CF	=	0x00e4
                           0000E5   545 G$SMOD1$0_0$0 == 0x00e5
                           0000E5   546 _SMOD1	=	0x00e5
                           0000E6   547 G$EIE1$0_0$0 == 0x00e6
                           0000E6   548 _EIE1	=	0x00e6
                           0000E7   549 G$EIE2$0_0$0 == 0x00e7
                           0000E7   550 _EIE2	=	0x00e7
                           0000E4   551 G$CKCON1$0_0$0 == 0x00e4
                           0000E4   552 _CKCON1	=	0x00e4
                           0000E8   553 G$ADC0CN$0_0$0 == 0x00e8
                           0000E8   554 _ADC0CN	=	0x00e8
                           0000E9   555 G$PCA0CPL1$0_0$0 == 0x00e9
                           0000E9   556 _PCA0CPL1	=	0x00e9
                           0000EA   557 G$PCA0CPH1$0_0$0 == 0x00ea
                           0000EA   558 _PCA0CPH1	=	0x00ea
                           0000EB   559 G$PCA0CPL2$0_0$0 == 0x00eb
                           0000EB   560 _PCA0CPL2	=	0x00eb
                           0000EC   561 G$PCA0CPH2$0_0$0 == 0x00ec
                           0000EC   562 _PCA0CPH2	=	0x00ec
                           0000ED   563 G$PCA0CPL3$0_0$0 == 0x00ed
                           0000ED   564 _PCA0CPL3	=	0x00ed
                           0000EE   565 G$PCA0CPH3$0_0$0 == 0x00ee
                           0000EE   566 _PCA0CPH3	=	0x00ee
                           0000EF   567 G$RSTSRC$0_0$0 == 0x00ef
                           0000EF   568 _RSTSRC	=	0x00ef
                           0000F0   569 G$B$0_0$0 == 0x00f0
                           0000F0   570 _B	=	0x00f0
                           0000F1   571 G$P0MDIN$0_0$0 == 0x00f1
                           0000F1   572 _P0MDIN	=	0x00f1
                           0000F2   573 G$P1MDIN$0_0$0 == 0x00f2
                           0000F2   574 _P1MDIN	=	0x00f2
                           0000F3   575 G$P2MDIN$0_0$0 == 0x00f3
                           0000F3   576 _P2MDIN	=	0x00f3
                           0000F4   577 G$P3MDIN$0_0$0 == 0x00f4
                           0000F4   578 _P3MDIN	=	0x00f4
                           0000F5   579 G$P4MDIN$0_0$0 == 0x00f5
                           0000F5   580 _P4MDIN	=	0x00f5
                           0000F6   581 G$EIP1$0_0$0 == 0x00f6
                           0000F6   582 _EIP1	=	0x00f6
                           0000F7   583 G$EIP2$0_0$0 == 0x00f7
                           0000F7   584 _EIP2	=	0x00f7
                           0000F8   585 G$SPI0CN$0_0$0 == 0x00f8
                           0000F8   586 _SPI0CN	=	0x00f8
                           0000F9   587 G$PCA0L$0_0$0 == 0x00f9
                           0000F9   588 _PCA0L	=	0x00f9
                           0000FA   589 G$PCA0H$0_0$0 == 0x00fa
                           0000FA   590 _PCA0H	=	0x00fa
                           0000FB   591 G$PCA0CPL0$0_0$0 == 0x00fb
                           0000FB   592 _PCA0CPL0	=	0x00fb
                           0000FC   593 G$PCA0CPH0$0_0$0 == 0x00fc
                           0000FC   594 _PCA0CPH0	=	0x00fc
                           0000FD   595 G$PCA0CPL4$0_0$0 == 0x00fd
                           0000FD   596 _PCA0CPL4	=	0x00fd
                           0000FE   597 G$PCA0CPH4$0_0$0 == 0x00fe
                           0000FE   598 _PCA0CPH4	=	0x00fe
                           0000FF   599 G$VDM0CN$0_0$0 == 0x00ff
                           0000FF   600 _VDM0CN	=	0x00ff
                           008382   601 G$DP$0_0$0 == 0x8382
                           008382   602 _DP	=	0x8382
                           009392   603 G$TMR3RL$0_0$0 == 0x9392
                           009392   604 _TMR3RL	=	0x9392
                           009392   605 G$TMR4RL$0_0$0 == 0x9392
                           009392   606 _TMR4RL	=	0x9392
                           009594   607 G$TMR3$0_0$0 == 0x9594
                           009594   608 _TMR3	=	0x9594
                           009594   609 G$TMR4$0_0$0 == 0x9594
                           009594   610 _TMR4	=	0x9594
                           00B5B4   611 G$SBRL1$0_0$0 == 0xb5b4
                           00B5B4   612 _SBRL1	=	0xb5b4
                           00BEBD   613 G$ADC0$0_0$0 == 0xbebd
                           00BEBD   614 _ADC0	=	0xbebd
                           00C4C3   615 G$ADC0GT$0_0$0 == 0xc4c3
                           00C4C3   616 _ADC0GT	=	0xc4c3
                           00C6C5   617 G$ADC0LT$0_0$0 == 0xc6c5
                           00C6C5   618 _ADC0LT	=	0xc6c5
                           00CBCA   619 G$TMR2RL$0_0$0 == 0xcbca
                           00CBCA   620 _TMR2RL	=	0xcbca
                           00CBCA   621 G$TMR5RL$0_0$0 == 0xcbca
                           00CBCA   622 _TMR5RL	=	0xcbca
                           00CDCC   623 G$TMR2$0_0$0 == 0xcdcc
                           00CDCC   624 _TMR2	=	0xcdcc
                           00CDCC   625 G$TMR5$0_0$0 == 0xcdcc
                           00CDCC   626 _TMR5	=	0xcdcc
                           00EAE9   627 G$PCA0CP1$0_0$0 == 0xeae9
                           00EAE9   628 _PCA0CP1	=	0xeae9
                           00ECEB   629 G$PCA0CP2$0_0$0 == 0xeceb
                           00ECEB   630 _PCA0CP2	=	0xeceb
                           00EEED   631 G$PCA0CP3$0_0$0 == 0xeeed
                           00EEED   632 _PCA0CP3	=	0xeeed
                           00FAF9   633 G$PCA0$0_0$0 == 0xfaf9
                           00FAF9   634 _PCA0	=	0xfaf9
                           00FCFB   635 G$PCA0CP0$0_0$0 == 0xfcfb
                           00FCFB   636 _PCA0CP0	=	0xfcfb
                           00FEFD   637 G$PCA0CP4$0_0$0 == 0xfefd
                           00FEFD   638 _PCA0CP4	=	0xfefd
                                    639 ;--------------------------------------------------------
                                    640 ; special function bits
                                    641 ;--------------------------------------------------------
                                    642 	.area RSEG    (ABS,DATA)
      000000                        643 	.org 0x0000
                           000080   644 G$P0_0$0_0$0 == 0x0080
                           000080   645 _P0_0	=	0x0080
                           000081   646 G$P0_1$0_0$0 == 0x0081
                           000081   647 _P0_1	=	0x0081
                           000082   648 G$P0_2$0_0$0 == 0x0082
                           000082   649 _P0_2	=	0x0082
                           000083   650 G$P0_3$0_0$0 == 0x0083
                           000083   651 _P0_3	=	0x0083
                           000084   652 G$P0_4$0_0$0 == 0x0084
                           000084   653 _P0_4	=	0x0084
                           000085   654 G$P0_5$0_0$0 == 0x0085
                           000085   655 _P0_5	=	0x0085
                           000086   656 G$P0_6$0_0$0 == 0x0086
                           000086   657 _P0_6	=	0x0086
                           000087   658 G$P0_7$0_0$0 == 0x0087
                           000087   659 _P0_7	=	0x0087
                           00008F   660 G$TF1$0_0$0 == 0x008f
                           00008F   661 _TF1	=	0x008f
                           00008E   662 G$TR1$0_0$0 == 0x008e
                           00008E   663 _TR1	=	0x008e
                           00008D   664 G$TF0$0_0$0 == 0x008d
                           00008D   665 _TF0	=	0x008d
                           00008C   666 G$TR0$0_0$0 == 0x008c
                           00008C   667 _TR0	=	0x008c
                           00008B   668 G$IE1$0_0$0 == 0x008b
                           00008B   669 _IE1	=	0x008b
                           00008A   670 G$IT1$0_0$0 == 0x008a
                           00008A   671 _IT1	=	0x008a
                           000089   672 G$IE0$0_0$0 == 0x0089
                           000089   673 _IE0	=	0x0089
                           000088   674 G$IT0$0_0$0 == 0x0088
                           000088   675 _IT0	=	0x0088
                           000090   676 G$P1_0$0_0$0 == 0x0090
                           000090   677 _P1_0	=	0x0090
                           000091   678 G$P1_1$0_0$0 == 0x0091
                           000091   679 _P1_1	=	0x0091
                           000092   680 G$P1_2$0_0$0 == 0x0092
                           000092   681 _P1_2	=	0x0092
                           000093   682 G$P1_3$0_0$0 == 0x0093
                           000093   683 _P1_3	=	0x0093
                           000094   684 G$P1_4$0_0$0 == 0x0094
                           000094   685 _P1_4	=	0x0094
                           000095   686 G$P1_5$0_0$0 == 0x0095
                           000095   687 _P1_5	=	0x0095
                           000096   688 G$P1_6$0_0$0 == 0x0096
                           000096   689 _P1_6	=	0x0096
                           000097   690 G$P1_7$0_0$0 == 0x0097
                           000097   691 _P1_7	=	0x0097
                           00009F   692 G$S0MODE$0_0$0 == 0x009f
                           00009F   693 _S0MODE	=	0x009f
                           00009D   694 G$MCE0$0_0$0 == 0x009d
                           00009D   695 _MCE0	=	0x009d
                           00009C   696 G$REN0$0_0$0 == 0x009c
                           00009C   697 _REN0	=	0x009c
                           00009B   698 G$TB80$0_0$0 == 0x009b
                           00009B   699 _TB80	=	0x009b
                           00009A   700 G$RB80$0_0$0 == 0x009a
                           00009A   701 _RB80	=	0x009a
                           000099   702 G$TI0$0_0$0 == 0x0099
                           000099   703 _TI0	=	0x0099
                           000098   704 G$RI0$0_0$0 == 0x0098
                           000098   705 _RI0	=	0x0098
                           0000A0   706 G$P2_0$0_0$0 == 0x00a0
                           0000A0   707 _P2_0	=	0x00a0
                           0000A1   708 G$P2_1$0_0$0 == 0x00a1
                           0000A1   709 _P2_1	=	0x00a1
                           0000A2   710 G$P2_2$0_0$0 == 0x00a2
                           0000A2   711 _P2_2	=	0x00a2
                           0000A3   712 G$P2_3$0_0$0 == 0x00a3
                           0000A3   713 _P2_3	=	0x00a3
                           0000A4   714 G$P2_4$0_0$0 == 0x00a4
                           0000A4   715 _P2_4	=	0x00a4
                           0000A5   716 G$P2_5$0_0$0 == 0x00a5
                           0000A5   717 _P2_5	=	0x00a5
                           0000A6   718 G$P2_6$0_0$0 == 0x00a6
                           0000A6   719 _P2_6	=	0x00a6
                           0000A7   720 G$P2_7$0_0$0 == 0x00a7
                           0000A7   721 _P2_7	=	0x00a7
                           0000AF   722 G$EA$0_0$0 == 0x00af
                           0000AF   723 _EA	=	0x00af
                           0000AE   724 G$ESPI0$0_0$0 == 0x00ae
                           0000AE   725 _ESPI0	=	0x00ae
                           0000AD   726 G$ET2$0_0$0 == 0x00ad
                           0000AD   727 _ET2	=	0x00ad
                           0000AC   728 G$ES0$0_0$0 == 0x00ac
                           0000AC   729 _ES0	=	0x00ac
                           0000AB   730 G$ET1$0_0$0 == 0x00ab
                           0000AB   731 _ET1	=	0x00ab
                           0000AA   732 G$EX1$0_0$0 == 0x00aa
                           0000AA   733 _EX1	=	0x00aa
                           0000A9   734 G$ET0$0_0$0 == 0x00a9
                           0000A9   735 _ET0	=	0x00a9
                           0000A8   736 G$EX0$0_0$0 == 0x00a8
                           0000A8   737 _EX0	=	0x00a8
                           0000B0   738 G$P3_0$0_0$0 == 0x00b0
                           0000B0   739 _P3_0	=	0x00b0
                           0000B1   740 G$P3_1$0_0$0 == 0x00b1
                           0000B1   741 _P3_1	=	0x00b1
                           0000B2   742 G$P3_2$0_0$0 == 0x00b2
                           0000B2   743 _P3_2	=	0x00b2
                           0000B3   744 G$P3_3$0_0$0 == 0x00b3
                           0000B3   745 _P3_3	=	0x00b3
                           0000B4   746 G$P3_4$0_0$0 == 0x00b4
                           0000B4   747 _P3_4	=	0x00b4
                           0000B5   748 G$P3_5$0_0$0 == 0x00b5
                           0000B5   749 _P3_5	=	0x00b5
                           0000B6   750 G$P3_6$0_0$0 == 0x00b6
                           0000B6   751 _P3_6	=	0x00b6
                           0000B7   752 G$P3_7$0_0$0 == 0x00b7
                           0000B7   753 _P3_7	=	0x00b7
                           0000BE   754 G$PSPI0$0_0$0 == 0x00be
                           0000BE   755 _PSPI0	=	0x00be
                           0000BD   756 G$PT2$0_0$0 == 0x00bd
                           0000BD   757 _PT2	=	0x00bd
                           0000BC   758 G$PS0$0_0$0 == 0x00bc
                           0000BC   759 _PS0	=	0x00bc
                           0000BB   760 G$PT1$0_0$0 == 0x00bb
                           0000BB   761 _PT1	=	0x00bb
                           0000BA   762 G$PX1$0_0$0 == 0x00ba
                           0000BA   763 _PX1	=	0x00ba
                           0000B9   764 G$PT0$0_0$0 == 0x00b9
                           0000B9   765 _PT0	=	0x00b9
                           0000B8   766 G$PX0$0_0$0 == 0x00b8
                           0000B8   767 _PX0	=	0x00b8
                           0000C7   768 G$MASTER0$0_0$0 == 0x00c7
                           0000C7   769 _MASTER0	=	0x00c7
                           0000C6   770 G$TXMODE0$0_0$0 == 0x00c6
                           0000C6   771 _TXMODE0	=	0x00c6
                           0000C5   772 G$STA0$0_0$0 == 0x00c5
                           0000C5   773 _STA0	=	0x00c5
                           0000C4   774 G$STO0$0_0$0 == 0x00c4
                           0000C4   775 _STO0	=	0x00c4
                           0000C3   776 G$ACKRQ0$0_0$0 == 0x00c3
                           0000C3   777 _ACKRQ0	=	0x00c3
                           0000C2   778 G$ARBLOST0$0_0$0 == 0x00c2
                           0000C2   779 _ARBLOST0	=	0x00c2
                           0000C1   780 G$ACK0$0_0$0 == 0x00c1
                           0000C1   781 _ACK0	=	0x00c1
                           0000C0   782 G$SI0$0_0$0 == 0x00c0
                           0000C0   783 _SI0	=	0x00c0
                           0000C7   784 G$MASTER1$0_0$0 == 0x00c7
                           0000C7   785 _MASTER1	=	0x00c7
                           0000C6   786 G$TXMODE1$0_0$0 == 0x00c6
                           0000C6   787 _TXMODE1	=	0x00c6
                           0000C5   788 G$STA1$0_0$0 == 0x00c5
                           0000C5   789 _STA1	=	0x00c5
                           0000C4   790 G$STO1$0_0$0 == 0x00c4
                           0000C4   791 _STO1	=	0x00c4
                           0000C3   792 G$ACKRQ1$0_0$0 == 0x00c3
                           0000C3   793 _ACKRQ1	=	0x00c3
                           0000C2   794 G$ARBLOST1$0_0$0 == 0x00c2
                           0000C2   795 _ARBLOST1	=	0x00c2
                           0000C1   796 G$ACK1$0_0$0 == 0x00c1
                           0000C1   797 _ACK1	=	0x00c1
                           0000C0   798 G$SI1$0_0$0 == 0x00c0
                           0000C0   799 _SI1	=	0x00c0
                           0000CF   800 G$TF2H$0_0$0 == 0x00cf
                           0000CF   801 _TF2H	=	0x00cf
                           0000CE   802 G$TF2L$0_0$0 == 0x00ce
                           0000CE   803 _TF2L	=	0x00ce
                           0000CD   804 G$TF2LEN$0_0$0 == 0x00cd
                           0000CD   805 _TF2LEN	=	0x00cd
                           0000CC   806 G$TF2CEN$0_0$0 == 0x00cc
                           0000CC   807 _TF2CEN	=	0x00cc
                           0000CB   808 G$T2SPLIT$0_0$0 == 0x00cb
                           0000CB   809 _T2SPLIT	=	0x00cb
                           0000CA   810 G$TR2$0_0$0 == 0x00ca
                           0000CA   811 _TR2	=	0x00ca
                           0000C9   812 G$T2CSS$0_0$0 == 0x00c9
                           0000C9   813 _T2CSS	=	0x00c9
                           0000C8   814 G$T2XCLK$0_0$0 == 0x00c8
                           0000C8   815 _T2XCLK	=	0x00c8
                           0000CF   816 G$TF5H$0_0$0 == 0x00cf
                           0000CF   817 _TF5H	=	0x00cf
                           0000CE   818 G$TF5L$0_0$0 == 0x00ce
                           0000CE   819 _TF5L	=	0x00ce
                           0000CD   820 G$TF5LEN$0_0$0 == 0x00cd
                           0000CD   821 _TF5LEN	=	0x00cd
                           0000CB   822 G$T5SPLIT$0_0$0 == 0x00cb
                           0000CB   823 _T5SPLIT	=	0x00cb
                           0000CA   824 G$TR5$0_0$0 == 0x00ca
                           0000CA   825 _TR5	=	0x00ca
                           0000C8   826 G$T5XCLK$0_0$0 == 0x00c8
                           0000C8   827 _T5XCLK	=	0x00c8
                           0000D7   828 G$CY$0_0$0 == 0x00d7
                           0000D7   829 _CY	=	0x00d7
                           0000D6   830 G$AC$0_0$0 == 0x00d6
                           0000D6   831 _AC	=	0x00d6
                           0000D5   832 G$F0$0_0$0 == 0x00d5
                           0000D5   833 _F0	=	0x00d5
                           0000D4   834 G$RS1$0_0$0 == 0x00d4
                           0000D4   835 _RS1	=	0x00d4
                           0000D3   836 G$RS0$0_0$0 == 0x00d3
                           0000D3   837 _RS0	=	0x00d3
                           0000D2   838 G$OV$0_0$0 == 0x00d2
                           0000D2   839 _OV	=	0x00d2
                           0000D1   840 G$F1$0_0$0 == 0x00d1
                           0000D1   841 _F1	=	0x00d1
                           0000D0   842 G$PARITY$0_0$0 == 0x00d0
                           0000D0   843 _PARITY	=	0x00d0
                           0000DF   844 G$CF$0_0$0 == 0x00df
                           0000DF   845 _CF	=	0x00df
                           0000DE   846 G$CR$0_0$0 == 0x00de
                           0000DE   847 _CR	=	0x00de
                           0000DC   848 G$CCF4$0_0$0 == 0x00dc
                           0000DC   849 _CCF4	=	0x00dc
                           0000DB   850 G$CCF3$0_0$0 == 0x00db
                           0000DB   851 _CCF3	=	0x00db
                           0000DA   852 G$CCF2$0_0$0 == 0x00da
                           0000DA   853 _CCF2	=	0x00da
                           0000D9   854 G$CCF1$0_0$0 == 0x00d9
                           0000D9   855 _CCF1	=	0x00d9
                           0000D8   856 G$CCF0$0_0$0 == 0x00d8
                           0000D8   857 _CCF0	=	0x00d8
                           0000EF   858 G$AD0EN$0_0$0 == 0x00ef
                           0000EF   859 _AD0EN	=	0x00ef
                           0000EE   860 G$AD0TM$0_0$0 == 0x00ee
                           0000EE   861 _AD0TM	=	0x00ee
                           0000ED   862 G$AD0INT$0_0$0 == 0x00ed
                           0000ED   863 _AD0INT	=	0x00ed
                           0000EC   864 G$AD0BUSY$0_0$0 == 0x00ec
                           0000EC   865 _AD0BUSY	=	0x00ec
                           0000EB   866 G$AD0WINT$0_0$0 == 0x00eb
                           0000EB   867 _AD0WINT	=	0x00eb
                           0000EA   868 G$AD0CM2$0_0$0 == 0x00ea
                           0000EA   869 _AD0CM2	=	0x00ea
                           0000E9   870 G$AD0CM1$0_0$0 == 0x00e9
                           0000E9   871 _AD0CM1	=	0x00e9
                           0000E8   872 G$AD0CM0$0_0$0 == 0x00e8
                           0000E8   873 _AD0CM0	=	0x00e8
                           0000FF   874 G$SPIF$0_0$0 == 0x00ff
                           0000FF   875 _SPIF	=	0x00ff
                           0000FE   876 G$WCOL$0_0$0 == 0x00fe
                           0000FE   877 _WCOL	=	0x00fe
                           0000FD   878 G$MODF$0_0$0 == 0x00fd
                           0000FD   879 _MODF	=	0x00fd
                           0000FC   880 G$RXOVRN$0_0$0 == 0x00fc
                           0000FC   881 _RXOVRN	=	0x00fc
                           0000FB   882 G$NSSMD1$0_0$0 == 0x00fb
                           0000FB   883 _NSSMD1	=	0x00fb
                           0000FA   884 G$NSSMD0$0_0$0 == 0x00fa
                           0000FA   885 _NSSMD0	=	0x00fa
                           0000F9   886 G$TXBMT$0_0$0 == 0x00f9
                           0000F9   887 _TXBMT	=	0x00f9
                           0000F8   888 G$SPIEN$0_0$0 == 0x00f8
                           0000F8   889 _SPIEN	=	0x00f8
                                    890 ;--------------------------------------------------------
                                    891 ; overlayable register banks
                                    892 ;--------------------------------------------------------
                                    893 	.area REG_BANK_0	(REL,OVR,DATA)
      000000                        894 	.ds 8
                                    895 ;--------------------------------------------------------
                                    896 ; internal ram data
                                    897 ;--------------------------------------------------------
                                    898 	.area DSEG    (DATA)
                           000000   899 Lteste.main$zero_nine$1_1$8==.
      000008                        900 _main_zero_nine_65537_8:
      000008                        901 	.ds 10
                                    902 ;--------------------------------------------------------
                                    903 ; overlayable items in internal ram
                                    904 ;--------------------------------------------------------
                                    905 	.area	OSEG    (OVR,DATA)
                                    906 ;--------------------------------------------------------
                                    907 ; Stack segment in internal ram
                                    908 ;--------------------------------------------------------
                                    909 	.area	SSEG
      000012                        910 __start__stack:
      000012                        911 	.ds	1
                                    912 
                                    913 ;--------------------------------------------------------
                                    914 ; indirectly addressable internal ram data
                                    915 ;--------------------------------------------------------
                                    916 	.area ISEG    (DATA)
                                    917 ;--------------------------------------------------------
                                    918 ; absolute internal ram data
                                    919 ;--------------------------------------------------------
                                    920 	.area IABS    (ABS,DATA)
                                    921 	.area IABS    (ABS,DATA)
                                    922 ;--------------------------------------------------------
                                    923 ; bit data
                                    924 ;--------------------------------------------------------
                                    925 	.area BSEG    (BIT)
                                    926 ;--------------------------------------------------------
                                    927 ; paged external ram data
                                    928 ;--------------------------------------------------------
                                    929 	.area PSEG    (PAG,XDATA)
                                    930 ;--------------------------------------------------------
                                    931 ; external ram data
                                    932 ;--------------------------------------------------------
                                    933 	.area XSEG    (XDATA)
                                    934 ;--------------------------------------------------------
                                    935 ; absolute external ram data
                                    936 ;--------------------------------------------------------
                                    937 	.area XABS    (ABS,XDATA)
                                    938 ;--------------------------------------------------------
                                    939 ; external initialized ram data
                                    940 ;--------------------------------------------------------
                                    941 	.area XISEG   (XDATA)
                                    942 	.area HOME    (CODE)
                                    943 	.area GSINIT0 (CODE)
                                    944 	.area GSINIT1 (CODE)
                                    945 	.area GSINIT2 (CODE)
                                    946 	.area GSINIT3 (CODE)
                                    947 	.area GSINIT4 (CODE)
                                    948 	.area GSINIT5 (CODE)
                                    949 	.area GSINIT  (CODE)
                                    950 	.area GSFINAL (CODE)
                                    951 	.area CSEG    (CODE)
                                    952 ;--------------------------------------------------------
                                    953 ; interrupt vector
                                    954 ;--------------------------------------------------------
                                    955 	.area HOME    (CODE)
      000000                        956 __interrupt_vect:
      000000 02 00 06         [24]  957 	ljmp	__sdcc_gsinit_startup
                                    958 ;--------------------------------------------------------
                                    959 ; global & static initialisations
                                    960 ;--------------------------------------------------------
                                    961 	.area HOME    (CODE)
                                    962 	.area GSINIT  (CODE)
                                    963 	.area GSFINAL (CODE)
                                    964 	.area GSINIT  (CODE)
                                    965 	.globl __sdcc_gsinit_startup
                                    966 	.globl __sdcc_program_startup
                                    967 	.globl __start__stack
                                    968 	.globl __mcs51_genXINIT
                                    969 	.globl __mcs51_genXRAMCLEAR
                                    970 	.globl __mcs51_genRAMCLEAR
                                    971 	.area GSFINAL (CODE)
      00005F 02 00 03         [24]  972 	ljmp	__sdcc_program_startup
                                    973 ;--------------------------------------------------------
                                    974 ; Home
                                    975 ;--------------------------------------------------------
                                    976 	.area HOME    (CODE)
                                    977 	.area HOME    (CODE)
      000003                        978 __sdcc_program_startup:
      000003 02 00 97         [24]  979 	ljmp	_main
                                    980 ;	return from main will return to caller
                                    981 ;--------------------------------------------------------
                                    982 ; code
                                    983 ;--------------------------------------------------------
                                    984 	.area CSEG    (CODE)
                                    985 ;------------------------------------------------------------
                                    986 ;Allocation info for local variables in function 'sdelay'
                                    987 ;------------------------------------------------------------
                                    988 ;time                      Allocated to registers r6 r7 
                                    989 ;i                         Allocated to registers r4 r5 
                                    990 ;j                         Allocated to registers r2 r3 
                                    991 ;------------------------------------------------------------
                           000000   992 	G$sdelay$0$0 ==.
                           000000   993 	C$teste.c$4$0_0$3 ==.
                                    994 ;	E:\2ano\ATC\blinktest\teste.c:4: void sdelay(int time){
                                    995 ;	-----------------------------------------
                                    996 ;	 function sdelay
                                    997 ;	-----------------------------------------
      000062                        998 _sdelay:
                           000007   999 	ar7 = 0x07
                           000006  1000 	ar6 = 0x06
                           000005  1001 	ar5 = 0x05
                           000004  1002 	ar4 = 0x04
                           000003  1003 	ar3 = 0x03
                           000002  1004 	ar2 = 0x02
                           000001  1005 	ar1 = 0x01
                           000000  1006 	ar0 = 0x00
      000062 AE 82            [24] 1007 	mov	r6,dpl
      000064 AF 83            [24] 1008 	mov	r7,dph
                           000004  1009 	C$teste.c$6$2_0$3 ==.
                                   1010 ;	E:\2ano\ATC\blinktest\teste.c:6: for(int i=0;i<time;i++){
      000066 7C 00            [12] 1011 	mov	r4,#0x00
      000068 7D 00            [12] 1012 	mov	r5,#0x00
      00006A                       1013 00107$:
      00006A C3               [12] 1014 	clr	c
      00006B EC               [12] 1015 	mov	a,r4
      00006C 9E               [12] 1016 	subb	a,r6
      00006D ED               [12] 1017 	mov	a,r5
      00006E 64 80            [12] 1018 	xrl	a,#0x80
      000070 8F F0            [24] 1019 	mov	b,r7
      000072 63 F0 80         [24] 1020 	xrl	b,#0x80
      000075 95 F0            [12] 1021 	subb	a,b
      000077 50 1D            [24] 1022 	jnc	00109$
                           000017  1023 	C$teste.c$8$2_0$3 ==.
                                   1024 ;	E:\2ano\ATC\blinktest\teste.c:8: for(int j=0;j<10;j++); //0.15seg? but y?
      000079 7A 00            [12] 1025 	mov	r2,#0x00
      00007B 7B 00            [12] 1026 	mov	r3,#0x00
      00007D                       1027 00104$:
      00007D C3               [12] 1028 	clr	c
      00007E EA               [12] 1029 	mov	a,r2
      00007F 94 0A            [12] 1030 	subb	a,#0x0a
      000081 EB               [12] 1031 	mov	a,r3
      000082 64 80            [12] 1032 	xrl	a,#0x80
      000084 94 80            [12] 1033 	subb	a,#0x80
      000086 50 07            [24] 1034 	jnc	00108$
      000088 0A               [12] 1035 	inc	r2
      000089 BA 00 F1         [24] 1036 	cjne	r2,#0x00,00104$
      00008C 0B               [12] 1037 	inc	r3
      00008D 80 EE            [24] 1038 	sjmp	00104$
      00008F                       1039 00108$:
                           00002D  1040 	C$teste.c$6$2_0$3 ==.
                                   1041 ;	E:\2ano\ATC\blinktest\teste.c:6: for(int i=0;i<time;i++){
      00008F 0C               [12] 1042 	inc	r4
      000090 BC 00 D7         [24] 1043 	cjne	r4,#0x00,00107$
      000093 0D               [12] 1044 	inc	r5
      000094 80 D4            [24] 1045 	sjmp	00107$
      000096                       1046 00109$:
                           000034  1047 	C$teste.c$10$2_0$3 ==.
                                   1048 ;	E:\2ano\ATC\blinktest\teste.c:10: }
                           000034  1049 	C$teste.c$10$2_0$3 ==.
                           000034  1050 	XG$sdelay$0$0 ==.
      000096 22               [24] 1051 	ret
                                   1052 ;------------------------------------------------------------
                                   1053 ;Allocation info for local variables in function 'main'
                                   1054 ;------------------------------------------------------------
                                   1055 ;zero_nine                 Allocated with name '_main_zero_nine_65537_8'
                                   1056 ;i                         Allocated to registers r6 r7 
                                   1057 ;------------------------------------------------------------
                           000035  1058 	G$main$0$0 ==.
                           000035  1059 	C$teste.c$15$2_0$7 ==.
                                   1060 ;	E:\2ano\ATC\blinktest\teste.c:15: void main (void) {
                                   1061 ;	-----------------------------------------
                                   1062 ;	 function main
                                   1063 ;	-----------------------------------------
      000097                       1064 _main:
                           000035  1065 	C$teste.c$17$1_0$7 ==.
                                   1066 ;	E:\2ano\ATC\blinktest\teste.c:17: PCA0MD = 0x00;		
      000097 75 D9 00         [24] 1067 	mov	_PCA0MD,#0x00
                           000038  1068 	C$teste.c$18$1_0$7 ==.
                                   1069 ;	E:\2ano\ATC\blinktest\teste.c:18: XBR1 = 0x40;				
      00009A 75 E2 40         [24] 1070 	mov	_XBR1,#0x40
                           00003B  1071 	C$teste.c$21$2_0$8 ==.
                                   1072 ;	E:\2ano\ATC\blinktest\teste.c:21: char zero_nine[]={0xc0,0xf9,0xa4,0xb0,0x99,0x92,0x82,0xf8,0x80,0x90} ;    
      00009D 75 08 C0         [24] 1073 	mov	_main_zero_nine_65537_8,#0xc0
      0000A0 75 09 F9         [24] 1074 	mov	(_main_zero_nine_65537_8 + 0x0001),#0xf9
      0000A3 75 0A A4         [24] 1075 	mov	(_main_zero_nine_65537_8 + 0x0002),#0xa4
      0000A6 75 0B B0         [24] 1076 	mov	(_main_zero_nine_65537_8 + 0x0003),#0xb0
      0000A9 75 0C 99         [24] 1077 	mov	(_main_zero_nine_65537_8 + 0x0004),#0x99
      0000AC 75 0D 92         [24] 1078 	mov	(_main_zero_nine_65537_8 + 0x0005),#0x92
      0000AF 75 0E 82         [24] 1079 	mov	(_main_zero_nine_65537_8 + 0x0006),#0x82
      0000B2 75 0F F8         [24] 1080 	mov	(_main_zero_nine_65537_8 + 0x0007),#0xf8
      0000B5 75 10 80         [24] 1081 	mov	(_main_zero_nine_65537_8 + 0x0008),#0x80
      0000B8 75 11 90         [24] 1082 	mov	(_main_zero_nine_65537_8 + 0x0009),#0x90
                           000059  1083 	C$teste.c$25$1_1$7 ==.
                                   1084 ;	E:\2ano\ATC\blinktest\teste.c:25: for(int i=0;i<10;i++)
      0000BB                       1085 00112$:
      0000BB 7E 00            [12] 1086 	mov	r6,#0x00
      0000BD 7F 00            [12] 1087 	mov	r7,#0x00
      0000BF                       1088 00106$:
      0000BF C3               [12] 1089 	clr	c
      0000C0 EE               [12] 1090 	mov	a,r6
      0000C1 94 0A            [12] 1091 	subb	a,#0x0a
      0000C3 EF               [12] 1092 	mov	a,r7
      0000C4 64 80            [12] 1093 	xrl	a,#0x80
      0000C6 94 80            [12] 1094 	subb	a,#0x80
      0000C8 50 F1            [24] 1095 	jnc	00112$
                           000068  1096 	C$teste.c$27$4_1$11 ==.
                                   1097 ;	E:\2ano\ATC\blinktest\teste.c:27: P2=zero_nine[i]; 
      0000CA EE               [12] 1098 	mov	a,r6
      0000CB 24 08            [12] 1099 	add	a,#_main_zero_nine_65537_8
      0000CD F9               [12] 1100 	mov	r1,a
      0000CE 87 A0            [24] 1101 	mov	_P2,@r1
                           00006E  1102 	C$teste.c$28$4_1$11 ==.
                                   1103 ;	E:\2ano\ATC\blinktest\teste.c:28: sdelay(1000);
      0000D0 90 03 E8         [24] 1104 	mov	dptr,#0x03e8
      0000D3 C0 07            [24] 1105 	push	ar7
      0000D5 C0 06            [24] 1106 	push	ar6
      0000D7 12 00 62         [24] 1107 	lcall	_sdelay
      0000DA D0 06            [24] 1108 	pop	ar6
      0000DC D0 07            [24] 1109 	pop	ar7
                           00007C  1110 	C$teste.c$25$3_1$10 ==.
                                   1111 ;	E:\2ano\ATC\blinktest\teste.c:25: for(int i=0;i<10;i++)
      0000DE 0E               [12] 1112 	inc	r6
      0000DF BE 00 DD         [24] 1113 	cjne	r6,#0x00,00106$
      0000E2 0F               [12] 1114 	inc	r7
      0000E3 80 DA            [24] 1115 	sjmp	00106$
                           000083  1116 	C$teste.c$35$1_1$7 ==.
                                   1117 ;	E:\2ano\ATC\blinktest\teste.c:35: }
                           000083  1118 	C$teste.c$35$1_1$7 ==.
                           000083  1119 	XG$main$0$0 ==.
      0000E5 22               [24] 1120 	ret
                                   1121 	.area CSEG    (CODE)
                                   1122 	.area CONST   (CODE)
                                   1123 	.area XINIT   (CODE)
                                   1124 	.area CABS    (ABS,CODE)
