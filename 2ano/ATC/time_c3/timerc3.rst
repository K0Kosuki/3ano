                                      1 ;--------------------------------------------------------
                                      2 ; File Created by SDCC : free open source ANSI-C Compiler
                                      3 ; Version 4.2.0 #13081 (MINGW64)
                                      4 ;--------------------------------------------------------
                                      5 	.module timerc3
                                      6 	.optsdcc -mmcs51 --model-small
                                      7 	
                                      8 ;--------------------------------------------------------
                                      9 ; Public variables in this module
                                     10 ;--------------------------------------------------------
                                     11 	.globl _main
                                     12 	.globl _SPIEN
                                     13 	.globl _TXBMT
                                     14 	.globl _NSSMD0
                                     15 	.globl _NSSMD1
                                     16 	.globl _RXOVRN
                                     17 	.globl _MODF
                                     18 	.globl _WCOL
                                     19 	.globl _SPIF
                                     20 	.globl _AD0CM0
                                     21 	.globl _AD0CM1
                                     22 	.globl _AD0CM2
                                     23 	.globl _AD0WINT
                                     24 	.globl _AD0BUSY
                                     25 	.globl _AD0INT
                                     26 	.globl _AD0TM
                                     27 	.globl _AD0EN
                                     28 	.globl _CCF0
                                     29 	.globl _CCF1
                                     30 	.globl _CCF2
                                     31 	.globl _CCF3
                                     32 	.globl _CCF4
                                     33 	.globl _CR
                                     34 	.globl _CF
                                     35 	.globl _PARITY
                                     36 	.globl _F1
                                     37 	.globl _OV
                                     38 	.globl _RS0
                                     39 	.globl _RS1
                                     40 	.globl _F0
                                     41 	.globl _AC
                                     42 	.globl _CY
                                     43 	.globl _T5XCLK
                                     44 	.globl _TR5
                                     45 	.globl _T5SPLIT
                                     46 	.globl _TF5LEN
                                     47 	.globl _TF5L
                                     48 	.globl _TF5H
                                     49 	.globl _T2XCLK
                                     50 	.globl _T2CSS
                                     51 	.globl _TR2
                                     52 	.globl _T2SPLIT
                                     53 	.globl _TF2CEN
                                     54 	.globl _TF2LEN
                                     55 	.globl _TF2L
                                     56 	.globl _TF2H
                                     57 	.globl _SI1
                                     58 	.globl _ACK1
                                     59 	.globl _ARBLOST1
                                     60 	.globl _ACKRQ1
                                     61 	.globl _STO1
                                     62 	.globl _STA1
                                     63 	.globl _TXMODE1
                                     64 	.globl _MASTER1
                                     65 	.globl _SI0
                                     66 	.globl _ACK0
                                     67 	.globl _ARBLOST0
                                     68 	.globl _ACKRQ0
                                     69 	.globl _STO0
                                     70 	.globl _STA0
                                     71 	.globl _TXMODE0
                                     72 	.globl _MASTER0
                                     73 	.globl _PX0
                                     74 	.globl _PT0
                                     75 	.globl _PX1
                                     76 	.globl _PT1
                                     77 	.globl _PS0
                                     78 	.globl _PT2
                                     79 	.globl _PSPI0
                                     80 	.globl _P3_7
                                     81 	.globl _P3_6
                                     82 	.globl _P3_5
                                     83 	.globl _P3_4
                                     84 	.globl _P3_3
                                     85 	.globl _P3_2
                                     86 	.globl _P3_1
                                     87 	.globl _P3_0
                                     88 	.globl _EX0
                                     89 	.globl _ET0
                                     90 	.globl _EX1
                                     91 	.globl _ET1
                                     92 	.globl _ES0
                                     93 	.globl _ET2
                                     94 	.globl _ESPI0
                                     95 	.globl _EA
                                     96 	.globl _P2_7
                                     97 	.globl _P2_6
                                     98 	.globl _P2_5
                                     99 	.globl _P2_4
                                    100 	.globl _P2_3
                                    101 	.globl _P2_2
                                    102 	.globl _P2_1
                                    103 	.globl _P2_0
                                    104 	.globl _RI0
                                    105 	.globl _TI0
                                    106 	.globl _RB80
                                    107 	.globl _TB80
                                    108 	.globl _REN0
                                    109 	.globl _MCE0
                                    110 	.globl _S0MODE
                                    111 	.globl _P1_7
                                    112 	.globl _P1_6
                                    113 	.globl _P1_5
                                    114 	.globl _P1_4
                                    115 	.globl _P1_3
                                    116 	.globl _P1_2
                                    117 	.globl _P1_1
                                    118 	.globl _P1_0
                                    119 	.globl _IT0
                                    120 	.globl _IE0
                                    121 	.globl _IT1
                                    122 	.globl _IE1
                                    123 	.globl _TR0
                                    124 	.globl _TF0
                                    125 	.globl _TR1
                                    126 	.globl _TF1
                                    127 	.globl _P0_7
                                    128 	.globl _P0_6
                                    129 	.globl _P0_5
                                    130 	.globl _P0_4
                                    131 	.globl _P0_3
                                    132 	.globl _P0_2
                                    133 	.globl _P0_1
                                    134 	.globl _P0_0
                                    135 	.globl _PCA0CP4
                                    136 	.globl _PCA0CP0
                                    137 	.globl _PCA0
                                    138 	.globl _PCA0CP3
                                    139 	.globl _PCA0CP2
                                    140 	.globl _PCA0CP1
                                    141 	.globl _TMR5
                                    142 	.globl _TMR2
                                    143 	.globl _TMR5RL
                                    144 	.globl _TMR2RL
                                    145 	.globl _ADC0LT
                                    146 	.globl _ADC0GT
                                    147 	.globl _ADC0
                                    148 	.globl _SBRL1
                                    149 	.globl _TMR4
                                    150 	.globl _TMR3
                                    151 	.globl _TMR4RL
                                    152 	.globl _TMR3RL
                                    153 	.globl _DP
                                    154 	.globl _VDM0CN
                                    155 	.globl _PCA0CPH4
                                    156 	.globl _PCA0CPL4
                                    157 	.globl _PCA0CPH0
                                    158 	.globl _PCA0CPL0
                                    159 	.globl _PCA0H
                                    160 	.globl _PCA0L
                                    161 	.globl _SPI0CN
                                    162 	.globl _EIP2
                                    163 	.globl _EIP1
                                    164 	.globl _P4MDIN
                                    165 	.globl _P3MDIN
                                    166 	.globl _P2MDIN
                                    167 	.globl _P1MDIN
                                    168 	.globl _P0MDIN
                                    169 	.globl _B
                                    170 	.globl _RSTSRC
                                    171 	.globl _PCA0CPH3
                                    172 	.globl _PCA0CPL3
                                    173 	.globl _PCA0CPH2
                                    174 	.globl _PCA0CPL2
                                    175 	.globl _PCA0CPH1
                                    176 	.globl _PCA0CPL1
                                    177 	.globl _ADC0CN
                                    178 	.globl _CKCON1
                                    179 	.globl _EIE2
                                    180 	.globl _EIE1
                                    181 	.globl _SMOD1
                                    182 	.globl _IT01CF
                                    183 	.globl _XBR2
                                    184 	.globl _XBR1
                                    185 	.globl _XBR0
                                    186 	.globl _ACC
                                    187 	.globl _P3SKIP
                                    188 	.globl _PCA0CPM4
                                    189 	.globl _PCA0CPM3
                                    190 	.globl _PCA0CPM2
                                    191 	.globl _PCA0CPM1
                                    192 	.globl _PCA0CPM0
                                    193 	.globl _PCA0MD
                                    194 	.globl _PCA0CN
                                    195 	.globl _USB0XCN
                                    196 	.globl _P2SKIP
                                    197 	.globl _P1SKIP
                                    198 	.globl _P0SKIP
                                    199 	.globl _SBUF1
                                    200 	.globl _SCON1
                                    201 	.globl _REF0CN
                                    202 	.globl _PSW
                                    203 	.globl _SMB1ADR
                                    204 	.globl _SMB1ADM
                                    205 	.globl _TMR5H
                                    206 	.globl _TMR5L
                                    207 	.globl _TMR5RLH
                                    208 	.globl _TMR5RLL
                                    209 	.globl _TMR5CN
                                    210 	.globl _SMB0ADR
                                    211 	.globl _SMB0ADM
                                    212 	.globl _TMR2H
                                    213 	.globl _TH2
                                    214 	.globl _TMR2L
                                    215 	.globl _TL2
                                    216 	.globl _TMR2RLH
                                    217 	.globl _RCAP2H
                                    218 	.globl _TMR2RLL
                                    219 	.globl _RCAP2L
                                    220 	.globl _REG01CN
                                    221 	.globl _TMR2CN
                                    222 	.globl _T2CON
                                    223 	.globl _SMB1DAT
                                    224 	.globl _SMB1CF
                                    225 	.globl _SMB1CN
                                    226 	.globl _P4
                                    227 	.globl _ADC0LTH
                                    228 	.globl _ADC0LTL
                                    229 	.globl _ADC0GTH
                                    230 	.globl _ADC0GTL
                                    231 	.globl _SMB0DAT
                                    232 	.globl _SMB0CF
                                    233 	.globl _SMB0CN
                                    234 	.globl _SMBTC
                                    235 	.globl _SFRPAGE
                                    236 	.globl _ADC0H
                                    237 	.globl _ADC0L
                                    238 	.globl _ADC0CF
                                    239 	.globl _AMX0P
                                    240 	.globl _AMX0N
                                    241 	.globl _CLKMUL
                                    242 	.globl _IP
                                    243 	.globl _FLKEY
                                    244 	.globl _FLSCL
                                    245 	.globl _SBRLH1
                                    246 	.globl _SBRLL1
                                    247 	.globl _OSCICL
                                    248 	.globl _OSCICN
                                    249 	.globl _OSCXCN
                                    250 	.globl _P3
                                    251 	.globl _PFE0CN
                                    252 	.globl _P4MDOUT
                                    253 	.globl _SBCON1
                                    254 	.globl __XPAGE
                                    255 	.globl _EMI0CN
                                    256 	.globl _CLKSEL
                                    257 	.globl _IE
                                    258 	.globl _P3MDOUT
                                    259 	.globl _P2MDOUT
                                    260 	.globl _P1MDOUT
                                    261 	.globl _P0MDOUT
                                    262 	.globl _SPI0DAT
                                    263 	.globl _SPI0CKR
                                    264 	.globl _SPI0CFG
                                    265 	.globl _P2
                                    266 	.globl _CPT0MX
                                    267 	.globl _CPT1MX
                                    268 	.globl _CPT0MD
                                    269 	.globl _CPT1MD
                                    270 	.globl _CPT0CN
                                    271 	.globl _CPT1CN
                                    272 	.globl _SBUF0
                                    273 	.globl _SCON0
                                    274 	.globl _TMR4RLH
                                    275 	.globl _TMR4RLL
                                    276 	.globl _TMR4CN
                                    277 	.globl _USB0DAT
                                    278 	.globl _USB0ADR
                                    279 	.globl _TMR3H
                                    280 	.globl _TMR3L
                                    281 	.globl _TMR3RLH
                                    282 	.globl _TMR3RLL
                                    283 	.globl _TMR3CN
                                    284 	.globl _P1
                                    285 	.globl _PSCTL
                                    286 	.globl _CKCON
                                    287 	.globl _TH1
                                    288 	.globl _TH0
                                    289 	.globl _TL1
                                    290 	.globl _TL0
                                    291 	.globl _TMOD
                                    292 	.globl _TCON
                                    293 	.globl _PCON
                                    294 	.globl _OSCLCN
                                    295 	.globl _EMI0CF
                                    296 	.globl _EMI0TC
                                    297 	.globl _DPH
                                    298 	.globl _DPL
                                    299 	.globl _SP
                                    300 	.globl _P0
                                    301 ;--------------------------------------------------------
                                    302 ; special function registers
                                    303 ;--------------------------------------------------------
                                    304 	.area RSEG    (ABS,DATA)
      000000                        305 	.org 0x0000
                           000080   306 _P0	=	0x0080
                           000081   307 _SP	=	0x0081
                           000082   308 _DPL	=	0x0082
                           000083   309 _DPH	=	0x0083
                           000084   310 _EMI0TC	=	0x0084
                           000085   311 _EMI0CF	=	0x0085
                           000086   312 _OSCLCN	=	0x0086
                           000087   313 _PCON	=	0x0087
                           000088   314 _TCON	=	0x0088
                           000089   315 _TMOD	=	0x0089
                           00008A   316 _TL0	=	0x008a
                           00008B   317 _TL1	=	0x008b
                           00008C   318 _TH0	=	0x008c
                           00008D   319 _TH1	=	0x008d
                           00008E   320 _CKCON	=	0x008e
                           00008F   321 _PSCTL	=	0x008f
                           000090   322 _P1	=	0x0090
                           000091   323 _TMR3CN	=	0x0091
                           000092   324 _TMR3RLL	=	0x0092
                           000093   325 _TMR3RLH	=	0x0093
                           000094   326 _TMR3L	=	0x0094
                           000095   327 _TMR3H	=	0x0095
                           000096   328 _USB0ADR	=	0x0096
                           000097   329 _USB0DAT	=	0x0097
                           000091   330 _TMR4CN	=	0x0091
                           000092   331 _TMR4RLL	=	0x0092
                           000093   332 _TMR4RLH	=	0x0093
                           000098   333 _SCON0	=	0x0098
                           000099   334 _SBUF0	=	0x0099
                           00009A   335 _CPT1CN	=	0x009a
                           00009B   336 _CPT0CN	=	0x009b
                           00009C   337 _CPT1MD	=	0x009c
                           00009D   338 _CPT0MD	=	0x009d
                           00009E   339 _CPT1MX	=	0x009e
                           00009F   340 _CPT0MX	=	0x009f
                           0000A0   341 _P2	=	0x00a0
                           0000A1   342 _SPI0CFG	=	0x00a1
                           0000A2   343 _SPI0CKR	=	0x00a2
                           0000A3   344 _SPI0DAT	=	0x00a3
                           0000A4   345 _P0MDOUT	=	0x00a4
                           0000A5   346 _P1MDOUT	=	0x00a5
                           0000A6   347 _P2MDOUT	=	0x00a6
                           0000A7   348 _P3MDOUT	=	0x00a7
                           0000A8   349 _IE	=	0x00a8
                           0000A9   350 _CLKSEL	=	0x00a9
                           0000AA   351 _EMI0CN	=	0x00aa
                           0000AA   352 __XPAGE	=	0x00aa
                           0000AC   353 _SBCON1	=	0x00ac
                           0000AE   354 _P4MDOUT	=	0x00ae
                           0000AF   355 _PFE0CN	=	0x00af
                           0000B0   356 _P3	=	0x00b0
                           0000B1   357 _OSCXCN	=	0x00b1
                           0000B2   358 _OSCICN	=	0x00b2
                           0000B3   359 _OSCICL	=	0x00b3
                           0000B4   360 _SBRLL1	=	0x00b4
                           0000B5   361 _SBRLH1	=	0x00b5
                           0000B6   362 _FLSCL	=	0x00b6
                           0000B7   363 _FLKEY	=	0x00b7
                           0000B8   364 _IP	=	0x00b8
                           0000B9   365 _CLKMUL	=	0x00b9
                           0000BA   366 _AMX0N	=	0x00ba
                           0000BB   367 _AMX0P	=	0x00bb
                           0000BC   368 _ADC0CF	=	0x00bc
                           0000BD   369 _ADC0L	=	0x00bd
                           0000BE   370 _ADC0H	=	0x00be
                           0000BF   371 _SFRPAGE	=	0x00bf
                           0000B9   372 _SMBTC	=	0x00b9
                           0000C0   373 _SMB0CN	=	0x00c0
                           0000C1   374 _SMB0CF	=	0x00c1
                           0000C2   375 _SMB0DAT	=	0x00c2
                           0000C3   376 _ADC0GTL	=	0x00c3
                           0000C4   377 _ADC0GTH	=	0x00c4
                           0000C5   378 _ADC0LTL	=	0x00c5
                           0000C6   379 _ADC0LTH	=	0x00c6
                           0000C7   380 _P4	=	0x00c7
                           0000C0   381 _SMB1CN	=	0x00c0
                           0000C1   382 _SMB1CF	=	0x00c1
                           0000C2   383 _SMB1DAT	=	0x00c2
                           0000C8   384 _T2CON	=	0x00c8
                           0000C8   385 _TMR2CN	=	0x00c8
                           0000C9   386 _REG01CN	=	0x00c9
                           0000CA   387 _RCAP2L	=	0x00ca
                           0000CA   388 _TMR2RLL	=	0x00ca
                           0000CB   389 _RCAP2H	=	0x00cb
                           0000CB   390 _TMR2RLH	=	0x00cb
                           0000CC   391 _TL2	=	0x00cc
                           0000CC   392 _TMR2L	=	0x00cc
                           0000CD   393 _TH2	=	0x00cd
                           0000CD   394 _TMR2H	=	0x00cd
                           0000CE   395 _SMB0ADM	=	0x00ce
                           0000CF   396 _SMB0ADR	=	0x00cf
                           0000C8   397 _TMR5CN	=	0x00c8
                           0000CA   398 _TMR5RLL	=	0x00ca
                           0000CB   399 _TMR5RLH	=	0x00cb
                           0000CC   400 _TMR5L	=	0x00cc
                           0000CD   401 _TMR5H	=	0x00cd
                           0000CE   402 _SMB1ADM	=	0x00ce
                           0000CF   403 _SMB1ADR	=	0x00cf
                           0000D0   404 _PSW	=	0x00d0
                           0000D1   405 _REF0CN	=	0x00d1
                           0000D2   406 _SCON1	=	0x00d2
                           0000D3   407 _SBUF1	=	0x00d3
                           0000D4   408 _P0SKIP	=	0x00d4
                           0000D5   409 _P1SKIP	=	0x00d5
                           0000D6   410 _P2SKIP	=	0x00d6
                           0000D7   411 _USB0XCN	=	0x00d7
                           0000D8   412 _PCA0CN	=	0x00d8
                           0000D9   413 _PCA0MD	=	0x00d9
                           0000DA   414 _PCA0CPM0	=	0x00da
                           0000DB   415 _PCA0CPM1	=	0x00db
                           0000DC   416 _PCA0CPM2	=	0x00dc
                           0000DD   417 _PCA0CPM3	=	0x00dd
                           0000DE   418 _PCA0CPM4	=	0x00de
                           0000DF   419 _P3SKIP	=	0x00df
                           0000E0   420 _ACC	=	0x00e0
                           0000E1   421 _XBR0	=	0x00e1
                           0000E2   422 _XBR1	=	0x00e2
                           0000E3   423 _XBR2	=	0x00e3
                           0000E4   424 _IT01CF	=	0x00e4
                           0000E5   425 _SMOD1	=	0x00e5
                           0000E6   426 _EIE1	=	0x00e6
                           0000E7   427 _EIE2	=	0x00e7
                           0000E4   428 _CKCON1	=	0x00e4
                           0000E8   429 _ADC0CN	=	0x00e8
                           0000E9   430 _PCA0CPL1	=	0x00e9
                           0000EA   431 _PCA0CPH1	=	0x00ea
                           0000EB   432 _PCA0CPL2	=	0x00eb
                           0000EC   433 _PCA0CPH2	=	0x00ec
                           0000ED   434 _PCA0CPL3	=	0x00ed
                           0000EE   435 _PCA0CPH3	=	0x00ee
                           0000EF   436 _RSTSRC	=	0x00ef
                           0000F0   437 _B	=	0x00f0
                           0000F1   438 _P0MDIN	=	0x00f1
                           0000F2   439 _P1MDIN	=	0x00f2
                           0000F3   440 _P2MDIN	=	0x00f3
                           0000F4   441 _P3MDIN	=	0x00f4
                           0000F5   442 _P4MDIN	=	0x00f5
                           0000F6   443 _EIP1	=	0x00f6
                           0000F7   444 _EIP2	=	0x00f7
                           0000F8   445 _SPI0CN	=	0x00f8
                           0000F9   446 _PCA0L	=	0x00f9
                           0000FA   447 _PCA0H	=	0x00fa
                           0000FB   448 _PCA0CPL0	=	0x00fb
                           0000FC   449 _PCA0CPH0	=	0x00fc
                           0000FD   450 _PCA0CPL4	=	0x00fd
                           0000FE   451 _PCA0CPH4	=	0x00fe
                           0000FF   452 _VDM0CN	=	0x00ff
                           008382   453 _DP	=	0x8382
                           009392   454 _TMR3RL	=	0x9392
                           009392   455 _TMR4RL	=	0x9392
                           009594   456 _TMR3	=	0x9594
                           009594   457 _TMR4	=	0x9594
                           00B5B4   458 _SBRL1	=	0xb5b4
                           00BEBD   459 _ADC0	=	0xbebd
                           00C4C3   460 _ADC0GT	=	0xc4c3
                           00C6C5   461 _ADC0LT	=	0xc6c5
                           00CBCA   462 _TMR2RL	=	0xcbca
                           00CBCA   463 _TMR5RL	=	0xcbca
                           00CDCC   464 _TMR2	=	0xcdcc
                           00CDCC   465 _TMR5	=	0xcdcc
                           00EAE9   466 _PCA0CP1	=	0xeae9
                           00ECEB   467 _PCA0CP2	=	0xeceb
                           00EEED   468 _PCA0CP3	=	0xeeed
                           00FAF9   469 _PCA0	=	0xfaf9
                           00FCFB   470 _PCA0CP0	=	0xfcfb
                           00FEFD   471 _PCA0CP4	=	0xfefd
                                    472 ;--------------------------------------------------------
                                    473 ; special function bits
                                    474 ;--------------------------------------------------------
                                    475 	.area RSEG    (ABS,DATA)
      000000                        476 	.org 0x0000
                           000080   477 _P0_0	=	0x0080
                           000081   478 _P0_1	=	0x0081
                           000082   479 _P0_2	=	0x0082
                           000083   480 _P0_3	=	0x0083
                           000084   481 _P0_4	=	0x0084
                           000085   482 _P0_5	=	0x0085
                           000086   483 _P0_6	=	0x0086
                           000087   484 _P0_7	=	0x0087
                           00008F   485 _TF1	=	0x008f
                           00008E   486 _TR1	=	0x008e
                           00008D   487 _TF0	=	0x008d
                           00008C   488 _TR0	=	0x008c
                           00008B   489 _IE1	=	0x008b
                           00008A   490 _IT1	=	0x008a
                           000089   491 _IE0	=	0x0089
                           000088   492 _IT0	=	0x0088
                           000090   493 _P1_0	=	0x0090
                           000091   494 _P1_1	=	0x0091
                           000092   495 _P1_2	=	0x0092
                           000093   496 _P1_3	=	0x0093
                           000094   497 _P1_4	=	0x0094
                           000095   498 _P1_5	=	0x0095
                           000096   499 _P1_6	=	0x0096
                           000097   500 _P1_7	=	0x0097
                           00009F   501 _S0MODE	=	0x009f
                           00009D   502 _MCE0	=	0x009d
                           00009C   503 _REN0	=	0x009c
                           00009B   504 _TB80	=	0x009b
                           00009A   505 _RB80	=	0x009a
                           000099   506 _TI0	=	0x0099
                           000098   507 _RI0	=	0x0098
                           0000A0   508 _P2_0	=	0x00a0
                           0000A1   509 _P2_1	=	0x00a1
                           0000A2   510 _P2_2	=	0x00a2
                           0000A3   511 _P2_3	=	0x00a3
                           0000A4   512 _P2_4	=	0x00a4
                           0000A5   513 _P2_5	=	0x00a5
                           0000A6   514 _P2_6	=	0x00a6
                           0000A7   515 _P2_7	=	0x00a7
                           0000AF   516 _EA	=	0x00af
                           0000AE   517 _ESPI0	=	0x00ae
                           0000AD   518 _ET2	=	0x00ad
                           0000AC   519 _ES0	=	0x00ac
                           0000AB   520 _ET1	=	0x00ab
                           0000AA   521 _EX1	=	0x00aa
                           0000A9   522 _ET0	=	0x00a9
                           0000A8   523 _EX0	=	0x00a8
                           0000B0   524 _P3_0	=	0x00b0
                           0000B1   525 _P3_1	=	0x00b1
                           0000B2   526 _P3_2	=	0x00b2
                           0000B3   527 _P3_3	=	0x00b3
                           0000B4   528 _P3_4	=	0x00b4
                           0000B5   529 _P3_5	=	0x00b5
                           0000B6   530 _P3_6	=	0x00b6
                           0000B7   531 _P3_7	=	0x00b7
                           0000BE   532 _PSPI0	=	0x00be
                           0000BD   533 _PT2	=	0x00bd
                           0000BC   534 _PS0	=	0x00bc
                           0000BB   535 _PT1	=	0x00bb
                           0000BA   536 _PX1	=	0x00ba
                           0000B9   537 _PT0	=	0x00b9
                           0000B8   538 _PX0	=	0x00b8
                           0000C7   539 _MASTER0	=	0x00c7
                           0000C6   540 _TXMODE0	=	0x00c6
                           0000C5   541 _STA0	=	0x00c5
                           0000C4   542 _STO0	=	0x00c4
                           0000C3   543 _ACKRQ0	=	0x00c3
                           0000C2   544 _ARBLOST0	=	0x00c2
                           0000C1   545 _ACK0	=	0x00c1
                           0000C0   546 _SI0	=	0x00c0
                           0000C7   547 _MASTER1	=	0x00c7
                           0000C6   548 _TXMODE1	=	0x00c6
                           0000C5   549 _STA1	=	0x00c5
                           0000C4   550 _STO1	=	0x00c4
                           0000C3   551 _ACKRQ1	=	0x00c3
                           0000C2   552 _ARBLOST1	=	0x00c2
                           0000C1   553 _ACK1	=	0x00c1
                           0000C0   554 _SI1	=	0x00c0
                           0000CF   555 _TF2H	=	0x00cf
                           0000CE   556 _TF2L	=	0x00ce
                           0000CD   557 _TF2LEN	=	0x00cd
                           0000CC   558 _TF2CEN	=	0x00cc
                           0000CB   559 _T2SPLIT	=	0x00cb
                           0000CA   560 _TR2	=	0x00ca
                           0000C9   561 _T2CSS	=	0x00c9
                           0000C8   562 _T2XCLK	=	0x00c8
                           0000CF   563 _TF5H	=	0x00cf
                           0000CE   564 _TF5L	=	0x00ce
                           0000CD   565 _TF5LEN	=	0x00cd
                           0000CB   566 _T5SPLIT	=	0x00cb
                           0000CA   567 _TR5	=	0x00ca
                           0000C8   568 _T5XCLK	=	0x00c8
                           0000D7   569 _CY	=	0x00d7
                           0000D6   570 _AC	=	0x00d6
                           0000D5   571 _F0	=	0x00d5
                           0000D4   572 _RS1	=	0x00d4
                           0000D3   573 _RS0	=	0x00d3
                           0000D2   574 _OV	=	0x00d2
                           0000D1   575 _F1	=	0x00d1
                           0000D0   576 _PARITY	=	0x00d0
                           0000DF   577 _CF	=	0x00df
                           0000DE   578 _CR	=	0x00de
                           0000DC   579 _CCF4	=	0x00dc
                           0000DB   580 _CCF3	=	0x00db
                           0000DA   581 _CCF2	=	0x00da
                           0000D9   582 _CCF1	=	0x00d9
                           0000D8   583 _CCF0	=	0x00d8
                           0000EF   584 _AD0EN	=	0x00ef
                           0000EE   585 _AD0TM	=	0x00ee
                           0000ED   586 _AD0INT	=	0x00ed
                           0000EC   587 _AD0BUSY	=	0x00ec
                           0000EB   588 _AD0WINT	=	0x00eb
                           0000EA   589 _AD0CM2	=	0x00ea
                           0000E9   590 _AD0CM1	=	0x00e9
                           0000E8   591 _AD0CM0	=	0x00e8
                           0000FF   592 _SPIF	=	0x00ff
                           0000FE   593 _WCOL	=	0x00fe
                           0000FD   594 _MODF	=	0x00fd
                           0000FC   595 _RXOVRN	=	0x00fc
                           0000FB   596 _NSSMD1	=	0x00fb
                           0000FA   597 _NSSMD0	=	0x00fa
                           0000F9   598 _TXBMT	=	0x00f9
                           0000F8   599 _SPIEN	=	0x00f8
                                    600 ;--------------------------------------------------------
                                    601 ; overlayable register banks
                                    602 ;--------------------------------------------------------
                                    603 	.area REG_BANK_0	(REL,OVR,DATA)
      000000                        604 	.ds 8
                                    605 ;--------------------------------------------------------
                                    606 ; internal ram data
                                    607 ;--------------------------------------------------------
                                    608 	.area DSEG    (DATA)
                                    609 ;--------------------------------------------------------
                                    610 ; overlayable items in internal ram
                                    611 ;--------------------------------------------------------
                                    612 	.area	OSEG    (OVR,DATA)
                                    613 ;--------------------------------------------------------
                                    614 ; Stack segment in internal ram
                                    615 ;--------------------------------------------------------
                                    616 	.area	SSEG
      000008                        617 __start__stack:
      000008                        618 	.ds	1
                                    619 
                                    620 ;--------------------------------------------------------
                                    621 ; indirectly addressable internal ram data
                                    622 ;--------------------------------------------------------
                                    623 	.area ISEG    (DATA)
                                    624 ;--------------------------------------------------------
                                    625 ; absolute internal ram data
                                    626 ;--------------------------------------------------------
                                    627 	.area IABS    (ABS,DATA)
                                    628 	.area IABS    (ABS,DATA)
                                    629 ;--------------------------------------------------------
                                    630 ; bit data
                                    631 ;--------------------------------------------------------
                                    632 	.area BSEG    (BIT)
                                    633 ;--------------------------------------------------------
                                    634 ; paged external ram data
                                    635 ;--------------------------------------------------------
                                    636 	.area PSEG    (PAG,XDATA)
                                    637 ;--------------------------------------------------------
                                    638 ; external ram data
                                    639 ;--------------------------------------------------------
                                    640 	.area XSEG    (XDATA)
                                    641 ;--------------------------------------------------------
                                    642 ; absolute external ram data
                                    643 ;--------------------------------------------------------
                                    644 	.area XABS    (ABS,XDATA)
                                    645 ;--------------------------------------------------------
                                    646 ; external initialized ram data
                                    647 ;--------------------------------------------------------
                                    648 	.area XISEG   (XDATA)
                                    649 	.area HOME    (CODE)
                                    650 	.area GSINIT0 (CODE)
                                    651 	.area GSINIT1 (CODE)
                                    652 	.area GSINIT2 (CODE)
                                    653 	.area GSINIT3 (CODE)
                                    654 	.area GSINIT4 (CODE)
                                    655 	.area GSINIT5 (CODE)
                                    656 	.area GSINIT  (CODE)
                                    657 	.area GSFINAL (CODE)
                                    658 	.area CSEG    (CODE)
                                    659 ;--------------------------------------------------------
                                    660 ; interrupt vector
                                    661 ;--------------------------------------------------------
                                    662 	.area HOME    (CODE)
      000000                        663 __interrupt_vect:
      000000 02 00 06         [24]  664 	ljmp	__sdcc_gsinit_startup
                                    665 ;--------------------------------------------------------
                                    666 ; global & static initialisations
                                    667 ;--------------------------------------------------------
                                    668 	.area HOME    (CODE)
                                    669 	.area GSINIT  (CODE)
                                    670 	.area GSFINAL (CODE)
                                    671 	.area GSINIT  (CODE)
                                    672 	.globl __sdcc_gsinit_startup
                                    673 	.globl __sdcc_program_startup
                                    674 	.globl __start__stack
                                    675 	.globl __mcs51_genXINIT
                                    676 	.globl __mcs51_genXRAMCLEAR
                                    677 	.globl __mcs51_genRAMCLEAR
                                    678 	.area GSFINAL (CODE)
      00005F 02 00 03         [24]  679 	ljmp	__sdcc_program_startup
                                    680 ;--------------------------------------------------------
                                    681 ; Home
                                    682 ;--------------------------------------------------------
                                    683 	.area HOME    (CODE)
                                    684 	.area HOME    (CODE)
      000003                        685 __sdcc_program_startup:
      000003 02 00 62         [24]  686 	ljmp	_main
                                    687 ;	return from main will return to caller
                                    688 ;--------------------------------------------------------
                                    689 ; code
                                    690 ;--------------------------------------------------------
                                    691 	.area CSEG    (CODE)
                                    692 ;------------------------------------------------------------
                                    693 ;Allocation info for local variables in function 'main'
                                    694 ;------------------------------------------------------------
                                    695 ;scan                      Allocated to registers r7 
                                    696 ;------------------------------------------------------------
                                    697 ;	timerc3.c:7: void main()
                                    698 ;	-----------------------------------------
                                    699 ;	 function main
                                    700 ;	-----------------------------------------
      000062                        701 _main:
                           000007   702 	ar7 = 0x07
                           000006   703 	ar6 = 0x06
                           000005   704 	ar5 = 0x05
                           000004   705 	ar4 = 0x04
                           000003   706 	ar3 = 0x03
                           000002   707 	ar2 = 0x02
                           000001   708 	ar1 = 0x01
                           000000   709 	ar0 = 0x00
                                    710 ;	timerc3.c:10: PCA0MD = 0x00;
      000062 75 D9 00         [24]  711 	mov	_PCA0MD,#0x00
                                    712 ;	timerc3.c:11: XBR1 = 0x40;
      000065 75 E2 40         [24]  713 	mov	_XBR1,#0x40
                                    714 ;	timerc3.c:13: char scan = 0;
      000068 7F 00            [12]  715 	mov	r7,#0x00
                                    716 ;	timerc3.c:16: while(1){
      00006A                        717 00110$:
                                    718 ;	timerc3.c:17: if(scan == 0)
      00006A EF               [12]  719 	mov	a,r7
      00006B 70 05            [24]  720 	jnz	00102$
                                    721 ;	timerc3.c:19: P2 = 0xb0;}
      00006D 75 A0 B0         [24]  722 	mov	_P2,#0xb0
      000070 80 03            [24]  723 	sjmp	00103$
      000072                        724 00102$:
                                    725 ;	timerc3.c:20: else{P2=0Xff;}
      000072 75 A0 FF         [24]  726 	mov	_P2,#0xff
      000075                        727 00103$:
                                    728 ;	timerc3.c:22: if(P0_6==0){
      000075 20 86 F2         [24]  729 	jb	_P0_6,00110$
                                    730 ;	timerc3.c:23: while(P0_6 == 0)
      000078                        731 00104$:
      000078 20 86 EF         [24]  732 	jb	_P0_6,00110$
                                    733 ;	timerc3.c:25: scan = ~scan;
      00007B EF               [12]  734 	mov	a,r7
      00007C F4               [12]  735 	cpl	a
      00007D FF               [12]  736 	mov	r7,a
                                    737 ;	timerc3.c:29: }
      00007E 80 F8            [24]  738 	sjmp	00104$
                                    739 	.area CSEG    (CODE)
                                    740 	.area CONST   (CODE)
                                    741 	.area XINIT   (CODE)
                                    742 	.area CABS    (ABS,CODE)
