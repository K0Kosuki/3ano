;--------------------------------------------------------
; File Created by SDCC : free open source ANSI-C Compiler
; Version 4.2.0 #13081 (MINGW64)
;--------------------------------------------------------
	.module ATCPro
	.optsdcc -mmcs51 --model-small
	
;--------------------------------------------------------
; Public variables in this module
;--------------------------------------------------------
	.globl _sequencia
	.globl _main
	.globl _stop_off
	.globl _stop_on
	.globl _split_off
	.globl _split_on
	.globl _reset
	.globl _start
	.globl _timer0_overflow
	.globl _timer1_overflow
	.globl _iniciar_timer1
	.globl _iniciar_timer0
	.globl _iniciar_interrupcoes
	.globl _iniciar_timer
	.globl _iniciar_sysclock
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
	.globl _split
	.globl _estado
	.globl _aux1
	.globl _aux
	.globl _D
	.globl _U
	.globl _u
	.globl _d
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
; overlayable bit register bank
;--------------------------------------------------------
	.area BIT_BANK	(REL,OVR,DATA)
bits:
	.ds 1
	b0 = bits[0]
	b1 = bits[1]
	b2 = bits[2]
	b3 = bits[3]
	b4 = bits[4]
	b5 = bits[5]
	b6 = bits[6]
	b7 = bits[7]
;--------------------------------------------------------
; internal ram data
;--------------------------------------------------------
	.area DSEG    (DATA)
G$d$0_0$0==.
_d::
	.ds 2
G$u$0_0$0==.
_u::
	.ds 2
G$U$0_0$0==.
_U::
	.ds 2
G$D$0_0$0==.
_D::
	.ds 2
G$aux$0_0$0==.
_aux::
	.ds 2
G$aux1$0_0$0==.
_aux1::
	.ds 2
G$estado$0_0$0==.
_estado::
	.ds 2
G$split$0_0$0==.
_split::
	.ds 2
;--------------------------------------------------------
; overlayable items in internal ram
;--------------------------------------------------------
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
	ljmp	_timer0_overflow
	.ds	5
	reti
	.ds	7
	ljmp	_timer1_overflow
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
	C$ATCPro.c$10$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:10: volatile unsigned int d = 0, u = 1,U,D, aux = 0,aux1=0,estado,split =0;
	clr	a
	mov	_d,a
	mov	(_d + 1),a
	C$ATCPro.c$10$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:10: 
	mov	_u,#0x01
;	1-genFromRTrack replaced	mov	(_u + 1),#0x00
	mov	(_u + 1),a
	C$ATCPro.c$10$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:10: volatile unsigned int d = 0, u = 1,U,D, aux = 0,aux1=0,estado,split =0;
	mov	_aux,a
	mov	(_aux + 1),a
	C$ATCPro.c$10$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:10: 
	mov	_aux1,a
	mov	(_aux1 + 1),a
	C$ATCPro.c$10$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:10: volatile unsigned int d = 0, u = 1,U,D, aux = 0,aux1=0,estado,split =0;
	mov	_split,a
	mov	(_split + 1),a
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
;Allocation info for local variables in function 'iniciar_sysclock'
;------------------------------------------------------------
	G$iniciar_sysclock$0$0 ==.
	C$ATCPro.c$13$0_0$2 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:13: void iniciar_sysclock(void)
;	-----------------------------------------
;	 function iniciar_sysclock
;	-----------------------------------------
_iniciar_sysclock:
	ar7 = 0x07
	ar6 = 0x06
	ar5 = 0x05
	ar4 = 0x04
	ar3 = 0x03
	ar2 = 0x02
	ar1 = 0x01
	ar0 = 0x00
	C$ATCPro.c$15$1_0$2 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:15: PCA0MD = 0x00; // xbar and watchdog
	mov	_PCA0MD,#0x00
	C$ATCPro.c$16$1_0$2 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:16: XBR1 = 0x40;
	mov	_XBR1,#0x40
	C$ATCPro.c$17$1_0$2 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:17: }
	C$ATCPro.c$17$1_0$2 ==.
	XG$iniciar_sysclock$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'iniciar_timer'
;------------------------------------------------------------
	G$iniciar_timer$0$0 ==.
	C$ATCPro.c$19$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:19: void iniciar_timer(void)
;	-----------------------------------------
;	 function iniciar_timer
;	-----------------------------------------
_iniciar_timer:
	C$ATCPro.c$21$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:21: CLKSEL = 0x03; //clock da sistema
	mov	_CLKSEL,#0x03
	C$ATCPro.c$22$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:22: CKCON = 0x02;   //  f=1MHZ   T=1ms
	mov	_CKCON,#0x02
	C$ATCPro.c$23$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:23: TMOD = 0x11;  //timer0 time1 16bit sem autoreload
	mov	_TMOD,#0x11
	C$ATCPro.c$24$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:24: TR0 = 0;
;	assignBit
	clr	_TR0
	C$ATCPro.c$25$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:25: TR1 = 0;
;	assignBit
	clr	_TR1
	C$ATCPro.c$26$1_0$4 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:26: }
	C$ATCPro.c$26$1_0$4 ==.
	XG$iniciar_timer$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'iniciar_interrupcoes'
;------------------------------------------------------------
	G$iniciar_interrupcoes$0$0 ==.
	C$ATCPro.c$28$1_0$5 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:28: void iniciar_interrupcoes()
;	-----------------------------------------
;	 function iniciar_interrupcoes
;	-----------------------------------------
_iniciar_interrupcoes:
	C$ATCPro.c$30$1_0$5 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:30: IE = 0x8A;
	mov	_IE,#0x8a
	C$ATCPro.c$31$1_0$5 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:31: }
	C$ATCPro.c$31$1_0$5 ==.
	XG$iniciar_interrupcoes$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'iniciar_timer0'
;------------------------------------------------------------
	G$iniciar_timer0$0$0 ==.
	C$ATCPro.c$33$1_0$7 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:33: void iniciar_timer0(void)
;	-----------------------------------------
;	 function iniciar_timer0
;	-----------------------------------------
_iniciar_timer0:
	C$ATCPro.c$35$1_0$7 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:35: TR0=1;
;	assignBit
	setb	_TR0
	C$ATCPro.c$36$1_0$7 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:36: TL0 = -50000;                   
	mov	_TL0,#0xb0
	C$ATCPro.c$37$1_0$7 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:37: TH0 = (-50000 >> 8);
	mov	_TH0,#0x3c
	C$ATCPro.c$38$1_0$7 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:38: }
	C$ATCPro.c$38$1_0$7 ==.
	XG$iniciar_timer0$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'iniciar_timer1'
;------------------------------------------------------------
	G$iniciar_timer1$0$0 ==.
	C$ATCPro.c$40$1_0$8 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:40: void iniciar_timer1(){
;	-----------------------------------------
;	 function iniciar_timer1
;	-----------------------------------------
_iniciar_timer1:
	C$ATCPro.c$42$1_0$8 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:42: TR1=1;
;	assignBit
	setb	_TR1
	C$ATCPro.c$43$1_0$8 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:43: TL1 = -50000;
	mov	_TL1,#0xb0
	C$ATCPro.c$44$1_0$8 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:44: TH1 = (-50000 >> 8);
	mov	_TH1,#0x3c
	C$ATCPro.c$45$1_0$8 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:45: }
	C$ATCPro.c$45$1_0$8 ==.
	XG$iniciar_timer1$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'timer1_overflow'
;------------------------------------------------------------
	G$timer1_overflow$0$0 ==.
	C$ATCPro.c$47$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:47: void timer1_overflow(void) __interrupt(3)
;	-----------------------------------------
;	 function timer1_overflow
;	-----------------------------------------
_timer1_overflow:
	push	bits
	push	acc
	push	b
	push	dpl
	push	dph
	push	(0+7)
	push	(0+6)
	push	(0+5)
	push	(0+4)
	push	(0+3)
	push	(0+2)
	push	(0+1)
	push	(0+0)
	push	psw
	mov	psw,#0x00
	C$ATCPro.c$49$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:49: aux1++;
	mov	r6,_aux1
	mov	r7,(_aux1 + 1)
	mov	a,#0x01
	add	a,r6
	mov	_aux1,a
	clr	a
	addc	a,r7
	mov	(_aux1 + 1),a
	C$ATCPro.c$50$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:50: iniciar_timer1();
	lcall	_iniciar_timer1
	C$ATCPro.c$51$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:51: switch (aux1)
	mov	r6,_aux1
	mov	r7,(_aux1 + 1)
	cjne	r6,#0x01,00129$
	cjne	r7,#0x00,00129$
	sjmp	00101$
00129$:
	cjne	r6,#0x03,00130$
	cjne	r7,#0x00,00130$
	sjmp	00102$
00130$:
	cjne	r6,#0x0b,00131$
	cjne	r7,#0x00,00131$
	sjmp	00103$
00131$:
	cjne	r6,#0x0d,00132$
	cjne	r7,#0x00,00132$
	sjmp	00104$
00132$:
	C$ATCPro.c$53$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:53: case (1):
	cjne	r6,#0x15,00107$
	cjne	r7,#0x00,00107$
	sjmp	00105$
00101$:
	C$ATCPro.c$54$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:54: P2 = 0xFF;
	mov	_P2,#0xff
	C$ATCPro.c$55$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:55: break;
	C$ATCPro.c$57$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:57: case (3):
	sjmp	00107$
00102$:
	C$ATCPro.c$58$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:58: P2 = sequencia[D];
	mov	a,_D
	add	a,#_sequencia
	mov	dpl,a
	mov	a,(_D + 1)
	addc	a,#(_sequencia >> 8)
	mov	dph,a
	clr	a
	movc	a,@a+dptr
	mov	_P2,a
	C$ATCPro.c$59$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:59: break;
	C$ATCPro.c$61$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:61: case (11):
	sjmp	00107$
00103$:
	C$ATCPro.c$62$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:62: P2 = 0xFF;
	mov	_P2,#0xff
	C$ATCPro.c$63$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:63: break;
	C$ATCPro.c$65$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:65: case (13):
	sjmp	00107$
00104$:
	C$ATCPro.c$67$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:67: P2 = sequencia[U-1];
	mov	r7,_U
	dec	r7
	mov	a,r7
	rlc	a
	subb	a,acc
	mov	r6,a
	mov	a,r7
	add	a,#_sequencia
	mov	dpl,a
	mov	a,r6
	addc	a,#(_sequencia >> 8)
	mov	dph,a
	clr	a
	movc	a,@a+dptr
	mov	_P2,a
	C$ATCPro.c$68$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:68: P2_7=0;
;	assignBit
	clr	_P2_7
	C$ATCPro.c$69$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:69: break;
	C$ATCPro.c$71$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:71: case (21):
	sjmp	00107$
00105$:
	C$ATCPro.c$72$2_0$11 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:72: aux1 =0;
	clr	a
	mov	_aux1,a
	mov	(_aux1 + 1),a
	C$ATCPro.c$73$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:73: }
00107$:
	C$ATCPro.c$74$1_0$10 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:74: }
	pop	psw
	pop	(0+0)
	pop	(0+1)
	pop	(0+2)
	pop	(0+3)
	pop	(0+4)
	pop	(0+5)
	pop	(0+6)
	pop	(0+7)
	pop	dph
	pop	dpl
	pop	b
	pop	acc
	pop	bits
	C$ATCPro.c$74$1_0$10 ==.
	XG$timer1_overflow$0$0 ==.
	reti
;------------------------------------------------------------
;Allocation info for local variables in function 'timer0_overflow'
;------------------------------------------------------------
	G$timer0_overflow$0$0 ==.
	C$ATCPro.c$76$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:76: void timer0_overflow(void) __interrupt(1)
;	-----------------------------------------
;	 function timer0_overflow
;	-----------------------------------------
_timer0_overflow:
	push	bits
	push	acc
	push	b
	push	dpl
	push	dph
	push	(0+7)
	push	(0+6)
	push	(0+5)
	push	(0+4)
	push	(0+3)
	push	(0+2)
	push	(0+1)
	push	(0+0)
	push	psw
	mov	psw,#0x00
	C$ATCPro.c$78$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:78: aux++;
	mov	r6,_aux
	mov	r7,(_aux + 1)
	mov	a,#0x01
	add	a,r6
	mov	_aux,a
	clr	a
	addc	a,r7
	mov	(_aux + 1),a
	C$ATCPro.c$79$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:79: iniciar_timer0();
	lcall	_iniciar_timer0
	C$ATCPro.c$81$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:81: switch (aux)
	mov	r6,_aux
	mov	r7,(_aux + 1)
	cjne	r6,#0x01,00171$
	cjne	r7,#0x00,00171$
	sjmp	00101$
00171$:
	cjne	r6,#0x03,00172$
	cjne	r7,#0x00,00172$
	sjmp	00104$
00172$:
	cjne	r6,#0x0b,00173$
	cjne	r7,#0x00,00173$
	sjmp	00107$
00173$:
	cjne	r6,#0x0d,00174$
	cjne	r7,#0x00,00174$
	sjmp	00110$
00174$:
	cjne	r6,#0x15,00175$
	cjne	r7,#0x00,00175$
	ljmp	00119$
00175$:
	ljmp	00121$
	C$ATCPro.c$83$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:83: case (1):
00101$:
	C$ATCPro.c$84$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:84: if(!split)P2 = 0xFF;
	mov	a,_split
	orl	a,(_split + 1)
	jz	00176$
	ljmp	00121$
00176$:
	mov	_P2,#0xff
	C$ATCPro.c$85$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:85: break;
	ljmp	00121$
	C$ATCPro.c$87$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:87: case (3):
00104$:
	C$ATCPro.c$88$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:88: if(!split)P2 = sequencia[d];
	mov	a,_split
	orl	a,(_split + 1)
	jz	00177$
	ljmp	00121$
00177$:
	mov	a,_d
	add	a,#_sequencia
	mov	dpl,a
	mov	a,(_d + 1)
	addc	a,#(_sequencia >> 8)
	mov	dph,a
	clr	a
	movc	a,@a+dptr
	mov	_P2,a
	C$ATCPro.c$90$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:90: break;
	C$ATCPro.c$92$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:92: case (11):
	sjmp	00121$
00107$:
	C$ATCPro.c$93$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:93: if(!split)P2 = 0xFF;
	mov	a,_split
	orl	a,(_split + 1)
	jnz	00121$
	mov	_P2,#0xff
	C$ATCPro.c$95$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:95: break;
	C$ATCPro.c$97$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:97: case (13):
	sjmp	00121$
00110$:
	C$ATCPro.c$99$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:99: if(!split)P2 = sequencia[u];
	mov	a,_split
	orl	a,(_split + 1)
	jnz	00112$
	mov	a,_u
	add	a,#_sequencia
	mov	dpl,a
	mov	a,(_u + 1)
	addc	a,#(_sequencia >> 8)
	mov	dph,a
	clr	a
	movc	a,@a+dptr
	mov	_P2,a
00112$:
	C$ATCPro.c$100$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:100: if(!split)P2_7 =0;
	mov	a,_split
	orl	a,(_split + 1)
	jnz	00114$
;	assignBit
	clr	_P2_7
00114$:
	C$ATCPro.c$101$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:101: u++;
	mov	r6,_u
	mov	r7,(_u + 1)
	mov	a,#0x01
	add	a,r6
	mov	_u,a
	clr	a
	addc	a,r7
	mov	(_u + 1),a
	C$ATCPro.c$102$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:102: if (u == 10)
	mov	a,#0x0a
	cjne	a,_u,00181$
	clr	a
	cjne	a,(_u + 1),00181$
	sjmp	00182$
00181$:
	sjmp	00121$
00182$:
	C$ATCPro.c$104$3_0$15 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:104: u = 0;
	clr	a
	mov	_u,a
	mov	(_u + 1),a
	C$ATCPro.c$105$3_0$15 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:105: d++;
	mov	r6,_d
	mov	r7,(_d + 1)
	inc	a
	add	a,r6
	mov	_d,a
	clr	a
	addc	a,r7
	mov	(_d + 1),a
	C$ATCPro.c$106$3_0$15 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:106: if (d == 10)
	mov	a,#0x0a
	cjne	a,_d,00183$
	clr	a
	cjne	a,(_d + 1),00183$
	sjmp	00184$
00183$:
	sjmp	00121$
00184$:
	C$ATCPro.c$107$3_0$15 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:107: d = 0;
	clr	a
	mov	_d,a
	mov	(_d + 1),a
	C$ATCPro.c$109$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:109: break;
	C$ATCPro.c$111$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:111: case (21):
	sjmp	00121$
00119$:
	C$ATCPro.c$112$2_0$14 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:112: aux =0;
	clr	a
	mov	_aux,a
	mov	(_aux + 1),a
	C$ATCPro.c$114$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:114: }
00121$:
	C$ATCPro.c$115$1_0$13 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:115: }
	pop	psw
	pop	(0+0)
	pop	(0+1)
	pop	(0+2)
	pop	(0+3)
	pop	(0+4)
	pop	(0+5)
	pop	(0+6)
	pop	(0+7)
	pop	dph
	pop	dpl
	pop	b
	pop	acc
	pop	bits
	C$ATCPro.c$115$1_0$13 ==.
	XG$timer0_overflow$0$0 ==.
	reti
;------------------------------------------------------------
;Allocation info for local variables in function 'start'
;------------------------------------------------------------
	G$start$0$0 ==.
	C$ATCPro.c$118$1_0$16 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:118: void start(){
;	-----------------------------------------
;	 function start
;	-----------------------------------------
_start:
	C$ATCPro.c$119$1_0$16 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:119: if(P0_6==0){
	jb	_P0_6,00106$
	C$ATCPro.c$120$2_0$17 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:120: while(P0_6==0);
00101$:
	jnb	_P0_6,00101$
	C$ATCPro.c$121$2_0$17 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:121: iniciar_timer0();
	lcall	_iniciar_timer0
	C$ATCPro.c$122$2_0$17 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:122: estado =1;
	mov	_estado,#0x01
	mov	(_estado + 1),#0x00
00106$:
	C$ATCPro.c$124$1_0$16 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:124: }
	C$ATCPro.c$124$1_0$16 ==.
	XG$start$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'reset'
;------------------------------------------------------------
	G$reset$0$0 ==.
	C$ATCPro.c$126$1_0$18 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:126: void reset(){
;	-----------------------------------------
;	 function reset
;	-----------------------------------------
_reset:
	C$ATCPro.c$127$1_0$18 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:127: if(P0_7 == 0){
	jb	_P0_7,00106$
	C$ATCPro.c$128$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:128: while(P0_7==0);
00101$:
	jnb	_P0_7,00101$
	C$ATCPro.c$129$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:129: TR1=0;
;	assignBit
	clr	_TR1
	C$ATCPro.c$130$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:130: TR0=0;
;	assignBit
	clr	_TR0
	C$ATCPro.c$131$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:131: aux=0;
	clr	a
	mov	_aux,a
	mov	(_aux + 1),a
	C$ATCPro.c$132$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:132: aux1=0;
	mov	_aux1,a
	mov	(_aux1 + 1),a
	C$ATCPro.c$133$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:133: u=1;
	mov	_u,#0x01
;	1-genFromRTrack replaced	mov	(_u + 1),#0x00
	mov	(_u + 1),a
	C$ATCPro.c$134$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:134: d=0;
	mov	_d,a
	mov	(_d + 1),a
	C$ATCPro.c$135$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:135: P2 = sequencia[d];
	mov	a,_d
	add	a,#_sequencia
	mov	dpl,a
	mov	a,(_d + 1)
	addc	a,#(_sequencia >> 8)
	mov	dph,a
	clr	a
	movc	a,@a+dptr
	mov	_P2,a
	C$ATCPro.c$136$2_0$19 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:136: estado=0;
	clr	a
	mov	_estado,a
	mov	(_estado + 1),a
00106$:
	C$ATCPro.c$138$1_0$18 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:138: }
	C$ATCPro.c$138$1_0$18 ==.
	XG$reset$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'split_on'
;------------------------------------------------------------
	G$split_on$0$0 ==.
	C$ATCPro.c$140$1_0$20 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:140: void split_on(){
;	-----------------------------------------
;	 function split_on
;	-----------------------------------------
_split_on:
	C$ATCPro.c$141$1_0$20 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:141: if(P0_7 == 0){
	jb	_P0_7,00106$
	C$ATCPro.c$142$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:142: while(P0_7==0);
00101$:
	jnb	_P0_7,00101$
	C$ATCPro.c$143$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:143: U=u;
	mov	_U,_u
	mov	(_U + 1),(_u + 1)
	C$ATCPro.c$144$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:144: D=d;
	mov	_D,_d
	mov	(_D + 1),(_d + 1)
	C$ATCPro.c$145$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:145: estado =3;
	mov	_estado,#0x03
	mov	(_estado + 1),#0x00
	C$ATCPro.c$146$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:146: split++;
	mov	r6,_split
	mov	r7,(_split + 1)
	mov	a,#0x01
	add	a,r6
	mov	_split,a
	clr	a
	addc	a,r7
	mov	(_split + 1),a
	C$ATCPro.c$147$2_0$21 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:147: iniciar_timer1();
	lcall	_iniciar_timer1
00106$:
	C$ATCPro.c$149$1_0$20 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:149: }
	C$ATCPro.c$149$1_0$20 ==.
	XG$split_on$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'split_off'
;------------------------------------------------------------
	G$split_off$0$0 ==.
	C$ATCPro.c$151$1_0$22 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:151: void split_off(){
;	-----------------------------------------
;	 function split_off
;	-----------------------------------------
_split_off:
	C$ATCPro.c$152$1_0$22 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:152: if(P0_7 == 0){
	jb	_P0_7,00106$
	C$ATCPro.c$153$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:153: while(P0_7==0);
00101$:
	jnb	_P0_7,00101$
	C$ATCPro.c$154$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:154: TR1=0;
;	assignBit
	clr	_TR1
	C$ATCPro.c$155$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:155: split--;
	mov	r6,_split
	mov	r7,(_split + 1)
	mov	a,r6
	add	a,#0xff
	mov	_split,a
	mov	a,r7
	addc	a,#0xff
	mov	(_split + 1),a
	C$ATCPro.c$156$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:156: U=0;
	clr	a
	mov	_U,a
	mov	(_U + 1),a
	C$ATCPro.c$157$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:157: D=0;
	mov	_D,a
	mov	(_D + 1),a
	C$ATCPro.c$158$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:158: estado=1;
	mov	_estado,#0x01
;	1-genFromRTrack replaced	mov	(_estado + 1),#0x00
	mov	(_estado + 1),a
	C$ATCPro.c$159$2_0$23 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:159: iniciar_timer0();
	lcall	_iniciar_timer0
00106$:
	C$ATCPro.c$161$1_0$22 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:161: }
	C$ATCPro.c$161$1_0$22 ==.
	XG$split_off$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'stop_on'
;------------------------------------------------------------
	G$stop_on$0$0 ==.
	C$ATCPro.c$163$1_0$24 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:163: void stop_on(){
;	-----------------------------------------
;	 function stop_on
;	-----------------------------------------
_stop_on:
	C$ATCPro.c$164$1_0$24 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:164: if( P0_6==0){
	jb	_P0_6,00106$
	C$ATCPro.c$165$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:165: while(P0_6==0);
00101$:
	jnb	_P0_6,00101$
	C$ATCPro.c$166$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:166: U=u;
	mov	_U,_u
	mov	(_U + 1),(_u + 1)
	C$ATCPro.c$167$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:167: D=d;
	mov	_D,_d
	mov	(_D + 1),(_d + 1)
	C$ATCPro.c$168$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:168: TR0 =0;
;	assignBit
	clr	_TR0
	C$ATCPro.c$169$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:169: estado = 2;
	mov	_estado,#0x02
	mov	(_estado + 1),#0x00
	C$ATCPro.c$170$2_0$25 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:170: iniciar_timer1();
	lcall	_iniciar_timer1
00106$:
	C$ATCPro.c$172$1_0$24 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:172: }
	C$ATCPro.c$172$1_0$24 ==.
	XG$stop_on$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'stop_off'
;------------------------------------------------------------
	G$stop_off$0$0 ==.
	C$ATCPro.c$174$1_0$26 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:174: void stop_off(){
;	-----------------------------------------
;	 function stop_off
;	-----------------------------------------
_stop_off:
	C$ATCPro.c$175$1_0$26 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:175: if(P0_6==0){
	jb	_P0_6,00106$
	C$ATCPro.c$176$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:176: while(P0_6 ==0);
00101$:
	jnb	_P0_6,00101$
	C$ATCPro.c$177$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:177: U=0;
	clr	a
	mov	_U,a
	mov	(_U + 1),a
	C$ATCPro.c$178$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:178: D=0;
	mov	_D,a
	mov	(_D + 1),a
	C$ATCPro.c$179$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:179: TR1=0;
;	assignBit
	clr	_TR1
	C$ATCPro.c$180$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:180: aux1=0;
	clr	a
	mov	_aux1,a
	mov	(_aux1 + 1),a
	C$ATCPro.c$181$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:181: estado =1;
	mov	_estado,#0x01
;	1-genFromRTrack replaced	mov	(_estado + 1),#0x00
	mov	(_estado + 1),a
	C$ATCPro.c$182$2_0$27 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:182: iniciar_timer0();
	lcall	_iniciar_timer0
00106$:
	C$ATCPro.c$184$1_0$26 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:184: }
	C$ATCPro.c$184$1_0$26 ==.
	XG$stop_off$0$0 ==.
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'main'
;------------------------------------------------------------
	G$main$0$0 ==.
	C$ATCPro.c$186$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:186: void main()
;	-----------------------------------------
;	 function main
;	-----------------------------------------
_main:
	C$ATCPro.c$189$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:189: iniciar_sysclock();
	lcall	_iniciar_sysclock
	C$ATCPro.c$190$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:190: iniciar_timer();
	lcall	_iniciar_timer
	C$ATCPro.c$191$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:191: iniciar_interrupcoes();
	lcall	_iniciar_interrupcoes
	C$ATCPro.c$192$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:192: TR0=0;
;	assignBit
	clr	_TR0
	C$ATCPro.c$193$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:193: TR1=0;
;	assignBit
	clr	_TR1
	C$ATCPro.c$194$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:194: estado = Inicio;
	clr	a
	mov	_estado,a
	mov	(_estado + 1),a
	C$ATCPro.c$195$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:195: P2 = sequencia[0];
	mov	dptr,#_sequencia
;	genFromRTrack removed	clr	a
	movc	a,@a+dptr
	mov	_P2,a
	C$ATCPro.c$196$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:196: while (1){
00107$:
	C$ATCPro.c$197$2_0$29 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:197: switch(estado){
	mov	r6,_estado
	mov	r7,(_estado + 1)
	clr	c
	mov	a,#0x03
	subb	a,r6
	clr	a
	subb	a,r7
	jc	00107$
	mov	a,r6
	add	a,r6
	C$ATCPro.c$199$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:199: case (Inicio)://inicio
	mov	dptr,#00120$
	jmp	@a+dptr
00120$:
	sjmp	00101$
	sjmp	00102$
	sjmp	00103$
	sjmp	00104$
00101$:
	C$ATCPro.c$200$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:200: start();
	lcall	_start
	C$ATCPro.c$202$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:202: break;
	C$ATCPro.c$203$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:203: case (Contagem): //contagem
	sjmp	00107$
00102$:
	C$ATCPro.c$205$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:205: stop_on();
	lcall	_stop_on
	C$ATCPro.c$206$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:206: split_on();
	lcall	_split_on
	C$ATCPro.c$207$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:207: break;
	C$ATCPro.c$208$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:208: case (Parado): //paragem
	sjmp	00107$
00103$:
	C$ATCPro.c$210$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:210: reset();
	lcall	_reset
	C$ATCPro.c$211$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:211: stop_off();
	lcall	_stop_off
	C$ATCPro.c$213$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:213: break;
	C$ATCPro.c$215$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:215: case (Split): 
	sjmp	00107$
00104$:
	C$ATCPro.c$216$3_0$30 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:216: split_off();
	lcall	_split_off
	C$ATCPro.c$217$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:217: }
	sjmp	00107$
	C$ATCPro.c$219$1_0$28 ==.
;	C:\2ano\ATC\ATCproject\ATCPro.c:219: }
	C$ATCPro.c$219$1_0$28 ==.
	XG$main$0$0 ==.
	ret
	.area CSEG    (CODE)
	.area CONST   (CODE)
G$sequencia$0_0$0 == .
_sequencia:
	.db #0xc0	; 192
	.db #0xf9	; 249
	.db #0xa4	; 164
	.db #0xb0	; 176
	.db #0x99	; 153
	.db #0x92	; 146
	.db #0x82	; 130
	.db #0xf8	; 248
	.db #0x80	; 128
	.db #0x90	; 144
	.area XINIT   (CODE)
	.area CABS    (ABS,CODE)
