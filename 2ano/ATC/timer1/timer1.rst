                                      1 ;--------------------------------------------------------
                                      2 ; File Created by SDCC : free open source ANSI-C Compiler
                                      3 ; Version 4.2.0 #13081 (MINGW64)
                                      4 ;--------------------------------------------------------
                                      5 	.module timer1
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
                           000080   307 _P0	=	0x0080
                           000081   308 _SP	=	0x0081
                           000082   309 _DPL	=	0x0082
                           000083   310 _DPH	=	0x0083
                           000084   311 _EMI0TC	=	0x0084
                           000085   312 _EMI0CF	=	0x0085
                           000086   313 _OSCLCN	=	0x0086
                           000087   314 _PCON	=	0x0087
                           000088   315 _TCON	=	0x0088
                           000089   316 _TMOD	=	0x0089
                           00008A   317 _TL0	=	0x008a
                           00008B   318 _TL1	=	0x008b
                           00008C   319 _TH0	=	0x008c
                           00008D   320 _TH1	=	0x008d
                           00008E   321 _CKCON	=	0x008e
                           00008F   322 _PSCTL	=	0x008f
                           000090   323 _P1	=	0x0090
                           000091   324 _TMR3CN	=	0x0091
                           000092   325 _TMR3RLL	=	0x0092
                           000093   326 _TMR3RLH	=	0x0093
                           000094   327 _TMR3L	=	0x0094
                           000095   328 _TMR3H	=	0x0095
                           000096   329 _USB0ADR	=	0x0096
                           000097   330 _USB0DAT	=	0x0097
                           000091   331 _TMR4CN	=	0x0091
                           000092   332 _TMR4RLL	=	0x0092
                           000093   333 _TMR4RLH	=	0x0093
                           000098   334 _SCON0	=	0x0098
                           000099   335 _SBUF0	=	0x0099
                           00009A   336 _CPT1CN	=	0x009a
                           00009B   337 _CPT0CN	=	0x009b
                           00009C   338 _CPT1MD	=	0x009c
                           00009D   339 _CPT0MD	=	0x009d
                           00009E   340 _CPT1MX	=	0x009e
                           00009F   341 _CPT0MX	=	0x009f
                           0000A0   342 _P2	=	0x00a0
                           0000A1   343 _SPI0CFG	=	0x00a1
                           0000A2   344 _SPI0CKR	=	0x00a2
                           0000A3   345 _SPI0DAT	=	0x00a3
                           0000A4   346 _P0MDOUT	=	0x00a4
                           0000A5   347 _P1MDOUT	=	0x00a5
                           0000A6   348 _P2MDOUT	=	0x00a6
                           0000A7   349 _P3MDOUT	=	0x00a7
                           0000A8   350 _IE	=	0x00a8
                           0000A9   351 _CLKSEL	=	0x00a9
                           0000AA   352 _EMI0CN	=	0x00aa
                           0000AA   353 __XPAGE	=	0x00aa
                           0000AC   354 _SBCON1	=	0x00ac
                           0000AE   355 _P4MDOUT	=	0x00ae
                           0000AF   356 _PFE0CN	=	0x00af
                           0000B0   357 _P3	=	0x00b0
                           0000B1   358 _OSCXCN	=	0x00b1
                           0000B2   359 _OSCICN	=	0x00b2
                           0000B3   360 _OSCICL	=	0x00b3
                           0000B4   361 _SBRLL1	=	0x00b4
                           0000B5   362 _SBRLH1	=	0x00b5
                           0000B6   363 _FLSCL	=	0x00b6
                           0000B7   364 _FLKEY	=	0x00b7
                           0000B8   365 _IP	=	0x00b8
                           0000B9   366 _CLKMUL	=	0x00b9
                           0000BA   367 _AMX0N	=	0x00ba
                           0000BB   368 _AMX0P	=	0x00bb
                           0000BC   369 _ADC0CF	=	0x00bc
                           0000BD   370 _ADC0L	=	0x00bd
                           0000BE   371 _ADC0H	=	0x00be
                           0000BF   372 _SFRPAGE	=	0x00bf
                           0000B9   373 _SMBTC	=	0x00b9
                           0000C0   374 _SMB0CN	=	0x00c0
                           0000C1   375 _SMB0CF	=	0x00c1
                           0000C2   376 _SMB0DAT	=	0x00c2
                           0000C3   377 _ADC0GTL	=	0x00c3
                           0000C4   378 _ADC0GTH	=	0x00c4
                           0000C5   379 _ADC0LTL	=	0x00c5
                           0000C6   380 _ADC0LTH	=	0x00c6
                           0000C7   381 _P4	=	0x00c7
                           0000C0   382 _SMB1CN	=	0x00c0
                           0000C1   383 _SMB1CF	=	0x00c1
                           0000C2   384 _SMB1DAT	=	0x00c2
                           0000C8   385 _T2CON	=	0x00c8
                           0000C8   386 _TMR2CN	=	0x00c8
                           0000C9   387 _REG01CN	=	0x00c9
                           0000CA   388 _RCAP2L	=	0x00ca
                           0000CA   389 _TMR2RLL	=	0x00ca
                           0000CB   390 _RCAP2H	=	0x00cb
                           0000CB   391 _TMR2RLH	=	0x00cb
                           0000CC   392 _TL2	=	0x00cc
                           0000CC   393 _TMR2L	=	0x00cc
                           0000CD   394 _TH2	=	0x00cd
                           0000CD   395 _TMR2H	=	0x00cd
                           0000CE   396 _SMB0ADM	=	0x00ce
                           0000CF   397 _SMB0ADR	=	0x00cf
                           0000C8   398 _TMR5CN	=	0x00c8
                           0000CA   399 _TMR5RLL	=	0x00ca
                           0000CB   400 _TMR5RLH	=	0x00cb
                           0000CC   401 _TMR5L	=	0x00cc
                           0000CD   402 _TMR5H	=	0x00cd
                           0000CE   403 _SMB1ADM	=	0x00ce
                           0000CF   404 _SMB1ADR	=	0x00cf
                           0000D0   405 _PSW	=	0x00d0
                           0000D1   406 _REF0CN	=	0x00d1
                           0000D2   407 _SCON1	=	0x00d2
                           0000D3   408 _SBUF1	=	0x00d3
                           0000D4   409 _P0SKIP	=	0x00d4
                           0000D5   410 _P1SKIP	=	0x00d5
                           0000D6   411 _P2SKIP	=	0x00d6
                           0000D7   412 _USB0XCN	=	0x00d7
                           0000D8   413 _PCA0CN	=	0x00d8
                           0000D9   414 _PCA0MD	=	0x00d9
                           0000DA   415 _PCA0CPM0	=	0x00da
                           0000DB   416 _PCA0CPM1	=	0x00db
                           0000DC   417 _PCA0CPM2	=	0x00dc
                           0000DD   418 _PCA0CPM3	=	0x00dd
                           0000DE   419 _PCA0CPM4	=	0x00de
                           0000DF   420 _P3SKIP	=	0x00df
                           0000E0   421 _ACC	=	0x00e0
                           0000E1   422 _XBR0	=	0x00e1
                           0000E2   423 _XBR1	=	0x00e2
                           0000E3   424 _XBR2	=	0x00e3
                           0000E4   425 _IT01CF	=	0x00e4
                           0000E5   426 _SMOD1	=	0x00e5
                           0000E6   427 _EIE1	=	0x00e6
                           0000E7   428 _EIE2	=	0x00e7
                           0000E4   429 _CKCON1	=	0x00e4
                           0000E8   430 _ADC0CN	=	0x00e8
                           0000E9   431 _PCA0CPL1	=	0x00e9
                           0000EA   432 _PCA0CPH1	=	0x00ea
                           0000EB   433 _PCA0CPL2	=	0x00eb
                           0000EC   434 _PCA0CPH2	=	0x00ec
                           0000ED   435 _PCA0CPL3	=	0x00ed
                           0000EE   436 _PCA0CPH3	=	0x00ee
                           0000EF   437 _RSTSRC	=	0x00ef
                           0000F0   438 _B	=	0x00f0
                           0000F1   439 _P0MDIN	=	0x00f1
                           0000F2   440 _P1MDIN	=	0x00f2
                           0000F3   441 _P2MDIN	=	0x00f3
                           0000F4   442 _P3MDIN	=	0x00f4
                           0000F5   443 _P4MDIN	=	0x00f5
                           0000F6   444 _EIP1	=	0x00f6
                           0000F7   445 _EIP2	=	0x00f7
                           0000F8   446 _SPI0CN	=	0x00f8
                           0000F9   447 _PCA0L	=	0x00f9
                           0000FA   448 _PCA0H	=	0x00fa
                           0000FB   449 _PCA0CPL0	=	0x00fb
                           0000FC   450 _PCA0CPH0	=	0x00fc
                           0000FD   451 _PCA0CPL4	=	0x00fd
                           0000FE   452 _PCA0CPH4	=	0x00fe
                           0000FF   453 _VDM0CN	=	0x00ff
                           008382   454 _DP	=	0x8382
                           009392   455 _TMR3RL	=	0x9392
                           009392   456 _TMR4RL	=	0x9392
                           009594   457 _TMR3	=	0x9594
                           009594   458 _TMR4	=	0x9594
                           00B5B4   459 _SBRL1	=	0xb5b4
                           00BEBD   460 _ADC0	=	0xbebd
                           00C4C3   461 _ADC0GT	=	0xc4c3
                           00C6C5   462 _ADC0LT	=	0xc6c5
                           00CBCA   463 _TMR2RL	=	0xcbca
                           00CBCA   464 _TMR5RL	=	0xcbca
                           00CDCC   465 _TMR2	=	0xcdcc
                           00CDCC   466 _TMR5	=	0xcdcc
                           00EAE9   467 _PCA0CP1	=	0xeae9
                           00ECEB   468 _PCA0CP2	=	0xeceb
                           00EEED   469 _PCA0CP3	=	0xeeed
                           00FAF9   470 _PCA0	=	0xfaf9
                           00FCFB   471 _PCA0CP0	=	0xfcfb
                           00FEFD   472 _PCA0CP4	=	0xfefd
                                    473 ;--------------------------------------------------------
                                    474 ; special function bits
                                    475 ;--------------------------------------------------------
                                    476 	.area RSEG    (ABS,DATA)
      000000                        477 	.org 0x0000
                           000080   478 _P0_0	=	0x0080
                           000081   479 _P0_1	=	0x0081
                           000082   480 _P0_2	=	0x0082
                           000083   481 _P0_3	=	0x0083
                           000084   482 _P0_4	=	0x0084
                           000085   483 _P0_5	=	0x0085
                           000086   484 _P0_6	=	0x0086
                           000087   485 _P0_7	=	0x0087
                           00008F   486 _TF1	=	0x008f
                           00008E   487 _TR1	=	0x008e
                           00008D   488 _TF0	=	0x008d
                           00008C   489 _TR0	=	0x008c
                           00008B   490 _IE1	=	0x008b
                           00008A   491 _IT1	=	0x008a
                           000089   492 _IE0	=	0x0089
                           000088   493 _IT0	=	0x0088
                           000090   494 _P1_0	=	0x0090
                           000091   495 _P1_1	=	0x0091
                           000092   496 _P1_2	=	0x0092
                           000093   497 _P1_3	=	0x0093
                           000094   498 _P1_4	=	0x0094
                           000095   499 _P1_5	=	0x0095
                           000096   500 _P1_6	=	0x0096
                           000097   501 _P1_7	=	0x0097
                           00009F   502 _S0MODE	=	0x009f
                           00009D   503 _MCE0	=	0x009d
                           00009C   504 _REN0	=	0x009c
                           00009B   505 _TB80	=	0x009b
                           00009A   506 _RB80	=	0x009a
                           000099   507 _TI0	=	0x0099
                           000098   508 _RI0	=	0x0098
                           0000A0   509 _P2_0	=	0x00a0
                           0000A1   510 _P2_1	=	0x00a1
                           0000A2   511 _P2_2	=	0x00a2
                           0000A3   512 _P2_3	=	0x00a3
                           0000A4   513 _P2_4	=	0x00a4
                           0000A5   514 _P2_5	=	0x00a5
                           0000A6   515 _P2_6	=	0x00a6
                           0000A7   516 _P2_7	=	0x00a7
                           0000AF   517 _EA	=	0x00af
                           0000AE   518 _ESPI0	=	0x00ae
                           0000AD   519 _ET2	=	0x00ad
                           0000AC   520 _ES0	=	0x00ac
                           0000AB   521 _ET1	=	0x00ab
                           0000AA   522 _EX1	=	0x00aa
                           0000A9   523 _ET0	=	0x00a9
                           0000A8   524 _EX0	=	0x00a8
                           0000B0   525 _P3_0	=	0x00b0
                           0000B1   526 _P3_1	=	0x00b1
                           0000B2   527 _P3_2	=	0x00b2
                           0000B3   528 _P3_3	=	0x00b3
                           0000B4   529 _P3_4	=	0x00b4
                           0000B5   530 _P3_5	=	0x00b5
                           0000B6   531 _P3_6	=	0x00b6
                           0000B7   532 _P3_7	=	0x00b7
                           0000BE   533 _PSPI0	=	0x00be
                           0000BD   534 _PT2	=	0x00bd
                           0000BC   535 _PS0	=	0x00bc
                           0000BB   536 _PT1	=	0x00bb
                           0000BA   537 _PX1	=	0x00ba
                           0000B9   538 _PT0	=	0x00b9
                           0000B8   539 _PX0	=	0x00b8
                           0000C7   540 _MASTER0	=	0x00c7
                           0000C6   541 _TXMODE0	=	0x00c6
                           0000C5   542 _STA0	=	0x00c5
                           0000C4   543 _STO0	=	0x00c4
                           0000C3   544 _ACKRQ0	=	0x00c3
                           0000C2   545 _ARBLOST0	=	0x00c2
                           0000C1   546 _ACK0	=	0x00c1
                           0000C0   547 _SI0	=	0x00c0
                           0000C7   548 _MASTER1	=	0x00c7
                           0000C6   549 _TXMODE1	=	0x00c6
                           0000C5   550 _STA1	=	0x00c5
                           0000C4   551 _STO1	=	0x00c4
                           0000C3   552 _ACKRQ1	=	0x00c3
                           0000C2   553 _ARBLOST1	=	0x00c2
                           0000C1   554 _ACK1	=	0x00c1
                           0000C0   555 _SI1	=	0x00c0
                           0000CF   556 _TF2H	=	0x00cf
                           0000CE   557 _TF2L	=	0x00ce
                           0000CD   558 _TF2LEN	=	0x00cd
                           0000CC   559 _TF2CEN	=	0x00cc
                           0000CB   560 _T2SPLIT	=	0x00cb
                           0000CA   561 _TR2	=	0x00ca
                           0000C9   562 _T2CSS	=	0x00c9
                           0000C8   563 _T2XCLK	=	0x00c8
                           0000CF   564 _TF5H	=	0x00cf
                           0000CE   565 _TF5L	=	0x00ce
                           0000CD   566 _TF5LEN	=	0x00cd
                           0000CB   567 _T5SPLIT	=	0x00cb
                           0000CA   568 _TR5	=	0x00ca
                           0000C8   569 _T5XCLK	=	0x00c8
                           0000D7   570 _CY	=	0x00d7
                           0000D6   571 _AC	=	0x00d6
                           0000D5   572 _F0	=	0x00d5
                           0000D4   573 _RS1	=	0x00d4
                           0000D3   574 _RS0	=	0x00d3
                           0000D2   575 _OV	=	0x00d2
                           0000D1   576 _F1	=	0x00d1
                           0000D0   577 _PARITY	=	0x00d0
                           0000DF   578 _CF	=	0x00df
                           0000DE   579 _CR	=	0x00de
                           0000DC   580 _CCF4	=	0x00dc
                           0000DB   581 _CCF3	=	0x00db
                           0000DA   582 _CCF2	=	0x00da
                           0000D9   583 _CCF1	=	0x00d9
                           0000D8   584 _CCF0	=	0x00d8
                           0000EF   585 _AD0EN	=	0x00ef
                           0000EE   586 _AD0TM	=	0x00ee
                           0000ED   587 _AD0INT	=	0x00ed
                           0000EC   588 _AD0BUSY	=	0x00ec
                           0000EB   589 _AD0WINT	=	0x00eb
                           0000EA   590 _AD0CM2	=	0x00ea
                           0000E9   591 _AD0CM1	=	0x00e9
                           0000E8   592 _AD0CM0	=	0x00e8
                           0000FF   593 _SPIF	=	0x00ff
                           0000FE   594 _WCOL	=	0x00fe
                           0000FD   595 _MODF	=	0x00fd
                           0000FC   596 _RXOVRN	=	0x00fc
                           0000FB   597 _NSSMD1	=	0x00fb
                           0000FA   598 _NSSMD0	=	0x00fa
                           0000F9   599 _TXBMT	=	0x00f9
                           0000F8   600 _SPIEN	=	0x00f8
                                    601 ;--------------------------------------------------------
                                    602 ; overlayable register banks
                                    603 ;--------------------------------------------------------
                                    604 	.area REG_BANK_0	(REL,OVR,DATA)
      000000                        605 	.ds 8
                                    606 ;--------------------------------------------------------
                                    607 ; internal ram data
                                    608 ;--------------------------------------------------------
                                    609 	.area DSEG    (DATA)
      000008                        610 _main_zero_nine_65537_7:
      000008                        611 	.ds 10
                                    612 ;--------------------------------------------------------
                                    613 ; overlayable items in internal ram
                                    614 ;--------------------------------------------------------
                                    615 	.area	OSEG    (OVR,DATA)
                                    616 ;--------------------------------------------------------
                                    617 ; Stack segment in internal ram
                                    618 ;--------------------------------------------------------
                                    619 	.area	SSEG
      000012                        620 __start__stack:
      000012                        621 	.ds	1
                                    622 
                                    623 ;--------------------------------------------------------
                                    624 ; indirectly addressable internal ram data
                                    625 ;--------------------------------------------------------
                                    626 	.area ISEG    (DATA)
                                    627 ;--------------------------------------------------------
                                    628 ; absolute internal ram data
                                    629 ;--------------------------------------------------------
                                    630 	.area IABS    (ABS,DATA)
                                    631 	.area IABS    (ABS,DATA)
                                    632 ;--------------------------------------------------------
                                    633 ; bit data
                                    634 ;--------------------------------------------------------
                                    635 	.area BSEG    (BIT)
                                    636 ;--------------------------------------------------------
                                    637 ; paged external ram data
                                    638 ;--------------------------------------------------------
                                    639 	.area PSEG    (PAG,XDATA)
                                    640 ;--------------------------------------------------------
                                    641 ; external ram data
                                    642 ;--------------------------------------------------------
                                    643 	.area XSEG    (XDATA)
                                    644 ;--------------------------------------------------------
                                    645 ; absolute external ram data
                                    646 ;--------------------------------------------------------
                                    647 	.area XABS    (ABS,XDATA)
                                    648 ;--------------------------------------------------------
                                    649 ; external initialized ram data
                                    650 ;--------------------------------------------------------
                                    651 	.area XISEG   (XDATA)
                                    652 	.area HOME    (CODE)
                                    653 	.area GSINIT0 (CODE)
                                    654 	.area GSINIT1 (CODE)
                                    655 	.area GSINIT2 (CODE)
                                    656 	.area GSINIT3 (CODE)
                                    657 	.area GSINIT4 (CODE)
                                    658 	.area GSINIT5 (CODE)
                                    659 	.area GSINIT  (CODE)
                                    660 	.area GSFINAL (CODE)
                                    661 	.area CSEG    (CODE)
                                    662 ;--------------------------------------------------------
                                    663 ; interrupt vector
                                    664 ;--------------------------------------------------------
                                    665 	.area HOME    (CODE)
      000000                        666 __interrupt_vect:
      000000 02 00 06         [24]  667 	ljmp	__sdcc_gsinit_startup
                                    668 ;--------------------------------------------------------
                                    669 ; global & static initialisations
                                    670 ;--------------------------------------------------------
                                    671 	.area HOME    (CODE)
                                    672 	.area GSINIT  (CODE)
                                    673 	.area GSFINAL (CODE)
                                    674 	.area GSINIT  (CODE)
                                    675 	.globl __sdcc_gsinit_startup
                                    676 	.globl __sdcc_program_startup
                                    677 	.globl __start__stack
                                    678 	.globl __mcs51_genXINIT
                                    679 	.globl __mcs51_genXRAMCLEAR
                                    680 	.globl __mcs51_genRAMCLEAR
                                    681 	.area GSFINAL (CODE)
      00005F 02 00 03         [24]  682 	ljmp	__sdcc_program_startup
                                    683 ;--------------------------------------------------------
                                    684 ; Home
                                    685 ;--------------------------------------------------------
                                    686 	.area HOME    (CODE)
                                    687 	.area HOME    (CODE)
      000003                        688 __sdcc_program_startup:
      000003 02 00 97         [24]  689 	ljmp	_main
                                    690 ;	return from main will return to caller
                                    691 ;--------------------------------------------------------
                                    692 ; code
                                    693 ;--------------------------------------------------------
                                    694 	.area CSEG    (CODE)
                                    695 ;------------------------------------------------------------
                                    696 ;Allocation info for local variables in function 'sdelay'
                                    697 ;------------------------------------------------------------
                                    698 ;time                      Allocated to registers r6 r7 
                                    699 ;i                         Allocated to registers r4 r5 
                                    700 ;j                         Allocated to registers r2 r3 
                                    701 ;------------------------------------------------------------
                                    702 ;	timer1.c:4: void sdelay(int time)  
                                    703 ;	-----------------------------------------
                                    704 ;	 function sdelay
                                    705 ;	-----------------------------------------
      000062                        706 _sdelay:
                           000007   707 	ar7 = 0x07
                           000006   708 	ar6 = 0x06
                           000005   709 	ar5 = 0x05
                           000004   710 	ar4 = 0x04
                           000003   711 	ar3 = 0x03
                           000002   712 	ar2 = 0x02
                           000001   713 	ar1 = 0x01
                           000000   714 	ar0 = 0x00
      000062 AE 82            [24]  715 	mov	r6,dpl
      000064 AF 83            [24]  716 	mov	r7,dph
                                    717 ;	timer1.c:7: for(int i=0;i<time;i++){
      000066 7C 00            [12]  718 	mov	r4,#0x00
      000068 7D 00            [12]  719 	mov	r5,#0x00
      00006A                        720 00107$:
      00006A C3               [12]  721 	clr	c
      00006B EC               [12]  722 	mov	a,r4
      00006C 9E               [12]  723 	subb	a,r6
      00006D ED               [12]  724 	mov	a,r5
      00006E 64 80            [12]  725 	xrl	a,#0x80
      000070 8F F0            [24]  726 	mov	b,r7
      000072 63 F0 80         [24]  727 	xrl	b,#0x80
      000075 95 F0            [12]  728 	subb	a,b
      000077 50 1D            [24]  729 	jnc	00109$
                                    730 ;	timer1.c:8: for (int j=0;j<100;j++);
      000079 7A 00            [12]  731 	mov	r2,#0x00
      00007B 7B 00            [12]  732 	mov	r3,#0x00
      00007D                        733 00104$:
      00007D C3               [12]  734 	clr	c
      00007E EA               [12]  735 	mov	a,r2
      00007F 94 64            [12]  736 	subb	a,#0x64
      000081 EB               [12]  737 	mov	a,r3
      000082 64 80            [12]  738 	xrl	a,#0x80
      000084 94 80            [12]  739 	subb	a,#0x80
      000086 50 07            [24]  740 	jnc	00108$
      000088 0A               [12]  741 	inc	r2
      000089 BA 00 F1         [24]  742 	cjne	r2,#0x00,00104$
      00008C 0B               [12]  743 	inc	r3
      00008D 80 EE            [24]  744 	sjmp	00104$
      00008F                        745 00108$:
                                    746 ;	timer1.c:7: for(int i=0;i<time;i++){
      00008F 0C               [12]  747 	inc	r4
      000090 BC 00 D7         [24]  748 	cjne	r4,#0x00,00107$
      000093 0D               [12]  749 	inc	r5
      000094 80 D4            [24]  750 	sjmp	00107$
      000096                        751 00109$:
                                    752 ;	timer1.c:10: }
      000096 22               [24]  753 	ret
                                    754 ;------------------------------------------------------------
                                    755 ;Allocation info for local variables in function 'main'
                                    756 ;------------------------------------------------------------
                                    757 ;zero_nine                 Allocated with name '_main_zero_nine_65537_7'
                                    758 ;i                         Allocated to registers r6 r7 
                                    759 ;------------------------------------------------------------
                                    760 ;	timer1.c:15: void main () {
                                    761 ;	-----------------------------------------
                                    762 ;	 function main
                                    763 ;	-----------------------------------------
      000097                        764 _main:
                                    765 ;	timer1.c:17: PCA0MD = 0x00;
      000097 75 D9 00         [24]  766 	mov	_PCA0MD,#0x00
                                    767 ;	timer1.c:18: XBR1 = 0x40;				
      00009A 75 E2 40         [24]  768 	mov	_XBR1,#0x40
                                    769 ;	timer1.c:21: char zero_nine[]={0xc0,0xf9,0xa4,0xb0,0x99,0x92,0x82,0xf8,0x80,0x90} ;    
      00009D 75 08 C0         [24]  770 	mov	_main_zero_nine_65537_7,#0xc0
      0000A0 75 09 F9         [24]  771 	mov	(_main_zero_nine_65537_7 + 0x0001),#0xf9
      0000A3 75 0A A4         [24]  772 	mov	(_main_zero_nine_65537_7 + 0x0002),#0xa4
      0000A6 75 0B B0         [24]  773 	mov	(_main_zero_nine_65537_7 + 0x0003),#0xb0
      0000A9 75 0C 99         [24]  774 	mov	(_main_zero_nine_65537_7 + 0x0004),#0x99
      0000AC 75 0D 92         [24]  775 	mov	(_main_zero_nine_65537_7 + 0x0005),#0x92
      0000AF 75 0E 82         [24]  776 	mov	(_main_zero_nine_65537_7 + 0x0006),#0x82
      0000B2 75 0F F8         [24]  777 	mov	(_main_zero_nine_65537_7 + 0x0007),#0xf8
      0000B5 75 10 80         [24]  778 	mov	(_main_zero_nine_65537_7 + 0x0008),#0x80
      0000B8 75 11 90         [24]  779 	mov	(_main_zero_nine_65537_7 + 0x0009),#0x90
                                    780 ;	timer1.c:25: for(int i=0;i<10;i++)
      0000BB                        781 00112$:
      0000BB 7E 00            [12]  782 	mov	r6,#0x00
      0000BD 7F 00            [12]  783 	mov	r7,#0x00
      0000BF                        784 00106$:
      0000BF C3               [12]  785 	clr	c
      0000C0 EE               [12]  786 	mov	a,r6
      0000C1 94 0A            [12]  787 	subb	a,#0x0a
      0000C3 EF               [12]  788 	mov	a,r7
      0000C4 64 80            [12]  789 	xrl	a,#0x80
      0000C6 94 80            [12]  790 	subb	a,#0x80
      0000C8 50 F1            [24]  791 	jnc	00112$
                                    792 ;	timer1.c:27: P2=zero_nine[i]; 
      0000CA EE               [12]  793 	mov	a,r6
      0000CB 24 08            [12]  794 	add	a,#_main_zero_nine_65537_7
      0000CD F9               [12]  795 	mov	r1,a
      0000CE 87 A0            [24]  796 	mov	_P2,@r1
                                    797 ;	timer1.c:28: sdelay(1000);
      0000D0 90 03 E8         [24]  798 	mov	dptr,#0x03e8
      0000D3 C0 07            [24]  799 	push	ar7
      0000D5 C0 06            [24]  800 	push	ar6
      0000D7 12 00 62         [24]  801 	lcall	_sdelay
      0000DA D0 06            [24]  802 	pop	ar6
      0000DC D0 07            [24]  803 	pop	ar7
                                    804 ;	timer1.c:25: for(int i=0;i<10;i++)
      0000DE 0E               [12]  805 	inc	r6
      0000DF BE 00 DD         [24]  806 	cjne	r6,#0x00,00106$
      0000E2 0F               [12]  807 	inc	r7
                                    808 ;	timer1.c:31: }
      0000E3 80 DA            [24]  809 	sjmp	00106$
                                    810 	.area CSEG    (CODE)
                                    811 	.area CONST   (CODE)
                                    812 	.area XINIT   (CODE)
                                    813 	.area CABS    (ABS,CODE)
