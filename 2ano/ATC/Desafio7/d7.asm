;--------------------------------------------------------
; File Created by SDCC : free open source ANSI-C Compiler
; Version 4.2.0 #13081 (MINGW64)
;--------------------------------------------------------
	.module d7
	.optsdcc -mmcs51 --model-small
	
;--------------------------------------------------------
; Public variables in this module
;--------------------------------------------------------
	.globl _main
	.globl _inter
	.globl _configUART0
	.globl _SPIEN
	.globl _TXBMT
	.globl _NSSMD0
	.globl _NSSMD1
	.globl _RXOVRN
	.globl _MODF
	.globl _WCOL
	.globl _SPIF
	.globl _AD0CM0
	.globl _AD0CM1
	.globl _AD0CM2
	.globl _AD0WINT
	.globl _AD0BUSY
	.globl _AD0INT
	.globl _AD0TM
	.globl _AD0EN
	.globl _CCF0
	.globl _CCF1
	.globl _CCF2
	.globl _CCF3
	.globl _CCF4
	.globl _CR
	.globl _CF
	.globl _PARITY
	.globl _F1
	.globl _OV
	.globl _RS0
	.globl _RS1
	.globl _F0
	.globl _AC
	.globl _CY
	.globl _T5XCLK
	.globl _TR5
	.globl _T5SPLIT
	.globl _TF5LEN
	.globl _TF5L
	.globl _TF5H
	.globl _T2XCLK
	.globl _T2CSS
	.globl _TR2
	.globl _T2SPLIT
	.globl _TF2CEN
	.globl _TF2LEN
	.globl _TF2L
	.globl _TF2H
	.globl _SI1
	.globl _ACK1
	.globl _ARBLOST1
	.globl _ACKRQ1
	.globl _STO1
	.globl _STA1
	.globl _TXMODE1
	.globl _MASTER1
	.globl _SI0
	.globl _ACK0
	.globl _ARBLOST0
	.globl _ACKRQ0
	.globl _STO0
	.globl _STA0
	.globl _TXMODE0
	.globl _MASTER0
	.globl _PX0
	.globl _PT0
	.globl _PX1
	.globl _PT1
	.globl _PS0
	.globl _PT2
	.globl _PSPI0
	.globl _P3_7
	.globl _P3_6
	.globl _P3_5
	.globl _P3_4
	.globl _P3_3
	.globl _P3_2
	.globl _P3_1
	.globl _P3_0
	.globl _EX0
	.globl _ET0
	.globl _EX1
	.globl _ET1
	.globl _ES0
	.globl _ET2
	.globl _ESPI0
	.globl _EA
	.globl _P2_7
	.globl _P2_6
	.globl _P2_5
	.globl _P2_4
	.globl _P2_3
	.globl _P2_2
	.globl _P2_1
	.globl _P2_0
	.globl _RI0
	.globl _TI0
	.globl _RB80
	.globl _TB80
	.globl _REN0
	.globl _MCE0
	.globl _S0MODE
	.globl _P1_7
	.globl _P1_6
	.globl _P1_5
	.globl _P1_4
	.globl _P1_3
	.globl _P1_2
	.globl _P1_1
	.globl _P1_0
	.globl _IT0
	.globl _IE0
	.globl _IT1
	.globl _IE1
	.globl _TR0
	.globl _TF0
	.globl _TR1
	.globl _TF1
	.globl _P0_7
	.globl _P0_6
	.globl _P0_5
	.globl _P0_4
	.globl _P0_3
	.globl _P0_2
	.globl _P0_1
	.globl _P0_0
	.globl _PCA0CP4
	.globl _PCA0CP0
	.globl _PCA0
	.globl _PCA0CP3
	.globl _PCA0CP2
	.globl _PCA0CP1
	.globl _TMR5
	.globl _TMR2
	.globl _TMR5RL
	.globl _TMR2RL
	.globl _ADC0LT
	.globl _ADC0GT
	.globl _ADC0
	.globl _SBRL1
	.globl _TMR4
	.globl _TMR3
	.globl _TMR4RL
	.globl _TMR3RL
	.globl _DP
	.globl _VDM0CN
	.globl _PCA0CPH4
	.globl _PCA0CPL4
	.globl _PCA0CPH0
	.globl _PCA0CPL0
	.globl _PCA0H
	.globl _PCA0L
	.globl _SPI0CN
	.globl _EIP2
	.globl _EIP1
	.globl _P4MDIN
	.globl _P3MDIN
	.globl _P2MDIN
	.globl _P1MDIN
	.globl _P0MDIN
	.globl _B
	.globl _RSTSRC
	.globl _PCA0CPH3
	.globl _PCA0CPL3
	.globl _PCA0CPH2
	.globl _PCA0CPL2
	.globl _PCA0CPH1
	.globl _PCA0CPL1
	.globl _ADC0CN
	.globl _CKCON1
	.globl _EIE2
	.globl _EIE1
	.globl _SMOD1
	.globl _IT01CF
	.globl _XBR2
	.globl _XBR1
	.globl _XBR0
	.globl _ACC
	.globl _P3SKIP
	.globl _PCA0CPM4
	.globl _PCA0CPM3
	.globl _PCA0CPM2
	.globl _PCA0CPM1
	.globl _PCA0CPM0
	.globl _PCA0MD
	.globl _PCA0CN
	.globl _USB0XCN
	.globl _P2SKIP
	.globl _P1SKIP
	.globl _P0SKIP
	.globl _SBUF1
	.globl _SCON1
	.globl _REF0CN
	.globl _PSW
	.globl _SMB1ADR
	.globl _SMB1ADM
	.globl _TMR5H
	.globl _TMR5L
	.globl _TMR5RLH
	.globl _TMR5RLL
	.globl _TMR5CN
	.globl _SMB0ADR
	.globl _SMB0ADM
	.globl _TMR2H
	.globl _TH2
	.globl _TMR2L
	.globl _TL2
	.globl _TMR2RLH
	.globl _RCAP2H
	.globl _TMR2RLL
	.globl _RCAP2L
	.globl _REG01CN
	.globl _TMR2CN
	.globl _T2CON
	.globl _SMB1DAT
	.globl _SMB1CF
	.globl _SMB1CN
	.globl _P4
	.globl _ADC0LTH
	.globl _ADC0LTL
	.globl _ADC0GTH
	.globl _ADC0GTL
	.globl _SMB0DAT
	.globl _SMB0CF
	.globl _SMB0CN
	.globl _SMBTC
	.globl _SFRPAGE
	.globl _ADC0H
	.globl _ADC0L
	.globl _ADC0CF
	.globl _AMX0P
	.globl _AMX0N
	.globl _CLKMUL
	.globl _IP
	.globl _FLKEY
	.globl _FLSCL
	.globl _SBRLH1
	.globl _SBRLL1
	.globl _OSCICL
	.globl _OSCICN
	.globl _OSCXCN
	.globl _P3
	.globl _PFE0CN
	.globl _P4MDOUT
	.globl _SBCON1
	.globl __XPAGE
	.globl _EMI0CN
	.globl _CLKSEL
	.globl _IE
	.globl _P3MDOUT
	.globl _P2MDOUT
	.globl _P1MDOUT
	.globl _P0MDOUT
	.globl _SPI0DAT
	.globl _SPI0CKR
	.globl _SPI0CFG
	.globl _P2
	.globl _CPT0MX
	.globl _CPT1MX
	.globl _CPT0MD
	.globl _CPT1MD
	.globl _CPT0CN
	.globl _CPT1CN
	.globl _SBUF0
	.globl _SCON0
	.globl _TMR4RLH
	.globl _TMR4RLL
	.globl _TMR4CN
	.globl _USB0DAT
	.globl _USB0ADR
	.globl _TMR3H
	.globl _TMR3L
	.globl _TMR3RLH
	.globl _TMR3RLL
	.globl _TMR3CN
	.globl _P1
	.globl _PSCTL
	.globl _CKCON
	.globl _TH1
	.globl _TH0
	.globl _TL1
	.globl _TL0
	.globl _TMOD
	.globl _TCON
	.globl _PCON
	.globl _OSCLCN
	.globl _EMI0CF
	.globl _EMI0TC
	.globl _DPH
	.globl _DPL
	.globl _SP
	.globl _P0
	.globl _dado
	.globl _TxDado
	.globl _RxDado
	.globl _enviaUART
	.globl _recebeUART
;--------------------------------------------------------
; special function registers
;--------------------------------------------------------
	.area RSEG    (ABS,DATA)
	.org 0x0000
G$P0$0_0$0 == 0x0080
_P0	=	0x0080
G$SP$0_0$0 == 0x0081
_SP	=	0x0081
G$DPL$0_0$0 == 0x0082
_DPL	=	0x0082
G$DPH$0_0$0 == 0x0083
_DPH	=	0x0083
G$EMI0TC$0_0$0 == 0x0084
_EMI0TC	=	0x0084
G$EMI0CF$0_0$0 == 0x0085
_EMI0CF	=	0x0085
G$OSCLCN$0_0$0 == 0x0086
_OSCLCN	=	0x0086
G$PCON$0_0$0 == 0x0087
_PCON	=	0x0087
G$TCON$0_0$0 == 0x0088
_TCON	=	0x0088
G$TMOD$0_0$0 == 0x0089
_TMOD	=	0x0089
G$TL0$0_0$0 == 0x008a
_TL0	=	0x008a
G$TL1$0_0$0 == 0x008b
_TL1	=	0x008b
G$TH0$0_0$0 == 0x008c
_TH0	=	0x008c
G$TH1$0_0$0 == 0x008d
_TH1	=	0x008d
G$CKCON$0_0$0 == 0x008e
_CKCON	=	0x008e
G$PSCTL$0_0$0 == 0x008f
_PSCTL	=	0x008f
G$P1$0_0$0 == 0x0090
_P1	=	0x0090
G$TMR3CN$0_0$0 == 0x0091
_TMR3CN	=	0x0091
G$TMR3RLL$0_0$0 == 0x0092
_TMR3RLL	=	0x0092
G$TMR3RLH$0_0$0 == 0x0093
_TMR3RLH	=	0x0093
G$TMR3L$0_0$0 == 0x0094
_TMR3L	=	0x0094
G$TMR3H$0_0$0 == 0x0095
_TMR3H	=	0x0095
G$USB0ADR$0_0$0 == 0x0096
_USB0ADR	=	0x0096
G$USB0DAT$0_0$0 == 0x0097
_USB0DAT	=	0x0097
G$TMR4CN$0_0$0 == 0x0091
_TMR4CN	=	0x0091
G$TMR4RLL$0_0$0 == 0x0092
_TMR4RLL	=	0x0092
G$TMR4RLH$0_0$0 == 0x0093
_TMR4RLH	=	0x0093
G$SCON0$0_0$0 == 0x0098
_SCON0	=	0x0098
G$SBUF0$0_0$0 == 0x0099
_SBUF0	=	0x0099
G$CPT1CN$0_0$0 == 0x009a
_CPT1CN	=	0x009a
G$CPT0CN$0_0$0 == 0x009b
_CPT0CN	=	0x009b
G$CPT1MD$0_0$0 == 0x009c
_CPT1MD	=	0x009c
G$CPT0MD$0_0$0 == 0x009d
_CPT0MD	=	0x009d
G$CPT1MX$0_0$0 == 0x009e
_CPT1MX	=	0x009e
G$CPT0MX$0_0$0 == 0x009f
_CPT0MX	=	0x009f
G$P2$0_0$0 == 0x00a0
_P2	=	0x00a0
G$SPI0CFG$0_0$0 == 0x00a1
_SPI0CFG	=	0x00a1
G$SPI0CKR$0_0$0 == 0x00a2
_SPI0CKR	=	0x00a2
G$SPI0DAT$0_0$0 == 0x00a3
_SPI0DAT	=	0x00a3
G$P0MDOUT$0_0$0 == 0x00a4
_P0MDOUT	=	0x00a4
G$P1MDOUT$0_0$0 == 0x00a5
_P1MDOUT	=	0x00a5
G$P2MDOUT$0_0$0 == 0x00a6
_P2MDOUT	=	0x00a6
G$P3MDOUT$0_0$0 == 0x00a7
_P3MDOUT	=	0x00a7
G$IE$0_0$0 == 0x00a8
_IE	=	0x00a8
G$CLKSEL$0_0$0 == 0x00a9
_CLKSEL	=	0x00a9
G$EMI0CN$0_0$0 == 0x00aa
_EMI0CN	=	0x00aa
G$_XPAGE$0_0$0 == 0x00aa
__XPAGE	=	0x00aa
G$SBCON1$0_0$0 == 0x00ac
_SBCON1	=	0x00ac
G$P4MDOUT$0_0$0 == 0x00ae
_P4MDOUT	=	0x00ae
G$PFE0CN$0_0$0 == 0x00af
_PFE0CN	=	0x00af
G$P3$0_0$0 == 0x00b0
_P3	=	0x00b0
G$OSCXCN$0_0$0 == 0x00b1
_OSCXCN	=	0x00b1
G$OSCICN$0_0$0 == 0x00b2
_OSCICN	=	0x00b2
G$OSCICL$0_0$0 == 0x00b3
_OSCICL	=	0x00b3
G$SBRLL1$0_0$0 == 0x00b4
_SBRLL1	=	0x00b4
G$SBRLH1$0_0$0 == 0x00b5
_SBRLH1	=	0x00b5
G$FLSCL$0_0$0 == 0x00b6
_FLSCL	=	0x00b6
G$FLKEY$0_0$0 == 0x00b7
_FLKEY	=	0x00b7
G$IP$0_0$0 == 0x00b8
_IP	=	0x00b8
G$CLKMUL$0_0$0 == 0x00b9
_CLKMUL	=	0x00b9
G$AMX0N$0_0$0 == 0x00ba
_AMX0N	=	0x00ba
G$AMX0P$0_0$0 == 0x00bb
_AMX0P	=	0x00bb
G$ADC0CF$0_0$0 == 0x00bc
_ADC0CF	=	0x00bc
G$ADC0L$0_0$0 == 0x00bd
_ADC0L	=	0x00bd
G$ADC0H$0_0$0 == 0x00be
_ADC0H	=	0x00be
G$SFRPAGE$0_0$0 == 0x00bf
_SFRPAGE	=	0x00bf
G$SMBTC$0_0$0 == 0x00b9
_SMBTC	=	0x00b9
G$SMB0CN$0_0$0 == 0x00c0
_SMB0CN	=	0x00c0
G$SMB0CF$0_0$0 == 0x00c1
_SMB0CF	=	0x00c1
G$SMB0DAT$0_0$0 == 0x00c2
_SMB0DAT	=	0x00c2
G$ADC0GTL$0_0$0 == 0x00c3
_ADC0GTL	=	0x00c3
G$ADC0GTH$0_0$0 == 0x00c4
_ADC0GTH	=	0x00c4
G$ADC0LTL$0_0$0 == 0x00c5
_ADC0LTL	=	0x00c5
G$ADC0LTH$0_0$0 == 0x00c6
_ADC0LTH	=	0x00c6
G$P4$0_0$0 == 0x00c7
_P4	=	0x00c7
G$SMB1CN$0_0$0 == 0x00c0
_SMB1CN	=	0x00c0
G$SMB1CF$0_0$0 == 0x00c1
_SMB1CF	=	0x00c1
G$SMB1DAT$0_0$0 == 0x00c2
_SMB1DAT	=	0x00c2
G$T2CON$0_0$0 == 0x00c8
_T2CON	=	0x00c8
G$TMR2CN$0_0$0 == 0x00c8
_TMR2CN	=	0x00c8
G$REG01CN$0_0$0 == 0x00c9
_REG01CN	=	0x00c9
G$RCAP2L$0_0$0 == 0x00ca
_RCAP2L	=	0x00ca
G$TMR2RLL$0_0$0 == 0x00ca
_TMR2RLL	=	0x00ca
G$RCAP2H$0_0$0 == 0x00cb
_RCAP2H	=	0x00cb
G$TMR2RLH$0_0$0 == 0x00cb
_TMR2RLH	=	0x00cb
G$TL2$0_0$0 == 0x00cc
_TL2	=	0x00cc
G$TMR2L$0_0$0 == 0x00cc
_TMR2L	=	0x00cc
G$TH2$0_0$0 == 0x00cd
_TH2	=	0x00cd
G$TMR2H$0_0$0 == 0x00cd
_TMR2H	=	0x00cd
G$SMB0ADM$0_0$0 == 0x00ce
_SMB0ADM	=	0x00ce
G$SMB0ADR$0_0$0 == 0x00cf
_SMB0ADR	=	0x00cf
G$TMR5CN$0_0$0 == 0x00c8
_TMR5CN	=	0x00c8
G$TMR5RLL$0_0$0 == 0x00ca
_TMR5RLL	=	0x00ca
G$TMR5RLH$0_0$0 == 0x00cb
_TMR5RLH	=	0x00cb
G$TMR5L$0_0$0 == 0x00cc
_TMR5L	=	0x00cc
G$TMR5H$0_0$0 == 0x00cd
_TMR5H	=	0x00cd
G$SMB1ADM$0_0$0 == 0x00ce
_SMB1ADM	=	0x00ce
G$SMB1ADR$0_0$0 == 0x00cf
_SMB1ADR	=	0x00cf
G$PSW$0_0$0 == 0x00d0
_PSW	=	0x00d0
G$REF0CN$0_0$0 == 0x00d1
_REF0CN	=	0x00d1
G$SCON1$0_0$0 == 0x00d2
_SCON1	=	0x00d2
G$SBUF1$0_0$0 == 0x00d3
_SBUF1	=	0x00d3
G$P0SKIP$0_0$0 == 0x00d4
_P0SKIP	=	0x00d4
G$P1SKIP$0_0$0 == 0x00d5
_P1SKIP	=	0x00d5
G$P2SKIP$0_0$0 == 0x00d6
_P2SKIP	=	0x00d6
G$USB0XCN$0_0$0 == 0x00d7
_USB0XCN	=	0x00d7
G$PCA0CN$0_0$0 == 0x00d8
_PCA0CN	=	0x00d8
G$PCA0MD$0_0$0 == 0x00d9
_PCA0MD	=	0x00d9
G$PCA0CPM0$0_0$0 == 0x00da
_PCA0CPM0	=	0x00da
G$PCA0CPM1$0_0$0 == 0x00db
_PCA0CPM1	=	0x00db
G$PCA0CPM2$0_0$0 == 0x00dc
_PCA0CPM2	=	0x00dc
G$PCA0CPM3$0_0$0 == 0x00dd
_PCA0CPM3	=	0x00dd
G$PCA0CPM4$0_0$0 == 0x00de
_PCA0CPM4	=	0x00de
G$P3SKIP$0_0$0 == 0x00df
_P3SKIP	=	0x00df
G$ACC$0_0$0 == 0x00e0
_ACC	=	0x00e0
G$XBR0$0_0$0 == 0x00e1
_XBR0	=	0x00e1
G$XBR1$0_0$0 == 0x00e2
_XBR1	=	0x00e2
G$XBR2$0_0$0 == 0x00e3
_XBR2	=	0x00e3
G$IT01CF$0_0$0 == 0x00e4
_IT01CF	=	0x00e4
G$SMOD1$0_0$0 == 0x00e5
_SMOD1	=	0x00e5
G$EIE1$0_0$0 == 0x00e6
_EIE1	=	0x00e6
G$EIE2$0_0$0 == 0x00e7
_EIE2	=	0x00e7
G$CKCON1$0_0$0 == 0x00e4
_CKCON1	=	0x00e4
G$ADC0CN$0_0$0 == 0x00e8
_ADC0CN	=	0x00e8
G$PCA0CPL1$0_0$0 == 0x00e9
_PCA0CPL1	=	0x00e9
G$PCA0CPH1$0_0$0 == 0x00ea
_PCA0CPH1	=	0x00ea
G$PCA0CPL2$0_0$0 == 0x00eb
_PCA0CPL2	=	0x00eb
G$PCA0CPH2$0_0$0 == 0x00ec
_PCA0CPH2	=	0x00ec
G$PCA0CPL3$0_0$0 == 0x00ed
_PCA0CPL3	=	0x00ed
G$PCA0CPH3$0_0$0 == 0x00ee
_PCA0CPH3	=	0x00ee
G$RSTSRC$0_0$0 == 0x00ef
_RSTSRC	=	0x00ef
G$B$0_0$0 == 0x00f0
_B	=	0x00f0
G$P0MDIN$0_0$0 == 0x00f1
_P0MDIN	=	0x00f1
G$P1MDIN$0_0$0 == 0x00f2
_P1MDIN	=	0x00f2
G$P2MDIN$0_0$0 == 0x00f3
_P2MDIN	=	0x00f3
G$P3MDIN$0_0$0 == 0x00f4
_P3MDIN	=	0x00f4
G$P4MDIN$0_0$0 == 0x00f5
_P4MDIN	=	0x00f5
G$EIP1$0_0$0 == 0x00f6
_EIP1	=	0x00f6
G$EIP2$0_0$0 == 0x00f7
_EIP2	=	0x00f7
G$SPI0CN$0_0$0 == 0x00f8
_SPI0CN	=	0x00f8
G$PCA0L$0_0$0 == 0x00f9
_PCA0L	=	0x00f9
G$PCA0H$0_0$0 == 0x00fa
_PCA0H	=	0x00fa
G$PCA0CPL0$0_0$0 == 0x00fb
_PCA0CPL0	=	0x00fb
G$PCA0CPH0$0_0$0 == 0x00fc
_PCA0CPH0	=	0x00fc
G$PCA0CPL4$0_0$0 == 0x00fd
_PCA0CPL4	=	0x00fd
G$PCA0CPH4$0_0$0 == 0x00fe
_PCA0CPH4	=	0x00fe
G$VDM0CN$0_0$0 == 0x00ff
_VDM0CN	=	0x00ff
G$DP$0_0$0 == 0x8382
_DP	=	0x8382
G$TMR3RL$0_0$0 == 0x9392
_TMR3RL	=	0x9392
G$TMR4RL$0_0$0 == 0x9392
_TMR4RL	=	0x9392
G$TMR3$0_0$0 == 0x9594
_TMR3	=	0x9594
G$TMR4$0_0$0 == 0x9594
_TMR4	=	0x9594
G$SBRL1$0_0$0 == 0xb5b4
_SBRL1	=	0xb5b4
G$ADC0$0_0$0 == 0xbebd
_ADC0	=	0xbebd
G$ADC0GT$0_0$0 == 0xc4c3
_ADC0GT	=	0xc4c3
G$ADC0LT$0_0$0 == 0xc6c5
_ADC0LT	=	0xc6c5
G$TMR2RL$0_0$0 == 0xcbca
_TMR2RL	=	0xcbca
G$TMR5RL$0_0$0 == 0xcbca
_TMR5RL	=	0xcbca
G$TMR2$0_0$0 == 0xcdcc
_TMR2	=	0xcdcc
G$TMR5$0_0$0 == 0xcdcc
_TMR5	=	0xcdcc
G$PCA0CP1$0_0$0 == 0xeae9
_PCA0CP1	=	0xeae9
G$PCA0CP2$0_0$0 == 0xeceb
_PCA0CP2	=	0xeceb
G$PCA0CP3$0_0$0 == 0xeeed
_PCA0CP3	=	0xeeed
G$PCA0$0_0$0 == 0xfaf9
_PCA0	=	0xfaf9
G$PCA0CP0$0_0$0 == 0xfcfb
_PCA0CP0	=	0xfcfb
G$PCA0CP4$0_0$0 == 0xfefd
_PCA0CP4	=	0xfefd
;--------------------------------------------------------
; special function bits
;--------------------------------------------------------
	.area RSEG    (ABS,DATA)
	.org 0x0000
G$P0_0$0_0$0 == 0x0080
_P0_0	=	0x0080
G$P0_1$0_0$0 == 0x0081
_P0_1	=	0x0081
G$P0_2$0_0$0 == 0x0082
_P0_2	=	0x0082
G$P0_3$0_0$0 == 0x0083
_P0_3	=	0x0083
G$P0_4$0_0$0 == 0x0084
_P0_4	=	0x0084
G$P0_5$0_0$0 == 0x0085
_P0_5	=	0x0085
G$P0_6$0_0$0 == 0x0086
_P0_6	=	0x0086
G$P0_7$0_0$0 == 0x0087
_P0_7	=	0x0087
G$TF1$0_0$0 == 0x008f
_TF1	=	0x008f
G$TR1$0_0$0 == 0x008e
_TR1	=	0x008e
G$TF0$0_0$0 == 0x008d
_TF0	=	0x008d
G$TR0$0_0$0 == 0x008c
_TR0	=	0x008c
G$IE1$0_0$0 == 0x008b
_IE1	=	0x008b
G$IT1$0_0$0 == 0x008a
_IT1	=	0x008a
G$IE0$0_0$0 == 0x0089
_IE0	=	0x0089
G$IT0$0_0$0 == 0x0088
_IT0	=	0x0088
G$P1_0$0_0$0 == 0x0090
_P1_0	=	0x0090
G$P1_1$0_0$0 == 0x0091
_P1_1	=	0x0091
G$P1_2$0_0$0 == 0x0092
_P1_2	=	0x0092
G$P1_3$0_0$0 == 0x0093
_P1_3	=	0x0093
G$P1_4$0_0$0 == 0x0094
_P1_4	=	0x0094
G$P1_5$0_0$0 == 0x0095
_P1_5	=	0x0095
G$P1_6$0_0$0 == 0x0096
_P1_6	=	0x0096
G$P1_7$0_0$0 == 0x0097
_P1_7	=	0x0097
G$S0MODE$0_0$0 == 0x009f
_S0MODE	=	0x009f
G$MCE0$0_0$0 == 0x009d
_MCE0	=	0x009d
G$REN0$0_0$0 == 0x009c
_REN0	=	0x009c
G$TB80$0_0$0 == 0x009b
_TB80	=	0x009b
G$RB80$0_0$0 == 0x009a
_RB80	=	0x009a
G$TI0$0_0$0 == 0x0099
_TI0	=	0x0099
G$RI0$0_0$0 == 0x0098
_RI0	=	0x0098
G$P2_0$0_0$0 == 0x00a0
_P2_0	=	0x00a0
G$P2_1$0_0$0 == 0x00a1
_P2_1	=	0x00a1
G$P2_2$0_0$0 == 0x00a2
_P2_2	=	0x00a2
G$P2_3$0_0$0 == 0x00a3
_P2_3	=	0x00a3
G$P2_4$0_0$0 == 0x00a4
_P2_4	=	0x00a4
G$P2_5$0_0$0 == 0x00a5
_P2_5	=	0x00a5
G$P2_6$0_0$0 == 0x00a6
_P2_6	=	0x00a6
G$P2_7$0_0$0 == 0x00a7
_P2_7	=	0x00a7
G$EA$0_0$0 == 0x00af
_EA	=	0x00af
G$ESPI0$0_0$0 == 0x00ae
_ESPI0	=	0x00ae
G$ET2$0_0$0 == 0x00ad
_ET2	=	0x00ad
G$ES0$0_0$0 == 0x00ac
_ES0	=	0x00ac
G$ET1$0_0$0 == 0x00ab
_ET1	=	0x00ab
G$EX1$0_0$0 == 0x00aa
_EX1	=	0x00aa
G$ET0$0_0$0 == 0x00a9
_ET0	=	0x00a9
G$EX0$0_0$0 == 0x00a8
_EX0	=	0x00a8
G$P3_0$0_0$0 == 0x00b0
_P3_0	=	0x00b0
G$P3_1$0_0$0 == 0x00b1
_P3_1	=	0x00b1
G$P3_2$0_0$0 == 0x00b2
_P3_2	=	0x00b2
G$P3_3$0_0$0 == 0x00b3
_P3_3	=	0x00b3
G$P3_4$0_0$0 == 0x00b4
_P3_4	=	0x00b4
G$P3_5$0_0$0 == 0x00b5
_P3_5	=	0x00b5
G$P3_6$0_0$0 == 0x00b6
_P3_6	=	0x00b6
G$P3_7$0_0$0 == 0x00b7
_P3_7	=	0x00b7
G$PSPI0$0_0$0 == 0x00be
_PSPI0	=	0x00be
G$PT2$0_0$0 == 0x00bd
_PT2	=	0x00bd
G$PS0$0_0$0 == 0x00bc
_PS0	=	0x00bc
G$PT1$0_0$0 == 0x00bb
_PT1	=	0x00bb
G$PX1$0_0$0 == 0x00ba
_PX1	=	0x00ba
G$PT0$0_0$0 == 0x00b9
_PT0	=	0x00b9
G$PX0$0_0$0 == 0x00b8
_PX0	=	0x00b8
G$MASTER0$0_0$0 == 0x00c7
_MASTER0	=	0x00c7
G$TXMODE0$0_0$0 == 0x00c6
_TXMODE0	=	0x00c6
G$STA0$0_0$0 == 0x00c5
_STA0	=	0x00c5
G$STO0$0_0$0 == 0x00c4
_STO0	=	0x00c4
G$ACKRQ0$0_0$0 == 0x00c3
_ACKRQ0	=	0x00c3
G$ARBLOST0$0_0$0 == 0x00c2
_ARBLOST0	=	0x00c2
G$ACK0$0_0$0 == 0x00c1
_ACK0	=	0x00c1
G$SI0$0_0$0 == 0x00c0
_SI0	=	0x00c0
G$MASTER1$0_0$0 == 0x00c7
_MASTER1	=	0x00c7
G$TXMODE1$0_0$0 == 0x00c6
_TXMODE1	=	0x00c6
G$STA1$0_0$0 == 0x00c5
_STA1	=	0x00c5
G$STO1$0_0$0 == 0x00c4
_STO1	=	0x00c4
G$ACKRQ1$0_0$0 == 0x00c3
_ACKRQ1	=	0x00c3
G$ARBLOST1$0_0$0 == 0x00c2
_ARBLOST1	=	0x00c2
G$ACK1$0_0$0 == 0x00c1
_ACK1	=	0x00c1
G$SI1$0_0$0 == 0x00c0
_SI1	=	0x00c0
G$TF2H$0_0$0 == 0x00cf
_TF2H	=	0x00cf
G$TF2L$0_0$0 == 0x00ce
_TF2L	=	0x00ce
G$TF2LEN$0_0$0 == 0x00cd
_TF2LEN	=	0x00cd
G$TF2CEN$0_0$0 == 0x00cc
_TF2CEN	=	0x00cc
G$T2SPLIT$0_0$0 == 0x00cb
_T2SPLIT	=	0x00cb
G$TR2$0_0$0 == 0x00ca
_TR2	=	0x00ca
G$T2CSS$0_0$0 == 0x00c9
_T2CSS	=	0x00c9
G$T2XCLK$0_0$0 == 0x00c8
_T2XCLK	=	0x00c8
G$TF5H$0_0$0 == 0x00cf
_TF5H	=	0x00cf
G$TF5L$0_0$0 == 0x00ce
_TF5L	=	0x00ce
G$TF5LEN$0_0$0 == 0x00cd
_TF5LEN	=	0x00cd
G$T5SPLIT$0_0$0 == 0x00cb
_T5SPLIT	=	0x00cb
G$TR5$0_0$0 == 0x00ca
_TR5	=	0x00ca
G$T5XCLK$0_0$0 == 0x00c8
_T5XCLK	=	0x00c8
G$CY$0_0$0 == 0x00d7
_CY	=	0x00d7
G$AC$0_0$0 == 0x00d6
_AC	=	0x00d6
G$F0$0_0$0 == 0x00d5
_F0	=	0x00d5
G$RS1$0_0$0 == 0x00d4
_RS1	=	0x00d4
G$RS0$0_0$0 == 0x00d3
_RS0	=	0x00d3
G$OV$0_0$0 == 0x00d2
_OV	=	0x00d2
G$F1$0_0$0 == 0x00d1
_F1	=	0x00d1
G$PARITY$0_0$0 == 0x00d0
_PARITY	=	0x00d0
G$CF$0_0$0 == 0x00df
_CF	=	0x00df
G$CR$0_0$0 == 0x00de
_CR	=	0x00de
G$CCF4$0_0$0 == 0x00dc
_CCF4	=	0x00dc
G$CCF3$0_0$0 == 0x00db
_CCF3	=	0x00db
G$CCF2$0_0$0 == 0x00da
_CCF2	=	0x00da
G$CCF1$0_0$0 == 0x00d9
_CCF1	=	0x00d9
G$CCF0$0_0$0 == 0x00d8
_CCF0	=	0x00d8
G$AD0EN$0_0$0 == 0x00ef
_AD0EN	=	0x00ef
G$AD0TM$0_0$0 == 0x00ee
_AD0TM	=	0x00ee
G$AD0INT$0_0$0 == 0x00ed
_AD0INT	=	0x00ed
G$AD0BUSY$0_0$0 == 0x00ec
_AD0BUSY	=	0x00ec
G$AD0WINT$0_0$0 == 0x00eb
_AD0WINT	=	0x00eb
G$AD0CM2$0_0$0 == 0x00ea
_AD0CM2	=	0x00ea
G$AD0CM1$0_0$0 == 0x00e9
_AD0CM1	=	0x00e9
G$AD0CM0$0_0$0 == 0x00e8
_AD0CM0	=	0x00e8
G$SPIF$0_0$0 == 0x00ff
_SPIF	=	0x00ff
G$WCOL$0_0$0 == 0x00fe
_WCOL	=	0x00fe
G$MODF$0_0$0 == 0x00fd
_MODF	=	0x00fd
G$RXOVRN$0_0$0 == 0x00fc
_RXOVRN	=	0x00fc
G$NSSMD1$0_0$0 == 0x00fb
_NSSMD1	=	0x00fb
G$NSSMD0$0_0$0 == 0x00fa
_NSSMD0	=	0x00fa
G$TXBMT$0_0$0 == 0x00f9
_TXBMT	=	0x00f9
G$SPIEN$0_0$0 == 0x00f8
_SPIEN	=	0x00f8
;--------------------------------------------------------
; overlayable register banks
;--------------------------------------------------------
	.area REG_BANK_0	(REL,OVR,DATA)
	.ds 8
;--------------------------------------------------------
; internal ram data
;--------------------------------------------------------
	.area DSEG    (DATA)
G$RxDado$0_0$0==.
_RxDado::
	.ds 2
G$TxDado$0_0$0==.
_TxDado::
	.ds 2
G$dado$0_0$0==.
_dado::
	.ds 1
Ld7.main$sequencia$1_0$17==.
_main_sequencia_65536_17:
	.ds 16
Ld7.main$trans$1_1$18==.
_main_trans_65537_18:
	.ds 32
;--------------------------------------------------------
; overlayable items in internal ram
;--------------------------------------------------------
	.area	OSEG    (OVR,DATA)
	.area	OSEG    (OVR,DATA)
;--------------------------------------------------------
; Stack segment in internal ram
;--------------------------------------------------------
	.area	SSEG
__start__stack:
	.ds	1

;--------------------------------------------------------
; indirectly addressable internal ram data
;--------------------------------------------------------
	.area ISEG    (DATA)
;--------------------------------------------------------
; absolute internal ram data
;--------------------------------------------------------
	.area IABS    (ABS,DATA)
	.area IABS    (ABS,DATA)
;--------------------------------------------------------
; bit data
;--------------------------------------------------------
	.area BSEG    (BIT)
;--------------------------------------------------------
; paged external ram data
;--------------------------------------------------------
	.area PSEG    (PAG,XDATA)
;--------------------------------------------------------
; external ram data
;--------------------------------------------------------
	.area XSEG    (XDATA)
;--------------------------------------------------------
; absolute external ram data
;--------------------------------------------------------
	.area XABS    (ABS,XDATA)
;--------------------------------------------------------
; external initialized ram data
;--------------------------------------------------------
	.area XISEG   (XDATA)
	.area HOME    (CODE)
	.area GSINIT0 (CODE)
	.area GSINIT1 (CODE)
	.area GSINIT2 (CODE)
	.area GSINIT3 (CODE)
	.area GSINIT4 (CODE)
	.area GSINIT5 (CODE)
	.area GSINIT  (CODE)
	.area GSFINAL (CODE)
	.area CSEG    (CODE)
;--------------------------------------------------------
; interrupt vector
;--------------------------------------------------------
	.area HOME    (CODE)
__interrupt_vect:
	ljmp	__sdcc_gsinit_startup
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	ljmp	_inter
;--------------------------------------------------------
; global & static initialisations
;--------------------------------------------------------
	.area HOME    (CODE)
	.area GSINIT  (CODE)
	.area GSFINAL (CODE)
	.area GSINIT  (CODE)
	.globl __sdcc_gsinit_startup
	.globl __sdcc_program_startup
	.globl __start__stack
	.globl __mcs51_genXINIT
	.globl __mcs51_genXRAMCLEAR
	.globl __mcs51_genRAMCLEAR
	C$d7.c$6$1_1$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:6: volatile int RxDado = 0; //Sem dados de RX
	clr	a
	mov	_RxDado,a
	mov	(_RxDado + 1),a
	C$d7.c$7$1_1$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:7: volatile int TxDado = 1; //Disponivel p/ TX
	mov	_TxDado,#0x01
;	1-genFromRTrack replaced	mov	(_TxDado + 1),#0x00
	mov	(_TxDado + 1),a
	C$d7.c$8$1_1$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:8: volatile unsigned char dado = 0;
;	1-genFromRTrack replaced	mov	_dado,#0x00
	mov	_dado,a
	.area GSFINAL (CODE)
	ljmp	__sdcc_program_startup
;--------------------------------------------------------
; Home
;--------------------------------------------------------
	.area HOME    (CODE)
	.area HOME    (CODE)
__sdcc_program_startup:
	ljmp	_main
;	return from main will return to caller
;--------------------------------------------------------
; code
;--------------------------------------------------------
	.area CSEG    (CODE)
;------------------------------------------------------------
;Allocation info for local variables in function 'configUART0'
;------------------------------------------------------------
	G$configUART0$0$0 ==.
	C$d7.c$11$0_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:11: void configUART0(void) {
;	-----------------------------------------
;	 function configUART0
;	-----------------------------------------
_configUART0:
	ar7 = 0x07
	ar6 = 0x06
	ar5 = 0x05
	ar4 = 0x04
	ar3 = 0x03
	ar2 = 0x02
	ar1 = 0x01
	ar0 = 0x00
	C$d7.c$14$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:14: PCA0MD = 0x00;  //Desliga watchdog  	 
	mov	_PCA0MD,#0x00
	C$d7.c$15$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:15: XBR0 |= 0x01;  //Ativa UART0 no crossbar
	orl	_XBR0,#0x01
	C$d7.c$16$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:16: XBR1 = 0x40;     //Ativa crossbar
	mov	_XBR1,#0x40
	C$d7.c$19$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:19: CLKSEL |= 0x02;   //SYSCLK derivado do Oscil/2=24MHz
	orl	_CLKSEL,#0x02
	C$d7.c$29$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:29: CKCON |= 0x08;  //T1M=1 >> 115200bps. Comentar p/ 9600bps
	orl	_CKCON,#0x08
	C$d7.c$31$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:31: TH1 = 0x98;  //Valor de autorelaod p/ 115200 e 9600
	mov	_TH1,#0x98
	C$d7.c$35$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:35: TMOD |= 0x20;  //Timer1, modo2 (autorelaod)
	orl	_TMOD,#0x20
	C$d7.c$37$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:37: TR1 = 1;  //TCON |=0x40 >> Ativa timer
;	assignBit
	setb	_TR1
	C$d7.c$41$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:41: TI0=1;
;	assignBit
	setb	_TI0
	C$d7.c$43$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:43: REN0 = 1;  //SCON0 |=0x10 >> Ativa rececao
;	assignBit
	setb	_REN0
	C$d7.c$45$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:45: EA=1;
;	assignBit
	setb	_EA
	C$d7.c$46$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:46: ES0=1;
;	assignBit
	setb	_ES0
	C$d7.c$47$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:47: ET1=1;
;	assignBit
	setb	_ET1
	C$d7.c$49$1_0$4 ==.
;	C:\2ano\ATC\Desafio7\d7.c:49: }
	C$d7.c$49$1_0$4 ==.
	XG$configUART0$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'inter'
;------------------------------------------------------------
	G$inter$0$0 ==.
	C$d7.c$52$1_0$6 ==.
;	C:\2ano\ATC\Desafio7\d7.c:52: void inter (void) __interrupt (4) {
;	-----------------------------------------
;	 function inter
;	-----------------------------------------
_inter:
	push	acc
	C$d7.c$53$1_0$6 ==.
;	C:\2ano\ATC\Desafio7\d7.c:53: if (RI0) { // acabou de receber
	C$d7.c$54$2_0$7 ==.
;	C:\2ano\ATC\Desafio7\d7.c:54: RI0 = 0; // limpa a flg de recepcao
;	assignBit
	jbc	_RI0,00122$
	sjmp	00102$
00122$:
	C$d7.c$55$2_0$7 ==.
;	C:\2ano\ATC\Desafio7\d7.c:55: RxDado = 1;
	mov	_RxDado,#0x01
	mov	(_RxDado + 1),#0x00
	C$d7.c$56$2_0$7 ==.
;	C:\2ano\ATC\Desafio7\d7.c:56: dado = SBUF0; // recebe o byte
	mov	_dado,_SBUF0
00102$:
	C$d7.c$58$1_0$6 ==.
;	C:\2ano\ATC\Desafio7\d7.c:58: if (TI0) {
	C$d7.c$59$2_0$8 ==.
;	C:\2ano\ATC\Desafio7\d7.c:59: TI0 = 0;
;	assignBit
	jbc	_TI0,00123$
	sjmp	00108$
00123$:
	C$d7.c$60$2_0$8 ==.
;	C:\2ano\ATC\Desafio7\d7.c:60: if (TxDado){ // TI foi ativado manualmente
	mov	a,_TxDado
	orl	a,(_TxDado + 1)
	jz	00104$
	C$d7.c$61$3_0$9 ==.
;	C:\2ano\ATC\Desafio7\d7.c:61: SBUF0 = dado;
	mov	_SBUF0,_dado
	C$d7.c$62$3_0$9 ==.
;	C:\2ano\ATC\Desafio7\d7.c:62: TxDado = 0;
	clr	a
	mov	_TxDado,a
	mov	(_TxDado + 1),a
	sjmp	00108$
00104$:
	C$d7.c$65$3_0$10 ==.
;	C:\2ano\ATC\Desafio7\d7.c:65: TxDado = 1;}
	mov	_TxDado,#0x01
	mov	(_TxDado + 1),#0x00
00108$:
	C$d7.c$68$1_0$6 ==.
;	C:\2ano\ATC\Desafio7\d7.c:68: }
	pop	acc
	C$d7.c$68$1_0$6 ==.
	XG$inter$0$0 ==.
	reti
;	eliminated unneeded mov psw,# (no regs used in bank)
;	eliminated unneeded push/pop not_psw
;	eliminated unneeded push/pop dpl
;	eliminated unneeded push/pop dph
;	eliminated unneeded push/pop b
;------------------------------------------------------------
;Allocation info for local variables in function 'enviaUART'
;------------------------------------------------------------
;x                         Allocated to registers r7 
;------------------------------------------------------------
	G$enviaUART$0$0 ==.
	C$d7.c$75$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:75: void enviaUART(unsigned char x) {
;	-----------------------------------------
;	 function enviaUART
;	-----------------------------------------
_enviaUART:
	mov	r7,dpl
	C$d7.c$76$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:76: while (!TxDado); // aguarda pelo fim do envio anterior
00101$:
	mov	a,_TxDado
	orl	a,(_TxDado + 1)
	jz	00101$
	C$d7.c$77$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:77: dado=x;
	mov	_dado,r7
	C$d7.c$78$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:78: TxDado =1;
	mov	_TxDado,#0x01
	mov	(_TxDado + 1),#0x00
	C$d7.c$79$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:79: TI0=1;
;	assignBit
	setb	_TI0
	C$d7.c$80$1_0$12 ==.
;	C:\2ano\ATC\Desafio7\d7.c:80: }
	C$d7.c$80$1_0$12 ==.
	XG$enviaUART$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'recebeUART'
;------------------------------------------------------------
;x                         Allocated to registers r7 
;------------------------------------------------------------
	G$recebeUART$0$0 ==.
	C$d7.c$82$1_0$13 ==.
;	C:\2ano\ATC\Desafio7\d7.c:82: unsigned char recebeUART() {
;	-----------------------------------------
;	 function recebeUART
;	-----------------------------------------
_recebeUART:
	C$d7.c$84$1_0$13 ==.
;	C:\2ano\ATC\Desafio7\d7.c:84: if(RxDado){ 
	mov	a,_RxDado
	orl	a,(_RxDado + 1)
	jz	00102$
	C$d7.c$85$2_0$14 ==.
;	C:\2ano\ATC\Desafio7\d7.c:85: x = dado;
	mov	r7,_dado
	C$d7.c$86$2_0$14 ==.
;	C:\2ano\ATC\Desafio7\d7.c:86: RxDado=0;
	clr	a
	mov	_RxDado,a
	mov	(_RxDado + 1),a
	sjmp	00103$
00102$:
	C$d7.c$88$2_0$15 ==.
;	C:\2ano\ATC\Desafio7\d7.c:88: else{x=-1;} 
	mov	r7,#0xff
00103$:
	C$d7.c$90$1_0$13 ==.
;	C:\2ano\ATC\Desafio7\d7.c:90: return x;
	mov	dpl,r7
	C$d7.c$91$1_0$13 ==.
;	C:\2ano\ATC\Desafio7\d7.c:91: }
	C$d7.c$91$1_0$13 ==.
	XG$recebeUART$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'main'
;------------------------------------------------------------
;c                         Allocated to registers r6 r7 
;a                         Allocated to registers r5 
;sequencia                 Allocated with name '_main_sequencia_65536_17'
;trans                     Allocated with name '_main_trans_65537_18'
;------------------------------------------------------------
	G$main$0$0 ==.
	C$d7.c$96$1_0$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:96: void main (void) {
;	-----------------------------------------
;	 function main
;	-----------------------------------------
_main:
	C$d7.c$97$2_0$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:97: unsigned int c=0;
	mov	r6,#0x00
	mov	r7,#0x00
	C$d7.c$101$2_0$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:101: char sequencia[16]={0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e};
	mov	_main_sequencia_65536_17,#0xc0
	mov	(_main_sequencia_65536_17 + 0x0001),#0xf9
	mov	(_main_sequencia_65536_17 + 0x0002),#0xa4
	mov	(_main_sequencia_65536_17 + 0x0003),#0xb0
	mov	(_main_sequencia_65536_17 + 0x0004),#0x99
	mov	(_main_sequencia_65536_17 + 0x0005),#0x92
	mov	(_main_sequencia_65536_17 + 0x0006),#0x82
	mov	(_main_sequencia_65536_17 + 0x0007),#0xf8
	mov	(_main_sequencia_65536_17 + 0x0008),#0x80
	mov	(_main_sequencia_65536_17 + 0x0009),#0x90
	mov	(_main_sequencia_65536_17 + 0x000a),#0x88
	mov	(_main_sequencia_65536_17 + 0x000b),#0x83
	mov	(_main_sequencia_65536_17 + 0x000c),#0xc6
	mov	(_main_sequencia_65536_17 + 0x000d),#0xa1
	mov	(_main_sequencia_65536_17 + 0x000e),#0x86
	mov	(_main_sequencia_65536_17 + 0x000f),#0x8e
	C$d7.c$102$1_0$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:102: configUART0();
	push	ar7
	push	ar6
	lcall	_configUART0
	pop	ar6
	pop	ar7
	C$d7.c$103$2_0$18 ==.
;	C:\2ano\ATC\Desafio7\d7.c:103: int trans[16]={48,49,50,51,52,53,54,55,56,57,65,66,67,68,69,70};
	mov	(_main_trans_65537_18 + 0),#0x30
	mov	(_main_trans_65537_18 + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0002) + 0),#0x31
	mov	((_main_trans_65537_18 + 0x0002) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0004) + 0),#0x32
	mov	((_main_trans_65537_18 + 0x0004) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0006) + 0),#0x33
	mov	((_main_trans_65537_18 + 0x0006) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0008) + 0),#0x34
	mov	((_main_trans_65537_18 + 0x0008) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x000a) + 0),#0x35
	mov	((_main_trans_65537_18 + 0x000a) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x000c) + 0),#0x36
	mov	((_main_trans_65537_18 + 0x000c) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x000e) + 0),#0x37
	mov	((_main_trans_65537_18 + 0x000e) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0010) + 0),#0x38
	mov	((_main_trans_65537_18 + 0x0010) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0012) + 0),#0x39
	mov	((_main_trans_65537_18 + 0x0012) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0014) + 0),#0x41
	mov	((_main_trans_65537_18 + 0x0014) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0016) + 0),#0x42
	mov	((_main_trans_65537_18 + 0x0016) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x0018) + 0),#0x43
	mov	((_main_trans_65537_18 + 0x0018) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x001a) + 0),#0x44
	mov	((_main_trans_65537_18 + 0x001a) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x001c) + 0),#0x45
	mov	((_main_trans_65537_18 + 0x001c) + 1),#0x00
	mov	((_main_trans_65537_18 + 0x001e) + 0),#0x46
	mov	((_main_trans_65537_18 + 0x001e) + 1),#0x00
	C$d7.c$105$1_1$18 ==.
;	C:\2ano\ATC\Desafio7\d7.c:105: P2 = 0xc0;
	mov	_P2,#0xc0
	C$d7.c$106$1_1$18 ==.
;	C:\2ano\ATC\Desafio7\d7.c:106: while(1){
00115$:
	C$d7.c$107$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:107: a=recebeUART();
	push	ar7
	push	ar6
	lcall	_recebeUART
	mov	r5,dpl
	pop	ar6
	pop	ar7
	C$d7.c$109$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:109: switch(a){
	cjne	r5,#0x64,00147$
	sjmp	00102$
00147$:
	cjne	r5,#0x69,00103$
	C$d7.c$111$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:111: c++;
	inc	r6
	cjne	r6,#0x00,00150$
	inc	r7
00150$:
	C$d7.c$112$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:112: enviaUART(trans[c&0x0f]);
	mov	a,#0x0f
	anl	a,r6
	mov	r4,a
	mov	r5,#0x00
	add	a,acc
	mov	r2,a
	mov	a,r5
	rlc	a
	mov	a,r2
	add	a,#_main_trans_65537_18
	mov	r1,a
	mov	dpl,@r1
	push	ar7
	push	ar6
	push	ar5
	push	ar4
	lcall	_enviaUART
	pop	ar4
	pop	ar5
	pop	ar6
	pop	ar7
	C$d7.c$113$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:113: P2 = sequencia[c&0x0f]; 
	mov	a,r4
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
	C$d7.c$117$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:117: break;
	C$d7.c$119$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:119: case 'd': 
	sjmp	00103$
00102$:
	C$d7.c$120$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:120: c--;
	dec	r6
	cjne	r6,#0xff,00151$
	dec	r7
00151$:
	C$d7.c$121$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:121: P2 = sequencia[c&0x0f];
	mov	a,#0x0f
	anl	a,r6
	mov	r4,a
	mov	r5,#0x00
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
	C$d7.c$122$3_1$20 ==.
;	C:\2ano\ATC\Desafio7\d7.c:122: enviaUART(trans[c&0x0f]);
	mov	a,r4
	add	a,r4
	mov	r4,a
	mov	a,r5
	rlc	a
	mov	a,r4
	add	a,#_main_trans_65537_18
	mov	r1,a
	mov	dpl,@r1
	push	ar7
	push	ar6
	lcall	_enviaUART
	pop	ar6
	pop	ar7
	C$d7.c$124$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:124: }
00103$:
	C$d7.c$130$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:130: P2 = sequencia[c&0x0f];
	mov	a,#0x0f
	anl	a,r6
	mov	r4,a
	mov	r5,#0x00
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
	C$d7.c$131$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:131: if (P0_7 == 0)
	jb	_P0_7,00108$
	C$d7.c$133$3_1$21 ==.
;	C:\2ano\ATC\Desafio7\d7.c:133: while (P0_7 == 0)
00104$:
	jnb	_P0_7,00104$
	C$d7.c$135$3_1$21 ==.
;	C:\2ano\ATC\Desafio7\d7.c:135: c++;
	inc	r6
	cjne	r6,#0x00,00154$
	inc	r7
00154$:
00108$:
	C$d7.c$139$2_1$19 ==.
;	C:\2ano\ATC\Desafio7\d7.c:139: if (P0_6 == 0)
	jnb	_P0_6,00155$
	ljmp	00115$
00155$:
	C$d7.c$141$3_1$22 ==.
;	C:\2ano\ATC\Desafio7\d7.c:141: while (P0_6 == 0)
00109$:
	jnb	_P0_6,00109$
	C$d7.c$143$3_1$22 ==.
;	C:\2ano\ATC\Desafio7\d7.c:143: c--;
	dec	r6
	cjne	r6,#0xff,00157$
	dec	r7
00157$:
	ljmp	00115$
	C$d7.c$147$1_1$17 ==.
;	C:\2ano\ATC\Desafio7\d7.c:147: }
	C$d7.c$147$1_1$17 ==.
	XG$main$0$0 ==.
	ret
	.area CSEG    (CODE)
	.area CONST   (CODE)
	.area XINIT   (CODE)
	.area CABS    (ABS,CODE)
