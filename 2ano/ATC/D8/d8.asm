;--------------------------------------------------------
; File Created by SDCC : free open source ANSI-C Compiler
; Version 4.2.0 #13081 (MINGW64)
;--------------------------------------------------------
	.module d8
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
_P0	=	0x0080
_SP	=	0x0081
_DPL	=	0x0082
_DPH	=	0x0083
_EMI0TC	=	0x0084
_EMI0CF	=	0x0085
_OSCLCN	=	0x0086
_PCON	=	0x0087
_TCON	=	0x0088
_TMOD	=	0x0089
_TL0	=	0x008a
_TL1	=	0x008b
_TH0	=	0x008c
_TH1	=	0x008d
_CKCON	=	0x008e
_PSCTL	=	0x008f
_P1	=	0x0090
_TMR3CN	=	0x0091
_TMR3RLL	=	0x0092
_TMR3RLH	=	0x0093
_TMR3L	=	0x0094
_TMR3H	=	0x0095
_USB0ADR	=	0x0096
_USB0DAT	=	0x0097
_TMR4CN	=	0x0091
_TMR4RLL	=	0x0092
_TMR4RLH	=	0x0093
_SCON0	=	0x0098
_SBUF0	=	0x0099
_CPT1CN	=	0x009a
_CPT0CN	=	0x009b
_CPT1MD	=	0x009c
_CPT0MD	=	0x009d
_CPT1MX	=	0x009e
_CPT0MX	=	0x009f
_P2	=	0x00a0
_SPI0CFG	=	0x00a1
_SPI0CKR	=	0x00a2
_SPI0DAT	=	0x00a3
_P0MDOUT	=	0x00a4
_P1MDOUT	=	0x00a5
_P2MDOUT	=	0x00a6
_P3MDOUT	=	0x00a7
_IE	=	0x00a8
_CLKSEL	=	0x00a9
_EMI0CN	=	0x00aa
__XPAGE	=	0x00aa
_SBCON1	=	0x00ac
_P4MDOUT	=	0x00ae
_PFE0CN	=	0x00af
_P3	=	0x00b0
_OSCXCN	=	0x00b1
_OSCICN	=	0x00b2
_OSCICL	=	0x00b3
_SBRLL1	=	0x00b4
_SBRLH1	=	0x00b5
_FLSCL	=	0x00b6
_FLKEY	=	0x00b7
_IP	=	0x00b8
_CLKMUL	=	0x00b9
_AMX0N	=	0x00ba
_AMX0P	=	0x00bb
_ADC0CF	=	0x00bc
_ADC0L	=	0x00bd
_ADC0H	=	0x00be
_SFRPAGE	=	0x00bf
_SMBTC	=	0x00b9
_SMB0CN	=	0x00c0
_SMB0CF	=	0x00c1
_SMB0DAT	=	0x00c2
_ADC0GTL	=	0x00c3
_ADC0GTH	=	0x00c4
_ADC0LTL	=	0x00c5
_ADC0LTH	=	0x00c6
_P4	=	0x00c7
_SMB1CN	=	0x00c0
_SMB1CF	=	0x00c1
_SMB1DAT	=	0x00c2
_T2CON	=	0x00c8
_TMR2CN	=	0x00c8
_REG01CN	=	0x00c9
_RCAP2L	=	0x00ca
_TMR2RLL	=	0x00ca
_RCAP2H	=	0x00cb
_TMR2RLH	=	0x00cb
_TL2	=	0x00cc
_TMR2L	=	0x00cc
_TH2	=	0x00cd
_TMR2H	=	0x00cd
_SMB0ADM	=	0x00ce
_SMB0ADR	=	0x00cf
_TMR5CN	=	0x00c8
_TMR5RLL	=	0x00ca
_TMR5RLH	=	0x00cb
_TMR5L	=	0x00cc
_TMR5H	=	0x00cd
_SMB1ADM	=	0x00ce
_SMB1ADR	=	0x00cf
_PSW	=	0x00d0
_REF0CN	=	0x00d1
_SCON1	=	0x00d2
_SBUF1	=	0x00d3
_P0SKIP	=	0x00d4
_P1SKIP	=	0x00d5
_P2SKIP	=	0x00d6
_USB0XCN	=	0x00d7
_PCA0CN	=	0x00d8
_PCA0MD	=	0x00d9
_PCA0CPM0	=	0x00da
_PCA0CPM1	=	0x00db
_PCA0CPM2	=	0x00dc
_PCA0CPM3	=	0x00dd
_PCA0CPM4	=	0x00de
_P3SKIP	=	0x00df
_ACC	=	0x00e0
_XBR0	=	0x00e1
_XBR1	=	0x00e2
_XBR2	=	0x00e3
_IT01CF	=	0x00e4
_SMOD1	=	0x00e5
_EIE1	=	0x00e6
_EIE2	=	0x00e7
_CKCON1	=	0x00e4
_ADC0CN	=	0x00e8
_PCA0CPL1	=	0x00e9
_PCA0CPH1	=	0x00ea
_PCA0CPL2	=	0x00eb
_PCA0CPH2	=	0x00ec
_PCA0CPL3	=	0x00ed
_PCA0CPH3	=	0x00ee
_RSTSRC	=	0x00ef
_B	=	0x00f0
_P0MDIN	=	0x00f1
_P1MDIN	=	0x00f2
_P2MDIN	=	0x00f3
_P3MDIN	=	0x00f4
_P4MDIN	=	0x00f5
_EIP1	=	0x00f6
_EIP2	=	0x00f7
_SPI0CN	=	0x00f8
_PCA0L	=	0x00f9
_PCA0H	=	0x00fa
_PCA0CPL0	=	0x00fb
_PCA0CPH0	=	0x00fc
_PCA0CPL4	=	0x00fd
_PCA0CPH4	=	0x00fe
_VDM0CN	=	0x00ff
_DP	=	0x8382
_TMR3RL	=	0x9392
_TMR4RL	=	0x9392
_TMR3	=	0x9594
_TMR4	=	0x9594
_SBRL1	=	0xb5b4
_ADC0	=	0xbebd
_ADC0GT	=	0xc4c3
_ADC0LT	=	0xc6c5
_TMR2RL	=	0xcbca
_TMR5RL	=	0xcbca
_TMR2	=	0xcdcc
_TMR5	=	0xcdcc
_PCA0CP1	=	0xeae9
_PCA0CP2	=	0xeceb
_PCA0CP3	=	0xeeed
_PCA0	=	0xfaf9
_PCA0CP0	=	0xfcfb
_PCA0CP4	=	0xfefd
;--------------------------------------------------------
; special function bits
;--------------------------------------------------------
	.area RSEG    (ABS,DATA)
	.org 0x0000
_P0_0	=	0x0080
_P0_1	=	0x0081
_P0_2	=	0x0082
_P0_3	=	0x0083
_P0_4	=	0x0084
_P0_5	=	0x0085
_P0_6	=	0x0086
_P0_7	=	0x0087
_TF1	=	0x008f
_TR1	=	0x008e
_TF0	=	0x008d
_TR0	=	0x008c
_IE1	=	0x008b
_IT1	=	0x008a
_IE0	=	0x0089
_IT0	=	0x0088
_P1_0	=	0x0090
_P1_1	=	0x0091
_P1_2	=	0x0092
_P1_3	=	0x0093
_P1_4	=	0x0094
_P1_5	=	0x0095
_P1_6	=	0x0096
_P1_7	=	0x0097
_S0MODE	=	0x009f
_MCE0	=	0x009d
_REN0	=	0x009c
_TB80	=	0x009b
_RB80	=	0x009a
_TI0	=	0x0099
_RI0	=	0x0098
_P2_0	=	0x00a0
_P2_1	=	0x00a1
_P2_2	=	0x00a2
_P2_3	=	0x00a3
_P2_4	=	0x00a4
_P2_5	=	0x00a5
_P2_6	=	0x00a6
_P2_7	=	0x00a7
_EA	=	0x00af
_ESPI0	=	0x00ae
_ET2	=	0x00ad
_ES0	=	0x00ac
_ET1	=	0x00ab
_EX1	=	0x00aa
_ET0	=	0x00a9
_EX0	=	0x00a8
_P3_0	=	0x00b0
_P3_1	=	0x00b1
_P3_2	=	0x00b2
_P3_3	=	0x00b3
_P3_4	=	0x00b4
_P3_5	=	0x00b5
_P3_6	=	0x00b6
_P3_7	=	0x00b7
_PSPI0	=	0x00be
_PT2	=	0x00bd
_PS0	=	0x00bc
_PT1	=	0x00bb
_PX1	=	0x00ba
_PT0	=	0x00b9
_PX0	=	0x00b8
_MASTER0	=	0x00c7
_TXMODE0	=	0x00c6
_STA0	=	0x00c5
_STO0	=	0x00c4
_ACKRQ0	=	0x00c3
_ARBLOST0	=	0x00c2
_ACK0	=	0x00c1
_SI0	=	0x00c0
_MASTER1	=	0x00c7
_TXMODE1	=	0x00c6
_STA1	=	0x00c5
_STO1	=	0x00c4
_ACKRQ1	=	0x00c3
_ARBLOST1	=	0x00c2
_ACK1	=	0x00c1
_SI1	=	0x00c0
_TF2H	=	0x00cf
_TF2L	=	0x00ce
_TF2LEN	=	0x00cd
_TF2CEN	=	0x00cc
_T2SPLIT	=	0x00cb
_TR2	=	0x00ca
_T2CSS	=	0x00c9
_T2XCLK	=	0x00c8
_TF5H	=	0x00cf
_TF5L	=	0x00ce
_TF5LEN	=	0x00cd
_T5SPLIT	=	0x00cb
_TR5	=	0x00ca
_T5XCLK	=	0x00c8
_CY	=	0x00d7
_AC	=	0x00d6
_F0	=	0x00d5
_RS1	=	0x00d4
_RS0	=	0x00d3
_OV	=	0x00d2
_F1	=	0x00d1
_PARITY	=	0x00d0
_CF	=	0x00df
_CR	=	0x00de
_CCF4	=	0x00dc
_CCF3	=	0x00db
_CCF2	=	0x00da
_CCF1	=	0x00d9
_CCF0	=	0x00d8
_AD0EN	=	0x00ef
_AD0TM	=	0x00ee
_AD0INT	=	0x00ed
_AD0BUSY	=	0x00ec
_AD0WINT	=	0x00eb
_AD0CM2	=	0x00ea
_AD0CM1	=	0x00e9
_AD0CM0	=	0x00e8
_SPIF	=	0x00ff
_WCOL	=	0x00fe
_MODF	=	0x00fd
_RXOVRN	=	0x00fc
_NSSMD1	=	0x00fb
_NSSMD0	=	0x00fa
_TXBMT	=	0x00f9
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
_RxDado::
	.ds 2
_TxDado::
	.ds 2
_dado::
	.ds 1
_main_sequencia_65536_17:
	.ds 16
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
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
	reti
	.ds	7
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
;	d8.c:7: volatile int RxDado = 0; // Sem dados de RX
	clr	a
	mov	_RxDado,a
	mov	(_RxDado + 1),a
;	d8.c:8: volatile int TxDado = 1; // Disponivel p/ TX
	mov	_TxDado,#0x01
;	1-genFromRTrack replaced	mov	(_TxDado + 1),#0x00
	mov	(_TxDado + 1),a
;	d8.c:9: volatile unsigned char dado = 0;
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
;	d8.c:19: void configUART0(void)
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
;	d8.c:22: PCA0MD = 0x00; // Desliga watchdog
	mov	_PCA0MD,#0x00
;	d8.c:23: XBR1 = 0x40;   // Ativa crossbar
	mov	_XBR1,#0x40
;	d8.c:25: SBRLL1 = 0xF9;
	mov	_SBRLL1,#0xf9
;	d8.c:26: SBRLH1 = 0xFF;
	mov	_SBRLH1,#0xff
;	d8.c:27: SCON1 = 0x10;
	mov	_SCON1,#0x10
;	d8.c:28: SBCON1 = 0x43;
	mov	_SBCON1,#0x43
;	d8.c:30: P0SKIP = 0x0F;
	mov	_P0SKIP,#0x0f
;	d8.c:31: XBR1 = 0x40;
	mov	_XBR1,#0x40
;	d8.c:32: XBR2 = 0x01;
	mov	_XBR2,#0x01
;	d8.c:34: EIE2 = 0x02;
	mov	_EIE2,#0x02
;	d8.c:35: IE = 0x80;
	mov	_IE,#0x80
;	d8.c:38: }
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'inter'
;------------------------------------------------------------
;	d8.c:40: void inter(void) __interrupt(16)
;	-----------------------------------------
;	 function inter
;	-----------------------------------------
_inter:
	push	acc
	push	ar7
	push	psw
	mov	psw,#0x00
;	d8.c:42: if (isset(SCON1,0))
	mov	a,_SCON1
	anl	a,#0x01
	jz	00102$
;	d8.c:44: clearbit(SCON1,0); // limpa a flg de recepcao
	anl	_SCON1,#0xfe
;	d8.c:45: RxDado = 1;
	mov	_RxDado,#0x01
	mov	(_RxDado + 1),#0x00
;	d8.c:46: dado = SBUF1; // recebe o byte
	mov	_dado,_SBUF1
00102$:
;	d8.c:48: if (isset(SCON1,1))
	mov	a,_SCON1
	rr	a
	anl	a,#0x01
	jz	00108$
;	d8.c:50: clearbit(SCON1,1);
	anl	_SCON1,#0xfd
;	d8.c:51: if (TxDado)
	mov	a,_TxDado
	orl	a,(_TxDado + 1)
	jz	00104$
;	d8.c:53: SBUF1 = dado;
	mov	_SBUF1,_dado
;	d8.c:54: TxDado = 0;
	clr	a
	mov	_TxDado,a
	mov	(_TxDado + 1),a
	sjmp	00108$
00104$:
;	d8.c:58: TxDado = 1;
	mov	_TxDado,#0x01
	mov	(_TxDado + 1),#0x00
00108$:
;	d8.c:61: }
	pop	psw
	pop	ar7
	pop	acc
	reti
;	eliminated unneeded push/pop dpl
;	eliminated unneeded push/pop dph
;	eliminated unneeded push/pop b
;------------------------------------------------------------
;Allocation info for local variables in function 'enviaUART'
;------------------------------------------------------------
;x                         Allocated to registers r7 
;------------------------------------------------------------
;	d8.c:63: void enviaUART(unsigned char x)
;	-----------------------------------------
;	 function enviaUART
;	-----------------------------------------
_enviaUART:
	mov	r7,dpl
;	d8.c:65: while (!TxDado)
00101$:
	mov	a,_TxDado
	orl	a,(_TxDado + 1)
	jz	00101$
;	d8.c:67: dado = x;
	mov	_dado,r7
;	d8.c:68: TxDado = 1;
	mov	_TxDado,#0x01
	mov	(_TxDado + 1),#0x00
;	d8.c:69: setbit(SCON1,1);
	orl	_SCON1,#0x02
;	d8.c:70: }
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'recebeUART'
;------------------------------------------------------------
;x                         Allocated to registers r7 
;------------------------------------------------------------
;	d8.c:72: unsigned char recebeUART()
;	-----------------------------------------
;	 function recebeUART
;	-----------------------------------------
_recebeUART:
;	d8.c:75: if (RxDado)
	mov	a,_RxDado
	orl	a,(_RxDado + 1)
	jz	00102$
;	d8.c:77: x = dado;
	mov	r7,_dado
;	d8.c:78: RxDado = 0;
	clr	a
	mov	_RxDado,a
	mov	(_RxDado + 1),a
	sjmp	00103$
00102$:
;	d8.c:82: x = -1;
	mov	r7,#0xff
00103$:
;	d8.c:85: return x;
	mov	dpl,r7
;	d8.c:86: }
	ret
;------------------------------------------------------------
;Allocation info for local variables in function 'main'
;------------------------------------------------------------
;c                         Allocated to registers r6 r7 
;a                         Allocated to registers r5 
;sequencia                 Allocated with name '_main_sequencia_65536_17'
;trans                     Allocated with name '_main_trans_65537_18'
;------------------------------------------------------------
;	d8.c:88: void main(void)
;	-----------------------------------------
;	 function main
;	-----------------------------------------
_main:
;	d8.c:90: unsigned int c = 0;
	mov	r6,#0x00
	mov	r7,#0x00
;	d8.c:93: char sequencia[16] = {0xc0, 0xf9, 0xa4, 0xb0, 0x99, 0x92, 0x82, 0xf8, 0x80, 0x90, 0x88, 0x83, 0xc6, 0xa1, 0x86, 0x8e};
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
;	d8.c:94: configUART0();
	push	ar7
	push	ar6
	lcall	_configUART0
	pop	ar6
	pop	ar7
;	d8.c:95: int trans[16] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
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
;	d8.c:97: P2 = 0xc0;
	mov	_P2,#0xc0
;	d8.c:98: while (1)
00115$:
;	d8.c:100: a = recebeUART();
	push	ar7
	push	ar6
	lcall	_recebeUART
	mov	r5,dpl
	pop	ar6
	pop	ar7
;	d8.c:102: switch (a)
	cjne	r5,#0x64,00147$
	sjmp	00102$
00147$:
	cjne	r5,#0x69,00103$
;	d8.c:105: c++;
	inc	r6
	cjne	r6,#0x00,00150$
	inc	r7
00150$:
;	d8.c:106: enviaUART(trans[c & 0x0f]);
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
;	d8.c:107: P2 = sequencia[c & 0x0f];
	mov	a,r4
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
;	d8.c:109: break;
;	d8.c:111: case 'd':
	sjmp	00103$
00102$:
;	d8.c:112: c--;
	dec	r6
	cjne	r6,#0xff,00151$
	dec	r7
00151$:
;	d8.c:113: P2 = sequencia[c & 0x0f];
	mov	a,#0x0f
	anl	a,r6
	mov	r4,a
	mov	r5,#0x00
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
;	d8.c:114: enviaUART(trans[c & 0x0f]);
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
;	d8.c:116: }
00103$:
;	d8.c:118: P2 = sequencia[c & 0x0f];
	mov	a,#0x0f
	anl	a,r6
	mov	r4,a
	mov	r5,#0x00
	add	a,#_main_sequencia_65536_17
	mov	r1,a
	mov	_P2,@r1
;	d8.c:119: if (P0_7 == 0)
	jb	_P0_7,00108$
;	d8.c:121: while (P0_7 == 0)
00104$:
	jnb	_P0_7,00104$
;	d8.c:123: c++;
	inc	r6
	cjne	r6,#0x00,00154$
	inc	r7
00154$:
00108$:
;	d8.c:126: if (P0_6 == 0)
	jnb	_P0_6,00155$
	ljmp	00115$
00155$:
;	d8.c:128: while (P0_6 == 0)
00109$:
	jnb	_P0_6,00109$
;	d8.c:132: }
	ljmp	00115$
	.area CSEG    (CODE)
	.area CONST   (CODE)
	.area XINIT   (CODE)
	.area CABS    (ABS,CODE)
